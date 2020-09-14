Import java.util.Scanner;
public class Primeno
{
  public static void main(String[] arg)
  {
    Scanner sc = new Scanner(System.in);
    int i,n,j=1;
    System.out.println('Enter a Number: ');
    n = sc.nextint();

    for(i = 2; i <= n; i++)
    {
      if(n % i == 0)
      {
        j=0;
        break;
      }
    }

  if( j == 1 )
  {
    System.out.println(n + ' is a Prime No ');
  }
  else
  {
    System.out.println(n + ' is NOT a prime no ');
  }
}
