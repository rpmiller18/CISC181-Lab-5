package pkgEnum;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public enum eGameDifficulty {
	
	EASY(100), MEDIUM(500), HARD(1000);

	private int iDifficulty;
	
	eGameDifficulty(int iDifficulty) {
		this.iDifficulty=iDifficulty;
	}
	
	public static eGameDifficulty get(int iDifficulty) {
		eGameDifficulty difficultyReturn = null;
		for (eGameDifficulty difficulty: eGameDifficulty.values()) {
			if (difficulty.iDifficulty <= iDifficulty) {
				difficultyReturn = difficulty;
			}
		}
		return difficultyReturn;
		
	}
	
	public int getiDifficulty() {
		return iDifficulty;
	}
	
	private static Map<Integer, eGameDifficulty> difficulty = new HashMap<Integer, eGameDifficulty>();
	static {
		difficulty.put(100, eGameDifficulty.EASY);
		difficulty.put(500, eGameDifficulty.MEDIUM);
		difficulty.put(1000, eGameDifficulty.HARD);
		}	
	
}
