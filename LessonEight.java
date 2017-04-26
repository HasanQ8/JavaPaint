import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class LessonEight {
	
	public static void main(String [] args){
		
		
		
		Monstors.buildBattleBoard();
		
		char [][] tempBattleBoard = new char [10][10];
		
		Monstors[] Monsters = new Monstors[4];
		
		
		Monsters[0] = new Monstors(1000,20,1,"Frank");
		Monsters[1] = new Monstors(500,30,3,"Lank");
		Monsters[2] = new Monstors(700,40,1,"Ang");
		Monsters[3] = new Monstors(300,10,4,"Rank");
		
		
		Monstors.reDrawBoard();
	
	
	for( Monstors m : Monsters){
		
		if(m.getAlive()){
			
			int arrayItemIndex =ArrayUtils.indexOf(Monsters, m);
			m.moveMonster(Monsters,arrayItemIndex);
		}
	}
	Monstors.reDrawBoard();
	}
	
}
