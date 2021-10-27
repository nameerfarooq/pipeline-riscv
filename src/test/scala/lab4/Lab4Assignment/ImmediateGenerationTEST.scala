package Lab4Assignment
import chisel3._
import chisel3.util
import org.scalatest._
import chiseltest._
import chiseltest.experimental.TestOptionBuilder._
import chiseltest.internal.VerilatorBackendAnnotation
import scala.util.Random

class ImmediateGenerationTEST extends FreeSpec with ChiselScalatestTester{
    "immediate generation tester" in {
        test(new ImmediateGeneration()){c=>
        val opCode_Array = Array("b0010011","b0000011","b0100011","b1100011","b0110111","b0010111","b1101111","b1100111")
       for ( i <- 0 until 100) {
           val instruction = (Random.nextLong() & 0xFFFFFFFFL).asUInt
           val inst = instruction(6,0)
           








        }
    }
}