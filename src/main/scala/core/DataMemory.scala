package core
import chisel3._
import chisel3.util.experimental.loadMemoryFromFile

class DataMemory extends Module{
    val io = IO(new Bundle{
        val DataAddr = Input(UInt(32.W))
        val DataIn = Input(UInt(32.W))
        val store = Input(UInt(1.W))
        val load = Input(UInt(1.W))
        val clk = Input(UInt(1.W))
        val DataOut = Output(UInt(32.W))
    })
    val mem = Mem(1024,UInt(32.W))
    when(io.load === 1.U){
        io.DataOut:=mem(io.DataAddr)
    }.otherwise{
        io.DataOut:=0.U
    }

    when(io.store===1.U && io.clk===1.B){
        mem(io.DataAddr) := io.DataIn
    }
}