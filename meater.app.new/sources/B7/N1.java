package B7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;
import java.util.Locale;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class N1 extends AbstractC3492a {
    public static final Parcelable.Creator<N1> CREATOR = new O0();

    /* renamed from: B, reason: collision with root package name */
    public final String f1759B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1760C;

    /* renamed from: D, reason: collision with root package name */
    public final int f1761D;

    public N1(String str, int i10, int i11) {
        this.f1759B = str;
        this.f1760C = i10;
        this.f1761D = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && N1.class == obj.getClass()) {
            N1 n12 = (N1) obj;
            if (this.f1760C == n12.f1760C && this.f1761D == n12.f1761D && Objects.equals(this.f1759B, n12.f1759B)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1759B, Integer.valueOf(this.f1760C), Integer.valueOf(this.f1761D));
    }

    public final String toString() {
        return String.format(Locale.US, "WebIconParcelable{%dx%d - %s}", Integer.valueOf(this.f1760C), Integer.valueOf(this.f1761D), this.f1759B);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f1759B;
        int iA = C3493b.a(parcel);
        C3493b.q(parcel, 1, str, false);
        C3493b.k(parcel, 2, this.f1760C);
        C3493b.k(parcel, 3, this.f1761D);
        C3493b.b(parcel, iA);
    }
}
