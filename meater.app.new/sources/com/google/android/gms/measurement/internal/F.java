package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class F extends AbstractC3492a implements Iterable<String> {
    public static final Parcelable.Creator<F> CREATOR = new H();

    /* renamed from: B, reason: collision with root package name */
    private final Bundle f34839B;

    F(Bundle bundle) {
        this.f34839B = bundle;
    }

    final Long G0(String str) {
        return Long.valueOf(this.f34839B.getLong(str));
    }

    final Object O0(String str) {
        return this.f34839B.get(str);
    }

    final String U0(String str) {
        return this.f34839B.getString(str);
    }

    public final int f0() {
        return this.f34839B.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new I(this);
    }

    final Double r0(String str) {
        return Double.valueOf(this.f34839B.getDouble(str));
    }

    public final String toString() {
        return this.f34839B.toString();
    }

    public final Bundle v0() {
        return new Bundle(this.f34839B);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.e(parcel, 2, v0(), false);
        C3493b.b(parcel, iA);
    }
}
