import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameOfLifeTest {

    @Test
    void _縦5横5のボードが作成されること() {
        Board board = GameOfLife.createBoard(5, 5);
        assertEquals(board.getWidth(), Integer.valueOf(5));
        assertEquals(board.getHeight(), Integer.valueOf(5));
    }

}
