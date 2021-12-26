package com.kakaovx.practice.domain.repository.user

import com.kakaovx.practice.domain.model.user.UserInfoDataModel

interface UserRepository {
    suspend fun getUserInfo(username: String): UserInfoDataModel

    suspend fun getUserList(): List<UserInfoDataModel>
}