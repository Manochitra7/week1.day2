package javaAssignment;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator actions= new Calculator();
int sum= actions.add(5, 3,4);
int dif= actions.sub(5, 3);
double mul= actions.multiply(5, 3);
float div= actions.division(4, 2);
System.out.println("Addition = "+ sum);
System.out.println("subtraction= " + dif);
System.out.println("multiplication= "+ mul);
System.out.println("division= "+ div);
	}

}
