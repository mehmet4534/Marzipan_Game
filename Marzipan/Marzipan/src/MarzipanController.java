import java.awt.Color;
import java.awt.Event;
import java.awt.Point;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;


public  class MarzipanController{
	Grid grd;
	MarzipanForm nmrp;
	boolean isThereAnother;
	int[] cliked=new int[2];

	public MarzipanController(Grid gd,MarzipanForm mrp){
		this.grd=gd;
		gd.sc=0;
		this.nmrp=mrp;

		isThereAnother=false;
		
	}
	public void process(int x,int y) {
		if(isThereAnother==true){
			Point a;
			a=nmrp.imgPanel[cliked[0]][cliked[1]].getLocation();
			nmrp.imgPanel[cliked[0]][cliked[1]].setLocation(a.x-10,a.y-10);
			nmrp.imgPanel[cliked[0]][cliked[1]].setSize(50, 50);
			grd.exchangeNeighbour(x, y, cliked[0], cliked[1],nmrp);
			isThereAnother=false;
			nmrp.score.setText(Integer.toString(grd.sc));
			System.out.println("\n"+grd.sc);
			nmrp.changePanel(grd);
		}
		else{
			cliked[0]=x;
			cliked[1]=y;
			Point a;
			a=nmrp.imgPanel[x][y].getLocation();
			nmrp.imgPanel[x][y].setLocation(a.x+10,a.y+10);
			nmrp.imgPanel[x][y].setSize(30, 30);
			isThereAnother=true;
		}
	}
	
	
	}
