import java.util.Scanner;

public class Referee {// 裁判类
	private int total = 0;// 一共玩的局数
	private Person person = new Person();
	private Computer computer = new Computer();
	Scanner input = new Scanner(System.in);

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void startGame() {// 宣布开始
		System.out.println("*********************");
		System.out.println("**   猜拳，开始           **");
		System.out.println("*********************");
		System.out.println("出拳规则：1.剪刀2.石头3.布");
	}

	public boolean askName() {
		System.out.println("请为对方选择角色（1.刘备2.孙权3.曹操）：");
		String cStr = computer.inputName();
		System.out.println("请输入你的名字：");
		String pStr = person.inputName();
		System.out.println(pStr + " VS " + cStr);
		System.out.println("要开始吗？（y/n）");
		String yn = input.next();
		if (yn.equals("y"))
			return true;
		else
			return false;
	}

	public boolean playGame() {// 游戏过程
		// 记录玩家和电脑赢得次数
		total++;// 局数加1
		System.out.println("请出拳：1.剪刀2.石头3.布(输出相应数字）：");
		int pChoose = person.myFist();
		int cChoose = computer.myFist();
		if (pChoose == cChoose)// 判断猜拳结果
			System.out.println("结果说：此次平局，再接再厉！");
		else if (pChoose == 1 && cChoose == 3 || pChoose == 2 && cChoose == 1 || pChoose == 3 && cChoose == 2) {
			System.out.println("结果说：你赢了");
			person.setWinCounts();
		} else {
			System.out.println("结果说：你输了");
			computer.setWinCounts();
		}
		System.out.println("是否开始下一轮：[y/n]");
		String yn = person.ifContinue();
		if (yn.equals("y"))
			return true;
		else
			return false;

	}

	public void declareResult() {// 裁判宣布结果
		System.out.println("********************************************************");
		System.out.println(person.getPlayerName() + "VS" + computer.getPlayerName());
		System.out.println("对战次数：" + total);
		System.out.println("姓名\t得分");
		System.out.println(person.getPlayerName() + "\t" + person.getWinCounts());
		System.out.println(computer.getPlayerName() + "\t" + computer.getWinCounts());
		System.out.print("结果：");
		if (person.getWinCounts() == computer.getWinCounts())
			System.out.println("本次是平局哦！");
		else if (person.getWinCounts() > computer.getWinCounts())
			System.out.println("哈哈，恭喜你赢了哦！^>^");
		else
			System.out.println("笨蛋，输了哦~_~");
	}

}
