package lab2
import chisel3._

class Mux_1_bit extends Module{
    val io = IO(new Bundle{
        val in_A = Input(UInt(1.W))
        val in_B = Input(UInt(1.W))
        val sel = Input(Bool())
        val out = Output(UInt())

    })

    // io.out := io.in_A & io.sel | io.in_B & (~io.sel)
    io.out := Mux(io.sel,io.in_A,io.in_B)
}