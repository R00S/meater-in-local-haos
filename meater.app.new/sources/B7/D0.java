package B7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class D0 extends AbstractC3492a {
    public static final Parcelable.Creator<D0> CREATOR = new E0();

    /* renamed from: B, reason: collision with root package name */
    public final int f1718B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f1719C;

    public D0(int i10, boolean z10) {
        this.f1718B = i10;
        this.f1719C = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f1718B;
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 1, i11);
        C3493b.c(parcel, 2, this.f1719C);
        C3493b.b(parcel, iA);
    }
}
