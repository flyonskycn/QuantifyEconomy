package com.flyonsky.quantify.service.imp;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.flyonsky.quantify.service.CacheService;

import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.XMemcachedClientBuilder;
import net.rubyeye.xmemcached.exception.MemcachedException;
import net.rubyeye.xmemcached.utils.AddrUtil;

@Service
public class CacheServiceImp implements CacheService{
	
	private static final Logger LOG = LoggerFactory.getLogger(CacheServiceImp.class);
	
	// Memcached address
	@Value("${memcached.url:localhost:11211}")
	private String cacheHost;
	
	@Value("${memcached.expire:60}")
	private int expire;
	
	private MemcachedClient cachedClient;
	
	@PostConstruct
	public void init(){
		XMemcachedClientBuilder builder = new XMemcachedClientBuilder(AddrUtil.getAddresses(this.getCacheHost()));
		try {
			cachedClient=builder.build();
		} catch (IOException e) {
			LOG.error(e.getMessage());
		}
	}
	
	@PreDestroy
	public void destroy(){
		try {
			cachedClient.shutdown();
		} catch (IOException e) {
			LOG.error(e.getMessage());
		}
	}

	@Override
	public boolean put(String key, Object value) {
		return this.put(key, value, this.getExpire());
	}

	@Override
	public boolean put(String key, Object value, int exp) {
		boolean flag = false;
		try {
			flag = this.getCachedClient().add(key, exp, value);
			if(!flag){
				flag = this.getCachedClient().replace(key, exp, value);
			}
		} catch (TimeoutException | InterruptedException | MemcachedException e) {
			flag = false;
			LOG.error(e.getMessage());
		}
		return flag;
	}

	@Override
	public <T> T get(String key) {
		T data = null;
		try {
			data = this.getCachedClient().get(key);
		} catch (TimeoutException | InterruptedException | MemcachedException e) {
			LOG.error(e.getMessage());
		}
		return data;
	}

	@Override
	public boolean touch(String key, int exp) {
		boolean flag = false;
		try {
			flag = this.getCachedClient().touch(key, exp);
		} catch (TimeoutException | InterruptedException | MemcachedException e) {
			flag = false;
			LOG.error(e.getMessage());
		}
		return flag;
	}

	@Override
	public <T> T getAndTouch(String key, int exp) {
		T data = null;
		try {
			data = this.getCachedClient().getAndTouch(key, exp);
		} catch (TimeoutException | InterruptedException | MemcachedException e) {
			LOG.error(e.getMessage());
		}
		return data;
	}

	@Override
	public boolean exists(String key) {
		boolean flag = false;
		if(this.get(key) != null){
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean remove(String key) {
		boolean flag = false;
		try {
			flag = this.getCachedClient().delete(key);
		} catch (TimeoutException | InterruptedException | MemcachedException e) {
			LOG.error(e.getMessage());
			flag = false;
		}
		return flag;
	}

	public String getCacheHost() {
		return cacheHost;
	}

	public void setCacheHost(String cacheHost) {
		this.cacheHost = cacheHost;
	}

	public MemcachedClient getCachedClient() {
		return cachedClient;
	}

	public void setCachedClient(MemcachedClient cachedClient) {
		this.cachedClient = cachedClient;
	}

	public int getExpire() {
		return expire;
	}

	public void setExpire(int expire) {
		this.expire = expire;
	}

}
