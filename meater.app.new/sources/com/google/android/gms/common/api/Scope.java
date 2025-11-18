package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new zza();

    /* renamed from: f */
    @SafeParcelable.VersionField
    final int f17288f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final String f17289g;

    @SafeParcelable.Constructor
    Scope(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str) {
        Preconditions.m14369h(str, "scopeUri must not be null or empty");
        this.f17288f = i2;
        this.f17289g = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f17289g.equals(((Scope) obj).f17289g);
        }
        return false;
    }

    public int hashCode() {
        return this.f17289g.hashCode();
    }

    public String toString() {
        return this.f17289g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f17288f);
        SafeParcelWriter.m14486u(parcel, 2, m13912y(), false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    @KeepForSdk
    /* renamed from: y */
    public String m13912y() {
        return this.f17289g;
    }

    public Scope(String str) {
        this(1, str);
    }
}
