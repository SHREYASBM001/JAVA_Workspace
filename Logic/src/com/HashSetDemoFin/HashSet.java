public class HashSet {
	private Node[] a;
	private int count=0;
	
	HashSet(){
		a=new Node[10];
	}
	
	public boolean add(Object key){
		int index=hash(key);
		if(a[index]==null){
			a[index]=new Node(key,null);
			count++;
			return true;
		}
		Node curr=a[index];
		Node prev=null;
		while(curr!=null){
			if(curr.key.equals(key)){
				return false;
			}
			prev=curr;
			curr=curr.next;
		}
		prev.next=new Node(key,null);
		count++;
		return true;
	}
	public void display(){
		for(int i=0;i<a.length;i++){
			Node curr=a[i];
			while(curr!=null){
				System.out.println(curr.key);
				curr=curr.next;
			}
			
		}
		
	}
	
	public int size(){
		return count;
	}
	public int hash(Object key){
		return key.hashCode()%a.length;
	}
	
}