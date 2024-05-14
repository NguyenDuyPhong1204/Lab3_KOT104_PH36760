package com.example.demo3.Lab3

import androidx.compose.ui.text.toLowerCase
import kotlin.system.exitProcess

fun main() {
    do {
        println("-------------------------------- Menu --------------------------------")
        println("Chọn bài bạn muốn xem")
        println("1. Bài 1")
        println("2. Bài 2")
        println("3. Thoát")
        var luaChon: Int
        print("Nhập bài muốn xem: ")
        var s = readlnOrNull()
        if (s != null) {
            luaChon = s.toInt()
            when (luaChon) {
                1 -> bai1()
                2 -> bai2()
                3 -> break
                else -> println("Vui lòng chọn lại");
            }
        }
    } while (s != null)
}

var listGiaoVien = mutableListOf<CBGV>()
fun bai1() {
    var cbgv = CBGV()
    do {
        println("-------------------------------- Menu --------------------------------")
        println("Chọn chức năng bạn muốn xem")
        println("1. Xem danh sách giáo viên")
        println("2. Thêm giáo viên")
        println("3. Xoá giáo viên theo mã")
        println("4. Thoaát")
        var luaChon: Int
        print("Nhập chức năng muốn xem: ")
        var s = readlnOrNull()
        if (s != null) {
            luaChon = s.toInt()
            when (luaChon) {
                1 -> {
                    println("----------------")
                    println("List giáo viên")
                    for (i in listGiaoVien.indices) {
                        println("Thông tin $i : ${listGiaoVien.get(i).getThongTin()}")
                    }
                }
                    2

                -> {
                    do {
                        var cbgv = CBGV()
                        cbgv.nhapThongTin()
                        listGiaoVien.add(cbgv)
                        println("Có nhập tiếp không(c/k)?:")
                        var s = readlnOrNull() ?: ""
                        if (s?.toLowerCase() == "k") {
                            break
                        }

                    } while (true)
                }

                3 -> xoaGiaoVien()
                4 -> break
                else -> println("Vui lòng chọn lại");
            }
        }
    } while (s != null)
}



fun xoaGiaoVien(){
    println("-------------------------------------")
    println("Xoá giáo viên theo mã giáo viên")

    var magv: String = ""
    var s: String?
    print("Nhập mã giáo viên muốn xoá: ")
    s = readlnOrNull()
    if (s != null) {
        magv = s.toString()
    }
    var found = false
    for (giaoVien in listGiaoVien) {
        var maSoGV = giaoVien.maSoGV
        if (maSoGV.equals(magv)) {
            found = true
            giaoVien.getThongTin()
            var xacNhan: String = ""
            println("Bạn có muốn xoá không (Y/N)?:")
            s = readlnOrNull()
            if (s != null) {
                xacNhan = s.toString()
                if (xacNhan.equals("Y")) {
                    listGiaoVien.remove(giaoVien)
                    println("Đã xoá")
                    break
                } else if (xacNhan.equals("N")) {
                    println("Không xoá")
                    break;
                }
            }
        }
    }
    if (!found) {
        println("Không tìm thấy mã giáo viên")
    }

}

var listTheMuon = mutableListOf<TheMuon>()

fun bai2() {
    var theMuon = TheMuon()
    do {
        println("-------------------------------- Menu --------------------------------")
        println("Chọn chức năng bạn muốn xem")
        println("1. Xem danh sách thẻ mượn")
        println("2. Thêm thẻ mượn")
        println("3. Xoá thẻ mượn theo mã")
        println("4. Thoát")
        var luaChon: Int
        print("Nhập chức năng muốn xem: ")
        var s = readlnOrNull()
        if (s != null) {
            luaChon = s.toInt()
            when (luaChon) {
                1 -> {
                    println("----------------")
                    println("List thẻ mượn")
                    for (i in listTheMuon.indices) {
                        println("Thông tin $i : ${listTheMuon.get(i).getThongTin()}")
                    }
                }
                2

                -> {
                    do {
                        var themuon = TheMuon()
                        themuon.nhapThongTin()
                        listTheMuon.add(themuon)
                        println("Có nhập tiếp không(c/k)?:")
                        var s = readlnOrNull() ?: ""
                        if (s?.toLowerCase() == "k") {
                            break
                        }

                    } while (true)
                }

                3 -> xoaTheMuon()
                4 -> break
                else -> println("Vui lòng chọn lại");
            }
        }
    } while (s != null)
}

fun xoaTheMuon(){
    println("-------------------------------------")
    println("Xoá thẻ mượn theo mã thẻ mượn")

    var maThe: String = ""
    var s: String?
    print("Nhập mã thẻ mượn muốn xoá")
    s = readlnOrNull()
    if (s != null) {
        maThe = s.toString()
    }
    var found = false
    for (theMuon in listTheMuon) {
        if (theMuon.maPhieuMuong.equals(maThe)) {
            found = true
            theMuon.getThongTin()
            var xacNhan: String = ""
            println("Bạn có muốn xoá không (Y/N)?:")
            s = readlnOrNull()
            if (s != null) {
                xacNhan = s.toString()
                if (xacNhan.equals("Y")) {
                    listTheMuon.remove(theMuon)
                    println("Đã xoá")
                    break
                } else if (xacNhan.equals("N")) {
                    println("Không xoá")
                    break;
                }
            }
        }
    }
    if (!found) {
        println("Không tìm thấy mã thẻ mượn")
    }

}
