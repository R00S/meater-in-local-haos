package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c7.C2333b;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d7.C3047a;
import d7.InterfaceC3051e;
import g7.C3443n;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public final class Status extends AbstractC3492a implements InterfaceC3051e, ReflectedParcelable {

    /* renamed from: B, reason: collision with root package name */
    private final int f33463B;

    /* renamed from: C, reason: collision with root package name */
    private final String f33464C;

    /* renamed from: D, reason: collision with root package name */
    private final PendingIntent f33465D;

    /* renamed from: E, reason: collision with root package name */
    private final C2333b f33466E;

    /* renamed from: F, reason: collision with root package name */
    public static final Status f33455F = new Status(-1);

    /* renamed from: G, reason: collision with root package name */
    public static final Status f33456G = new Status(0);

    /* renamed from: H, reason: collision with root package name */
    public static final Status f33457H = new Status(14);

    /* renamed from: I, reason: collision with root package name */
    public static final Status f33458I = new Status(8);

    /* renamed from: J, reason: collision with root package name */
    public static final Status f33459J = new Status(15);

    /* renamed from: K, reason: collision with root package name */
    public static final Status f33460K = new Status(16);

    /* renamed from: M, reason: collision with root package name */
    public static final Status f33462M = new Status(17);

    /* renamed from: L, reason: collision with root package name */
    public static final Status f33461L = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new e();

    Status(int i10, String str, PendingIntent pendingIntent, C2333b c2333b) {
        this.f33463B = i10;
        this.f33464C = str;
        this.f33465D = pendingIntent;
        this.f33466E = c2333b;
    }

    public boolean G0() {
        return this.f33463B <= 0;
    }

    public final String O0() {
        String str = this.f33464C;
        return str != null ? str : C3047a.a(this.f33463B);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f33463B == status.f33463B && C3443n.a(this.f33464C, status.f33464C) && C3443n.a(this.f33465D, status.f33465D) && C3443n.a(this.f33466E, status.f33466E);
    }

    public C2333b f0() {
        return this.f33466E;
    }

    public int h0() {
        return this.f33463B;
    }

    public int hashCode() {
        return C3443n.b(Integer.valueOf(this.f33463B), this.f33464C, this.f33465D, this.f33466E);
    }

    public String r0() {
        return this.f33464C;
    }

    public String toString() {
        C3443n.a aVarC = C3443n.c(this);
        aVarC.a("statusCode", O0());
        aVarC.a("resolution", this.f33465D);
        return aVarC.toString();
    }

    public boolean v0() {
        return this.f33465D != null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 1, h0());
        C3493b.q(parcel, 2, r0(), false);
        C3493b.p(parcel, 3, this.f33465D, i10, false);
        C3493b.p(parcel, 4, f0(), i10, false);
        C3493b.b(parcel, iA);
    }

    public Status(int i10) {
        this(i10, (String) null);
    }

    public Status(C2333b c2333b, String str) {
        this(c2333b, str, 17);
    }

    public Status(int i10, String str) {
        this(i10, str, (PendingIntent) null);
    }

    @Deprecated
    public Status(C2333b c2333b, String str, int i10) {
        this(i10, str, c2333b.r0(), c2333b);
    }

    public Status(int i10, String str, PendingIntent pendingIntent) {
        this(i10, str, pendingIntent, null);
    }

    @Override // d7.InterfaceC3051e
    public Status a0() {
        return this;
    }
}
