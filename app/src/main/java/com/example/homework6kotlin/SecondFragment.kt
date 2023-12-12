package com.example.homework6kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.DrawableRes
import androidx.recyclerview.widget.GridLayoutManager
import com.example.homework6kotlin.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding: FragmentSecondBinding get() = _binding!!
    private val animalsLisiAdapter = AnimalListAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    fillAnimalsList()
    setupRecycleView()
    }

    private fun fillAnimalsList() {
        val animalsList = listOf(
        Animals(R.drawable.bear, "Медведь", "Корочневый", 2),
        Animals(R.drawable.elk, "Лось", "Светло-коричневый", 2),
        Animals(R.drawable.fox, "Лиса", "Бело-оранжевый", 2),
        Animals(R.drawable.lion, "Лев", "Тёмно-оранжевый", 2),
        Animals(R.drawable.lynx, "Рысь", "Белый", 2),
        Animals(R.drawable.monkey, "Обизьяна", "Чёрный", 2),
        Animals(R.drawable.pitbul, "Питбуль", "Бело-чёрный", 2),
        Animals(R.drawable.wolf, "Волк", "Серый", 2)
        )

    animalsLisiAdapter.setData(animalsList)
    }

    private fun setupRecycleView() {
        binding.rvAnimal.adapter = animalsLisiAdapter

    }
}