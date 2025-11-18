package A7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.wearable.C2671l;
import com.google.android.gms.internal.wearable.C2677n;
import h7.AbstractC3492a;
import h7.C3493b;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class L extends AbstractC3492a {
    public static final Parcelable.Creator<L> CREATOR = new M();

    /* renamed from: B, reason: collision with root package name */
    private final Uri f959B;

    /* renamed from: C, reason: collision with root package name */
    private final int f960C;

    public L(Uri uri, int i10) {
        this.f959B = uri;
        this.f960C = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        return Objects.equals(this.f959B, l10.f959B) && this.f960C == l10.f960C;
    }

    public final int hashCode() {
        return Objects.hash(this.f959B, Integer.valueOf(this.f960C));
    }

    public final String toString() {
        C2671l c2671lA = C2677n.a(this);
        c2671lA.b("uri", this.f959B);
        c2671lA.a("filterType", this.f960C);
        return c2671lA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Uri uri = this.f959B;
        int iA = C3493b.a(parcel);
        C3493b.p(parcel, 1, uri, i10, false);
        C3493b.k(parcel, 2, this.f960C);
        C3493b.b(parcel, iA);
    }
}
