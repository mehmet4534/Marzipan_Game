import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.Random;


public class Almond{
	Color clrOfAlmond;
	public Almond(){
		//clrOfAlmond=new Color(0);
		clrOfAlmond=getRandomClr();
	}
	public Color getRandomClr(){
		Color randomClr;
		Random rnd=new Random();
		int rndNumber=rnd.nextInt(3);
		if(rndNumber==2){
			randomClr=Color.blue;
		}
		else if(rndNumber==1){
			randomClr=Color.green;
		}
		else{
			randomClr=Color.red;
		}
		
		return randomClr;
	}
	
}
