package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzard
/* loaded from: classes2.dex */
public final class zzwo {

    /* renamed from: a */
    @VisibleForTesting
    zzfx f27286a;

    /* renamed from: b */
    @VisibleForTesting
    boolean f27287b;

    public zzwo(Context context, String str, String str2) {
        zzacu.m16423a(context);
        try {
            this.f27286a = (zzfx) zzbae.m17356a(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", g50.f18948a);
            ObjectWrapper.m14708E0(context);
            this.f27286a.mo19954N3(ObjectWrapper.m14708E0(context), str, null);
            this.f27287b = true;
        } catch (RemoteException | zzbag | NullPointerException unused) {
            zzbad.m17349e("Cannot dynamite load clearcut");
        }
    }

    /* renamed from: a */
    public final zzws m20700a(byte[] bArr) {
        return new zzws(this, bArr);
    }

    public zzwo(Context context) {
        zzacu.m16423a(context);
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21704S3)).booleanValue()) {
            try {
                this.f27286a = (zzfx) zzbae.m17356a(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", h50.f19058a);
                ObjectWrapper.m14708E0(context);
                this.f27286a.mo19955R0(ObjectWrapper.m14708E0(context), "GMA_SDK");
                this.f27287b = true;
            } catch (RemoteException | zzbag | NullPointerException unused) {
                zzbad.m17349e("Cannot dynamite load clearcut");
            }
        }
    }

    public zzwo() {
    }
}
