package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okhttp3.HttpUrl;

@VisibleForTesting
/* loaded from: classes2.dex */
final class t40 {

    /* renamed from: a */
    @VisibleForTesting
    private ByteArrayOutputStream f20556a = new ByteArrayOutputStream(RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT);

    /* renamed from: b */
    @VisibleForTesting
    private Base64OutputStream f20557b = new Base64OutputStream(this.f20556a, 10);

    /* renamed from: a */
    public final void m15902a(byte[] bArr) throws IOException {
        this.f20557b.write(bArr);
    }

    public final String toString() throws IOException {
        try {
            this.f20557b.close();
        } catch (IOException e2) {
            zzbad.m17347c("HashManager: Unable to convert to Base64.", e2);
        }
        try {
            this.f20556a.close();
            return this.f20556a.toString();
        } catch (IOException e3) {
            zzbad.m17347c("HashManager: Unable to convert to Base64.", e3);
            return HttpUrl.FRAGMENT_ENCODE_SET;
        } finally {
            this.f20556a = null;
            this.f20557b = null;
        }
    }
}
