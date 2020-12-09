
  import java.io.PrintWriter

  object RevDemo1 {

    /*
     * Complete the simpleArraySum function below.
     */
    def simpleArraySum(ar: Array[Int]): Int = {
      var res  = 0;
      var i = 0;
      while(i < ar.length){
        res += ar(i);
        i += 1;
      }
      return res;
    }

    def main(args: Array[String]) {
      val stdin = scala.io.StdIn



      val arCount = stdin.readLine.trim.toInt

      val ar = stdin.readLine.split(" ").map(_.trim.toInt)
      val result = simpleArraySum(ar)


      System.out.println(result)


    }
  }


