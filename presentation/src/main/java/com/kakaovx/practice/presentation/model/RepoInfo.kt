package com.kakaovx.practice.presentation.model

import com.kakaovx.practice.domain.model.repo.RepoInfoDataModel

fun RepoInfoDataModel.Companion.makeRepoInfoUiData(data: RepoInfoDataModel): RepoInfoDataModel {
    with(data) {
        val result = RepoInfoDataModel(
            repoId * 10,
            name,
            fullName,
            owner
        )

        result.repoNum = repoId * 100
        return result
    }
}
