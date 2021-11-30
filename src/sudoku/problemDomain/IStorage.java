

package sudoku.problemDomain;

import java.io.IOException;

public interface IStorage {

    void updateGameDatat(SudokuGame game) throws IOException;
    SudokuGame getGameData() throws IOException;
    
       
}
