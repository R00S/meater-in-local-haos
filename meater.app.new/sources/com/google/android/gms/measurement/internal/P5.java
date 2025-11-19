package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import g7.C3445p;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class P5 extends AbstractC3492a {
    public static final Parcelable.Creator<P5> CREATOR = new O5();

    /* renamed from: B, reason: collision with root package name */
    private final int f35128B;

    /* renamed from: C, reason: collision with root package name */
    public final String f35129C;

    /* renamed from: D, reason: collision with root package name */
    public final long f35130D;

    /* renamed from: E, reason: collision with root package name */
    public final Long f35131E;

    /* renamed from: F, reason: collision with root package name */
    public final String f35132F;

    /* renamed from: G, reason: collision with root package name */
    public final String f35133G;

    /* renamed from: H, reason: collision with root package name */
    public final Double f35134H;

    P5(R5 r52) {
        this(r52.f35161c, r52.f35162d, r52.f35163e, r52.f35160b);
    }

    public final Object f0() {
        Long l10 = this.f35131E;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f35134H;
        if (d10 != null) {
            return d10;
        }
        String str = this.f35132F;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 1, this.f35128B);
        C3493b.q(parcel, 2, this.f35129C, false);
        C3493b.n(parcel, 3, this.f35130D);
        C3493b.o(parcel, 4, this.f35131E, false);
        C3493b.i(parcel, 5, null, false);
        C3493b.q(parcel, 6, this.f35132F, false);
        C3493b.q(parcel, 7, this.f35133G, false);
        C3493b.h(parcel, 8, this.f35134H, false);
        C3493b.b(parcel, iA);
    }

    P5(String str, long j10, Object obj, String str2) {
        C3445p.e(str);
        this.f35128B = 2;
        this.f35129C = str;
        this.f35130D = j10;
        this.f35133G = str2;
        if (obj == null) {
            this.f35131E = null;
            this.f35134H = null;
            this.f35132F = null;
            return;
        }
        if (obj instanceof Long) {
            this.f35131E = (Long) obj;
            this.f35134H = null;
            this.f35132F = null;
        } else if (obj instanceof String) {
            this.f35131E = null;
            this.f35134H = null;
            this.f35132F = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.f35131E = null;
            this.f35134H = (Double) obj;
            this.f35132F = null;
        }
    }

    P5(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f35128B = i10;
        this.f35129C = str;
        this.f35130D = j10;
        this.f35131E = l10;
        if (i10 == 1) {
            this.f35134H = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        } else {
            this.f35134H = d10;
        }
        this.f35132F = str2;
        this.f35133G = str3;
    }
}
