package ballworld;

public class Bang extends Ping {
	Ball ball = this;	
	public Bang() {		// Konstruktur
		rad=2;
		}
	
	//für Feuerwerk
//	public Bang(double startX, double startY) {
//		rad=2;
//		posx=startX;
//		posy=startY;
//	}

	@Override
	public void act() {
		super.act();
		rad+=0.05;
		if (rad>=5){
			meineWelt.removeBall(ball);	
		}
		
	}

}
