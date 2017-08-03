package com.vnext.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Id 生成器 工具类
 * @author leo
 *
 */
public class IDUtil {

	/**
	 * 图片名生成
	 */
	public static String genImageName() {
		//取当前时间的长整形值包含毫秒
		long millis = System.currentTimeMillis();
		//long millis = System.nanoTime();
		//加上三位随机数
		Random random = new Random();
		int end3 = random.nextInt(999);
		//如果不足三位前面补0
		String str = millis + String.format("%03d", end3);
		return str;
	}
	
	/**
	 * 商品id生成
	 */
	public static long genItemId() {
		//取当前时间的长整形值包含毫秒
		long millis = System.currentTimeMillis();
		//long millis = System.nanoTime();
		//加上两位随机数
		Random random = new Random();
		int end2 = random.nextInt(99);
		//如果不足两位前面补0
		String str = millis + String.format("%02d", end2);
		long id = new Long(str);
		return id;
	}
	
	/**
	 * id生成
	 */
	public static String genSID() {
		//取当前时间的长整形值包含毫秒
		long millis = System.currentTimeMillis();
		//long millis = System.nanoTime();
		//加上两位随机数
		Random random = new Random();
		int end2 = random.nextInt(99);
		//如果不足两位前面补0
		String str = millis + String.format("%02d", end2);
		return str;
	}
	
	
	public static void main(String[] args) {
//		for(int i=0;i< 100;i++)
//		System.out.println(genItemId());
		
		
		List<Object> values = new ArrayList<Object>();
		values.add("15");
		values.add("16");
		values.add("17");
		
		System.out.println(values);
		System.out.println(IDUtil.genSID());
		System.out.println(IDUtil.genSID());
		System.out.println(IDUtil.genSID());
		System.out.println(IDUtil.genSID());
		System.out.println(IDUtil.genSID());
		System.out.println(IDUtil.genSID());
		System.out.println(IDUtil.genSID());
		
	}
}
