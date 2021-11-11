package com.example.midtermproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.midtermproject.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentLoginBinding>(
            inflater,
            R.layout.fragment_login,
            container,
            false)

        binding.btnlogin.setOnClickListener{view : View ->
            val username = binding.editusername.text.toString()
            val password = binding.editpassword.text.toString()

            if ((username == "qisrono") && (password == "qisrono12345")){
                view.findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
                val toast = Toast.makeText(context, "Welcome $username", Toast.LENGTH_SHORT)
                toast.show()
            }
            else{
                val toast = Toast.makeText(context,"Username or Password incorrect", Toast.LENGTH_SHORT)
                toast.show()
            }


        }

        binding.btnsignup.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_loginFragment_to_signupFragment)

        }
        return binding.root

    }
}