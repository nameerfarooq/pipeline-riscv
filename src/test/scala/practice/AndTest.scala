package practice

import org.scalatest._
import chiseltest._
import chisel3._

class AndTest extends FreeSpec with ChiselScalatestTester{
    "And Gate Test" in {
        test(new And()){ c=>
        c.io.a.poke(0.U)
        c.io.b.poke(0.U)
        c.clock.step(1)
        c.io.output.expect(0.U)
        }}
    "And Gate Test2" in {
        test(new And()){ c=>
        c.io.a.poke(0.U)
        c.io.b.poke(1.U)
        c.clock.step(1)
        c.io.output.expect(0.U)
        }
    }
    "And Gate Test3" in {
        test(new And()){ c=>
        c.io.a.poke(1.U)
        c.io.b.poke(0.U)
        c.clock.step(1)
        c.io.output.expect(0.U)
        }
    }
    "And Gate Test4" in {
        test(new And()){ c=>
        c.io.a.poke(1.U)
        c.io.b.poke(1.U)
        c.clock.step(1)
        c.io.output.expect(1.U)
        }
    }


    }
