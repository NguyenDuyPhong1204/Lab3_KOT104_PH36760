package com.example.demo3.Demo

internal class SinhVien(var tenSV: String, var maSv: String, var diemTb: Float) {
    var daTotNghiep: Boolean? = null
    var tuoi: Int? = null

    constructor(tenSV: String, maSv: String, diemTb: Float, daTotNghiep: Boolean, tuoi: Int):this(tenSV, maSv, diemTb) {
        this.daTotNghiep = daTotNghiep
        this.tuoi = tuoi
    }


    fun getThongTin() : String{
        var thongTin : String
        if(daTotNghiep != null && tuoi != null){
            thongTin = "Tên: $tenSV, Mã sinh viên: $maSv, Điểm trung bình: $diemTb" +
                    ", Đã tốt nghiệp: $daTotNghiep, Tuổi: $tuoi"

        }else{
            thongTin = "Tên: $tenSV, Mã sinh viên: $maSv, Điểm trung bình: $diemTb"

        }

        return thongTin
    }
}