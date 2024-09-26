//BASIC LINKED LIST FROM COLLECTIONS IN JAVA

import java.util.*;

class program645
{
    public static void main(String Arg[]) 
    {
        LinkedList <Integer>lobj = new LinkedList<Integer>();   //WE CAN WRITE ANY CLASS NAME IN PLACE OF INTEGER

        lobj.add(11);   //INSERTLAST
        lobj.add(21);
        lobj.add(51);
        lobj.add(101);

        System.out.println(lobj);   //DISPLAY

        System.out.println("Number of elements : "+lobj.size());    //COUNT

        for(int no : lobj)
        {
            System.out.println(no); //FOR EACH LOOP
        }

    }

}