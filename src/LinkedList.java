public class LinkedList {
     
    private Node <T> head ; 
    private Node <T> current ; 
    
    public LinkedList() {
        head = null ; 
    }
    
    // the basic methods 
    
    public boolean isEmpty(){
        if (head==null)
            return true ; 
        else
            return false;
    }
   
    //Not needed rn 
    
   /* public void insertFirst(int data){
        
        Node temp = new Node (data); 
        
        temp.next =head ;
        head=temp ;
        
    } */
    
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
    
    public void Remove(){
        
    }
            
            
            
            
}
