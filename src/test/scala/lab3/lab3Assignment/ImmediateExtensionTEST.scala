package lab3Assignment
import chisel3._
import chisel3.util._
import org.scalatest._
import chiseltest._

class ImmediateExtensionTEST extends FreeSpec with ChiselScalatestTester{
    "immediate extender test" in {
        test(new ImmediateExtension()){c=>
        c.io.inst.poke("hfe1ff0ef".U)
        c.clock.step(100)
        c.io.immediate_Se.expect(-32.S)
        }

    }
}

