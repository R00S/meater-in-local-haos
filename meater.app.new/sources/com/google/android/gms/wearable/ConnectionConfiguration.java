package com.google.android.gms.wearable;

import A7.H;
import A7.J;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g7.C3443n;
import h7.AbstractC3492a;
import h7.C3493b;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public class ConnectionConfiguration extends AbstractC3492a implements ReflectedParcelable {
    public static final Parcelable.Creator<ConnectionConfiguration> CREATOR = new b();

    /* renamed from: B, reason: collision with root package name */
    private final String f35797B;

    /* renamed from: C, reason: collision with root package name */
    private final String f35798C;

    /* renamed from: D, reason: collision with root package name */
    private final int f35799D;

    /* renamed from: E, reason: collision with root package name */
    private final int f35800E;

    /* renamed from: F, reason: collision with root package name */
    private final boolean f35801F;

    /* renamed from: G, reason: collision with root package name */
    private final boolean f35802G;

    /* renamed from: H, reason: collision with root package name */
    private volatile String f35803H;

    /* renamed from: I, reason: collision with root package name */
    private final boolean f35804I;

    /* renamed from: J, reason: collision with root package name */
    private final String f35805J;

    /* renamed from: K, reason: collision with root package name */
    private final String f35806K;

    /* renamed from: L, reason: collision with root package name */
    private final int f35807L;

    /* renamed from: M, reason: collision with root package name */
    private final List f35808M;

    /* renamed from: N, reason: collision with root package name */
    private final boolean f35809N;

    /* renamed from: O, reason: collision with root package name */
    private final boolean f35810O;

    /* renamed from: P, reason: collision with root package name */
    private final J f35811P;

    /* renamed from: Q, reason: collision with root package name */
    private final boolean f35812Q;

    /* renamed from: R, reason: collision with root package name */
    private final H f35813R;

    /* renamed from: S, reason: collision with root package name */
    private final int f35814S;

    ConnectionConfiguration(String str, String str2, int i10, int i11, boolean z10, boolean z11, String str3, boolean z12, String str4, String str5, int i12, List list, boolean z13, boolean z14, J j10, boolean z15, H h10, int i13) {
        this.f35797B = str;
        this.f35798C = str2;
        this.f35799D = i10;
        this.f35800E = i11;
        this.f35801F = z10;
        this.f35802G = z11;
        this.f35803H = str3;
        this.f35804I = z12;
        this.f35805J = str4;
        this.f35806K = str5;
        this.f35807L = i12;
        this.f35808M = list;
        this.f35809N = z13;
        this.f35810O = z14;
        this.f35811P = j10;
        this.f35812Q = z15;
        this.f35813R = h10;
        this.f35814S = i13;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        return C3443n.a(this.f35797B, connectionConfiguration.f35797B) && C3443n.a(this.f35798C, connectionConfiguration.f35798C) && C3443n.a(Integer.valueOf(this.f35799D), Integer.valueOf(connectionConfiguration.f35799D)) && C3443n.a(Integer.valueOf(this.f35800E), Integer.valueOf(connectionConfiguration.f35800E)) && C3443n.a(Boolean.valueOf(this.f35801F), Boolean.valueOf(connectionConfiguration.f35801F)) && C3443n.a(Boolean.valueOf(this.f35804I), Boolean.valueOf(connectionConfiguration.f35804I)) && C3443n.a(Boolean.valueOf(this.f35809N), Boolean.valueOf(connectionConfiguration.f35809N)) && C3443n.a(Boolean.valueOf(this.f35810O), Boolean.valueOf(connectionConfiguration.f35810O));
    }

    public final int hashCode() {
        return C3443n.b(this.f35797B, this.f35798C, Integer.valueOf(this.f35799D), Integer.valueOf(this.f35800E), Boolean.valueOf(this.f35801F), Boolean.valueOf(this.f35804I), Boolean.valueOf(this.f35809N), Boolean.valueOf(this.f35810O));
    }

    public final String toString() {
        return "ConnectionConfiguration[ Name=" + this.f35797B + ", Address=" + this.f35798C + ", Type=" + this.f35799D + ", Role=" + this.f35800E + ", Enabled=" + this.f35801F + ", IsConnected=" + this.f35802G + ", PeerNodeId=" + this.f35803H + ", BtlePriority=" + this.f35804I + ", NodeId=" + this.f35805J + ", PackageName=" + this.f35806K + ", ConnectionRetryStrategy=" + this.f35807L + ", allowedConfigPackages=" + this.f35808M + ", Migrating=" + this.f35809N + ", DataItemSyncEnabled=" + this.f35810O + ", ConnectionRestrictions=" + this.f35811P + ", removeConnectionWhenBondRemovedByUser=" + this.f35812Q + ", maxSupportedRemoteAndroidSdkVersion=" + this.f35814S + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f35797B;
        int iA = C3493b.a(parcel);
        C3493b.q(parcel, 2, str, false);
        C3493b.q(parcel, 3, this.f35798C, false);
        C3493b.k(parcel, 4, this.f35799D);
        C3493b.k(parcel, 5, this.f35800E);
        C3493b.c(parcel, 6, this.f35801F);
        C3493b.c(parcel, 7, this.f35802G);
        C3493b.q(parcel, 8, this.f35803H, false);
        C3493b.c(parcel, 9, this.f35804I);
        C3493b.q(parcel, 10, this.f35805J, false);
        C3493b.q(parcel, 11, this.f35806K, false);
        C3493b.k(parcel, 12, this.f35807L);
        C3493b.s(parcel, 13, this.f35808M, false);
        C3493b.c(parcel, 14, this.f35809N);
        C3493b.c(parcel, 15, this.f35810O);
        C3493b.p(parcel, 16, this.f35811P, i10, false);
        C3493b.c(parcel, 17, this.f35812Q);
        C3493b.p(parcel, 18, this.f35813R, i10, false);
        C3493b.k(parcel, 19, this.f35814S);
        C3493b.b(parcel, iA);
    }
}
