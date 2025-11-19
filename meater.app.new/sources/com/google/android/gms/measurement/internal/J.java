package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import g7.C3445p;
import h7.AbstractC3492a;
import h7.C3493b;
import v7.C4902d;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class J extends AbstractC3492a {
    public static final Parcelable.Creator<J> CREATOR = new C4902d();

    /* renamed from: B, reason: collision with root package name */
    public final String f34889B;

    /* renamed from: C, reason: collision with root package name */
    public final F f34890C;

    /* renamed from: D, reason: collision with root package name */
    public final String f34891D;

    /* renamed from: E, reason: collision with root package name */
    public final long f34892E;

    J(J j10, long j11) {
        C3445p.k(j10);
        this.f34889B = j10.f34889B;
        this.f34890C = j10.f34890C;
        this.f34891D = j10.f34891D;
        this.f34892E = j11;
    }

    public final String toString() {
        return "origin=" + this.f34891D + ",name=" + this.f34889B + ",params=" + String.valueOf(this.f34890C);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.q(parcel, 2, this.f34889B, false);
        C3493b.p(parcel, 3, this.f34890C, i10, false);
        C3493b.q(parcel, 4, this.f34891D, false);
        C3493b.n(parcel, 5, this.f34892E);
        C3493b.b(parcel, iA);
    }

    public J(String str, F f10, String str2, long j10) {
        this.f34889B = str;
        this.f34890C = f10;
        this.f34891D = str2;
        this.f34892E = j10;
    }
}
