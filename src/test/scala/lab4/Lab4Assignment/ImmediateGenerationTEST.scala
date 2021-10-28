package Lab4Assignment
import chisel3._
import chisel3.util._
import org.scalatest._
import chiseltest._
import chiseltest.experimental.TestOptionBuilder._
import chiseltest.internal.VerilatorBackendAnnotation
import scala.util.Random

// class ImmediateGenerationTEST extends FreeSpec with ChiselScalatestTester{
//     "immediate generation tester" in {
//         test(new ImmediateGeneration()){c=>
//         // val opCode_Array = Array("b0000011".U,"b0100011".U,"b1100011".U,"b0110111".U,"b0010111".U,"b1101111".U,"b1100111".U)
//         val I_TYPE = "b0010011"
//         val L_TYPE = "b0100011"
//         val S_TYPE = "b1100011"
//         val B_TYPE = "b0110111"
//         val U_TYPE_LUI = "b0010111"
//         val U_TYPE_AUIPC = "b1101111"
//         val UJ_TYPE_JAL ="b1101111"
//         val UJ_TYPE_JALR ="b1100111"
//         val instruction_Array = Array("h00a28193","h00502183","h003022a3","h0051d863","h000131b7","h00045217","hff9ff0ef","h005201e7")
//         var immediate = Wire(SInt(32.W))
//         var imm1 = 0.S
//         var imm2 = 0.S
//         var imm3 = 0.S
//         var imm4 = 0.S
//         for ( i <- 0 until 100){
//            val index = Random.nextInt(7)
//            val instruction= instruction_Array(index)
//            val inst = instruction(6,0)
//            val result = inst match{
//             //    i type
//                case I_TYPE => {
//                     immediate := instruction(31,20).asSInt      
//                 } 
//                //     L type
//                case L_TYPE => {
//                     immediate := instruction(31,20).asSInt      
//                 } 
//                //     S type
//                case S_TYPE => {
//                     imm1 = instruction(11,7).asSInt
//                     imm2 = instruction(31,25).asSInt
//                     immediate := Cat(imm2,imm1).asSInt  
//                 } 
//                //      B type
//                case B_TYPE => {
//                     imm1 = instruction(7).asSInt
//                     imm2 = instruction(11,8).asSInt
//                     imm3 = instruction(30,25).asSInt
//                     imm4 = instruction(31).asSInt
//                     immediate := Cat(imm4,imm1,imm3,imm2,0).asSInt   
//                 } 
//                 //     U type lui
//                case U_TYPE_LUI => {
//                     immediate := instruction(31,12).asSInt  
//                 } 
//                 //     U type auipc
//                case U_TYPE_AUIPC => {
//                     immediate := instruction(31,12).asSInt         
//                 } 
//                 //     UJ type JAL
//                case UJ_TYPE_JAL => {
//                     imm1 = instruction(19,12).asSInt // 10:1
//                     imm2 = instruction(20).asSInt // 11
//                     imm3 = instruction((1 until 10).U)// 19:12
//                     imm4 = instruction(31).asSInt // 20
//                     // immediate := Cat(imm4,imm1,imm2,imm3,0.S).asSInt 
//                     immediate := imm4 

//                 } 
//                 //    UJ type JALR
//                case UJ_TYPE_JALR => {
//                     immediate := instruction(31,20).asSInt      

//                 } 
//                case _=> {
//                    immediate := 0.S
//                }
//             }   


//             c.io.inst.poke(instruction.U)
//             c.clock.step(100)
//             c.io.immediate_Se.expect(immediate)
            
//             }
//         }
//     }
// }