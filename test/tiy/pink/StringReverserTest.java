package tiy.pink;

import static org.junit.Assert.*;

/**
 * Created by jfabiano on 8/24/2016.
 */
public class StringReverserTest {
    StringReverser reverse;
    @org.junit.Before//annotation
    public void setUp() throws Exception
    {
        reverse = new StringReverser();
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void reverseStringTest() throws Exception {
        String sampleString = "something";
        String reverseString = reverse.reverseString(sampleString);
        System.out.println(reverseString);
        assertEquals("gnihtemos", reverseString);
    }

}