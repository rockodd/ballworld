package ballworld;

public class Feuerwerk extends Bang {
	Ball feuer, feuer2;
	public Feuerwerk () {
		feuer = new Bang();
		feuer2 = new Bang();
	}
	
	public Feuerwerk (double startX, double startY) {
		posx=startX;
		posy=startY;
	}
	
	public void act () {	
		super.act();
		if (rad >=5) {
			feuer = new Feuerwerk(posx,posy);
			feuer2 = new Feuerwerk(posx,posy);
//			Ball feuer3 = new Bang(posx,posy);
//			Ball feuer4 = new Bang(posx,posy);
//			Ball feuer5 = new Bang(posx,posy);
//			Ball feuer6 = new Bang(posx,posy);
//			Ball feuer7 = new Bang(posx,posy);
//			Ball feuer8 = new Bang(posx,posy);
//			Ball feuer9 = new Bang(posx,posy);
			meineWelt.addBall(feuer);
			meineWelt.addBall(feuer2);
//			meineWelt.addBall(feuer3);
//			meineWelt.addBall(feuer4);
//			meineWelt.addBall(feuer5);
//			meineWelt.addBall(feuer6);
//			meineWelt.addBall(feuer7);
//			meineWelt.addBall(feuer8);
//			meineWelt.addBall(feuer9);
			
		}
	}
}
