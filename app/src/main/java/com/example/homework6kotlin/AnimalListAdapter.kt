package com.example.homework6kotlin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.DrawableRes
import androidx.recyclerview.widget.RecyclerView
import com.example.homework6kotlin.databinding.AnimalsItemBinding

class AnimalListAdapter : RecyclerView.Adapter<AnimalListAdapter.AnimalViewHolder>() {
    private var animals = listOf<Animals>()
    fun setData(data: List<Animals>){
    animals = data
    }

    class AnimalViewHolder(private val binding: AnimalsItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(animals: Animals) = with(binding) {
            ivGaller.setImageResource(animals.animalImage)
            tvText.text = animals.name
            tvWool.text = animals.wool
            tvEars.text = animals.ears.toString()
        }
    }
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
                val binding = AnimalsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                return AnimalViewHolder(binding)
            }

            override fun getItemCount(): Int {
                return animals.size
            }

            override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
                holder.onBind(animals[position])

            }
        }
