package com.amirasghari.musicplayer.realm

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class FavoriteInfo:RealmObject() {
    @PrimaryKey
    lateinit var musicPath:String
    lateinit var musicName:String
    lateinit var artistName:String
    lateinit var imagePath:String
    lateinit var duration:String
}