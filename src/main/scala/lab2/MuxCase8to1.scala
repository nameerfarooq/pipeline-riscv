package lab2
import chisel3._
import chisel3.util._

class MuxCase8to1 extends Module{
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

    io.out := MuxCase(false.B , Array(
        (io.sel === 0.U) -> io.in0,
        (io.sel === 1.U) -> io.in1,
        (io.sel === 2.U) -> io.in2,
        (io.sel === 3.U) -> io.in3,
        (io.sel === 4.U) -> io.in4,
        (io.sel === 5.U) -> io.in5,
        (io.sel === 6.U) -> io.in6,
        (io.sel === 7.U) -> io.in7,
    ))
}