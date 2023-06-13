package com.example.casino

import android.os.Parcel
import android.os.Parcelable
import androidx.lifecycle.ViewModel

class ViewModelFragment() :ViewModel() {
    private var _numberList: MutableList<Int> = mutableListOf(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,)
    val numberList : MutableList<Int> get()=_numberList
    private var _line: MutableList<Int> = mutableListOf(0,0,0,0,)
    val line : MutableList<Int> get()=_line
    private var _column: MutableList<Int> = mutableListOf(0,0,0,0,)
    val column : MutableList<Int> get()=_column
    private var _half: MutableList<Int> = mutableListOf(0,0,0,)
    val half : MutableList<Int> get()=_half
    private var _redBlack: MutableList<Int> = mutableListOf(0,0,0,)
    val redBlack : MutableList<Int> get()=_redBlack
    private var _evenOdd: MutableList<Int> = mutableListOf(0,0,0,)
    val evenOdd : MutableList<Int> get()=_evenOdd
    private var _zero: MutableList<Int>  = mutableListOf(0,0,)
    val zero: MutableList<Int> get() =_zero

    fun numberOfZeros(number: String):MutableList<Int>{
        when(number){
            "K0"->_zero[0]++
            "K00"->_zero[1]++
        }
        return _zero
    }

    fun newNumber (number: String): MutableList<Int> {
        when (number) {
            "K3" -> _numberList[0] ++
            "K6" -> _numberList[1] ++
            "K9" -> _numberList[2] ++
            "K12" -> _numberList[3] ++
            "K15" -> _numberList[4] ++
            "K18" -> _numberList[5] ++
            "K21" -> _numberList[6] ++
            "K24" -> _numberList[7] ++
            "K27" -> _numberList[8] ++
            "K30" -> _numberList[9] ++
            "K33" -> _numberList[10] ++
            "K36" -> _numberList[11] ++
            "K2" -> _numberList[12] ++
            "K5" -> _numberList[13] ++
            "K8" -> _numberList[14] ++
            "K11" -> _numberList[15] ++
            "K14" -> _numberList[16] ++
            "K17" -> _numberList[17] ++
            "K20" -> _numberList[18] ++
            "K23" -> _numberList[19] ++
            "K26" -> _numberList[20] ++
            "K29" -> _numberList[21] ++
            "K32" -> _numberList[22] ++
            "K35" -> _numberList[23] ++
            "K1" -> _numberList[24] ++
            "K4" -> _numberList[25] ++
            "K7" -> _numberList[26] ++
            "K10" -> _numberList[27] ++
            "K13" -> _numberList[28] ++
            "K16" -> _numberList[29] ++
            "K19" -> _numberList[30] ++
            "K22" -> _numberList[31] ++
            "K25" -> _numberList[32] ++
            "K28" -> _numberList[33] ++
            "K31" -> _numberList[34] ++
            "K34" -> _numberList[35] ++
        }
        return _numberList
    }

    fun printQuantity (number: String): Int{
        return when (number){
            "K3" -> 0
            "K6" -> 1
            "K9" -> 2
            "K12" -> 3
            "K15" -> 4
            "K18" -> 5
            "K21" -> 6
            "K24" -> 7
            "K27" -> 8
            "K30" -> 9
            "K33" -> 10
            "K36" -> 11
            "K2" -> 12
            "K5" -> 13
            "K8" -> 14
            "K11" -> 15
            "K14" -> 16
            "K17" -> 17
            "K20" -> 18
            "K23" -> 19
            "K26" -> 20
            "K29" -> 21
            "K32" -> 22
            "K35" -> 23
            "K1" -> 24
            "K4" -> 25
            "K7" -> 26
            "K10" -> 27
            "K13" -> 28
            "K16" -> 29
            "K19" -> 30
            "K22" -> 31
            "K25" -> 32
            "K28" -> 33
            "K31"-> 34
            else -> 35
        }

    }



    fun newNumberLine(number: String): MutableList<Int> {
        when (number) {
            "K1", "K4", "K7", "K10", "K13", "K16", "K19", "K22", "K25", "K28", "K31", "K34"
            -> _line[3]++
            "K2", "K5", "K8", "K11", "K14", "K17", "K20", "K23", "K26", "K29", "K32", "K35"
            -> _line[2]++
            "K3", "K6", "K9", "K12", "K15", "K18", "K21", "K24", "K27", "K30", "K33", "K36"
            -> _line[1]++
            "K0", "K00" -> _line[0]++
        }
        return _line
    }

    fun newNumberColum(number: String,): MutableList<Int> {
        when (number) {
            "K1", "K2", "K3", "K4", "K5", "K6", "K7", "K8", "K9", "K10", "K11", "K12"
            -> _column[1]++
            "K13", "K14", "K15", "K16", "K17", "K18", "K19", "K20", "K21", "K22", "K23", "24"
            -> _column[2]++
            "K25", "K26", "K27", "K28", "K29", "K30", "K31", "K32", "K33", "K34", "K35", "K36"
            -> _column[3]++
            "K0", "K00" -> _column[0]++
        }
        return _column
    }

    fun newNumberHalf(number: String, ): MutableList<Int> {
        when (number) {
            "K1", "K2", "K3", "K4", "K5", "K6", "K7", "K8", "K9", "K10", "K11", "K12", "K13", "K14",
            "K15", "K16", "K17", "K18"
            -> _half[1]++
            "K19", "K20", "K21", "K22", "K23", "K24", "K25", "K26", "K27", "K28", "K29", "K30", "K31",
            "K32", "K33", "K34", "K35", "K36"
            -> _half[2]++
            "K0", "K00" -> _half[0]++
        }
        return _half
    }

    fun newNumberRedBlack(number: String,): MutableList<Int> {
        when (number) {
            "K1", "K3", "K5", "K7", "K9", "K12", "K14", "K16", "K18", "K19", "K21", "K23", "K25",
            "K27", "K30", "K32", "K34", "K36" -> _redBlack[1]++
            "K2", "K4", "K6", "K8", "K10", "K11", "K13", "K15", "K17", "K20", "K22", "K24", "K26",
            "K28", "K29", "K31", "K33", "K35" -> _redBlack[2]++
            "K0", "K00" -> _redBlack[0]++
        }
        return _redBlack
    }
    fun newNumberEvenOdd(number: String,): MutableList<Int> {
        when (number) {
            "K1", "K3", "K5", "K7", "K9","K11", "K13", "K15", "K17","K19", "K21", "K23", "K25",
            "K27","K29", "K31", "K33", "K35"-> _evenOdd[1]++
            "K2", "K4", "K6", "K8", "K10","K12", "K14", "K16", "K18","K20", "K22", "K24", "K26",
            "K28","K30", "K32", "K34", "K36" -> _evenOdd[2]++
            "K0", "K00" -> _evenOdd[0]++
        }
        return _evenOdd
    }
    private var _probability_1ts12 :Int=32
    val probability_1st12 :Int get()=_probability_1ts12
    private var _probability_2nd12:Int=32
    val probability_2nd12:Int get()=_probability_2nd12
    private var _probability_3rd12:Int=32
    val probability_3rd12:Int get()=_probability_3rd12
    private var _probabilityRED:Int=47
    val probabilityRED:Int get() =_probabilityRED
    private var _probabilityBLACK:Int=47
    val probabilityBLACK:Int get() =_probabilityBLACK
    private var _probabilityEVEN:Int=47
    val probabilityEVEN:Int get() =_probabilityEVEN
    private var _probabilityODD:Int=47
    val probabilityODD:Int get() =_probabilityODD
    private var _probability_1_1to2:Int=32
    val probability_1_1to2:Int get() =_probability_1_1to2
    private var _probability_2_1to2:Int=32
    val probability_2_1to2:Int get() =_probability_2_1to2
    private var _probability_3_1to2:Int=32
    val probability_3_1to2:Int get() =_probability_3_1to2
    private var _probability_1to18:Int=32
    val probability_1to18:Int get() =_probability_1to18
    private var _probability_19to36:Int=32
    val probability_19to36:Int get() =_probability_19to36



    // определяем как давно падало чисто
    private fun prescriptionOfAppearance(list: MutableList<Int>, number: Int):Int{
        var x=0
        for (i in list.size- 1 downTo 0){
            if(list[i]==number) {
                x++
                if (x==2) return list.size - i
           }
        }
        return list.size
    }
   // определяем максимального количества выпаданий какого либо сектора
    private fun max(list: MutableList<Int>):Int{
        var max=0
        for(i in 1 until list.size){
            if(list[i]>max) max=list[i]
        }
        return max
    }



    private fun theProbability( list: MutableList<Int>, number: Int,quant:Int): Double{
        var proportions=0.0
        for(i in 1..quant){
            proportions += 1+(max(list) -list[i])

        }
        return  (100*((max(list) -list[number]+1)/proportions))


    }


    fun conclusion(str:String):String {
        when (str) {
            "probability_1ts12" ->
                return (theProbability( column, 1,3)).toInt()
                    .toString() + "%"
            "probability_2nd12" ->
                return (theProbability( column, 2,3)).toInt()
                    .toString() + "%"
            "probability_3rd12" ->
                return (theProbability( column, 3,3)).toInt()
                    .toString() + "%"
            "probabilityRED" ->
                return (theProbability( redBlack, 1,2)).toInt()
                    .toString() + "%"
            "probabilityBLACK" ->
                return (theProbability( redBlack, 2,2)).toInt()
                    .toString() + "%"
            "probabilityODD" ->
                return (theProbability( evenOdd, 1,2)).toInt()
                    .toString() + "%"
            "probabilityEVEN" ->
                return (theProbability( evenOdd, 2,2)).toInt()
                    .toString() + "%"
            "probability_1to18" ->
                return (theProbability( half, 1,2)).toInt()
                    .toString() + "%"
            "probability_19to36" ->
                return (theProbability( half, 2,2)).toInt()
                    .toString() + "%"
            "probability_1_1to2" ->
                return (theProbability( line, 1,3)).toInt()
                    .toString() + "%"
            "probability_2_1to2" ->
                return (theProbability( line, 2,3)).toInt()
                    .toString() + "%"
            "probability_3_1to2" ->
                return (theProbability( line, 3,3)).toInt()
                    .toString() + "%"

        }
        return "ливай с казика"
    }

    fun newGame(){
        _numberList = mutableListOf(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,)
        _line = mutableListOf(0,0,0,0,)
        _column =mutableListOf(0,0,0,0,)
        _half = mutableListOf(0,0,0,)
        _redBlack = mutableListOf(0,0,0,)
        _evenOdd = mutableListOf(0,0,0,)
        _zero= mutableListOf(0,0,)
            }
}
