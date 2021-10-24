package tasksLab3
import chisel3._
import chisel3.util._
import chiseltest._
import org.scalatest._

class Encoder4to2SwitchTEST extends FreeSpec with ChiselScalatestTester{
    "encoder 4 to 2 switch test " in {
        test(new Encoder4to2Switch()){c=>
        c.io.in.poke("b0100".U)
        c.clock.step(100)
        c.io.out.expect("b10".U)


        }
    }
}