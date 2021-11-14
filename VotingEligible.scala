

object VotingEligible
{
  def main(args:Array[String])
  {
    printf("Enter the age : ");
    val age = scala.io.StdIn.readInt();
    
    printf("Enter the Gender(M/F) : ");
    val gen = scala.io.StdIn.readChar();
    
    var isEligible=()=>gen match
    {
      case 'M'=>age>=21
      
      case 'F'=>age>=18
    }
    
   if(isEligible())
     println("Person is Eligible");
   else
    	 println("Person is Not Eligible");
  }
}