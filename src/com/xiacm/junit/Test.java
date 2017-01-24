package com.xiacm.junit;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.xiacm.util.GetAllFileName;
import com.xiacm.util.ReadAImage;

public class Test {

	@org.junit.Test
	public void textImg2String() throws IOException {
		BufferedImage bImage = ImageIO.read(new File("E:/BadApplePics/badapple_000011.899.png"));
		System.out.println(ReadAImage.turnImg2String(bImage));
	}

	@org.junit.Test
	public void testGetAllFiles() {
		File file = new File("E:/BadApplePics");
		String[] array = GetAllFileName.getAllFileName(file);
		System.out.println(array.length);
		// for (int i = 0; i < array.length; i++) {
		// System.out.println(array[i]);
		// }
	}
}
