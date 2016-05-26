/**
 * 描述
 * @author yuanyinglai
 * @version 1.00 
 * @see 参考类1
* @Date 2016年5月25日 下午2:20:11
 */
public class Link {

	public int iData;
	public double dData;
	public Link next;
	
	public Link(int dd){
		dData = dd;
	}
	
	public Link(int iData, double dData) {
		super();
		this.iData = iData;
		this.dData = dData;
	}
	
	public void displayLink(){
		System.out.print("iData:"+iData);
	}
	
	
}
