package com.google.android.gms.wearable;

import A7.P;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public class Term extends AbstractC3492a implements ReflectedParcelable {
    public static final Parcelable.Creator<Term> CREATOR = new P();

    /* renamed from: B, reason: collision with root package name */
    private final int f35815B;

    /* renamed from: C, reason: collision with root package name */
    private final String f35816C;

    /* renamed from: D, reason: collision with root package name */
    private final boolean f35817D;

    /* renamed from: E, reason: collision with root package name */
    private final String f35818E;

    /* renamed from: F, reason: collision with root package name */
    private final String f35819F;

    /* renamed from: G, reason: collision with root package name */
    private final int f35820G;

    public Term(int i10, String str, boolean z10, String str2, String str3, int i11) {
        this.f35815B = i10;
        this.f35818E = str2;
        this.f35817D = z10;
        this.f35816C = str;
        this.f35819F = str3;
        this.f35820G = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f35815B;
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 1, i11);
        C3493b.q(parcel, 2, this.f35816C, false);
        C3493b.c(parcel, 3, this.f35817D);
        C3493b.q(parcel, 4, this.f35818E, false);
        C3493b.q(parcel, 5, this.f35819F, false);
        C3493b.k(parcel, 6, this.f35820G);
        C3493b.b(parcel, iA);
    }
}
