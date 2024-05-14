package com.example.demo3.Lab3

class TheMuon : SinhVien(){
    //    Mã phiếu mượn, ngày mượn,
//    hạn trả, số hiệu sách, và các thông tin cá nhân của sinh viên mượn sách

    var maPhieuMuong: String? = null
    var ngayMuon: String = "13/05/2024"
    var hanTra: String? = null
    var soHieuSach: Int? = null

    override fun nhapThongTin() {
        super.nhapThongTin()
        print("Nhập mã phiếu mượn: ")
        maPhieuMuong = readlnOrNull()
        print("Nhập hạn trả: ")
        hanTra = readlnOrNull()
        print("Nhập số hiệu sách: ")
        soHieuSach = readlnOrNull()?.toIntOrNull() ?: 0
    }

    override fun getThongTin(): String {
        var thongTin: String
        thongTin = super.getThongTin() +", mã phiếu mượn: $maPhieuMuong, ngày mượn: $ngayMuon, hạn trả: $hanTra, số hiệu sách: $soHieuSach"
        return thongTin
    }
}