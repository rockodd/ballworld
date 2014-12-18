package ballworld;

public class Ping extends Kick {	
	double incx, incy;				// inx und incy deklarieren
	
	public Ping(){
	posx=(Math.random()-0.5)*200;	// Startposition zw. -100 und +100 in x-Richtung
	posy=(Math.random()-0.5)*200;	// Startposition zw. -100 und +100 in y-Richtung
	incx=Math.random()-0.5;			// Incrementwert zw. -0,5 und +0,5 bestimmt RIchtung und Geschw. in x-Richtg.
	incy=Math.random()-0.5;			// Incrementwert zw. -0,5 und +0,5 bestimmt Richtung und Geschw. in y-Richtg.
	}								 
									
	@Override
	public void act() {
		if (posx+rad >meineWelt.getMaxX()){			// rechter Bildschirmrand
			incx=-incx;								// Vorzeichen umkehren um Richtung zu ändern 
		}
		else if (posx-rad<-meineWelt.getMaxX()){	// linker Bildschirmrand
			incx=-incx;								// Vorzeichen umkehren um Richtung zu ändern
		}
		posx+=incx*2;		//posx = posx + incx	// Ballposition wird um den Wert aus incx verändert
		
		
		if (posy+rad>meineWelt.getMaxY()){			// oberer Bildschirmrand
			incy=-incy;								// Vorzeichen in Y-Richtung drehen
		}
		else if (posy-rad<-meineWelt.getMaxY()){	// unterer Bildschirmrand
			incy=-incy;								// Vorzeichen in Y-Richtung drehen
		}
		posy+=incy*2;								// Ballposition wird um incy verändert mit Multiplikator 2
		}	
	}

	
		
	

	



