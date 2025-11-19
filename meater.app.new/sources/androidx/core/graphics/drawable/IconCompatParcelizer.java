package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f24729a = versionedParcel.p(iconCompat.f24729a, 1);
        iconCompat.f24731c = versionedParcel.j(iconCompat.f24731c, 2);
        iconCompat.f24732d = versionedParcel.r(iconCompat.f24732d, 3);
        iconCompat.f24733e = versionedParcel.p(iconCompat.f24733e, 4);
        iconCompat.f24734f = versionedParcel.p(iconCompat.f24734f, 5);
        iconCompat.f24735g = (ColorStateList) versionedParcel.r(iconCompat.f24735g, 6);
        iconCompat.f24737i = versionedParcel.t(iconCompat.f24737i, 7);
        iconCompat.f24738j = versionedParcel.t(iconCompat.f24738j, 8);
        iconCompat.k();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(true, true);
        iconCompat.l(versionedParcel.f());
        int i10 = iconCompat.f24729a;
        if (-1 != i10) {
            versionedParcel.F(i10, 1);
        }
        byte[] bArr = iconCompat.f24731c;
        if (bArr != null) {
            versionedParcel.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f24732d;
        if (parcelable != null) {
            versionedParcel.H(parcelable, 3);
        }
        int i11 = iconCompat.f24733e;
        if (i11 != 0) {
            versionedParcel.F(i11, 4);
        }
        int i12 = iconCompat.f24734f;
        if (i12 != 0) {
            versionedParcel.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f24735g;
        if (colorStateList != null) {
            versionedParcel.H(colorStateList, 6);
        }
        String str = iconCompat.f24737i;
        if (str != null) {
            versionedParcel.J(str, 7);
        }
        String str2 = iconCompat.f24738j;
        if (str2 != null) {
            versionedParcel.J(str2, 8);
        }
    }
}
