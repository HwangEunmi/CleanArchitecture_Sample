package com.kakaovx.practice.cleanarchitecturepractice.data.datasource.repo

import com.kakaovx.practice.cleanarchitecturepractice.data.model.repo.RepoInfoResponse

interface RepoDataSource {
    suspend fun getRepositoryInfo(owner: String, repo: String): RepoInfoResponse
}