package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        long jM14429G = 0;
        long jM14429G2 = 0;
        long jM14429G3 = 0;
        String strM14452p = null;
        ArrayList<String> arrayListM14454r = null;
        String strM14452p2 = null;
        String strM14452p3 = null;
        String strM14452p4 = null;
        String strM14452p5 = null;
        int iM14427E = 0;
        int iM14427E2 = 0;
        int iM14427E3 = 0;
        int iM14427E4 = 0;
        float fM14423A = 0.0f;
        boolean zM14459w = false;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(iM14425C)) {
                case 1:
                    iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 2:
                    jM14429G = SafeParcelReader.m14429G(parcel, iM14425C);
                    break;
                case 3:
                case 7:
                case 9:
                default:
                    SafeParcelReader.m14433K(parcel, iM14425C);
                    break;
                case 4:
                    strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 5:
                    iM14427E3 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 6:
                    arrayListM14454r = SafeParcelReader.m14454r(parcel, iM14425C);
                    break;
                case 8:
                    jM14429G2 = SafeParcelReader.m14429G(parcel, iM14425C);
                    break;
                case 10:
                    strM14452p3 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 11:
                    iM14427E2 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 12:
                    strM14452p2 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 13:
                    strM14452p4 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 14:
                    iM14427E4 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 15:
                    fM14423A = SafeParcelReader.m14423A(parcel, iM14425C);
                    break;
                case 16:
                    jM14429G3 = SafeParcelReader.m14429G(parcel, iM14425C);
                    break;
                case 17:
                    strM14452p5 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 18:
                    zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new WakeLockEvent(iM14427E, jM14429G, iM14427E2, strM14452p, iM14427E3, arrayListM14454r, strM14452p2, jM14429G2, iM14427E4, strM14452p3, strM14452p4, fM14423A, jM14429G3, strM14452p5, zM14459w);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new WakeLockEvent[i2];
    }
}
