import java.util.Scanner;

public class Referee {//������
	private int total;//һ����ľ���
	Person person;
	Computer computer;
	Scanner input=new Scanner(System.in);
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	void startGame(){//������ʼ
		System.out.println("*********************");
		System.out.println("**   ��ȭ����ʼ           **");
		System.out.println("**********************");
		System.out.println("��ȭ����1.����2.ʯͷ3.��");
	}
	boolean askName(){
		System.out.println("��Ϊ�Է�ѡ���ɫ��1.����2.��Ȩ3.�ܲ٣���");
		String cStr=computer.inputName();
		System.out.println("������������֣�");
		String pStr=person.inputName();
		System.out.println(pStr+"VS"+cStr);
		System.out.println("Ҫ��ʼ�𣿣�y/n��");
		String yn=input.next();
		if(yn.equals("y"))
			return true;
		else 
			return false;
	}
	void gameProceed(){
		System.out.println("���ȭ��1.����2.ʯͷ3.����");
		int pChoose=person.myFist();
		int cChoose=computer.myFist();
		if(pChoose==cChoose)
			System.out.println("���˵���˴�ƽ�֣��ٽ�������");
		else if(pChoose==1){
			if(cChoose==2)
				System.out.println("���˵��������");
			else
				System.out.println("���˵����Ӯ��");
		}
		
	}

}
