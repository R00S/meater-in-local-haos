package c7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: c7.B, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2324B extends AbstractC3492a {
    public static final Parcelable.Creator<C2324B> CREATOR = new C2325C();

    /* renamed from: B, reason: collision with root package name */
    private final boolean f31051B;

    /* renamed from: C, reason: collision with root package name */
    private final String f31052C;

    /* renamed from: D, reason: collision with root package name */
    private final int f31053D;

    /* renamed from: E, reason: collision with root package name */
    private final int f31054E;

    C2324B(boolean z10, String str, int i10, int i11) {
        this.f31051B = z10;
        this.f31052C = str;
        this.f31053D = C2331I.a(i10) - 1;
        this.f31054E = o.a(i11) - 1;
    }

    public final String f0() {
        return this.f31052C;
    }

    public final boolean h0() {
        return this.f31051B;
    }

    public final int r0() {
        return o.a(this.f31054E);
    }

    public final int v0() {
        return C2331I.a(this.f31053D);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.c(parcel, 1, this.f31051B);
        C3493b.q(parcel, 2, this.f31052C, false);
        C3493b.k(parcel, 3, this.f31053D);
        C3493b.k(parcel, 4, this.f31054E);
        C3493b.b(parcel, iA);
    }
}
