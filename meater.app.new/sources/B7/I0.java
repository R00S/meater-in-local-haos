package B7;

import android.os.Parcel;
import com.apptionlabs.meater_app.data.Config;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public abstract class I0 extends com.google.android.gms.internal.wearable.B implements J0 {
    public I0() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks");
    }

    @Override // com.google.android.gms.internal.wearable.B
    protected final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 2:
                C0905g0 c0905g0 = (C0905g0) com.google.android.gms.internal.wearable.Z.a(parcel, C0905g0.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                l(c0905g0);
                break;
            case 3:
                C0930o1 c0930o1 = (C0930o1) com.google.android.gms.internal.wearable.Z.a(parcel, C0930o1.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                B(c0930o1);
                break;
            case 4:
                C0923m0 c0923m0 = (C0923m0) com.google.android.gms.internal.wearable.Z.a(parcel, C0923m0.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                J(c0923m0);
                break;
            case 5:
                DataHolder dataHolder = (DataHolder) com.google.android.gms.internal.wearable.Z.a(parcel, DataHolder.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                N(dataHolder);
                break;
            case 6:
                H h10 = (H) com.google.android.gms.internal.wearable.Z.a(parcel, H.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                i1(h10);
                break;
            case 7:
                C0953w1 c0953w1 = (C0953w1) com.google.android.gms.internal.wearable.Z.a(parcel, C0953w1.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                R0(c0953w1);
                break;
            case 8:
                C0946u0 c0946u0 = (C0946u0) com.google.android.gms.internal.wearable.Z.a(parcel, C0946u0.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                a0(c0946u0);
                break;
            case 9:
                C0955x0 c0955x0 = (C0955x0) com.google.android.gms.internal.wearable.Z.a(parcel, C0955x0.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                K0(c0955x0);
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                C0917k0 c0917k0 = (C0917k0) com.google.android.gms.internal.wearable.Z.a(parcel, C0917k0.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                W(c0917k0);
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                Status status = (Status) com.google.android.gms.internal.wearable.Z.a(parcel, Status.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                v0(status);
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                A1 a12 = (A1) com.google.android.gms.internal.wearable.Z.a(parcel, A1.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                f0(a12);
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                C0911i0 c0911i0 = (C0911i0) com.google.android.gms.internal.wearable.Z.a(parcel, C0911i0.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                c1(c0911i0);
                break;
            case 14:
                C0912i1 c0912i1 = (C0912i1) com.google.android.gms.internal.wearable.Z.a(parcel, C0912i1.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                W0(c0912i1);
                break;
            case 15:
                r rVar = (r) com.google.android.gms.internal.wearable.Z.a(parcel, r.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                X0(rVar);
                break;
            case 16:
                r rVar2 = (r) com.google.android.gms.internal.wearable.Z.a(parcel, r.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                t1(rVar2);
                break;
            case 17:
                U u10 = (U) com.google.android.gms.internal.wearable.Z.a(parcel, U.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                k1(u10);
                break;
            case 18:
                W w10 = (W) com.google.android.gms.internal.wearable.Z.a(parcel, W.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                T0(w10);
                break;
            case 19:
                C0922m c0922m = (C0922m) com.google.android.gms.internal.wearable.Z.a(parcel, C0922m.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                I0(c0922m);
                break;
            case 20:
                C0928o c0928o = (C0928o) com.google.android.gms.internal.wearable.Z.a(parcel, C0928o.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                o(c0928o);
                break;
            case 21:
            case 24:
            case 25:
            case 31:
            case 32:
            case 33:
            case 44:
            case 45:
            default:
                return false;
            case 22:
                S s10 = (S) com.google.android.gms.internal.wearable.Z.a(parcel, S.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                t(s10);
                break;
            case 23:
                L l10 = (L) com.google.android.gms.internal.wearable.Z.a(parcel, L.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                w(l10);
                break;
            case 26:
                C0894c1 c0894c1 = (C0894c1) com.google.android.gms.internal.wearable.Z.a(parcel, C0894c1.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                b1(c0894c1);
                break;
            case 27:
                C0936q1 c0936q1 = (C0936q1) com.google.android.gms.internal.wearable.Z.a(parcel, C0936q1.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                X(c0936q1);
                break;
            case 28:
                Z z10 = (Z) com.google.android.gms.internal.wearable.Z.a(parcel, Z.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                S(z10);
                break;
            case 29:
                C0896d0 c0896d0 = (C0896d0) com.google.android.gms.internal.wearable.Z.a(parcel, C0896d0.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                D0(c0896d0);
                break;
            case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
                C0890b0 c0890b0 = (C0890b0) com.google.android.gms.internal.wearable.Z.a(parcel, C0890b0.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                K(c0890b0);
                break;
            case 34:
                C0947u1 c0947u1 = (C0947u1) com.google.android.gms.internal.wearable.Z.a(parcel, C0947u1.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                H0(c0947u1);
                break;
            case 35:
                C0929o0 c0929o0 = (C0929o0) com.google.android.gms.internal.wearable.Z.a(parcel, C0929o0.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                G0(c0929o0);
                break;
            case 36:
                C0924m1 c0924m1 = (C0924m1) com.google.android.gms.internal.wearable.Z.a(parcel, C0924m1.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                P(c0924m1);
                break;
            case 37:
                C0899e0 c0899e0 = (C0899e0) com.google.android.gms.internal.wearable.Z.a(parcel, C0899e0.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                Z(c0899e0);
                break;
            case 38:
                C0948v c0948v = (C0948v) com.google.android.gms.internal.wearable.Z.a(parcel, C0948v.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                u(c0948v);
                break;
            case 39:
                C0961z0 c0961z0 = (C0961z0) com.google.android.gms.internal.wearable.Z.a(parcel, C0961z0.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                s(c0961z0);
                break;
            case 40:
                T1 t12 = (T1) com.google.android.gms.internal.wearable.Z.a(parcel, T1.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                o1(t12);
                break;
            case 41:
                N n10 = (N) com.google.android.gms.internal.wearable.Z.a(parcel, N.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                S0(n10);
                break;
            case 42:
                P p10 = (P) com.google.android.gms.internal.wearable.Z.a(parcel, P.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                L0(p10);
                break;
            case 43:
                D0 d02 = (D0) com.google.android.gms.internal.wearable.Z.a(parcel, D0.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                b0(d02);
                break;
            case 46:
                Y1 y12 = (Y1) com.google.android.gms.internal.wearable.Z.a(parcel, Y1.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                z(y12);
                break;
            case 47:
                B0 b02 = (B0) com.google.android.gms.internal.wearable.Z.a(parcel, B0.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                j1(b02);
                break;
            case 48:
                C0940s0 c0940s0 = (C0940s0) com.google.android.gms.internal.wearable.Z.a(parcel, C0940s0.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                h1(c0940s0);
                break;
            case 49:
                F0 f02 = (F0) com.google.android.gms.internal.wearable.Z.a(parcel, F0.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                A(f02);
                break;
            case 50:
                C0935q0 c0935q0 = (C0935q0) com.google.android.gms.internal.wearable.Z.a(parcel, C0935q0.CREATOR);
                com.google.android.gms.internal.wearable.Z.b(parcel);
                q0(c0935q0);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
