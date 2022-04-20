package com.ecourier.courier.presentation.view.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

/*

abstract class BaseFragment : Fragment(){
    abstract fun getLayout(): Int
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(getLayout(), container, false)
        return view
    }
    abstract fun init()

    fun showLoading(){
        getBaseActivity().showLoading()
    }

    fun hideLoading(){
        getBaseActivity().hideLoading()
    }
    fun showToastMessage(message: String) {
        getBaseActivity().showToastMessage(message)
    }
    fun showToastMessageLocal(message: LanguageDataE) {
        getBaseActivity().showToastMessageLocal(message)
    }
    protected fun getBaseActivity(): BaseActivity {
        return (activity as BaseActivity)
    }
}*/
