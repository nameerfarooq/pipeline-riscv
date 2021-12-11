package core
import chisel3._
import chisel3.util._

class Top extends Module{
    val io =  IO(new Bundle{
        val Instruction = Output(UInt(32.W))
        val writeBack = Output(UInt(32.W))
        val regDataA = Output(UInt(32.W))
        val regDataB = Output(UInt(32.W))
        val AluResult = Output(UInt(32.W))
    })
    
}