package com.xiacm.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;

public class BadAppleWindow extends JFrame {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea mainTextArea;

	/**
	 * Create the frame.
	 */
	public BadAppleWindow() {
		setResizable(false);
		setTitle("BadApple");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		mainTextArea = new JTextArea();
		mainTextArea.setEnabled(false);
		mainTextArea.setEditable(false);
		mainTextArea.setLineWrap(true);
		mainTextArea.setFont(new Font("·ÂËÎ", Font.BOLD, 5));
		contentPane.add(mainTextArea, BorderLayout.CENTER);

	}

	public void setText(String text) {
		mainTextArea.setText(text);
	}

}
