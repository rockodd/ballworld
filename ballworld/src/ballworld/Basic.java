package ballworld;

import cs101.lang.Animate;

public class Basic implements Animate, Ball {
	public double posx = 0;
	public double posy = 0;
	public double rad = 5;			//global, da die Variablen später verändert werden
	
	
	@Override
	public double getRadius() {	
		return rad;
	}

	@Override
	public double getX() {
		return posx;
	}

	@Override
	public double getY() {
		return posy;
	}

	@Override
	public void setWorld(World arg0) {
	}

	@Override
	public void userClicked(double arg0, double arg1) {
	posx++;
	posy++;
	
	}

	@Override
	public void userTyped(char arg0) {

	}

	@Override
	public void act() {

	}


}
