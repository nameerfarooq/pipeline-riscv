package core
import chisel3._
import chisel3.util
import org.scalatest._
import chiseltest._

class TopTest extends FreeSpec with ChiselScalatestTester{
    "top module test" in {
        test(new Top()){c=>
        c.clock.step(20)
        c.io.Instruction.expect(0x03210093.U)    
        c.io.pc.expect(0.U)    
        c.io.rs1.expect(2.U)    
        c.io.rs2.expect(18.U)    
        c.io.CoreAluA.expect(0.S)    
        c.io.CoreAluB.expect(50.S)    
        c.io.writeBack.expect(50.S)       
        c.io.AluResult.expect(50.S)    
        }
    }
}