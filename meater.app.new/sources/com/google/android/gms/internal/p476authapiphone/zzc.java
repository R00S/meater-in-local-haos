package com.google.android.gms.internal.p476authapiphone;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class zzc {

    /* renamed from: a */
    private static final ClassLoader f27488a = zzc.class.getClassLoader();

    private zzc() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m20867a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }
}
