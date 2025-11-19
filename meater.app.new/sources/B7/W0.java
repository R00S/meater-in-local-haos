package B7;

import A7.InterfaceC0861o;
import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class W0 extends AbstractC3492a implements InterfaceC0861o {
    public static final Parcelable.Creator<W0> CREATOR = new X0();

    /* renamed from: B, reason: collision with root package name */
    private final int f1801B;

    /* renamed from: C, reason: collision with root package name */
    private final String f1802C;

    /* renamed from: D, reason: collision with root package name */
    private final byte[] f1803D;

    /* renamed from: E, reason: collision with root package name */
    private final String f1804E;

    public W0(int i10, String str, byte[] bArr, String str2) {
        this.f1801B = i10;
        this.f1802C = str;
        this.f1803D = bArr;
        this.f1804E = str2;
    }

    @Override // A7.InterfaceC0861o
    public final byte[] f() {
        return this.f1803D;
    }

    public final String f0() {
        return this.f1804E;
    }

    @Override // A7.InterfaceC0861o
    public final String h() {
        return this.f1802C;
    }

    public final String toString() {
        byte[] bArr = this.f1803D;
        Object objValueOf = bArr == null ? "null" : Integer.valueOf(bArr.length);
        String str = this.f1802C;
        return "MessageEventParcelable[" + this.f1801B + "," + str + ", size=" + objValueOf.toString() + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 2, this.f1801B);
        C3493b.q(parcel, 3, this.f1802C, false);
        C3493b.g(parcel, 4, this.f1803D, false);
        C3493b.q(parcel, 5, this.f1804E, false);
        C3493b.b(parcel, iA);
    }
}
