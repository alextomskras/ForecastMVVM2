package com.example.forecastmvvm.data.db.entity.darksky


import com.google.gson.annotations.SerializedName

data class Alert(
    @SerializedName("title")
    val title: String, // Beach Hazards Statement
    @SerializedName("regions")
    val regions: List<String>,
    @SerializedName("severity")
    val severity: String, // warning
    @SerializedName("time")
    val time: Int, // 1573776000
    @SerializedName("expires")
    val expires: Int, // 1573862400
    @SerializedName("description")
    val description: String, // ...INCREASED RISK OF SNEAKER WAVES MIDDAY THURSDAY TO MIDDAY FRIDAY... .A long period WNW swell will impact the coastline from Sonoma southward through Big Sur beginning midday Thursday. Forerunner waves will arrive earlier in the day Thursday, however, the greatest risk of sneaker waves impacting the coast will stretch from 1pm Thursday through Friday afternoon. These sneaker waves are infrequent waves just powerful enough to knock unsuspecting people visiting the coast into the ocean during otherwise deceptively light seas. ...BEACH HAZARDS STATEMENT IN EFFECT FROM THURSDAY AFTERNOON THROUGH FRIDAY AFTERNOON... The National Weather Service in San Francisco has issued a Beach Hazards Statement for increased sneaker wave risk, which is in effect from Thursday afternoon through Friday afternoon. * TIMING...The greatest sneaker wave risk will be from Thursday afternoon through Friday afternoon. * LOCATION...Entire Pacific coastline from Sonoma south to Big Sur. * POTENTIAL IMPACTS...Larger surf at offshore breaks and an enhanced risk of sneaker waves on northwest California beaches. Steep beaches will have a higher risk of sneaker wave activity with greater wave run-up onto beaches. Large waves will also wash over jetties and rock outcroppings that may normally stay dry.
    @SerializedName("uri")
    val uri: String // https://alerts.weather.gov/cap/wwacapget.php?x=CA125D1C21204C.BeachHazardsStatement.125D1C4BFB00CA.MTRCFWMTR.a71da2854f884f8ab562a24999a796d8
)