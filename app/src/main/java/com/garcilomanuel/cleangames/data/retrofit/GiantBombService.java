package com.garcilomanuel.cleangames.data.retrofit;

import com.garcilomanuel.cleangames.data.giantbomb.model.Data;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Manuel García.
 */
public interface GiantBombService {

  @GET("/platforms?sort=release_date:asc&field_list=id,image,name")
  Data getPlatforms(@Query("api_key") String apiKey, @Query("format") String format);
}
