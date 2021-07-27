import java.lang.Math;
import java.lang.Double;

public class lineLengths {
    public static void main (String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        
        //UC1
        int x1,x2,y1,y2;
	    x1=2;y1=2;x2=4;y2=4;
	    double length1=Math.ceil(Math.sqrt((x2-x1)^2 + (y2-y1)^2));
        System.out.println("Length of Line 1:" +length1);

        //UC2
        int p1, p2, q1, q2;
	    p1=1;q1=1;p2=4;q2=4;
	    double length2=Math.ceil(Math.sqrt((p2-p1)^2 + (q2-q1)^2));
        System.out.println("Length of Line 2:" +length2);

        String l1=String.valueOf(length1);  
	    String l2=String.valueOf(length2); 

        if (l1.equals(l2)){
            System.out.println("Both Lines are Equal");
        } 
        else {
            System.out.println("Lines are not Equal");
        }
        
        //UC3
        Double x = length1;
        Double y = length2;

        int comparison = x.compareTo(y);

        if (comparison == 0) {
            System.out.println("Lengths are Equal");
        }
        else if (comparison < 0) {
            System.out.println("Length2 is Greater than Length1");
        }
        else {
            System.out.println("Length1 is Greater than Length2");
        }
	}
}