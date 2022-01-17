package core
import chisel3._

class MEM_WB extends Module{
    val io = IO(new Bundle{
        val EX_MEM_regWr_in = Input(UInt(1.W))
        val EX_MEM_load_in = Input(UInt(1.W))
        val EX_MEM_rd_sel_in = Input(UInt(5.W))
        val EX_MEM_alu_output_in = Input(SInt(32.W))
        val DataMem_dataOut_in = Input(SInt(32.W))
        
        
        val EX_MEM_regWr_out = Output(UInt(1.W))
        val EX_MEM_load_out = Output(UInt(1.W))
        val EX_MEM_rd_sel_out = Output(UInt(5.W))
        val EX_MEM_alu_output_out = Output(SInt(32.W))
        val DataMem_dataOut_out = Output(SInt(32.W))
})
        val EX_MEM_regWr_reg = RegInit(0.U(1.W))
        val EX_MEM_load_reg = RegInit(0.U(1.W))
        val EX_MEM_rd_sel_reg = RegInit(0.U(5.W))
        val EX_MEM_alu_output_reg = RegInit(0.S(32.W))
        val DataMem_dataOut_reg = RegInit(0.S(32.W))


    EX_MEM_regWr_reg := io.EX_MEM_regWr_in
    io.EX_MEM_regWr_out := EX_MEM_regWr_reg
    
    EX_MEM_load_reg := io.EX_MEM_load_in
    io.EX_MEM_load_out := EX_MEM_load_reg
    
    EX_MEM_rd_sel_reg := io.EX_MEM_rd_sel_in
    io.EX_MEM_rd_sel_out := EX_MEM_rd_sel_reg
    
    EX_MEM_alu_output_reg := io.EX_MEM_alu_output_in
    io.EX_MEM_alu_output_out := EX_MEM_alu_output_reg
    
    DataMem_dataOut_reg := io.DataMem_dataOut_in
    io.DataMem_dataOut_out := DataMem_dataOut_reg


}