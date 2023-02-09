package ezen.chat.client;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ezenTalk {

	// 프레임화면 중앙배치
	public static void setCenterScreen(Frame frame) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int screenWidth = toolkit.getScreenSize().width;
		int screenHeight = toolkit.getScreenSize().height;
		int centerX = (screenWidth - frame.getWidth()) / 2;
		int centerY = (screenHeight - frame.getHeight()) / 2;
		frame.setLocation(centerX, centerY);
	}

	public static void main(String[] args) {

		Frame frame = new Frame("::: ezen Talk :::");
		ChatPanel chatPanel = new ChatPanel();
		chatPanel.initLayout();
		chatPanel.eventRegist();
		frame.add(chatPanel, BorderLayout.CENTER);
		frame.setSize(400, 550);
		setCenterScreen(frame);
		frame.setVisible(true);

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}