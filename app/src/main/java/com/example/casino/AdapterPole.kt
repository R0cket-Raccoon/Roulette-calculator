package com.example.casino

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.casino.databinding.ButtonRecyclerviewItemBinding
import com.example.casino.databinding.ItemQuantityBinding
import com.example.casino.number.ButtonNumberData
import com.example.casino.number.Data
import com.example.casino.number.QuantityData


class AdapterPole(
    val onclick:onClick,
    private val dataset: List<Data>,
    private val height:Int,
    private val width:Int,
):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class ProbabilityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ButtonRecyclerviewItemBinding.bind(itemView)
        fun bind(buttonNumberData: ButtonNumberData, onclick: onClick,heightImage: Int,widthImage: Int) {
            binding.apply {
                buttonNumber.setImageResource(buttonNumberData.drawableResourceId)
                buttonNumber.layoutParams.width=widthImage/12
                buttonNumber.layoutParams.height=heightImage/3
                buttonNumber.setOnClickListener {
                    onclick.ClickNumber(buttonNumberData)
                }
            }
        }

    }
    class QuantityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemQuantityBinding.bind(itemView)
        fun bind(quantityData: QuantityData, onclick: onClick,heightImage: Int,widthImage: Int) {
            binding.apply {
                buttonNumberQuantity.setImageResource(quantityData.drawableResourceId)
                buttonNumberQuantity.layoutParams.width=widthImage/12
                buttonNumberQuantity.layoutParams.height=heightImage/3
                quantityNumber.text=quantityData.stringResourceId.toString()
                buttonNumberQuantity.setOnClickListener {
                    quantityNumber.text=onclick.ClickQuantity(quantityData).toString()
                }
            }
        }

    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is ProbabilityViewHolder ->holder.bind(dataset[position] as ButtonNumberData,onclick,height,width)
            is QuantityViewHolder ->holder.bind(dataset[position] as QuantityData,onclick,height,width)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when(viewType){
            0->ProbabilityViewHolder(itemView = inflater.inflate(R.layout.button_recyclerview_item,parent,false))
            else->QuantityViewHolder(itemView =inflater.inflate(R.layout.item_quantity,parent,false))
        }

    }

    override fun getItemViewType(position: Int): Int {
        return when(dataset[position]){
            is ButtonNumberData -> 0
            is QuantityData -> 1
        }
    }

    interface onClick {
        fun ClickNumber(buttonNumberData: ButtonNumberData)
        fun ClickQuantity(buttonNumberData: QuantityData):Int
    }



}