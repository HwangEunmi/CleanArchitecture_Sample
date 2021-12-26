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
// TODO : 질문 3) UI에 필요한 포맷은 여기서 다 해주고 싶은데, context가 필요한 행위 (Ex. context.getString())는 어쩔 수 없이 View단에서 해줘야 하는걸까?
// TODO : 질문 4) Data -> Domain Mapper와 Domain -> View Mapper를 구분하는게 좋을까?
// TODO : 질문 5) 데이터 클래스는 어떻게 구분하는게 좋을까?  (질문 4 즉, Mapper와도 연관이 될 듯)
// TODO :         Ex) Data 계층의 데이터 클래스 1개,
// TODO :             Domain 계층의 데이터 클래스 1개 (이때 Data -> Domain용 Mapper 한개 필요)
// TODO :             (근데 생각해보면 Domain 데이터 클래스가 UI단에도 쓰이게 되는거니까, View 데이터 클래스도 만들어줘야 할까,, 너무 많은데..)