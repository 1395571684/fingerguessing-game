import java.util.Scanner;

public class Referee {//������
	private int total=0;//һ����ľ���
	Person person=new Person();
	Computer computer=new Computer();
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
		System.out.println(pStr+" VS "+cStr);
		System.out.println("Ҫ��ʼ�𣿣�y/n��");
		String yn=input.next();
		if(yn.equals("y"))
			return true;
		else 
			return false;
	}
	boolean gameProceed(){
		//��¼��Һ͵���Ӯ�ô���
		total++;//������1
		System.out.println("���ȭ��1.����2.ʯͷ3.����");
		int pChoose=person.myFist();
		int cChoose=computer.myFist();
		if(pChoose==cChoose)//�жϲ�ȭ���
			System.out.println("���˵���˴�ƽ�֣��ٽ�������");
		else if(pChoose==1){
			if(cChoose==2){
				System.out.println("���˵��������");
				computer.setWinCounts();
			}
			else{
				System.out.println("���˵����Ӯ��");
				person.setWinCounts();
		}
			}
		else if(pChoose==2){
			if(cChoose==1){
				System.out.println("���˵����Ӯ��");
				person.setWinCounts();
			}
			else{
				System.out.println("���˵��������");
				computer.setWinCounts();
			}
			
		}
		else{
			if(cChoose==1){
				System.out.println("���˵��������");
				computer.setWinCounts();
			}
			else{
				System.out.println("���˵����Ӯ��");
				person.setWinCounts();
		}
		}
		System.out.println("�Ƿ�ʼ��һ�֣�[y/n]");
		String yn=input.next();
		if(yn.equals("y"))
			return true;
		else
			return false;

	}
	public void declareResult(){//�����������
		System.out.println("********************************************************");
		System.out.println(person.getPlayerName()+"VS"+computer.getPlayerName());
		System.out.println("��ս������"+total);
		System.out.println("����\t�÷�");
		System.out.println(person.getPlayerName()+"\t"+person.getWinCounts());
		System.out.println(computer.getPlayerName()+"\t"+computer.getWinCounts());
		System.out.print("�����");
		if(person.getWinCounts()==computer.getWinCounts())
			System.out.println("������ƽ��Ŷ��");
		else if(person.getWinCounts()>computer.getWinCounts())
			System.out.println("��������ϲ��Ӯ��Ŷ��^>^");
		else
			System.out.println("����������Ŷ~_~");
	}
//	public static void main(String[] args) {
//		Referee f=new Referee();
//		boolean fl=f.askName();
//		System.out.println(fl);
//	}

}
