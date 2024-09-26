//to convert string to character array - use function toCharArray()

import java.util.*;

class program261
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name : "); 
        String name = sobj.nextLine();

        char Arr[] = name.toCharArray();

        int i = 0;
        System.out.println("Array length is : "+Arr.length);        //length = property
        System.out.println("String length is : "+Arr.length());     //lrngth = method
        
        //NO CIRCULAR BRACKET FOR LENGTH IN CASE OF ARRAY;
        //  ( ) IN CASE OF STRING AS STRING IS AN OBJECT AND U HAVE TO CALL THE METHOD
    }
}