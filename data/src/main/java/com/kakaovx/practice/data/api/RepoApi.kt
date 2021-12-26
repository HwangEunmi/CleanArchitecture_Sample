package com.kakaovx.practice.data.api

import com.kakaovx.practice.data.model.repo.RepoInfoResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface RepoApi {
    @GET("/repos/{owner}/{repo}")
    suspend fun getRepositoryInfo(
        @Path("owner") owner: String,
        @Path("repo") repo: String
    ): RepoInfoResponse
}