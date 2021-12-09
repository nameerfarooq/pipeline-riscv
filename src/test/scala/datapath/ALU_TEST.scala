package datapath
import chisel3._
import chisel3.util
import org.scalatest._
import chiseltest._

class ALU_TEST extends FreeSpec with ChiselScalatestTester{
    "alu when test" in {
        test(new ALU(32)){c=>
        c.io.alu_a.poke(5.S)    
        c.io.alu_b.poke(2.S)    
        c.io.alu_oper.poke("b00000".U)    
        c.clock.step(10)
        c.io.alu_branch.expect(0.U)    
        c.io.alu_out.expect(7.S)    
        }
    }
}