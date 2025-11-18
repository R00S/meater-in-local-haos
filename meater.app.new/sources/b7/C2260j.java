package b7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* renamed from: b7.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2260j implements Parcelable.Creator {
    C2260j() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C2262l(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2262l[i10];
    }
}
