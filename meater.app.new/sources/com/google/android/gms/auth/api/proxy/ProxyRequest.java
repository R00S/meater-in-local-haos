package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdkWithMembers
@SafeParcelable.Class
/* loaded from: classes2.dex */
public class ProxyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new zza();

    /* renamed from: f */
    public static final int f17001f = 0;

    /* renamed from: g */
    public static final int f17002g = 1;

    /* renamed from: h */
    public static final int f17003h = 2;

    /* renamed from: i */
    public static final int f17004i = 3;

    /* renamed from: j */
    public static final int f17005j = 4;

    /* renamed from: k */
    public static final int f17006k = 5;

    /* renamed from: l */
    public static final int f17007l = 6;

    /* renamed from: m */
    public static final int f17008m = 7;

    /* renamed from: n */
    public static final int f17009n = 7;

    /* renamed from: o */
    @SafeParcelable.VersionField
    private final int f17010o;

    /* renamed from: p */
    @SafeParcelable.Field
    public final String f17011p;

    /* renamed from: q */
    @SafeParcelable.Field
    public final int f17012q;

    /* renamed from: r */
    @SafeParcelable.Field
    public final long f17013r;

    /* renamed from: s */
    @SafeParcelable.Field
    public final byte[] f17014s;

    /* renamed from: t */
    @SafeParcelable.Field
    private Bundle f17015t;

    @KeepForSdkWithMembers
    public static class Builder {
    }

    @SafeParcelable.Constructor
    ProxyRequest(@SafeParcelable.Param(id = 1000) int i2, @SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) long j2, @SafeParcelable.Param(id = 4) byte[] bArr, @SafeParcelable.Param(id = 5) Bundle bundle) {
        this.f17010o = i2;
        this.f17011p = str;
        this.f17012q = i3;
        this.f17013r = j2;
        this.f17014s = bArr;
        this.f17015t = bundle;
    }

    public String toString() {
        String str = this.f17011p;
        int i2 = this.f17012q;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
        sb.append("ProxyRequest[ url: ");
        sb.append(str);
        sb.append(", method: ");
        sb.append(i2);
        sb.append(" ]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 1, this.f17011p, false);
        SafeParcelWriter.m14477l(parcel, 2, this.f17012q);
        SafeParcelWriter.m14481p(parcel, 3, this.f17013r);
        SafeParcelWriter.m14471f(parcel, 4, this.f17014s, false);
        SafeParcelWriter.m14470e(parcel, 5, this.f17015t, false);
        SafeParcelWriter.m14477l(parcel, 1000, this.f17010o);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
