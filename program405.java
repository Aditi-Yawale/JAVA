class program405
{
    public static void main(String Arg[])
    {
        SinglyLL obj = new SinglyLL();
        
        obj.InsertFirst(101);  
        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

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

    SinglyLL()
    {
        System.out.println("Object of SinglyLL gets created successfully");
        First = null;
        iCount = 0;
    }

    public void InsertFirst(int No)
    {   
        node newn = null;

        newn = new node();
        
        newn.data = No; //we use . at it is a reference - we cannot use -> as java does not have pointer
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
}
