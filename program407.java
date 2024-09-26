class program406
{
    public static void main(String Arg[])
    {
        SinglyLL obj = new SinglyLL();
        
        obj.InsertFirst(101);  
        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.InsertLast(111);
        obj.InsertLast(121);
        obj.InsertLast(151);

        obj.Display();
    }
}

class node
{
    public int data;
    public node next;   
}

class SinglyLL
{
    public node First;
    public int iCount;

    public SinglyLL()
    {
        System.out.println("Object of SinglyLL gets created successfully");
        First = null;
        iCount = 0;
    }

    public void InsertFirst(int No)
    {   
        node newn = null;

        newn = new node();
        
        newn.data = No; //we use . as it is a reference - we cannot use -> as java does not have pointer nor address
        newn.next = null;

        if(First == null)
        {
            First = newn;
        }
        else
        {
            newn.next = First;
            First = newn;
        }

        iCount++;
    }

    public void Display()
    {
        System.out.println("Elements of linked list are : ");

        node temp = First;  //temporaray reference

        while(temp!=null)
        {
            System.out.print("| "+temp.data+" |->");
            temp = temp.next;
        }

        System.out.println(" null");
    }

    public void InsertLast(int No)
    {   
        node newn = null;
        node temp = null;

        newn = new node();
        
        newn.data = No; //we use . as it is a reference - we cannot use -> as java does not have pointer nor address
        newn.next = null;

        if(First == null)
        {
            First = newn;
        }
        else
        {
            temp = First;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newn;    
        }

        iCount++;
    }

}
