package model;

import java.util.Random;

public class World {
	private int rows; // ��
	private int columns; // ��

	private boolean[][] grid; // �Ҹ� ���߹迭
	private boolean[][] buffer; //���� �ӽù迭

	public World(int rows, int columns) { // ���� ������(����,����)
		this.rows = rows;
		this.columns = columns;

		grid = new boolean[rows][columns]; // ���߹迭 ��ü�����(ũ�� ����)
		buffer = new boolean[rows][columns]; 
	}

	public boolean getCell(int row, int col) {
		return grid[row][col]; // ������ grid���� ���� ��(�簢��)�� ������� ����������?
	}

	public void setCell(int row, int col, boolean status) {
		grid[row][col] = status; // ���� ���¸� ����
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns; // ������� �迭�� ������ �г�
	}

	public void randomize() {
		// �׸��� �迭�� �������� true false �ֱ�
		Random random = new Random();

		for (int i = 0; i < (rows * columns) / 10; i++) { // Ƚ���� �ٰ� ���� ������ ��������.
			int row = random.nextInt(rows); // �������� 0���� rows(��ü�ټ�)-1���� �������� ����
			int col = random.nextInt(columns);// 0 ~ columns -1
			setCell(row, col, true); // �������� �ɸ� ���� �������
		}
	}

	public void clear() {
		// ��� grid�� ���� false�� �����.
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < columns; col++) {
				setCell(row, col, false); // ��� ���� false
			}
		}
	}

	public void next() {
		// �����̽��ٸ� ������ ��� ���� ��ǥ�� ����Ѵ�
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < columns; col++) {
				int neighbours = countNeighbours(row, col);

				//System.out.printf("( %d,%d ) %d \n", row, col, neighbours);
				/*
				 * �˰��� 1. �ֺ� ������� < 2 or > 3 �� ������ 2. ������� == 3 �϶� ��� 3. ������� == 2 �϶� �״��
				 */
				boolean status = false;

				if (neighbours < 2) {
					status = false;
				} else if (neighbours > 3) {
					status = false;
				} else if (neighbours == 3) {
					status = true;
				} else if (neighbours == 2) {
					status = getCell(row, col); //���´� �״�� ���� ���� ����
				}

				buffer[row][col] = status; //(�˰��� ����) �ӽ� �迭 ���ۿ� �Է��Ѵ�.
			}
		}
	// ���ۿ� ����� ���� �״�� ���� grid �迭�� ī��
	for (int row = 0; row < rows; row++) {
		for (int col = 0; col < columns; col++) {
			grid[row][col]=buffer[row][col]; // ��� ���� false
		}
	}
}

	private int countNeighbours(int row, int col) {

		int n = 0;

		for (int rowOffset = -1; rowOffset <= 1; rowOffset++) {
			for (int colOffset = -1; colOffset <= 1; colOffset++) {

				if (rowOffset == 0 && colOffset == 0) {
					continue; // �Ʒ� ������ �����ʰ� �ٽ� �ݺ��Ѵ�.
				}

				int gridRow = row + rowOffset;
				int gridCol = col + colOffset;

				if (gridRow < 0) {
					continue;
				} else if (gridRow == rows) {
					continue;
				}
				if (gridCol < 0) {
					continue;
				} else if (gridCol == columns) {
					continue;
				}

				boolean status = getCell(gridRow, gridCol);

				if (status) {
					n++; // �ֺ��� ��� ���� ������ +1
				}
			}
		}

		return n;
	}
}
