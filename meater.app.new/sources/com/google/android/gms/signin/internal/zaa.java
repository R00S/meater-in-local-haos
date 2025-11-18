package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zaa extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zaa> CREATOR = new zab();

    /* renamed from: f */
    @SafeParcelable.VersionField
    private final int f29480f;

    /* renamed from: g */
    @SafeParcelable.Field
    private int f29481g;

    /* renamed from: h */
    @SafeParcelable.Field
    private Intent f29482h;

    @SafeParcelable.Constructor
    zaa(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) Intent intent) {
        this.f29480f = i2;
        this.f29481g = i3;
        this.f29482h = intent;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f29481g == 0 ? Status.f17291g : Status.f17295k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f29480f);
        SafeParcelWriter.m14477l(parcel, 2, this.f29481g);
        SafeParcelWriter.m14484s(parcel, 3, this.f29482h, i2, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    public zaa() {
        this(0, null);
    }

    private zaa(int i2, Intent intent) {
        this(2, 0, null);
    }
}
