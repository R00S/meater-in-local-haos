package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.io.IOException;

@SuppressLint({"HandlerLeak"})
/* loaded from: classes2.dex */
final class l00 extends Handler implements Runnable {

    /* renamed from: f */
    private final zzkc f19730f;

    /* renamed from: g */
    private final zzka f19731g;

    /* renamed from: h */
    private final int f19732h;

    /* renamed from: i */
    private volatile Thread f19733i;

    /* renamed from: j */
    private final /* synthetic */ zzjz f19734j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l00(zzjz zzjzVar, Looper looper, zzkc zzkcVar, zzka zzkaVar, int i2) {
        super(looper);
        this.f19734j = zzjzVar;
        this.f19730f = zzkcVar;
        this.f19731g = zzkaVar;
        this.f19732h = 0;
    }

    /* renamed from: a */
    public final void m15502a() {
        this.f19730f.mo15787b();
        if (this.f19733i != null) {
            this.f19733i.interrupt();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 2) {
            throw ((Error) message.obj);
        }
        zzjz.m20115e(this.f19734j, false);
        zzjz.m20114c(this.f19734j, null);
        if (this.f19730f.mo15786a()) {
            this.f19731g.mo20092h(this.f19730f);
            return;
        }
        int i2 = message.what;
        if (i2 == 0) {
            this.f19731g.mo20090a(this.f19730f);
        } else {
            if (i2 != 1) {
                return;
            }
            this.f19731g.mo20091b(this.f19730f, (IOException) message.obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        try {
            this.f19733i = Thread.currentThread();
            int i2 = this.f19732h;
            if (i2 > 0) {
                Thread.sleep(i2);
            }
            if (!this.f19730f.mo15786a()) {
                this.f19730f.mo15788c();
            }
            sendEmptyMessage(0);
        } catch (IOException e2) {
            obtainMessage(1, e2).sendToTarget();
        } catch (Error e3) {
            Log.e("LoadTask", "Unexpected error loading stream", e3);
            obtainMessage(2, e3).sendToTarget();
            throw e3;
        } catch (InterruptedException unused) {
            zzkh.m20129d(this.f19730f.mo15786a());
            sendEmptyMessage(0);
        } catch (Exception e4) {
            Log.e("LoadTask", "Unexpected exception loading stream", e4);
            obtainMessage(1, new zzkd(e4)).sendToTarget();
        }
    }
}
