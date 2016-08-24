package tiy.pink;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jfabiano on 8/24/2016.
 */
public class ChocolateSolverTest {
    ChocolateSolver solver;
    @Before
    public void setUp() throws Exception
    {
        solver = new ChocolateSolver();
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void testEnoughSmallsNoBigs() throws Exception
    {
        int numSmalls = solver.makeChocolate(7, 0, 7);
        assertEquals(7, numSmalls);
    }
    @Test
    public void testNoSmallsEnoughBig() throws Exception
    {
        int numSmalls = solver.makeChocolate(0, 2, 10);
        assertEquals(0, numSmalls);
    }
    @Test
    public void testEnoughSmallsTooManyBigs() throws Exception
    {
        int numSmalls = solver.makeChocolate(25, 7, 25);
        assertEquals(0, numSmalls);
    }@Test
    public void testEnoughSmallsEnoughBigs() throws Exception
    {
        int numSmalls = solver.makeChocolate(105, 21, 105);
        assertEquals(0, numSmalls);
    }@Test
    public void testNoSmallsNoBigs() throws Exception
    {
        int numSmalls = solver.makeChocolate(0, 0, 2);
        assertEquals(-1, numSmalls);
    }@Test
    public void testNoSmallsTooManyBigs() throws Exception
    {
        int numSmalls = solver.makeChocolate(0, 8, 33);
        assertEquals(-1, numSmalls);
    }@Test
    public void testNoSmallsTooFewBigs() throws Exception
    {
        int numSmalls = solver.makeChocolate(0, 11, 70);
        assertEquals(-1, numSmalls);
    }@Test
    public void testTooManySmallsNoBigs() throws Exception
    {
        int numSmalls = solver.makeChocolate(12, 0, 7);
        assertEquals(7, numSmalls);
    }@Test
    public void testTooManySmallsTooFewBigs() throws Exception
    {
        int numSmalls = solver.makeChocolate(12, 1, 9);
        assertEquals(4, numSmalls);
    }@Test
    public void testTooManySmallsTooManyBigs() throws Exception
    {
        int numSmalls = solver.makeChocolate(76, 16, 63);
        assertEquals(3, numSmalls);
    }@Test
    public void testTooManySmallsEnoughBigs() throws Exception
    {
        int numSmalls = solver.makeChocolate(100, 16, 80);
        assertEquals(0, numSmalls);
    }@Test
    public void testTooFewSmallsNoBigs() throws Exception
    {
        int numSmalls = solver.makeChocolate(6, 0, 7);
        assertEquals(-1, numSmalls);
    }@Test
    public void testTooFewSmallsTooFewBigs() throws Exception
    {
        int numSmalls = solver.makeChocolate(5, 2, 17);
        assertEquals(-1, numSmalls);
    }@Test
    public void testTooFewSmallsTooManyBigs() throws Exception
    {
        int numSmalls = solver.makeChocolate(1, 20, 38);
        assertEquals(-1, numSmalls);
    }@Test
    public void testTooFewSmallsEnoughBigs() throws Exception
    {
        int numSmalls = solver.makeChocolate(12, 9, 45);
        assertEquals(0, numSmalls);
    }@Test
    public void testEnoughSmallsTooFewBigs() throws Exception
    {
        int numSmalls = solver.makeChocolate(13, 2, 13);
        assertEquals(3, numSmalls);
    }
    @Test
    public void testNegativeSmallsPositiveBigs() throws Exception
    {
        int numSmalls = solver.makeChocolate(-13, 2, 13);
        assertEquals(-1, numSmalls);
    }
    @Test
    public void testNegativeSmallsNegativeBigs() throws Exception
    {
        int numSmalls = solver.makeChocolate(-5, -12, 56);
        assertEquals(-1, numSmalls);
    }
    @Test
    public void testPositiveSmallsNegativeBigs() throws Exception
    {
        int numSmalls = solver.makeChocolate(9, -120, 401);
        assertEquals(-1, numSmalls);
    }
    @Test
    public void ExtraTest() throws Exception
    {
        int numSmalls = solver.makeChocolate(6, 1, 10);
        assertEquals(5, numSmalls);
    }
    @Test
    public void ExtraTestTwo() throws Exception
    {
        int numSmalls = solver.makeChocolate(6, 1, 11);
        assertEquals(6, numSmalls);
    }

}