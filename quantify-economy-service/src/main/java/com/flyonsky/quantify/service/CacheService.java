package com.flyonsky.quantify.service;

/**
 * 缓存服务
 * @author Administrator
 *
 */
public interface CacheService {

	/**
	 * 向缓存添加数据
	 * @param key 缓存键值
	 * @param value 缓存值
	 * @return true:成功,false:失败
	 */
	boolean put(String key, Object value);
	
	/**
	 * 向缓存添加数据
	 * @param key 缓存键值
	 * @param value 缓存值
	 * @param exp 有效时间,单位为(秒)
	 * @return true:成功,false:失败
	 */
	boolean put(String key, Object value, int exp);
	
	/**
	 * 获取缓存数据
	 * @param key 缓存键值
	 * @return
	 */
	<T> T get(String key);
	
	/**
	 * 更新缓存 
	 * @param key 缓存键值
	 * @param exp 有效时间,单位为(秒)
	 * @return
	 */
	boolean touch(String key, int exp);
	
	/**
	 * 获取缓存并更新其有效时间
	 * @param key 缓存键值
	 * @param exp 有效时间,单位为(秒)
	 * @return 缓存值
	 */
	<T> T getAndTouch(String key, int exp);
	
	/**
	 * 缓存中是否包含指定key的值
	 * @param key 缓存键值
	 * @return
	 */
	boolean exists(String key);
	
	/**
	 * 删除对应键值的缓存
	 * @param key 缓存键值
	 * @return
	 */
	boolean remove(String key);
}
