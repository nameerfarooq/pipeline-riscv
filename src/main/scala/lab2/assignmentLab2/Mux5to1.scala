package assignmentLab2
import chisel3._
import chisel3.util._

class Mux5to1 extends Module{
    val io = IO(new Bundle{
        val s0 = Input(Bool())
        val s1 = Input(Bool())
        val s2 = Input(Bool())
        val out = Output(UInt(32.W))
    })
    val val1 = 0.U
    val val2 = 8.U
    val val3 = 16.U
    val val4 = 24.U
    val val5 = 32.U
    val sel = Cat(io.s2,io.s1,io.s0)


    io.out := MuxCase(false.B,Array(
        (sel === 0.U) -> val1,
        (sel === 1.U) -> val2,
        (sel === 2.U) -> val3,
        (sel === 3.U) -> val4,
        (sel(2)===1.U) -> val5,
    ))

}

//     io.out := MuxLookup(sel,false.B,Array(
// (0.U) -> val1,
// (1.U) -> val2,
// (2.U) -> val3,
// (3.U) -> val4,
// sel(0)  -> val4
//     ))