package com.kakaovx.practice.cleanarchitecturepractice.data.repository.user

import com.kakaovx.practice.cleanarchitecturepractice.data.datasource.user.UserDataSource
import com.kakaovx.practice.cleanarchitecturepractice.data.mapper.user.mapperToUserInfo
import com.kakaovx.practice.cleanarchitecturepractice.data.mapper.user.mapperToUserList
import com.kakaovx.practice.cleanarchitecturepractice.domain.model.user.UserInfoDataModel
import com.kakaovx.practice.cleanarchitecturepractice.domain.repository.user.UserRepository

class UserRepositoryImpl(
    private val userDataSource: UserDataSource
) : UserRepository {
    override suspend fun getUserInfo(username: String): UserInfoDataModel {
        userDataSource.getUserInfo(username).run {
            return mapperToUserInfo(this)
        }
    }

    override suspend fun getUserList(): List<UserInfoDataModel> {
        return mapperToUserList(userDataSource.getUserList())
    }
}