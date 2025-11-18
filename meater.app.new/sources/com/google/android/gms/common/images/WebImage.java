package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = new zae();

    /* renamed from: f */
    @SafeParcelable.VersionField
    private final int f17683f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final Uri f17684g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final int f17685h;

    /* renamed from: i */
    @SafeParcelable.Field
    private final int f17686i;

    @SafeParcelable.Constructor
    WebImage(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) Uri uri, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) int i4) {
        this.f17683f = i2;
        this.f17684g = uri;
        this.f17685h = i3;
        this.f17686i = i4;
    }

    /* renamed from: W */
    public final int m14278W() {
        return this.f17685h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (Objects.m14355a(this.f17684g, webImage.f17684g) && this.f17685h == webImage.f17685h && this.f17686i == webImage.f17686i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.m14356b(this.f17684g, Integer.valueOf(this.f17685h), Integer.valueOf(this.f17686i));
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.f17685h), Integer.valueOf(this.f17686i), this.f17684g.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f17683f);
        SafeParcelWriter.m14484s(parcel, 2, m14280z(), i2, false);
        SafeParcelWriter.m14477l(parcel, 3, m14278W());
        SafeParcelWriter.m14477l(parcel, 4, m14279y());
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public final int m14279y() {
        return this.f17686i;
    }

    /* renamed from: z */
    public final Uri m14280z() {
        return this.f17684g;
    }
}
