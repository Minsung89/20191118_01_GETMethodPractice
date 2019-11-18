package com.tjoeum.a20191118_01_getmethodpractice.datas

import org.json.JSONObject

class User {

    var userId = ""
    var userName = ""
    var userPhone = ""
    var userCategory = Category()

    companion object{
        fun getUserFromJson(json:JSONObject) : User{

            val user = User()
            user.userId = json.getString("id")
            user.userName = json.getString("name")
            user.userPhone = json.getString("phone")

            user.userCategory = Category.getCategoryFromJson(json.getJSONObject("category"))



            return user
        }
    }

}
