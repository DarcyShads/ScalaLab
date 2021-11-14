object ListFun
{

	def main(args:Array[String])
	{
		var lis = List(1,2,3,3,3,4,1,3,2,5,6,5,5,7);
		
		println("list without duplicates :-");
		for(i<-lis.distinct)
		  println(i);
		var k = scala.io.StdIn.readInt();
		println("index of k :"+lis.indexOf(k));
		var i = scala.io.StdIn.readInt();
		println("index of k :"+lis.indexOf(k,i));
		println("length :"+lis.length);
		println("sorted list:"+lis.sorted);
		println("sum of the list : "+lis.sum);
		println("string of the list : "+lis.toString);
		println("max element : "+lis.max);
		println("min element : "+lis.min);
    k = scala.io.StdIn.readInt();
		println("index of k :"+lis.lastIndexOf(k));
		i = scala.io.StdIn.readInt();
		println("index of k :"+lis.lastIndexOf(k,i));
		println("Map of list:");
		for(i<-(lis zip lis.sorted).toMap)
		  println(i);
	}
}