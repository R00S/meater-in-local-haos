package B7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class T1 extends AbstractC3492a {
    public static final Parcelable.Creator<T1> CREATOR = new U1();

    /* renamed from: B, reason: collision with root package name */
    public final int f1791B;

    /* renamed from: C, reason: collision with root package name */
    public final List f1792C;

    /* renamed from: D, reason: collision with root package name */
    public final N1 f1793D;

    public T1(int i10, List list, N1 n12) {
        this.f1791B = i10;
        this.f1792C = list;
        this.f1793D = n12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f1791B;
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 1, i11);
        C3493b.u(parcel, 2, this.f1792C, false);
        C3493b.p(parcel, 3, this.f1793D, i10, false);
        C3493b.b(parcel, iA);
    }
}
