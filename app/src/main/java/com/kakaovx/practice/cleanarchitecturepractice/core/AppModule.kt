package com.kakaovx.practice.cleanarchitecturepractice.core

import com.kakaovx.practice.cleanarchitecturepractice.data.datasource.repo.RepoDataSource
import com.kakaovx.practice.cleanarchitecturepractice.data.datasource.repo.RepoDataSourceImpl
import com.kakaovx.practice.cleanarchitecturepractice.data.datasource.user.UserDataSource
import com.kakaovx.practice.cleanarchitecturepractice.data.datasource.user.UserDataSourceImpl
import com.kakaovx.practice.cleanarchitecturepractice.data.repository.repo.RepoRepositoryImpl
import com.kakaovx.practice.cleanarchitecturepractice.data.repository.user.UserRepositoryImpl
import com.kakaovx.practice.cleanarchitecturepractice.domain.repository.repo.RepoRepository
import com.kakaovx.practice.cleanarchitecturepractice.domain.repository.user.UserRepository
import com.kakaovx.practice.cleanarchitecturepractice.domain.usecase.repo.GetRepoInfoUseCase
import com.kakaovx.practice.cleanarchitecturepractice.domain.usecase.user.GetUserInfoUseCase
import com.kakaovx.practice.cleanarchitecturepractice.domain.usecase.user.GetUserListUseCase
import com.kakaovx.practice.cleanarchitecturepractice.presentation.ui.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

private val activityViewModel = module {
    viewModel { MainViewModel(get(), get(), get()) }
}

private val dataModule = module {
    single<RepoRepository> { RepoRepositoryImpl(get()) }
    single<RepoDataSource> { RepoDataSourceImpl(get()) }
    single<UserRepository> { UserRepositoryImpl(get()) }
    single<UserDataSource> { UserDataSourceImpl(get()) }

    single { GetRepoInfoUseCase(get()) }
    single { GetUserInfoUseCase(get()) }
    single { GetUserListUseCase(get()) }
}

val appModules = listOf(
    activityViewModel,
    dataModule,
    networkModule
)