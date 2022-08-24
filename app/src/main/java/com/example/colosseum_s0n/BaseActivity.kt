package com.example.colosseum_s0n

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity :AppCompatActivity() {

    val mContext =this

    abstract fun setupEvents()  //이벤트처리하는
    abstract fun setValues()  //화면에 데이터 띄울떄

}
