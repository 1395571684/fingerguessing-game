import java.util.Scanner;

public abstract class Player {// 玩家类
	private String playerName;
	private int winCounts = 0;

	public abstract String inputName();// 输入玩家姓名

	public abstract int myFist();// 玩家猜拳

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getWinCounts() {
		return winCounts;
	}

	public void setWinCounts() {
		this.winCounts++;
	}

}
