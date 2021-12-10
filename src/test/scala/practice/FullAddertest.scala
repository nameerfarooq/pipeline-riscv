package practice
import chisel3._
import chiseltest._
import org.scalatest._

class FullAddertest extends FreeSpec with ChiselScalatestTester{
    "Full Adder test 1" in {
        test(new FullAdder()){c=>
        c.io.a.poke(0.U)
        c.io.b.poke(0.U)
        c.io.carryIn.poke(0.U)

        c.clock.step(1)

        c.io.sum.expect(0.U)
        c.io.carryOut.expect(0.U)
    
        }
    }

    "Full Adder test 2" in {
        test(new FullAdder()){c=>
        c.io.a.poke(0.U)
        c.io.b.poke(0.U)
        c.io.carryIn.poke(1.U)

        c.clock.step(1)

        c.io.sum.expect(1.U)
        c.io.carryOut.expect(0.U)
    
        }
    }

    "Full Adder test 3" in {
        test(new FullAdder()){c=>
        c.io.a.poke(0.U)
        c.io.b.poke(1.U)
        c.io.carryIn.poke(0.U)

        c.clock.step(1)

        c.io.sum.expect(1.U)
        c.io.carryOut.expect(0.U)
    
        }
    }

    "Full Adder test 4" in {
        test(new FullAdder()){c=>
        c.io.a.poke(0.U)
        c.io.b.poke(1.U)
        c.io.carryIn.poke(1.U)

        c.clock.step(1)

        c.io.sum.expect(0.U)
        c.io.carryOut.expect(1.U)
    
        }
    }

    "Full Adder test 5" in {
        test(new FullAdder()){c=>
        c.io.a.poke(1.U)
        c.io.b.poke(0.U)
        c.io.carryIn.poke(0.U)

        c.clock.step(1)

        c.io.sum.expect(1.U)
        c.io.carryOut.expect(0.U)
    
        }
    }

    "Full Adder test 6" in {
        test(new FullAdder()){c=>
        c.io.a.poke(1.U)
        c.io.b.poke(0.U)
        c.io.carryIn.poke(1.U)

        c.clock.step(1)
        
        c.io.sum.expect(0.U)
        c.io.carryOut.expect(1.U)
    
        }
    }

    "Full Adder test 7" in {
        test(new FullAdder()){c=>
        c.io.a.poke(1.U)
        c.io.b.poke(1.U)
        c.io.carryIn.poke(0.U)

        c.clock.step(1)
        
        c.io.sum.expect(0.U)
        c.io.carryOut.expect(1.U)
    
        }
    }

    "Full Adder test 8" in {
        test(new FullAdder()){c=>
        c.io.a.poke(1.U)
        c.io.b.poke(1.U)
        c.io.carryIn.poke(1.U)

        c.clock.step(1)
        
        c.io.sum.expect(1.U)
        c.io.carryOut.expect(1.U)
    
        }
    }
}