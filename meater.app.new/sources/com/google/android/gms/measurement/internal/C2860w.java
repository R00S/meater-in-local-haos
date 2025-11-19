package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C2504j0;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2860w {
    private static Set<String> a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
            return hashSet;
        } finally {
            cursorRawQuery.close();
        }
    }

    static void b(C2759h2 c2759h2, SQLiteDatabase sQLiteDatabase) {
        if (c2759h2 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(C2504j0.a().c(sQLiteDatabase.getPath()));
        if (!file.setReadable(false, false)) {
            c2759h2.M().a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            c2759h2.M().a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            c2759h2.M().a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        c2759h2.M().a("Failed to turn on database write permission for owner");
    }

    static void c(C2759h2 c2759h2, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws SQLException {
        if (c2759h2 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        if (!d(c2759h2, sQLiteDatabase, str)) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            Set<String> setA = a(sQLiteDatabase, str);
            for (String str4 : str3.split(",")) {
                if (!setA.remove(str4)) {
                    throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                }
            }
            if (strArr != null) {
                for (int i10 = 0; i10 < strArr.length; i10 += 2) {
                    if (!setA.remove(strArr[i10])) {
                        sQLiteDatabase.execSQL(strArr[i10 + 1]);
                    }
                }
            }
            if (setA.isEmpty()) {
                return;
            }
            c2759h2.M().c("Table has extra columns. table, columns", str, TextUtils.join(", ", setA));
        } catch (SQLiteException e10) {
            c2759h2.H().b("Failed to verify columns on table that was just created", str);
            throw e10;
        }
    }

    private static boolean d(C2759h2 c2759h2, SQLiteDatabase sQLiteDatabase, String str) {
        if (c2759h2 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                boolean zMoveToFirst = cursorQuery.moveToFirst();
                cursorQuery.close();
                return zMoveToFirst;
            } catch (SQLiteException e10) {
                c2759h2.M().c("Error querying for table", str, e10);
                if (cursorQuery == null) {
                    return false;
                }
                cursorQuery.close();
                return false;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }
}
