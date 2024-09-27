package com.brandon.presentation.auth

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.viewModelScope
import com.brandon.presentation.R
import com.brandon.presentation.base.BaseFragment
import com.brandon.presentation.databinding.FragmentAuthenticateBinding

class AuthenticateFragment : BaseFragment<FragmentAuthenticateBinding>() {

    companion object {
        fun newInstance() = AuthenticateFragment()
    }

    private val viewModel: AuthenticateViewModel by viewModels()

    override fun getViewBinding(): FragmentAuthenticateBinding = FragmentAuthenticateBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_authenticate, container, false)
    }

    override fun initViews() {
    }

    override fun observeData() {
        TODO("Not yet implemented")
    }
}