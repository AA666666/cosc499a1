
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);	
    

int n1;
int n2;
int as;
int ss;
int ms;


System.out.println("Enter the first integer number:");

n1=sc.nextInt();

System.out.println("Enter the second integer number:");
n2=sc.nextInt();

as=n1+n2;
ss=n1-n2;
ms=n1*n2;

System.out.println(n1+"+"+n2+"="+as);
System.out.println(n1+"-"+n2+"="+ss);
System.out.println(n1+"*"+n2+"="+ms);

}