
import scala.annotation.tailrec;
import scala.io.StdIn

object tailRecursion {
  @tailrec def GCD(a:Int,b:Int):Int=
  {
    if(a==0)b;
    else GCD(b%a,a);
  }
  
  @tailrec def Factorial(a:Int,b:Int=1):Int=
  {
    if(a==1)b;
    else Factorial(a-1,b*a);
  }
  
  def calc(c:Int):Int=
  {
    var res:Int= -99;
    c match{
      case 1=>printf("Enter the number1 :");
              val n1=scala.io.StdIn.readInt();
              printf("Enter the number2 :");
              val n2=scala.io.StdIn.readInt();
              res = GCD(n1,n2);
      case 2=>printf("Enter the number :");
              val n=scala.io.StdIn.readInt();
              res = Factorial(n);              
    }
    return res;
  }
  def main(args:Array[String]){
    while(true){
      println("Type :-");
      println("1) to get GCD");
      println("2) to get Factorial");
      println("3) to Exit");
      print("Enter the choice : ");
      val ch:Int=scala.io.StdIn.readInt();
      if(ch==3)
        return;
      println("result = "+calc(ch));  
      println();
    }
  }
}