package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class SignInButtonConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInButtonConfig> CREATOR = new zao();

    /* renamed from: f */
    @SafeParcelable.VersionField
    private final int f17793f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final int f17794g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final int f17795h;

    /* renamed from: i */
    @SafeParcelable.Field
    @Deprecated
    private final Scope[] f17796i;

    @SafeParcelable.Constructor
    SignInButtonConfig(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) int i4, @SafeParcelable.Param(id = 4) Scope[] scopeArr) {
        this.f17793f = i2;
        this.f17794g = i3;
        this.f17795h = i4;
        this.f17796i = scopeArr;
    }

    @Deprecated
    /* renamed from: W */
    public Scope[] m14391W() {
        return this.f17796i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f17793f);
        SafeParcelWriter.m14477l(parcel, 2, m14392y());
        SafeParcelWriter.m14477l(parcel, 3, m14393z());
        SafeParcelWriter.m14489x(parcel, 4, m14391W(), i2, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public int m14392y() {
        return this.f17794g;
    }

    /* renamed from: z */
    public int m14393z() {
        return this.f17795h;
    }

    public SignInButtonConfig(int i2, int i3, Scope[] scopeArr) {
        this(1, i2, i3, null);
    }
}
