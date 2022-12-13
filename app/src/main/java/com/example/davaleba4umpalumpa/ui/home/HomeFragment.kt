package com.example.davaleba4umpalumpa.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.davaleba4umpalumpa.databinding.FragmentHomeBinding
import android.widget.Button
import androidx.navigation.Navigation
import com.example.davaleba4umpalumpa.R


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arasworibtn.SetOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_navigation_home_to_araswori)
        }
        sworibtn.setonclicklistener {
            Navigation.findNavController(view).navigate(R.id.action_navigation_home_to_swori)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}