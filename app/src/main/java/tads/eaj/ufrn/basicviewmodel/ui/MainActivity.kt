package tads.eaj.ufrn.basicviewmodel.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import tads.eaj.ufrn.basicviewmodel.R
import tads.eaj.ufrn.basicviewmodel.databinding.ActivityMainBinding
import tads.eaj.ufrn.basicviewmodel.viewmodel.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        binding.vmodel = viewModel
        binding.lifecycleOwner = this
    }
}