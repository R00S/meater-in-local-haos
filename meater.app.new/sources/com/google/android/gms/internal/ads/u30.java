package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* loaded from: classes2.dex */
final class u30 implements Handler.Callback, Choreographer.FrameCallback {

    /* renamed from: f */
    private static final u30 f20608f = new u30();

    /* renamed from: g */
    public volatile long f20609g;

    /* renamed from: h */
    private final Handler f20610h;

    /* renamed from: i */
    private final HandlerThread f20611i;

    /* renamed from: j */
    private Choreographer f20612j;

    /* renamed from: k */
    private int f20613k;

    private u30() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        this.f20611i = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f20610h = handler;
        handler.sendEmptyMessage(0);
    }

    /* renamed from: a */
    public static u30 m15918a() {
        return f20608f;
    }

    /* renamed from: b */
    public final void m15919b() {
        this.f20610h.sendEmptyMessage(1);
    }

    /* renamed from: c */
    public final void m15920c() {
        this.f20610h.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        this.f20609g = j2;
        this.f20612j.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            this.f20612j = Choreographer.getInstance();
            return true;
        }
        if (i2 == 1) {
            int i3 = this.f20613k + 1;
            this.f20613k = i3;
            if (i3 == 1) {
                this.f20612j.postFrameCallback(this);
            }
            return true;
        }
        if (i2 != 2) {
            return false;
        }
        int i4 = this.f20613k - 1;
        this.f20613k = i4;
        if (i4 == 0) {
            this.f20612j.removeFrameCallback(this);
            this.f20609g = 0L;
        }
        return true;
    }
}
