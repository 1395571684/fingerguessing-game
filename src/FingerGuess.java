/**人机猜拳游戏
 * 
 * @author haoyujing
 *
 */
public class FingerGuess {
	public static void main(String[] args) {
		Referee r=new Referee();
		r.startGame();
		boolean flag=r.askName();
		if(!flag){//玩家不想开始
			System.out.println("游戏结束了亲");
			return;
		}
		boolean pFlag;
		do{
		      pFlag=r.gameProceed();//pFlage是游戏是否继续的标志
		}while(pFlag);
		r.declareResult();
			
	}
	
        
}
