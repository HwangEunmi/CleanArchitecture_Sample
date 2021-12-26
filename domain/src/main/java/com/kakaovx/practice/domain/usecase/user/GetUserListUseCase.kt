package com.kakaovx.practice.domain.usecase.user

import com.kakaovx.practice.domain.model.user.UserInfoDataModel
import com.kakaovx.practice.domain.repository.user.UserRepository

class GetUserListUseCase(private val repository: UserRepository) {
    suspend operator fun invoke(): List<UserInfoDataModel> {
        return repository.getUserList()
    }
}