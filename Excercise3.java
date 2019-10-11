import java.util.*;

class Excercise3
{
  public static void main ( String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int N,D;
    System.out.println("Please enter the first positive integer");
    N=sc.nextInt();
    while(N<=0){
      System.out.println("Please enter the first positive integer");
      N=sc.nextInt();
    }
    System.out.println("Please enter the second positive integer");
    D=sc.nextInt();
    while(D<=0){
      System.out.println("Please enter the second positive integer");
      D=sc.nextInt();
    }
    int result = gcd( N,D );
    System.out.println("gcd("+N+","+D+") is " + result );
  }
  
  public static int gcd(int N,int D){
    if(N==0){
      return D;
    }
    else{
      return gcd((D%N),N);
    }
  }
}


