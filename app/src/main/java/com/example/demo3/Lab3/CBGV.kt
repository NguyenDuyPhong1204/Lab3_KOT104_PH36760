package com.example.demo3.Lab3

class CBGV : Nguoi() {
//    lương cứng, lương thưởng,
//    tiền phạt, lương thực lĩnh,
//    và các thông tin cá nhân: Họ tên, tuổi, quê quán, mã số giáo viên.
//    var hoTen: String? = null
//    var tuoi: Int? = null
//    var queQuan: String? = null
//    var maSoGV: String? = null
//    var nguoi = Nguoi()
    var luongCung: Double? = null
    var luongThuong:Double? = null
    var tienPhat: Double? = null

  override fun nhapThongTin(){
      super.nhapThongTin()
        print("Nhập lương cứng của giáo viên: ")
        luongCung = readlnOrNull()?.toDoubleOrNull()?:0.0
        print("Nhập lương thưởng của giáo viên: ")
        luongThuong = readlnOrNull()?.toDoubleOrNull()?:0.0
        print("Nhập tiền phạt của giáo viên: ")
        tienPhat = readlnOrNull()?.toDoubleOrNull()?:0.0
    }

    override fun getThongTin():String{
        var thongTin: String
        thongTin = super.getThongTin() + ", lương cứng: $luongCung, lương thưởng: $luongThuong, " +
                "tiền phạt: $tienPhat, lương thực: ${tinhLuongThuc()}".trimIndent()

        return thongTin
    }
    fun tinhLuongThuc(): Double {
        return (luongCung ?: 0.0) + (luongThuong ?: 0.0) - (tienPhat ?: 0.0)
    }

}