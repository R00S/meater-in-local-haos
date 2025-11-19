package B7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0935q0 extends AbstractC3492a {
    public static final Parcelable.Creator<C0935q0> CREATOR = new C0937r0();

    /* renamed from: B, reason: collision with root package name */
    public final int f1861B;

    /* renamed from: C, reason: collision with root package name */
    public final J f1862C;

    public C0935q0(int i10, J j10) {
        this.f1861B = i10;
        this.f1862C = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f1861B;
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 1, i11);
        C3493b.p(parcel, 2, this.f1862C, i10, false);
        C3493b.b(parcel, iA);
    }
}
