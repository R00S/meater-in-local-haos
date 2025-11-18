package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new zzo();

    /* renamed from: A */
    @SafeParcelable.Field
    public final String f29400A;

    /* renamed from: f */
    @SafeParcelable.Field
    public final String f29401f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final String f29402g;

    /* renamed from: h */
    @SafeParcelable.Field
    public final String f29403h;

    /* renamed from: i */
    @SafeParcelable.Field
    public final String f29404i;

    /* renamed from: j */
    @SafeParcelable.Field
    public final long f29405j;

    /* renamed from: k */
    @SafeParcelable.Field
    public final long f29406k;

    /* renamed from: l */
    @SafeParcelable.Field
    public final String f29407l;

    /* renamed from: m */
    @SafeParcelable.Field
    public final boolean f29408m;

    /* renamed from: n */
    @SafeParcelable.Field
    public final boolean f29409n;

    /* renamed from: o */
    @SafeParcelable.Field
    public final long f29410o;

    /* renamed from: p */
    @SafeParcelable.Field
    public final String f29411p;

    /* renamed from: q */
    @SafeParcelable.Field
    public final long f29412q;

    /* renamed from: r */
    @SafeParcelable.Field
    public final long f29413r;

    /* renamed from: s */
    @SafeParcelable.Field
    public final int f29414s;

    /* renamed from: t */
    @SafeParcelable.Field
    public final boolean f29415t;

    /* renamed from: u */
    @SafeParcelable.Field
    public final boolean f29416u;

    /* renamed from: v */
    @SafeParcelable.Field
    public final boolean f29417v;

    /* renamed from: w */
    @SafeParcelable.Field
    public final String f29418w;

    /* renamed from: x */
    @SafeParcelable.Field
    public final Boolean f29419x;

    /* renamed from: y */
    @SafeParcelable.Field
    public final long f29420y;

    /* renamed from: z */
    @SafeParcelable.Field
    public final List<String> f29421z;

    zzm(String str, String str2, String str3, long j2, String str4, long j3, long j4, String str5, boolean z, boolean z2, String str6, long j5, long j6, int i2, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j7, List<String> list, String str8) {
        Preconditions.m14368g(str);
        this.f29401f = str;
        this.f29402g = TextUtils.isEmpty(str2) ? null : str2;
        this.f29403h = str3;
        this.f29410o = j2;
        this.f29404i = str4;
        this.f29405j = j3;
        this.f29406k = j4;
        this.f29407l = str5;
        this.f29408m = z;
        this.f29409n = z2;
        this.f29411p = str6;
        this.f29412q = j5;
        this.f29413r = j6;
        this.f29414s = i2;
        this.f29415t = z3;
        this.f29416u = z4;
        this.f29417v = z5;
        this.f29418w = str7;
        this.f29419x = bool;
        this.f29420y = j7;
        this.f29421z = list;
        this.f29400A = str8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 2, this.f29401f, false);
        SafeParcelWriter.m14486u(parcel, 3, this.f29402g, false);
        SafeParcelWriter.m14486u(parcel, 4, this.f29403h, false);
        SafeParcelWriter.m14486u(parcel, 5, this.f29404i, false);
        SafeParcelWriter.m14481p(parcel, 6, this.f29405j);
        SafeParcelWriter.m14481p(parcel, 7, this.f29406k);
        SafeParcelWriter.m14486u(parcel, 8, this.f29407l, false);
        SafeParcelWriter.m14468c(parcel, 9, this.f29408m);
        SafeParcelWriter.m14468c(parcel, 10, this.f29409n);
        SafeParcelWriter.m14481p(parcel, 11, this.f29410o);
        SafeParcelWriter.m14486u(parcel, 12, this.f29411p, false);
        SafeParcelWriter.m14481p(parcel, 13, this.f29412q);
        SafeParcelWriter.m14481p(parcel, 14, this.f29413r);
        SafeParcelWriter.m14477l(parcel, 15, this.f29414s);
        SafeParcelWriter.m14468c(parcel, 16, this.f29415t);
        SafeParcelWriter.m14468c(parcel, 17, this.f29416u);
        SafeParcelWriter.m14468c(parcel, 18, this.f29417v);
        SafeParcelWriter.m14486u(parcel, 19, this.f29418w, false);
        SafeParcelWriter.m14469d(parcel, 21, this.f29419x, false);
        SafeParcelWriter.m14481p(parcel, 22, this.f29420y);
        SafeParcelWriter.m14488w(parcel, 23, this.f29421z, false);
        SafeParcelWriter.m14486u(parcel, 24, this.f29400A, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    @SafeParcelable.Constructor
    zzm(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) long j2, @SafeParcelable.Param(id = 7) long j3, @SafeParcelable.Param(id = 8) String str5, @SafeParcelable.Param(id = 9) boolean z, @SafeParcelable.Param(id = 10) boolean z2, @SafeParcelable.Param(id = 11) long j4, @SafeParcelable.Param(id = 12) String str6, @SafeParcelable.Param(id = 13) long j5, @SafeParcelable.Param(id = 14) long j6, @SafeParcelable.Param(id = 15) int i2, @SafeParcelable.Param(id = 16) boolean z3, @SafeParcelable.Param(id = 17) boolean z4, @SafeParcelable.Param(id = 18) boolean z5, @SafeParcelable.Param(id = 19) String str7, @SafeParcelable.Param(id = 21) Boolean bool, @SafeParcelable.Param(id = 22) long j7, @SafeParcelable.Param(id = 23) List<String> list, @SafeParcelable.Param(id = 24) String str8) {
        this.f29401f = str;
        this.f29402g = str2;
        this.f29403h = str3;
        this.f29410o = j4;
        this.f29404i = str4;
        this.f29405j = j2;
        this.f29406k = j3;
        this.f29407l = str5;
        this.f29408m = z;
        this.f29409n = z2;
        this.f29411p = str6;
        this.f29412q = j5;
        this.f29413r = j6;
        this.f29414s = i2;
        this.f29415t = z3;
        this.f29416u = z4;
        this.f29417v = z5;
        this.f29418w = str7;
        this.f29419x = bool;
        this.f29420y = j7;
        this.f29421z = list;
        this.f29400A = str8;
    }
}
