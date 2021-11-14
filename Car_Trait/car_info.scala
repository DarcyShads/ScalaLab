package Car_Trait

object car_info {
  def main(args: Array[String])
  {
    var obj = new Car();
    obj.print_init_info();
    obj.print_Spec_Info();
    obj = new Car2();
    obj.print_init_info();
    obj.print_Spec_Info();
  }
}