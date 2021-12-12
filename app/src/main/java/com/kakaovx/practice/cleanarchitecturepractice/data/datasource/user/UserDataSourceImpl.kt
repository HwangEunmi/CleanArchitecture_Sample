package com.kakaovx.practice.cleanarchitecturepractice.data.datasource.user

import com.kakaovx.practice.cleanarchitecturepractice.data.api.UserApi

class UserDataSourceImpl(
    private val service: UserApi
) : UserDataSource {
    override suspend fun getUserInfo(username: String) = service.getUserInfo(username)

    override suspend fun getUserList() = service.getUserList()
}