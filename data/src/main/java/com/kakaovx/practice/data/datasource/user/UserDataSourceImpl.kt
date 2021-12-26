package com.kakaovx.practice.data.datasource.user

import com.kakaovx.practice.data.api.UserApi
import com.kakaovx.practice.data.datasource.user.UserDataSource

class UserDataSourceImpl(
    private val service: UserApi
) : UserDataSource {
    override suspend fun getUserInfo(username: String) = service.getUserInfo(username)

    override suspend fun getUserList() = service.getUserList()
}