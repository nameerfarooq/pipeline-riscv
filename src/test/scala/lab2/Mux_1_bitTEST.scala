package lab2
import chisel3._
import org.scalatest._
import chiseltest._

class Mux_1_bitTEST extends FreeSpec with ChiselScalatestTester{
    "MUX 1 Bit test 1" in {
        test(new Mux_1_bit()){c=>
        c.io.sel.poke(0.B)
        c.io.in_A.poke(1.U)
        c.io.in_B.poke(0.U)

        c.clock.step(1)

        c.io.out.expect(0.U)
        
        }
    }

    "MUX 1 Bit test 2" in {
        test(new Mux_1_bit()){c=>
        c.io.sel.poke(1.B)
        c.io.in_A.poke(0.U)
        c.io.in_B.poke(1.U)

        c.clock.step(1)

        c.io.out.expect(0.U)
        
        }
    }
    
}