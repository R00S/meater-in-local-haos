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
import com.apptionlabs.meater_app.model.OldCookID;
import com.apptionlabs.meater_app.model.SavedCook;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: V3DatabaseMigrator.java */
/* loaded from: classes2.dex */
public class d {
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
            int i10 = cursorQuery.getInt(cursorQuery.getColumnIndex("MeaterMeatType"));
            int i11 = cursorQuery.getInt(cursorQuery.getColumnIndex("MeaterCutType"));
            int cutTypeFromLegacyMeat = LegacyMeatHelper.getInstance().getCutTypeFromLegacyMeat(i10, i11);
            savedCook.setCutId(cutTypeFromLegacyMeat);
            U4.b.h("<newCutId>> is: %d  old meatType: %d old cutyType: %d ", Integer.valueOf(cutTypeFromLegacyMeat), Integer.valueOf(i10), Integer.valueOf(i11));
            savedCook.setAlerts(MEATERTypeConverters.alertListFromLegacyGSON(cursorQuery.getString(cursorQuery.getColumnIndex("cookAlarms"))));
            savedCook.setTemperatureLog(HighResTemperatureLog.logWithTemperatureLog(MEATERTypeConverters.temperatureLogFromLegacyGSON(cursorQuery.getString(cursorQuery.getColumnIndex("temperatureLog")))));
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
                U4.b.h("v3 database detected - will migrate...", new Object[0]);
                SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(strE, null, 0);
                c(sQLiteDatabaseOpenDatabase);
                d(sQLiteDatabaseOpenDatabase);
                a(sQLiteDatabaseOpenDatabase);
                file.delete();
            }
        } catch (Exception e10) {
            U4.b.h("Failed to migrate v2 DB because: %s", e10.getMessage());
        }
    }

    private static void c(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = sQLiteDatabase.query("OldCookId", new String[]{"cookId", "sequenceNumber"}, null, null, null, null, null);
        if (cursorQuery == null) {
            return;
        }
        cursorQuery.moveToFirst();
        while (!cursorQuery.isAfterLast()) {
            long j10 = cursorQuery.getLong(cursorQuery.getColumnIndex("cookId"));
            int i10 = cursorQuery.getInt(cursorQuery.getColumnIndex("sequenceNumber"));
            if (!OldCookID.isOldCookIDAndSeqNum(j10, i10)) {
                OldCookID.recordCookIDWithSeqNum(j10, i10);
            }
            cursorQuery.moveToNext();
        }
        cursorQuery.close();
    }

    private static void d(SQLiteDatabase sQLiteDatabase) {
        MEATERDevice mEATERDeviceNewDevice;
        Cursor cursorQuery = sQLiteDatabase.query("MeaterPeripherals", new String[]{ProtocolParameters.MEATER_NOTIF_DISCOVER_SER_NUM, "macAddress", "device_number", "paired", "parent_serialNumber", "blockFirmwareVersion", "meaterPlusFirmwareVersion"}, null, null, null, null, null);
        if (cursorQuery == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        cursorQuery.moveToFirst();
        while (true) {
            if (cursorQuery.isAfterLast()) {
                break;
            }
            long j10 = cursorQuery.getLong(cursorQuery.getColumnIndex(ProtocolParameters.MEATER_NOTIF_DISCOVER_SER_NUM));
            long j11 = cursorQuery.getLong(cursorQuery.getColumnIndex("parent_serialNumber"));
            long j12 = j11 != j10 ? j11 : 0L;
            int i10 = cursorQuery.getInt(cursorQuery.getColumnIndex("device_number"));
            String string = cursorQuery.getString(cursorQuery.getColumnIndex("macAddress"));
            boolean z10 = cursorQuery.getInt(cursorQuery.getColumnIndex("paired")) == 1;
            if (h.f11978a.o(j10) == null && (mEATERDeviceNewDevice = MEATERDevice.newDevice(i10, j10)) != null) {
                mEATERDeviceNewDevice.setDeviceID(j10);
                mEATERDeviceNewDevice.setProbeNumber(i10);
                mEATERDeviceNewDevice.setMacAddress(string);
                mEATERDeviceNewDevice.setPaired(z10);
                mEATERDeviceNewDevice.setParentDeviceID(j12);
                arrayList.add(mEATERDeviceNewDevice);
            }
            cursorQuery.moveToNext();
        }
        cursorQuery.close();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MEATERDevice mEATERDevice = (MEATERDevice) it.next();
            if (mEATERDevice.getParentDeviceID() == 0) {
                h.f11978a.Z(Arrays.asList(mEATERDevice));
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            MEATERDevice mEATERDevice2 = (MEATERDevice) it2.next();
            if (mEATERDevice2.getParentDeviceID() != 0) {
                h.f11978a.Z(Arrays.asList(mEATERDevice2));
            }
        }
    }

    private static String e(Context context) {
        return context.getDatabasePath("MeaterStorage").toString();
    }
}
