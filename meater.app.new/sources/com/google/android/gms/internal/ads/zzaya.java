package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

@zzard
/* loaded from: classes2.dex */
public final class zzaya {

    /* renamed from: a */
    private boolean f22664a = false;

    /* renamed from: b */
    private float f22665b = 1.0f;

    /* renamed from: c */
    public static float m17212c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return streamVolume / streamMaxVolume;
    }

    /* renamed from: f */
    private final synchronized boolean m17213f() {
        return this.f22665b >= 0.0f;
    }

    /* renamed from: a */
    public final synchronized void m17214a(boolean z) {
        this.f22664a = z;
    }

    /* renamed from: b */
    public final synchronized void m17215b(float f2) {
        this.f22665b = f2;
    }

    /* renamed from: d */
    public final synchronized float m17216d() {
        if (!m17213f()) {
            return 1.0f;
        }
        return this.f22665b;
    }

    /* renamed from: e */
    public final synchronized boolean m17217e() {
        return this.f22664a;
    }
}
