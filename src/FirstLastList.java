/**
 * 描述
 * @author yuanyinglai
 * @version 1.00 
 * @see 参考类1
* @Date 2016年5月25日 下午3:14:22
 */
public class FirstLastList {
	private Link first;
	private Link last;
	
	public FirstLastList(){
		first = null;
		last = null;
	}
	
	public boolean isEmpty(){
		return first==null;
	}
	
    public void insertFirst(int dd){
    	Link newLink = new Link(dd);
    	if(isEmpty()){
    		last = newLink;
    		newLink.next=first;
    		first = newLink;
    	}else{
    		
    	}
    } 
    
    public void insertLast(int dd){
    	Link newLink = new Link(dd);
    	if(isEmpty()){
    		first = newLink;
    	}else{
    		last.next = newLink;
    		last = newLink;
    	}
    }
    
    public void displayList(){
    	Link current = first;
    	while(current !=null){
    		current.displayLink();
    		current = current.next;
    	}
    }
	
}
