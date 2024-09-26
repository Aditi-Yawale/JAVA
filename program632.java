//GENERIC ROOT OF A NUMNER
//Add the digits till the answer is single digit

import java.util.*;

class program632
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Ente the number : ");
        int iNo = sobj.nextInt();
        int iDigit = 0;
        int iSum = 0;

        while(iNo >= 10)
        {
            while(iNo != 0)
            {
                iDigit = iNo % 10;
                iSum = iSum + iDigit;
                iNo = iNo / 10;
            }

            if(iSum >= 10)
            {
                iNo = iSum;
                iSum = 0;
            }
            else
            {
                iNo = iSum;
                break;
            }
        }

        System.out.println("Generic root is : "+iSum);

    }
}