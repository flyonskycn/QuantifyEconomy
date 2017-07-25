package com.flyonsky.quantify.util;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EntityIdGenerator {
	
	private static final Logger LOG = LoggerFactory.getLogger(EntityIdGenerator.class);
	//  id format  =>
	//  timestamp |datacenter | sequence
	//  41        |10         |  12
   private final long sequenceBits = 12;
   private final long datacenterIdBits = 10L;
   private final long maxDatacenterId = -1L ^ (-1L << datacenterIdBits);

   private final long datacenterIdShift = sequenceBits;
   private final long timestampLeftShift = sequenceBits + datacenterIdBits;

   private final long twepoch = 1288834974657L;
   private final long datacenterId;
   private final long sequenceMax = 4096;

   private volatile long lastTimestamp = -1L;
   private volatile long sequence = 0L;
   
   private static volatile EntityIdGenerator instance;
   
   private static Object lock = new Object();
   
   private final static SimpleDateFormat dformat=new SimpleDateFormat("yyyyMMddHHmmssSSS");
   private long lastId=0;
   
   private EntityIdGenerator(){
	   datacenterId = getDatacenterId();
   }
   
   public static EntityIdGenerator getInstance(){
	   if(instance == null){
		   synchronized (lock) {
			if(instance == null){
				instance = new EntityIdGenerator();
			}
		}
	   }
	   return instance;
   }
   
   public synchronized long generateLongId(){
//       long timestamp = System.currentTimeMillis();
//       if (lastTimestamp == timestamp) {
//           sequence = (sequence + 1) % sequenceMax;
//           if (sequence == 0) {
//               timestamp = tilNextMillis(lastTimestamp);
//           }
//       } else {
//           sequence = 0;
//       }
//       lastTimestamp = timestamp;
//       long id = (((timestamp - twepoch) << timestampLeftShift) |
//               (datacenterId << datacenterIdShift) |
//               sequence) & 0x00FFFFFFFFFFFl;
//       return id;
	   
	   Date cur=new Date();
	 //long timestamp=cur.getTime();
	   long timestamp=Long.parseLong(dformat.format(cur).substring(2));
	   if(timestamp>lastId){
		   lastId=timestamp;
	   }else{
		   lastId++;
	   }
	   return lastId;
   }
   
   protected long tilNextMillis(long lastTimestamp) {
       long timestamp = System.currentTimeMillis();
       while (timestamp <= lastTimestamp) {
           timestamp = System.currentTimeMillis();
       }
       return timestamp;
   }
   
   protected long getDatacenterId(){
	   try{
           InetAddress ip = InetAddress.getLocalHost();
           NetworkInterface network = NetworkInterface.getByInetAddress(ip);
           long id;
           if (network == null) {
               id = 1;
           } else {
               byte[] mac = network.getHardwareAddress();
               id = ((0x000000FF & (long) mac[mac.length - 1]) | (0x0000FF00 & (((long) mac[mac.length - 2]) << 8))) >> 6;
           }
           return id;
	   }catch(Exception e){
		   LOG.error(e.getMessage());
	   }
	   return 123456789l;
   }
}
