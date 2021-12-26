package com.kakaovx.practice.data.datasource.user

import com.kakaovx.practice.data.model.user.UserInfoResponse

interface UserDataSource {
    suspend fun getUserInfo(username: String): UserInfoResponse

    suspend fun getUserList(): List<UserInfoResponse>
}