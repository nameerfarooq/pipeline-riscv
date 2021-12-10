package lab5snippets
import chisel3._
import chisel3.util
import org.scalatest._
import chiseltest._

class NetworkSwitchTest extends FreeSpec with ChiselScalatestTester{
    "switch 2 cross 2 tester" in {
        test(new Switch_2cross2(UInt(8.W)) ){c=>
        c.io.in1.poke(5.U)    
        c.io.in2.poke(10.U)    
        c.io.sel.poke(1.B) 
        c.clock.step(5)   
        c.io.out1.expect(10.U)    
        c.io.out2.expect(5.U)    
        }
    }
}