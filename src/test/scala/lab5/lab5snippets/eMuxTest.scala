package lab5snippets
import chisel3._
import chisel3.util
import org.scalatest._
import chiseltest._

class eMuxTest extends FreeSpec with ChiselScalatestTester{
    "e mux test" in {
        test(new eMux(SInt(32.W))){c=>
        c.io.in1.poke(20.S)
        c.io.in2.poke(10.S)
        c.io.sel.poke(1.B)
        c.clock.step(100)
        c.io.out.expect(20.S)
        }
    }
}
