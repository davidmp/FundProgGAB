import java.util.Scanner
class AlgoritmosScala{

  val sc=new Scanner(System.in)
  def tablaMultiplicar1a8(){
    for(i<-1 to 8){
      for(j<-1 to 10){
        println(i+"x"+j+"="+i*j)
      }
      print("\n")
    }
  }


}


object HelloWorld{

val obj=new AlgoritmosScala()

  def main(args: Array[String]): Unit = {
    println("Hello, world! DMP Prueba")
    obj.tablaMultiplicar1a8()
  }
}