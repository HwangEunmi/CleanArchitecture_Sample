package com.kakaovx.practice.data.mapper.user

import com.kakaovx.practice.data.model.user.UserInfoResponse
import com.kakaovx.practice.domain.model.user.UserInfoDataModel

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