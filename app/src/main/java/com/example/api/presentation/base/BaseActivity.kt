package com.ecourier.courier.presentation.view.base

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.api.R


//abstract class BaseActivity : AppCompatActivity() {

   /* var mProgressDialog: ProgressDialog? = null
//    var progressDialog: KProgressHUD? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setFullScreenLoader()

    }
    abstract fun init()

    private fun setFullScreenLoader() {
        mProgressDialog = ProgressDialog(this)
        mProgressDialog?.setTitle(R.string.please_wait)
        mProgressDialog?.setCancelable(true)

        progressDialog = KProgressHUD.create(this)
            .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE) // .setLabel("Please wait")
            .setDetailsLabel(getString(R.string.please_wait))
            .setCancellable(false)
            .setAnimationSpeed(2)
            .setDimAmount(0.5f)

    }

    fun showToastMessage(message: String) {
        runOnUiThread {
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }
     fun showToastMessageLocal(languageData:LanguageDataE) {
         when(SharedPrefsHelper.getUserLang(Language.TURKISH.name)){
             Language.TURKISH.name -> {
                 this.title = languageData.tr?:""
               runOnUiThread {
                Toast.makeText(this, title, Toast.LENGTH_SHORT).show()
                }
             }
             Language.ENGLISH.name -> {
                 this.title = languageData.en?:""
                 runOnUiThread {
                     Toast.makeText(this, title, Toast.LENGTH_SHORT).show()
                 }
//                 Toast.makeText(this, title, Toast.LENGTH_SHORT).show()

             }
             else -> {
                 this.title = languageData.tr?:""
                 runOnUiThread {
                     Toast.makeText(this, title, Toast.LENGTH_SHORT).show()
                 }
//                 Toast.makeText(this, title, Toast.LENGTH_SHORT).show()
             }
         }
        }
    fun showLoading() {
        if (!progressDialog?.isShowing!!)
            progressDialog!!.show()
    }

    fun hideLoading() {
        progressDialog?.let {
            if (it.isShowing) {
                it.dismiss()
            }
        }
    }

}*/