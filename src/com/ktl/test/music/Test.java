package com.ktl.test.music;

public class Test {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("¹ÅÊ«´ºÏş");
		System.out.println(str.toString());
		str.replace(0, str.length(), "´ºÃß²»¾õÏş£¬´¦´¦ÎÅÌäÄñ");
		System.out.println(str.toString());
		int[] a = new int[10];
	}
}
