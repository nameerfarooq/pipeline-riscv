package assignmentLab2
import chisel3._
import chisel3.util._
import org.scalatest._
import chiseltest._

class Mux5to1TEST extends FreeSpec with ChiselScalatestTester{
    "mux 5 to 1 test " in {
        test(new Mux5to1()){c=>
        c.io.s2.poke(1.B)
        c.io.s1.poke(0.B)
        c.io.s0.poke(0.B)
        c.clock.step(100)
        c.io.out.expect(32.U)
        }
    }
}