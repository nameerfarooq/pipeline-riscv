package lab2
import chisel3._
import chisel3.util._

class MuxLookUp8to1 extends Module{
    val io = IO(new Bundle{
        val in0 = Input(UInt(16.W))
        val in1 = Input(UInt(16.W))
        val in2 = Input(UInt(16.W))
        val in3 = Input(UInt(16.W))
        val in4 = Input(UInt(16.W))
        val in5 = Input(UInt(16.W))
        val in6 = Input(UInt(16.W))
        val in7 = Input(UInt(16.W))
        val sel = Input(UInt(3.W))
        val out = Output(UInt(16.W))
    })

    io.out := MuxLookup(io.sel, false.B, Array(
        (0.U) -> io.in0,
        (1.U) -> io.in1,
        (2.U) -> io.in2,
        (3.U) -> io.in3,
        (4.U) -> io.in4,
        (5.U) -> io.in5,
        (6.U) -> io.in6,
        (7.U) -> io.in7
    ))
}