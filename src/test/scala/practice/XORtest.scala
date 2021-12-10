package practice

import org.scalatest._
import chiseltest._
import chisel3._

class XORtest extends FreeSpec with ChiselScalatestTester{
    "XOR Gate Test1" in {
        test(new XOR()){ c=>
            c.io.a.poke(0.U)
            c.io.b.poke(0.U)
            c.clock.step(1)
            c.io.output.expect(0.U)
        }
    }
    "XOR Gate Test2" in {
        test(new XOR()){ c=>
            c.io.a.poke(0.U)
            c.io.b.poke(1.U)
            c.clock.step(1)
            c.io.output.expect(1.U)
        }
    }
    "XOR Gate Test3" in {
        test(new XOR()){ c=>
            c.io.a.poke(1.U)
            c.io.b.poke(0.U)
            c.clock.step(1)
            c.io.output.expect(1.U)
        }
    }
    "XOR Gate Test4" in {
        test(new XOR()){ c=>
            c.io.a.poke(1.U)
            c.io.b.poke(1.U)
            c.clock.step(1)
            c.io.output.expect(0.U)
        }
    }
}