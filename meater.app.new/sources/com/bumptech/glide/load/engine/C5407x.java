package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: ResourceRecycler.java */
/* renamed from: com.bumptech.glide.load.engine.x */
/* loaded from: classes.dex */
class C5407x {

    /* renamed from: a */
    private boolean f13501a;

    /* renamed from: b */
    private final Handler f13502b = new Handler(Looper.getMainLooper(), new a());

    /* compiled from: ResourceRecycler.java */
    /* renamed from: com.bumptech.glide.load.engine.x$a */
    private static final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((InterfaceC5404u) message.obj).mo10340c();
            return true;
        }
    }

    C5407x() {
    }

    /* renamed from: a */
    synchronized void m10360a(InterfaceC5404u<?> interfaceC5404u) {
        if (this.f13501a) {
            this.f13502b.obtainMessage(1, interfaceC5404u).sendToTarget();
        } else {
            this.f13501a = true;
            interfaceC5404u.mo10340c();
            this.f13501a = false;
        }
    }
}
