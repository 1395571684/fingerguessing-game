import java.util.Scanner;

public class Person extends Player{//�����

	Scanner input=new Scanner(System.in);
	String inputName(){//�������֣���������
		System.out.println("������������֣�");
		setPlayerName(input.next());
		return getPlayerName();
		}
	int myFist(){
		int choose=input.nextInt();
		if(choose==1)
		System.out.println("���ȭ������");
		else if(choose==2)
			System.out.println("���ȭ��ʯͷ");
		else
			System.out.println("���ȭ����");
		return choose;
	}
	
	

}
