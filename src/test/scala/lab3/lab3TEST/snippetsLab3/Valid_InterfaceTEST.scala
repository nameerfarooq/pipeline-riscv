package snippetsLab3
import chisel3._
import chisel3.util._
import org.scalatest._
import chiseltest._

class Valid_InterfaceTEST extends FreeSpec with ChiselScalatestTester{
    "valid interface test" in {
        test(new Valid_Interface()){c=>
        c.io.in.bits.poke(10.U)
        c.io.in.valid.poke(1.B)
        c.clock.step(100)
        c.io.out.bits.expect(10.U)
        c.io.out.valid.expect(1.B)
        }
    }
}