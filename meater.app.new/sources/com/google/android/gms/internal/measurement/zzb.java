package com.google.android.gms.internal.measurement;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* loaded from: classes2.dex */
public class zzb {

    /* renamed from: a */
    private static final ClassLoader f27957a = zzb.class.getClassLoader();

    private zzb() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m21491a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m21492b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: c */
    public static void m21493c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* renamed from: d */
    public static void m21494d(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: e */
    public static boolean m21495e(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: f */
    public static HashMap m21496f(Parcel parcel) {
        return parcel.readHashMap(f27957a);
    }
}
