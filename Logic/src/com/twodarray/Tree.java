public class Tree {
	private Node root=null;
	private int count=0;
	private prevcount=0;
	
	public boolean add(int key){
		if(root==null){
			root=new Node(key);
			prev=count;
			count++;
			return prevcount=count+1;
		}
		Node curr=root;
		Node prev=null;
		while(curr!=null) {
			if(key<curr.key){
				prev=curr;
				curr=curr.left;
			}
			else if(key>curr.key){
				prev=curr;
				curr=curr.right;
			}
			else {
				return prevcount=count+1;
			}
			
		}
		if(key<prev.key){
				prev.left=new Node(key);
			}
			else {
				prev.right=new Node(key);
			}
		
		
	}
	public void display(){
		
	}
	
}
