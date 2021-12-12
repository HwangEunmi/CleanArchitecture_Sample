package com.kakaovx.practice.cleanarchitecturepractice.data.model.repo

data class RepoInfoResponse(
    val id: Int,
    val node_id: String,
    val name: String,
    val full_name: String,
    val owner: Owner
) {
    data class Owner(
        val id: Int,
        val avatar_url: String,
        val html_url: String,
        val site_admin: Boolean
    )
}