package tiy.pink;

/**
 * Created by jfabiano on 8/24/2016.
 */
public class ChocolateSolver
{
    public int makeChocolate(int small, int big, int goal)
    {
        int sizeOfBigBars = 5;
        int returnValue = 0;

        int numBigsNeeded = goal / sizeOfBigBars;
        int numSmallsNeeded = goal % sizeOfBigBars;
        int extraNeededSmallBars = goal - big * sizeOfBigBars;

        if (small >= 0 && big >= 0 && goal >= 0)
        {
            if (extraNeededSmallBars < 0)
            {
                if (small < numSmallsNeeded)
                {
                    returnValue = -1;
                }
                else if (small == numSmallsNeeded)
                {
                    returnValue = numSmallsNeeded;
                }
                else if (small > numSmallsNeeded)
                {
                    returnValue = numSmallsNeeded;
                }
            }
            else if (extraNeededSmallBars == 0)
            {
                if (small < numSmallsNeeded)
                {
                    returnValue = 0;
                }
                else if (small == numSmallsNeeded)
                {
                    returnValue = 0;
                }
                else if (small > numSmallsNeeded)
                {
                    returnValue = 0;
                }
            }
            else if (extraNeededSmallBars > 0)
            {
                if (small < extraNeededSmallBars)
                {
                    returnValue = -1;
                }
                else if (small == extraNeededSmallBars)
                {
                    returnValue = extraNeededSmallBars;
                }
                else if (small > extraNeededSmallBars)
                {
                    returnValue = extraNeededSmallBars;
                }
            }
        }
        else
        {
            returnValue = -1;
        }
        return returnValue;
    }
}



