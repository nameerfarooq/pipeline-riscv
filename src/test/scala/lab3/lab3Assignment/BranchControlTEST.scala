package lab3Assignment
import chisel3._
import org.scalatest._
import chiseltest._


class BranchControlTEST extends FreeSpec with ChiselScalatestTester{
    "branch control test beq" in {
        test(new BranchControl()){c=>
        c.io.func3.poke("b000".U)
        c.io.branch.poke(true.B)
        c.io.arg_x.poke(10.U)
        c.io.arg_y.poke(10.U)
        c.clock.step(100)
        c.io.br_taken.expect(true.B)
        }
    }

    "branch control test bne" in {
        test(new BranchControl()){c=>
        c.io.func3.poke("b001".U)
        c.io.branch.poke(true.B)
        c.io.arg_x.poke(10.U)
        c.io.arg_y.poke(20.U)
        c.clock.step(100)
        c.io.br_taken.expect(true.B)
        }
    }

    "branch control test blt" in {
        test(new BranchControl()){c=>
        c.io.func3.poke("b100".U)
        c.io.branch.poke(true.B)
        c.io.arg_x.poke(10.U)
        c.io.arg_y.poke(20.U)
        c.clock.step(100)
        c.io.br_taken.expect(true.B)
        }
    }

    "branch control test bge" in {
        test(new BranchControl()){c=>
        c.io.func3.poke("b101".U)
        c.io.branch.poke(true.B)
        c.io.arg_x.poke(30.U)
        c.io.arg_y.poke(20.U)
        c.clock.step(100)
        c.io.br_taken.expect(true.B)
        }
    }
}