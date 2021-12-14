package core
import chisel3._
import chisel3.util
import org.scalatest._
import chiseltest._

class TopTest extends FreeSpec with ChiselScalatestTester{
    "top module test" in {
        test(new Top()){c=>
        c.clock.step(7)
        c.io.pc.expect(28.U)    
        c.io.Instruction.expect("h0080006f".U)    
        c.io.rs1.expect(0.U)    
        // c.io.rs2.expect(-5.U)    
        // c.io.CoreAluA.expect(15.S)    
        // c.io.CoreAluB.expect(-5.S)    
        c.io.writeBack.expect(11.S)       
        // c.io.AluResult.expect(11.S)    
        }
    }
}