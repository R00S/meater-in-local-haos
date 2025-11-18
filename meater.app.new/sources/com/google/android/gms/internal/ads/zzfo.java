package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class zzfo {

    /* renamed from: a */
    private static final ClassLoader f26099a = zzfo.class.getClassLoader();

    private zzfo() {
    }

    /* renamed from: a */
    public static void m19947a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: b */
    public static <T extends Parcelable> T m19948b(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: c */
    public static void m19949c(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: d */
    public static void m19950d(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* renamed from: e */
    public static boolean m19951e(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: f */
    public static ArrayList m19952f(Parcel parcel) {
        return parcel.readArrayList(f26099a);
    }

    /* renamed from: g */
    public static void m19953g(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
        }
    }
}
