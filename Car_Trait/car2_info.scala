package Car_Trait

trait car2_info {
  var Model_No : String = "AC1243ST56445";
  var Company_Name : String = "Maruti"
  var Fuel_Capacity : Double = 50.5
  val Making_Year : Int
  val Kilometers_Run : Int
  
  def print_Spec_Info()
  {
    println(s"Making Year = $Making_Year");    
    println(s"Kilometers Run = $Kilometers_Run");    
  }
  
  def print_init_info
}