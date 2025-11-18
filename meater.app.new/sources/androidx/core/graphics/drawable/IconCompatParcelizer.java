package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2225b = versionedParcel.m4734p(iconCompat.f2225b, 1);
        iconCompat.f2227d = versionedParcel.m4728j(iconCompat.f2227d, 2);
        iconCompat.f2228e = versionedParcel.m4736r(iconCompat.f2228e, 3);
        iconCompat.f2229f = versionedParcel.m4734p(iconCompat.f2229f, 4);
        iconCompat.f2230g = versionedParcel.m4734p(iconCompat.f2230g, 5);
        iconCompat.f2231h = (ColorStateList) versionedParcel.m4736r(iconCompat.f2231h, 6);
        iconCompat.f2233j = versionedParcel.m4738t(iconCompat.f2233j, 7);
        iconCompat.f2234k = versionedParcel.m4738t(iconCompat.f2234k, 8);
        iconCompat.m1800n();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.m4742x(true, true);
        iconCompat.m1801o(versionedParcel.m4724f());
        int i2 = iconCompat.f2225b;
        if (-1 != i2) {
            versionedParcel.m4714F(i2, 1);
        }
        byte[] bArr = iconCompat.f2227d;
        if (bArr != null) {
            versionedParcel.m4710B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f2228e;
        if (parcelable != null) {
            versionedParcel.m4716H(parcelable, 3);
        }
        int i3 = iconCompat.f2229f;
        if (i3 != 0) {
            versionedParcel.m4714F(i3, 4);
        }
        int i4 = iconCompat.f2230g;
        if (i4 != 0) {
            versionedParcel.m4714F(i4, 5);
        }
        ColorStateList colorStateList = iconCompat.f2231h;
        if (colorStateList != null) {
            versionedParcel.m4716H(colorStateList, 6);
        }
        String str = iconCompat.f2233j;
        if (str != null) {
            versionedParcel.m4718J(str, 7);
        }
        String str2 = iconCompat.f2234k;
        if (str2 != null) {
            versionedParcel.m4718J(str2, 8);
        }
    }
}
