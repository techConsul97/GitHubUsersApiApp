package com.sebqv97.myapplication.feature_users.domain.use_case

import com.sebqv97.myapplication.core.util.ErrorTypes
import com.sebqv97.myapplication.core.util.Resource
import com.sebqv97.myapplication.feature_users.domain.model.UserItemModel
import com.sebqv97.myapplication.feature_users.domain.repository.UsersRepository
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class FetchUserUseCase @Inject constructor(
    private val repository: UsersRepository

) {
    operator fun invoke(searchedUserByUserName: String?): Flow<Resource<UserItemModel>> = flow {

        if (searchedUserByUserName.isNullOrEmpty()) {
            emit(Resource.Error<UserItemModel>(ErrorTypes.EmptySearchField()))
        } else {
            //calling UserDetailsUseCase as to get the User with Details and convert it to a User from List
//            (searchedUserByUserName){ status ->
//                when (status) {
//                    is Resource.Success -> {
//                        val userItemModel = status.data.let { it!!.toUserItemModel() }
//                        emit(Resource.Success(userItemModel))
//                    }
//                    is Resource.Error -> {
//                        emit(Resource.Error<UserItemModel>(status.errorType!!))
//                        delay(500)
//                    }
//                    is Resource.Loading -> {emit(Resource.Loading<UserItemModel>())}
//
//
//                }
//            }
        }

    }


}