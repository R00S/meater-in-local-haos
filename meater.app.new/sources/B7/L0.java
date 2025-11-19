package B7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public abstract class L0 extends com.google.android.gms.internal.wearable.B implements M0 {
    public L0() {
        super("com.google.android.gms.wearable.internal.IWearableListener");
    }

    @Override // com.google.android.gms.internal.wearable.B
    protected final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        H0 h02;
        switch (i10) {
            case 1:
                DataHolder dataHolder = (DataHolder) com.google.android.gms.internal.wearable.Z.a(parcel, DataHolder.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                Q0(dataHolder);
                return true;
            case 2:
                W0 w02 = (W0) com.google.android.gms.internal.wearable.Z.a(parcel, W0.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                d0(w02);
                return true;
            case 3:
                C0906g1 c0906g1 = (C0906g1) com.google.android.gms.internal.wearable.Z.a(parcel, C0906g1.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                o0(c0906g1);
                return true;
            case 4:
                C0906g1 c0906g12 = (C0906g1) com.google.android.gms.internal.wearable.Z.a(parcel, C0906g1.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                v(c0906g12);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(C0906g1.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                m1(arrayListCreateTypedArrayList);
                return true;
            case 6:
                P1 p12 = (P1) com.google.android.gms.internal.wearable.Z.a(parcel, P1.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                P0(p12);
                return true;
            case 7:
                C0910i c0910i = (C0910i) com.google.android.gms.internal.wearable.Z.a(parcel, C0910i.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                q1(c0910i);
                return true;
            case 8:
                C0892c c0892c = (C0892c) com.google.android.gms.internal.wearable.Z.a(parcel, C0892c.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                n0(c0892c);
                return true;
            case 9:
                H1 h12 = (H1) com.google.android.gms.internal.wearable.Z.a(parcel, H1.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                H(h12);
                return true;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            default:
                return false;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                W0 w03 = (W0) com.google.android.gms.internal.wearable.Z.a(parcel, W0.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    h02 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
                    h02 = iInterfaceQueryLocalInterface instanceof H0 ? (H0) iInterfaceQueryLocalInterface : new H0(strongBinder);
                }
                com.google.android.gms.internal.wearable.Z.b(parcel);
                e0(w03, h02);
                return true;
            case 14:
                com.google.android.gms.internal.wearable.Z.b(parcel);
                return true;
            case 15:
                com.google.android.gms.internal.wearable.Z.b(parcel);
                return true;
            case 16:
                C0903f1 c0903f1 = (C0903f1) com.google.android.gms.internal.wearable.Z.a(parcel, C0903f1.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                z0(c0903f1);
                return true;
            case 17:
                com.google.android.gms.internal.wearable.Z.b(parcel);
                return true;
        }
    }
}
