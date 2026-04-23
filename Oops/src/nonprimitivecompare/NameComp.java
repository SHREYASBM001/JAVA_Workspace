package nonprimitivecompare;
import java.util.*;
public class NameComp implements Comparator {
@Override
public int compare(Object o1,Object o2) {
	Empp e1=((Empp)o1);
	Empp e2=((Empp)o2);
	return e1.name.compareTo(e2.name);
}
}
