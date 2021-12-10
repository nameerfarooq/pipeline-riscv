package lab1
import chisel3._
import chisel3.util._
import java.io.File
class Task4( n : Int ) extends Module {
val io = IO ( new Bundle {
val data_in = Input( UInt ( n.W ) )
var reload = Input(Bool())
val out = Output(Bool())
})
val counter = RegInit(0.U(n.W))
val max_count = RegInit(6.U(n.W))
def loopAdd(){
        when(counter =/= max_count){
            counter := counter + 1.U
        }
        io.reload := true.B
         io.reload := false.B

        

}
def loopSub(){
        when(counter =/= 0.U){
            counter := counter - 1.U
}
         io.reload := true.B
         io.reload := false.B



}


when(counter === 0.U){
    
        loopAdd()
}.elsewhen(counter === max_count){
    
        loopSub()
    }
  




}