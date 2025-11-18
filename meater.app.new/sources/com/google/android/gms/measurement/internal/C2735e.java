package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2735e extends AbstractC3492a {
    public static final Parcelable.Creator<C2735e> CREATOR = new C2756h();

    /* renamed from: B, reason: collision with root package name */
    public final long f35331B;

    /* renamed from: C, reason: collision with root package name */
    public final int f35332C;

    /* renamed from: D, reason: collision with root package name */
    public final long f35333D;

    C2735e(long j10, int i10, long j11) {
        this.f35331B = j10;
        this.f35332C = i10;
        this.f35333D = j11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.n(parcel, 1, this.f35331B);
        C3493b.k(parcel, 2, this.f35332C);
        C3493b.n(parcel, 3, this.f35333D);
        C3493b.b(parcel, iA);
    }
}
