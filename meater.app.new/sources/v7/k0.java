package v7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class k0 extends AbstractC3492a {
    public static final Parcelable.Creator<k0> CREATOR = new j0();

    /* renamed from: B, reason: collision with root package name */
    public final List<Integer> f51567B;

    k0(List<Integer> list) {
        this.f51567B = list;
    }

    public static k0 f0(X... xArr) {
        ArrayList arrayList = new ArrayList(xArr.length);
        for (X x10 : xArr) {
            arrayList.add(Integer.valueOf(x10.a()));
        }
        return new k0(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.m(parcel, 1, this.f51567B, false);
        C3493b.b(parcel, iA);
    }
}
