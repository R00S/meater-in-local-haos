package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();

    /* renamed from: f */
    @SafeParcelable.Field
    private final boolean f18023f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final String f18024g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final int f18025h;

    /* renamed from: i */
    @SafeParcelable.Field
    private final int f18026i;

    @SafeParcelable.Constructor
    zzq(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) int i3) {
        this.f18023f = z;
        this.f18024g = str;
        this.f18025h = C6442n.m14538a(i2) - 1;
        this.f18026i = C6408b.m14256a(i3) - 1;
    }

    /* renamed from: W */
    public final int m14676W() {
        return C6408b.m14256a(this.f18026i);
    }

    /* renamed from: Y */
    public final int m14677Y() {
        return C6442n.m14538a(this.f18025h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14468c(parcel, 1, this.f18023f);
        SafeParcelWriter.m14486u(parcel, 2, this.f18024g, false);
        SafeParcelWriter.m14477l(parcel, 3, this.f18025h);
        SafeParcelWriter.m14477l(parcel, 4, this.f18026i);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public final String m14678y() {
        return this.f18024g;
    }

    /* renamed from: z */
    public final boolean m14679z() {
        return this.f18023f;
    }
}
