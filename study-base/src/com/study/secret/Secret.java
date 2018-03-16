package com.study.secret;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Date;

public class Secret {
	
	 private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5',  
             '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};  

	static String appSecret = "aasfasdfasdaa";
	static String nonce = "sadfhsajdfsjdasjdflkjasdlkfjlkasdjf";
	
	private static String getFormattedText(byte[] bytes) {  
        int len = bytes.length;  
        StringBuilder buf = new StringBuilder(len * 2);  
        // ������ת����ʮ�����Ƶ��ַ�����ʽ  
        for (int j = 0; j < len; j++) {  
            buf.append(HEX_DIGITS[(bytes[j] >> 4) & 0x0f]);  
            buf.append(HEX_DIGITS[bytes[j] & 0x0f]);  
        }  
        return buf.toString().toLowerCase();  
    }  
	
	public String createSignature(String se, String time, String no){
		String[] src = {se, time, no};
		Arrays.sort(src);
		String str = Arrays.toString(src);
		
        try {  
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");  
            messageDigest.update(str.getBytes());  
            return getFormattedText(messageDigest.digest());  
        } catch (Exception e) {  
            throw new RuntimeException(e);  
        }  
	}

	public static void main(String[] args) {
		System.out.println(new Secret().createSignature(appSecret,String.valueOf(new Date().getTime()),nonce));
	}

}
  