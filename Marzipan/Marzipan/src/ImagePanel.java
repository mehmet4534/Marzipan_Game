
import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ImagePanel extends JPanel {
	Point row;
	public ImagePanel(){
		setSize(100, 100);
		setVisible(true);
	}
	
	public Color getClr(Grid mrp,int x,int y){
		
		return mrp.grd[x][y].almOfCell.clrOfAlmond;
		
		
	}
	
}
