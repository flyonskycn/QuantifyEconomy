/**
 * 
 */
package com.flyonsky.quantify.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 消息摘要加密算法
 * @author andy
 * @date 2016年5月26日
 */
public final class MDEncode {
	/** 
	 * 将摘要信息转换为相应的编码 
	 * @param code 编码类型 
	 * @param message 摘要信息 
	 * @return 相应的编码字符串 
	 */  
	private static String Encode(String code,String message){  
	    MessageDigest md;  
	    String encode = null;  
	    try {  
	        md = MessageDigest.getInstance(code);  
	        encode = byteArrayToHexString(md.digest(message  
	                .getBytes()));  
	    } catch (NoSuchAlgorithmException e) {  
	        e.printStackTrace();  
	    }  
	    return encode;  
	}  
	
	/**
	 * 字节数组转换成16进制字符串
	 * @param digest
	 * @return
	 */
	private static String byteArrayToHexString(byte[] digest) {
		StringBuilder sb=new StringBuilder();
		for(byte bt:digest){
			int val=bt&0xFF;
			if(val<16){
				sb.append('0');
			}
			sb.append(Integer.toHexString(val));
		}
		return sb.toString();
	}

	/** 
     * 将摘要信息转换成MD5编码 
     * @param message 摘要信息 
     * @return MD5编码之后的字符串 
     */  
    public static String md5Encode(String message){  
        return Encode("MD5",message);  
    }  
    /** 
     * 将摘要信息转换成SHA编码 
     * @param message 摘要信息 
     * @return SHA编码之后的字符串 
     */  
    public static String shaEncode(String message){  
        return Encode("SHA",message);  
    }  
    /** 
     * 将摘要信息转换成SHA-256编码 
     * @param message 摘要信息 
     * @return SHA-256编码之后的字符串 
     */  
    public static String sha256Encode(String message){  
        return Encode("SHA-256",message);  
    }  
    /** 
     * 将摘要信息转换成SHA-512编码 
     * @param message 摘要信息 
     * @return SHA-512编码之后的字符串 
     */  
    public static String sha512Encode(String message){  
        return Encode("SHA-512",message);  
    }
    
    /**
     * 工具类测试
     * @param args
     */
    public static void main(String[] args){
    	System.out.println(byteArrayToHexString(new byte[]{0x05,0x1A}));
    	System.out.println(md5Encode("1\ncocopico"));
    	System.out.println(shaEncode("1\ncocopico"));
    	System.out.println(sha256Encode("1\ncocopico"));
    	System.out.println(sha512Encode("1\ncocopico"));
    	
    }
}
