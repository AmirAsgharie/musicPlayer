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
public class com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxy extends com.amirasghari.musicplayer.realm.PlaylistsInfo
    implements RealmObjectProxy, com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxyInterface {

    static final class PlaylistsInfoColumnInfo extends ColumnInfo {
        long playListNameColKey;
        long musicNumberColKey;
        long playListMainImagePathColKey;

        PlaylistsInfoColumnInfo(OsSchemaInfo schemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("PlaylistsInfo");
            this.playListNameColKey = addColumnDetails("playListName", "playListName", objectSchemaInfo);
            this.musicNumberColKey = addColumnDetails("musicNumber", "musicNumber", objectSchemaInfo);
            this.playListMainImagePathColKey = addColumnDetails("playListMainImagePath", "playListMainImagePath", objectSchemaInfo);
        }

        PlaylistsInfoColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new PlaylistsInfoColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final PlaylistsInfoColumnInfo src = (PlaylistsInfoColumnInfo) rawSrc;
            final PlaylistsInfoColumnInfo dst = (PlaylistsInfoColumnInfo) rawDst;
            dst.playListNameColKey = src.playListNameColKey;
            dst.musicNumberColKey = src.musicNumberColKey;
            dst.playListMainImagePathColKey = src.playListMainImagePathColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private PlaylistsInfoColumnInfo columnInfo;
    private ProxyState<com.amirasghari.musicplayer.realm.PlaylistsInfo> proxyState;

    com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (PlaylistsInfoColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.amirasghari.musicplayer.realm.PlaylistsInfo>(this);
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
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'playListName' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$musicNumber() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.musicNumberColKey);
    }

    @Override
    public void realmSet$musicNumber(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.musicNumberColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.musicNumberColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$playListMainImagePath() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.playListMainImagePathColKey);
    }

    @Override
    public void realmSet$playListMainImagePath(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.playListMainImagePathColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.playListMainImagePathColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.playListMainImagePathColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.playListMainImagePathColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "PlaylistsInfo", false, 3, 0);
        builder.addPersistedProperty(NO_ALIAS, "playListName", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "musicNumber", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "playListMainImagePath", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static PlaylistsInfoColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new PlaylistsInfoColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "PlaylistsInfo";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "PlaylistsInfo";
    }

    @SuppressWarnings("cast")
    public static com.amirasghari.musicplayer.realm.PlaylistsInfo createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.amirasghari.musicplayer.realm.PlaylistsInfo obj = null;
        if (update) {
            Table table = realm.getTable(com.amirasghari.musicplayer.realm.PlaylistsInfo.class);
            PlaylistsInfoColumnInfo columnInfo = (PlaylistsInfoColumnInfo) realm.getSchema().getColumnInfo(com.amirasghari.musicplayer.realm.PlaylistsInfo.class);
            long pkColumnKey = columnInfo.playListNameColKey;
            long objKey = Table.NO_MATCH;
            if (json.isNull("playListName")) {
                objKey = table.findFirstNull(pkColumnKey);
            } else {
                objKey = table.findFirstString(pkColumnKey, json.getString("playListName"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.amirasghari.musicplayer.realm.PlaylistsInfo.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("playListName")) {
                if (json.isNull("playListName")) {
                    obj = (io.realm.com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxy) realm.createObjectInternal(com.amirasghari.musicplayer.realm.PlaylistsInfo.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxy) realm.createObjectInternal(com.amirasghari.musicplayer.realm.PlaylistsInfo.class, json.getString("playListName"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'playListName'.");
            }
        }

        final com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxyInterface objProxy = (com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxyInterface) obj;
        if (json.has("musicNumber")) {
            if (json.isNull("musicNumber")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'musicNumber' to null.");
            } else {
                objProxy.realmSet$musicNumber((int) json.getInt("musicNumber"));
            }
        }
        if (json.has("playListMainImagePath")) {
            if (json.isNull("playListMainImagePath")) {
                objProxy.realmSet$playListMainImagePath(null);
            } else {
                objProxy.realmSet$playListMainImagePath((String) json.getString("playListMainImagePath"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.amirasghari.musicplayer.realm.PlaylistsInfo createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.amirasghari.musicplayer.realm.PlaylistsInfo obj = new com.amirasghari.musicplayer.realm.PlaylistsInfo();
        final com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxyInterface objProxy = (com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxyInterface) obj;
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
                jsonHasPrimaryKey = true;
            } else if (name.equals("musicNumber")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$musicNumber((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'musicNumber' to null.");
                }
            } else if (name.equals("playListMainImagePath")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$playListMainImagePath((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$playListMainImagePath(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'playListName'.");
        }
        return realm.copyToRealmOrUpdate(obj);
    }

    static com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.amirasghari.musicplayer.realm.PlaylistsInfo.class), false, Collections.<String>emptyList());
        io.realm.com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxy obj = new io.realm.com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.amirasghari.musicplayer.realm.PlaylistsInfo copyOrUpdate(Realm realm, PlaylistsInfoColumnInfo columnInfo, com.amirasghari.musicplayer.realm.PlaylistsInfo object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.amirasghari.musicplayer.realm.PlaylistsInfo) cachedRealmObject;
        }

        com.amirasghari.musicplayer.realm.PlaylistsInfo realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.amirasghari.musicplayer.realm.PlaylistsInfo.class);
            long pkColumnKey = columnInfo.playListNameColKey;
            String value = ((com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxyInterface) object).realmGet$playListName();
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
                    realmObject = new io.realm.com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.amirasghari.musicplayer.realm.PlaylistsInfo copy(Realm realm, PlaylistsInfoColumnInfo columnInfo, com.amirasghari.musicplayer.realm.PlaylistsInfo newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.amirasghari.musicplayer.realm.PlaylistsInfo) cachedRealmObject;
        }

        com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxyInterface unmanagedSource = (com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxyInterface) newObject;

        Table table = realm.getTable(com.amirasghari.musicplayer.realm.PlaylistsInfo.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.playListNameColKey, unmanagedSource.realmGet$playListName());
        builder.addInteger(columnInfo.musicNumberColKey, unmanagedSource.realmGet$musicNumber());
        builder.addString(columnInfo.playListMainImagePathColKey, unmanagedSource.realmGet$playListMainImagePath());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.amirasghari.musicplayer.realm.PlaylistsInfo object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.amirasghari.musicplayer.realm.PlaylistsInfo.class);
        long tableNativePtr = table.getNativePtr();
        PlaylistsInfoColumnInfo columnInfo = (PlaylistsInfoColumnInfo) realm.getSchema().getColumnInfo(com.amirasghari.musicplayer.realm.PlaylistsInfo.class);
        long pkColumnKey = columnInfo.playListNameColKey;
        String primaryKeyValue = ((com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxyInterface) object).realmGet$playListName();
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
        Table.nativeSetLong(tableNativePtr, columnInfo.musicNumberColKey, objKey, ((com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxyInterface) object).realmGet$musicNumber(), false);
        String realmGet$playListMainImagePath = ((com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxyInterface) object).realmGet$playListMainImagePath();
        if (realmGet$playListMainImagePath != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.playListMainImagePathColKey, objKey, realmGet$playListMainImagePath, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.amirasghari.musicplayer.realm.PlaylistsInfo.class);
        long tableNativePtr = table.getNativePtr();
        PlaylistsInfoColumnInfo columnInfo = (PlaylistsInfoColumnInfo) realm.getSchema().getColumnInfo(com.amirasghari.musicplayer.realm.PlaylistsInfo.class);
        long pkColumnKey = columnInfo.playListNameColKey;
        com.amirasghari.musicplayer.realm.PlaylistsInfo object = null;
        while (objects.hasNext()) {
            object = (com.amirasghari.musicplayer.realm.PlaylistsInfo) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxyInterface) object).realmGet$playListName();
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
            Table.nativeSetLong(tableNativePtr, columnInfo.musicNumberColKey, objKey, ((com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxyInterface) object).realmGet$musicNumber(), false);
            String realmGet$playListMainImagePath = ((com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxyInterface) object).realmGet$playListMainImagePath();
            if (realmGet$playListMainImagePath != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.playListMainImagePathColKey, objKey, realmGet$playListMainImagePath, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.amirasghari.musicplayer.realm.PlaylistsInfo object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.amirasghari.musicplayer.realm.PlaylistsInfo.class);
        long tableNativePtr = table.getNativePtr();
        PlaylistsInfoColumnInfo columnInfo = (PlaylistsInfoColumnInfo) realm.getSchema().getColumnInfo(com.amirasghari.musicplayer.realm.PlaylistsInfo.class);
        long pkColumnKey = columnInfo.playListNameColKey;
        String primaryKeyValue = ((com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxyInterface) object).realmGet$playListName();
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
        Table.nativeSetLong(tableNativePtr, columnInfo.musicNumberColKey, objKey, ((com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxyInterface) object).realmGet$musicNumber(), false);
        String realmGet$playListMainImagePath = ((com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxyInterface) object).realmGet$playListMainImagePath();
        if (realmGet$playListMainImagePath != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.playListMainImagePathColKey, objKey, realmGet$playListMainImagePath, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.playListMainImagePathColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.amirasghari.musicplayer.realm.PlaylistsInfo.class);
        long tableNativePtr = table.getNativePtr();
        PlaylistsInfoColumnInfo columnInfo = (PlaylistsInfoColumnInfo) realm.getSchema().getColumnInfo(com.amirasghari.musicplayer.realm.PlaylistsInfo.class);
        long pkColumnKey = columnInfo.playListNameColKey;
        com.amirasghari.musicplayer.realm.PlaylistsInfo object = null;
        while (objects.hasNext()) {
            object = (com.amirasghari.musicplayer.realm.PlaylistsInfo) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxyInterface) object).realmGet$playListName();
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
            Table.nativeSetLong(tableNativePtr, columnInfo.musicNumberColKey, objKey, ((com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxyInterface) object).realmGet$musicNumber(), false);
            String realmGet$playListMainImagePath = ((com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxyInterface) object).realmGet$playListMainImagePath();
            if (realmGet$playListMainImagePath != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.playListMainImagePathColKey, objKey, realmGet$playListMainImagePath, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.playListMainImagePathColKey, objKey, false);
            }
        }
    }

    public static com.amirasghari.musicplayer.realm.PlaylistsInfo createDetachedCopy(com.amirasghari.musicplayer.realm.PlaylistsInfo realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.amirasghari.musicplayer.realm.PlaylistsInfo unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.amirasghari.musicplayer.realm.PlaylistsInfo();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.amirasghari.musicplayer.realm.PlaylistsInfo) cachedObject.object;
            }
            unmanagedObject = (com.amirasghari.musicplayer.realm.PlaylistsInfo) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxyInterface unmanagedCopy = (com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxyInterface) unmanagedObject;
        com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxyInterface realmSource = (com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$playListName(realmSource.realmGet$playListName());
        unmanagedCopy.realmSet$musicNumber(realmSource.realmGet$musicNumber());
        unmanagedCopy.realmSet$playListMainImagePath(realmSource.realmGet$playListMainImagePath());

        return unmanagedObject;
    }

    static com.amirasghari.musicplayer.realm.PlaylistsInfo update(Realm realm, PlaylistsInfoColumnInfo columnInfo, com.amirasghari.musicplayer.realm.PlaylistsInfo realmObject, com.amirasghari.musicplayer.realm.PlaylistsInfo newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxyInterface realmObjectTarget = (com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxyInterface) realmObject;
        com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxyInterface realmObjectSource = (com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxyInterface) newObject;
        Table table = realm.getTable(com.amirasghari.musicplayer.realm.PlaylistsInfo.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.playListNameColKey, realmObjectSource.realmGet$playListName());
        builder.addInteger(columnInfo.musicNumberColKey, realmObjectSource.realmGet$musicNumber());
        builder.addString(columnInfo.playListMainImagePathColKey, realmObjectSource.realmGet$playListMainImagePath());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("PlaylistsInfo = proxy[");
        stringBuilder.append("{playListName:");
        stringBuilder.append(realmGet$playListName() != null ? realmGet$playListName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{musicNumber:");
        stringBuilder.append(realmGet$musicNumber());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{playListMainImagePath:");
        stringBuilder.append(realmGet$playListMainImagePath() != null ? realmGet$playListMainImagePath() : "null");
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
        com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxy aPlaylistsInfo = (com_amirasghari_musicplayer_realm_PlaylistsInfoRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aPlaylistsInfo.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aPlaylistsInfo.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aPlaylistsInfo.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
