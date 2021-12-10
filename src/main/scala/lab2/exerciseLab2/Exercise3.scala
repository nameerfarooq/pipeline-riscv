package exerciseLab2
import chisel3._
import chisel3.util._
class Exercise3 extends Module {
val io = IO ( new Bundle {
val in3 = Input(Bool())
val in2 = Input(Bool())
val in1 = Input(Bool())
val in0 = Input(Bool())

val out1 = Output(Bool())
val out2 = Output(Bool())

})
io.out1 := io.in3 + io.in2
io.out2 := io.in3 + io.in1
}