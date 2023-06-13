package com.example.casino.dropped

import androidx.recyclerview.widget.DiffUtil

class DroppedDiffCallback (
    private val oldList:MutableList<DroppedNumberData>,
    private val newList:MutableList<DroppedNumberData>
): DiffUtil.Callback(){
    override fun getOldListSize(): Int = oldList.size

    override fun getNewListSize(): Int = newList.size


    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldItemPosition==newItemPosition
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldDroppNumber=oldList[oldItemPosition]
        val newDroppNumber=newList[newItemPosition]
        return oldDroppNumber==newDroppNumber
    }

}