package lab1
import chisel3._
import org.scalatest._
import chiseltest._

class AdderWithOffsetTest extends FreeSpec with ChiselScalatestTester{
    "AdderWithOffSetTest 1" in {
        test(new AdderWithOffset()){c=>
        c.io.x.poke(10.S)
        c.io.y.poke(10.U)
        c.clock.step(1)
        c.io.z.expect(43.U)
        }
    }
}