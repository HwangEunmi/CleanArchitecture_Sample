package com.kakaovx.practice.domain.usecase.repo

import com.kakaovx.practice.domain.model.repo.RepoInfoDataModel
import com.kakaovx.practice.domain.repository.repo.RepoRepository

class GetRepoInfoUseCase(private val repository: RepoRepository) {
    suspend operator fun invoke(params: Params): RepoInfoDataModel {
        return repository.getRepositoryInfo(params.owner, params.repo)
    }

    data class Params(
        val owner: String,
        val repo: String
    )
}