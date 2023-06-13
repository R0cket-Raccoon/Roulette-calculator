package com.example.casino.dropped

import android.util.Log
import com.example.casino.R
import com.example.casino.number.ButtonNumberData

class DroppedNumber {
    fun droppedNumber(list: MutableList<String>): MutableList<DroppedNumberData> {
        var listDroppedNumber:MutableList<DroppedNumberData> = mutableListOf()
        for(i in 0 until list.size) {
            when (list[i]) {
                "K00" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r00,R.id.K00))
                "K0" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r0,R.id.K0))
                "K1" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r1,R.id.K1))
                "K2" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r2,R.id.K2))
                "K3" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r3,R.id.K3))
                "K4" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r4,R.id.K4))
                "K5" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r5,R.id.K5))
                "K6" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r6,R.id.K6))
                "K7" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r7,R.id.K7))
                "K8" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r8,R.id.K8))
                "K9" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r9,R.id.K9))
                "K10" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r10,R.id.K10))
                "K11" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r11,R.id.K11))
                "K12" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r12,R.id.K12))
                "K13" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r13,R.id.K13))
                "K14" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r14,R.id.K14))
                "K15" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r15,R.id.K15))
                "K16" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r16,R.id.K16))
                "K17" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r17,R.id.K17))
                "K18" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r18,R.id.K18))
                "K19" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r19,R.id.K19))
                "K20" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r20,R.id.K20))
                "K21" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r21,R.id.K21))
                "K22" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r22,R.id.K22))
                "K23" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r23,R.id.K23))
                "K24" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r24,R.id.K24))
                "K25" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r25,R.id.K25))
                "K26" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r26,R.id.K26))
                "K27" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r27,R.id.K27))
                "K28" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r28,R.id.K28))
                "K29" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r29,R.id.K29))
                "K30" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r30,R.id.K30))
                "K31" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r31,R.id.K31))
                "K32" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r32,R.id.K32))
                "K33" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r33,R.id.K33))
                "K34" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r34,R.id.K34))
                "K35" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r35,R.id.K35))
                "K36" -> listDroppedNumber.add(DroppedNumberData(R.drawable.r36,R.id.K36))
            }

        }
        return listDroppedNumber
    }
}