package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes2.dex */
public interface zzrv {
    /* renamed from: I0 */
    Uri mo15548I0();

    /* renamed from: a */
    long mo15549a(zzry zzryVar) throws IOException;

    void close() throws IOException;

    int read(byte[] bArr, int i2, int i3) throws IOException;
}
