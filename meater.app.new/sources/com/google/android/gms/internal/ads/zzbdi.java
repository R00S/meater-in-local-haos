package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;

@zzard
@TargetApi(14)
/* loaded from: classes2.dex */
public final class zzbdi implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    private final AudioManager f22867a;

    /* renamed from: b */
    private final InterfaceC6701g8 f22868b;

    /* renamed from: c */
    private boolean f22869c;

    /* renamed from: d */
    private boolean f22870d;

    /* renamed from: e */
    private boolean f22871e;

    /* renamed from: f */
    private float f22872f = 1.0f;

    public zzbdi(Context context, InterfaceC6701g8 interfaceC6701g8) {
        this.f22867a = (AudioManager) context.getSystemService("audio");
        this.f22868b = interfaceC6701g8;
    }

    /* renamed from: f */
    private final void m17489f() {
        boolean z;
        boolean z2;
        boolean z3 = this.f22870d && !this.f22871e && this.f22872f > 0.0f;
        if (z3 && !(z2 = this.f22869c)) {
            AudioManager audioManager = this.f22867a;
            if (audioManager != null && !z2) {
                this.f22869c = audioManager.requestAudioFocus(this, 3, 2) == 1;
            }
            this.f22868b.mo15161b();
            return;
        }
        if (z3 || !(z = this.f22869c)) {
            return;
        }
        AudioManager audioManager2 = this.f22867a;
        if (audioManager2 != null && z) {
            this.f22869c = audioManager2.abandonAudioFocus(this) == 0;
        }
        this.f22868b.mo15161b();
    }

    /* renamed from: a */
    public final float m17490a() {
        float f2 = this.f22871e ? 0.0f : this.f22872f;
        if (this.f22869c) {
            return f2;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final void m17491b(boolean z) {
        this.f22871e = z;
        m17489f();
    }

    /* renamed from: c */
    public final void m17492c(float f2) {
        this.f22872f = f2;
        m17489f();
    }

    /* renamed from: d */
    public final void m17493d() {
        this.f22870d = true;
        m17489f();
    }

    /* renamed from: e */
    public final void m17494e() {
        this.f22870d = false;
        m17489f();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i2) {
        this.f22869c = i2 > 0;
        this.f22868b.mo15161b();
    }
}
