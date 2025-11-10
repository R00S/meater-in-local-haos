package com.apptionlabs.meater_app.data;

import a6.b;
import a6.c;
import a6.e;
import a6.g;
import a6.i;
import a6.j;
import a6.k;
import a6.l;
import androidx.room.f;
import androidx.room.o;
import androidx.room.u;
import androidx.room.w;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r3.d;
import t3.h;

/* loaded from: /tmp/meat/meat/classes.dex */
public final class LocalStorage_Impl extends LocalStorage {
    private volatile a6.a _cookNoteDAO;
    private volatile c _mEATERDeviceDAO;
    private volatile e _oldCookIDDAO;
    private volatile g _pendingRequestDAO;
    private volatile i _savedCookDAO;
    private volatile k _savedEventLogDAO;

    @Override // androidx.room.u
    public void clearAllTables() {
        super.assertNotMainThread();
        t3.g writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.K("DELETE FROM `SavedCook`");
            writableDatabase.K("DELETE FROM `OldCookID`");
            writableDatabase.K("DELETE FROM `MEATERDevice`");
            writableDatabase.K("DELETE FROM `SavedEventLog`");
            writableDatabase.K("DELETE FROM `CookNote`");
            writableDatabase.K("DELETE FROM `PendingRequest`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.E0("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.e1()) {
                writableDatabase.K("VACUUM");
            }
        }
    }

    @Override // com.apptionlabs.meater_app.data.LocalStorage
    public a6.a cookNoteDAO() {
        a6.a aVar;
        if (this._cookNoteDAO != null) {
            return this._cookNoteDAO;
        }
        synchronized (this) {
            try {
                if (this._cookNoteDAO == null) {
                    this._cookNoteDAO = new b(this);
                }
                aVar = this._cookNoteDAO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // androidx.room.u
    protected o createInvalidationTracker() {
        return new o(this, new HashMap(0), new HashMap(0), "SavedCook", "OldCookID", "MEATERDevice", "SavedEventLog", "CookNote", "PendingRequest");
    }

    @Override // androidx.room.u
    protected h createOpenHelper(f fVar) {
        return fVar.sqliteOpenHelperFactory.a(h.b.a(fVar.context).c(fVar.name).b(new w(fVar, new w.b(10) { // from class: com.apptionlabs.meater_app.data.LocalStorage_Impl.1
            @Override // androidx.room.w.b
            public void createAllTables(t3.g gVar) {
                gVar.K("CREATE TABLE IF NOT EXISTS `SavedCook` (`cookID` INTEGER NOT NULL, `isFavourite` INTEGER NOT NULL, `cookStartTime` INTEGER NOT NULL, `targetMinimumAmbientTemperature` INTEGER NOT NULL, `targetMaximumAmbientTemperature` INTEGER NOT NULL, `targetTemperature` INTEGER NOT NULL, `peakTemperature` INTEGER NOT NULL, `cookName` TEXT, `cookTime` INTEGER NOT NULL, `cutId` INTEGER NOT NULL, `cookPresetId` INTEGER NOT NULL, `alerts` TEXT NOT NULL, `temperatureLog` TEXT NOT NULL, `isModified` INTEGER NOT NULL, `needs_deleting` INTEGER NOT NULL, `feedback` INTEGER NOT NULL, `needs_uploading` INTEGER NOT NULL, `cook_probe_number` INTEGER NOT NULL, `cook_device_id` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, `cook_state` INTEGER NOT NULL, `is_finished` INTEGER NOT NULL, `parentDeviceID` INTEGER NOT NULL, `parentProbeNumber` INTEGER NOT NULL, `clipNumber` INTEGER NOT NULL, `firmwareRevision` TEXT, `parentFirmwareRevision` TEXT, `setupSeqNum` INTEGER NOT NULL, `recipeID` INTEGER NOT NULL, `dropInTempBeforeReady` INTEGER NOT NULL, `secondsDelayBeforeReady` INTEGER NOT NULL, `secondsDelayBeforeResting` INTEGER NOT NULL, `onGoingRecipeID` INTEGER NOT NULL, `stepID` INTEGER NOT NULL, PRIMARY KEY(`cookID`))");
                gVar.K("CREATE TABLE IF NOT EXISTS `OldCookID` (`cookID` INTEGER NOT NULL, `seqNum` INTEGER NOT NULL, PRIMARY KEY(`cookID`))");
                gVar.K("CREATE TABLE IF NOT EXISTS `MEATERDevice` (`isModified` INTEGER NOT NULL, `deviceID` INTEGER NOT NULL, `macAddress` TEXT, `parentDeviceID` INTEGER NOT NULL, `probeNumber` INTEGER NOT NULL, `clipNumber` INTEGER NOT NULL, `datePaired` INTEGER, `firmwareRevision` TEXT, `batteryLevel` INTEGER NOT NULL, `haveNotifiedUserOfLowBattery` INTEGER NOT NULL, `haveNotifiedUserOfEmptyBattery` INTEGER NOT NULL, `ongoingRecipeID` INTEGER NOT NULL, PRIMARY KEY(`deviceID`))");
                gVar.K("CREATE TABLE IF NOT EXISTS `SavedEventLog` (`eventLogID` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `cookID` INTEGER NOT NULL, `localMEATEREvent` TEXT NOT NULL)");
                gVar.K("CREATE TABLE IF NOT EXISTS `CookNote` (`noteID` INTEGER NOT NULL, `noteCookId` INTEGER NOT NULL, `cookId` TEXT, `note` TEXT, `value` INTEGER NOT NULL, `timestamp` REAL NOT NULL, `type` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, `needs_uploading` INTEGER NOT NULL, `needs_deleting` INTEGER NOT NULL, PRIMARY KEY(`noteID`))");
                gVar.K("CREATE TABLE IF NOT EXISTS `PendingRequest` (`requestID` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `requestMethod` TEXT NOT NULL, `requestBody` TEXT NOT NULL)");
                gVar.K("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                gVar.K("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '45e88b1786b32cc916628def0bb887b1')");
            }

            @Override // androidx.room.w.b
            public void dropAllTables(t3.g gVar) {
                gVar.K("DROP TABLE IF EXISTS `SavedCook`");
                gVar.K("DROP TABLE IF EXISTS `OldCookID`");
                gVar.K("DROP TABLE IF EXISTS `MEATERDevice`");
                gVar.K("DROP TABLE IF EXISTS `SavedEventLog`");
                gVar.K("DROP TABLE IF EXISTS `CookNote`");
                gVar.K("DROP TABLE IF EXISTS `PendingRequest`");
                if (((u) LocalStorage_Impl.this).mCallbacks != null) {
                    int size = ((u) LocalStorage_Impl.this).mCallbacks.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((u.b) ((u) LocalStorage_Impl.this).mCallbacks.get(i10)).b(gVar);
                    }
                }
            }

            @Override // androidx.room.w.b
            public void onCreate(t3.g gVar) {
                if (((u) LocalStorage_Impl.this).mCallbacks != null) {
                    int size = ((u) LocalStorage_Impl.this).mCallbacks.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((u.b) ((u) LocalStorage_Impl.this).mCallbacks.get(i10)).a(gVar);
                    }
                }
            }

            @Override // androidx.room.w.b
            public void onOpen(t3.g gVar) {
                ((u) LocalStorage_Impl.this).mDatabase = gVar;
                LocalStorage_Impl.this.internalInitInvalidationTracker(gVar);
                if (((u) LocalStorage_Impl.this).mCallbacks != null) {
                    int size = ((u) LocalStorage_Impl.this).mCallbacks.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((u.b) ((u) LocalStorage_Impl.this).mCallbacks.get(i10)).c(gVar);
                    }
                }
            }

            @Override // androidx.room.w.b
            public void onPreMigrate(t3.g gVar) {
                r3.b.a(gVar);
            }

            @Override // androidx.room.w.b
            public w.c onValidateSchema(t3.g gVar) {
                HashMap hashMap = new HashMap(34);
                hashMap.put("cookID", new d.a("cookID", "INTEGER", true, 1, null, 1));
                hashMap.put("isFavourite", new d.a("isFavourite", "INTEGER", true, 0, null, 1));
                hashMap.put("cookStartTime", new d.a("cookStartTime", "INTEGER", true, 0, null, 1));
                hashMap.put("targetMinimumAmbientTemperature", new d.a("targetMinimumAmbientTemperature", "INTEGER", true, 0, null, 1));
                hashMap.put("targetMaximumAmbientTemperature", new d.a("targetMaximumAmbientTemperature", "INTEGER", true, 0, null, 1));
                hashMap.put("targetTemperature", new d.a("targetTemperature", "INTEGER", true, 0, null, 1));
                hashMap.put("peakTemperature", new d.a("peakTemperature", "INTEGER", true, 0, null, 1));
                hashMap.put("cookName", new d.a("cookName", "TEXT", false, 0, null, 1));
                hashMap.put("cookTime", new d.a("cookTime", "INTEGER", true, 0, null, 1));
                hashMap.put("cutId", new d.a("cutId", "INTEGER", true, 0, null, 1));
                hashMap.put("cookPresetId", new d.a("cookPresetId", "INTEGER", true, 0, null, 1));
                hashMap.put("alerts", new d.a("alerts", "TEXT", true, 0, null, 1));
                hashMap.put("temperatureLog", new d.a("temperatureLog", "TEXT", true, 0, null, 1));
                hashMap.put("isModified", new d.a("isModified", "INTEGER", true, 0, null, 1));
                hashMap.put("needs_deleting", new d.a("needs_deleting", "INTEGER", true, 0, null, 1));
                hashMap.put("feedback", new d.a("feedback", "INTEGER", true, 0, null, 1));
                hashMap.put("needs_uploading", new d.a("needs_uploading", "INTEGER", true, 0, null, 1));
                hashMap.put("cook_probe_number", new d.a("cook_probe_number", "INTEGER", true, 0, null, 1));
                hashMap.put("cook_device_id", new d.a("cook_device_id", "INTEGER", true, 0, null, 1));
                hashMap.put("updated_at", new d.a("updated_at", "INTEGER", true, 0, null, 1));
                hashMap.put("cook_state", new d.a("cook_state", "INTEGER", true, 0, null, 1));
                hashMap.put("is_finished", new d.a("is_finished", "INTEGER", true, 0, null, 1));
                hashMap.put("parentDeviceID", new d.a("parentDeviceID", "INTEGER", true, 0, null, 1));
                hashMap.put("parentProbeNumber", new d.a("parentProbeNumber", "INTEGER", true, 0, null, 1));
                hashMap.put("clipNumber", new d.a("clipNumber", "INTEGER", true, 0, null, 1));
                hashMap.put("firmwareRevision", new d.a("firmwareRevision", "TEXT", false, 0, null, 1));
                hashMap.put("parentFirmwareRevision", new d.a("parentFirmwareRevision", "TEXT", false, 0, null, 1));
                hashMap.put("setupSeqNum", new d.a("setupSeqNum", "INTEGER", true, 0, null, 1));
                hashMap.put("recipeID", new d.a("recipeID", "INTEGER", true, 0, null, 1));
                hashMap.put("dropInTempBeforeReady", new d.a("dropInTempBeforeReady", "INTEGER", true, 0, null, 1));
                hashMap.put("secondsDelayBeforeReady", new d.a("secondsDelayBeforeReady", "INTEGER", true, 0, null, 1));
                hashMap.put("secondsDelayBeforeResting", new d.a("secondsDelayBeforeResting", "INTEGER", true, 0, null, 1));
                hashMap.put("onGoingRecipeID", new d.a("onGoingRecipeID", "INTEGER", true, 0, null, 1));
                hashMap.put("stepID", new d.a("stepID", "INTEGER", true, 0, null, 1));
                d dVar = new d("SavedCook", hashMap, new HashSet(0), new HashSet(0));
                d a10 = d.a(gVar, "SavedCook");
                if (!dVar.equals(a10)) {
                    return new w.c(false, "SavedCook(com.apptionlabs.meater_app.model.SavedCook).\n Expected:\n" + dVar + "\n Found:\n" + a10);
                }
                HashMap hashMap2 = new HashMap(2);
                hashMap2.put("cookID", new d.a("cookID", "INTEGER", true, 1, null, 1));
                hashMap2.put("seqNum", new d.a("seqNum", "INTEGER", true, 0, null, 1));
                d dVar2 = new d("OldCookID", hashMap2, new HashSet(0), new HashSet(0));
                d a11 = d.a(gVar, "OldCookID");
                if (!dVar2.equals(a11)) {
                    return new w.c(false, "OldCookID(com.apptionlabs.meater_app.model.OldCookID).\n Expected:\n" + dVar2 + "\n Found:\n" + a11);
                }
                HashMap hashMap3 = new HashMap(12);
                hashMap3.put("isModified", new d.a("isModified", "INTEGER", true, 0, null, 1));
                hashMap3.put("deviceID", new d.a("deviceID", "INTEGER", true, 1, null, 1));
                hashMap3.put("macAddress", new d.a("macAddress", "TEXT", false, 0, null, 1));
                hashMap3.put("parentDeviceID", new d.a("parentDeviceID", "INTEGER", true, 0, null, 1));
                hashMap3.put("probeNumber", new d.a("probeNumber", "INTEGER", true, 0, null, 1));
                hashMap3.put("clipNumber", new d.a("clipNumber", "INTEGER", true, 0, null, 1));
                hashMap3.put("datePaired", new d.a("datePaired", "INTEGER", false, 0, null, 1));
                hashMap3.put("firmwareRevision", new d.a("firmwareRevision", "TEXT", false, 0, null, 1));
                hashMap3.put("batteryLevel", new d.a("batteryLevel", "INTEGER", true, 0, null, 1));
                hashMap3.put("haveNotifiedUserOfLowBattery", new d.a("haveNotifiedUserOfLowBattery", "INTEGER", true, 0, null, 1));
                hashMap3.put("haveNotifiedUserOfEmptyBattery", new d.a("haveNotifiedUserOfEmptyBattery", "INTEGER", true, 0, null, 1));
                hashMap3.put("ongoingRecipeID", new d.a("ongoingRecipeID", "INTEGER", true, 0, null, 1));
                d dVar3 = new d("MEATERDevice", hashMap3, new HashSet(0), new HashSet(0));
                d a12 = d.a(gVar, "MEATERDevice");
                if (!dVar3.equals(a12)) {
                    return new w.c(false, "MEATERDevice(com.apptionlabs.meater_app.model.MEATERDevice).\n Expected:\n" + dVar3 + "\n Found:\n" + a12);
                }
                HashMap hashMap4 = new HashMap(3);
                hashMap4.put("eventLogID", new d.a("eventLogID", "INTEGER", true, 1, null, 1));
                hashMap4.put("cookID", new d.a("cookID", "INTEGER", true, 0, null, 1));
                hashMap4.put("localMEATEREvent", new d.a("localMEATEREvent", "TEXT", true, 0, null, 1));
                d dVar4 = new d("SavedEventLog", hashMap4, new HashSet(0), new HashSet(0));
                d a13 = d.a(gVar, "SavedEventLog");
                if (!dVar4.equals(a13)) {
                    return new w.c(false, "SavedEventLog(com.apptionlabs.meater_app.model.SavedEventLog).\n Expected:\n" + dVar4 + "\n Found:\n" + a13);
                }
                HashMap hashMap5 = new HashMap(10);
                hashMap5.put("noteID", new d.a("noteID", "INTEGER", true, 1, null, 1));
                hashMap5.put("noteCookId", new d.a("noteCookId", "INTEGER", true, 0, null, 1));
                hashMap5.put("cookId", new d.a("cookId", "TEXT", false, 0, null, 1));
                hashMap5.put("note", new d.a("note", "TEXT", false, 0, null, 1));
                hashMap5.put("value", new d.a("value", "INTEGER", true, 0, null, 1));
                hashMap5.put("timestamp", new d.a("timestamp", "REAL", true, 0, null, 1));
                hashMap5.put("type", new d.a("type", "INTEGER", true, 0, null, 1));
                hashMap5.put("updated_at", new d.a("updated_at", "INTEGER", true, 0, null, 1));
                hashMap5.put("needs_uploading", new d.a("needs_uploading", "INTEGER", true, 0, null, 1));
                hashMap5.put("needs_deleting", new d.a("needs_deleting", "INTEGER", true, 0, null, 1));
                d dVar5 = new d("CookNote", hashMap5, new HashSet(0), new HashSet(0));
                d a14 = d.a(gVar, "CookNote");
                if (!dVar5.equals(a14)) {
                    return new w.c(false, "CookNote(com.apptionlabs.meater_app.model.CookNote).\n Expected:\n" + dVar5 + "\n Found:\n" + a14);
                }
                HashMap hashMap6 = new HashMap(3);
                hashMap6.put("requestID", new d.a("requestID", "INTEGER", true, 1, null, 1));
                hashMap6.put("requestMethod", new d.a("requestMethod", "TEXT", true, 0, null, 1));
                hashMap6.put("requestBody", new d.a("requestBody", "TEXT", true, 0, null, 1));
                d dVar6 = new d("PendingRequest", hashMap6, new HashSet(0), new HashSet(0));
                d a15 = d.a(gVar, "PendingRequest");
                if (!dVar6.equals(a15)) {
                    return new w.c(false, "PendingRequest(com.apptionlabs.meater_app.model.PendingRequest).\n Expected:\n" + dVar6 + "\n Found:\n" + a15);
                }
                return new w.c(true, null);
            }

            @Override // androidx.room.w.b
            public void onPostMigrate(t3.g gVar) {
            }
        }, "45e88b1786b32cc916628def0bb887b1", "9bbdea64d59b681967fb50d9ebbca00e")).a());
    }

    @Override // com.apptionlabs.meater_app.data.LocalStorage
    public c deviceDAO() {
        c cVar;
        if (this._mEATERDeviceDAO != null) {
            return this._mEATERDeviceDAO;
        }
        synchronized (this) {
            try {
                if (this._mEATERDeviceDAO == null) {
                    this._mEATERDeviceDAO = new a6.d(this);
                }
                cVar = this._mEATERDeviceDAO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // androidx.room.u
    public List<q3.a> getAutoMigrations(Map<Class<Object>, Object> map) {
        return Arrays.asList(new q3.a[0]);
    }

    @Override // androidx.room.u
    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.u
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(c.class, a6.d.k());
        hashMap.put(i.class, j.k());
        hashMap.put(e.class, a6.f.e());
        hashMap.put(k.class, l.i());
        hashMap.put(a6.a.class, b.l());
        hashMap.put(g.class, a6.h.f());
        return hashMap;
    }

    @Override // com.apptionlabs.meater_app.data.LocalStorage
    public e oldCookIDDAO() {
        e eVar;
        if (this._oldCookIDDAO != null) {
            return this._oldCookIDDAO;
        }
        synchronized (this) {
            try {
                if (this._oldCookIDDAO == null) {
                    this._oldCookIDDAO = new a6.f(this);
                }
                eVar = this._oldCookIDDAO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // com.apptionlabs.meater_app.data.LocalStorage
    public g pendingRequestDAO() {
        g gVar;
        if (this._pendingRequestDAO != null) {
            return this._pendingRequestDAO;
        }
        synchronized (this) {
            try {
                if (this._pendingRequestDAO == null) {
                    this._pendingRequestDAO = new a6.h(this);
                }
                gVar = this._pendingRequestDAO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    @Override // com.apptionlabs.meater_app.data.LocalStorage
    public i savedCookDAO() {
        i iVar;
        if (this._savedCookDAO != null) {
            return this._savedCookDAO;
        }
        synchronized (this) {
            try {
                if (this._savedCookDAO == null) {
                    this._savedCookDAO = new j(this);
                }
                iVar = this._savedCookDAO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    @Override // com.apptionlabs.meater_app.data.LocalStorage
    public k savedEventLogDAO() {
        k kVar;
        if (this._savedEventLogDAO != null) {
            return this._savedEventLogDAO;
        }
        synchronized (this) {
            try {
                if (this._savedEventLogDAO == null) {
                    this._savedEventLogDAO = new l(this);
                }
                kVar = this._savedEventLogDAO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }
}
