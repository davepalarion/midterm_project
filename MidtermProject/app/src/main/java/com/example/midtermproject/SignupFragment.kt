package com.example.midtermproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.midtermproject.databinding.FragmentSignupBinding

class SignupFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentSignupBinding>(
            inflater,
            R.layout.fragment_signup,
            container,
            false)
        binding.newsignup.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_signupFragment_to_loginFragment)

        }
        return binding.root
    }
}