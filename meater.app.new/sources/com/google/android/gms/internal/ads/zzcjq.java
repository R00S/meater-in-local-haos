package com.google.android.gms.internal.ads;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.zzwt;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzcjq {
    /* renamed from: a */
    public static int m18842a(SQLiteDatabase sQLiteDatabase, int i2) {
        int i3 = 0;
        String[] strArr = {"total"};
        String[] strArr2 = new String[1];
        if (i2 == 1) {
            strArr2[0] = "failed_requests";
        } else if (i2 == 2) {
            strArr2[0] = "total_requests";
        }
        Cursor cursorQuery = sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
        if (cursorQuery.getCount() > 0) {
            cursorQuery.moveToNext();
            i3 = 0 + cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("total"));
        }
        cursorQuery.close();
        return i3;
    }

    /* renamed from: b */
    public static ArrayList<zzwt.zzi.zza> m18843b(SQLiteDatabase sQLiteDatabase) {
        ArrayList<zzwt.zzi.zza> arrayList = new ArrayList<>();
        Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(zzwt.zzi.zza.m20760V(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (zzdok e2) {
                zzbad.m17351g("Unable to deserialize proto from offline signals database:");
                zzbad.m17351g(e2.getMessage());
            }
        }
        cursorQuery.close();
        return arrayList;
    }
}
