package com.pe.edu.idat.myapplication.UI.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pe.edu.idat.myapplication.R
import com.pe.edu.idat.myapplication.databinding.FragmentHomeBinding
import com.pe.edu.idat.myapplication.model.getData

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var viewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel= ViewModelProvider(requireActivity())[HomeViewModel::class.java]
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = RVProductAdapter(listOf())
        binding.rvProducts.adapter = adapter
        binding.rvProducts.layoutManager = GridLayoutManager(requireContext(),2,RecyclerView.VERTICAL,false)
        viewModel.products.observe(requireActivity()){ products ->
            adapter.products = products
            adapter.notifyDataSetChanged()
        }
        viewModel.getProducts()
    }
}