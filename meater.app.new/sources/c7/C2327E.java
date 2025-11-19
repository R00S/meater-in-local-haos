package c7;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: c7.E, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2327E implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        boolean zM = false;
        String strF = null;
        IBinder iBinderS = null;
        boolean zM2 = false;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            int iL = SafeParcelReader.l(iR);
            if (iL == 1) {
                strF = SafeParcelReader.f(parcel, iR);
            } else if (iL == 2) {
                iBinderS = SafeParcelReader.s(parcel, iR);
            } else if (iL == 3) {
                zM = SafeParcelReader.m(parcel, iR);
            } else if (iL != 4) {
                SafeParcelReader.x(parcel, iR);
            } else {
                zM2 = SafeParcelReader.m(parcel, iR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new C2326D(strF, iBinderS, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2326D[i10];
    }
}
