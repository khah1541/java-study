package gui;

import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.*;



public class MainFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	private GamePanel gamePanel = new GamePanel();
	
	
	public MainFrame() {
		super("Game Of Life");

		setLayout(new BorderLayout());	//���̾ƿ� ��������
		add(gamePanel, BorderLayout.CENTER);//���� �г��� ���
		
		
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {// Ű���� Ű�� ��������
			//	System.out.println("Ű ������!");
			int code = e.getKeyCode(); //Ű�� ������ ���ڷ� ����
			switch(code) {
			case 32:
				//System.out.println("�����̽���");
				gamePanel.next();
				break;
			case 8:
				//System.out.println("�� �����̽�");
				gamePanel.clear();
				break;
			case 10:
				System.out.println("����");			
				gamePanel.randomize();
				break;
			}
//			System.out.println(code);
//			char c = (char)code;
//			System.out.println(c);
			}
		});
		
		setSize(1200,800); //â ������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//â�� ������ ���α׷� ����
		setVisible(true);//���̰� �ϱ�
	}
}
