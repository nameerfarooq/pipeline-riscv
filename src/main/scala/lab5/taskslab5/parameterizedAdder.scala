package taskslab5

import chisel3._
import chisel3.util._

class ParameterizeAdder ( Width : Int ) extends Module {
require ( Width >= 0)
  val io = IO(new Bundle{
      val inA = Input(UInt(Width.W))
      val inB = Input(UInt(Width.W))
      val sum = Output(UInt(Width.W))
  })
  io.sum := io.inA + io.inB
}