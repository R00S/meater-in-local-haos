package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzcsd implements zzcva<zzcsc> {

    /* renamed from: a */
    private final zzbbl f25014a;

    /* renamed from: b */
    private final Context f25015b;

    public zzcsd(zzbbl zzbblVar, Context context) {
        this.f25014a = zzbblVar;
        this.f25015b = context;
    }

    /* renamed from: a */
    final /* synthetic */ zzcsc m18964a() throws Exception {
        AudioManager audioManager = (AudioManager) this.f25015b.getSystemService("audio");
        return new zzcsc(audioManager.getMode(), audioManager.isMusicActive(), audioManager.isSpeakerphoneOn(), audioManager.getStreamVolume(3), audioManager.getRingerMode(), audioManager.getStreamVolume(2), zzk.zzll().m17216d(), zzk.zzll().m17217e());
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<zzcsc> mo14982b() {
        return this.f25014a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.yn

            /* renamed from: f */
            private final zzcsd f21314f;

            {
                this.f21314f = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f21314f.m18964a();
            }
        });
    }
}
