package lab3Assignment
import chisel3._
import chisel3.util._
import org.scalatest._
import chiseltest._

class Decoder2to4ValidTEST extends FreeSpec with ChiselScalatestTester{
    "decoder 2 to 4 Valid test" in {
        test(new Decoder2to4Valid()){c=>
        c.io.in.poke(2.U)
        c.clock.step(100)
        c.io.out.bits.expect(4.U)
        c.io.out.valid.expect(1.B)
        }
    }
}