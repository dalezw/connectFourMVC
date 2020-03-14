package mvc;

public class c4Controller {
	c4Model game;
	
	public c4Controller() {
		game=new c4Model();
	}
	
	public boolean checkWin() {
		if(game.winCondition()==true) {
			return true;
		}
		else {
			return true;
		}
	}
}
