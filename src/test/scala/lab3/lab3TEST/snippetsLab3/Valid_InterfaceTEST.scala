// package snippetsLab3
// import chisel3._
// import chisel3.util._
// import org.scalatest._
// import chiseltest._

// class Valid_InterfaceTEST extends FreeSpec with ChiselScalatestTester{
//     "valid interface test" in {
//         test(new Valid_Interface()){c=>
//         c.io.in.expect(10.U)
//         c.io.out.poke(10.U)
//         c.clock.step(100)

//         }
//     }
// }