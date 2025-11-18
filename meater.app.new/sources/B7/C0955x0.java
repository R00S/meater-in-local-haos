package B7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0955x0 extends AbstractC3492a {
    public static final Parcelable.Creator<C0955x0> CREATOR = new C0958y0();

    /* renamed from: B, reason: collision with root package name */
    public final int f1890B;

    /* renamed from: C, reason: collision with root package name */
    public final C0906g1 f1891C;

    public C0955x0(int i10, C0906g1 c0906g1) {
        this.f1890B = i10;
        this.f1891C = c0906g1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f1890B;
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 2, i11);
        C3493b.p(parcel, 3, this.f1891C, i10, false);
        C3493b.b(parcel, iA);
    }
}
