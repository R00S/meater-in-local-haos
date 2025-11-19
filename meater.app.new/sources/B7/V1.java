package B7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class V1 extends AbstractC3492a {
    public static final Parcelable.Creator<V1> CREATOR = new W1();

    /* renamed from: B, reason: collision with root package name */
    public final boolean f1797B;

    /* renamed from: C, reason: collision with root package name */
    public final List f1798C;

    public V1(boolean z10, List list) {
        this.f1797B = z10;
        this.f1798C = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && V1.class == obj.getClass()) {
            V1 v12 = (V1) obj;
            if (this.f1797B == v12.f1797B && Objects.equals(this.f1798C, v12.f1798C)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f1797B), this.f1798C);
    }

    public final String toString() {
        return "AppWearDetailsParcelable{isWatchface=" + this.f1797B + ", watchfaceCategories=" + String.valueOf(this.f1798C) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.f1797B;
        int iA = C3493b.a(parcel);
        C3493b.c(parcel, 1, z10);
        C3493b.s(parcel, 2, this.f1798C, false);
        C3493b.b(parcel, iA);
    }
}
