public class LineLengths {
    public static void main (String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        
        //UC1
        int x1,x2,y1,y2;
	    x1=2;y1=2;x2=4;y2=4;
	    double Length1=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("Length of Line 1:" +Length1);

        //UC2
        int p1, p2, q1, q2;
	    p1=1;q1=1;p2=4;q2=4;
	    double Length2=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("Length of Line 2:" +Length2);

        if (Length1 == Length2){
            System.out.println("Both Lines are Equal");
        } 
        else {
            System.out.println("Lines are not Equal");
        }
        
        //UC3
        if (Double.compare(Length1, Length2) == 0) {
            System.out.println("Both Lines are Equal");
        }
        else if (Double.compare(Length1, Length2) < 0) {
            System.out.println("Length1 is Less than Length2");
        }
        else {
            System.out.println("Length2 is greater than Length1");
        }   
	}
}