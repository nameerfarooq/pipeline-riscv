package lab2
import chisel3._
import chisel3.util._
import org.scalatest._
import chiseltest._

class LM_IO_InterfaceTEST extends FreeSpec with ChiselScalatestTester{
    "LM_IO_Interface test " in {
        test(new LM_IO_Interface()){c=>
        c.io.data_in(0).poke(10.U)
        c.io.data_in(1).poke(20.U)
        c.io.data_in(2).poke(30.U)
        c.io.data_in(3).poke(40.U)
        c.io.data_selector.poke(0.U)
        c.io.addr.poke(5.U)
        c.io.wr_en.poke(1.B)
        c.clock.step(100)
        c.io.data_out.expect(10.U)
        }
    }
}