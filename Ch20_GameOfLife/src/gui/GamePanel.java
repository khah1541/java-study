package gui;

import javax.swing.*;
import model.World;
import java.awt.*;
import java.awt.event.*;

public class GamePanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private final static int CELLSIZE = 30; // ������ ũ�⼳��
	private final static Color backgroundColor = Color.BLACK; // ���� ������
	private final static Color GridColor = Color.GRAY; // ���ڼ� �� ȸ��
	private World world;

	private int topBottomMargin; // �� �Ʒ� ����
	private int leftRightMargin; // ���� ������ ����

	public GamePanel() {
		// �����г��� �����ÿ� �̺�Ʈ�� (���콺 �̺�Ʈ �߰�)
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				if(e.getY() < topBottomMargin || e.getX() < leftRightMargin) {
					return; //��� ���̱� ������ �׳� ���� (������)
				}
					
				int row = (e.getY() - topBottomMargin) / CELLSIZE;
				int col = (e.getX() - leftRightMargin) / CELLSIZE;
				if(row >= world.getRows() || col >= world.getColumns()) {
					return; //��� ���̱� ������ �׳� ����(ū��)
				}
				
					
				boolean status = world.getCell(row,col);
				world.setCell(row, col, !status); // ���� ������� üũ�ؼ� ����
				repaint(); // ���� ��ħ (�����г��� ���� ����)
			}
		});
	}

	@Override
	protected void paintComponent(Graphics g) {
		// �� �޼ҵ�� �ڵ����� ���۹� ������ �ڽ��� ����� �׸���.
		Graphics2D g2 = (Graphics2D) g; // 2D �׷����� ����ϱ� ����

		int width = getWidth(); // ���α���
		int height = getHeight(); // ���α���

		int rows = (height - 2 * topBottomMargin) / CELLSIZE;
		int cols = (width - 2 * leftRightMargin) / CELLSIZE;

		leftRightMargin = ((width % CELLSIZE) + CELLSIZE) / 2;
		topBottomMargin = ((height % CELLSIZE) + CELLSIZE) / 2;

		// System.out.println(rows);
		// System.out.println(cols);

		if (world == null) {// ���� world�� �������� �ʾ����� ���� ����
			world = new World(rows, cols);
		}
		else {// �̹� ���� ��ü�� ������� �ִٸ� 
			if(world.getRows() != rows || world.getColumns() != cols) {
				world = new World(rows,cols); //���θ��� (��������)
			}
		}

//		world.setCell(0, 0, true);// grid ���߹迭�� ��ǥ(��,��) ���� true�� set
//		world.setCell(1, 4, true);
//		world.setCell(2, 2, true);

		g2.setColor(backgroundColor); // �� ����
		g2.fillRect(0, 0, width, height);// �簢���� ��ǥ�� ���� ĥ��

		drawGrid(g2, width, height); // ���� �ߴ� �޼ҵ�

		// ��ü �׸��� �迭���� ���� ������ ���� �ִ´�.
		for (int col = 0; col < cols; col++) {
			for (int row = 0; row < rows; row++) {
				boolean status = world.getCell(row, col);
				fillcell(g2, row, col, status);
			}
		}

	}

	private void fillcell(Graphics2D g2, int row, int col, boolean status) {
		// �簢���� ���� �ִ� �޼ҵ�(�׷���, ���� , ���� , ����(true���,false����)
		Color color = status ? Color.GREEN : backgroundColor;// ���׿����� status�� true�� ���
		g2.setColor(color);

		int x = leftRightMargin + (col * CELLSIZE);
		int y = topBottomMargin + (row * CELLSIZE);

		// x,y��ǥ ���� ���� ���� �Է��ؼ� �簢���� ���� ĥ�Ѵ�.
		g2.fillRect(x + 1, y + 1, CELLSIZE - 1, CELLSIZE - 1);
	}

	private void drawGrid(Graphics2D g2, int width, int height) {
		// ���� ���� �ߴ� �޼ҵ�
		g2.setColor(GridColor); // �� ���� : ȸ��

		for (int x = leftRightMargin; x <= width - leftRightMargin; x += CELLSIZE) {
			// ���� �ߴ� �޼ҵ� (x1,y1) (x2,y2)
			g2.drawLine(x, topBottomMargin, x, height - topBottomMargin);
		}
		for (int y = topBottomMargin; y <= width - topBottomMargin; y += CELLSIZE) {
			// ���� �ߴ� �޼ҵ� (x1,y1) (x2,y2)
			g2.drawLine(leftRightMargin, y, width - leftRightMargin, y);
		}
	}

	public void randomize() {
		//����Ű�� ��������. => �������� �׸��� ����
		world.randomize();
		//��������
		repaint();
		
	}

	public void clear() {
		// �齺���̽��� �������� => ��� ���� false�� ������
		world.clear();
		//��������
		repaint();
		
	}

	public void next() {
		// �����̽��ٸ� �������� => �ֺ� �׸��� Active
		world.next();
		//��������
		repaint();
		
	}

}
