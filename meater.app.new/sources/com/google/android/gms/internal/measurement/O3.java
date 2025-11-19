package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.N3;
import com.google.android.gms.internal.measurement.O3;
import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
public abstract class O3<MessageType extends O3<MessageType, BuilderType>, BuilderType extends N3<MessageType, BuilderType>> implements InterfaceC2517k5 {
    protected int zza = 0;

    protected static <T> void j(Iterable<T> iterable, List<? super T> list) {
        N3.m(iterable, list);
    }

    int e(C5 c52) {
        int iL = l();
        if (iL != -1) {
            return iL;
        }
        int iB = c52.b(this);
        k(iB);
        return iB;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2517k5
    public final Y3 h() {
        try {
            C2468e4 c2468e4B = Y3.B(d());
            i(c2468e4B.b());
            return c2468e4B.a();
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }

    void k(int i10) {
        throw new UnsupportedOperationException();
    }

    int l() {
        throw new UnsupportedOperationException();
    }

    public final byte[] m() {
        try {
            byte[] bArr = new byte[d()];
            zzjn zzjnVarH = zzjn.H(bArr);
            i(zzjnVarH);
            zzjnVarH.I();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
        }
    }
}
