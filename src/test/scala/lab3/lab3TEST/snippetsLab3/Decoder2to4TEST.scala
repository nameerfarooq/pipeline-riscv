package snippetsLab3
import chisel3._
import chisel3.util._
import org.scalatest._
import chiseltest._

class Decoder2to4TEST extends FreeSpec with ChiselScalatestTester{
    "decoder 2 to 4 test" in {
        test(new Decoder2to4()){c=>
        c.io.in.poke(2.U)
        c.clock.step(100)
        c.io.out.expect(4.U)
        }
    }
}