package com.tjoeum.a20191118_01_getmethodpractice

import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setupEvents()
        setValues()
    }


    override fun setupEvents() {

        loginBtn.setOnClickListener {

            if (rememberIdChekBox.isChecked){
                Toast.makeText(mContext,"아이디를 저장해야합니다.", Toast.LENGTH_SHORT).show()
            }
            else{

                Toast.makeText(mContext,"아이디를 저장X.", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun setValues() {
    }
}
