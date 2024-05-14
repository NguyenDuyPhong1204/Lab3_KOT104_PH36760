package com.example.demo3.Demo

fun main() {
    val soA = 6
    var soB = 11

    with(soB) {
        soB = this.inc()
        println("Số b: $soB")
    }

    val luyThuaBac3CuaA = soA.let { it * it * it }

    val title: String? = "Buổi 3 - Android Kotlin"
    val length = title?.run {
        if(isEmpty()){
            0
        }else{
            length
        }
    }

    println("Độ dài chuỗi $title là $length ký tự")

    println("Tổng 2 số $soA và $soB = ${tinhTong(soA, soB)}")
    println("Tích của 2 số $soA và $soB = ${phepNhan(soA, soB)}")
    println("Thương của 2 số $soA và $soB = ${phepChia(soA.toFloat(), soB.toFloat()) ()}")
    println("Luỹ thừa của số $soA = ${luyThua(soA)}")
    println("Luỹ thừa của số $soB = ${luyThua(soB)}")


    val sv1: SinhVien = SinhVien("Phong", "PH36760", 8.8f, false, 20)
    sv1.apply {
        tenSV = "Phongnd"
        diemTb = 9f
    }

    println(sv1.getThongTin())
}

val tinhTong = { soA: Int, soB: Int -> (soA + soB) }

val phepNhan: (Int, Int) -> Int = { soA: Int, soB: Int -> (soA * soB) }

val phepChia = { soA: Float, soB: Float ->
    {
        if (soB == 0f) {
            "Số bị chia phải khác 0"
        } else {
            val kq = soA / soB
            kq
        }
    }
}

val luyThua: (Int) -> Int = {it * it}