package nonprimitivecompare;
import java.util.*;
public class SalComp implements Comparator {

	@Override
	public int compare(Object o1,Object o2) {
		Empp e1=((Empp)o1);
		Empp e2=((Empp)o2);
		
		if(e1.sal>e2.sal) return 1;
		if(e1.sal<e2.sal) return -1;
		return 0;
	}

}
