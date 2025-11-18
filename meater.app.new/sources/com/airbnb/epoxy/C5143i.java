package com.airbnb.epoxy;

import android.util.Log;

/* compiled from: DebugTimer.java */
/* renamed from: com.airbnb.epoxy.i */
/* loaded from: classes.dex */
class C5143i implements InterfaceC5148k0 {

    /* renamed from: a */
    private final String f12237a;

    /* renamed from: b */
    private long f12238b;

    /* renamed from: c */
    private String f12239c;

    C5143i(String str) {
        this.f12237a = str;
        m9297b();
    }

    /* renamed from: b */
    private void m9297b() {
        this.f12238b = -1L;
        this.f12239c = null;
    }

    @Override // com.airbnb.epoxy.InterfaceC5148k0
    /* renamed from: a */
    public void mo9284a(String str) {
        if (this.f12238b != -1) {
            throw new IllegalStateException("Timer was already started");
        }
        this.f12238b = System.nanoTime();
        this.f12239c = str;
    }

    @Override // com.airbnb.epoxy.InterfaceC5148k0
    public void stop() {
        if (this.f12238b == -1) {
            throw new IllegalStateException("Timer was not started");
        }
        String str = this.f12237a;
        Log.d(str, String.format(this.f12239c + ": %.3fms", Float.valueOf((System.nanoTime() - this.f12238b) / 1000000.0f)));
        m9297b();
    }
}
