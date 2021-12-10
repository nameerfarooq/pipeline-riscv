package lab1
import chisel3._
class Task1( counterBits : UInt ) extends Module {
    val io = IO ( new Bundle{
        val result = Output(Bool())
    })
    val max = (1.S << counterBits ) - 1.S
    // 10000-1 = 1111
    val count = RegInit(0.S(4.W))//.asSInt
    when( count === max ) {
        count := 0.S
    }.otherwise {
        count := count + 1.S
    }
    io.result := count(3.U)
// println ( s"counter created with max value $max")
}