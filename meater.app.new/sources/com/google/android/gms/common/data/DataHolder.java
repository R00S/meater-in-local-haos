package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import g7.C3445p;
import h7.AbstractC3492a;
import h7.C3493b;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepName
/* loaded from: classes2.dex */
public final class DataHolder extends AbstractC3492a implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new b();

    /* renamed from: L, reason: collision with root package name */
    private static final a f33504L = new com.google.android.gms.common.data.a(new String[0], null);

    /* renamed from: B, reason: collision with root package name */
    final int f33505B;

    /* renamed from: C, reason: collision with root package name */
    private final String[] f33506C;

    /* renamed from: D, reason: collision with root package name */
    Bundle f33507D;

    /* renamed from: E, reason: collision with root package name */
    private final CursorWindow[] f33508E;

    /* renamed from: F, reason: collision with root package name */
    private final int f33509F;

    /* renamed from: G, reason: collision with root package name */
    private final Bundle f33510G;

    /* renamed from: H, reason: collision with root package name */
    int[] f33511H;

    /* renamed from: I, reason: collision with root package name */
    int f33512I;

    /* renamed from: J, reason: collision with root package name */
    boolean f33513J = false;

    /* renamed from: K, reason: collision with root package name */
    private boolean f33514K = true;

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String[] f33515a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f33516b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final HashMap f33517c = new HashMap();
    }

    DataHolder(int i10, String[] strArr, CursorWindow[] cursorWindowArr, int i11, Bundle bundle) {
        this.f33505B = i10;
        this.f33506C = strArr;
        this.f33508E = cursorWindowArr;
        this.f33509F = i11;
        this.f33510G = bundle;
    }

    private final void B1(String str, int i10) {
        Bundle bundle = this.f33507D;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(String.valueOf(str)));
        }
        if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i10 < 0 || i10 >= this.f33512I) {
            throw new CursorIndexOutOfBoundsException(i10, this.f33512I);
        }
    }

    public String G0(String str, int i10, int i11) {
        B1(str, i10);
        return this.f33508E[i11].getString(i10, this.f33507D.getInt(str));
    }

    public int O0(int i10) {
        int length;
        int i11 = 0;
        C3445p.n(i10 >= 0 && i10 < this.f33512I);
        while (true) {
            int[] iArr = this.f33511H;
            length = iArr.length;
            if (i11 >= length) {
                break;
            }
            if (i10 < iArr[i11]) {
                i11--;
                break;
            }
            i11++;
        }
        return i11 == length ? i11 - 1 : i11;
    }

    public final void U0() {
        this.f33507D = new Bundle();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = this.f33506C;
            if (i11 >= strArr.length) {
                break;
            }
            this.f33507D.putInt(strArr[i11], i11);
            i11++;
        }
        this.f33511H = new int[this.f33508E.length];
        int numRows = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f33508E;
            if (i10 >= cursorWindowArr.length) {
                this.f33512I = numRows;
                return;
            }
            this.f33511H[i10] = numRows;
            numRows += this.f33508E[i10].getNumRows() - (numRows - cursorWindowArr[i10].getStartPosition());
            i10++;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (!this.f33513J) {
                    this.f33513J = true;
                    int i10 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f33508E;
                        if (i10 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i10].close();
                        i10++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public byte[] f0(String str, int i10, int i11) {
        B1(str, i10);
        return this.f33508E[i11].getBlob(i10, this.f33507D.getInt(str));
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.f33514K && this.f33508E.length > 0 && !isClosed()) {
                close();
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
            }
        } finally {
            super.finalize();
        }
    }

    public int getCount() {
        return this.f33512I;
    }

    public int h0(String str, int i10, int i11) {
        B1(str, i10);
        return this.f33508E[i11].getInt(i10, this.f33507D.getInt(str));
    }

    public boolean isClosed() {
        boolean z10;
        synchronized (this) {
            z10 = this.f33513J;
        }
        return z10;
    }

    public Bundle r0() {
        return this.f33510G;
    }

    public int v0() {
        return this.f33509F;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String[] strArr = this.f33506C;
        int iA = C3493b.a(parcel);
        C3493b.r(parcel, 1, strArr, false);
        C3493b.t(parcel, 2, this.f33508E, i10, false);
        C3493b.k(parcel, 3, v0());
        C3493b.e(parcel, 4, r0(), false);
        C3493b.k(parcel, 1000, this.f33505B);
        C3493b.b(parcel, iA);
        if ((i10 & 1) != 0) {
            close();
        }
    }
}
