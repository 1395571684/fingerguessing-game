import java.util.Scanner;

public abstract class Player {//�����
	private String playerName;
	private int winCounts;
    abstract String inputName();//�����������
	abstract int myFist();//��Ҳ�ȭ
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getWinCounts() {
		return winCounts;
	}
	public void setWinCounts(int winCounts) {
		this.winCounts = winCounts;
	}
		
}
