package v7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.apptionlabs.meater_app.data.Config;
import com.google.android.gms.internal.measurement.BinderC2437b0;
import com.google.android.gms.internal.measurement.C2428a0;
import com.google.android.gms.measurement.internal.C2735e;
import com.google.android.gms.measurement.internal.C2749g;
import com.google.android.gms.measurement.internal.C2797m5;
import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.P5;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: v7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4905g extends BinderC2437b0 implements InterfaceC4906h {
    public AbstractBinderC4905g() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.BinderC2437b0
    protected final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC4911m c4912n = null;
        InterfaceC4907i c4908j = null;
        switch (i10) {
            case 1:
                com.google.android.gms.measurement.internal.J j10 = (com.google.android.gms.measurement.internal.J) C2428a0.a(parcel, com.google.android.gms.measurement.internal.J.CREATOR);
                E5 e52 = (E5) C2428a0.a(parcel, E5.CREATOR);
                C2428a0.f(parcel);
                x0(j10, e52);
                parcel2.writeNoException();
                return true;
            case 2:
                P5 p52 = (P5) C2428a0.a(parcel, P5.CREATOR);
                E5 e53 = (E5) C2428a0.a(parcel, E5.CREATOR);
                C2428a0.f(parcel);
                e1(p52, e53);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                E5 e54 = (E5) C2428a0.a(parcel, E5.CREATOR);
                C2428a0.f(parcel);
                G(e54);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.measurement.internal.J j11 = (com.google.android.gms.measurement.internal.J) C2428a0.a(parcel, com.google.android.gms.measurement.internal.J.CREATOR);
                String string = parcel.readString();
                String string2 = parcel.readString();
                C2428a0.f(parcel);
                p0(j11, string, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                E5 e55 = (E5) C2428a0.a(parcel, E5.CREATOR);
                C2428a0.f(parcel);
                F0(e55);
                parcel2.writeNoException();
                return true;
            case 7:
                E5 e56 = (E5) C2428a0.a(parcel, E5.CREATOR);
                boolean zH = C2428a0.h(parcel);
                C2428a0.f(parcel);
                List<P5> listV = V(e56, zH);
                parcel2.writeNoException();
                parcel2.writeTypedList(listV);
                return true;
            case 9:
                com.google.android.gms.measurement.internal.J j12 = (com.google.android.gms.measurement.internal.J) C2428a0.a(parcel, com.google.android.gms.measurement.internal.J.CREATOR);
                String string3 = parcel.readString();
                C2428a0.f(parcel);
                byte[] bArrW0 = w0(j12, string3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrW0);
                return true;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                long j13 = parcel.readLong();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                C2428a0.f(parcel);
                g0(j13, string4, string5, string6);
                parcel2.writeNoException();
                return true;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                E5 e57 = (E5) C2428a0.a(parcel, E5.CREATOR);
                C2428a0.f(parcel);
                String strJ0 = j0(e57);
                parcel2.writeNoException();
                parcel2.writeString(strJ0);
                return true;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                C2749g c2749g = (C2749g) C2428a0.a(parcel, C2749g.CREATOR);
                E5 e58 = (E5) C2428a0.a(parcel, E5.CREATOR);
                C2428a0.f(parcel);
                g1(c2749g, e58);
                parcel2.writeNoException();
                return true;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                C2749g c2749g2 = (C2749g) C2428a0.a(parcel, C2749g.CREATOR);
                C2428a0.f(parcel);
                T(c2749g2);
                parcel2.writeNoException();
                return true;
            case 14:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zH2 = C2428a0.h(parcel);
                E5 e59 = (E5) C2428a0.a(parcel, E5.CREATOR);
                C2428a0.f(parcel);
                List<P5> listY0 = Y0(string7, string8, zH2, e59);
                parcel2.writeNoException();
                parcel2.writeTypedList(listY0);
                return true;
            case 15:
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                boolean zH3 = C2428a0.h(parcel);
                C2428a0.f(parcel);
                List<P5> listC = C(string9, string10, string11, zH3);
                parcel2.writeNoException();
                parcel2.writeTypedList(listC);
                return true;
            case 16:
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                E5 e510 = (E5) C2428a0.a(parcel, E5.CREATOR);
                C2428a0.f(parcel);
                List<C2749g> listY = y(string12, string13, e510);
                parcel2.writeNoException();
                parcel2.writeTypedList(listY);
                return true;
            case 17:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                C2428a0.f(parcel);
                List<C2749g> listK0 = k0(string14, string15, string16);
                parcel2.writeNoException();
                parcel2.writeTypedList(listK0);
                return true;
            case 18:
                E5 e511 = (E5) C2428a0.a(parcel, E5.CREATOR);
                C2428a0.f(parcel);
                I(e511);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) C2428a0.a(parcel, Bundle.CREATOR);
                E5 e512 = (E5) C2428a0.a(parcel, E5.CREATOR);
                C2428a0.f(parcel);
                n(bundle, e512);
                parcel2.writeNoException();
                return true;
            case 20:
                E5 e513 = (E5) C2428a0.a(parcel, E5.CREATOR);
                C2428a0.f(parcel);
                U0(e513);
                parcel2.writeNoException();
                return true;
            case 21:
                E5 e514 = (E5) C2428a0.a(parcel, E5.CREATOR);
                C2428a0.f(parcel);
                C4901c c4901cR = R(e514);
                parcel2.writeNoException();
                C2428a0.g(parcel2, c4901cR);
                return true;
            case 24:
                E5 e515 = (E5) C2428a0.a(parcel, E5.CREATOR);
                Bundle bundle2 = (Bundle) C2428a0.a(parcel, Bundle.CREATOR);
                C2428a0.f(parcel);
                List<C2797m5> listI0 = i0(e515, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(listI0);
                return true;
            case 25:
                E5 e516 = (E5) C2428a0.a(parcel, E5.CREATOR);
                C2428a0.f(parcel);
                O0(e516);
                parcel2.writeNoException();
                return true;
            case 26:
                E5 e517 = (E5) C2428a0.a(parcel, E5.CREATOR);
                C2428a0.f(parcel);
                l1(e517);
                parcel2.writeNoException();
                return true;
            case 27:
                E5 e518 = (E5) C2428a0.a(parcel, E5.CREATOR);
                C2428a0.f(parcel);
                r(e518);
                parcel2.writeNoException();
                return true;
            case 29:
                E5 e519 = (E5) C2428a0.a(parcel, E5.CREATOR);
                k0 k0Var = (k0) C2428a0.a(parcel, k0.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    c4912n = iInterfaceQueryLocalInterface instanceof InterfaceC4911m ? (InterfaceC4911m) iInterfaceQueryLocalInterface : new C4912n(strongBinder);
                }
                C2428a0.f(parcel);
                x(e519, k0Var, c4912n);
                parcel2.writeNoException();
                return true;
            case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
                E5 e520 = (E5) C2428a0.a(parcel, E5.CREATOR);
                C2735e c2735e = (C2735e) C2428a0.a(parcel, C2735e.CREATOR);
                C2428a0.f(parcel);
                a1(e520, c2735e);
                parcel2.writeNoException();
                return true;
            case 31:
                E5 e521 = (E5) C2428a0.a(parcel, E5.CREATOR);
                Bundle bundle3 = (Bundle) C2428a0.a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    c4908j = iInterfaceQueryLocalInterface2 instanceof InterfaceC4907i ? (InterfaceC4907i) iInterfaceQueryLocalInterface2 : new C4908j(strongBinder2);
                }
                C2428a0.f(parcel);
                J0(e521, bundle3, c4908j);
                parcel2.writeNoException();
                return true;
        }
    }
}
