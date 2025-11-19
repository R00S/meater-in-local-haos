package B7;

import A7.InterfaceC0862p;
import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.g1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0906g1 extends AbstractC3492a implements InterfaceC0862p {
    public static final Parcelable.Creator<C0906g1> CREATOR = new C0909h1();

    /* renamed from: B, reason: collision with root package name */
    private final String f1831B;

    /* renamed from: C, reason: collision with root package name */
    private final String f1832C;

    /* renamed from: D, reason: collision with root package name */
    private final int f1833D;

    /* renamed from: E, reason: collision with root package name */
    private final boolean f1834E;

    public C0906g1(String str, String str2, int i10, boolean z10) {
        this.f1831B = str;
        this.f1832C = str2;
        this.f1833D = i10;
        this.f1834E = z10;
    }

    @Override // A7.InterfaceC0862p
    public final boolean K() {
        return this.f1834E;
    }

    @Override // A7.InterfaceC0862p
    public final String c() {
        return this.f1831B;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0906g1) {
            return ((C0906g1) obj).f1831B.equals(this.f1831B);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1831B.hashCode();
    }

    public final String toString() {
        return "Node{" + this.f1832C + ", id=" + this.f1831B + ", hops=" + this.f1833D + ", isNearby=" + this.f1834E + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f1831B;
        int iA = C3493b.a(parcel);
        C3493b.q(parcel, 2, str, false);
        C3493b.q(parcel, 3, this.f1832C, false);
        C3493b.k(parcel, 4, this.f1833D);
        C3493b.c(parcel, 5, this.f1834E);
        C3493b.b(parcel, iA);
    }
}
