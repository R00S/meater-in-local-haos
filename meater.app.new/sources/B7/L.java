package B7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class L extends AbstractC3492a {
    public static final Parcelable.Creator<L> CREATOR = new M();

    /* renamed from: B, reason: collision with root package name */
    public final int f1749B;

    /* renamed from: C, reason: collision with root package name */
    public final List f1750C;

    public L(int i10, List list) {
        this.f1749B = i10;
        this.f1750C = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f1749B;
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 2, i11);
        C3493b.u(parcel, 3, this.f1750C, false);
        C3493b.b(parcel, iA);
    }
}
