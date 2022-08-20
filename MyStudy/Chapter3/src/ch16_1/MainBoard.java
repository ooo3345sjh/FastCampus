package ch16_1;

public class MainBoard {
	public static void main(String[] args) {
		Player plyer = new Player();
		plyer.play(1);
		
		PlayerLevel aLevel = new AdvancedLevel();
		plyer.upgradeLevel(aLevel);
		plyer.play(2);

		PlayerLevel sLevel = new SuperLevel();
		plyer.upgradeLevel(sLevel);
		plyer.play(3);
		
	}
}
