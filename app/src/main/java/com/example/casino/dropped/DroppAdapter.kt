package com.example.casino.dropped

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.casino.AdapterPole
import com.example.casino.MainActivity
import com.example.casino.R
import com.example.casino.databinding.ItemDroppedBinding


class DroppAdapter():RecyclerView.Adapter<DroppAdapter.Holder>() {
    private var dataset:MutableList<DroppedNumberData> = mutableListOf()

    fun set(listDropped:MutableList<String>){
        val droppDiffCallback =DroppedDiffCallback(dataset,DroppedNumber().droppedNumber(listDropped))
        val diffResult = DiffUtil.calculateDiff(droppDiffCallback)
        dataset=DroppedNumber().droppedNumber(listDropped)
        diffResult.dispatchUpdatesTo(this)

    }

    class Holder(view:View):RecyclerView.ViewHolder(view){
        private val binding = ItemDroppedBinding.bind(view)
        fun bind(droppedNumberData: DroppedNumberData){
            binding.apply {
                droppNumber.setImageResource(droppedNumberData.drawableRes)
            droppNumber.id=droppedNumberData.idRes}}

    }

    override fun getItemCount(): Int = dataset.size


    override fun onBindViewHolder(holder: DroppAdapter.Holder, position: Int) {
       holder.bind(dataset[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DroppAdapter.Holder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(
            R.layout.item_dropped, parent, false
        )


        return DroppAdapter.Holder(adapterLayout)
    }


}