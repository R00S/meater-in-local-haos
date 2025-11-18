package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzam extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzam> CREATOR = new zzao();

    /* renamed from: f */
    @SafeParcelable.Field
    private final Bundle f29076f;

    @SafeParcelable.Constructor
    zzam(@SafeParcelable.Param(id = 2) Bundle bundle) {
        this.f29076f = bundle;
    }

    /* renamed from: W */
    final Object m22959W(String str) {
        return this.f29076f.get(str);
    }

    /* renamed from: Y */
    public final Bundle m22960Y() {
        return new Bundle(this.f29076f);
    }

    /* renamed from: e0 */
    final Long m22961e0(String str) {
        return Long.valueOf(this.f29076f.getLong(str));
    }

    /* renamed from: i0 */
    final Double m22962i0(String str) {
        return Double.valueOf(this.f29076f.getDouble(str));
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new C7722i(this);
    }

    /* renamed from: p0 */
    final String m22963p0(String str) {
        return this.f29076f.getString(str);
    }

    public final String toString() {
        return this.f29076f.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14470e(parcel, 2, m22960Y(), false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public final int m22964y() {
        return this.f29076f.size();
    }
}
