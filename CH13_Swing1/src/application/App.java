package application;

import javax.swing.JFrame;

import javax.swing.SwingUtilities;

import gui.MainFrame;

public class App {

	public static void main(String[] args) {
		// JFrame���� ������ â �����
		
		SwingUtilities.invokeLater(()->{
		JFrame mainFrame = new MainFrame("�׽�Ʈ ����");//��â mainFrame�� ����
		
		});
	}

}
