package com.kakaovx.practice.data.datasource.repo

import com.kakaovx.practice.data.api.RepoApi
import com.kakaovx.practice.data.datasource.repo.RepoDataSource

class RepoDataSourceImpl(
    private val service: RepoApi
) : RepoDataSource {

    override suspend fun getRepositoryInfo(owner: String, repo: String) = service.getRepositoryInfo(owner, repo)
}