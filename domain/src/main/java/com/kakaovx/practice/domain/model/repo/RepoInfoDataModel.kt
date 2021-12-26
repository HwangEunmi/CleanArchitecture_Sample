package com.kakaovx.practice.domain.model.repo

data class RepoInfoDataModel(
    val repoId: Int,
    val name: String,
    val fullName: String,
    val owner: Owner
) {
    // 해당 View에 필요한 변수 선언
    var repoNum: Int = 0

    data class Owner(
        val profileImgUrl: String,
        val isAdmin: Boolean
    )

    // 확장함수에 필요함
    companion object
}