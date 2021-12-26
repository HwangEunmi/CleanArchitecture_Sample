package com.kakaovx.practice.data.mapper.user

import com.kakaovx.practice.data.model.user.UserInfoResponse
import com.kakaovx.practice.domain.model.user.UserInfoDataModel

fun mapperToUserInfo(data: UserInfoResponse): UserInfoDataModel {
    return UserInfoDataModel(
        data.id,
        data.login,
        data.avatar_url
    )
}