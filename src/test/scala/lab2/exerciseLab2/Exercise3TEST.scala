package exerciseLab2
import chisel3._
import chisel3.util._
import chiseltest._
import org.scalatest._

class Exercise3TEST extends FreeSpec with ChiselScalatestTester{
    "Mux1h_4to1 test " in {
    test( new Exercise3()){c=>
    c.io.in3.poke(1.B)
    c.io.in2.poke(0.B)
    c.io.in1.poke(0.B)
    c.io.in0.poke(0.B)
    c.clock.step(100)
    c.io.out1.expect(1.B)
    c.io.out2.expect(1.B)
    }
    }
}