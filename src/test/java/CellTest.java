import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CellTest {
    Cell cell = new Cell(2,1);

    @Test
    void _セルが死んでいる() {
        assertFalse(cell.isAlive());
    }

    @Test
    void _セルが生きている() {
        cell.live();
        assertTrue(cell.isAlive());
    }

    @Test
    void _セルを死なせる() {
        cell.live();
        cell.kill();
        assertFalse(cell.isAlive());
    }

    @Test
    void _セルの縦の位置が2で横の位置が1であること() {
        assertEquals(cell.getX(), Integer.valueOf(2));
        assertEquals(cell.getY(), Integer.valueOf(1));
    }

}
