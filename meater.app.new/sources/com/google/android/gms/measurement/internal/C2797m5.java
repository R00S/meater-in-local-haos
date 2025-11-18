package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.m5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2797m5 extends AbstractC3492a {
    public static final Parcelable.Creator<C2797m5> CREATOR = new C2818p5();

    /* renamed from: B, reason: collision with root package name */
    public final String f35468B;

    /* renamed from: C, reason: collision with root package name */
    public final long f35469C;

    /* renamed from: D, reason: collision with root package name */
    public final int f35470D;

    C2797m5(String str, long j10, int i10) {
        this.f35468B = str;
        this.f35469C = j10;
        this.f35470D = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.q(parcel, 1, this.f35468B, false);
        C3493b.n(parcel, 2, this.f35469C);
        C3493b.k(parcel, 3, this.f35470D);
        C3493b.b(parcel, iA);
    }
}
