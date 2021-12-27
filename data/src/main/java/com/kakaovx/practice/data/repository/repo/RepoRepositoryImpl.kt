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

// TODO : 질문 1) Mapper는 DataSource 쪽에 위치해야할까, Repository 쪽에 위치해야 할까
// 1. << Repository에 위치해야 한다? >>
// Repository 인터페이스는 Domain에 포함되어있다. (단 실제구현체인 RepositoryImpl은 Data쪽에 포함)
// 그리고 DataSource는 Data쪽에 포함되어 있다.
// 이때 Mapper는 Data 계층의 모델을 Domain 계층의 모델로 변환해 주는 역할을 하는데,
// DataSource보다는 Repository가 느낌상 더 Domain에 가까우니까 Repository에 위치해야한다..?

// 2. << DataSource에 위치해야 한다? >>
// Mapping을 수행하려면 Data 계층 의존성과 Domain 계층 의존성 모두를 알고 있어야 하는데
// (Data -> Domain 이므로)
// 각 의존성을 모두 알고 있는 계층은 Data 계층밖에 없다.
// (Domain 계층은 다른 레이어를 대상으로 의존성을 가지지 않고,
// Data 계층은 Domain 계층을 대상으로 의존성을 가지므로)