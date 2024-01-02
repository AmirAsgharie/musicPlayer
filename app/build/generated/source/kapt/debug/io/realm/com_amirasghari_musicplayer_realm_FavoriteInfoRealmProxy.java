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
public class com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxy extends com.amirasghari.musicplayer.realm.FavoriteInfo
    implements RealmObjectProxy, com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface {

    static final class FavoriteInfoColumnInfo extends ColumnInfo {
        long musicPathColKey;
        long musicNameColKey;
        long artistNameColKey;
        long imagePathColKey;
        long durationColKey;

        FavoriteInfoColumnInfo(OsSchemaInfo schemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("FavoriteInfo");
            this.musicPathColKey = addColumnDetails("musicPath", "musicPath", objectSchemaInfo);
            this.musicNameColKey = addColumnDetails("musicName", "musicName", objectSchemaInfo);
            this.artistNameColKey = addColumnDetails("artistName", "artistName", objectSchemaInfo);
            this.imagePathColKey = addColumnDetails("imagePath", "imagePath", objectSchemaInfo);
            this.durationColKey = addColumnDetails("duration", "duration", objectSchemaInfo);
        }

        FavoriteInfoColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new FavoriteInfoColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final FavoriteInfoColumnInfo src = (FavoriteInfoColumnInfo) rawSrc;
            final FavoriteInfoColumnInfo dst = (FavoriteInfoColumnInfo) rawDst;
            dst.musicPathColKey = src.musicPathColKey;
            dst.musicNameColKey = src.musicNameColKey;
            dst.artistNameColKey = src.artistNameColKey;
            dst.imagePathColKey = src.imagePathColKey;
            dst.durationColKey = src.durationColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private FavoriteInfoColumnInfo columnInfo;
    private ProxyState<com.amirasghari.musicplayer.realm.FavoriteInfo> proxyState;

    com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (FavoriteInfoColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.amirasghari.musicplayer.realm.FavoriteInfo>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
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
    public String realmGet$artistName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.artistNameColKey);
    }

    @Override
    public void realmSet$artistName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.artistNameColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.artistNameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.artistNameColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.artistNameColKey, value);
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "FavoriteInfo", false, 5, 0);
        builder.addPersistedProperty(NO_ALIAS, "musicPath", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "musicName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "artistName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "imagePath", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "duration", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static FavoriteInfoColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new FavoriteInfoColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "FavoriteInfo";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "FavoriteInfo";
    }

    @SuppressWarnings("cast")
    public static com.amirasghari.musicplayer.realm.FavoriteInfo createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.amirasghari.musicplayer.realm.FavoriteInfo obj = null;
        if (update) {
            Table table = realm.getTable(com.amirasghari.musicplayer.realm.FavoriteInfo.class);
            FavoriteInfoColumnInfo columnInfo = (FavoriteInfoColumnInfo) realm.getSchema().getColumnInfo(com.amirasghari.musicplayer.realm.FavoriteInfo.class);
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
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.amirasghari.musicplayer.realm.FavoriteInfo.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("musicPath")) {
                if (json.isNull("musicPath")) {
                    obj = (io.realm.com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxy) realm.createObjectInternal(com.amirasghari.musicplayer.realm.FavoriteInfo.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxy) realm.createObjectInternal(com.amirasghari.musicplayer.realm.FavoriteInfo.class, json.getString("musicPath"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'musicPath'.");
            }
        }

        final com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface objProxy = (com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface) obj;
        if (json.has("musicName")) {
            if (json.isNull("musicName")) {
                objProxy.realmSet$musicName(null);
            } else {
                objProxy.realmSet$musicName((String) json.getString("musicName"));
            }
        }
        if (json.has("artistName")) {
            if (json.isNull("artistName")) {
                objProxy.realmSet$artistName(null);
            } else {
                objProxy.realmSet$artistName((String) json.getString("artistName"));
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
    public static com.amirasghari.musicplayer.realm.FavoriteInfo createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.amirasghari.musicplayer.realm.FavoriteInfo obj = new com.amirasghari.musicplayer.realm.FavoriteInfo();
        final com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface objProxy = (com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("musicPath")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$musicPath((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$musicPath(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("musicName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$musicName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$musicName(null);
                }
            } else if (name.equals("artistName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$artistName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$artistName(null);
                }
            } else if (name.equals("imagePath")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$imagePath((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$imagePath(null);
                }
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

    static com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.amirasghari.musicplayer.realm.FavoriteInfo.class), false, Collections.<String>emptyList());
        io.realm.com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxy obj = new io.realm.com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.amirasghari.musicplayer.realm.FavoriteInfo copyOrUpdate(Realm realm, FavoriteInfoColumnInfo columnInfo, com.amirasghari.musicplayer.realm.FavoriteInfo object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.amirasghari.musicplayer.realm.FavoriteInfo) cachedRealmObject;
        }

        com.amirasghari.musicplayer.realm.FavoriteInfo realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.amirasghari.musicplayer.realm.FavoriteInfo.class);
            long pkColumnKey = columnInfo.musicPathColKey;
            String value = ((com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface) object).realmGet$musicPath();
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
                    realmObject = new io.realm.com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.amirasghari.musicplayer.realm.FavoriteInfo copy(Realm realm, FavoriteInfoColumnInfo columnInfo, com.amirasghari.musicplayer.realm.FavoriteInfo newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.amirasghari.musicplayer.realm.FavoriteInfo) cachedRealmObject;
        }

        com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface unmanagedSource = (com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface) newObject;

        Table table = realm.getTable(com.amirasghari.musicplayer.realm.FavoriteInfo.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.musicPathColKey, unmanagedSource.realmGet$musicPath());
        builder.addString(columnInfo.musicNameColKey, unmanagedSource.realmGet$musicName());
        builder.addString(columnInfo.artistNameColKey, unmanagedSource.realmGet$artistName());
        builder.addString(columnInfo.imagePathColKey, unmanagedSource.realmGet$imagePath());
        builder.addString(columnInfo.durationColKey, unmanagedSource.realmGet$duration());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.amirasghari.musicplayer.realm.FavoriteInfo object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.amirasghari.musicplayer.realm.FavoriteInfo.class);
        long tableNativePtr = table.getNativePtr();
        FavoriteInfoColumnInfo columnInfo = (FavoriteInfoColumnInfo) realm.getSchema().getColumnInfo(com.amirasghari.musicplayer.realm.FavoriteInfo.class);
        long pkColumnKey = columnInfo.musicPathColKey;
        String primaryKeyValue = ((com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface) object).realmGet$musicPath();
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
        String realmGet$musicName = ((com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface) object).realmGet$musicName();
        if (realmGet$musicName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.musicNameColKey, objKey, realmGet$musicName, false);
        }
        String realmGet$artistName = ((com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface) object).realmGet$artistName();
        if (realmGet$artistName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.artistNameColKey, objKey, realmGet$artistName, false);
        }
        String realmGet$imagePath = ((com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface) object).realmGet$imagePath();
        if (realmGet$imagePath != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.imagePathColKey, objKey, realmGet$imagePath, false);
        }
        String realmGet$duration = ((com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface) object).realmGet$duration();
        if (realmGet$duration != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.durationColKey, objKey, realmGet$duration, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.amirasghari.musicplayer.realm.FavoriteInfo.class);
        long tableNativePtr = table.getNativePtr();
        FavoriteInfoColumnInfo columnInfo = (FavoriteInfoColumnInfo) realm.getSchema().getColumnInfo(com.amirasghari.musicplayer.realm.FavoriteInfo.class);
        long pkColumnKey = columnInfo.musicPathColKey;
        com.amirasghari.musicplayer.realm.FavoriteInfo object = null;
        while (objects.hasNext()) {
            object = (com.amirasghari.musicplayer.realm.FavoriteInfo) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface) object).realmGet$musicPath();
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
            String realmGet$musicName = ((com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface) object).realmGet$musicName();
            if (realmGet$musicName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.musicNameColKey, objKey, realmGet$musicName, false);
            }
            String realmGet$artistName = ((com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface) object).realmGet$artistName();
            if (realmGet$artistName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.artistNameColKey, objKey, realmGet$artistName, false);
            }
            String realmGet$imagePath = ((com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface) object).realmGet$imagePath();
            if (realmGet$imagePath != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.imagePathColKey, objKey, realmGet$imagePath, false);
            }
            String realmGet$duration = ((com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface) object).realmGet$duration();
            if (realmGet$duration != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.durationColKey, objKey, realmGet$duration, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.amirasghari.musicplayer.realm.FavoriteInfo object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.amirasghari.musicplayer.realm.FavoriteInfo.class);
        long tableNativePtr = table.getNativePtr();
        FavoriteInfoColumnInfo columnInfo = (FavoriteInfoColumnInfo) realm.getSchema().getColumnInfo(com.amirasghari.musicplayer.realm.FavoriteInfo.class);
        long pkColumnKey = columnInfo.musicPathColKey;
        String primaryKeyValue = ((com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface) object).realmGet$musicPath();
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
        String realmGet$musicName = ((com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface) object).realmGet$musicName();
        if (realmGet$musicName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.musicNameColKey, objKey, realmGet$musicName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.musicNameColKey, objKey, false);
        }
        String realmGet$artistName = ((com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface) object).realmGet$artistName();
        if (realmGet$artistName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.artistNameColKey, objKey, realmGet$artistName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.artistNameColKey, objKey, false);
        }
        String realmGet$imagePath = ((com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface) object).realmGet$imagePath();
        if (realmGet$imagePath != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.imagePathColKey, objKey, realmGet$imagePath, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.imagePathColKey, objKey, false);
        }
        String realmGet$duration = ((com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface) object).realmGet$duration();
        if (realmGet$duration != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.durationColKey, objKey, realmGet$duration, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.durationColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.amirasghari.musicplayer.realm.FavoriteInfo.class);
        long tableNativePtr = table.getNativePtr();
        FavoriteInfoColumnInfo columnInfo = (FavoriteInfoColumnInfo) realm.getSchema().getColumnInfo(com.amirasghari.musicplayer.realm.FavoriteInfo.class);
        long pkColumnKey = columnInfo.musicPathColKey;
        com.amirasghari.musicplayer.realm.FavoriteInfo object = null;
        while (objects.hasNext()) {
            object = (com.amirasghari.musicplayer.realm.FavoriteInfo) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface) object).realmGet$musicPath();
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
            String realmGet$musicName = ((com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface) object).realmGet$musicName();
            if (realmGet$musicName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.musicNameColKey, objKey, realmGet$musicName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.musicNameColKey, objKey, false);
            }
            String realmGet$artistName = ((com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface) object).realmGet$artistName();
            if (realmGet$artistName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.artistNameColKey, objKey, realmGet$artistName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.artistNameColKey, objKey, false);
            }
            String realmGet$imagePath = ((com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface) object).realmGet$imagePath();
            if (realmGet$imagePath != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.imagePathColKey, objKey, realmGet$imagePath, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.imagePathColKey, objKey, false);
            }
            String realmGet$duration = ((com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface) object).realmGet$duration();
            if (realmGet$duration != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.durationColKey, objKey, realmGet$duration, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.durationColKey, objKey, false);
            }
        }
    }

    public static com.amirasghari.musicplayer.realm.FavoriteInfo createDetachedCopy(com.amirasghari.musicplayer.realm.FavoriteInfo realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.amirasghari.musicplayer.realm.FavoriteInfo unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.amirasghari.musicplayer.realm.FavoriteInfo();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.amirasghari.musicplayer.realm.FavoriteInfo) cachedObject.object;
            }
            unmanagedObject = (com.amirasghari.musicplayer.realm.FavoriteInfo) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface unmanagedCopy = (com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface) unmanagedObject;
        com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface realmSource = (com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$musicPath(realmSource.realmGet$musicPath());
        unmanagedCopy.realmSet$musicName(realmSource.realmGet$musicName());
        unmanagedCopy.realmSet$artistName(realmSource.realmGet$artistName());
        unmanagedCopy.realmSet$imagePath(realmSource.realmGet$imagePath());
        unmanagedCopy.realmSet$duration(realmSource.realmGet$duration());

        return unmanagedObject;
    }

    static com.amirasghari.musicplayer.realm.FavoriteInfo update(Realm realm, FavoriteInfoColumnInfo columnInfo, com.amirasghari.musicplayer.realm.FavoriteInfo realmObject, com.amirasghari.musicplayer.realm.FavoriteInfo newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface realmObjectTarget = (com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface) realmObject;
        com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface realmObjectSource = (com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxyInterface) newObject;
        Table table = realm.getTable(com.amirasghari.musicplayer.realm.FavoriteInfo.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.musicPathColKey, realmObjectSource.realmGet$musicPath());
        builder.addString(columnInfo.musicNameColKey, realmObjectSource.realmGet$musicName());
        builder.addString(columnInfo.artistNameColKey, realmObjectSource.realmGet$artistName());
        builder.addString(columnInfo.imagePathColKey, realmObjectSource.realmGet$imagePath());
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
        StringBuilder stringBuilder = new StringBuilder("FavoriteInfo = proxy[");
        stringBuilder.append("{musicPath:");
        stringBuilder.append(realmGet$musicPath() != null ? realmGet$musicPath() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{musicName:");
        stringBuilder.append(realmGet$musicName() != null ? realmGet$musicName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{artistName:");
        stringBuilder.append(realmGet$artistName() != null ? realmGet$artistName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{imagePath:");
        stringBuilder.append(realmGet$imagePath() != null ? realmGet$imagePath() : "null");
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
        com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxy aFavoriteInfo = (com_amirasghari_musicplayer_realm_FavoriteInfoRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aFavoriteInfo.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aFavoriteInfo.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aFavoriteInfo.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
