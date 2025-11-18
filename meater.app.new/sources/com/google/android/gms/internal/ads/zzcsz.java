package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzcsz implements zzcva<zzcsy> {

    /* renamed from: a */
    private final zzbbl f25044a;

    /* renamed from: b */
    private final zzcxv f25045b;

    public zzcsz(zzbbl zzbblVar, zzcxv zzcxvVar) {
        this.f25044a = zzbblVar;
        this.f25045b = zzcxvVar;
    }

    /* renamed from: c */
    private static int m18970c(zzzy zzzyVar) {
        long value;
        if (zzzyVar != null) {
            try {
                value = zzzyVar.getValue();
            } catch (RemoteException unused) {
                zzbad.m17353i("Cannot get correlation id, default to 0.");
            }
        } else {
            value = 0;
        }
        return (int) value;
    }

    /* renamed from: a */
    final /* synthetic */ zzcsy m18971a() throws Exception {
        return new zzcsy(m18970c(this.f25045b.f25290a), this.f25045b.f25293d);
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<zzcsy> mo14982b() {
        return this.f25044a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.go

            /* renamed from: f */
            private final zzcsz f18987f;

            {
                this.f18987f = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f18987f.m18971a();
            }
        });
    }
}
