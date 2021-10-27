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
            val branch = 1.B
            val arg_x = Random.nextLong() & 0xFFFFFFFFL
            val arg_y = Random.nextLong() & 0xFFFFFFFFL
            
            val output = func3 match{
                case "b000" => if(arg_x === arg_y) 1.B else 0.B   
                case "b001" => if(arg_x != arg_y) 1.B else 0.B
                case "b100" => if(arg_x < arg_y) 1.B else 0.B  
                case "b101" => if(arg_x >= arg_y) 1.B else 0.B
                case "b110" => if(arg_x < arg_y) 1.B else 0.B        
                case "b111" => if(arg_x >= arg_y) 1.B else 0.B        
                case _=> 0.B           
        }
        c.io.func3.poke(func3.U)
        c.io.branch.poke(branch)
        c.io.arg_x.poke(arg_x.S)
        c.io.arg_y.poke(arg_y.S)
        c.clock.step(100)
        c.io.br_taken.expect(output)
        
    }
    }

}
}