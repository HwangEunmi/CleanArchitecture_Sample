package com.kakaovx.practice.cleanarchitecturepractice.data.datasource.user

import com.kakaovx.practice.cleanarchitecturepractice.data.model.user.UserInfoResponse

interface UserDataSource {
    suspend fun getUserInfo(username: String): UserInfoResponse

    suspend fun getUserList(): List<UserInfoResponse>
}