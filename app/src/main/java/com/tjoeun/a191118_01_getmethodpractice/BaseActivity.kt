package com.tjoeun.a191118_01_getmethodpractice

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    var mContext = this

    abstract  fun setupEvents()
    abstract  fun setValues()

}