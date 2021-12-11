package core
import chisel3._
import chisel3.util
import org.scalatest._
import chiseltest._

class TopTest extends FreeSpec with ChiselScalatestTester{
    "top module test" in {
        test(new Top()){c=>
        c.clock.step(100)
        c.io.Instruction.expect("h00a28193".U)    
        c.io.writeBack.expect(10.S)    
        c.io.regDataA.expect(0.S)    
        c.io.regDataB.expect(10.S)    
        c.io.AluResult.expect(10.S)    
        }
    }
}