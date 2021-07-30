import java.lang.Math;
import java.lang.Double;

public class LineLengths {
    public static double lineLengthCal(int x1, int x2, int y1, int y2) {
        double length=Math.ceil(Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)));
		return length;
    }
    public static void lineEqualsComp() {
        int x1,x2,y1,y2;
	    x1=2;y1=2;x2=4;y2=4;

        Double length1 = lineLengthCal(x1,x2,y1,y2);
		
		String l1=String.valueOf(length1); 
        System.out.println("Length of Line 1:" +l1);

        int p1, p2, q1, q2;
	    p1=1;q1=1;p2=4;q2=4;

        Double length2 = lineLengthCal(p1,p2,q1,q2);
			
		
		String l2=String.valueOf(length2);  
        System.out.println("Length of Line 2:" +l2);

        if (l1.equals(l2)){
            System.out.println("Both Lines are Equal");
        } 
        else {
            System.out.println("Lines are not Equal");
        }

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
    public static void main(String[] args) {
		
        lineEqualsComp();
        
	}
}