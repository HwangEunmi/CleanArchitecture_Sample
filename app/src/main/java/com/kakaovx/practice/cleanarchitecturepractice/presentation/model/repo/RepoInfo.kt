package com.kakaovx.practice.cleanarchitecturepractice.presentation.model.repo

import com.kakaovx.practice.cleanarchitecturepractice.domain.model.repo.RepoInfoDataModel

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
// TODO : 질문 3) UI에 필요한 포맷은 여기서 다 해주고 싶은데, context가 필요한 행위 (Ex. context.getString())는 어쩔 수 없이 View단에서 해줘야 하는걸까?