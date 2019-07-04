package com.e.accidentalert.rest_api;


import com.e.accidentalert.models.DetailResult;
import com.e.accidentalert.models.DistanceResult;
import com.e.accidentalert.models.PlaceList;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by Mayank Gupta on 11-12-2017.
 */

public interface HospitalListClient {

    @GET("place/search/json")
    Call<PlaceList> getNearbyHospitals(@QueryMap Map<String, String> params);

    @GET("distancematrix/json")
    Call<DistanceResult> getHospitalDistances(@QueryMap Map<String, String> params);

    @GET("place/details/json")
    Call<DetailResult> getHospitalDetails(@QueryMap Map<String, String> params);
}
