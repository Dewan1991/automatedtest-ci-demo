package th.co.centrilliontech.androidcicddemoapi

import io.reactivex.Flowable
import retrofit2.http.GET


interface ShoesService {

    @GET("test.json")
    fun getShoes(): Flowable<ShoesShelfContainer>

}