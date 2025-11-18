package c7;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import g7.v0;
import h7.AbstractC3492a;
import h7.C3493b;
import m7.InterfaceC3977a;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: c7.D, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2326D extends AbstractC3492a {
    public static final Parcelable.Creator<C2326D> CREATOR = new C2327E();

    /* renamed from: B, reason: collision with root package name */
    private final String f31055B;

    /* renamed from: C, reason: collision with root package name */
    private final u f31056C;

    /* renamed from: D, reason: collision with root package name */
    private final boolean f31057D;

    /* renamed from: E, reason: collision with root package name */
    private final boolean f31058E;

    C2326D(String str, u uVar, boolean z10, boolean z11) {
        this.f31055B = str;
        this.f31056C = uVar;
        this.f31057D = z10;
        this.f31058E = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f31055B;
        int iA = C3493b.a(parcel);
        C3493b.q(parcel, 1, str, false);
        u uVar = this.f31056C;
        if (uVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            uVar = null;
        }
        C3493b.j(parcel, 2, uVar, false);
        C3493b.c(parcel, 3, this.f31057D);
        C3493b.c(parcel, 4, this.f31058E);
        C3493b.b(parcel, iA);
    }

    C2326D(String str, IBinder iBinder, boolean z10, boolean z11) {
        this.f31055B = str;
        v vVar = null;
        if (iBinder != null) {
            try {
                InterfaceC3977a interfaceC3977aF = v0.g(iBinder).f();
                byte[] bArr = interfaceC3977aF == null ? null : (byte[]) m7.b.k(interfaceC3977aF);
                if (bArr != null) {
                    vVar = new v(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f31056C = vVar;
        this.f31057D = z10;
        this.f31058E = z11;
    }
}
