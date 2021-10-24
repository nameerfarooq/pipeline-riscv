package lab3Assignment
import chisel3._
import chisel3.util._

class BranchControl extends Module{
    val io = IO(new Bundle{
        val func3 = Input(UInt(3.W))
        val branch = Input(Bool())
        val arg_x = Input(UInt(32.W))
        val arg_y = Input(UInt(32.W))
        val br_taken = Output(Bool())
    })
    
    
    io.br_taken := false.B    
    
    when(io.branch === true.B){
        switch(io.func3){
            is("b000".U){
                when(io.arg_x === io.arg_y){
                    io.br_taken := true.B
                }
            }
            is("b001".U ){
                when(io.arg_x =/= io.arg_y){
                io.br_taken := true.B
                }
            }
            is("b100".U){
                when(io.arg_x < io.arg_y){
                io.br_taken := true.B
                }
            }
            is("b101".U){
                when(io.arg_x >= io.arg_y){
                io.br_taken := true.B
                }

            }
        }
    }.otherwise {
            io.br_taken := false.B

        }
}
