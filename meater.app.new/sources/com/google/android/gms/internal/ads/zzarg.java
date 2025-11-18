package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@zzard
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzarg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzarg> CREATOR = new zzarh();

    /* renamed from: A */
    @SafeParcelable.Field
    private final String f22295A;

    /* renamed from: B */
    @SafeParcelable.Field
    private final List<String> f22296B;

    /* renamed from: C */
    @SafeParcelable.Field
    private final String f22297C;

    /* renamed from: D */
    @SafeParcelable.Field
    private final zzady f22298D;

    /* renamed from: E */
    @SafeParcelable.Field
    private final List<String> f22299E;

    /* renamed from: F */
    @SafeParcelable.Field
    private final long f22300F;

    /* renamed from: G */
    @SafeParcelable.Field
    private final String f22301G;

    /* renamed from: H */
    @SafeParcelable.Field
    private final float f22302H;

    /* renamed from: I */
    @SafeParcelable.Field
    private final int f22303I;

    /* renamed from: J */
    @SafeParcelable.Field
    private final int f22304J;

    /* renamed from: K */
    @SafeParcelable.Field
    private final boolean f22305K;

    /* renamed from: L */
    @SafeParcelable.Field
    private final boolean f22306L;

    /* renamed from: M */
    @SafeParcelable.Field
    private final String f22307M;

    /* renamed from: N */
    @SafeParcelable.Field
    private final boolean f22308N;

    /* renamed from: O */
    @SafeParcelable.Field
    private final String f22309O;

    /* renamed from: P */
    @SafeParcelable.Field
    private final boolean f22310P;

    /* renamed from: Q */
    @SafeParcelable.Field
    private final int f22311Q;

    /* renamed from: R */
    @SafeParcelable.Field
    private final Bundle f22312R;

    /* renamed from: S */
    @SafeParcelable.Field
    private final String f22313S;

    /* renamed from: T */
    @SafeParcelable.Field
    private final zzaax f22314T;

    /* renamed from: U */
    @SafeParcelable.Field
    private final boolean f22315U;

    /* renamed from: V */
    @SafeParcelable.Field
    private final Bundle f22316V;

    /* renamed from: W */
    @SafeParcelable.Field
    private final String f22317W;

    /* renamed from: X */
    @SafeParcelable.Field
    private final String f22318X;

    /* renamed from: Y */
    @SafeParcelable.Field
    private final String f22319Y;

    /* renamed from: Z */
    @SafeParcelable.Field
    private final boolean f22320Z;

    /* renamed from: a0 */
    @SafeParcelable.Field
    private final List<Integer> f22321a0;

    /* renamed from: b0 */
    @SafeParcelable.Field
    private final String f22322b0;

    /* renamed from: c0 */
    @SafeParcelable.Field
    private final List<String> f22323c0;

    /* renamed from: d0 */
    @SafeParcelable.Field
    private final int f22324d0;

    /* renamed from: e0 */
    @SafeParcelable.Field
    private final boolean f22325e0;

    /* renamed from: f */
    @SafeParcelable.Field
    private final int f22326f;

    /* renamed from: f0 */
    @SafeParcelable.Field
    private final boolean f22327f0;

    /* renamed from: g */
    @SafeParcelable.Field
    private final Bundle f22328g;

    /* renamed from: g0 */
    @SafeParcelable.Field
    private final boolean f22329g0;

    /* renamed from: h */
    @SafeParcelable.Field
    private final zzxz f22330h;

    /* renamed from: h0 */
    @SafeParcelable.Field
    private final ArrayList<String> f22331h0;

    /* renamed from: i */
    @SafeParcelable.Field
    private final zzyd f22332i;

    /* renamed from: i0 */
    @SafeParcelable.Field
    private final String f22333i0;

    /* renamed from: j */
    @SafeParcelable.Field
    private final String f22334j;

    /* renamed from: j0 */
    @SafeParcelable.Field
    private final zzaiy f22335j0;

    /* renamed from: k */
    @SafeParcelable.Field
    private final ApplicationInfo f22336k;

    /* renamed from: k0 */
    @SafeParcelable.Field
    private final String f22337k0;

    /* renamed from: l */
    @SafeParcelable.Field
    private final PackageInfo f22338l;

    /* renamed from: l0 */
    @SafeParcelable.Field
    private final Bundle f22339l0;

    /* renamed from: m */
    @SafeParcelable.Field
    private final String f22340m;

    /* renamed from: n */
    @SafeParcelable.Field
    private final String f22341n;

    /* renamed from: o */
    @SafeParcelable.Field
    private final String f22342o;

    /* renamed from: p */
    @SafeParcelable.Field
    private final zzbai f22343p;

    /* renamed from: q */
    @SafeParcelable.Field
    private final Bundle f22344q;

    /* renamed from: r */
    @SafeParcelable.Field
    private final int f22345r;

    /* renamed from: s */
    @SafeParcelable.Field
    private final List<String> f22346s;

    /* renamed from: t */
    @SafeParcelable.Field
    private final Bundle f22347t;

    /* renamed from: u */
    @SafeParcelable.Field
    private final boolean f22348u;

    /* renamed from: v */
    @SafeParcelable.Field
    private final int f22349v;

    /* renamed from: w */
    @SafeParcelable.Field
    private final int f22350w;

    /* renamed from: x */
    @SafeParcelable.Field
    private final float f22351x;

    /* renamed from: y */
    @SafeParcelable.Field
    private final String f22352y;

    /* renamed from: z */
    @SafeParcelable.Field
    private final long f22353z;

    @SafeParcelable.Constructor
    zzarg(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) Bundle bundle, @SafeParcelable.Param(id = 3) zzxz zzxzVar, @SafeParcelable.Param(id = 4) zzyd zzydVar, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) ApplicationInfo applicationInfo, @SafeParcelable.Param(id = 7) PackageInfo packageInfo, @SafeParcelable.Param(id = 8) String str2, @SafeParcelable.Param(id = 9) String str3, @SafeParcelable.Param(id = 10) String str4, @SafeParcelable.Param(id = 11) zzbai zzbaiVar, @SafeParcelable.Param(id = 12) Bundle bundle2, @SafeParcelable.Param(id = 13) int i3, @SafeParcelable.Param(id = 14) List<String> list, @SafeParcelable.Param(id = 15) Bundle bundle3, @SafeParcelable.Param(id = 16) boolean z, @SafeParcelable.Param(id = 18) int i4, @SafeParcelable.Param(id = 19) int i5, @SafeParcelable.Param(id = 20) float f2, @SafeParcelable.Param(id = 21) String str5, @SafeParcelable.Param(id = 25) long j2, @SafeParcelable.Param(id = 26) String str6, @SafeParcelable.Param(id = 27) List<String> list2, @SafeParcelable.Param(id = 28) String str7, @SafeParcelable.Param(id = 29) zzady zzadyVar, @SafeParcelable.Param(id = 30) List<String> list3, @SafeParcelable.Param(id = 31) long j3, @SafeParcelable.Param(id = 33) String str8, @SafeParcelable.Param(id = 34) float f3, @SafeParcelable.Param(id = 40) boolean z2, @SafeParcelable.Param(id = 35) int i6, @SafeParcelable.Param(id = 36) int i7, @SafeParcelable.Param(id = 37) boolean z3, @SafeParcelable.Param(id = 38) boolean z4, @SafeParcelable.Param(id = 39) String str9, @SafeParcelable.Param(id = 41) String str10, @SafeParcelable.Param(id = 42) boolean z5, @SafeParcelable.Param(id = 43) int i8, @SafeParcelable.Param(id = 44) Bundle bundle4, @SafeParcelable.Param(id = 45) String str11, @SafeParcelable.Param(id = 46) zzaax zzaaxVar, @SafeParcelable.Param(id = 47) boolean z6, @SafeParcelable.Param(id = 48) Bundle bundle5, @SafeParcelable.Param(id = 49) String str12, @SafeParcelable.Param(id = 50) String str13, @SafeParcelable.Param(id = 51) String str14, @SafeParcelable.Param(id = 52) boolean z7, @SafeParcelable.Param(id = 53) List<Integer> list4, @SafeParcelable.Param(id = 54) String str15, @SafeParcelable.Param(id = 55) List<String> list5, @SafeParcelable.Param(id = 56) int i9, @SafeParcelable.Param(id = 57) boolean z8, @SafeParcelable.Param(id = 58) boolean z9, @SafeParcelable.Param(id = 59) boolean z10, @SafeParcelable.Param(id = 60) ArrayList<String> arrayList, @SafeParcelable.Param(id = 61) String str16, @SafeParcelable.Param(id = 63) zzaiy zzaiyVar, @SafeParcelable.Param(id = 64) String str17, @SafeParcelable.Param(id = 65) Bundle bundle6) {
        this.f22326f = i2;
        this.f22328g = bundle;
        this.f22330h = zzxzVar;
        this.f22332i = zzydVar;
        this.f22334j = str;
        this.f22336k = applicationInfo;
        this.f22338l = packageInfo;
        this.f22340m = str2;
        this.f22341n = str3;
        this.f22342o = str4;
        this.f22343p = zzbaiVar;
        this.f22344q = bundle2;
        this.f22345r = i3;
        this.f22346s = list;
        this.f22299E = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.f22347t = bundle3;
        this.f22348u = z;
        this.f22349v = i4;
        this.f22350w = i5;
        this.f22351x = f2;
        this.f22352y = str5;
        this.f22353z = j2;
        this.f22295A = str6;
        this.f22296B = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f22297C = str7;
        this.f22298D = zzadyVar;
        this.f22300F = j3;
        this.f22301G = str8;
        this.f22302H = f3;
        this.f22308N = z2;
        this.f22303I = i6;
        this.f22304J = i7;
        this.f22305K = z3;
        this.f22306L = z4;
        this.f22307M = str9;
        this.f22309O = str10;
        this.f22310P = z5;
        this.f22311Q = i8;
        this.f22312R = bundle4;
        this.f22313S = str11;
        this.f22314T = zzaaxVar;
        this.f22315U = z6;
        this.f22316V = bundle5;
        this.f22317W = str12;
        this.f22318X = str13;
        this.f22319Y = str14;
        this.f22320Z = z7;
        this.f22321a0 = list4;
        this.f22322b0 = str15;
        this.f22323c0 = list5;
        this.f22324d0 = i9;
        this.f22325e0 = z8;
        this.f22327f0 = z9;
        this.f22329g0 = z10;
        this.f22331h0 = arrayList;
        this.f22333i0 = str16;
        this.f22335j0 = zzaiyVar;
        this.f22337k0 = str17;
        this.f22339l0 = bundle6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f22326f);
        SafeParcelWriter.m14470e(parcel, 2, this.f22328g, false);
        SafeParcelWriter.m14484s(parcel, 3, this.f22330h, i2, false);
        SafeParcelWriter.m14484s(parcel, 4, this.f22332i, i2, false);
        SafeParcelWriter.m14486u(parcel, 5, this.f22334j, false);
        SafeParcelWriter.m14484s(parcel, 6, this.f22336k, i2, false);
        SafeParcelWriter.m14484s(parcel, 7, this.f22338l, i2, false);
        SafeParcelWriter.m14486u(parcel, 8, this.f22340m, false);
        SafeParcelWriter.m14486u(parcel, 9, this.f22341n, false);
        SafeParcelWriter.m14486u(parcel, 10, this.f22342o, false);
        SafeParcelWriter.m14484s(parcel, 11, this.f22343p, i2, false);
        SafeParcelWriter.m14470e(parcel, 12, this.f22344q, false);
        SafeParcelWriter.m14477l(parcel, 13, this.f22345r);
        SafeParcelWriter.m14488w(parcel, 14, this.f22346s, false);
        SafeParcelWriter.m14470e(parcel, 15, this.f22347t, false);
        SafeParcelWriter.m14468c(parcel, 16, this.f22348u);
        SafeParcelWriter.m14477l(parcel, 18, this.f22349v);
        SafeParcelWriter.m14477l(parcel, 19, this.f22350w);
        SafeParcelWriter.m14474i(parcel, 20, this.f22351x);
        SafeParcelWriter.m14486u(parcel, 21, this.f22352y, false);
        SafeParcelWriter.m14481p(parcel, 25, this.f22353z);
        SafeParcelWriter.m14486u(parcel, 26, this.f22295A, false);
        SafeParcelWriter.m14488w(parcel, 27, this.f22296B, false);
        SafeParcelWriter.m14486u(parcel, 28, this.f22297C, false);
        SafeParcelWriter.m14484s(parcel, 29, this.f22298D, i2, false);
        SafeParcelWriter.m14488w(parcel, 30, this.f22299E, false);
        SafeParcelWriter.m14481p(parcel, 31, this.f22300F);
        SafeParcelWriter.m14486u(parcel, 33, this.f22301G, false);
        SafeParcelWriter.m14474i(parcel, 34, this.f22302H);
        SafeParcelWriter.m14477l(parcel, 35, this.f22303I);
        SafeParcelWriter.m14477l(parcel, 36, this.f22304J);
        SafeParcelWriter.m14468c(parcel, 37, this.f22305K);
        SafeParcelWriter.m14468c(parcel, 38, this.f22306L);
        SafeParcelWriter.m14486u(parcel, 39, this.f22307M, false);
        SafeParcelWriter.m14468c(parcel, 40, this.f22308N);
        SafeParcelWriter.m14486u(parcel, 41, this.f22309O, false);
        SafeParcelWriter.m14468c(parcel, 42, this.f22310P);
        SafeParcelWriter.m14477l(parcel, 43, this.f22311Q);
        SafeParcelWriter.m14470e(parcel, 44, this.f22312R, false);
        SafeParcelWriter.m14486u(parcel, 45, this.f22313S, false);
        SafeParcelWriter.m14484s(parcel, 46, this.f22314T, i2, false);
        SafeParcelWriter.m14468c(parcel, 47, this.f22315U);
        SafeParcelWriter.m14470e(parcel, 48, this.f22316V, false);
        SafeParcelWriter.m14486u(parcel, 49, this.f22317W, false);
        SafeParcelWriter.m14486u(parcel, 50, this.f22318X, false);
        SafeParcelWriter.m14486u(parcel, 51, this.f22319Y, false);
        SafeParcelWriter.m14468c(parcel, 52, this.f22320Z);
        SafeParcelWriter.m14479n(parcel, 53, this.f22321a0, false);
        SafeParcelWriter.m14486u(parcel, 54, this.f22322b0, false);
        SafeParcelWriter.m14488w(parcel, 55, this.f22323c0, false);
        SafeParcelWriter.m14477l(parcel, 56, this.f22324d0);
        SafeParcelWriter.m14468c(parcel, 57, this.f22325e0);
        SafeParcelWriter.m14468c(parcel, 58, this.f22327f0);
        SafeParcelWriter.m14468c(parcel, 59, this.f22329g0);
        SafeParcelWriter.m14488w(parcel, 60, this.f22331h0, false);
        SafeParcelWriter.m14486u(parcel, 61, this.f22333i0, false);
        SafeParcelWriter.m14484s(parcel, 63, this.f22335j0, i2, false);
        SafeParcelWriter.m14486u(parcel, 64, this.f22337k0, false);
        SafeParcelWriter.m14470e(parcel, 65, this.f22339l0, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
