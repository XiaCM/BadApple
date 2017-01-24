package com.xiacm.util;

import java.io.File;

public class GetAllFileName {
	public static String[] getAllFileName(File root) {
		if (!root.isDirectory()) {
			return null;
		} else {
			return root.list();
		}
	}
}
