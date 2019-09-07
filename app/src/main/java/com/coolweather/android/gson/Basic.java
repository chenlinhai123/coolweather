package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update upddate;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
