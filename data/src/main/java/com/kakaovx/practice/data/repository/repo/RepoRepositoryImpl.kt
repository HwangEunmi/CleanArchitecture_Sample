package com.kakaovx.practice.data.repository.repo

import com.kakaovx.practice.data.datasource.repo.RepoDataSource
import com.kakaovx.practice.data.mapper.repo.mapperToRepoInfo
import com.kakaovx.practice.domain.model.repo.RepoInfoDataModel
import com.kakaovx.practice.domain.repository.repo.RepoRepository

class RepoRepositoryImpl(
    private val repoDataSource: RepoDataSource
) : RepoRepository {
    override suspend fun getRepositoryInfo(owner: String, repo: String): RepoInfoDataModel {
        repoDataSource.getRepositoryInfo(owner, repo).run {
            return mapperToRepoInfo(this)
        }
    }
}