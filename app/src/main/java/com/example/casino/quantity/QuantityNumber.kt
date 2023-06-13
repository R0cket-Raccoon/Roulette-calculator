package com.example.casino.quantity

import android.util.Log
import com.example.casino.R
import com.example.casino.dropped.DroppedNumberData
import com.example.casino.number.Data
import com.example.casino.number.QuantityData

class QuantityNumber {
        fun droppedNumber(list: MutableList<Int>): MutableList<Data> {
            Log.d("до",list.toString())
            var listDroppedNumber:MutableList<Data> = mutableListOf()
            for(i in 0 until list.size) {
                when (i) {
                    0 -> listDroppedNumber.add(0,QuantityData(R.drawable.k3,"K3",list[0]))
                    1 -> listDroppedNumber.add(1,QuantityData(R.drawable.k6,"K6",list[1]))
                    2 -> listDroppedNumber.add(2,QuantityData(R.drawable.k9,"K9",list[2]))
                    3 -> listDroppedNumber.add(3,QuantityData(R.drawable.k12,"K12",list[3]))
                    4 -> listDroppedNumber.add(4,QuantityData(R.drawable.k15,"K15",list[4]))
                    5 -> listDroppedNumber.add(5,QuantityData(R.drawable.k18,"K18",list[5]))
                    6 -> listDroppedNumber.add(6,QuantityData(R.drawable.k21,"K21",list[6]))
                    7 -> listDroppedNumber.add(7,QuantityData(R.drawable.k24,"K24",list[7]))
                    8 -> listDroppedNumber.add(8,QuantityData(R.drawable.k27,"K27",list[8]))
                    9 -> listDroppedNumber.add(9,QuantityData(R.drawable.k30,"K30",list[9]))
                    10 -> listDroppedNumber.add(10,QuantityData(R.drawable.k33,"K33",list[10]))
                    11 -> listDroppedNumber.add(11,QuantityData(R.drawable.k36,"K36",list[11]))
                    12 -> listDroppedNumber.add(12,QuantityData(R.drawable.k2,"K2",list[12]))
                    13 -> listDroppedNumber.add(13,QuantityData(R.drawable.k5,"K5",list[13]))
                    14 -> listDroppedNumber.add(14,QuantityData(R.drawable.k8,"K8",list[14]))
                    15 -> listDroppedNumber.add(15,QuantityData(R.drawable.k11,"K11",list[15]))
                    16 -> listDroppedNumber.add(16,QuantityData(R.drawable.k14,"K14",list[16]))
                    17 -> listDroppedNumber.add(17,QuantityData(R.drawable.k17,"K17",list[17]))
                    18 -> listDroppedNumber.add(18,QuantityData(R.drawable.k20,"K20",list[18]))
                    19 -> listDroppedNumber.add(19,QuantityData(R.drawable.k23,"K23",list[19]))
                    20 -> listDroppedNumber.add(20,QuantityData(R.drawable.k26,"K26",list[20]))
                    21 -> listDroppedNumber.add(21,QuantityData(R.drawable.k29,"K29",list[21]))
                    22 -> listDroppedNumber.add(22,QuantityData(R.drawable.k32,"K32",list[22]))
                    23 -> listDroppedNumber.add(23,QuantityData(R.drawable.k35,"K35",list[23]))
                    24 -> listDroppedNumber.add(24,QuantityData(R.drawable.k1,"K1",list[24]))
                    25 -> listDroppedNumber.add(25,QuantityData(R.drawable.k4,"K4",list[25]))
                    26 -> listDroppedNumber.add(26,QuantityData(R.drawable.k7,"K7",list[26]))
                    27 -> listDroppedNumber.add(27,QuantityData(R.drawable.k10,"K10",list[27]))
                    28 -> listDroppedNumber.add(28,QuantityData(R.drawable.k13,"K13",list[28]))
                    29 -> listDroppedNumber.add(29,QuantityData(R.drawable.k16,"K15",list[29]))
                    30 -> listDroppedNumber.add(30,QuantityData(R.drawable.k19,"K19",list[30]))
                    31 -> listDroppedNumber.add(31,QuantityData(R.drawable.k22,"K22",list[31]))
                    32 -> listDroppedNumber.add(32,QuantityData(R.drawable.k25,"K25",list[32]))
                    33 -> listDroppedNumber.add(33,QuantityData(R.drawable.k28,"K28",list[33]))
                    34-> listDroppedNumber.add(34,QuantityData(R.drawable.k31,"K31",list[34]))
                    35 -> listDroppedNumber.add(35,QuantityData(R.drawable.k34,"K34",list[35]))
                }

            }
            Log.d("после",listDroppedNumber.toString())
            return listDroppedNumber
        }
    }