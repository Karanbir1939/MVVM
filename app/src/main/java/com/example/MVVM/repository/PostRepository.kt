package com.example.MVVM.repository

import com.example.MVVM.api.ApiService
import com.example.MVVM.data.Post
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PostRepository @Inject constructor(private val apiService: ApiService) {

    suspend fun getPosts(): Response<List<Post>> {
        return apiService.getPosts()
    }
}
