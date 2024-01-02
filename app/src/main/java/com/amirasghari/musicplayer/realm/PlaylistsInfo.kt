package com.amirasghari.musicplayer.realm

import io.realm.Realm
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class PlaylistsInfo: RealmObject() {
    @PrimaryKey
    lateinit var playListName:String
    var musicNumber:Int=0
    lateinit var playListMainImagePath:String
}