
import scala.collection.mutable.ArrayBuffer
object StructureMerge {
  def main(args: Array[String]): Unit = {
    val a:Array[Double]=Array(99.5,100.0,50.0,55.0,70.0,100.0,-1.0);
    val b:ArrayBuffer[Double]=ArrayBuffer(10.0,20.0,30.0,40.0,50.0);
    val c = a ++ b;
    println("max="+c.max);
    println("min="+c.min);
  }
}