package com.kakaovx.practice.data.datasource.repo

import com.kakaovx.practice.data.model.repo.RepoInfoResponse

interface RepoDataSource {
    suspend fun getRepositoryInfo(owner: String, repo: String): RepoInfoResponse
}