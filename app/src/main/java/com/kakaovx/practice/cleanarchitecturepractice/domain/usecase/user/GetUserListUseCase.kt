package com.kakaovx.practice.cleanarchitecturepractice.domain.usecase.user

import com.kakaovx.practice.cleanarchitecturepractice.domain.model.user.UserInfoDataModel
import com.kakaovx.practice.cleanarchitecturepractice.domain.repository.user.UserRepository

class GetUserListUseCase(private val repository: UserRepository) {
    suspend operator fun invoke(): List<UserInfoDataModel> {
        return repository.getUserList()
    }
}