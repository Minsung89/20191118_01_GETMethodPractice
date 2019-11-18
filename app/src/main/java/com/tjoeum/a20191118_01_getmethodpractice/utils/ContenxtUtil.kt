package com.tjoeum.a20191118_01_getmethodpractice.utils

import android.content.Context

class ContenxtUtil {

    companion object {

        //메모장의 파일 이름에 대응되는 개념
        val prefnName = "PracticePrefference"

        //사용자의 아이디를 저장하는 항목이름
        val USER_ID = "USER_ID"

        val USER_ID_CHECKED = "USER_ID_CHECKED"

        val USER_TOKEN = "USER_TOKEN"

        //사용자 아이디를 저장해주는 func -> setter
        fun setUserId(context: Context, userId: String){

            //메모장(파일이름 : PracticePrefference)을 실제로 여는 동작
            var pref = context.getSharedPreferences(prefnName,Context.MODE_PRIVATE)

            //내용을 작성하고 SAVE 버튼 누름
            pref.edit().putString(USER_ID, userId).apply()
        }

        fun getUserId(context: Context) : String{
            var pref = context.getSharedPreferences(prefnName,Context.MODE_PRIVATE)

            return pref.getString(USER_ID,"")!!
        }

        //사용자 아이디를 저장해주는 func -> setter
        fun setIdChecked(context: Context, userIdCheck: Boolean){

            //메모장(파일이름 : PracticePrefference)을 실제로 여는 동작
            var pref = context.getSharedPreferences(prefnName,Context.MODE_PRIVATE)
            //내용을 작성하고 SAVE 버튼 누름
            pref.edit().putBoolean(USER_ID_CHECKED, userIdCheck).apply()
        }

        fun getIdChecked(context: Context) : Boolean{
            var pref = context.getSharedPreferences(prefnName,Context.MODE_PRIVATE)

            return pref.getBoolean(USER_ID_CHECKED,false)!!
        }

        fun setUserToken(context: Context, userToken: String){

            //메모장(파일이름 : PracticePrefference)을 실제로 여는 동작
            var pref = context.getSharedPreferences(prefnName,Context.MODE_PRIVATE)

            //내용을 작성하고 SAVE 버튼 누름
            pref.edit().putString(USER_TOKEN, userToken).apply()
        }

        fun getUserToken(context: Context) : String{
            var pref = context.getSharedPreferences(prefnName,Context.MODE_PRIVATE)

            return pref.getString(USER_TOKEN,"")!!
        }


    }
}