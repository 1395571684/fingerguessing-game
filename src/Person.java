import java.util.Scanner;

public class Person extends Player {// �����

	Scanner input = new Scanner(System.in);

	public String inputName() {// �������֣���������
		setPlayerName(input.next());
		return getPlayerName();
	}

	public int myFist() {
		int choose = input.nextInt();
		switch (choose) {
		case 1:
			System.out.println("���ȭ������");
			break;
		case 2:
			System.out.println("���ȭ��ʯͷ");
			break;
		case 3:
			System.out.println("���ȭ����");
			break;
		default:
			break;
		}
		return choose;
	}

	public String ifContinue() {
		return input.next();
	}

}
