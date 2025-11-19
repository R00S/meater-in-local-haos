package B7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class R1 extends AbstractC3492a {
    public static final Parcelable.Creator<R1> CREATOR = new S1();

    /* renamed from: B, reason: collision with root package name */
    public final String f1780B;

    /* renamed from: C, reason: collision with root package name */
    public final String f1781C;

    /* renamed from: D, reason: collision with root package name */
    public final N1 f1782D;

    /* renamed from: E, reason: collision with root package name */
    public final String f1783E;

    /* renamed from: F, reason: collision with root package name */
    public final String f1784F;

    /* renamed from: G, reason: collision with root package name */
    public final Float f1785G;

    /* renamed from: H, reason: collision with root package name */
    public final V1 f1786H;

    public R1(String str, String str2, N1 n12, String str3, String str4, Float f10, V1 v12) {
        this.f1780B = str;
        this.f1781C = str2;
        this.f1782D = n12;
        this.f1783E = str3;
        this.f1784F = str4;
        this.f1785G = f10;
        this.f1786H = v12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && R1.class == obj.getClass()) {
            R1 r12 = (R1) obj;
            if (Objects.equals(this.f1780B, r12.f1780B) && Objects.equals(this.f1781C, r12.f1781C) && Objects.equals(this.f1782D, r12.f1782D) && Objects.equals(this.f1783E, r12.f1783E) && Objects.equals(this.f1784F, r12.f1784F) && Objects.equals(this.f1785G, r12.f1785G) && Objects.equals(this.f1786H, r12.f1786H)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1780B, this.f1781C, this.f1782D, this.f1783E, this.f1784F, this.f1785G, this.f1786H);
    }

    public final String toString() {
        N1 n12 = this.f1782D;
        return "AppParcelable{title='" + this.f1781C + "', developerName='" + this.f1783E + "', formattedPrice='" + this.f1784F + "', starRating=" + this.f1785G + ", wearDetails=" + String.valueOf(this.f1786H) + ", deepLinkUri='" + this.f1780B + "', icon=" + String.valueOf(n12) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f1780B;
        int iA = C3493b.a(parcel);
        C3493b.q(parcel, 1, str, false);
        C3493b.q(parcel, 2, this.f1781C, false);
        C3493b.p(parcel, 3, this.f1782D, i10, false);
        C3493b.q(parcel, 4, this.f1783E, false);
        C3493b.q(parcel, 5, this.f1784F, false);
        C3493b.i(parcel, 6, this.f1785G, false);
        C3493b.p(parcel, 7, this.f1786H, i10, false);
        C3493b.b(parcel, iA);
    }
}
