package pkgGame;
import static org.junit.Assert.*;

import org.junit.Test;

import pkgEnum.eGameDifficulty;

public class SudokoGameDifficultyTest {
	@Test
	public void TestEnum() {
		eGameDifficulty difficultyReturn1 = pkgEnum.eGameDifficulty.get(1);
		assertNull(difficultyReturn1);
		
		eGameDifficulty difficultyReturn2 = pkgEnum.eGameDifficulty.get(100);
		assertEquals(eGameDifficulty.EASY, difficultyReturn2) ;
		
		eGameDifficulty difficultyReturn3 = pkgEnum.eGameDifficulty.get(250);
		assertEquals(eGameDifficulty.EASY, difficultyReturn3) ;
		
		eGameDifficulty difficultyReturn4 = pkgEnum.eGameDifficulty.get(500);
		assertEquals(eGameDifficulty.MEDIUM, difficultyReturn4) ;
		
		eGameDifficulty difficultyReturn5 = pkgEnum.eGameDifficulty.get(750);
		assertEquals(eGameDifficulty.MEDIUM, difficultyReturn5) ;
		
		eGameDifficulty difficultyReturn6 = pkgEnum.eGameDifficulty.get(1000);
		assertEquals(eGameDifficulty.HARD, difficultyReturn6) ;
		
		eGameDifficulty difficultyReturn7 = pkgEnum.eGameDifficulty.get(1001);
		assertEquals(eGameDifficulty.HARD, difficultyReturn7) ;
		}
}
