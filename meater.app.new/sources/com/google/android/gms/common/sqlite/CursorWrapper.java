package com.google.android.gms.common.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class CursorWrapper extends android.database.CursorWrapper implements CrossProcessCursor {

    /* renamed from: f */
    private AbstractWindowedCursor f17956f;

    @Override // android.database.CrossProcessCursor
    @KeepForSdk
    public void fillWindow(int i2, CursorWindow cursorWindow) {
        this.f17956f.fillWindow(i2, cursorWindow);
    }

    @Override // android.database.CrossProcessCursor
    @KeepForSdk
    public CursorWindow getWindow() {
        return this.f17956f.getWindow();
    }

    @Override // android.database.CursorWrapper
    public final /* synthetic */ Cursor getWrappedCursor() {
        return this.f17956f;
    }

    @Override // android.database.CrossProcessCursor
    public final boolean onMove(int i2, int i3) {
        return this.f17956f.onMove(i2, i3);
    }
}
