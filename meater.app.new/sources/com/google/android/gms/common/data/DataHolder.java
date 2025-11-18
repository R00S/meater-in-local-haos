package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

@KeepForSdk
@KeepName
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {

    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new zac();

    /* renamed from: f */
    private static final Builder f17655f = new C6411a(new String[0], null);

    /* renamed from: g */
    @SafeParcelable.VersionField
    private final int f17656g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final String[] f17657h;

    /* renamed from: i */
    private Bundle f17658i;

    /* renamed from: j */
    @SafeParcelable.Field
    private final CursorWindow[] f17659j;

    /* renamed from: k */
    @SafeParcelable.Field
    private final int f17660k;

    /* renamed from: l */
    @SafeParcelable.Field
    private final Bundle f17661l;

    /* renamed from: m */
    private int[] f17662m;

    /* renamed from: n */
    private int f17663n;

    /* renamed from: o */
    private boolean f17664o = false;

    /* renamed from: p */
    private boolean f17665p = true;

    public static class zaa extends RuntimeException {
    }

    @SafeParcelable.Constructor
    DataHolder(@SafeParcelable.Param(id = 1000) int i2, @SafeParcelable.Param(id = 1) String[] strArr, @SafeParcelable.Param(id = 2) CursorWindow[] cursorWindowArr, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) Bundle bundle) {
        this.f17656g = i2;
        this.f17657h = strArr;
        this.f17659j = cursorWindowArr;
        this.f17660k = i3;
        this.f17661l = bundle;
    }

    /* renamed from: i0 */
    private final void m14262i0(String str, int i2) {
        Bundle bundle = this.f17658i;
        if (bundle == null || !bundle.containsKey(str)) {
            String strValueOf = String.valueOf(str);
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "No such column: ".concat(strValueOf) : new String("No such column: "));
        }
        if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i2 < 0 || i2 >= this.f17663n) {
            throw new CursorIndexOutOfBoundsException(i2, this.f17663n);
        }
    }

    @KeepForSdk
    /* renamed from: W */
    public final int m14263W() {
        return this.f17660k;
    }

    @KeepForSdk
    /* renamed from: Y */
    public final String m14264Y(String str, int i2, int i3) {
        m14262i0(str, i2);
        return this.f17659j[i3].getString(i2, this.f17658i.getInt(str));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @KeepForSdk
    public final void close() {
        synchronized (this) {
            if (!this.f17664o) {
                this.f17664o = true;
                int i2 = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f17659j;
                    if (i2 >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i2].close();
                    i2++;
                }
            }
        }
    }

    @KeepForSdk
    /* renamed from: e0 */
    public final int m14265e0(int i2) {
        int[] iArr;
        int i3 = 0;
        Preconditions.m14375n(i2 >= 0 && i2 < this.f17663n);
        while (true) {
            iArr = this.f17662m;
            if (i3 >= iArr.length) {
                break;
            }
            if (i2 < iArr[i3]) {
                i3--;
                break;
            }
            i3++;
        }
        return i3 == iArr.length ? i3 - 1 : i3;
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.f17665p && this.f17659j.length > 0 && !isClosed()) {
                close();
                String string = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(string);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    @KeepForSdk
    public final int getCount() {
        return this.f17663n;
    }

    @KeepForSdk
    public final boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.f17664o;
        }
        return z;
    }

    /* renamed from: p0 */
    public final void m14266p0() {
        this.f17658i = new Bundle();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr = this.f17657h;
            if (i3 >= strArr.length) {
                break;
            }
            this.f17658i.putInt(strArr[i3], i3);
            i3++;
        }
        this.f17662m = new int[this.f17659j.length];
        int numRows = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f17659j;
            if (i2 >= cursorWindowArr.length) {
                this.f17663n = numRows;
                return;
            }
            this.f17662m[i2] = numRows;
            numRows += this.f17659j[i2].getNumRows() - (numRows - cursorWindowArr[i2].getStartPosition());
            i2++;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14487v(parcel, 1, this.f17657h, false);
        SafeParcelWriter.m14489x(parcel, 2, this.f17659j, i2, false);
        SafeParcelWriter.m14477l(parcel, 3, m14263W());
        SafeParcelWriter.m14470e(parcel, 4, m14268z(), false);
        SafeParcelWriter.m14477l(parcel, 1000, this.f17656g);
        SafeParcelWriter.m14467b(parcel, iM14466a);
        if ((i2 & 1) != 0) {
            close();
        }
    }

    @KeepForSdk
    /* renamed from: y */
    public final byte[] m14267y(String str, int i2, int i3) {
        m14262i0(str, i2);
        return this.f17659j[i3].getBlob(i2, this.f17658i.getInt(str));
    }

    @KeepForSdk
    /* renamed from: z */
    public final Bundle m14268z() {
        return this.f17661l;
    }

    @KeepForSdk
    public static class Builder {

        /* renamed from: a */
        private final String[] f17666a;

        /* renamed from: b */
        private final ArrayList<HashMap<String, Object>> f17667b;

        /* renamed from: c */
        private final String f17668c;

        /* renamed from: d */
        private final HashMap<Object, Integer> f17669d;

        /* renamed from: e */
        private boolean f17670e;

        /* renamed from: f */
        private String f17671f;

        private Builder(String[] strArr, String str) {
            this.f17666a = (String[]) Preconditions.m14372k(strArr);
            this.f17667b = new ArrayList<>();
            this.f17668c = str;
            this.f17669d = new HashMap<>();
            this.f17670e = false;
            this.f17671f = null;
        }

        /* synthetic */ Builder(String[] strArr, String str, C6411a c6411a) {
            this(strArr, null);
        }
    }
}
