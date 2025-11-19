package com.google.android.gms.wearable;

import A7.G;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public class AppTheme extends AbstractC3492a implements ReflectedParcelable {
    public static final Parcelable.Creator<AppTheme> CREATOR = new G();

    /* renamed from: B, reason: collision with root package name */
    private final int f35789B;

    /* renamed from: C, reason: collision with root package name */
    private final int f35790C;

    /* renamed from: D, reason: collision with root package name */
    private final int f35791D;

    /* renamed from: E, reason: collision with root package name */
    private final int f35792E;

    public AppTheme() {
        this.f35789B = 0;
        this.f35790C = 0;
        this.f35791D = 0;
        this.f35792E = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppTheme)) {
            return false;
        }
        AppTheme appTheme = (AppTheme) obj;
        return this.f35790C == appTheme.f35790C && this.f35789B == appTheme.f35789B && this.f35791D == appTheme.f35791D && this.f35792E == appTheme.f35792E;
    }

    public final int hashCode() {
        return (((((this.f35790C * 31) + this.f35789B) * 31) + this.f35791D) * 31) + this.f35792E;
    }

    public final String toString() {
        return "AppTheme {dynamicColor =" + this.f35790C + ", colorTheme =" + this.f35789B + ", screenAlignment =" + this.f35791D + ", screenItemsSize =" + this.f35792E + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f35789B;
        if (i11 == 0) {
            i11 = 1;
        }
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 1, i11);
        int i12 = this.f35790C;
        if (i12 == 0) {
            i12 = 1;
        }
        C3493b.k(parcel, 2, i12);
        int i13 = this.f35791D;
        C3493b.k(parcel, 3, i13 != 0 ? i13 : 1);
        int i14 = this.f35792E;
        C3493b.k(parcel, 4, i14 != 0 ? i14 : 3);
        C3493b.b(parcel, iA);
    }

    public AppTheme(int i10, int i11, int i12, int i13) {
        this.f35789B = i10;
        this.f35790C = i11;
        this.f35791D = i12;
        this.f35792E = i13;
    }
}
