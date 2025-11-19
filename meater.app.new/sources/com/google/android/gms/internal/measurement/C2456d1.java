package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.d1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2456d1 extends AbstractC3492a {
    public static final Parcelable.Creator<C2456d1> CREATOR = new C2489h1();

    /* renamed from: B, reason: collision with root package name */
    public final long f34064B;

    /* renamed from: C, reason: collision with root package name */
    public final long f34065C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f34066D;

    /* renamed from: E, reason: collision with root package name */
    public final String f34067E;

    /* renamed from: F, reason: collision with root package name */
    public final String f34068F;

    /* renamed from: G, reason: collision with root package name */
    public final String f34069G;

    /* renamed from: H, reason: collision with root package name */
    public final Bundle f34070H;

    /* renamed from: I, reason: collision with root package name */
    public final String f34071I;

    public C2456d1(long j10, long j11, boolean z10, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f34064B = j10;
        this.f34065C = j11;
        this.f34066D = z10;
        this.f34067E = str;
        this.f34068F = str2;
        this.f34069G = str3;
        this.f34070H = bundle;
        this.f34071I = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.n(parcel, 1, this.f34064B);
        C3493b.n(parcel, 2, this.f34065C);
        C3493b.c(parcel, 3, this.f34066D);
        C3493b.q(parcel, 4, this.f34067E, false);
        C3493b.q(parcel, 5, this.f34068F, false);
        C3493b.q(parcel, 6, this.f34069G, false);
        C3493b.e(parcel, 7, this.f34070H, false);
        C3493b.q(parcel, 8, this.f34071I, false);
        C3493b.b(parcel, iA);
    }
}
