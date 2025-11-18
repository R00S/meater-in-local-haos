package c7;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: c7.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2323A implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
        String strF = null;
        IBinder iBinderS = null;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(iR)) {
                case 1:
                    strF = SafeParcelReader.f(parcel, iR);
                    break;
                case 2:
                    zM = SafeParcelReader.m(parcel, iR);
                    break;
                case 3:
                    zM2 = SafeParcelReader.m(parcel, iR);
                    break;
                case 4:
                    iBinderS = SafeParcelReader.s(parcel, iR);
                    break;
                case 5:
                    zM3 = SafeParcelReader.m(parcel, iR);
                    break;
                case 6:
                    zM4 = SafeParcelReader.m(parcel, iR);
                    break;
                default:
                    SafeParcelReader.x(parcel, iR);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new z(strF, zM, zM2, iBinderS, zM3, zM4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new z[i10];
    }
}
