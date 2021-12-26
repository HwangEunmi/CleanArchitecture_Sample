package com.kakaovx.practice.cleanarchitecturepractice.core

import com.kakaovx.practice.data.datasource.repo.RepoDataSource
import com.kakaovx.practice.data.datasource.repo.RepoDataSourceImpl
import com.kakaovx.practice.data.datasource.user.UserDataSource
import com.kakaovx.practice.data.datasource.user.UserDataSourceImpl
import com.kakaovx.practice.data.repository.repo.RepoRepositoryImpl
import com.kakaovx.practice.data.repository.user.UserRepositoryImpl
import com.kakaovx.practice.domain.repository.repo.RepoRepository
import com.kakaovx.practice.domain.repository.user.UserRepository
import com.kakaovx.practice.domain.usecase.repo.GetRepoInfoUseCase
import com.kakaovx.practice.domain.usecase.user.GetUserInfoUseCase
import com.kakaovx.practice.domain.usecase.user.GetUserListUseCase
import com.kakaovx.practice.presentation.ui.DetailViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

private val activityViewModel = module {
    viewModel { DetailViewModel(get(), get(), get()) }
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