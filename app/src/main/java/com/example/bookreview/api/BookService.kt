package com.example.bookreview.api

import retrofit2.Call
import com.example.bookreview.model.BestSellerDto
import com.example.bookreview.model.SearchBookDto
import retrofit2.http.GET
import retrofit2.http.Query

interface BookService {

    @GET("/api/search.api?output=json")
    fun getBooksByName(
        @Query("key") apikey: String,
        @Query("query") keyword: String
    ): Call<SearchBookDto>

    @GET("/api/bestSeller.api?output=json&categoryId=100")
    fun getBestSellerBooks(
        @Query("key") apikey: String
    ): Call<BestSellerDto>
}