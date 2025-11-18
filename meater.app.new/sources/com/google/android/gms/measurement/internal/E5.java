package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import g7.C3445p;
import h7.AbstractC3492a;
import h7.C3493b;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class E5 extends AbstractC3492a {
    public static final Parcelable.Creator<E5> CREATOR = new T5();

    /* renamed from: B, reason: collision with root package name */
    public final String f34806B;

    /* renamed from: C, reason: collision with root package name */
    public final String f34807C;

    /* renamed from: D, reason: collision with root package name */
    public final String f34808D;

    /* renamed from: E, reason: collision with root package name */
    public final String f34809E;

    /* renamed from: F, reason: collision with root package name */
    public final long f34810F;

    /* renamed from: G, reason: collision with root package name */
    public final long f34811G;

    /* renamed from: H, reason: collision with root package name */
    public final String f34812H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f34813I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f34814J;

    /* renamed from: K, reason: collision with root package name */
    public final long f34815K;

    /* renamed from: L, reason: collision with root package name */
    public final String f34816L;

    /* renamed from: M, reason: collision with root package name */
    public final long f34817M;

    /* renamed from: N, reason: collision with root package name */
    public final int f34818N;

    /* renamed from: O, reason: collision with root package name */
    public final boolean f34819O;

    /* renamed from: P, reason: collision with root package name */
    public final boolean f34820P;

    /* renamed from: Q, reason: collision with root package name */
    public final String f34821Q;

    /* renamed from: R, reason: collision with root package name */
    public final Boolean f34822R;

    /* renamed from: S, reason: collision with root package name */
    public final long f34823S;

    /* renamed from: T, reason: collision with root package name */
    public final List<String> f34824T;

    /* renamed from: U, reason: collision with root package name */
    private final String f34825U;

    /* renamed from: V, reason: collision with root package name */
    public final String f34826V;

    /* renamed from: W, reason: collision with root package name */
    public final String f34827W;

    /* renamed from: X, reason: collision with root package name */
    public final String f34828X;

    /* renamed from: Y, reason: collision with root package name */
    public final boolean f34829Y;

    /* renamed from: Z, reason: collision with root package name */
    public final long f34830Z;

    /* renamed from: a0, reason: collision with root package name */
    public final int f34831a0;

    /* renamed from: b0, reason: collision with root package name */
    public final String f34832b0;

    /* renamed from: c0, reason: collision with root package name */
    public final int f34833c0;

    /* renamed from: d0, reason: collision with root package name */
    public final long f34834d0;

    /* renamed from: e0, reason: collision with root package name */
    public final String f34835e0;

    /* renamed from: f0, reason: collision with root package name */
    public final String f34836f0;

    /* renamed from: g0, reason: collision with root package name */
    public final long f34837g0;

    /* renamed from: h0, reason: collision with root package name */
    public final int f34838h0;

    E5(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j14, List<String> list, String str8, String str9, String str10, String str11, boolean z14, long j15, int i11, String str12, int i12, long j16, String str13, String str14, long j17, int i13) {
        C3445p.e(str);
        this.f34806B = str;
        this.f34807C = TextUtils.isEmpty(str2) ? null : str2;
        this.f34808D = str3;
        this.f34815K = j10;
        this.f34809E = str4;
        this.f34810F = j11;
        this.f34811G = j12;
        this.f34812H = str5;
        this.f34813I = z10;
        this.f34814J = z11;
        this.f34816L = str6;
        this.f34817M = j13;
        this.f34818N = i10;
        this.f34819O = z12;
        this.f34820P = z13;
        this.f34821Q = str7;
        this.f34822R = bool;
        this.f34823S = j14;
        this.f34824T = list;
        this.f34825U = null;
        this.f34826V = str9;
        this.f34827W = str10;
        this.f34828X = str11;
        this.f34829Y = z14;
        this.f34830Z = j15;
        this.f34831a0 = i11;
        this.f34832b0 = str12;
        this.f34833c0 = i12;
        this.f34834d0 = j16;
        this.f34835e0 = str13;
        this.f34836f0 = str14;
        this.f34837g0 = j17;
        this.f34838h0 = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.q(parcel, 2, this.f34806B, false);
        C3493b.q(parcel, 3, this.f34807C, false);
        C3493b.q(parcel, 4, this.f34808D, false);
        C3493b.q(parcel, 5, this.f34809E, false);
        C3493b.n(parcel, 6, this.f34810F);
        C3493b.n(parcel, 7, this.f34811G);
        C3493b.q(parcel, 8, this.f34812H, false);
        C3493b.c(parcel, 9, this.f34813I);
        C3493b.c(parcel, 10, this.f34814J);
        C3493b.n(parcel, 11, this.f34815K);
        C3493b.q(parcel, 12, this.f34816L, false);
        C3493b.n(parcel, 14, this.f34817M);
        C3493b.k(parcel, 15, this.f34818N);
        C3493b.c(parcel, 16, this.f34819O);
        C3493b.c(parcel, 18, this.f34820P);
        C3493b.q(parcel, 19, this.f34821Q, false);
        C3493b.d(parcel, 21, this.f34822R, false);
        C3493b.n(parcel, 22, this.f34823S);
        C3493b.s(parcel, 23, this.f34824T, false);
        C3493b.q(parcel, 24, this.f34825U, false);
        C3493b.q(parcel, 25, this.f34826V, false);
        C3493b.q(parcel, 26, this.f34827W, false);
        C3493b.q(parcel, 27, this.f34828X, false);
        C3493b.c(parcel, 28, this.f34829Y);
        C3493b.n(parcel, 29, this.f34830Z);
        C3493b.k(parcel, 30, this.f34831a0);
        C3493b.q(parcel, 31, this.f34832b0, false);
        C3493b.k(parcel, 32, this.f34833c0);
        C3493b.n(parcel, 34, this.f34834d0);
        C3493b.q(parcel, 35, this.f34835e0, false);
        C3493b.q(parcel, 36, this.f34836f0, false);
        C3493b.n(parcel, 37, this.f34837g0);
        C3493b.k(parcel, 38, this.f34838h0);
        C3493b.b(parcel, iA);
    }

    E5(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j14, List<String> list, String str8, String str9, String str10, String str11, boolean z14, long j15, int i11, String str12, int i12, long j16, String str13, String str14, long j17, int i13) {
        this.f34806B = str;
        this.f34807C = str2;
        this.f34808D = str3;
        this.f34815K = j12;
        this.f34809E = str4;
        this.f34810F = j10;
        this.f34811G = j11;
        this.f34812H = str5;
        this.f34813I = z10;
        this.f34814J = z11;
        this.f34816L = str6;
        this.f34817M = j13;
        this.f34818N = i10;
        this.f34819O = z12;
        this.f34820P = z13;
        this.f34821Q = str7;
        this.f34822R = bool;
        this.f34823S = j14;
        this.f34824T = list;
        this.f34825U = str8;
        this.f34826V = str9;
        this.f34827W = str10;
        this.f34828X = str11;
        this.f34829Y = z14;
        this.f34830Z = j15;
        this.f34831a0 = i11;
        this.f34832b0 = str12;
        this.f34833c0 = i12;
        this.f34834d0 = j16;
        this.f34835e0 = str13;
        this.f34836f0 = str14;
        this.f34837g0 = j17;
        this.f34838h0 = i13;
    }
}
