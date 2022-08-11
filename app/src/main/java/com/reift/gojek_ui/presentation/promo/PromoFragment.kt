package com.reift.gojek_ui.presentation.promo

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.reift.gojek_ui.R

class PromoFragment : Fragment() {

    companion object {
        fun newInstance() = PromoFragment()
    }

    private lateinit var viewModel: PromoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_promo, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PromoViewModel::class.java)
        // TODO: Use the ViewModel
    }

}