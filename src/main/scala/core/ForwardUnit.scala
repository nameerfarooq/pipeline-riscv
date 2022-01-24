class ForwardUnit extends Module{
    val io = IO(new Bundle{
        val EX_MEM_reg_rd = Input(UInt(5.W))
        val EX_MEM_regWr = Input(UInt(1.W))
        val MEM_WB_reg_rd = Input(UInt(5.W))
        val MEM_WB_regWr = Input(UInt(1.W))
        val ID_EX_reg_rs1 = Input(UInt(5.W))
        val ID_EX_reg_rs2 = Input(UInt(5.W))
        val forward_a = Output(UInt(2.W))
        val forward_b = Output(UInt(2.W))
    })

    io.forward_a := "b00".U
    io.forward_b := "b00".U

// execution hazards

    when(io.EX_MEM_regWr === "b1".U && io.EX_MEM_reg_rd =/= "b00000".U &&
     (io.EX_MEM_reg_rd === io.ID_EX_reg_rs1) && (io.EX_MEM_reg_rd === io.ID_EX_reg_rs2)){
         io.forward_a := "b01".U
         io.forward_b := "b01".U
     }
     elsewhen(io.EX_MEM_regWr === "b1".U && io.EX_MEM_reg_rd =/= "b00000".U &&
     (io.EX_MEM_reg_rd === io.ID_EX_reg_rs2)
     ){
         io.forward_b := "b01".U
     }
     elsewhen(io.EX_MEM_regWr === "b1".U && io.EX_MEM_reg_rd =/= "b00000".U &&
     (io.EX_MEM_reg_rd === io.ID_EX_reg_rs1)
     ){
         io.forward_a := "b01".U
     }
     
     // mem hazards
     
         when(io.MEM_WB_regWr === "b1".U && io.MEM_WB_reg_rd =/= "b00000".U &&
         ~((io.EX_MEM_regWr === "b1".U) && (io.EX_MEM_reg_rd =/= "b00000".U)&&(io.EX_MEM_reg_rd=== io.ID_EX_reg_rs1)&&(io.EX_MEM_reg_rd === io.ID_EX_reg_rs2)) &&
          (io.MEM_WB_reg_rd === io.ID_EX_reg_rs1) && (io.MEM_WB_reg_rd === io.ID_EX_reg_rs2)){
              io.forward_a := "b10".U
              io.forward_b := "b10".U
          }
          elsewhen(io.MEM_WB_regWr === "b1".U && io.MEM_WB_reg_rd =/= "b00000".U &&
        ~((io.EX_MEM_regWr === "b1".U) && (io.EX_MEM_reg_rd =/= "b00000".U)&&(io.EX_MEM_reg_rd=== io.ID_EX_reg_rs2)) &&

          (io.MEM_WB_reg_rd === io.ID_EX_reg_rs2)
          ){
              io.forward_b := "b10".U
          }
          elsewhen(io.MEM_WB_regWr === "b1".U && io.MEM_WB_reg_rd =/= "b00000".U &&
        ~((io.EX_MEM_regWr === "b1".U) && (io.EX_MEM_reg_rd =/= "b00000".U)&&(io.EX_MEM_reg_rd=== io.ID_EX_reg_rs1)) &&

          (io.MEM_WB_reg_rd === io.ID_EX_reg_rs1)
          ){
              io.forward_a := "b10".U
          }







}