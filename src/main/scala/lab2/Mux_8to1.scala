package lab2
import chisel3._
 

class Mux_8to1 extends Module{
    val io = IO(new Bundle{
        val in1 = Input(UInt(8.W))
        val in2 = Input(UInt(8.W))
        val in3 = Input(UInt(8.W))
        val in4 = Input(UInt(8.W))
        val in5 = Input(UInt(8.W))
        val in6 = Input(UInt(8.W))
        val in7 = Input(UInt(8.W))
        val in8 = Input(UInt(8.W))
        val s0 = Input(Bool())
        val s1 = Input(Bool())
        val s2 = Input(Bool())
        
        val out = Output(UInt())
    })

    // val mux_4to1_a = Mux(io.s1,Mux(io.s0,io.in(3),io.in(2)),Mux(io.s0,io.in(1),io.in(0)))
    // val mux_4to1_b = Mux(io.s1,Mux(io.s0,io.in(7),io.in(6)),Mux(io.s0,io.in(5),io.in(4)))
    val mux_4to1_a = Mux(io.s1,Mux(io.s0,io.in4,io.in3),Mux(io.s0,io.in2,io.in1))
    val mux_4to1_b = Mux(io.s1,Mux(io.s0,io.in8,io.in7),Mux(io.s0,io.in6,io.in5))
    val mux_8to1 =  Mux(io.s2,mux_4to1_a,mux_4to1_b)
    io.out := mux_8to1
}