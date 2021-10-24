package snippetsLab3
import chisel3._
import chisel3.util._
import org.scalatest._
import chiseltest._

class ALUTest extends FreeSpec with ChiselScalatestTester{
    "Alu test" in {
        test(new ALU()){c=>
        c.io.in_A.poke(255.U)
        c.io.in_B.poke(200.U)
        c.io.alu_Op.poke(1.U)
        c.clock.step(100)
        c.io.sum.expect(55.U)
        c.io.out.expect(55.U)
        }
    }
}