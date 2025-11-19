package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.t5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2845t5 extends AbstractC3492a {
    public static final Parcelable.Creator<C2845t5> CREATOR = new C2838s5();

    /* renamed from: B, reason: collision with root package name */
    public final long f35666B;

    /* renamed from: C, reason: collision with root package name */
    public byte[] f35667C;

    /* renamed from: D, reason: collision with root package name */
    public final String f35668D;

    /* renamed from: E, reason: collision with root package name */
    public final Bundle f35669E;

    /* renamed from: F, reason: collision with root package name */
    private final int f35670F;

    /* renamed from: G, reason: collision with root package name */
    public final long f35671G;

    /* renamed from: H, reason: collision with root package name */
    public String f35672H;

    C2845t5(long j10, byte[] bArr, String str, Bundle bundle, int i10, long j11) {
        this(j10, bArr, str, bundle, i10, j11, "");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.n(parcel, 1, this.f35666B);
        C3493b.g(parcel, 2, this.f35667C, false);
        C3493b.q(parcel, 3, this.f35668D, false);
        C3493b.e(parcel, 4, this.f35669E, false);
        C3493b.k(parcel, 5, this.f35670F);
        C3493b.n(parcel, 6, this.f35671G);
        C3493b.q(parcel, 7, this.f35672H, false);
        C3493b.b(parcel, iA);
    }

    C2845t5(long j10, byte[] bArr, String str, Bundle bundle, int i10, long j11, String str2) {
        this.f35666B = j10;
        this.f35667C = bArr;
        this.f35668D = str;
        this.f35669E = bundle;
        this.f35670F = i10;
        this.f35671G = j11;
        this.f35672H = str2;
    }
}
