package com.tjoeum.a20191118_01_getmethodpractice

import android.os.Bundle
import android.widget.Toast
import com.tjoeum.a20191118_01_getmethodpractice.utils.ContenxtUtil
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setupEvents()
        setValues()
    }


    override fun setupEvents() {

        rememberIdChekBox.setOnCheckedChangeListener { buttonView, isChecked ->

            ContenxtUtil.setIdChecked(mContext,isChecked)
            //연습문제
            //각각의 결과를 저장하고 상황에 맞는 토스트를 띄우자
            //앱을 다시 킬 때 체크했던 결과를 이어서 보여주자
            if(isChecked){
                Toast.makeText(mContext,"아이디 저장체크를 하였습니다.", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(mContext,"아이디를 저장체크를 해제하였습니다.", Toast.LENGTH_SHORT).show()

            }


        }

        loginBtn.setOnClickListener {


            if (rememberIdChekBox.isChecked){
                Toast.makeText(mContext,"아이디를 저장해야합니다.", Toast.LENGTH_SHORT).show()

                ContenxtUtil.setUserId(mContext, idEdt.text.toString())
            }
            else{

                Toast.makeText(mContext,"아이디를 저장X.", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun setValues() {

        //저장되어있는 아이디가 뭔지?
        var savedId = ContenxtUtil.getUserId(mContext)
        idEdt.setText(savedId)

        //저장
        rememberIdChekBox.isChecked = ContenxtUtil.getIdChecked(mContext)
    }
}
