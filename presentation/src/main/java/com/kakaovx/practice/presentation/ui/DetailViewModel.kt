package com.kakaovx.practice.presentation.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kakaovx.practice.domain.model.repo.RepoInfoDataModel
import com.kakaovx.practice.domain.model.user.UserInfoDataModel
import com.kakaovx.practice.domain.usecase.repo.GetRepoInfoUseCase
import com.kakaovx.practice.domain.usecase.user.GetUserInfoUseCase
import com.kakaovx.practice.domain.usecase.user.GetUserListUseCase
import com.kakaovx.practice.presentation.model.makeRepoInfoUiData
import kotlinx.coroutines.launch

class DetailViewModel(
    private val getRepoInfoUseCase: GetRepoInfoUseCase,
    private val getUserInfoUseCase: GetUserInfoUseCase,
    private val getUserListUseCase: GetUserListUseCase
) : ViewModel() {
    private val _repoInfoItem: MutableLiveData<RepoInfoDataModel> = MutableLiveData()
    val repoInfoItem: LiveData<RepoInfoDataModel> = _repoInfoItem

    private val _userInfoItem: MutableLiveData<UserInfoDataModel> = MutableLiveData()
    val userInfoItem: LiveData<UserInfoDataModel> = _userInfoItem

    private val _userItems: MutableLiveData<List<UserInfoDataModel>> = MutableLiveData()
    val userItems: LiveData<List<UserInfoDataModel>> = _userItems


    fun getRepoInfo(owner: String, repo: String) {
        viewModelScope.launch {
            val result = getRepoInfoUseCase(GetRepoInfoUseCase.Params(owner, repo))
            _repoInfoItem.value = RepoInfoDataModel.makeRepoInfoUiData(result)
        }
    }

    fun getUserInfo(username: String) {
        viewModelScope.launch {
            val result = getUserInfoUseCase(GetUserInfoUseCase.Params(username))
            _userInfoItem.value = result
        }
    }

    fun getUserList() {
        viewModelScope.launch {
            val result = getUserListUseCase()
            _userItems.value = result
        }
    }
}