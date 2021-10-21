package snippetsLab3
import chisel3._
import chisel3.util._
 
import ALUOP._
 
object ALUOP{
    
        val ALU_add = 0.U(4.W)
        val ALU_sub = 1.U(4.W)
        val ALU_and = 2.U(4.W)
        val ALU_or = 3.U(4.W)
        val ALU_xor = 4.U(4.W)
        val ALU_slt = 5.U(4.W)
        val ALU_sll = 6.U(4.W)
        val ALU_sltu = 7.U(4.W)
        val ALU_srl = 8.U(4.W)
        val ALU_sra = 9.U(4.W)
        val ALU_copy_a = 10.U(4.W)
        val ALU_copy_b = 11.U(4.W)
        val ALU_xxx = 15.U(4.W)
    
}

trait Config {
        val WLEN = 32
        val ALUOP_SIG_LEN = 4
}


class ALUIO extends Bundle with Config {
        val in_A = Input(UInt(WLEN.W))
        val in_B = Input(UInt(WLEN.W))
        val alu_Op = Input(UInt(ALUOP_SIG_LEN.W))
        val out = Output(UInt(WLEN.W))
        val sum = Output(UInt(WLEN.W))
}


class ALU extends Module with Config{
        val io = IO(new ALUIO())
        val sum = io.in_A + Mux(io.alu_Op(0), -io.in_B, io.in_B)
        val cmp = Mux(io.in_A(WLEN-1)=== io.in_B(WLEN-1),sum(WLEN-1),Mux(io.alu_Op(1), io.in_B(WLEN-1),io.in_A(WLEN-1)))
        val shamt = io.in_B(4,0).asUInt
        val shin = Mux(io.alu_Op(3),io.in_A,Reverse(io.in_A))
        val shifter = (Cat(io.alu_Op(0)&& shin(WLEN-1),shin).asSInt >> shamt)(WLEN -1, 0)
        val shift1 = Reverse(shifter)
        val out = 
        Mux(io.alu_Op === ALU_add || io.alu_Op === ALU_sub,sum,
        Mux(io.alu_Op === ALU_slt || io.alu_Op === ALU_sltu,cmp,
        Mux(io.alu_Op === ALU_sra || io.alu_Op === ALU_srl,shifter,
        Mux(io.alu_Op === ALU_sll,shift1,
        Mux(io.alu_Op === ALU_and,(io.in_A & io.in_B),
        Mux(io.alu_Op === ALU_or,(io.in_A | io.in_B),
        Mux(io.alu_Op === ALU_xor,(io.in_A ^ io.in_B),
        Mux(io.alu_Op === ALU_copy_a,(io.in_A),
        Mux(io.alu_Op === ALU_copy_b,(io.in_B),0.U)))))))))
        io.out := out
        io.sum:= sum
}