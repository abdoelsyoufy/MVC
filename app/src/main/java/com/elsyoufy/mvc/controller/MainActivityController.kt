package com.elsyoufy.mvc.controller

import com.elsyoufy.mvc.database.Database
import com.elsyoufy.mvc.pojo.UserInfo

class MainActivityController {

    fun userName() : String ? = Database.getCurrentUserInfo().name


}