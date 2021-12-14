package taskslab5
import chisel3._
import chisel3.util._

class DataPacket [T<:Data](generic:T) extends Bundle{
    val databits = generic
    val addressbits = UInt(10.W)
}
class Router extends Module {
    val io = IO ( new Bundle {
        val in = Input(new DataPacket(UInt(32.W))) 
        val out = Output (in)    
    })
    
    io.out := io.in
}