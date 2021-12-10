package lab2
import chisel3._
import org.scalatest._
import chiseltest._

class Mux_8to1_TEST extends FreeSpec with ChiselScalatestTester{
    "Mux 8 to 1 test" in {
        test(new Mux_8to1()){c=>
        c.io.in1.poke(255.U)
        c.io.in2.poke(254.U)
        c.io.in3.poke(253.U)
        c.io.in4.poke(252.U)
        c.io.in5.poke(251.U)
        c.io.in6.poke(250.U)
        c.io.in7.poke(249.U)
        c.io.in8.poke(248.U)
        c.io.s0.poke(0.B)
        c.io.s1.poke(0.B)
        c.io.s2.poke(0.B)
        c.clock.step(10)
        c.io.out.expect(251.U)
        }
    }
}