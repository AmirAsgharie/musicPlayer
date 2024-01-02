package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.NativeContext;
import io.realm.internal.OsList;
import io.realm.internal.OsMap;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSet;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.core.NativeRealmAny;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxy extends com.amirasghari.musicplayer.realm.SinglePlaylistInfo
    implements RealmObjectProxy, com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface {

    static final class SinglePlaylistInfoColumnInfo extends ColumnInfo {
        long playListNameColKey;
        long musicNameColKey;
        long artistColKey;
        long imagePathColKey;
        long musicPathColKey;
        long durationColKey;

        SinglePlaylistInfoColumnInfo(OsSchemaInfo schemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("SinglePlaylistInfo");
            this.playListNameColKey = addColumnDetails("playListName", "playListName", objectSchemaInfo);
            this.musicNameColKey = addColumnDetails("musicName", "musicName", objectSchemaInfo);
            this.artistColKey = addColumnDetails("artist", "artist", objectSchemaInfo);
            this.imagePathColKey = addColumnDetails("imagePath", "imagePath", objectSchemaInfo);
            this.musicPathColKey = addColumnDetails("musicPath", "musicPath", objectSchemaInfo);
            this.durationColKey = addColumnDetails("duration", "duration", objectSchemaInfo);
        }

        SinglePlaylistInfoColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new SinglePlaylistInfoColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final SinglePlaylistInfoColumnInfo src = (SinglePlaylistInfoColumnInfo) rawSrc;
            final SinglePlaylistInfoColumnInfo dst = (SinglePlaylistInfoColumnInfo) rawDst;
            dst.playListNameColKey = src.playListNameColKey;
            dst.musicNameColKey = src.musicNameColKey;
            dst.artistColKey = src.artistColKey;
            dst.imagePathColKey = src.imagePathColKey;
            dst.musicPathColKey = src.musicPathColKey;
            dst.durationColKey = src.durationColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private SinglePlaylistInfoColumnInfo columnInfo;
    private ProxyState<com.amirasghari.musicplayer.realm.SinglePlaylistInfo> proxyState;

    com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (SinglePlaylistInfoColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.amirasghari.musicplayer.realm.SinglePlaylistInfo>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$playListName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.playListNameColKey);
    }

    @Override
    public void realmSet$playListName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.playListNameColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.playListNameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.playListNameColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.playListNameColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$musicName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.musicNameColKey);
    }

    @Override
    public void realmSet$musicName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.musicNameColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.musicNameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.musicNameColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.musicNameColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$artist() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.artistColKey);
    }

    @Override
    public void realmSet$artist(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.artistColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.artistColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.artistColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.artistColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$imagePath() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.imagePathColKey);
    }

    @Override
    public void realmSet$imagePath(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.imagePathColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.imagePathColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.imagePathColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.imagePathColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$musicPath() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.musicPathColKey);
    }

    @Override
    public void realmSet$musicPath(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'musicPath' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$duration() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.durationColKey);
    }

    @Override
    public void realmSet$duration(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.durationColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.durationColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.durationColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.durationColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "SinglePlaylistInfo", false, 6, 0);
        builder.addPersistedProperty(NO_ALIAS, "playListName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "musicName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "artist", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "imagePath", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "musicPath", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "duration", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static SinglePlaylistInfoColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new SinglePlaylistInfoColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "SinglePlaylistInfo";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "SinglePlaylistInfo";
    }

    @SuppressWarnings("cast")
    public static com.amirasghari.musicplayer.realm.SinglePlaylistInfo createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.amirasghari.musicplayer.realm.SinglePlaylistInfo obj = null;
        if (update) {
            Table table = realm.getTable(com.amirasghari.musicplayer.realm.SinglePlaylistInfo.class);
            SinglePlaylistInfoColumnInfo columnInfo = (SinglePlaylistInfoColumnInfo) realm.getSchema().getColumnInfo(com.amirasghari.musicplayer.realm.SinglePlaylistInfo.class);
            long pkColumnKey = columnInfo.musicPathColKey;
            long objKey = Table.NO_MATCH;
            if (json.isNull("musicPath")) {
                objKey = table.findFirstNull(pkColumnKey);
            } else {
                objKey = table.findFirstString(pkColumnKey, json.getString("musicPath"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.amirasghari.musicplayer.realm.SinglePlaylistInfo.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("musicPath")) {
                if (json.isNull("musicPath")) {
                    obj = (io.realm.com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxy) realm.createObjectInternal(com.amirasghari.musicplayer.realm.SinglePlaylistInfo.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxy) realm.createObjectInternal(com.amirasghari.musicplayer.realm.SinglePlaylistInfo.class, json.getString("musicPath"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'musicPath'.");
            }
        }

        final com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface objProxy = (com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) obj;
        if (json.has("playListName")) {
            if (json.isNull("playListName")) {
                objProxy.realmSet$playListName(null);
            } else {
                objProxy.realmSet$playListName((String) json.getString("playListName"));
            }
        }
        if (json.has("musicName")) {
            if (json.isNull("musicName")) {
                objProxy.realmSet$musicName(null);
            } else {
                objProxy.realmSet$musicName((String) json.getString("musicName"));
            }
        }
        if (json.has("artist")) {
            if (json.isNull("artist")) {
                objProxy.realmSet$artist(null);
            } else {
                objProxy.realmSet$artist((String) json.getString("artist"));
            }
        }
        if (json.has("imagePath")) {
            if (json.isNull("imagePath")) {
                objProxy.realmSet$imagePath(null);
            } else {
                objProxy.realmSet$imagePath((String) json.getString("imagePath"));
            }
        }
        if (json.has("duration")) {
            if (json.isNull("duration")) {
                objProxy.realmSet$duration(null);
            } else {
                objProxy.realmSet$duration((String) json.getString("duration"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.amirasghari.musicplayer.realm.SinglePlaylistInfo createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.amirasghari.musicplayer.realm.SinglePlaylistInfo obj = new com.amirasghari.musicplayer.realm.SinglePlaylistInfo();
        final com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface objProxy = (com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("playListName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$playListName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$playListName(null);
                }
            } else if (name.equals("musicName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$musicName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$musicName(null);
                }
            } else if (name.equals("artist")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$artist((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$artist(null);
                }
            } else if (name.equals("imagePath")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$imagePath((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$imagePath(null);
                }
            } else if (name.equals("musicPath")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$musicPath((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$musicPath(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("duration")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$duration((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$duration(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'musicPath'.");
        }
        return realm.copyToRealmOrUpdate(obj);
    }

    static com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.amirasghari.musicplayer.realm.SinglePlaylistInfo.class), false, Collections.<String>emptyList());
        io.realm.com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxy obj = new io.realm.com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.amirasghari.musicplayer.realm.SinglePlaylistInfo copyOrUpdate(Realm realm, SinglePlaylistInfoColumnInfo columnInfo, com.amirasghari.musicplayer.realm.SinglePlaylistInfo object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.amirasghari.musicplayer.realm.SinglePlaylistInfo) cachedRealmObject;
        }

        com.amirasghari.musicplayer.realm.SinglePlaylistInfo realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.amirasghari.musicplayer.realm.SinglePlaylistInfo.class);
            long pkColumnKey = columnInfo.musicPathColKey;
            String value = ((com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) object).realmGet$musicPath();
            long objKey = Table.NO_MATCH;
            if (value == null) {
                objKey = table.findFirstNull(pkColumnKey);
            } else {
                objKey = table.findFirstString(pkColumnKey, value);
            }
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.amirasghari.musicplayer.realm.SinglePlaylistInfo copy(Realm realm, SinglePlaylistInfoColumnInfo columnInfo, com.amirasghari.musicplayer.realm.SinglePlaylistInfo newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.amirasghari.musicplayer.realm.SinglePlaylistInfo) cachedRealmObject;
        }

        com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface unmanagedSource = (com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) newObject;

        Table table = realm.getTable(com.amirasghari.musicplayer.realm.SinglePlaylistInfo.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.playListNameColKey, unmanagedSource.realmGet$playListName());
        builder.addString(columnInfo.musicNameColKey, unmanagedSource.realmGet$musicName());
        builder.addString(columnInfo.artistColKey, unmanagedSource.realmGet$artist());
        builder.addString(columnInfo.imagePathColKey, unmanagedSource.realmGet$imagePath());
        builder.addString(columnInfo.musicPathColKey, unmanagedSource.realmGet$musicPath());
        builder.addString(columnInfo.durationColKey, unmanagedSource.realmGet$duration());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.amirasghari.musicplayer.realm.SinglePlaylistInfo object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.amirasghari.musicplayer.realm.SinglePlaylistInfo.class);
        long tableNativePtr = table.getNativePtr();
        SinglePlaylistInfoColumnInfo columnInfo = (SinglePlaylistInfoColumnInfo) realm.getSchema().getColumnInfo(com.amirasghari.musicplayer.realm.SinglePlaylistInfo.class);
        long pkColumnKey = columnInfo.musicPathColKey;
        String primaryKeyValue = ((com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) object).realmGet$musicPath();
        long objKey = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            objKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
        } else {
            objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$playListName = ((com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) object).realmGet$playListName();
        if (realmGet$playListName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.playListNameColKey, objKey, realmGet$playListName, false);
        }
        String realmGet$musicName = ((com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) object).realmGet$musicName();
        if (realmGet$musicName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.musicNameColKey, objKey, realmGet$musicName, false);
        }
        String realmGet$artist = ((com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) object).realmGet$artist();
        if (realmGet$artist != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.artistColKey, objKey, realmGet$artist, false);
        }
        String realmGet$imagePath = ((com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) object).realmGet$imagePath();
        if (realmGet$imagePath != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.imagePathColKey, objKey, realmGet$imagePath, false);
        }
        String realmGet$duration = ((com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) object).realmGet$duration();
        if (realmGet$duration != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.durationColKey, objKey, realmGet$duration, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.amirasghari.musicplayer.realm.SinglePlaylistInfo.class);
        long tableNativePtr = table.getNativePtr();
        SinglePlaylistInfoColumnInfo columnInfo = (SinglePlaylistInfoColumnInfo) realm.getSchema().getColumnInfo(com.amirasghari.musicplayer.realm.SinglePlaylistInfo.class);
        long pkColumnKey = columnInfo.musicPathColKey;
        com.amirasghari.musicplayer.realm.SinglePlaylistInfo object = null;
        while (objects.hasNext()) {
            object = (com.amirasghari.musicplayer.realm.SinglePlaylistInfo) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) object).realmGet$musicPath();
            long objKey = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                objKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
            } else {
                objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$playListName = ((com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) object).realmGet$playListName();
            if (realmGet$playListName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.playListNameColKey, objKey, realmGet$playListName, false);
            }
            String realmGet$musicName = ((com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) object).realmGet$musicName();
            if (realmGet$musicName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.musicNameColKey, objKey, realmGet$musicName, false);
            }
            String realmGet$artist = ((com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) object).realmGet$artist();
            if (realmGet$artist != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.artistColKey, objKey, realmGet$artist, false);
            }
            String realmGet$imagePath = ((com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) object).realmGet$imagePath();
            if (realmGet$imagePath != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.imagePathColKey, objKey, realmGet$imagePath, false);
            }
            String realmGet$duration = ((com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) object).realmGet$duration();
            if (realmGet$duration != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.durationColKey, objKey, realmGet$duration, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.amirasghari.musicplayer.realm.SinglePlaylistInfo object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.amirasghari.musicplayer.realm.SinglePlaylistInfo.class);
        long tableNativePtr = table.getNativePtr();
        SinglePlaylistInfoColumnInfo columnInfo = (SinglePlaylistInfoColumnInfo) realm.getSchema().getColumnInfo(com.amirasghari.musicplayer.realm.SinglePlaylistInfo.class);
        long pkColumnKey = columnInfo.musicPathColKey;
        String primaryKeyValue = ((com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) object).realmGet$musicPath();
        long objKey = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            objKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
        } else {
            objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$playListName = ((com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) object).realmGet$playListName();
        if (realmGet$playListName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.playListNameColKey, objKey, realmGet$playListName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.playListNameColKey, objKey, false);
        }
        String realmGet$musicName = ((com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) object).realmGet$musicName();
        if (realmGet$musicName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.musicNameColKey, objKey, realmGet$musicName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.musicNameColKey, objKey, false);
        }
        String realmGet$artist = ((com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) object).realmGet$artist();
        if (realmGet$artist != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.artistColKey, objKey, realmGet$artist, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.artistColKey, objKey, false);
        }
        String realmGet$imagePath = ((com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) object).realmGet$imagePath();
        if (realmGet$imagePath != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.imagePathColKey, objKey, realmGet$imagePath, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.imagePathColKey, objKey, false);
        }
        String realmGet$duration = ((com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) object).realmGet$duration();
        if (realmGet$duration != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.durationColKey, objKey, realmGet$duration, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.durationColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.amirasghari.musicplayer.realm.SinglePlaylistInfo.class);
        long tableNativePtr = table.getNativePtr();
        SinglePlaylistInfoColumnInfo columnInfo = (SinglePlaylistInfoColumnInfo) realm.getSchema().getColumnInfo(com.amirasghari.musicplayer.realm.SinglePlaylistInfo.class);
        long pkColumnKey = columnInfo.musicPathColKey;
        com.amirasghari.musicplayer.realm.SinglePlaylistInfo object = null;
        while (objects.hasNext()) {
            object = (com.amirasghari.musicplayer.realm.SinglePlaylistInfo) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) object).realmGet$musicPath();
            long objKey = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                objKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
            } else {
                objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$playListName = ((com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) object).realmGet$playListName();
            if (realmGet$playListName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.playListNameColKey, objKey, realmGet$playListName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.playListNameColKey, objKey, false);
            }
            String realmGet$musicName = ((com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) object).realmGet$musicName();
            if (realmGet$musicName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.musicNameColKey, objKey, realmGet$musicName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.musicNameColKey, objKey, false);
            }
            String realmGet$artist = ((com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) object).realmGet$artist();
            if (realmGet$artist != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.artistColKey, objKey, realmGet$artist, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.artistColKey, objKey, false);
            }
            String realmGet$imagePath = ((com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) object).realmGet$imagePath();
            if (realmGet$imagePath != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.imagePathColKey, objKey, realmGet$imagePath, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.imagePathColKey, objKey, false);
            }
            String realmGet$duration = ((com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) object).realmGet$duration();
            if (realmGet$duration != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.durationColKey, objKey, realmGet$duration, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.durationColKey, objKey, false);
            }
        }
    }

    public static com.amirasghari.musicplayer.realm.SinglePlaylistInfo createDetachedCopy(com.amirasghari.musicplayer.realm.SinglePlaylistInfo realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.amirasghari.musicplayer.realm.SinglePlaylistInfo unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.amirasghari.musicplayer.realm.SinglePlaylistInfo();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.amirasghari.musicplayer.realm.SinglePlaylistInfo) cachedObject.object;
            }
            unmanagedObject = (com.amirasghari.musicplayer.realm.SinglePlaylistInfo) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface unmanagedCopy = (com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) unmanagedObject;
        com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface realmSource = (com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$playListName(realmSource.realmGet$playListName());
        unmanagedCopy.realmSet$musicName(realmSource.realmGet$musicName());
        unmanagedCopy.realmSet$artist(realmSource.realmGet$artist());
        unmanagedCopy.realmSet$imagePath(realmSource.realmGet$imagePath());
        unmanagedCopy.realmSet$musicPath(realmSource.realmGet$musicPath());
        unmanagedCopy.realmSet$duration(realmSource.realmGet$duration());

        return unmanagedObject;
    }

    static com.amirasghari.musicplayer.realm.SinglePlaylistInfo update(Realm realm, SinglePlaylistInfoColumnInfo columnInfo, com.amirasghari.musicplayer.realm.SinglePlaylistInfo realmObject, com.amirasghari.musicplayer.realm.SinglePlaylistInfo newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface realmObjectTarget = (com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) realmObject;
        com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface realmObjectSource = (com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxyInterface) newObject;
        Table table = realm.getTable(com.amirasghari.musicplayer.realm.SinglePlaylistInfo.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.playListNameColKey, realmObjectSource.realmGet$playListName());
        builder.addString(columnInfo.musicNameColKey, realmObjectSource.realmGet$musicName());
        builder.addString(columnInfo.artistColKey, realmObjectSource.realmGet$artist());
        builder.addString(columnInfo.imagePathColKey, realmObjectSource.realmGet$imagePath());
        builder.addString(columnInfo.musicPathColKey, realmObjectSource.realmGet$musicPath());
        builder.addString(columnInfo.durationColKey, realmObjectSource.realmGet$duration());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("SinglePlaylistInfo = proxy[");
        stringBuilder.append("{playListName:");
        stringBuilder.append(realmGet$playListName() != null ? realmGet$playListName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{musicName:");
        stringBuilder.append(realmGet$musicName() != null ? realmGet$musicName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{artist:");
        stringBuilder.append(realmGet$artist() != null ? realmGet$artist() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{imagePath:");
        stringBuilder.append(realmGet$imagePath() != null ? realmGet$imagePath() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{musicPath:");
        stringBuilder.append(realmGet$musicPath() != null ? realmGet$musicPath() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{duration:");
        stringBuilder.append(realmGet$duration() != null ? realmGet$duration() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long objKey = proxyState.getRow$realm().getObjectKey();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (objKey ^ (objKey >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxy aSinglePlaylistInfo = (com_amirasghari_musicplayer_realm_SinglePlaylistInfoRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aSinglePlaylistInfo.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aSinglePlaylistInfo.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aSinglePlaylistInfo.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
