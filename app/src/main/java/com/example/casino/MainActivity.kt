package com.example.casino


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.casino.databinding.ActivityMainBinding
import com.example.casino.dropped.DroppAdapter


class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    var list:MutableList<String> =mutableListOf()
    private var adapter=DroppAdapter()
    var check = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        binding.quantity.setOnClickListener{

            check = if(check){
                supportFragmentManager.setFragmentResult("check",
                    bundleOf("check" to check ))

                binding.quantity.setText(R.string.Quantity)
                false
            } else{
                supportFragmentManager.setFragmentResult("check",
                    bundleOf("check" to check  ))
                binding.quantity.setText(R.string.Probability)
                true
            }

        }

        binding.delete.setOnClickListener{
            supportFragmentManager.setFragmentResult("delete",
                bundleOf("delete" to check ))
            list.clear()
            adapter.set(list)
        }


        supportFragmentManager.beginTransaction().replace(R.id.Container_pole,Pole()).commit()

        supportFragmentManager.setFragmentResultListener("buttonResult",this@MainActivity){
            key,bundle ->
            bundle.getString(key)?.let {
                list.add(it)
                adapter.set(list)
                binding.recyclerDropped.scrollToPosition(adapter.itemCount -1)
            }
        }

        binding.recyclerDropped.adapter=adapter
        val layoutManager = LinearLayoutManager(this)
        layoutManager.stackFromEnd = true
        layoutManager.reverseLayout = false
        binding.recyclerDropped.layoutManager=layoutManager



    }
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        Log.d("xynz",binding.ContainerPole.width.toString())
        supportFragmentManager.setFragmentResult("width",
            bundleOf("width" to binding.ContainerPole.width ))
        supportFragmentManager.setFragmentResult("height",
            bundleOf("height" to binding.ContainerPole.height ))
    }

}