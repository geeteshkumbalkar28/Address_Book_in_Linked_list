import javax.xml.crypto.Data;
import java.util.Date;

public class Linkedlist <T>
{
    public Node head;
    public int count;

    Linkedlist()
    {
        this.head=null;
        this.count=0;
    }
    public <T>void InsertFirst(T data)
    {
        Node newn = new Node();
        newn.data =  data;
        newn.next = null;

        if(head == null)
        {
            head = newn;
        }
        else
        {
            newn.next=head;
            head=newn;
        }
        count++;
    }
    public int countNode()
    {
        return count;
    }
//    public void getData(int pos)
//    {
//        Node temp = head;
//        for(int counter = 1; counter<=pos; counter++)
//        {
//
//                temp = temp.next;
//        }
//
//    }
//
//    public  void display()
//    {
//        Node temp = head;
//        while(temp.next != null)
//        {
//
//        }
//    }


}
class Node <T>
{
    T data;
    Node next;
}

