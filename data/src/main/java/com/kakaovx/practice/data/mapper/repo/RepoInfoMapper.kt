package com.kakaovx.practice.data.mapper.repo

import com.kakaovx.practice.data.model.repo.RepoInfoResponse
import com.kakaovx.practice.domain.model.repo.RepoInfoDataModel

fun mapperToRepoInfo(data: RepoInfoResponse): RepoInfoDataModel {
    return RepoInfoDataModel(
        data.id,
        data.name,
        data.full_name,
        with(data.owner) {
            RepoInfoDataModel.Owner(
                avatar_url,
                site_admin
            )
        }
    )
}
