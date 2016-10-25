package com.jingpinke.util;

public class Util {
	public static String isNull(Object o){
		if(o==null){
			return "";
		}else
			return o.toString();
	}
}
