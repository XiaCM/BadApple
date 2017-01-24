package com.xiacm.main;

import java.awt.EventQueue;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.swing.UIManager;

import com.xiacm.view.BadAppleWindow;

import javazoom.jl.player.Player;

public class BadAppleMain {
	public static void main(String[] args) {

		try {
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		} catch (Exception e) {
			// TODO exception
		}

		EventQueue.invokeLater(() -> {
			try {
				UIManager.put("RootPane.setupButtonVisible", false);
				BadAppleWindow frame = new BadAppleWindow();
				frame.setVisible(true);
				new Controller(frame).start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		// Play music
		InputStream input;
		try {
			input = new FileInputStream("music/BadApple.mp3");
			Player player = new Player(input);
			player.play();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
