package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoardTest {
    private Board board;
    private Square square;
    private Square[][] squares2DArray;
    @BeforeEach
    void setUp() {
        square = new BasicSquare();
    }
    @Test
    void testBoard() {
        squares2DArray = new Square[1][1];
        squares2DArray[0][0] = square;
        board = new Board(squares2DArray);
        assertThat(board.squareAt(0, 0)).isNotNull();
    }
}
