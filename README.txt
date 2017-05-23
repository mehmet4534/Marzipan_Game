Our program has 7 class including Almond,Grid,GridCell,ImagePanel,Marzipan,
MarzipanController,MarzipanForm. Marzipan class from these classes is main class.
The code of these classes is located the path of Marzipan\Marzipan\src in the submitted folder.
How to run this program?
*Firstly called Grid class and created a table for background processes in Marzipan class.
	->Grid class calls GridCell class and created 5 to 5 GridCell array.
	->These gridCells are filled with called Almond class.
	->Almond class randomly places colors in gridCells.
*Called MarzipanForm and created a frame in Marzipan class.
	->This frame includes 25 panels which are created calling ImagePanel class.
	->These 25 panels are painted helping with preformed gridCells.
	->Then, they are located in the frame regularly.
*After that, called compareGrid in Grid class and avoided from at least 3 almonds of same type.
*Preformed 25 panels are located according to system.
*If a user clicks one of these panels, this panel is selected and isThereAnother that 
is described default value "false" in MarzipanController is true. The coordinates of gridCell of 
Cliked panel are recorded in an int array. Then, when user clicks another panel, 
exchangeNeighbours method in Grid class is called and preselected coordinates and new selected 
coordinates are sent as parameters in that method. exchangeNeighbours method firstly looks whether
these selected panels are neighbour. If they are neighbours, compareGrid method is called. 
compareGrid method looks in one row or column whether 3 or more almonds of same type. If there is 
this case, exchange method is called and gridCells are swapped up to down.This continue until
not available 3 or more almonds of same type in one row or column.Lastly, calling changePanel method
process method of MarzipanController class, changes on gridCells are applied panels.
 
