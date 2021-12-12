package com.kakaovx.practice.cleanarchitecturepractice.domain.usecase.user

import com.kakaovx.practice.cleanarchitecturepractice.domain.model.user.UserInfoDataModel
import com.kakaovx.practice.cleanarchitecturepractice.domain.repository.user.UserRepository

class GetUserInfoUseCase(private val repository: UserRepository) {
    suspend operator fun invoke(params: Params): UserInfoDataModel {
        return repository.getUserInfo(params.username)
    }

    data class Params(
        val username: String
    )
}