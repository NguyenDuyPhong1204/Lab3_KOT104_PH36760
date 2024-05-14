package com.example.demo3.Lab3

open class Nguoi {
    var hoTen: String? = null
    var tuoi: Int? = null
    var queQuan: String? = null
    var maSoGV: String? = null

    open fun nhapThongTin() {
        println("Nhập thông tin giáo viên")
        print("Nhập họ tên giáo viên: ")
        hoTen = readlnOrNull()
        print("Nhập tuổi của giáo viên: ")
        tuoi = readlnOrNull()?.toIntOrNull() ?: 1
        print("Nhập quê quán của giáo viên: ")
        queQuan = readlnOrNull()
        print("Nhập mã số giáo viên: ")
        maSoGV = readlnOrNull()
    }

   open fun getThongTin():String{
        var thongTin: String
        thongTin = "Họ tên: ${hoTen} , tuổi: ${tuoi}, quê quán: ${queQuan}, mã giáo viên: " +
                "${maSoGV}".trimIndent()
        return thongTin
    }
}