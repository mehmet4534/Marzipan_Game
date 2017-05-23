import java.awt.Color;




public class Grid {
	GridCell[][] grd;
	static int sc=0;
	
	public Grid(){
		grd=new GridCell[5][5];
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				grd[i][j]=new GridCell();
				grd[i][j].row=i;
				grd[i][j].column=j;
			}
		}
		//compareGrid();
	}
	
	public void compareGrid(MarzipanForm m){
	
		for(int i=0;i<5;i++){
			for(int j=0;j<3;j++){
				if(grd[i][j].almOfCell.clrOfAlmond==grd[i][j+1].almOfCell.clrOfAlmond&&grd[i][j+1].almOfCell.clrOfAlmond==grd[i][j+2].almOfCell.clrOfAlmond){
					if(j<2 && grd[i][j].almOfCell.clrOfAlmond==grd[i][j+3].almOfCell.clrOfAlmond){
						if(j<1 && grd[i][j].almOfCell.clrOfAlmond==grd[i][j+4].almOfCell.clrOfAlmond){	
						while(j<5){
							if(grd[i][j].empty==false)
								grd[i][j].empty=true;
							j++;
						}
						sc=sc+25;
						continue;
						}
						int k=j;
						while(j<4+k){
							if(grd[i][j].empty==false)
								grd[i][j].empty=true;
							j++;
						}
						sc=sc+16;
						continue;
					}
					int k=j;
					while(j<3+k){
						if(grd[i][j].empty==false)
							grd[i][j].empty=true;
						j++;
					}
					sc=sc+9;
					continue;
				}
			}
			for(int j=0;j<3;j++){
				if(grd[j][i].almOfCell.clrOfAlmond==grd[j+1][i].almOfCell.clrOfAlmond&&grd[j+1][i].almOfCell.clrOfAlmond==grd[j+2][i].almOfCell.clrOfAlmond){
					if(j<2 && grd[j][i].almOfCell.clrOfAlmond==grd[j+3][i].almOfCell.clrOfAlmond){
						if(j<1 && grd[j][i].almOfCell.clrOfAlmond==grd[j+4][i].almOfCell.clrOfAlmond){	
						while(j<5){
							if(grd[j][i].empty==false)
								grd[j][i].empty=true;
							j++;
						}
						sc=sc+25;
						continue;
						}
						int k=j;
						while(j<4+k){
							if(grd[j][i].empty==false)
								grd[j][i].empty=true;
							j++;
						}
						sc=sc+16;
						continue;
					}
					int k=j;
					while(j<3+k){
						if(grd[j][i].empty==false)
							grd[j][i].empty=true;
						j++;
					}
					sc=sc+9;
					continue;
				}
			}
		}
		int a=0;
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(grd[i][j].empty==true){
					exchange(i,j);
					m.changePanel(this);
					
					grd[i][j].empty=false;
					a=1;
				}
			}
		}
		if(a==1)
			compareGrid(m);
		return;
	}
	public void exchange(int row,int column){
		while(row>=1){
			grd[row][column].almOfCell.clrOfAlmond=grd[--row][column].almOfCell.clrOfAlmond;
			
		}
		grd[0][column]=new GridCell();
		
	}
	public void exchangeNeighbour(int row1,int column1,int row2,int column2,MarzipanForm m){
		int h=sc;
		if((row1==row2&&(column2-1>=0&&column1==column2-1||column2+1<5&&column1==column2+1))||(column1==column2&&row2-1>=0&&row1==row2-1||row2+1<5&&row1==row2+1)){
			GridCell tmp=grd[row1][column1];
			grd[row1][column1]=grd[row2][column2];
			grd[row2][column2]=tmp;
			
			if(((column1+2<5&&grd[row1][column1].almOfCell.clrOfAlmond==grd[row1][column1+1].almOfCell.clrOfAlmond&&grd[row1][column1].almOfCell.clrOfAlmond==grd[row1][column1+2].almOfCell.clrOfAlmond)||(row1+2<5&&grd[row1][column1].almOfCell.clrOfAlmond==grd[row1+1][column1].almOfCell.clrOfAlmond&&grd[row1][column1].almOfCell.clrOfAlmond==grd[row1+2][column1].almOfCell.clrOfAlmond))||((column1-2>=0&&grd[row1][column1].almOfCell.clrOfAlmond==grd[row1][column1-1].almOfCell.clrOfAlmond&&grd[row1][column1].almOfCell.clrOfAlmond==grd[row1][column1-2].almOfCell.clrOfAlmond)||(row1-2>=0&&grd[row1][column1].almOfCell.clrOfAlmond==grd[row1-1][column1].almOfCell.clrOfAlmond&&grd[row1][column1].almOfCell.clrOfAlmond==grd[row1-2][column1].almOfCell.clrOfAlmond)))
				{
				
					compareGrid(m);
				}
			else if(((column2+2<5&&grd[row2][column2].almOfCell.clrOfAlmond==grd[row2][column2+1].almOfCell.clrOfAlmond&&grd[row2][column2].almOfCell.clrOfAlmond==grd[row2][column2+2].almOfCell.clrOfAlmond)||(row2+2<5&&grd[row2][column2].almOfCell.clrOfAlmond==grd[row2+1][column2].almOfCell.clrOfAlmond&&grd[row2][column2].almOfCell.clrOfAlmond==grd[row2+2][column2].almOfCell.clrOfAlmond))||((column2-2>=0&&grd[row2][column2].almOfCell.clrOfAlmond==grd[row2][column2-1].almOfCell.clrOfAlmond&&grd[row2][column2].almOfCell.clrOfAlmond==grd[row2][column2-2].almOfCell.clrOfAlmond)||(row2-2>=0&&grd[row2][column2].almOfCell.clrOfAlmond==grd[row2-1][column2].almOfCell.clrOfAlmond&&grd[row2][column2].almOfCell.clrOfAlmond==grd[row2-2][column2].almOfCell.clrOfAlmond)))
			{
				compareGrid(m);
			}
			else if(column1-1>=0&&column1+1<5&&grd[row1][column1].almOfCell.clrOfAlmond==grd[row1][column1-1].almOfCell.clrOfAlmond&&grd[row1][column1].almOfCell.clrOfAlmond==grd[row1][column1+1].almOfCell.clrOfAlmond){
				compareGrid(m);
			}
			else if(row1-1>=0&&row1+1<5&&grd[row1][column1].almOfCell.clrOfAlmond==grd[row1-1][column1].almOfCell.clrOfAlmond&&grd[row1][column1].almOfCell.clrOfAlmond==grd[row1+1][column1].almOfCell.clrOfAlmond){
				compareGrid(m);
			}
			else if(column2-1>=0&&column2+1<5&&grd[row2][column2].almOfCell.clrOfAlmond==grd[row2][column2-1].almOfCell.clrOfAlmond&&grd[row2][column2].almOfCell.clrOfAlmond==grd[row2][column2+1].almOfCell.clrOfAlmond){
				compareGrid(m);
			}
			else if(row2-1>=0&&row2+1<5&&grd[row2][column2].almOfCell.clrOfAlmond==grd[row2-1][column2].almOfCell.clrOfAlmond&&grd[row2][column2].almOfCell.clrOfAlmond==grd[row2+1][column2].almOfCell.clrOfAlmond){
				compareGrid(m);
			}
			else{
				tmp=grd[row1][column1];
				grd[row1][column1]=grd[row2][column2];
				grd[row2][column2]=tmp;
				sc=h;
			}
		}
		
		else{
			System.out.print("yapamaz");
		}
	}
}
