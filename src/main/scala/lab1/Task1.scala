package lab1
import chisel3._
class Task1( counterBits : UInt ) extends Module {
val io = IO ( new Bundle{
val result = Output(Bool())
})
val max = (1.S << counterBits ) - 1.S
val count = RegInit(0.U(16.W)).asSInt
when( count === max ) {
count := 0.S
}.otherwise {
count := count + 1.S
}
io.result := count(15.U)
println ( s"counter created with max value $max")
}