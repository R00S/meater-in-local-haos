package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.g1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2481g1 extends AbstractC3492a {
    public static final Parcelable.Creator<C2481g1> CREATOR = new C2505j1();

    /* renamed from: B, reason: collision with root package name */
    public final int f34117B;

    /* renamed from: C, reason: collision with root package name */
    public final String f34118C;

    /* renamed from: D, reason: collision with root package name */
    public final Intent f34119D;

    public C2481g1(int i10, String str, Intent intent) {
        this.f34117B = i10;
        this.f34118C = str;
        this.f34119D = intent;
    }

    public static C2481g1 f0(Activity activity) {
        return new C2481g1(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2481g1)) {
            return false;
        }
        C2481g1 c2481g1 = (C2481g1) obj;
        return this.f34117B == c2481g1.f34117B && Objects.equals(this.f34118C, c2481g1.f34118C) && Objects.equals(this.f34119D, c2481g1.f34119D);
    }

    public final int hashCode() {
        return this.f34117B;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 1, this.f34117B);
        C3493b.q(parcel, 2, this.f34118C, false);
        C3493b.p(parcel, 3, this.f34119D, i10, false);
        C3493b.b(parcel, iA);
    }
}
