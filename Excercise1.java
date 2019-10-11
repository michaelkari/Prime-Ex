import java.util.*;

class Excercise1
{
  public static void main ( String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int N,D;
    System.out.println("Please enter a positive integer");
    N=sc.nextInt();
    D=N;
    while(N<=0){
      System.out.println("Please enter a positive integer");
      N=sc.nextInt();
    }
    boolean result = prime( N,D );
    System.out.println("prime("+N+") is " + result );
  }
  
  public static boolean prime(int N,int D){

    if(D==1){
      return true;
    }
    if ( N%D == 0 &&D!=N){
      return false;
    }    
    else{
      System.out.println(N+"%("+(D-1)+")="+(N%(D-1)));
      return prime(N,D-1);
    }
  }
}


