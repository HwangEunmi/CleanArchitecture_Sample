package com.kakaovx.practice.cleanarchitecturepractice.core

import android.util.Log
import com.kakaovx.practice.cleanarchitecturepractice.BuildConfig
import com.kakaovx.practice.cleanarchitecturepractice.data.api.RepoApi
import com.kakaovx.practice.cleanarchitecturepractice.data.api.UserApi
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val networkModule = module {
    // Dependency : HttpLoggingInterceptor
    single<Interceptor> {
        HttpLoggingInterceptor(object : HttpLoggingInterceptor.Logger {
            override fun log(message: String) {
                Log.d("OkHttp", message)
            }
        }).apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
    }

    // Dependency : OkHttpClient
    single {
        OkHttpClient.Builder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .readTimeout(10, TimeUnit.SECONDS)
            .writeTimeout(10, TimeUnit.SECONDS)
            .addInterceptor(get<Interceptor>())
            .build()
    }

    // Dependency : Retrofit
    single {
        Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .client(get())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    single {
        val retrofit: Retrofit = get()
        retrofit.create(RepoApi::class.java)
    }

    single {
        val retrofit: Retrofit = get()
        retrofit.create(UserApi::class.java)
    }
}