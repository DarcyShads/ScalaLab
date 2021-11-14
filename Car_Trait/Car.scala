package Car_Trait

class Car extends Init_Info with Spec_Info
{
  val Making_Year=2001
  val Kilometers_Run=20000
  
  def print_init_info()
  {
    println(s"Model No = $Model_No");    
    println(s"Company Name = $Company_Name");
    println(s"Fuel Capacity = $Fuel_Capacity");    
  }
}