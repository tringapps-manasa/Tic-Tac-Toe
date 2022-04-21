package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by ________
 */
public class TicTacToeTest {

    @Test
    public void simpleNoWinnerBoard() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("O...X.X.."));

        assertEquals(Evaluation.Xwins, TicTacToe.evaluateBoard("XXX...oo."));
        assertEquals(Evaluation.Xwins, TicTacToe.evaluateBoard("...Xxx.oo"));
        assertEquals(Evaluation.Xwins, TicTacToe.evaluateBoard("oo....xxx"));
        assertEquals(Evaluation.Xwins, TicTacToe.evaluateBoard("x..x..xoo"));
        assertEquals(Evaluation.Xwins, TicTacToe.evaluateBoard(".x..xoox."));
        assertEquals(Evaluation.Xwins, TicTacToe.evaluateBoard("..xoox..x"));
        assertEquals(Evaluation.Xwins, TicTacToe.evaluateBoard("x...x.oox"));
        assertEquals(Evaluation.Xwins, TicTacToe.evaluateBoard("..x.x.xoo"));
        assertEquals(Evaluation.InvalidInput, TicTacToe.evaluateBoard("O.."));
        assertEquals(Evaluation.InvalidInput, TicTacToe.evaluateBoard("O...X.X...."));
        assertEquals(Evaluation.UnreachableState, TicTacToe.evaluateBoard("Oooxxx..."));
        assertEquals(Evaluation.UnreachableState, TicTacToe.evaluateBoard("oxooxooxo"));

    }
}