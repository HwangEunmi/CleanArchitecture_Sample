package com.kakaovx.practice.cleanarchitecturepractice.domain.repository.user

import com.kakaovx.practice.cleanarchitecturepractice.domain.model.user.UserInfoDataModel

interface UserRepository {
    suspend fun getUserInfo(username: String): UserInfoDataModel

    suspend fun getUserList(): List<UserInfoDataModel>
}