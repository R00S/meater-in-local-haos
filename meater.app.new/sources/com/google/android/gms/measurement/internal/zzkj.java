package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzkj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzkj> CREATOR = new zzki();

    /* renamed from: f */
    @SafeParcelable.Field
    private final int f29387f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final String f29388g;

    /* renamed from: h */
    @SafeParcelable.Field
    public final long f29389h;

    /* renamed from: i */
    @SafeParcelable.Field
    public final Long f29390i;

    /* renamed from: j */
    @SafeParcelable.Field
    private final Float f29391j;

    /* renamed from: k */
    @SafeParcelable.Field
    public final String f29392k;

    /* renamed from: l */
    @SafeParcelable.Field
    public final String f29393l;

    /* renamed from: m */
    @SafeParcelable.Field
    public final Double f29394m;

    zzkj(C7766m7 c7766m7) {
        this(c7766m7.f28779c, c7766m7.f28780d, c7766m7.f28781e, c7766m7.f28778b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f29387f);
        SafeParcelWriter.m14486u(parcel, 2, this.f29388g, false);
        SafeParcelWriter.m14481p(parcel, 3, this.f29389h);
        SafeParcelWriter.m14482q(parcel, 4, this.f29390i, false);
        SafeParcelWriter.m14475j(parcel, 5, null, false);
        SafeParcelWriter.m14486u(parcel, 6, this.f29392k, false);
        SafeParcelWriter.m14486u(parcel, 7, this.f29393l, false);
        SafeParcelWriter.m14473h(parcel, 8, this.f29394m, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public final Object m23494y() {
        Long l = this.f29390i;
        if (l != null) {
            return l;
        }
        Double d2 = this.f29394m;
        if (d2 != null) {
            return d2;
        }
        String str = this.f29392k;
        if (str != null) {
            return str;
        }
        return null;
    }

    zzkj(String str, long j2, Object obj, String str2) {
        Preconditions.m14368g(str);
        this.f29387f = 2;
        this.f29388g = str;
        this.f29389h = j2;
        this.f29393l = str2;
        if (obj == null) {
            this.f29390i = null;
            this.f29391j = null;
            this.f29394m = null;
            this.f29392k = null;
            return;
        }
        if (obj instanceof Long) {
            this.f29390i = (Long) obj;
            this.f29391j = null;
            this.f29394m = null;
            this.f29392k = null;
            return;
        }
        if (obj instanceof String) {
            this.f29390i = null;
            this.f29391j = null;
            this.f29394m = null;
            this.f29392k = (String) obj;
            return;
        }
        if (!(obj instanceof Double)) {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
        this.f29390i = null;
        this.f29391j = null;
        this.f29394m = (Double) obj;
        this.f29392k = null;
    }

    zzkj(String str, long j2, String str2) {
        Preconditions.m14368g(str);
        this.f29387f = 2;
        this.f29388g = str;
        this.f29389h = 0L;
        this.f29390i = null;
        this.f29391j = null;
        this.f29394m = null;
        this.f29392k = null;
        this.f29393l = null;
    }

    @SafeParcelable.Constructor
    zzkj(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) long j2, @SafeParcelable.Param(id = 4) Long l, @SafeParcelable.Param(id = 5) Float f2, @SafeParcelable.Param(id = 6) String str2, @SafeParcelable.Param(id = 7) String str3, @SafeParcelable.Param(id = 8) Double d2) {
        this.f29387f = i2;
        this.f29388g = str;
        this.f29389h = j2;
        this.f29390i = l;
        this.f29391j = null;
        if (i2 == 1) {
            this.f29394m = f2 != null ? Double.valueOf(f2.doubleValue()) : null;
        } else {
            this.f29394m = d2;
        }
        this.f29392k = str2;
        this.f29393l = str3;
    }
}
