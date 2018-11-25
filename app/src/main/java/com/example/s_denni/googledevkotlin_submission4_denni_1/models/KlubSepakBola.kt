package com.example.s_denni.googledevkotlin_submission4_denni_1.models

import com.google.gson.annotations.SerializedName

data class KlubSepakBola(
    @SerializedName("idTeam")
    var teamId: String? = null,

    @SerializedName("strTeam")
    var teamName: String? = null,

    @SerializedName("strTeamBadge")
    var teamBadge: String? = null
)