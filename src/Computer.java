import java.util.Random;
import java.util.Scanner;

public class Computer extends Player {// �������
	Scanner input = new Scanner(System.in);

	public String inputName() {// ���Ϊ����ѡ���ɫ
		int choose = input.nextInt();
		switch (choose) {
		case 1:
			setPlayerName("����");
			break;
		case 2:
			setPlayerName("��Ȩ");
			break;
		case 3:
			setPlayerName("�ܲ�");
			break;
		default:
			break;
		}
		return getPlayerName();

	}

	public int myFist() {// �������ѡ��
		Random r = new Random();
		int choose = r.nextInt(3);
		if (choose == 1)
			System.out.println(getPlayerName() + "��ȭ������");
		else if (choose == 2)
			System.out.println(getPlayerName() + "��ȭ��ʯͷ");
		else
			System.out.println(getPlayerName() + "��ȭ����");
		return choose;

	}

}
