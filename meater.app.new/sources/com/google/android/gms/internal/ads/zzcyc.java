package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class zzcyc {
    /* renamed from: a */
    static final /* synthetic */ void m19071a(InputStream inputStream, ParcelFileDescriptor parcelFileDescriptor) {
        try {
            try {
                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
                try {
                    IOUtils.m14631b(inputStream, autoCloseOutputStream);
                    autoCloseOutputStream.close();
                    if (inputStream != null) {
                        m19072b(null, inputStream);
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: b */
    private static /* synthetic */ void m19072b(Throwable th, InputStream inputStream) throws IOException {
        if (th == null) {
            inputStream.close();
            return;
        }
        try {
            inputStream.close();
        } catch (Throwable th2) {
            zzdmb.m19580b(th, th2);
        }
    }

    /* renamed from: c */
    public static ParcelFileDescriptor m19073c(final InputStream inputStream) throws IOException {
        ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
        final ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptorArrCreatePipe[1];
        zzaxg.f22651a.execute(new Runnable(inputStream, parcelFileDescriptor2) { // from class: com.google.android.gms.internal.ads.zp

            /* renamed from: f */
            private final InputStream f21472f;

            /* renamed from: g */
            private final ParcelFileDescriptor f21473g;

            {
                this.f21472f = inputStream;
                this.f21473g = parcelFileDescriptor2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzcyc.m19071a(this.f21472f, this.f21473g);
            }
        });
        return parcelFileDescriptor;
    }
}
