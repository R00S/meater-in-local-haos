package B7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0940s0 extends AbstractC3492a {
    public static final Parcelable.Creator<C0940s0> CREATOR = new C0943t0();

    /* renamed from: B, reason: collision with root package name */
    public final int f1865B;

    /* renamed from: C, reason: collision with root package name */
    public final List f1866C;

    public C0940s0(int i10, List list) {
        this.f1865B = i10;
        this.f1866C = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f1865B;
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 1, i11);
        C3493b.u(parcel, 2, this.f1866C, false);
        C3493b.b(parcel, iA);
    }
}
