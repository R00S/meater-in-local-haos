package B7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class J extends AbstractC3492a {
    public static final Parcelable.Creator<J> CREATOR = new K();

    /* renamed from: B, reason: collision with root package name */
    private final byte[] f1733B;

    public J(byte[] bArr) {
        this.f1733B = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] bArr = this.f1733B;
        int iA = C3493b.a(parcel);
        C3493b.g(parcel, 1, (byte[]) bArr.clone(), false);
        C3493b.b(parcel, iA);
    }
}
