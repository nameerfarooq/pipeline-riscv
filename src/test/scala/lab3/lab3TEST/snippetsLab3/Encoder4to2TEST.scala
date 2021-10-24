package snippetsLab3
import chisel3._
import chisel3.util._
import chiseltest._
import org.scalatest._

class Encoder4to2TEST extends FreeSpec with ChiselScalatestTester{
    "encoder 4 to 2 test" in {
        test(new Encoder4to2()){c=>
        c.io.in.poke("b0001".U)
        c.clock.step(100)
        c.io.out.expect("b00".U)
        }
    }
}