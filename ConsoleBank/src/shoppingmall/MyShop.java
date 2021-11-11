package shoppingmall;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop {

	// ���θ� �̸�
	String title;
	
	// ���� ���� ����(���� �Լ����� �����ϱ�)
	String[] existingUsers = new String[2];
	String newUser;
	
	Product[] electronicProducts = new Product[3];
	Product[] clothProducts = new Product[3];
	Product[] sportingProducts = new Product[3];
	
	// ��ǰ �߰��� ���� ��ٱ���
	ArrayList<Product> cart = new ArrayList<Product>();
	
	// ������ �� ��ǰ ��ȣ
	int productNo;
	
	// �Է��� �ߺ����� ����
	Scanner scan = new Scanner(System.in);
	
	// �� ��ǰ �ݾ�
	int total = 0;

	/**
	 * ���θ� �̸� ����(���� �Լ����� �����ϱ�)
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * ������ �����ϴ� ���� ȸ�� ����ϱ�
	 * @param firstUser
	 * @param secondUser
	 * @param existingUsers
	 */
	public void setExistingUsers(String firstUser, String secondUser, String[] existingUsers) {
		
		UserList userList = new UserList();
		
		userList.setFirstUser(firstUser);
		userList.setSecondUser(secondUser);
		
		existingUsers[0] = userList.getFirstUser();
		existingUsers[1] = userList.getSecondUser();
	}
	
	/**
	 * ���θ� ������ �� �ֿܼ� �⺻���� ������ �ʱ� �˸�
	 */
	public void initAlarm() {
		
		System.out.println("====================================================");
		System.out.println("#  " + title + " ���θ��� ���Ű��� ȯ���մϴ�.  #");
		System.out.println("#  ������ ���� ���θ��� �湮�� �������� �����Ű���? [y/n]  #");
		System.out.printf("#  �湮���� : ");
		
		String isVisited = scan.next();
		
		switch (isVisited) {
			case "y": 
				
				choiceAccount(); break;
			case "n":
				
				registerAccount(); break;
			default:
				
				System.out.println("#  ������ ������ϴ�. ���α׷��� �����մϴ�.");
				System.exit(0); break;
		}
	}
	
	/**
	 * ���� �湮���� y�� ������ ��, ������ �����ϴ� ���� ���� �޼��� 
	 */
	public void choiceAccount() {
		
		System.out.println("====================================================");
		System.out.println("# ������ ��ȸ ���, �� ���� ������ �����մϴ�. ���Ͻô� ������ �������ּ���.");
		System.out.println("#  ȸ��[1] : " + existingUsers[0]);
		System.out.println("#  ȸ��[2] : " + existingUsers[1]);
		System.out.printf("#  ���� -> ");
		
		int userNo = scan.nextInt();
		
		switch (userNo) {
			case 1:
				
				firstUser(existingUsers[0]); break;
			case 2:
				
				secondUser(existingUsers[1]); break;
			default:
				System.out.println("#  ������ ������ϴ�. ���α׷��� �����մϴ�.");
				System.exit(0); break;
		}
		
	}
	
	/**
	 * ȸ������
	 */
	public void registerAccount() {
		
		System.out.println("====================================================");
		System.out.println("#  ȸ�������� �����մϴ�.");
		System.out.printf("#  ������ �Է����ּ��� : ");
		
		newUser = scan.next();
		
		UserList userList = new UserList();
		userList.setNewUser(newUser);
		
		System.out.println("====================================================");
		System.out.println("#  " + userList.getNewUser() + "�� ȯ���մϴ�. ���Ͻô� ī�װ��� �������ּ���.");
		
		selectCategory();
	}
	
	/**
	 * ������ ��ϵ� ù ��° ���� �ҷ�����
	 * @param firstUser
	 */
	public void firstUser(String firstUser) {
		
		System.out.println("===================================================");
		System.out.println("#  " + firstUser + "�� ȯ���մϴ�. ���Ͻô� ī�װ��� �������ּ���.");
		
		selectCategory();
	}
	
	/**
	 * ������ ��ϵ� �� ��° ���� �ҷ�����
	 * @param secondUser
	 */
	public void secondUser(String secondUser) {
		
		System.out.println("===================================================");
		System.out.println("#  " + secondUser + "�� ȯ���մϴ�. ���Ͻô� ī�װ��� �������ּ���.");
		
		selectCategory();
	}

	/**
	 * ���θ� ���� ���� ��, ��ǰ generate
	 */
	public void genProduct() {
		
		Electronic electronic = new Electronic("LG�׷�", 1500000, 5);
		electronic.setCategoryName("���ڱ��");
		electronicProducts[0] = electronic;
		electronic = new Electronic("�Ｚ ��Ź��", 2000000, 2);
		electronicProducts[1] = electronic;
		electronic = new Electronic("������ 2����", 150000, 3);
		electronicProducts[2] = electronic;
		
		Cloth cloth = new Cloth("���� ��Ʈ", 250000, 2);
		cloth.setCategoryName("�Ƿ�");
		clothProducts[0] = cloth;
		cloth = new Cloth("���� û����", 120000, 2);
		clothProducts[1] = cloth;
		cloth = new Cloth("ǻ�� ���е�", 470000, 2);
		clothProducts[2] = cloth;
		
		SportingItem sportingItem = new SportingItem("����Ű �ո���", 23000, 5);
		sportingItem.setCategoryName("��������ǰ"); 
		sportingProducts[0] = sportingItem;
		sportingItem = new SportingItem("�Ƶ�ٽ� �౸ȭ", 40000, 5);
		sportingProducts[1] = sportingItem;
		sportingItem = new SportingItem("�������� ������", 100000, 5);
		sportingProducts[2] = sportingItem;
	}
	
	/**
	 * ī�װ� ��� ����ϱ�
	 */
	public void selectCategory() {
		
		System.out.println("������ī�װ���Ϧ�����");
		System.out.println("�� 1. ���ڱ��   ��");
		System.out.println("�� 2. �Ƿ�      ��");
		System.out.println("�� 3. ��������ǰ  ��");
		System.out.println("������������������������������");
		System.out.println("#  [0] : ��ٱ��� ��ǰ�� ����մϴ�.");
		System.out.printf("#  ���� -> ");
		
		int categoryNo = scan.nextInt();
		
		printProductList(categoryNo);
	}
	
	/**
	 * ī�װ� �ش� ��ȣ�� �´� ��ǰ ��� ���
	 * @param categoryNo
	 */
	public void printProductList(int categoryNo) {
		switch(categoryNo) {
			case 0:
				
				checkout(); break;
			case 1:
				
				selectProduct(electronicProducts); break;
			case 2:
				
				selectProduct(clothProducts); break;
			case 3:
				
				selectProduct(sportingProducts); break;
			default:
				
				System.out.println("#  ������ ������ϴ�. ���α׷��� ����Ǿ����ϴ�.");
				System.exit(0); break;
		}
		
	}

	/**
	 * 	��ǰ�� �������� ��, ��ٱ��Ͽ� �ֱ�
	 * @param product
	 */
	public void putCart(Product product) {
		
		if (product.getRemainingStock() != 0) {
			
			cart.add(product);
			total += product.getPrice();
			
			product.deductRemainingStock(); 
			
			System.out.printf("#  %s�� �����ϼ̽��ϴ�. ���� ��ٱ��� �� �ݾ��� %d�� �Դϴ�.\n", product.getProductName(), total);
			System.out.println("#  EnterŰ�� �����ø� ī�װ� ����� ��µ˴ϴ�.");
		} else {
			
			System.out.println("==================================================");
			System.out.printf("#  �����Ͻ� %s ��ǰ�� ��� ��� �����Ǿ����ϴ�.\n", product.getProductName());
		}
		
		scan.nextLine();
		scan.nextLine(); // �Է� ���� �����
		
		selectCategory();
	}
	
	/**
	 * ī�װ� �ش� ��ȣ�� �´� ��ǰ ��� ���
	 * @param products
	 */
	public void selectProduct(Product[] products) {
		
		System.out.println("=================================================================");
		
		// products[0]�� �ǹ̴� 0, 1, 2�� �ƹ��ų� �͵� ��°��� ���Ƽ� 0���� ������
		System.out.println("#  " + products[0].getCategoryName() + " ī�װ��� ���� ���� ȯ���մϴ�. ���Ͻô� ��ǰ ��ȣ�� �Է����ּ���.");
		
		for (int i = 0; i < 3; i++) {
			System.out.printf("#  ��ǰ��" + (i + 1) + " : %s, ���� : %d, ���� ��� : %d\n", 
					products[i].getProductName(), products[i].getPrice(), products[i].getRemainingStock());
		}
		
		System.out.println("#  [0] : ��ٱ��� ��ǰ���� ����մϴ�.");
		System.out.printf("#  ���� -> ");
		
		productNo = scan.nextInt();
		
		System.out.println("==================================================================");
		
		if (productNo == 0) {
			
			checkout();
		} else if (productNo == 1 || productNo == 2 || productNo == 3) {
			
			putCart(products[productNo-1]);
		} else {
			
			System.out.println("#  ������ ������ϴ�. ���α׷��� �����մϴ�.");
			System.exit(0);
		}
	}
	
	
	/**	
	 * üũ�ƿ�
	 */
	public void checkout() {
		if (total == 0) {
			
			System.out.println("============================================");
			System.out.println("#  ��ٱ��ϰ� ����ֽ��ϴ�. ��ٱ��Ͽ� ��ǰ�� ����ּ���.");
			
			selectCategory();
		} else {
			
			printShoppingBasket();
			System.out.printf("#  �����Ͻ� �� �ݾ��� %d�� �Դϴ�. \n#  �� ���� ����� �������ּ��� ��\n", total);
			System.out.println("#  [1] : CASH");
			System.out.println("#  [2] : CARD");
			System.out.printf("#  ���� -> ");
			
			int payment = scan.nextInt();
			
			switch (payment) {
				case 1:
					
					paymentOnCash(); break;
				case 2:
					
					paymentOnCard(); break;
				default:
					
					System.out.println("#  ������ ������ϴ�. ���α׷��� �����մϴ�.");
					System.exit(0); break;
			}
		}
	}

	/**
	 * üũ�ƿ��� ��, ���ݱ��� ��ٱ��Ͽ� �־���� ��ǰ ��ϵ� Ȯ���� ���
	 */
	public void printShoppingBasket() {
		
		System.out.println("=========================================");
		System.out.println("����������������������ٱ��� ��Ϧ���������������������");
		System.out.println("����\t   ��ǰ\t\t      ����");
		
		for (int i = 0; i < cart.size(); i++) {
			
			System.out.printf(" %d   ��\t%s   \t��%d \n",i + 1 ,cart.get(i).getProductName(), cart.get(i).getPrice());
		}
		
		System.out.println("������������������������������������������������������������");
	}
	
	/**
	 * ���� ���
	 */
	public void paymentOnCash() {
		
//		System.out.printf("#  ���� ������ ���ϼ̽��ϴ�. 15% ���εǾ� �����Ͻ� ���� �ݾ��� %d�� �Դϴ�.\n", total * 0.85);
		System.out.println("=======================================");
		System.out.printf("#  �����Ͻ� ������ �Է����ּ��� : ");
		
		int cash = scan.nextInt();
		
		if (cash >= total) {
			
			System.out.println("=======================================");
			System.out.printf("#  %d���� �����ϼ̽��ϴ�. �Ž������� %d�� �Դϴ�.\n", cash, cash - total);
			System.out.println("#  ����� �Ϸ�Ǿ����ϴ�. �ȳ��� ������.");
		} else {
			
			System.out.println("=======================================");
			System.out.printf("#  %d���� �� �����ϼž� �մϴ�.\n", total - cash);
			
			differencePayment(cash);
		}
		
	}
	
	/**
	 * ���� ���� �����ϱ�
	 * @param cash
	 */ 
	public void differencePayment(int cash) {
		
		System.out.printf("#  ���� �����ϱ� : ");
		
		int difference = scan.nextInt();
		
		if (difference == total - cash) {
			
			System.out.println("=====================================");
			System.out.println("#  ����� �Ϸ�Ǿ����ϴ�. �ȳ��� ������.");
		} else if (difference < total - cash) {
			
			total = (total - cash) - difference; 
			
			System.out.println("=====================================");
			System.out.printf("#  %d���� �� �����ϼž� �մϴ�.\n", total);
			
			differencePayment(total);
		} else {
			
			System.out.println("=====================================");
			System.out.printf("#  %d���� �����ϼ̽��ϴ�. �Ž������� %d�� �Դϴ�.\n", difference , difference - (total - cash));
			System.out.println("#  ����� �Ϸ�Ǿ����ϴ�. �ȳ��� ������.");
			System.out.println("#  ���α׷��� ����Ǿ����ϴ�.");
		}
	}
	
	
	/**
	 * ī�� ���
	 */
	public void paymentOnCard() {
		
		System.out.println("=====================================");
		System.out.println("#  ������ �ʿ��ϽŰ���?(y/n)");
		System.out.printf("#  ���� -> ");
		
		String isNeedRecipt = scan.next();
		
		switch (isNeedRecipt) {
		case "y": 
			
			System.out.println("=====================================");
			System.out.println("#  ������ �߱��� �Ϸ�Ǿ����ϴ�. �ȳ��� ������.");
			System.out.println("#  ���α׷��� ����Ǿ����ϴ�."); break;
		case "n":
			
			System.out.println("=====================================");
			System.out.println("#  ����� �Ϸ�Ǿ����ϴ�. �ȳ��� ������.");
			System.out.println("#  ���α׷��� ����Ǿ����ϴ�."); break;
		default:
			
			System.out.println("=====================================");
			System.out.println("#  ������ ������ϴ�. ���α׷��� �����մϴ�.");
			
			System.exit(0); break;
		}
	}
	
}
