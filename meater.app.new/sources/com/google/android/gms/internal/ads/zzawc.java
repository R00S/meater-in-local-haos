package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzard
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzawc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzawc> CREATOR = new zzawd();

    /* renamed from: f */
    @SafeParcelable.Field
    public final String f22569f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final String f22570g;

    /* renamed from: h */
    @SafeParcelable.Field
    public final zzyd f22571h;

    @SafeParcelable.Constructor
    public zzawc(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) zzyd zzydVar) {
        this.f22569f = str;
        this.f22570g = str2;
        this.f22571h = zzydVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 1, this.f22569f, false);
        SafeParcelWriter.m14486u(parcel, 2, this.f22570g, false);
        SafeParcelWriter.m14484s(parcel, 3, this.f22571h, i2, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
