package com.fcy.client.util;

public class StringUtil {
	/**
	 * 功能：将字符串中的全角字符转为半角
	 * 全角空格为12288，半角空格为32
	 * 其他字符半角(33-126)与全角(65281-65374)的对应关系是：均相差65248
	 * 全角字符ASCII表：http://www.doc88.com/p-2512958110693.html
	 * @param src 要转换的包含全角的任意字符串
	 * @return  转换之后的字符串
	 */
	public static String toSemiangle(String src) {
		char[] c = src.toCharArray();
		for (int index = 0; index < c.length; index++) {
			if (c[index] == 12288) {// 全角空格
				c[index] = (char) 32;
			}else if (c[index] > 65280 && c[index] < 65375) {// 其他全角字符
					c[index] = (char) (c[index] - 65248);
			}
		}
		return String.valueOf(c);
	}
}
