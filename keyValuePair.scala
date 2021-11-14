

object keyValuePair {
  def main(args: Array[String]): Unit = {
    val keyValue:Map[String,Int]=Map("Bill"->56,
                                     "Jonny"->87,
                                     "Tommy"->11,
                                     "Cheena"->13);
    val SortedKV = keyValue.toSeq.sortBy(_._1)(Ordering.String.reverse).toMap;
    for(i<-SortedKV)
      println(i._1+" "+i._2);
  }
}