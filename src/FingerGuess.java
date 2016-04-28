/**
 * 人机猜拳游戏
 * 
 * @author haoyujing
 *
 */
public class FingerGuess {
	public static void main(String[] args) {
		Referee r = new Referee();
		r.startGame();// 裁判宣布游戏开始以及游戏规则
		boolean flag = r.askName();// 裁判询问玩家姓名
		if (!flag) {// 玩家不想开始
			System.out.println("游戏结束了亲");
			return;
		}
		boolean pFlag;
		do {
			pFlag = r.playGame();// pFlage是游戏是否继续的标志
		} while (pFlag);
		r.declareResult();// 裁判宣布游戏结果

	}

}
