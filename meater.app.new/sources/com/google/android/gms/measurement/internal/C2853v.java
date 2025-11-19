package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.C2569r2;
import g7.C3445p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2853v {

    /* renamed from: a, reason: collision with root package name */
    private final String f35679a;

    /* renamed from: b, reason: collision with root package name */
    private long f35680b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C2812p f35681c;

    public C2853v(C2812p c2812p, String str) {
        this.f35681c = c2812p;
        C3445p.e(str);
        this.f35679a = str;
        this.f35680b = -1L;
    }

    public final List<C2839t> a() {
        Cursor cursorQuery;
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursorQuery = this.f35681c.C().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{this.f35679a, String.valueOf(this.f35680b)}, null, null, "rowid", "1000");
            } catch (SQLiteException e10) {
                this.f35681c.k().H().c("Data loss. Error querying raw events batch. appId", C2759h2.w(this.f35679a), e10);
                if (0 != 0) {
                    cursor.close();
                }
            }
            if (!cursorQuery.moveToFirst()) {
                List<C2839t> listEmptyList = Collections.emptyList();
                cursorQuery.close();
                return listEmptyList;
            }
            do {
                long j10 = cursorQuery.getLong(0);
                long j11 = cursorQuery.getLong(3);
                boolean z10 = cursorQuery.getLong(5) == 1;
                byte[] blob = cursorQuery.getBlob(4);
                if (j10 > this.f35680b) {
                    this.f35680b = j10;
                }
                try {
                    C2569r2.a aVar = (C2569r2.a) N5.H(C2569r2.W(), blob);
                    String string = cursorQuery.getString(1);
                    if (string == null) {
                        string = "";
                    }
                    aVar.G(string).I(cursorQuery.getLong(2));
                    arrayList.add(new C2839t(j10, j11, z10, (C2569r2) ((com.google.android.gms.internal.measurement.F4) aVar.x())));
                } catch (IOException e11) {
                    this.f35681c.k().H().c("Data loss. Failed to merge raw event. appId", C2759h2.w(this.f35679a), e11);
                }
            } while (cursorQuery.moveToNext());
            cursorQuery.close();
            return arrayList;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public C2853v(C2812p c2812p, String str, long j10) {
        this.f35681c = c2812p;
        C3445p.e(str);
        this.f35679a = str;
        this.f35680b = c2812p.J("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j10)}, -1L);
    }
}
