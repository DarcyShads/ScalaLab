package Car_Trait

trait Spec_Info {
  val Making_Year : Int
  val Kilometers_Run : Int
  
  def print_Spec_Info()
  {
    println(s"Making Year = $Making_Year");    
    println(s"Kilometers Run = $Kilometers_Run");    
  }
}