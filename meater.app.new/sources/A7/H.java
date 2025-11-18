package A7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.wearable.C2671l;
import com.google.android.gms.internal.wearable.C2677n;
import h7.AbstractC3492a;
import h7.C3493b;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class H extends AbstractC3492a {
    public static final Parcelable.Creator<H> CREATOR = new I();

    /* renamed from: B, reason: collision with root package name */
    private final List f955B;

    public H(List list) {
        this.f955B = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof H) {
            return Objects.equals(this.f955B, ((H) obj).f955B);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f955B);
    }

    public final String toString() {
        C2671l c2671lA = C2677n.a(this);
        c2671lA.b("dataItemFilters", this.f955B);
        return c2671lA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f955B;
        int iA = C3493b.a(parcel);
        C3493b.u(parcel, 1, list, false);
        C3493b.b(parcel, iA);
    }
}
