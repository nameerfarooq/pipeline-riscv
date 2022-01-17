package core
import chisel3._

class EX_MEM extends Module{
    val io = IO(new Bundle{

        // defining inputs
        val ID_EX_store_in = Input(UInt(1.W))
        val ID_EX_load_in = Input(UInt(1.W))
        val ID_EX_regWr_in = Input(UInt(1.W))
        val ID_EX_rs2_in = Input(SInt(32.W))
        val ID_EX_rs2_sel_in = Input(UInt(5.W))
        val ID_EX_rd_sel_in = Input(UInt(5.W))
        val alu_output_in = Input(SInt(32.W))
        
        // defining outputs
        val ID_EX_store_out = Output(UInt(1.W))
        val ID_EX_load_out = Output(UInt(1.W))
        val ID_EX_regWr_out = Output(UInt(1.W))
        val ID_EX_rs2_out = Output(SInt(32.W))
        val ID_EX_rs2_sel_out = Output(UInt(5.W))
        val ID_EX_rd_sel_out = Output(UInt(5.W))
        val alu_output_out = Output(SInt(32.W))
    
    
    
    
    })
    // initializing registers
    val ID_EX_store_reg = RegInit(0.U(1.W))
    val ID_EX_load_reg = RegInit(0.U(1.W))
    val ID_EX_regWr_reg = RegInit(0.U(1.W))
    val ID_EX_rs2_reg = RegInit(0.S(32.W))
    val ID_EX_rs2_sel_reg = RegInit(0.U(1.W))
    val ID_EX_rd_sel_reg = RegInit(0.U(1.W))
    val alu_output_reg = RegInit(0.S(32.W))

    
    ID_EX_store_reg := ID_EX_store_in
    ID_EX_store_out := ID_EX_store_reg
    
    ID_EX_load_reg := ID_EX_load_in
    ID_EX_load_out := ID_EX_load_reg
    
    ID_EX_regWr_reg := ID_EX_regWr_in
    ID_EX_regWr_out := ID_EX_regWr_reg
    
    ID_EX_rs2_reg := ID_EX_rs2_in
    ID_EX_rs2_out := ID_EX_rs2_reg
    
    ID_EX_rs2_sel_reg := ID_EX_rs2_sel_in
    ID_EX_rs2_sel_out := ID_EX_rs2_sel_reg
    
    ID_EX_rd_sel_reg := ID_EX_rd_sel_in
    ID_EX_rd_sel_out := ID_EX_rd_sel_reg
    
    alu_output_reg := alu_output_in
    alu_output_out := alu_output_reg

}