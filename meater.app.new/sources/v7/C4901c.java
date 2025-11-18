package v7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: v7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4901c extends AbstractC3492a {
    public static final Parcelable.Creator<C4901c> CREATOR = new C4900b();

    /* renamed from: B, reason: collision with root package name */
    public final Bundle f51546B;

    public C4901c(Bundle bundle) {
        this.f51546B = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.e(parcel, 1, this.f51546B, false);
        C3493b.b(parcel, iA);
    }
}
