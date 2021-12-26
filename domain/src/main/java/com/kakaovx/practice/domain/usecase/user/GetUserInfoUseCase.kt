package com.kakaovx.practice.domain.usecase.user

import com.kakaovx.practice.domain.model.user.UserInfoDataModel
import com.kakaovx.practice.domain.repository.user.UserRepository

class GetUserInfoUseCase(private val repository: UserRepository) {
    suspend operator fun invoke(params: Params): UserInfoDataModel {
        return repository.getUserInfo(params.username)
    }

    data class Params(
        val username: String
    )
}