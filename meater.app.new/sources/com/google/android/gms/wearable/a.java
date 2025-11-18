package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        byte[] bArrB = null;
        String strF = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        Uri uri = null;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            int iL = SafeParcelReader.l(iR);
            if (iL == 2) {
                bArrB = SafeParcelReader.b(parcel, iR);
            } else if (iL == 3) {
                strF = SafeParcelReader.f(parcel, iR);
            } else if (iL == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.e(parcel, iR, ParcelFileDescriptor.CREATOR);
            } else if (iL != 5) {
                SafeParcelReader.x(parcel, iR);
            } else {
                uri = (Uri) SafeParcelReader.e(parcel, iR, Uri.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new Asset(bArrB, strF, parcelFileDescriptor, uri);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Asset[i10];
    }
}
