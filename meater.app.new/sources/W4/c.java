package W4;

import M4.h;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.data.ProtocolParameters;
import com.apptionlabs.meater_app.meatCutStructure.LegacyMeatHelper;
import com.apptionlabs.meater_app.model.HighResTemperatureLog;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MEATERTypeConverters;
import com.apptionlabs.meater_app.model.SavedCook;
import java.io.File;
import java.util.Arrays;

/* compiled from: V2DatabaseMigrator.java */
/* loaded from: classes2.dex */
class c {
    private static void a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = sQLiteDatabase.query("MeaterCooks", new String[]{"CookId", "mlsCookId", "MeaterCookType", "MeaterCutType", "CookName", "TargetTemperature", "PeakTemperature", "Favourite", "CookStartTime", "CookElapsedTime", "MeaterCookState", "MeaterMeatType", "NumberOfAlarms", "cookAlarms", "temperatureLog"}, null, null, null, null, null);
        if (cursorQuery == null) {
            return;
        }
        cursorQuery.moveToFirst();
        while (!cursorQuery.isAfterLast()) {
            SavedCook savedCook = new SavedCook();
            savedCook.setCookID(cursorQuery.getLong(cursorQuery.getColumnIndex("mlsCookId")));
            savedCook.setCookStartTime(cursorQuery.getLong(cursorQuery.getColumnIndex("CookStartTime")));
            savedCook.setCookTime(cursorQuery.getLong(cursorQuery.getColumnIndex("CookElapsedTime")));
            boolean z10 = true;
            if (cursorQuery.getInt(cursorQuery.getColumnIndex("Favourite")) != 1) {
                z10 = false;
            }
            savedCook.setFavourite(z10);
            savedCook.setTargetTemperature(cursorQuery.getInt(cursorQuery.getColumnIndex("TargetTemperature")));
            savedCook.setPeakTemperature(cursorQuery.getInt(cursorQuery.getColumnIndex("PeakTemperature")));
            savedCook.setCookName(cursorQuery.getString(cursorQuery.getColumnIndex("CookName")));
            savedCook.setCutId(LegacyMeatHelper.getInstance().getCutTypeFromLegacyMeat(cursorQuery.getInt(cursorQuery.getColumnIndex("MeaterMeatType")), cursorQuery.getInt(cursorQuery.getColumnIndex("MeaterCutType"))));
            savedCook.setAlerts(MEATERTypeConverters.alertListFromLegacyGSON(cursorQuery.getString(cursorQuery.getColumnIndex("cookAlarms"))));
            savedCook.setTemperatureLog(HighResTemperatureLog.logWithTemperatureLog(MEATERTypeConverters.temperatureLogFromLegacyGSON(cursorQuery.getString(cursorQuery.getColumnIndex("temperatureLog")))));
            LocalStorage.sharedStorage().savedCookDAO().h(savedCook);
            cursorQuery.moveToNext();
        }
        cursorQuery.close();
    }

    public static void b(Context context) {
        try {
            String strD = d(context);
            File file = new File(strD);
            if (file.exists()) {
                U4.b.h("v2 database detected - will migrate...", new Object[0]);
                SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(strD, null, 0);
                c(sQLiteDatabaseOpenDatabase);
                a(sQLiteDatabaseOpenDatabase);
                file.delete();
            }
        } catch (Exception e10) {
            U4.b.h("Failed to migrate v2 DB because: %s", e10.getMessage());
        }
    }

    private static void c(SQLiteDatabase sQLiteDatabase) {
        MEATERDevice mEATERDeviceNewDevice;
        Cursor cursorQuery = sQLiteDatabase.query("MeaterProbes", new String[]{ProtocolParameters.MEATER_NOTIF_DISCOVER_SER_NUM, "deviceId", "address"}, null, null, null, null, null);
        if (cursorQuery == null) {
            return;
        }
        cursorQuery.moveToFirst();
        while (!cursorQuery.isAfterLast()) {
            long j10 = cursorQuery.getLong(cursorQuery.getColumnIndex(ProtocolParameters.MEATER_NOTIF_DISCOVER_SER_NUM));
            int i10 = cursorQuery.getInt(cursorQuery.getColumnIndex("deviceId"));
            String string = cursorQuery.getString(cursorQuery.getColumnIndex("address"));
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

    private static String d(Context context) {
        return context.getDatabasePath("Meater2").toString();
    }
}
