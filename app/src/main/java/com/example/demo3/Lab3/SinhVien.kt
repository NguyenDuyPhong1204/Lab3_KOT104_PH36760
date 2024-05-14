package com.example.demo3.Lab3

open class SinhVien {
    var hoTen: String? = null
    var tuoi: Int? = null
    var lop: String? = null

    open fun nhapThongTin(){
        println("---------------- Nhập thông tin sinh viên ------------------")
        print("Nhập họ tên sinh viên: ")
        hoTen = readlnOrNull()
        print("Nhập tuổi sinh viên: ")
        tuoi = readlnOrNull()?.toIntOrNull()?: 0
        print("Nhập lớp học: ")
        lop = readlnOrNull()
    }

    open fun getThongTin(): String {
        var thongTin: String
        thongTin =
            "Họ tên sinh viên: ${hoTen}, học lớp: ${lop}, tuổi: ${tuoi}"
        return thongTin
    }

}