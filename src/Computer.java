import java.util.Random;
import java.util.Scanner;

public class Computer extends Player {//�������
Scanner input=new Scanner(System.in);
	String inputName() {//���Ϊ����ѡ���ɫ
		int choose=input.nextInt();
		if(choose==1)
			setPlayerName("����");
			else if(choose==2)
				setPlayerName("��Ȩ");
				else
					setPlayerName("�ܲ�");
		return getPlayerName();
		
	}

	int myFist() {//�������ѡ��
		Random r=new Random();
		int choose=r.nextInt(3);
		if(choose==1)
		System.out.println(getPlayerName()+"��ȭ������");
		else if(choose==2)
			System.out.println(getPlayerName()+"��ȭ��ʯͷ");
		else
			System.out.println(getPlayerName()+"��ȭ����");
		return choose;
		
	}
	

}
