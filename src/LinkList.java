/**
 * 描述
 * @author yuanyinglai
 * @version 1.00 
 * @see 参考类1
* @Date 2016年5月25日 下午2:22:42
 */
public class LinkList {
	
	private Link first;

	/**
	 * @param first
	 */
	public LinkList() {
		this.first = null;
	}
	
	public boolean isEmpty(){
		return (first==null);
	}
	
	public void insertFirst(int id , double dd){
		Link newLink = new Link(id,dd);
		newLink.next = first;	
		first = newLink;
	}
	
	public Link deleteFirst(){
		Link temp = first;
		temp = first.next;
		return temp;
	}
	
	public void displayLink(){
		Link current =first;
		while(current !=null){
			current.displayLink();
			current = current.next;
		}
					
	}
	
	
	
	
}
