package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzard
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzbai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbai> CREATOR = new zzbaj();

    /* renamed from: f */
    @SafeParcelable.Field
    public String f22750f;

    /* renamed from: g */
    @SafeParcelable.Field
    public int f22751g;

    /* renamed from: h */
    @SafeParcelable.Field
    public int f22752h;

    /* renamed from: i */
    @SafeParcelable.Field
    public boolean f22753i;

    /* renamed from: j */
    @SafeParcelable.Field
    private boolean f22754j;

    public zzbai(int i2, int i3, boolean z) {
        this(i2, i3, z, false, false);
    }

    /* renamed from: y */
    public static zzbai m17359y() {
        return new zzbai(12451009, 12451009, true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 2, this.f22750f, false);
        SafeParcelWriter.m14477l(parcel, 3, this.f22751g);
        SafeParcelWriter.m14477l(parcel, 4, this.f22752h);
        SafeParcelWriter.m14468c(parcel, 5, this.f22753i);
        SafeParcelWriter.m14468c(parcel, 6, this.f22754j);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    public zzbai(int i2, int i3, boolean z, boolean z2) {
        this(i2, i3, true, false, false);
    }

    private zzbai(int i2, int i3, boolean z, boolean z2, boolean z3) {
        String str = z ? "0" : "1";
        StringBuilder sb = new StringBuilder(str.length() + 36);
        sb.append("afma-sdk-a-v");
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        sb.append(".");
        sb.append(str);
        this(sb.toString(), i2, i3, z, false);
    }

    @SafeParcelable.Constructor
    zzbai(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) int i3, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) boolean z2) {
        this.f22750f = str;
        this.f22751g = i2;
        this.f22752h = i3;
        this.f22753i = z;
        this.f22754j = z2;
    }
}
