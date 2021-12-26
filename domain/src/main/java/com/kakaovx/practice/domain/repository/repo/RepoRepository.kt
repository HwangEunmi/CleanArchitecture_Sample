package com.kakaovx.practice.domain.repository.repo

import com.kakaovx.practice.domain.model.repo.RepoInfoDataModel

interface RepoRepository {
    suspend fun getRepositoryInfo(owner: String, repo: String): RepoInfoDataModel
}