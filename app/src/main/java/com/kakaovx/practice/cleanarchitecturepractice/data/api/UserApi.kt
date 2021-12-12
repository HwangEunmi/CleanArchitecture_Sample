package com.kakaovx.practice.cleanarchitecturepractice.data.api

import com.kakaovx.practice.cleanarchitecturepractice.data.model.user.UserInfoResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface UserApi {
    @GET("/users/{username}")
    suspend fun getUserInfo(
        @Path("username") username: String
    ): UserInfoResponse

    @GET("/users")
    suspend fun getUserList(): List<UserInfoResponse>
}