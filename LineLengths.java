import java.lang.Math;
public class LineLengthsUC1 {
    public static void main (String arg[]) {
        System.out.println("Welcome to Line Comparison Computation Program");
        
        int x1,x2,y1,y2;
        double Length;
	    x1=2;y1=2;x2=4;y2=4;
	    Length=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("Distance Between Two Lines" +Length);
	}
}