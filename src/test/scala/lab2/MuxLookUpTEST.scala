package lab2
import chisel3._
import chisel3.util._
import chiseltest._
import org.scalatest._

class MuxLookUp8to1TEST extends FreeSpec with ChiselScalatestTester{
    "muxlookup 8 to 1 test" in {
        test(new MuxLookUp8to1()){c=>
        c.io.in0.poke(10.U)
        c.io.in1.poke(20.U)
        c.io.in2.poke(30.U)
        c.io.in3.poke(40.U)
        c.io.in4.poke(50.U)
        c.io.in5.poke(60.U)
        c.io.in6.poke(70.U)
        c.io.in7.poke(80.U)
        c.io.sel.poke(1.U)
        c.clock.step(100)
        c.io.out.expect(20.U)
        }
    }
}