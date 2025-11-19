package c7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: c7.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2344m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        PendingIntent pendingIntent = null;
        int iT = 0;
        int iT2 = 0;
        String strF = null;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            int iL = SafeParcelReader.l(iR);
            if (iL == 1) {
                iT = SafeParcelReader.t(parcel, iR);
            } else if (iL == 2) {
                iT2 = SafeParcelReader.t(parcel, iR);
            } else if (iL == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.e(parcel, iR, PendingIntent.CREATOR);
            } else if (iL != 4) {
                SafeParcelReader.x(parcel, iR);
            } else {
                strF = SafeParcelReader.f(parcel, iR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new C2333b(iT, iT2, pendingIntent, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2333b[i10];
    }
}
