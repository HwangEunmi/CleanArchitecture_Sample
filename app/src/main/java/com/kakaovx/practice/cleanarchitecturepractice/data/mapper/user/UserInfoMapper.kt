package com.kakaovx.practice.cleanarchitecturepractice.data.mapper.user

import com.kakaovx.practice.cleanarchitecturepractice.data.model.user.UserInfoResponse
import com.kakaovx.practice.cleanarchitecturepractice.domain.model.user.UserInfoDataModel

fun mapperToUserInfo(data: UserInfoResponse): UserInfoDataModel {
    return UserInfoDataModel(
        data.id,
        data.login,
        data.avatar_url
    )
}