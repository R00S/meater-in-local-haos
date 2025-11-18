package B7;

import android.os.Parcel;
import android.os.Parcelable;
import g7.C3443n;
import h7.AbstractC3492a;
import h7.C3493b;
import java.time.Instant;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0948v extends AbstractC3492a {
    public static final Parcelable.Creator<C0948v> CREATOR = new C0951w();

    /* renamed from: B, reason: collision with root package name */
    public final int f1875B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f1876C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f1877D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f1878E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f1879F;

    /* renamed from: G, reason: collision with root package name */
    public final List f1880G;

    /* renamed from: H, reason: collision with root package name */
    public final String f1881H;

    /* renamed from: I, reason: collision with root package name */
    public final Long f1882I;

    public C0948v(int i10, boolean z10, boolean z11, boolean z12, boolean z13, List list, String str, Long l10) {
        this.f1875B = i10;
        this.f1876C = z10;
        this.f1877D = z11;
        this.f1878E = z12;
        this.f1879F = z13;
        this.f1880G = list;
        this.f1881H = str;
        this.f1882I = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0948v)) {
            return false;
        }
        C0948v c0948v = (C0948v) obj;
        if (this.f1875B == c0948v.f1875B && this.f1876C == c0948v.f1876C && this.f1877D == c0948v.f1877D && this.f1878E == c0948v.f1878E && this.f1879F == c0948v.f1879F) {
            List list = c0948v.f1880G;
            List list2 = this.f1880G;
            if (list2 == null || list == null ? list2 == list : !(!list2.containsAll(list) || this.f1880G.size() != list.size())) {
                if (C3443n.a(this.f1881H, c0948v.f1881H) && C3443n.a(this.f1882I, c0948v.f1882I)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return C3443n.b(Integer.valueOf(this.f1875B), Boolean.valueOf(this.f1876C), Boolean.valueOf(this.f1877D), Boolean.valueOf(this.f1878E), Boolean.valueOf(this.f1879F), this.f1880G, this.f1881H, this.f1882I);
    }

    public final String toString() {
        Long l10 = this.f1882I;
        String strValueOf = String.valueOf(this.f1880G);
        Instant instantOfEpochMilli = l10 != null ? Instant.ofEpochMilli(l10.longValue()) : null;
        String str = this.f1881H;
        boolean z10 = this.f1879F;
        boolean z11 = this.f1878E;
        boolean z12 = this.f1877D;
        boolean z13 = this.f1876C;
        return "ConsentResponse {statusCode =" + this.f1875B + ", hasTosConsent =" + z13 + ", hasLoggingConsent =" + z12 + ", hasCloudSyncConsent =" + z11 + ", hasLocationConsent =" + z10 + ", accountConsentRecords =" + strValueOf + ", nodeId =" + str + ", lastUpdateRequestedTime =" + String.valueOf(instantOfEpochMilli) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f1875B;
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 1, i11);
        C3493b.c(parcel, 2, this.f1876C);
        C3493b.c(parcel, 3, this.f1877D);
        C3493b.c(parcel, 4, this.f1878E);
        C3493b.c(parcel, 5, this.f1879F);
        C3493b.u(parcel, 6, this.f1880G, false);
        C3493b.q(parcel, 7, this.f1881H, false);
        C3493b.o(parcel, 8, this.f1882I, false);
        C3493b.b(parcel, iA);
    }
}
