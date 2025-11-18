package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@zzard
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzxz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxz> CREATOR = new zzyb();

    /* renamed from: f */
    @SafeParcelable.Field
    public final int f27402f;

    /* renamed from: g */
    @SafeParcelable.Field
    @Deprecated
    public final long f27403g;

    /* renamed from: h */
    @SafeParcelable.Field
    public final Bundle f27404h;

    /* renamed from: i */
    @SafeParcelable.Field
    @Deprecated
    public final int f27405i;

    /* renamed from: j */
    @SafeParcelable.Field
    public final List<String> f27406j;

    /* renamed from: k */
    @SafeParcelable.Field
    public final boolean f27407k;

    /* renamed from: l */
    @SafeParcelable.Field
    public final int f27408l;

    /* renamed from: m */
    @SafeParcelable.Field
    public final boolean f27409m;

    /* renamed from: n */
    @SafeParcelable.Field
    public final String f27410n;

    /* renamed from: o */
    @SafeParcelable.Field
    public final zzaca f27411o;

    /* renamed from: p */
    @SafeParcelable.Field
    public final Location f27412p;

    /* renamed from: q */
    @SafeParcelable.Field
    public final String f27413q;

    /* renamed from: r */
    @SafeParcelable.Field
    public final Bundle f27414r;

    /* renamed from: s */
    @SafeParcelable.Field
    public final Bundle f27415s;

    /* renamed from: t */
    @SafeParcelable.Field
    public final List<String> f27416t;

    /* renamed from: u */
    @SafeParcelable.Field
    public final String f27417u;

    /* renamed from: v */
    @SafeParcelable.Field
    public final String f27418v;

    /* renamed from: w */
    @SafeParcelable.Field
    @Deprecated
    public final boolean f27419w;

    /* renamed from: x */
    @SafeParcelable.Field
    public final zzxt f27420x;

    /* renamed from: y */
    @SafeParcelable.Field
    public final int f27421y;

    /* renamed from: z */
    @SafeParcelable.Field
    public final String f27422z;

    @SafeParcelable.Constructor
    public zzxz(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 3) Bundle bundle, @SafeParcelable.Param(id = 4) int i3, @SafeParcelable.Param(id = 5) List<String> list, @SafeParcelable.Param(id = 6) boolean z, @SafeParcelable.Param(id = 7) int i4, @SafeParcelable.Param(id = 8) boolean z2, @SafeParcelable.Param(id = 9) String str, @SafeParcelable.Param(id = 10) zzaca zzacaVar, @SafeParcelable.Param(id = 11) Location location, @SafeParcelable.Param(id = 12) String str2, @SafeParcelable.Param(id = 13) Bundle bundle2, @SafeParcelable.Param(id = 14) Bundle bundle3, @SafeParcelable.Param(id = 15) List<String> list2, @SafeParcelable.Param(id = 16) String str3, @SafeParcelable.Param(id = 17) String str4, @SafeParcelable.Param(id = 18) boolean z3, @SafeParcelable.Param(id = 19) zzxt zzxtVar, @SafeParcelable.Param(id = 20) int i5, @SafeParcelable.Param(id = 21) String str5) {
        this.f27402f = i2;
        this.f27403g = j2;
        this.f27404h = bundle == null ? new Bundle() : bundle;
        this.f27405i = i3;
        this.f27406j = list;
        this.f27407k = z;
        this.f27408l = i4;
        this.f27409m = z2;
        this.f27410n = str;
        this.f27411o = zzacaVar;
        this.f27412p = location;
        this.f27413q = str2;
        this.f27414r = bundle2 == null ? new Bundle() : bundle2;
        this.f27415s = bundle3;
        this.f27416t = list2;
        this.f27417u = str3;
        this.f27418v = str4;
        this.f27419w = z3;
        this.f27420x = zzxtVar;
        this.f27421y = i5;
        this.f27422z = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzxz)) {
            return false;
        }
        zzxz zzxzVar = (zzxz) obj;
        return this.f27402f == zzxzVar.f27402f && this.f27403g == zzxzVar.f27403g && Objects.m14355a(this.f27404h, zzxzVar.f27404h) && this.f27405i == zzxzVar.f27405i && Objects.m14355a(this.f27406j, zzxzVar.f27406j) && this.f27407k == zzxzVar.f27407k && this.f27408l == zzxzVar.f27408l && this.f27409m == zzxzVar.f27409m && Objects.m14355a(this.f27410n, zzxzVar.f27410n) && Objects.m14355a(this.f27411o, zzxzVar.f27411o) && Objects.m14355a(this.f27412p, zzxzVar.f27412p) && Objects.m14355a(this.f27413q, zzxzVar.f27413q) && Objects.m14355a(this.f27414r, zzxzVar.f27414r) && Objects.m14355a(this.f27415s, zzxzVar.f27415s) && Objects.m14355a(this.f27416t, zzxzVar.f27416t) && Objects.m14355a(this.f27417u, zzxzVar.f27417u) && Objects.m14355a(this.f27418v, zzxzVar.f27418v) && this.f27419w == zzxzVar.f27419w && this.f27421y == zzxzVar.f27421y && Objects.m14355a(this.f27422z, zzxzVar.f27422z);
    }

    public final int hashCode() {
        return Objects.m14356b(Integer.valueOf(this.f27402f), Long.valueOf(this.f27403g), this.f27404h, Integer.valueOf(this.f27405i), this.f27406j, Boolean.valueOf(this.f27407k), Integer.valueOf(this.f27408l), Boolean.valueOf(this.f27409m), this.f27410n, this.f27411o, this.f27412p, this.f27413q, this.f27414r, this.f27415s, this.f27416t, this.f27417u, this.f27418v, Boolean.valueOf(this.f27419w), Integer.valueOf(this.f27421y), this.f27422z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f27402f);
        SafeParcelWriter.m14481p(parcel, 2, this.f27403g);
        SafeParcelWriter.m14470e(parcel, 3, this.f27404h, false);
        SafeParcelWriter.m14477l(parcel, 4, this.f27405i);
        SafeParcelWriter.m14488w(parcel, 5, this.f27406j, false);
        SafeParcelWriter.m14468c(parcel, 6, this.f27407k);
        SafeParcelWriter.m14477l(parcel, 7, this.f27408l);
        SafeParcelWriter.m14468c(parcel, 8, this.f27409m);
        SafeParcelWriter.m14486u(parcel, 9, this.f27410n, false);
        SafeParcelWriter.m14484s(parcel, 10, this.f27411o, i2, false);
        SafeParcelWriter.m14484s(parcel, 11, this.f27412p, i2, false);
        SafeParcelWriter.m14486u(parcel, 12, this.f27413q, false);
        SafeParcelWriter.m14470e(parcel, 13, this.f27414r, false);
        SafeParcelWriter.m14470e(parcel, 14, this.f27415s, false);
        SafeParcelWriter.m14488w(parcel, 15, this.f27416t, false);
        SafeParcelWriter.m14486u(parcel, 16, this.f27417u, false);
        SafeParcelWriter.m14486u(parcel, 17, this.f27418v, false);
        SafeParcelWriter.m14468c(parcel, 18, this.f27419w);
        SafeParcelWriter.m14484s(parcel, 19, this.f27420x, i2, false);
        SafeParcelWriter.m14477l(parcel, 20, this.f27421y);
        SafeParcelWriter.m14486u(parcel, 21, this.f27422z, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
