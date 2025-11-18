package x7;

import android.os.Parcel;
import android.os.Parcelable;
import g7.M;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: x7.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5072j extends AbstractC3492a {
    public static final Parcelable.Creator<C5072j> CREATOR = new C5073k();

    /* renamed from: B, reason: collision with root package name */
    final int f52888B;

    /* renamed from: C, reason: collision with root package name */
    final M f52889C;

    C5072j(int i10, M m10) {
        this.f52888B = i10;
        this.f52889C = m10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 1, this.f52888B);
        C3493b.p(parcel, 2, this.f52889C, i10, false);
        C3493b.b(parcel, iA);
    }
}
