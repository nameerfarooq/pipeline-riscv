package lab1
import chisel3._
import org.scalatest._
import chiseltest._

class CounterTest extends FreeSpec with ChiselScalatestTester{
    "test Counter" in{
        test(new Counter(4.U)){c=>
        c.clock.step(100)
        }
    }
}