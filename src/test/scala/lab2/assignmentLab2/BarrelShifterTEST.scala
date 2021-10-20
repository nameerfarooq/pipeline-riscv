package assignmentLab2
import chisel3._
import chisel3.util._
import chiseltest._
import org.scalatest._

class BarrelShifterTEST extends FreeSpec with ChiselScalatestTester{
    "barrel shifter test" in {
        test(new BarrelShifter()){c=>
        c.io.in(0).poke(1.B)
        c.io.in(1).poke(0.B)
        c.io.in(2).poke(1.B)
        c.io.in(3).poke(0.B)
        c.io.sel(0).poke(1.B)
        c.io.sel(1).poke(1.B)
        c.io.shift_type.poke(1.B)
        c.clock.step(100)
        c.io.out(0).expect(0.B)
        c.io.out(1).expect(1.B)
        c.io.out(2).expect(0.B)
        c.io.out(3).expect(1.B)


        }
    }
}