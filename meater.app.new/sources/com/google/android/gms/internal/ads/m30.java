package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.zzsh;
import java.io.IOException;

@SuppressLint({"HandlerLeak"})
/* loaded from: classes2.dex */
final class m30<T extends zzsh> extends Handler implements Runnable {

    /* renamed from: f */
    private final T f19862f;

    /* renamed from: g */
    private final zzsf<T> f19863g;

    /* renamed from: h */
    public final int f19864h;

    /* renamed from: i */
    private final long f19865i;

    /* renamed from: j */
    private IOException f19866j;

    /* renamed from: k */
    private int f19867k;

    /* renamed from: l */
    private volatile Thread f19868l;

    /* renamed from: m */
    private volatile boolean f19869m;

    /* renamed from: n */
    private final /* synthetic */ zzse f19870n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m30(zzse zzseVar, Looper looper, T t, zzsf<T> zzsfVar, int i2, long j2) {
        super(looper);
        this.f19870n = zzseVar;
        this.f19862f = t;
        this.f19863g = zzsfVar;
        this.f19864h = i2;
        this.f19865i = j2;
    }

    /* renamed from: a */
    private final void m15525a() {
        this.f19866j = null;
        this.f19870n.f26986a.execute(this.f19870n.f26987b);
    }

    /* renamed from: b */
    private final void m15526b() {
        this.f19870n.f26987b = null;
    }

    /* renamed from: c */
    public final void m15527c(int i2) throws IOException {
        IOException iOException = this.f19866j;
        if (iOException != null && this.f19867k > i2) {
            throw iOException;
        }
    }

    /* renamed from: d */
    public final void m15528d(long j2) {
        zzsk.m20481e(this.f19870n.f26987b == null);
        this.f19870n.f26987b = this;
        if (j2 > 0) {
            sendEmptyMessageDelayed(0, j2);
        } else {
            m15525a();
        }
    }

    /* renamed from: e */
    public final void m15529e(boolean z) {
        this.f19869m = z;
        this.f19866j = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            this.f19862f.mo14960b();
            if (this.f19868l != null) {
                this.f19868l.interrupt();
            }
        }
        if (z) {
            m15526b();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f19863g.mo16028n(this.f19862f, jElapsedRealtime, jElapsedRealtime - this.f19865i, true);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f19869m) {
            return;
        }
        int i2 = message.what;
        if (i2 == 0) {
            m15525a();
            return;
        }
        if (i2 == 4) {
            throw ((Error) message.obj);
        }
        m15526b();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = jElapsedRealtime - this.f19865i;
        if (this.f19862f.mo14959a()) {
            this.f19863g.mo16028n(this.f19862f, jElapsedRealtime, j2, false);
            return;
        }
        int i3 = message.what;
        if (i3 == 1) {
            this.f19863g.mo16028n(this.f19862f, jElapsedRealtime, j2, false);
            return;
        }
        if (i3 == 2) {
            this.f19863g.mo16025g(this.f19862f, jElapsedRealtime, j2);
            return;
        }
        if (i3 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f19866j = iOException;
        int iMo16027m = this.f19863g.mo16027m(this.f19862f, jElapsedRealtime, j2, iOException);
        if (iMo16027m == 3) {
            this.f19870n.f26988c = this.f19866j;
        } else if (iMo16027m != 2) {
            this.f19867k = iMo16027m == 1 ? 1 : this.f19867k + 1;
            m15528d(Math.min((r12 - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f19868l = Thread.currentThread();
            if (!this.f19862f.mo14959a()) {
                String simpleName = this.f19862f.getClass().getSimpleName();
                zzsx.m20535a(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                try {
                    this.f19862f.mo14961c();
                    zzsx.m20536b();
                } catch (Throwable th) {
                    zzsx.m20536b();
                    throw th;
                }
            }
            if (this.f19869m) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e2) {
            if (this.f19869m) {
                return;
            }
            obtainMessage(3, e2).sendToTarget();
        } catch (InterruptedException unused) {
            zzsk.m20481e(this.f19862f.mo14959a());
            if (this.f19869m) {
                return;
            }
            sendEmptyMessage(2);
        } catch (Exception e3) {
            Log.e("LoadTask", "Unexpected exception loading stream", e3);
            if (this.f19869m) {
                return;
            }
            obtainMessage(3, new zzsi(e3)).sendToTarget();
        } catch (OutOfMemoryError e4) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e4);
            if (this.f19869m) {
                return;
            }
            obtainMessage(3, new zzsi(e4)).sendToTarget();
        } catch (Error e5) {
            Log.e("LoadTask", "Unexpected error loading stream", e5);
            if (!this.f19869m) {
                obtainMessage(4, e5).sendToTarget();
            }
            throw e5;
        }
    }
}
