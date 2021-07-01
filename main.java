import java.util.Random;   
public class RandomNumberExample3  
{   
public static void main(String args[])   
{     
Random random = new Random();   
int x = random.nextInt(100);   
int y = random.nextInt(999);
   
System.out.println("Random Integers Values");  
System.out.println(x);   
System.out.println(y);   

double a = random.nextDouble();   
double b = random.nextDouble();   

System.out.println("Random Double Values");  
System.out.println(a);   
System.out.println(b);    

float f=random.nextFloat();  
float i=random.nextFloat();  

System.out.println("Random Float Values");  
System.out.println(f);   
System.out.println(i);   

long p = random.nextLong();   
long q = random.nextLong();   

System.out.println("Random Long Values");  
System.out.println(p);   
System.out.println(q);      

boolean m=random.nextBoolean();  
boolean n=random.nextBoolean();  

System.out.println("Random Boolean Values");  
System.out.println(m);   
System.out.println(n);   
}   
}  
