package com.amirasghari.musicplayer.realm

import io.realm.Realm
import io.realm.RealmResults

class RealmDAO {


    private val realm = Realm.getDefaultInstance()

    fun favoriteReadAll():RealmResults<FavoriteInfo> = realm.where(FavoriteInfo::class.java).findAll()

    fun favoriteReadByName(path:String):FavoriteInfo? = realm.where(FavoriteInfo::class.java).equalTo("musicPath",path).findFirst()

    fun favoriteUpdate(favoriteInfo:FavoriteInfo){
        realm.executeTransaction{
            it.copyToRealmOrUpdate(favoriteInfo)
        }
    }

    fun favoriteDelete(path: String){
        realm.executeTransaction(){
            val deleteCity=favoriteReadByName(path)
            deleteCity?.deleteFromRealm()
        }
    }

    fun playlistReadAll():RealmResults<PlaylistsInfo> = realm.where(PlaylistsInfo::class.java).findAll()

    fun playlistReadByName(name:String):PlaylistsInfo? = realm.where(PlaylistsInfo::class.java).equalTo("playListName",name).findFirst()

    fun playlistUpdate(playlistsInfo: PlaylistsInfo){
        realm.executeTransaction{
            it.copyToRealmOrUpdate(playlistsInfo)
        }
    }

    fun playlistDelete(name: String){
        realm.executeTransaction(){
            val deleteCity=playlistReadByName(name)
            deleteCity?.deleteFromRealm()
        }
    }

    fun singlePlaylistReadAll():RealmResults<SinglePlaylistInfo> = realm.where(SinglePlaylistInfo::class.java).findAll()

    fun singlePlaylistReadByName(path:String):SinglePlaylistInfo? = realm.where(SinglePlaylistInfo::class.java).equalTo("musicPath",path).findFirst()

    fun singlePlaylistUpdate(singlePlaylistInfo: SinglePlaylistInfo){
        realm.executeTransaction{
            it.copyToRealmOrUpdate(singlePlaylistInfo)
        }
    }

    fun singlePlaylistDelete(path: String){
        realm.executeTransaction(){
            val deleteCity=singlePlaylistReadByName(path)
            deleteCity?.deleteFromRealm()
        }
    }

    fun closeDB(){
        realm.close()
    }
}