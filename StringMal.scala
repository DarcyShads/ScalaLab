object StringMal {
  def main(args: Array[String]): Unit = {
    val s:String=scala.io.StdIn.readLine();
    val l = s.length();
    var News:String="";
    if(l<4)
      News=s.toUpperCase();
    else
      News=s.substring(0,l-4)+s.substring(l-4).toUpperCase()
    println(News);
  }
}