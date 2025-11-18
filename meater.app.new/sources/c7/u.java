package c7;

import android.os.RemoteException;
import android.util.Log;
import g7.C3445p;
import g7.S;
import g7.v0;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import m7.InterfaceC3977a;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
abstract class u extends v0 {

    /* renamed from: B, reason: collision with root package name */
    private final int f31102B;

    protected u(byte[] bArr) {
        C3445p.a(bArr.length == 25);
        this.f31102B = Arrays.hashCode(bArr);
    }

    protected static byte[] k(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // g7.S
    public final int d() {
        return this.f31102B;
    }

    public final boolean equals(Object obj) {
        InterfaceC3977a interfaceC3977aF;
        if (obj != null && (obj instanceof S)) {
            try {
                S s10 = (S) obj;
                if (s10.d() == this.f31102B && (interfaceC3977aF = s10.f()) != null) {
                    return Arrays.equals(u1(), (byte[]) m7.b.k(interfaceC3977aF));
                }
                return false;
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    @Override // g7.S
    public final InterfaceC3977a f() {
        return m7.b.u1(u1());
    }

    public final int hashCode() {
        return this.f31102B;
    }

    abstract byte[] u1();
}
