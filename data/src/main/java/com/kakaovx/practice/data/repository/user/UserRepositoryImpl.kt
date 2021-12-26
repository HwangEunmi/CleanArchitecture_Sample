package com.kakaovx.practice.data.repository.user

import com.kakaovx.practice.data.datasource.user.UserDataSource
import com.kakaovx.practice.data.mapper.user.mapperToUserInfo
import com.kakaovx.practice.data.mapper.user.mapperToUserList
import com.kakaovx.practice.domain.model.user.UserInfoDataModel
import com.kakaovx.practice.domain.repository.user.UserRepository

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