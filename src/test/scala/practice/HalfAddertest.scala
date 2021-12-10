package practice
import chisel3._
import org.scalatest._
import chiseltest._

class HalfAddertest extends FreeSpec with ChiselScalatestTester{
    "HalfAdder Gate Test 1" in {
        test(new HalfAdder()){c=>
        c.io.a.poke(0.U)
        c.io.b.poke(0.U)
        c.clock.step(1)
        c.io.answer.expect(0.U)
        c.io.carry.expect(0.U)
        }
    }
    "HalfAdder Gate Test 2" in {
        test(new HalfAdder()){c=>
        c.io.a.poke(0.U)
        c.io.b.poke(1.U)
        c.clock.step(1)
        c.io.answer.expect(1.U)
        c.io.carry.expect(0.U)
        }
    }
    "HalfAdder Gate Test 3" in {
        test(new HalfAdder()){c=>
        c.io.a.poke(1.U)
        c.io.b.poke(0.U)
        c.clock.step(1)
        c.io.answer.expect(1.U)
        c.io.carry.expect(0.U)
        }
    }
    "HalfAdder Gate Test 4" in {
        test(new HalfAdder()){c=>
        c.io.a.poke(1.U)
        c.io.b.poke(1.U)
        c.clock.step(1)
        c.io.answer.expect(0.U)
        c.io.carry.expect(1.U)
        }
    }
}