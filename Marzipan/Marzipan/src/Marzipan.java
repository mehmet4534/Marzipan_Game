import java.awt.Color;



public class Marzipan{
	
	public static void main(String[] args) {
		Grid newMarzipan=new Grid();
		MarzipanForm m=new MarzipanForm(newMarzipan);
		//Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		//m.setBounds((int) screenSize.getWidth() - 50, , 500, 500);
	
	//	m.getPa
	/*	for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(newMarzipan.grd[i][j].almOfCell.clrOfAlmond==Color.blue){
					System.out.print("b ");
				}
				else if(newMarzipan.grd[i][j].almOfCell.clrOfAlmond==Color.green){
					System.out.print("g ");
				}
				else if(newMarzipan.grd[i][j].almOfCell.clrOfAlmond==Color.red){
					System.out.print("r ");
				}
			}
			System.out.print("\n");
		}
		System.out.println("\n");*/
		newMarzipan.compareGrid(m);
		newMarzipan.sc=0;
		
		 
	/*	for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(newMarzipan.grd[i][j].almOfCell.clrOfAlmond==Color.blue){
					System.out.print("b ");
				}
				else if(newMarzipan.grd[i][j].almOfCell.clrOfAlmond==Color.green){
					System.out.print("g ");
				}
				else if(newMarzipan.grd[i][j].almOfCell.clrOfAlmond==Color.red){
					System.out.print("r ");
				}
			}
			System.out.print("\n");
		}*/
	}

}
