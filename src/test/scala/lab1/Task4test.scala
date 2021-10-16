package lab1
import chisel3._
import org.scalatest._
import chiseltest._
class Task4test extends FreeSpec with ChiselScalatestTester{
    "Task 4 test" in{
        test(new Task4(5)){c=>
        c.clock.step(20)
        }
    }
}