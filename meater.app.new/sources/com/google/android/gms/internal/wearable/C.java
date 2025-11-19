package com.google.android.gms.internal.wearable;

import com.google.android.gms.internal.wearable.A;
import com.google.android.gms.internal.wearable.C;
import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public abstract class C<MessageType extends C<MessageType, BuilderType>, BuilderType extends A<MessageType, BuilderType>> implements N0 {
    protected int zza = 0;

    protected static void e(Iterable iterable, List list) {
        A.g(iterable, list);
    }

    int a(Z0 z02) {
        throw null;
    }

    @Override // com.google.android.gms.internal.wearable.N0
    public final P d() {
        try {
            int iB = b();
            P p10 = P.f34503C;
            byte[] bArr = new byte[iB];
            U u10 = new U(bArr, 0, iB);
            c(u10);
            u10.b();
            return new N(bArr);
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }

    public final byte[] f() {
        try {
            int iB = b();
            byte[] bArr = new byte[iB];
            U u10 = new U(bArr, 0, iB);
            c(u10);
            u10.b();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
        }
    }
}
