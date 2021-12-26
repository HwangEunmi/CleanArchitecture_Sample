package com.kakaovx.practice.data.mapper.repo

import com.kakaovx.practice.data.model.repo.RepoInfoResponse
import com.kakaovx.practice.cleanarchitecturepractice.domain.model.repo.RepoInfoDataModel

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

// TODO : 질문 2) Mapper는 함수로 만드는게 좋을까, 클래스로 만드는게 좋을까?
// 만약 클래스로 만든다면 공통으로 쓰는 작업등을 따로 뺄 수도 있지만
// (Ex. Response로 내려오는 Code나 Message에 어떠한 작업을 해준다던지?)
// 단점은 API를 호출할때마다 Mapepr가 사용될 경우, 그때마다 객체생성을 하게 된다.
// (현재 회사 프로젝트는 클래스로 만들고 있음)

// 반면에 함수로 만든다면 객체생성을 하지 않아도 된다.