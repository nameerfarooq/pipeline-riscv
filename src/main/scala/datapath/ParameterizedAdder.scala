package taskslab5
import chisel3._
import chisel3.util._
class  ParameterizedAdder( Width : Int ) extends Module {
require ( Width >= 0)
  val io = IO(new Bundle{
      val in_0 = Input(UInt(Width.W))
      val in_1 = Input(UInt(Width.W))
      val sum2 = Output(UInt(Width.W))
  })
  io.sum2 := io.in_0 + io.in_1
}