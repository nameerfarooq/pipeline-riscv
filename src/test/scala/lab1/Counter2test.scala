package lab1
import chisel3._
import org.scalatest._
import chiseltest._

class Counter2test extends FreeSpec with ChiselScalatestTester{
    "Counter2test" in{
        test(new Counter2(8,255.U)){c=>
        c.clock.step(100)
        }
    }
}