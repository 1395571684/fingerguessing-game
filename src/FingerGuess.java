/**�˻���ȭ��Ϸ
 * 
 * @author haoyujing
 *
 */
public class FingerGuess {
	public static void main(String[] args) {
		Referee r=new Referee();
		r.startGame();
		boolean flag=r.askName();
		if(!flag){//��Ҳ��뿪ʼ
			System.out.println("��Ϸ��������");
			return;
		}
		boolean pFlag;
		do{
		      pFlag=r.gameProceed();//pFlage����Ϸ�Ƿ�����ı�־
		}while(pFlag);
		r.declareResult();
			
	}
	
        
}
