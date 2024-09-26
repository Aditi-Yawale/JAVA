//HASHMAP - CHAPPAL STAND / MALL MADHE PISHVI THEUN TOKEN GHENE 

//FREQUENCY OF EACH ALPHABET IN A STRING TAKEN FROM USER

//ASKED IN INTERVIEWS

//IM GETTING NULL HERE - FAULTY - SOLVED YEAHHH
import java.util.*;

class program670
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

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

        for(char data : setobj)
        {
            System.out.println(data +" occurs  "+hobj.get(data)+" times");
        }

    }
}
