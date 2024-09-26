//HASHMAP - CHAPPAL STAND / MALL MADHE PISHVI THEUN TOKEN GHENE 

//MAX FREQ

//ASKED IN INTERVIEWS

import java.util.*;

class program672
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        //to remove white spaces
        str = str.replaceAll(" ", "");


        char Arr[] = str.toCharArray();
                //WRAPPER CLASS
        HashMap <Character, Integer>hobj = new HashMap<Character, Integer>();   //Character = Key, Integer = Value

        int Frequency = 0;
        for(char ch : Arr)
        {
            if(hobj.containsKey(ch))
            {   
                Frequency = hobj.get(ch);
                hobj.put(ch, Frequency+1);
            }
            else
            {
                hobj.put(ch, 1);
            }
        }
        //to remove key. set is an array
        Set <Character> setobj = hobj.keySet();

        int iMax = 0;
        char ch = '\0';

        for(char data : setobj)
        {
            if(hobj.get(data) > iMax)
            {
                iMax = hobj.get(data);
                ch = data;
            }
        }

        System.out.println("Character "+ch + " occurs maximum number of time in string. ie : "+iMax+" times");

    }
}
