package com.kakaovx.practice.cleanarchitecturepractice.data.mapper.user

import com.kakaovx.practice.cleanarchitecturepractice.data.model.user.UserInfoResponse
import com.kakaovx.practice.cleanarchitecturepractice.domain.model.user.UserInfoDataModel

fun mapperToUserList(data: List<UserInfoResponse>): List<UserInfoDataModel> {
    return data.map { userInfoResponse ->
        with(userInfoResponse) {
            UserInfoDataModel(
                id,
                login,
                avatar_url
            )
        }
    }
}