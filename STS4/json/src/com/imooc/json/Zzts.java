package com.imooc.json;

public class Zzts {
	public static void main(String[] args) {
		String data = "1";
		String regex = "\\D";
		boolean flag = data.matches(regex);
		System.out.println(flag);
	}
}
