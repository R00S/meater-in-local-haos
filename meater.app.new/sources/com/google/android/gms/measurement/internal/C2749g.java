package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import g7.C3445p;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2749g extends AbstractC3492a {
    public static final Parcelable.Creator<C2749g> CREATOR = new C2770j();

    /* renamed from: B, reason: collision with root package name */
    public String f35351B;

    /* renamed from: C, reason: collision with root package name */
    public String f35352C;

    /* renamed from: D, reason: collision with root package name */
    public P5 f35353D;

    /* renamed from: E, reason: collision with root package name */
    public long f35354E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f35355F;

    /* renamed from: G, reason: collision with root package name */
    public String f35356G;

    /* renamed from: H, reason: collision with root package name */
    public J f35357H;

    /* renamed from: I, reason: collision with root package name */
    public long f35358I;

    /* renamed from: J, reason: collision with root package name */
    public J f35359J;

    /* renamed from: K, reason: collision with root package name */
    public long f35360K;

    /* renamed from: L, reason: collision with root package name */
    public J f35361L;

    C2749g(C2749g c2749g) {
        C3445p.k(c2749g);
        this.f35351B = c2749g.f35351B;
        this.f35352C = c2749g.f35352C;
        this.f35353D = c2749g.f35353D;
        this.f35354E = c2749g.f35354E;
        this.f35355F = c2749g.f35355F;
        this.f35356G = c2749g.f35356G;
        this.f35357H = c2749g.f35357H;
        this.f35358I = c2749g.f35358I;
        this.f35359J = c2749g.f35359J;
        this.f35360K = c2749g.f35360K;
        this.f35361L = c2749g.f35361L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.q(parcel, 2, this.f35351B, false);
        C3493b.q(parcel, 3, this.f35352C, false);
        C3493b.p(parcel, 4, this.f35353D, i10, false);
        C3493b.n(parcel, 5, this.f35354E);
        C3493b.c(parcel, 6, this.f35355F);
        C3493b.q(parcel, 7, this.f35356G, false);
        C3493b.p(parcel, 8, this.f35357H, i10, false);
        C3493b.n(parcel, 9, this.f35358I);
        C3493b.p(parcel, 10, this.f35359J, i10, false);
        C3493b.n(parcel, 11, this.f35360K);
        C3493b.p(parcel, 12, this.f35361L, i10, false);
        C3493b.b(parcel, iA);
    }

    C2749g(String str, String str2, P5 p52, long j10, boolean z10, String str3, J j11, long j12, J j13, long j14, J j15) {
        this.f35351B = str;
        this.f35352C = str2;
        this.f35353D = p52;
        this.f35354E = j10;
        this.f35355F = z10;
        this.f35356G = str3;
        this.f35357H = j11;
        this.f35358I = j12;
        this.f35359J = j13;
        this.f35360K = j14;
        this.f35361L = j15;
    }
}
