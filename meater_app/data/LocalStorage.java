package com.apptionlabs.meater_app.data;

import a6.c;
import a6.e;
import a6.i;
import android.content.Context;
import android.database.Cursor;
import androidx.room.t;
import androidx.room.u;
import com.apptionlabs.meater_app.model.HighResTempLogRecording;
import com.apptionlabs.meater_app.model.HighResTemperatureLog;
import com.apptionlabs.meater_app.model.MEATERTypeConverters;
import j6.k;
import java.util.Iterator;
import t3.g;

/* loaded from: /tmp/meat/meat/classes.dex */
public abstract class LocalStorage extends u {
    private static final q3.a MIGRATION_1_2;
    private static final q3.a MIGRATION_2_3;
    private static final q3.a MIGRATION_3_4;
    private static final q3.a MIGRATION_4_5;
    private static final q3.a MIGRATION_5_6;
    private static final q3.a MIGRATION_6_7;
    private static final q3.a MIGRATION_7_8;
    private static final q3.a MIGRATION_8_9;
    private static final q3.a MIGRATION_9_10;
    private static LocalStorage sharedStorage;

    static {
        int i10 = 2;
        MIGRATION_1_2 = new q3.a(1, i10) { // from class: com.apptionlabs.meater_app.data.LocalStorage.1
            @Override // q3.a
            public void migrate(g gVar) {
                gVar.K("ALTER TABLE SavedCook ADD COLUMN needs_deleting INTEGER NOT NULL DEFAULT 0 ");
                gVar.K("ALTER TABLE SavedCook ADD COLUMN needs_uploading INTEGER NOT NULL DEFAULT 1 ");
                gVar.K("ALTER TABLE SavedCook ADD COLUMN updated_at INTEGER NOT NULL DEFAULT 0 ");
                gVar.K("ALTER TABLE SavedCook ADD COLUMN cook_state INTEGER NOT NULL DEFAULT 0 ");
                gVar.K("ALTER TABLE SavedCook ADD COLUMN cook_device_id INTEGER NOT NULL DEFAULT 0 ");
                gVar.K("ALTER TABLE SavedCook ADD COLUMN cook_probe_number INTEGER NOT NULL DEFAULT 0 ");
                gVar.K("ALTER TABLE SavedCook ADD COLUMN is_finished INTEGER NOT NULL DEFAULT 0 ");
                gVar.K("CREATE TABLE IF NOT EXISTS SavedEventLog (localMEATEREvent TEXT NOT NULL, cookID INTEGER NOT NULL, eventLogID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
                gVar.K("Update  SavedCook set cook_state =6  where   (cookTime  >= 300 and peakTemperature > (40*16))");
                gVar.K("Update  SavedCook set is_finished = 1   where   (cookTime  >= 300 and peakTemperature > (40*16))");
                gVar.K("Update  SavedCook set needs_uploading = 1  where   (cookTime  >= 300 and peakTemperature > (40*16))");
            }
        };
        int i11 = 3;
        MIGRATION_2_3 = new q3.a(i10, i11) { // from class: com.apptionlabs.meater_app.data.LocalStorage.2
            @Override // q3.a
            public void migrate(g gVar) {
                gVar.K("ALTER TABLE SavedCook ADD COLUMN dropInTempBeforeReady INTEGER NOT NULL DEFAULT " + k.a());
                gVar.K("ALTER TABLE SavedCook ADD COLUMN secondsDelayBeforeReady INTEGER NOT NULL DEFAULT 0");
            }
        };
        int i12 = 4;
        MIGRATION_3_4 = new q3.a(i11, i12) { // from class: com.apptionlabs.meater_app.data.LocalStorage.3
            @Override // q3.a
            public void migrate(g gVar) {
                gVar.K("UPDATE SavedCook SET dropInTempBeforeReady = " + k.a());
                gVar.K("ALTER TABLE SavedCook ADD COLUMN secondsDelayBeforeResting INTEGER NOT NULL DEFAULT 30");
            }
        };
        int i13 = 5;
        MIGRATION_4_5 = new q3.a(i12, i13) { // from class: com.apptionlabs.meater_app.data.LocalStorage.4
            @Override // q3.a
            public void migrate(g gVar) {
                gVar.K("ALTER TABLE SavedCook ADD COLUMN feedback INTEGER NOT NULL DEFAULT 0");
            }
        };
        int i14 = 6;
        MIGRATION_5_6 = new q3.a(i13, i14) { // from class: com.apptionlabs.meater_app.data.LocalStorage.5
            @Override // q3.a
            public void migrate(g gVar) {
                gVar.K("ALTER TABLE SavedCook ADD COLUMN parentDeviceID INTEGER NOT NULL DEFAULT 0");
                gVar.K("ALTER TABLE SavedCook ADD COLUMN parentProbeNumber INTEGER NOT NULL DEFAULT 0");
                gVar.K("ALTER TABLE SavedCook ADD COLUMN parentFirmwareRevision TEXT");
                gVar.K("ALTER TABLE SavedCook ADD COLUMN firmwareRevision TEXT");
                gVar.K("CREATE TABLE IF NOT EXISTS CookNote (value INTEGER NOT NULL,type INTEGER NOT NULL,updated_at INTEGER NOT NULL ,needs_uploading INTEGER NOT NULL ,needs_deleting INTEGER NOT NULL , note TEXT, noteCookId  INTEGER NOT NULL, cookId  Text , timestamp REAL NOT NULL  , noteID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
            }
        };
        int i15 = 7;
        MIGRATION_6_7 = new q3.a(i14, i15) { // from class: com.apptionlabs.meater_app.data.LocalStorage.6
            @Override // q3.a
            public void migrate(g gVar) {
                gVar.K("ALTER TABLE SavedCook ADD COLUMN cookPresetId INTEGER NOT NULL DEFAULT 0");
                LocalStorage.updateSavedCook(gVar);
                gVar.K("ALTER TABLE SavedCook ADD COLUMN clipNumber INTEGER NOT NULL DEFAULT 0 ");
                gVar.K("ALTER TABLE MEATERDevice ADD COLUMN clipNumber INTEGER NOT NULL DEFAULT 0 ");
                gVar.K("ALTER TABLE SavedCook ADD COLUMN setupSeqNum INTEGER NOT NULL DEFAULT 0 ");
                gVar.K("ALTER TABLE SavedCook ADD COLUMN targetMinimumAmbientTemperature INTEGER NOT NULL DEFAULT -1024 ");
                gVar.K("ALTER TABLE SavedCook ADD COLUMN targetMaximumAmbientTemperature INTEGER NOT NULL DEFAULT -1024 ");
            }
        };
        int i16 = 8;
        MIGRATION_7_8 = new q3.a(i15, i16) { // from class: com.apptionlabs.meater_app.data.LocalStorage.7
            @Override // q3.a
            public void migrate(g gVar) {
                gVar.K("ALTER TABLE MEATERDevice ADD COLUMN haveNotifiedUserOfLowBattery INTEGER NOT NULL DEFAULT 0");
                gVar.K("ALTER TABLE MEATERDevice ADD COLUMN haveNotifiedUserOfEmptyBattery INTEGER NOT NULL DEFAULT 0");
            }
        };
        int i17 = 9;
        MIGRATION_8_9 = new q3.a(i16, i17) { // from class: com.apptionlabs.meater_app.data.LocalStorage.8
            @Override // q3.a
            public void migrate(g gVar) {
                gVar.K("ALTER TABLE SavedCook ADD COLUMN recipeID INTEGER NOT NULL DEFAULT 0");
                gVar.K("ALTER TABLE SavedCook ADD COLUMN onGoingRecipeID INTEGER NOT NULL DEFAULT 0");
                gVar.K("ALTER TABLE SavedCook ADD COLUMN stepID INTEGER NOT NULL DEFAULT -1");
            }
        };
        MIGRATION_9_10 = new q3.a(i17, 10) { // from class: com.apptionlabs.meater_app.data.LocalStorage.9
            @Override // q3.a
            public void migrate(g gVar) {
                gVar.K("CREATE TABLE IF NOT EXISTS PendingRequest (requestID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, requestMethod TEXT NOT NULL, requestBody TEXT NOT NULL)");
                gVar.K("ALTER TABLE MEATERDevice ADD COLUMN ongoingRecipeID INTEGER NOT NULL DEFAULT -1");
            }
        };
    }

    public static LocalStorage sharedStorage() {
        Context i10 = com.apptionlabs.meater_app.app.a.i();
        if (sharedStorage == null) {
            sharedStorage = (LocalStorage) t.a(i10.getApplicationContext(), LocalStorage.class, "MEATERLocalStorage").b().a(MIGRATION_1_2, MIGRATION_2_3, MIGRATION_3_4, MIGRATION_4_5, MIGRATION_5_6, MIGRATION_6_7, MIGRATION_7_8, MIGRATION_8_9, MIGRATION_9_10).c();
        }
        return sharedStorage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void updateSavedCook(g gVar) {
        Cursor E0 = gVar.E0("SELECT cookID, temperatureLog FROM SavedCook");
        E0.moveToFirst();
        while (!E0.isAfterLast()) {
            long j10 = E0.getLong(0);
            HighResTemperatureLog stringToTemperatureHighResLog = MEATERTypeConverters.stringToTemperatureHighResLog(E0.getString(1));
            Iterator<HighResTempLogRecording> it = stringToTemperatureHighResLog.getGraphData().getData().iterator();
            while (it.hasNext()) {
                it.next().convertTo32();
            }
            gVar.t0("Update SavedCook set temperatureLog = ? WHERE cookID = ?", new Object[]{MEATERTypeConverters.temperatureLogToString(stringToTemperatureHighResLog), Long.valueOf(j10)});
            E0.moveToNext();
        }
        E0.close();
        gVar.K("Update  SavedCook set targetTemperature  = targetTemperature *2 ");
        gVar.K("Update  SavedCook set peakTemperature  = peakTemperature *2 ");
    }

    public abstract a6.a cookNoteDAO();

    public abstract c deviceDAO();

    public abstract e oldCookIDDAO();

    public abstract a6.g pendingRequestDAO();

    public abstract i savedCookDAO();

    public abstract a6.k savedEventLogDAO();
}
