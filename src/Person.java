import java.util.Scanner;

public class Person extends Player{//�����

	Scanner input=new Scanner(System.in);
	String inputName(){//�������֣���������
		setPlayerName(input.next());
		return getPlayerName();
		}
	int myFist(){
		int choose=input.nextInt();
		switch(choose){
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
	
	

}
