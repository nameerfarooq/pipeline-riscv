package practice
import chisel3._

class FullAdder extends Module{
    val io = IO(new Bundle{
        val a = Input(UInt(1.W))
        val b = Input(UInt(1.W))
        val carryIn = Input(UInt(1.W))
        val sum = Output(UInt(1.W))
        // val and1 = Input(UInt(1.W))
        // val and2 = Input(UInt(1.W))
        // val and3 = Input(UInt(1.W))
        val carryOut = Output(UInt(1.W)) 

    })
    // io.sum := io.a ^ io.b ^ io.carryIn 
    // io.and1 := io.a & io.b
    // io.and2 := io.a & io.carryIn
    // io.and3 := io.b & io.carryIn
    // io.carryOut := io.and1 | io.and2 | io.and3
     io.sum := io.a ^ io.b ^ io.carryIn 
    // io.and1 := io.a & io.b
    // io.and2 := io.a & io.carryIn
    // io.and3 := io.b & io.carryIn
    io.carryOut := (io.a & io.b) | (io.a & io.carryIn) | (io.b & io.carryIn)

} 