package lab2
import chisel3._
import chisel3.util._

class LM_IO_Interface extends Module{
    val io = IO(new Bundle{
        val data_in = Input(Vec(4,(UInt(32.W))))
        val data_selector = Input(UInt(2.W))
        val data_out = Output(UInt(32.W))
        val addr = Input(UInt(5.W))
        val wr_en = Input(Bool())
    })
    io.data_out := 0.U
    val memory = Mem(32, UInt(32.W))

    when(io.wr_en){
        memory.write(io.addr, io.data_in(io.data_selector))
        io.data_out := memory.read(io.addr)

        

    }.otherwise{
        io.data_out := memory.read(io.addr)
    }
}