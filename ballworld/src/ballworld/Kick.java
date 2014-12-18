package ballworld;
//import ballworld.World; Muss nicht importiert werden.

public class Kick extends Basic {
	
	public World meineWelt;
	
	public Kick() {		// Konstruktur, um Basicvariablen zu ändern
		rad = 10;	
		}

	@Override
	public void userClicked(double xklick, double yklick) {
		posx=xklick;
		posy=yklick;		
		//super.userClicked(arg0, arg1);
	}


	@Override
	public void userTyped(char taste) {
		
		if (taste == 'd') {
			meineWelt.removeBall(this);				
		}
	}
	//Es wird der Ball mit d entfernt der grade markiert ist
	//Wenn kein Ball markiert ist wird kein Ball entfernt
	
	@Override
	public void setWorld(World arg0) {
		meineWelt = arg0;
		//für das entfernen von Bällen
	}
	

	
	
		
	

	
}
