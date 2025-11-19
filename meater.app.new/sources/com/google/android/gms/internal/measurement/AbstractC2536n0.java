package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2536n0 extends SQLiteOpenHelper {
    public AbstractC2536n0(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10) {
        this(context, str, null, 1, AbstractC2567r0.f34281a);
    }

    private AbstractC2536n0(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10, AbstractC2567r0 abstractC2567r0) {
        super(context, (str == null || C2504j0.a().e(str, abstractC2567r0, EnumC2552p0.SQLITE_OPEN_HELPER_TYPE).equals("")) ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }
}
