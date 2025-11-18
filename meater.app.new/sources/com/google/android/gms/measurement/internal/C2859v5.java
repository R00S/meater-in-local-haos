package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.v5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2859v5 extends AbstractC3492a {
    public static final Parcelable.Creator<C2859v5> CREATOR = new C2852u5();

    /* renamed from: B, reason: collision with root package name */
    public final List<C2845t5> f35693B;

    C2859v5(List<C2845t5> list) {
        this.f35693B = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.u(parcel, 1, this.f35693B, false);
        C3493b.b(parcel, iA);
    }
}
