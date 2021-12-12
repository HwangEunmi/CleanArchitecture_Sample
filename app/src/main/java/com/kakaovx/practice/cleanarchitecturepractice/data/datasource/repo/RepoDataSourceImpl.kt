package com.kakaovx.practice.cleanarchitecturepractice.data.datasource.repo

import com.kakaovx.practice.cleanarchitecturepractice.data.api.RepoApi

class RepoDataSourceImpl(
    private val service: RepoApi
) : RepoDataSource {

    override suspend fun getRepositoryInfo(owner: String, repo: String) = service.getRepositoryInfo(owner, repo)
}