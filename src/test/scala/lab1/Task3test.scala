package lab1
import chisel3._
import org.scalatest._
import chiseltest._

class Task3test extends FreeSpec with ChiselScalatestTester{
    "Counter3test" in{
        test(new Task3(8,255)){c=>
        c.clock.step(100)
        }
    }
}