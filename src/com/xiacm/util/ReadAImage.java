package com.xiacm.util;

import java.awt.image.BufferedImage;

public class ReadAImage {
	public static String turnImg2String(BufferedImage bImage) {
		StringBuilder builder = new StringBuilder();
		int width = bImage.getWidth();
		int height = bImage.getHeight();

		for (int i = 0; i < height; i += 8) {
			for (int j = 0; j < width; j += 4) {
				int rgb = bImage.getRGB(j, i);
				if ((rgb & 0xff0000) >> 16 + (rgb & 0xff00) >> 8 + (rgb & 0xff) > 5) {
					// °×É«
					builder.append(" ");
				} else {
					builder.append("8");
				}
			}
			builder.append("\n");
		}
		return builder.toString();
	}
}
