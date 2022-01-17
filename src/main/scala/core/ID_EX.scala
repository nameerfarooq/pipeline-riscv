package core
import chisel3._

class ID_EX extends Module{
    val io = IO(new Bundle{
        val IF_ID_pc_in = Input(SInt(32.W))
        val rs1_sel_in = Input(UInt(5.W))
        val rs2_sel_in = Input(UInt(5.W))
        val rs1_in = Input(SInt(32.W))
        val rs2_in = Input(SInt(32.W))
        val rd_sel_in = Input(UInt(5.W))
        val Bus_A_in = Input(SInt(32.W)) 
        val Bus_B_in = Input(SInt(32.W))
        val AluOp_in = Input(UInt(5.W))
        val ctrl_store_in = Input(UInt(1.W))
        val ctrl_load_in = Input(UInt(1.W))
        val ctrl_branch_in = Input(UInt(1.W))
        val ctrl_regWr_in = Input(UInt(1.W))
        val ctrl_jal_in = Input(UInt(1.W))
        val ctrl_jalr_in = Input(UInt(1.W))


        // outputs
        val IF_ID_pc_out = Output(SInt(32.W))
        val rs1_sel_out = Output(UInt(5.W))
        val rs2_sel_out = Output(UInt(5.W))
        val rs1_out = Output(SInt(32.W))
        val rs2_out = Output(SInt(32.W))
        val rd_sel_out = Output(UInt(5.W))
        val Bus_A_out = Output(SInt(32.W)) 
        val Bus_B_out = Output(SInt(32.W))
        val AluOp_out = Output(UInt(5.W))
        val ctrl_store_out = Output(UInt(1.W))
        val ctrl_load_out = Output(UInt(1.W))
        val ctrl_branch_out = Output(UInt(1.W))
        val ctrl_regWr_out = Output(UInt(1.W))
        val ctrl_jal_out = Output(UInt(1.W))
        val ctrl_jalr_out = Output(UInt(1.W))
        
    })
// initializing registers
   val IF_ID_pc_reg = RegInit(0.S(32.W))
    val rs1_sel_reg = RegInit(0.U(5.W))
    val rs2_sel_reg = RegInit(0.U(5.W))
    val rs1_reg = RegInit(0.S(32.W))
    val rs2_reg = RegInit(0.S(32.W))
    val rd_sel_reg = RegInit(0.U(5.W))
    val Bus_A_reg = RegInit(0.S(32.W)) 
    val Bus_B_reg = RegInit(0.S(32.W))
    val AluOp_reg = RegInit(0.U(5.W))
    val ctrl_store_reg = RegInit(0.U(1.W))
    val ctrl_load_reg = RegInit(0.U(1.W))
    val ctrl_branch_reg = RegInit(0.U(1.W))
    val ctrl_regWr_reg = RegInit(0.U(1.W))
    val ctrl_jal_reg = RegInit(0.U(1.W))
    val ctrl_jalr_reg = RegInit(0.U(1.W))

// storing values in registers

    IF_ID_pc_reg := io.IF_ID_pc_in
    io.IF_ID_pc_out := IF_ID_pc_reg

    rs1_sel_reg := io.rs1_sel_in
    io.rs1_sel_out := rs1_sel_reg
    
    rs2_sel_reg := io.rs2_sel_in
    io.rs2_sel_out := rs2_sel_reg
    
    rs1_reg := io.rs1_in
    io.rs1_out := rs1_reg
    
    rs2_reg := io.rs2_in
    io.rs2_out := rs2_reg

    rd_sel_reg := io.rd_sel_in
    io.rd_sel_out := rd_sel_reg

    Bus_A_reg := io.Bus_A_in
    io.Bus_A_out := Bus_A_reg
    
    Bus_B_reg := io.Bus_B_in
    io.Bus_B_out := Bus_B_reg

    AluOp_reg := io.AluOp_in
    io.AluOp_out := AluOp_reg

    ctrl_store_reg := io.ctrl_store_in
    io.ctrl_store_out := ctrl_store_reg
    
    ctrl_load_reg := io.ctrl_load_in
    io.ctrl_load_out := ctrl_load_reg
    
    ctrl_branch_reg := io.ctrl_branch_in
    io.ctrl_branch_out := ctrl_branch_reg
    
    ctrl_regWr_reg := io.ctrl_regWr_in
    io.ctrl_regWr_out := ctrl_regWr_reg
    
    ctrl_jal_reg := io.ctrl_jal_in
    io.ctrl_jal_out := ctrl_jal_reg
    
    ctrl_jalr_reg := io.ctrl_jalr_in
    io.ctrl_jalr_out := ctrl_jalr_reg





}