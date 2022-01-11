package core
import chisel3._

class IF_ID extends Module{
    val io = IO(new Bundle{
        val instruction_in = Input(UInt(32.W))
        val instruction_out = Output(UInt(32.W))
        val pc_in = Input(UInt(32.W))
        val pc_out = Output(UInt(32.W))
        val pc4_in = Input(UInt(32.W))
        val pc4_out = Output(UInt(32.W))
        
    })
    val instruction_reg = RegInit(0.U(32.W))
    val pc_reg = RegInit(0.U(32.W))
    val pc4_reg = RegInit(0.U(32.W))
    pc_reg := io.pc_in
    io.pc_out := pc_reg
    pc4_reg := io.pc4_in
    io.pc4_out := pc4_reg
    instruction_reg := io.instruction_in
    io.instruction_out := instruction_reg


}

