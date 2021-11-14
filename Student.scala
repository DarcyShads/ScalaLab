object Student 
{
  def main(args:Array[String]) 
  {
     val names= List("Rohan", "Andreas", "Rob", "John")
     println( "Head of names array : " + names.head )
     println( "Tail of names array : " + names.tail )
     println( "Check if names is empty : " + names.isEmpty )
     println( "All element of names except last : " + names.init )
     println( "sorted names : " + names.sorted )
     println( "Array of names list : ")
     for(i<- names.toArray)
     println( i )
   }
}
