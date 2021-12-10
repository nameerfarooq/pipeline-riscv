package lab2
import chisel3._
import chisel3.util._
import chiseltest._
import org.scalatest._

class Mux1h_4to1TEST extends FreeSpec with ChiselScalatestTester{
    "Mux1h_4to1 test " in {
    test( new Mux1h_4to1()){c=>
    c.io.in0.poke(10.U)
    c.io.in1.poke(20.U)
    c.io.in2.poke(30.U)
    c.io.in3.poke(40.U)
    c.io.sel.poke(3.U)
    c.clock.step(100)
    c.io.out.expect(30.U)
    }
    }
}