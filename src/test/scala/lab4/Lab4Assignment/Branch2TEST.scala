package Lab4Assignment
import chisel3._
import chisel3.util
import org.scalatest._
import chiseltest._
import chiseltest.experimental.TestOptionBuilder._
import chiseltest.internal.VerilatorBackendAnnotation
import scala.util.Random

class Branch2TEST extends FreeSpec with ChiselScalatestTester{
    "branch 2 auto test 1" in {
        test(new Branch2){c=>
        val array_func3 = Array( "b000","b001","b100","b101","b110","b111" )
        for ( i <- 0 until 100) {
            val opr = Random.nextInt(5)
            val func3 = array_func3(opr)
            val branch =  Random.nextBoolean()
       
            val arg_x = Random.nextLong() & 0xFFFFFFFFL
            val arg_y = Random.nextLong() & 0xFFFFFFFFL
            var output = 1
            if(branch===true){
                 output = func3 match{
                case "b000" => if(arg_x === arg_y) 1 else 0   
                case "b001" => if(arg_x != arg_y) 1 else 0
                case "b100" => if(arg_x < arg_y) 1 else 0  
                case "b101" => if(arg_x >= arg_y) 1 else 0
                case "b110" => if(arg_x < arg_y) 1 else 0        
                case "b111" => if(arg_x >= arg_y) 1 else 0        
                case _=> 0         
        }}else{
             output = 0
        }
                println("helllllllllllllllllllllllo")

        println("branch",branch)
        println("arg x",arg_x)
        println("arg y",arg_y)
        println("func3",func3)
         println("output",output)
        c.io.func3.poke(func3.U)
        c.io.branch.poke(branch.B)
        c.io.arg_x.poke(arg_x.S)
        c.io.arg_y.poke(arg_y.S)
        c.clock.step(1)
   if(branch == true && output == 1) c.io.br_taken.expect(1.B)  else c.io.br_taken.expect(false.B)
        
        
    }
    
    }

}
}

