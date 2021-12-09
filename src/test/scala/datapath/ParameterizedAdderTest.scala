package taskslab5
import org.scalatest._
import chiseltest._
import chisel3._

class ParameterizedAdderTest extends FreeSpec with ChiselScalatestTester{
    "Adder_param" in  {
            test(new ParameterizedAdder(32)){c=>
            c.io.in_0.poke(12.U)
            c.io.in_1.poke(4.U)
            c.clock.step(100)
            c.io.sum2.expect(16.U)
            }
        }
}