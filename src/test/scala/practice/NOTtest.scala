package practice
import chisel3._
import chiseltest._
import org.scalatest._


class NOTtest extends FreeSpec with ChiselScalatestTester{
    "NOT Gate test 1" in {
        test(new NOT()){ c=>
        c.io.a.poke(0.U)
        c.clock.step(1)
        c.io.output.expect(1.U)
        }
    }
    "NOT Gate test 2" in {
        test(new NOT()){ c=>
        c.io.a.poke(1.U)
        c.clock.step(1)
        c.io.output.expect(0.U)
        }
    }
}