package B7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class A1 extends AbstractC3492a {
    public static final Parcelable.Creator<A1> CREATOR = new B1();

    /* renamed from: B, reason: collision with root package name */
    public final int f1709B;

    /* renamed from: C, reason: collision with root package name */
    public final long f1710C;

    /* renamed from: D, reason: collision with root package name */
    public final List f1711D;

    public A1(int i10, long j10, List list) {
        this.f1709B = i10;
        this.f1710C = j10;
        this.f1711D = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f1709B;
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 2, i11);
        C3493b.n(parcel, 3, this.f1710C);
        C3493b.u(parcel, 4, this.f1711D, false);
        C3493b.b(parcel, iA);
    }
}
