package lab1
import chisel3._
import org.scalatest._
import chiseltest._

class Task2test extends FreeSpec with ChiselScalatestTester{
    "Task 2 Counter" in{
        test(new Task2(4.U)){c=>
        c.clock.step(100)
        }
    }
}