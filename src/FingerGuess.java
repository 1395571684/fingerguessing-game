/**
 * �˻���ȭ��Ϸ
 * 
 * @author haoyujing
 *
 */
public class FingerGuess {
	public static void main(String[] args) {
		Referee r = new Referee();
		r.startGame();// ����������Ϸ��ʼ�Լ���Ϸ����
		boolean flag = r.askName();// ����ѯ���������
		if (!flag) {// ��Ҳ��뿪ʼ
			System.out.println("��Ϸ��������");
			return;
		}
		boolean pFlag;
		do {
			pFlag = r.playGame();// pFlage����Ϸ�Ƿ�����ı�־
		} while (pFlag);
		r.declareResult();// ����������Ϸ���

	}

}
