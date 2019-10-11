import java.util.*;

class Excercise2
{
  public static void main ( String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int N;
    System.out.println("Please enter a positive integer");
    N=sc.nextInt();
    while(N<=0){
      System.out.println("Please enter a positive integer");
      N=sc.nextInt();
    }
    int result = rabbit( N );
    System.out.println("rabbit("+N+") is " + result );
  }
  
  public static int rabbit(int N){
    if(N==1){
      return 1;
    }
    if(N==0){
      return 0;
    }
    if(N==-1){
      return 0;
    }
    if(N==-2){
      return 0;
    }
    else{
      return rabbit(N-1)+rabbit(N-2)-rabbit(N-4);
    }
  }
}


