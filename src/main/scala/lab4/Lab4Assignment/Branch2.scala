package Lab4Assignment
import chisel3._
import chisel3.util._

class Branch2 extends Module{
    val io = IO(new Bundle{
        val func3 = Input(UInt(3.W))
        val branch = Input(Bool())
        val arg_x = Input(SInt(32.W))
        val arg_y = Input(SInt(32.W))
        var br_taken = Output(Bool())
    })
    
    
    io.br_taken := false.B    
    
    when(io.branch === true.B){
        io.br_taken := false.B
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
            is("b110".U){
                when(io.arg_x.asUInt < io.arg_y.asUInt){
                io.br_taken := true.B
                }

            }
            is("b111".U){
                when(io.arg_x.asUInt >= io.arg_y.asUInt){
                io.br_taken := true.B
                }

            }
        }
    }.otherwise {
            io.br_taken := false.B

        }
}
