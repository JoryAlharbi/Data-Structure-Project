
public class LinkedList <T>{
    
    private Node <T> head ; 
    private Node <T> current ; 
    
    public LinkedList() {
        head= current = null ; 
    }
    
    // the basic methods 
    
    public boolean isEmpty(){
        if (head==null)
            return true ; 
        else
            return false;
    }
    
    public boolean Full(){
        return false ; //linked list is never full
    }
    
    public boolean Last(){
        if (current.next==null)
            return true ; 
        else
            return false ;
        
    }
    
    public void FindNext(){
        current=current.next ;
    }
    
    public void Update(T d){
    current.Data=d ;
    }
    
    public T Retrive(){
        return current.Data;
    }
    
    
   public void FindFirst() {
       current = head ;
       
    }
   
    public void Remove(){
        
        if (current==head)
        {
            head= head.next ; 
            current=current.next ;
        }
        
        else {
            
            Node <T> p = head ;
            while (p.next != current)
                p=p.next ;
            
            p.next = current.next ;
        }
        
         if (current.next != null)
            current = current.next ;
        else
            current=head ;
        
       
    }

    public void Insert(T data){
        Node <T> temp=new Node <T> (data); 
        
        if (head==null){
            head=temp ; 
            current=head ;
        }
        
        else {
            temp.next= current.next ;
            current.next=temp ; 
            current= temp ;
        }
        
    }
            
}
