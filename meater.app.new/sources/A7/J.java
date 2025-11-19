package A7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.wearable.C2671l;
import com.google.android.gms.internal.wearable.C2677n;
import h7.AbstractC3492a;
import h7.C3493b;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class J extends AbstractC3492a {
    public static final Parcelable.Creator<J> CREATOR = new K();

    /* renamed from: B, reason: collision with root package name */
    private final List f956B;

    /* renamed from: C, reason: collision with root package name */
    private final List f957C;

    /* renamed from: D, reason: collision with root package name */
    private final List f958D;

    public J(List list, List list2, List list3) {
        this.f956B = list;
        this.f957C = list2;
        this.f958D = list3;
    }

    public final String toString() {
        C2671l c2671lA = C2677n.a(this);
        c2671lA.b("allowedDataItemFilters", this.f956B);
        c2671lA.b("allowedCapabilities", this.f957C);
        c2671lA.b("allowedPackages", this.f958D);
        return c2671lA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f956B;
        int iA = C3493b.a(parcel);
        C3493b.u(parcel, 1, list, false);
        C3493b.s(parcel, 2, this.f957C, false);
        C3493b.s(parcel, 3, this.f958D, false);
        C3493b.b(parcel, iA);
    }
}
