package com.xiacm.main;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import com.xiacm.util.GetAllFileName;
import com.xiacm.util.ReadAImage;
import com.xiacm.view.BadAppleWindow;

public class Controller extends Thread {

	public static final String rootPath = "E:/BadApplePics";
	private String[] allFiles;
	private BadAppleWindow window;

	public Controller(BadAppleWindow window) {
		this.window = window;
		allFiles = GetAllFileName.getAllFileName(new File(rootPath));
	}

	@Override
	public void run() {
		BufferedImage bImage;
		try {
			sleep(1500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < allFiles.length; i++) {
			try {
				bImage = ImageIO.read(new File(rootPath + "/" + allFiles[i]));
				window.setText(ReadAImage.turnImg2String(bImage));
				sleep(26);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		long deltaTime = System.currentTimeMillis() - startTime;
		deltaTime /= 1000;
		System.out.println("总计播放时长" + deltaTime + "s");
	}

}
