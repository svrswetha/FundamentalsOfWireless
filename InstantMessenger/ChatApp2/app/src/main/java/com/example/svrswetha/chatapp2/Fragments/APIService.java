package com.example.svrswetha.chatapp2.Fragments;

import com.example.svrswetha.chatapp2.Notifications.MyResponse;
import com.example.svrswetha.chatapp2.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {

            "Content-Type:application/json",
            "Authorization:key=AAAA0-HqkGU:APA91bHsfu5NnK1tmNKzqdV2kR37Wbwe3aEG73uquYos8z1wv_A901F7ruHsxBVp4eg5w67kLhJ2klcKWZ4IrCtfsWVkklxRViqq35tqL6EVRQsqR7ZDnuw1MoWMeqRMZhouId8U37lo"

            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);


}
