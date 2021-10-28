package lab3Assignment
import chisel3._
import chisel3.util._
import org.scalatest._
import chiseltest._

class ImmediateExtensionTEST extends FreeSpec with ChiselScalatestTester{
    "immediate extender test i type " in {
        test(new ImmediateExtension()){c=>
        c.io.inst.poke("h00a28193".U)
        c.clock.step(100)
        c.io.immediate_Se.expect(10.S)
        }

    }
    "immediate extender test U type " in {
        test(new ImmediateExtension()){c=>
        c.io.inst.poke("h0005a517".U)
        c.clock.step(100)
        c.io.immediate_Se.expect(90.S)
        }

    }
    "immediate extender test B type " in {
        test(new ImmediateExtension()){c=>
        c.io.inst.poke("h00224863".U)
        c.clock.step(100)
        c.io.immediate_Se.expect(16.S)
        }

    }
    "immediate extender test S type " in {
        test(new ImmediateExtension()){c=>
        c.io.inst.poke("hfaa02323".U)
        c.clock.step(100)
        c.io.immediate_Se.expect(-90.S)
        }

    }
}

