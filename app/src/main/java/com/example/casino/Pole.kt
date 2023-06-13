package com.example.casino

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.os.bundleOf
import androidx.core.view.ViewCompat.canScrollVertically
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.casino.databinding.FragmentBlankBinding
import com.example.casino.number.ButtonNumberData
import com.example.casino.number.Number
import com.example.casino.number.QuantityData
import com.example.casino.quantity.QuantityNumber
import kotlin.text.Typography.half


class Pole : Fragment(),AdapterPole.onClick{
    private val viewModel: ViewModelFragment by viewModels()
    private lateinit var binding: FragmentBlankBinding
    private  var checkK0 = false
    var width = 0
    var height = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentBlankBinding.inflate(inflater, container, false)
        return binding.root


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val lm: LinearLayoutManager = object : GridLayoutManager(requireContext(),12) {
            override fun canScrollVertically(): Boolean { return false }
        }
        var adapter = AdapterPole(this, Number().ButtonNumber(),height,width )
        binding.idpole.layoutManager = lm
        requireActivity().supportFragmentManager.setFragmentResultListener("width",this){
                key,bundle ->
            bundle.getInt(key).let {
                width = it
                Log.d("хуня 1",width.toString())
                requireActivity().supportFragmentManager.setFragmentResultListener("height",this){
                        key,bundle ->
                    bundle.getInt(key).let {
                        height = it
                        Log.d("хуня 2",height.toString())
                        Log.d("хуня 1",width.toString())
                        width= (width*11/13.45).toInt()
                        height= (height*7.6/10.1).toInt()
                        Log.d("хуня 2",height.toString())
                        Log.d("хуня 1",width.toString())
                        adapter = AdapterPole(this, Number().ButtonNumber(),height,width )
                        binding.idpole.adapter = adapter
                    }
                }
            }
        }
        binding.idpole.adapter = adapter
        printProbability()
        // НЕ ОБРАЩАТЬ ВНИМАНИЯ НА ТО, ЧТО ПРОИСХОДИТ НИЖЕ,
        // СЕЙЧАС 2:28 НОЧИ
        // И Я ЗНАЮ ЧТО ТАК ДЕЛАТЬ НЕЛЬЗЯ, НО МНЕ УЖЕ ВПАДЛУ ЭТО ПЕРЕДЕЛЫВАТЬ



        requireActivity().supportFragmentManager.setFragmentResultListener("check",this){
                key,bundle ->
            bundle.getBoolean(key).let {
                if (it){
                    checkK0=false

                    adapter =AdapterPole(this, Number().ButtonNumber() ,binding.idpole.height,binding.idpole.width )
                    printProbability()
                    binding.apply {
                        quantity0.visibility=View.INVISIBLE
                        quantity00.visibility=View.INVISIBLE
                    }
                } else {
                    checkK0=true
                    adapter =AdapterPole(this, QuantityNumber().droppedNumber(viewModel.numberList) ,binding.idpole.height,binding.idpole.width )
                    printQuantity()
                    binding.apply {
                        quantity0.visibility=View.VISIBLE
                        quantity00.visibility=View.VISIBLE

                    }
                }
                binding.idpole.adapter = adapter
            }
        }
        requireActivity().supportFragmentManager.setFragmentResultListener("delete",this){
                key,bundle ->
            bundle.getBoolean(key).let {
                viewModel.newGame()
                if(it) {
                    printQuantity()
                    adapter =AdapterPole(this, QuantityNumber().droppedNumber(viewModel.numberList),binding.idpole.height,binding.idpole.width  )
                    binding.idpole.adapter = adapter
                }
                else {
                    printProbability()
                    binding.idpole.adapter = adapter
                }


            }
        }

        binding.K0.setOnClickListener {
            writingAValue("K0")
            if(checkK0) printQuantity()
            requireActivity().supportFragmentManager.setFragmentResult("buttonResult",
                bundleOf("buttonResult" to "K0" )) }
        binding.K00.setOnClickListener {
            writingAValue("K00")
            if(checkK0) printQuantity()
            requireActivity().supportFragmentManager.setFragmentResult("buttonResult",
                bundleOf("buttonResult" to "K00" ))
        }

    }



    companion object {
        @JvmStatic
        fun newInstance(args: Bundle?): Pole {
            val fragment = Pole()
            fragment.arguments = args
            return fragment
        }

    }


    override fun ClickNumber(buttonNumberData: ButtonNumberData) {
        writingAValue(buttonNumberData.idResourceId)
        printProbability()
       requireActivity().supportFragmentManager.setFragmentResult("buttonResult",
           bundleOf("buttonResult" to buttonNumberData.idResourceId ))

    }

    override fun ClickQuantity(buttonNumberData: QuantityData):Int {
        writingAValue(buttonNumberData.idResourceId)
        printQuantity()
        requireActivity().supportFragmentManager.setFragmentResult("buttonResult",
            bundleOf("buttonResult" to buttonNumberData.idResourceId ))
        return viewModel.numberList[viewModel.printQuantity(buttonNumberData.idResourceId)]
    }

    private fun writingAValue(number:String){
        viewModel.apply {
            newNumber(number)
            newNumberLine(number)
            newNumberColum(number)
            newNumberHalf(number)
            newNumberRedBlack(number)
            newNumberEvenOdd(number)
            printProbability()
            numberOfZeros(number)
    }
    }

    private fun printProbability(){

        viewModel.apply {
            binding.apply {

            probability1st12.text=conclusion("probability_1ts12")
            probability2nd12.text=conclusion("probability_2nd12")
            probability3rd12.text=conclusion("probability_3rd12")
            probabilityEVEN.text=conclusion("probabilityEVEN")
            probabilityODD.text=conclusion("probabilityODD")
            probabilityRED.text=conclusion("probabilityRED")
            probabilityBLACK.text=conclusion("probabilityBLACK")
            probability1to18.text=conclusion("probability_1to18")
            probability19to36.text=conclusion("probability_19to36")
            probability12to1.text=conclusion("probability_1_1to2")
            probability22to1.text=conclusion("probability_2_1to2")
            probability32to1.text=conclusion("probability_3_1to2")
        } }
    }

    private fun delete(){
        viewModel.newGame()
        printProbability()
    }

    fun printQuantity(){
        viewModel.apply {
            binding.apply {
                probability1st12.text=column[1].toString()
                probability2nd12.text=column[2].toString()
                probability3rd12.text=column[3].toString()
                probabilityEVEN.text=evenOdd[2].toString()
                probabilityODD.text=evenOdd[1].toString()
                probabilityRED.text=redBlack[1].toString()
                probabilityBLACK.text=redBlack[2].toString()
                probability1to18.text=half[1].toString()
                probability19to36.text=half[2].toString()
                probability12to1.text=line[1].toString()
                probability22to1.text=line[2].toString()
                probability32to1.text=line[3].toString()
                quantity0.text=zero[0].toString()
                quantity00.text=zero[1].toString()

            }
        }

    }




}