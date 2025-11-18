package g7;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c7.C2333b;
import g7.InterfaceC3439j;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public final class O extends AbstractC3492a {
    public static final Parcelable.Creator<O> CREATOR = new P();

    /* renamed from: B, reason: collision with root package name */
    final int f41960B;

    /* renamed from: C, reason: collision with root package name */
    final IBinder f41961C;

    /* renamed from: D, reason: collision with root package name */
    private final C2333b f41962D;

    /* renamed from: E, reason: collision with root package name */
    private final boolean f41963E;

    /* renamed from: F, reason: collision with root package name */
    private final boolean f41964F;

    O(int i10, IBinder iBinder, C2333b c2333b, boolean z10, boolean z11) {
        this.f41960B = i10;
        this.f41961C = iBinder;
        this.f41962D = c2333b;
        this.f41963E = z10;
        this.f41964F = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        return this.f41962D.equals(o10.f41962D) && C3443n.a(h0(), o10.h0());
    }

    public final C2333b f0() {
        return this.f41962D;
    }

    public final InterfaceC3439j h0() {
        IBinder iBinder = this.f41961C;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC3439j.a.g(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 1, this.f41960B);
        C3493b.j(parcel, 2, this.f41961C, false);
        C3493b.p(parcel, 3, this.f41962D, i10, false);
        C3493b.c(parcel, 4, this.f41963E);
        C3493b.c(parcel, 5, this.f41964F);
        C3493b.b(parcel, iA);
    }
}
