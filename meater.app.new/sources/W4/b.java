package W4;

import M4.h;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.meatCutStructure.LegacyMeatHelper;
import com.apptionlabs.meater_app.model.Alert;
import com.apptionlabs.meater_app.model.HighResTemperatureLog;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.OldCookID;
import com.apptionlabs.meater_app.model.SavedCook;
import com.apptionlabs.meater_app.model.TemperatureLog;
import com.apptionlabs.meater_app.model.TemperatureLogRecording;
import com.apptionlabs.meater_app.v3protobuf.AlarmState;
import com.apptionlabs.meater_app.v3protobuf.AlarmType;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: V1DatabaseMigrator.java */
/* loaded from: classes2.dex */
class b {
    private static void a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = sQLiteDatabase.query("cook_table", new String[]{"cook_id", "mls_cook_id", "cook_time", "cook_elapsed_time", "cook_target_temperature", "cook_peak_temperature", "cook_name", "cook_meat_type", "cook_cut_type", "cook_type", "cook_is_favourite", "cook_total_alerts", "cook_alert_1_type", "cook_alert_1_value", "cook_alert_1_state", "cook_alert_1_name", "cook_alert_2_type", "cook_alert_2_value", "cook_alert_2_state", "cook_alert_2_name", "cook_alert_3_type", "cook_alert_3_value", "cook_alert_3_state", "cook_alert_3_name", "cook_alert_4_type", "cook_alert_4_value", "cook_alert_4_state", "cook_alert_4_name", "cook_log_interval", "cook_log_count", "cook_log_value"}, null, null, null, null, null);
        if (cursorQuery == null) {
            return;
        }
        cursorQuery.moveToFirst();
        while (!cursorQuery.isAfterLast()) {
            SavedCook savedCook = new SavedCook();
            savedCook.setCookID(cursorQuery.getLong(cursorQuery.getColumnIndex("mls_cook_id")));
            savedCook.setCookStartTime(cursorQuery.getLong(cursorQuery.getColumnIndex("cook_time")));
            savedCook.setCookTime(cursorQuery.getLong(cursorQuery.getColumnIndex("cook_elapsed_time")));
            savedCook.setFavourite(cursorQuery.getInt(cursorQuery.getColumnIndex("cook_is_favourite")) == 1);
            savedCook.setTargetTemperature(cursorQuery.getInt(cursorQuery.getColumnIndex("cook_target_temperature")));
            savedCook.setPeakTemperature(cursorQuery.getInt(cursorQuery.getColumnIndex("cook_peak_temperature")));
            savedCook.setCookName(cursorQuery.getString(cursorQuery.getColumnIndex("cook_name")));
            savedCook.setCutId(LegacyMeatHelper.getInstance().getCutTypeFromLegacyMeat(cursorQuery.getInt(cursorQuery.getColumnIndex("cook_meat_type")), cursorQuery.getInt(cursorQuery.getColumnIndex("MeaterCutType"))));
            ArrayList arrayList = new ArrayList();
            int i10 = cursorQuery.getInt(cursorQuery.getColumnIndex("cook_total_alerts"));
            if (i10 > 0) {
                Alert alert = new Alert();
                alert.setType(AlarmType.fromValue(cursorQuery.getInt(cursorQuery.getColumnIndex("cook_alert_1_type"))));
                alert.setLimit(cursorQuery.getInt(cursorQuery.getColumnIndex("cook_alert_1_value")));
                alert.setState(AlarmState.fromValue(cursorQuery.getInt(cursorQuery.getColumnIndex("cook_alert_1_state"))));
                alert.setName(cursorQuery.getString(cursorQuery.getColumnIndex("cook_alert_1_name")));
                arrayList.add(alert);
            }
            if (i10 > 1) {
                Alert alert2 = new Alert();
                alert2.setType(AlarmType.fromValue(cursorQuery.getInt(cursorQuery.getColumnIndex("cook_alert_2_type"))));
                alert2.setLimit(cursorQuery.getInt(cursorQuery.getColumnIndex("cook_alert_2_value")));
                alert2.setState(AlarmState.fromValue(cursorQuery.getInt(cursorQuery.getColumnIndex("cook_alert_2_state"))));
                alert2.setName(cursorQuery.getString(cursorQuery.getColumnIndex("cook_alert_2_name")));
                arrayList.add(alert2);
            }
            if (i10 > 2) {
                Alert alert3 = new Alert();
                alert3.setType(AlarmType.fromValue(cursorQuery.getInt(cursorQuery.getColumnIndex("cook_alert_3_type"))));
                alert3.setLimit(cursorQuery.getInt(cursorQuery.getColumnIndex("cook_alert_3_value")));
                alert3.setState(AlarmState.fromValue(cursorQuery.getInt(cursorQuery.getColumnIndex("cook_alert_3_state"))));
                alert3.setName(cursorQuery.getString(cursorQuery.getColumnIndex("cook_alert_3_name")));
                arrayList.add(alert3);
            }
            if (i10 > 3) {
                Alert alert4 = new Alert();
                alert4.setType(AlarmType.fromValue(cursorQuery.getInt(cursorQuery.getColumnIndex("cook_alert_4_type"))));
                alert4.setLimit(cursorQuery.getInt(cursorQuery.getColumnIndex("cook_alert_4_value")));
                alert4.setState(AlarmState.fromValue(cursorQuery.getInt(cursorQuery.getColumnIndex("cook_alert_4_state"))));
                alert4.setName(cursorQuery.getString(cursorQuery.getColumnIndex("cook_alert_4_name")));
                arrayList.add(alert4);
            }
            savedCook.setAlerts(arrayList);
            int i11 = cursorQuery.getInt(cursorQuery.getColumnIndex("cook_log_interval"));
            int i12 = cursorQuery.getInt(cursorQuery.getColumnIndex("cook_log_count"));
            TemperatureLogRecording[] temperatureLogRecordingArr = new TemperatureLogRecording[TemperatureLog.MAX_TEMPERATURE_HISTORY_SAMPLES];
            if (i12 > 0) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(cursorQuery.getBlob(cursorQuery.getColumnIndex("cook_log_value")));
                for (int i13 = 0; i13 < i12; i13++) {
                    temperatureLogRecordingArr[i13] = new TemperatureLogRecording(byteBufferWrap.getShort(), byteBufferWrap.getShort());
                }
            }
            savedCook.setTemperatureLog(HighResTemperatureLog.logWithTemperatureLog(TemperatureLog.logWithIntervalAndRecordings(i11, i12, temperatureLogRecordingArr, false)));
            LocalStorage.sharedStorage().savedCookDAO().h(savedCook);
            cursorQuery.moveToNext();
        }
        cursorQuery.close();
    }

    public static void b(Context context) {
        try {
            String strE = e(context);
            File file = new File(strE);
            if (file.exists()) {
                U4.b.h("v1 database detected - will migrate...", new Object[0]);
                SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(strE, null, 0);
                if (f(sQLiteDatabaseOpenDatabase)) {
                    c(sQLiteDatabaseOpenDatabase);
                    d(sQLiteDatabaseOpenDatabase);
                    a(sQLiteDatabaseOpenDatabase);
                    file.delete();
                }
            }
        } catch (Exception e10) {
            U4.b.h("Failed to migrate v1 DB because: %s", e10.getMessage());
        }
    }

    private static void c(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = sQLiteDatabase.query("old_cook_id_table", new String[]{"cook_id", "sequence_num"}, null, null, null, null, null);
        if (cursorQuery == null) {
            return;
        }
        cursorQuery.moveToFirst();
        while (!cursorQuery.isAfterLast()) {
            long j10 = cursorQuery.getLong(cursorQuery.getColumnIndex("cook_id"));
            int i10 = cursorQuery.getInt(cursorQuery.getColumnIndex("sequence_num"));
            if (!OldCookID.isOldCookIDAndSeqNum(j10, i10)) {
                OldCookID.recordCookIDWithSeqNum(j10, i10);
            }
            cursorQuery.moveToNext();
        }
        cursorQuery.close();
    }

    private static void d(SQLiteDatabase sQLiteDatabase) {
        MEATERDevice mEATERDeviceNewDevice;
        Cursor cursorQuery = sQLiteDatabase.query("probe", new String[]{"probe_serial_number", "probe_id", "probe_mac"}, null, null, null, null, null);
        if (cursorQuery == null) {
            return;
        }
        cursorQuery.moveToFirst();
        while (!cursorQuery.isAfterLast()) {
            long j10 = cursorQuery.getLong(cursorQuery.getColumnIndex("probe_serial_number"));
            int i10 = cursorQuery.getInt(cursorQuery.getColumnIndex("probe_id"));
            String string = cursorQuery.getString(cursorQuery.getColumnIndex("probe_mac"));
            h hVar = h.f11978a;
            if (hVar.o(j10) == null && (mEATERDeviceNewDevice = MEATERDevice.newDevice(i10, j10)) != null) {
                mEATERDeviceNewDevice.setDeviceID(j10);
                mEATERDeviceNewDevice.setMacAddress(string);
                mEATERDeviceNewDevice.setPaired(true);
                hVar.Z(Arrays.asList(mEATERDeviceNewDevice));
            }
            cursorQuery.moveToNext();
        }
        cursorQuery.close();
    }

    private static String e(Context context) {
        return context.getDatabasePath("meatermeater_database.db").toString();
    }

    private static boolean f(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("PRAGMA user_version", null);
            int i10 = 0;
            while (cursorRawQuery.moveToNext()) {
                i10 = cursorRawQuery.getInt(0);
            }
            if (i10 == 0) {
                U4.b.h("v1 user_version not found - cannot proceed with migration.", new Object[0]);
                return false;
            }
            U4.b.h("v1 database version is %d", Integer.valueOf(i10));
            if (i10 <= 7) {
                U4.b.h("v1 database is too old to migrate - ignoring", new Object[0]);
                return false;
            }
            if (i10 < 9) {
                sQLiteDatabase.execSQL("ALTER TABLE cook_id ADD COLUMN sequence_num INTEGER");
            }
            if (i10 < 10) {
                sQLiteDatabase.execSQL("ALTER TABLE probe ADD COLUMN probe_mac TEXT");
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            cursorRawQuery.close();
            return true;
        } catch (Exception e10) {
            U4.b.h("Failed to upgrade v1 DB schema because: %s", e10.getMessage());
            sQLiteDatabase.endTransaction();
            return false;
        }
    }
}
