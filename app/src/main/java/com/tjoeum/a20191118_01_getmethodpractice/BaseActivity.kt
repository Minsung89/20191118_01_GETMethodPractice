package com.tjoeum.a20191118_01_getmethodpractice

import android.content.Context
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity(){

    var mContext : Context = this

    abstract fun setupEvents()

    abstract fun setValues()
}