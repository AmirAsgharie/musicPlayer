package com.amirasghari.musicplayer.realm

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class SinglePlaylistInfo:RealmObject() {
    lateinit var playListName:String
    lateinit var musicName:String
    lateinit var artist:String
    lateinit var imagePath:String
    @PrimaryKey
    lateinit var musicPath:String
    lateinit var duration:String


}