package tiy.pink;

/**
 * Created by jfabiano on 8/24/2016.
 */
public class StringReverser
{

    public String reverseString(String stringToReverse)
    {
        char[] stringCharacters = stringToReverse.toCharArray();
        String reversedString = "";
        for(int charIndex = stringCharacters.length-1;charIndex >= 0; charIndex--)
        {
            System.out.println(stringCharacters[charIndex]);
            reversedString += stringCharacters[charIndex];
        }
        return reversedString;
    }

}
