package pokemon;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Image extends JFrame implements Runnable {

	ImageIcon image1;
	JLabel Label;

	Image(String name) {
		ImageIcon image1 = new ImageIcon("Images/" + name); // �̹��� ���
		Label = new JLabel(image1, JLabel.CENTER);
		Label.setVerticalTextPosition(JLabel.CENTER);
		Label.setHorizontalTextPosition(JLabel.RIGHT);
		add(Label);
		setSize(300, 300); // â ũ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �����ư Ȱ��ȭ
		setVisible(true);
		setResizable(true);
	}

	/*
	 * public void init(String name) { ImageIcon image1 = new ImageIcon("Images/" +
	 * name); // �̹��� ��� Label = new JLabel(image1, JLabel.CENTER);
	 * Label.setVerticalTextPosition(JLabel.CENTER);
	 * Label.setHorizontalTextPosition(JLabel.RIGHT); add(Label); }
	 */
	@Override
	public void run() { // ������ ���Ǻκ�
	
			try {
					Thread.sleep(2000);
				
			} catch (InterruptedException ex) {
	
				Thread.currentThread().interrupt();
			
			}
	
	}



}
