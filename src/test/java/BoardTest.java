import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    @Test
    void _ボードの大きさが縦3横3であること() {
        Board board = new Board(3,3);
        assertEquals(board.getWidth(), Integer.valueOf(3));
        assertEquals(board.getHeight(), Integer.valueOf(3));
    }

}
