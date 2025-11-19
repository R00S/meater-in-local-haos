package B7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.i1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0912i1 extends AbstractC3492a {
    public static final Parcelable.Creator<C0912i1> CREATOR = new C0915j1();

    /* renamed from: B, reason: collision with root package name */
    public final int f1841B;

    /* renamed from: C, reason: collision with root package name */
    public final C0916k f1842C;

    public C0912i1(int i10, C0916k c0916k) {
        this.f1841B = i10;
        this.f1842C = c0916k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f1841B;
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 2, i11);
        C3493b.p(parcel, 3, this.f1842C, i10, false);
        C3493b.b(parcel, iA);
    }
}
