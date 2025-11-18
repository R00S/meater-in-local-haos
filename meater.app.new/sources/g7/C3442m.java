package g7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: g7.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3442m extends AbstractC3492a {
    public static final Parcelable.Creator<C3442m> CREATOR = new I();

    /* renamed from: B, reason: collision with root package name */
    private final int f42072B;

    /* renamed from: C, reason: collision with root package name */
    private final int f42073C;

    /* renamed from: D, reason: collision with root package name */
    private final int f42074D;

    /* renamed from: E, reason: collision with root package name */
    private final long f42075E;

    /* renamed from: F, reason: collision with root package name */
    private final long f42076F;

    /* renamed from: G, reason: collision with root package name */
    private final String f42077G;

    /* renamed from: H, reason: collision with root package name */
    private final String f42078H;

    /* renamed from: I, reason: collision with root package name */
    private final int f42079I;

    /* renamed from: J, reason: collision with root package name */
    private final int f42080J;

    public C3442m(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f42072B = i10;
        this.f42073C = i11;
        this.f42074D = i12;
        this.f42075E = j10;
        this.f42076F = j11;
        this.f42077G = str;
        this.f42078H = str2;
        this.f42079I = i13;
        this.f42080J = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f42072B;
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 1, i11);
        C3493b.k(parcel, 2, this.f42073C);
        C3493b.k(parcel, 3, this.f42074D);
        C3493b.n(parcel, 4, this.f42075E);
        C3493b.n(parcel, 5, this.f42076F);
        C3493b.q(parcel, 6, this.f42077G, false);
        C3493b.q(parcel, 7, this.f42078H, false);
        C3493b.k(parcel, 8, this.f42079I);
        C3493b.k(parcel, 9, this.f42080J);
        C3493b.b(parcel, iA);
    }
}
