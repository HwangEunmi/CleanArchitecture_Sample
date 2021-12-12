package com.kakaovx.practice.cleanarchitecturepractice.domain.repository.repo

import com.kakaovx.practice.cleanarchitecturepractice.domain.model.repo.RepoInfoDataModel

interface RepoRepository {
    suspend fun getRepositoryInfo(owner: String, repo: String): RepoInfoDataModel
}