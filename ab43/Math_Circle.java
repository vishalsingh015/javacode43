package ab43;

public class Math_Circle {
final static double pi = Math.PI;
public static void main(String[] args) {
	for(int i=0;i<10;i++)
	{
	double r = Math.random();
	System.out.println("Radius "+r);
	double area = pi*r*r;
	System.out.println("Area of circle with iteration" +i+" value is "+area);
	}
}

}
