package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g7.C3445p;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public final class Scope extends AbstractC3492a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new d();

    /* renamed from: B, reason: collision with root package name */
    final int f33453B;

    /* renamed from: C, reason: collision with root package name */
    private final String f33454C;

    Scope(int i10, String str) {
        C3445p.f(str, "scopeUri must not be null or empty");
        this.f33453B = i10;
        this.f33454C = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f33454C.equals(((Scope) obj).f33454C);
        }
        return false;
    }

    public String f0() {
        return this.f33454C;
    }

    public int hashCode() {
        return this.f33454C.hashCode();
    }

    public String toString() {
        return this.f33454C;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f33453B;
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 1, i11);
        C3493b.q(parcel, 2, f0(), false);
        C3493b.b(parcel, iA);
    }

    public Scope(String str) {
        this(1, str);
    }
}
