package com.pajk.rdb;

import java.io.File;

public class RedisRdbParseTest1 {

	public static void main(String[] args) {
		String path ="D:\\data.rdb";
		RdbParser rdb = new RdbParser();
		rdb.rdbParse(new File(path), new CallBackHandler() {
			public void printlnHandler(long dbid, String type, String key,
					Object val, long expiretime,long keySize) {
				if(!"STRING".equals(type)){
//					System.out.println(dbid + "||" + type + "||" + "key=" + key +"||keySize:"+keySize);
					System.out.println(dbid + "||" + type + "||" + "key=" + key
							+ "||" + "value=" + val+"||keySize:"+keySize);
				}
			}
		});
	}

}
