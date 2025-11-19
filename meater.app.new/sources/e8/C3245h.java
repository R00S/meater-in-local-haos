package e8;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: e8.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3245h {

    /* renamed from: a, reason: collision with root package name */
    private static final ClassLoader f40764a = C3245h.class.getClassLoader();

    private C3245h() {
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + iDataAvail);
    }

    public static void c(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
