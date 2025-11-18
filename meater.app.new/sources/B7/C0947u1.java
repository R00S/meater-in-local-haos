package B7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.u1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0947u1 extends AbstractC3492a {
    public static final Parcelable.Creator<C0947u1> CREATOR = new C0950v1();

    /* renamed from: B, reason: collision with root package name */
    public final int f1872B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1873C;

    /* renamed from: D, reason: collision with root package name */
    public final byte[] f1874D;

    public C0947u1(int i10, int i11, byte[] bArr) {
        this.f1872B = i10;
        this.f1873C = i11;
        this.f1874D = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f1872B;
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 1, i11);
        C3493b.k(parcel, 2, this.f1873C);
        C3493b.g(parcel, 3, this.f1874D, false);
        C3493b.b(parcel, iA);
    }
}
