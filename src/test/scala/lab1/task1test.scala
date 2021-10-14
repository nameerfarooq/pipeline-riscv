package lab1
import chisel3._
import org.scalatest._
import chiseltest._

class task1test extends FreeSpec with ChiselScalatestTester{
    "test Counter" in{
        test(new Task1(4.U)){c=>
        c.clock.step(100)
        }
    }
}