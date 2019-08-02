package com.kuhaku.ikasir

class Product(){
      fun data():ArrayList<ArrayList<String>>{
          var arrayList2 = arrayListOf<ArrayList<String>>()

          val dataArray1 = arrayListOf("Sayur Asem","A","30000")
          arrayList2.add(dataArray1)
          val dataArray2 = arrayListOf("Sayur Lodeh","B","20000")
          arrayList2.add(dataArray2)
          val dataArray3 = arrayListOf("Nasi Goreng","C","10000")
          arrayList2.add(dataArray3)

          val dataArray4 = arrayListOf("Ayam Bakar","D","30000")
          arrayList2.add(dataArray4)

          val dataArray5 = arrayListOf("Ayam Goreng","E","30000")
          arrayList2.add(dataArray5)

          val dataArray6 = arrayListOf("Nasi Uduk","A","10000")
          arrayList2.add(dataArray6)

          return arrayList2

      }

    fun data1():ArrayList<ArrayList<String>>{
        var arrayList2 = arrayListOf<ArrayList<String>>()


        val dataArray7 = arrayListOf("Es Dawet","A","5000")
        arrayList2.add(dataArray7)
        val dataArray8 = arrayListOf("Es Doger","B","6000")
        arrayList2.add(dataArray8)
        val dataArray9 = arrayListOf("Es Kopyor","C","10000")
        arrayList2.add(dataArray9)

        val dataArray10 = arrayListOf("Es teh manis","D","5000")
        arrayList2.add(dataArray10)

        val dataArray11 = arrayListOf("Es Cingcau","E","5000")
        arrayList2.add(dataArray11)

        val dataArray12 = arrayListOf("Kopi","A","5000")
        arrayList2.add(dataArray12)

        return arrayList2
    }
}