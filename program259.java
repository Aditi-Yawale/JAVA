//Display one letter at a time

import java.util.*;

class program259
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter your name : ");
        
        String name = sobj.nextLine();

        int i = 0;

        for(i = 0; i < name.length(); i++)
        {
            System.out.println(name.charAt(i));
        }

        //charAt =  INBUILT FUNC TO DO THIS
    
    }
}