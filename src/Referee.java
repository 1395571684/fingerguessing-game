import java.util.Scanner;

public class Referee {//裁判类
	private int total;//一共玩的局数
	Person person;
	Computer computer;
	Scanner input=new Scanner(System.in);
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	void startGame(){//宣布开始
		System.out.println("*********************");
		System.out.println("**   猜拳，开始           **");
		System.out.println("**********************");
		System.out.println("出拳规则：1.剪刀2.石头3.布");
	}
	boolean askName(){
		System.out.println("请为对方选择角色（1.刘备2.孙权3.曹操）：");
		String cStr=computer.inputName();
		System.out.println("请输入你的名字：");
		String pStr=person.inputName();
		System.out.println(pStr+"VS"+cStr);
		System.out.println("要开始吗？（y/n）");
		String yn=input.next();
		if(yn.equals("y"))
			return true;
		else 
			return false;
	}
	void gameProceed(){
		System.out.println("请出拳：1.剪刀2.石头3.布：");
		int pChoose=person.myFist();
		int cChoose=computer.myFist();
		if(pChoose==cChoose)
			System.out.println("结果说：此次平局，再接再厉！");
		else if(pChoose==1){
			if(cChoose==2)
				System.out.println("结果说：你输了");
			else
				System.out.println("结果说：你赢了");
		}
		
	}

}
