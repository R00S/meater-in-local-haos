package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import o6.InterfaceC4139c;

/* compiled from: ResourceRecycler.java */
/* loaded from: classes2.dex */
class u {

    /* renamed from: a, reason: collision with root package name */
    private boolean f33277a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f33278b = new Handler(Looper.getMainLooper(), new a());

    /* compiled from: ResourceRecycler.java */
    private static final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((InterfaceC4139c) message.obj).c();
            return true;
        }
    }

    u() {
    }

    synchronized void a(InterfaceC4139c<?> interfaceC4139c, boolean z10) {
        try {
            if (this.f33277a || z10) {
                this.f33278b.obtainMessage(1, interfaceC4139c).sendToTarget();
            } else {
                this.f33277a = true;
                interfaceC4139c.c();
                this.f33277a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
