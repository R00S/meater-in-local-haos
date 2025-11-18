package com.bumptech.glide.p141p;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.EnumC5365a;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.p141p.p142l.InterfaceC5576h;
import com.bumptech.glide.p141p.p142l.InterfaceC5577i;
import com.bumptech.glide.p141p.p143m.InterfaceC5582d;
import com.bumptech.glide.p145r.C5597k;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: RequestFutureTarget.java */
/* renamed from: com.bumptech.glide.p.f */
/* loaded from: classes.dex */
public class C5563f<R> implements InterfaceFutureC5560c<R>, InterfaceC5564g<R> {

    /* renamed from: f */
    private static final a f13938f = new a();

    /* renamed from: g */
    private final int f13939g;

    /* renamed from: h */
    private final int f13940h;

    /* renamed from: i */
    private final boolean f13941i;

    /* renamed from: j */
    private final a f13942j;

    /* renamed from: k */
    private R f13943k;

    /* renamed from: l */
    private InterfaceC5561d f13944l;

    /* renamed from: m */
    private boolean f13945m;

    /* renamed from: n */
    private boolean f13946n;

    /* renamed from: o */
    private boolean f13947o;

    /* renamed from: p */
    private GlideException f13948p;

    /* compiled from: RequestFutureTarget.java */
    /* renamed from: com.bumptech.glide.p.f$a */
    static class a {
        a() {
        }

        /* renamed from: a */
        void m10941a(Object obj) {
            obj.notifyAll();
        }

        /* renamed from: b */
        void m10942b(Object obj, long j2) throws InterruptedException {
            obj.wait(j2);
        }
    }

    public C5563f(int i2, int i3) {
        this(i2, i3, true, f13938f);
    }

    /* renamed from: a */
    private synchronized R m10940a(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f13941i && !isDone()) {
            C5597k.m11044a();
        }
        if (this.f13945m) {
            throw new CancellationException();
        }
        if (this.f13947o) {
            throw new ExecutionException(this.f13948p);
        }
        if (this.f13946n) {
            return this.f13943k;
        }
        if (l == null) {
            this.f13942j.m10942b(this, 0L);
        } else if (l.longValue() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = l.longValue() + jCurrentTimeMillis;
            while (!isDone() && jCurrentTimeMillis < jLongValue) {
                this.f13942j.m10942b(this, jLongValue - jCurrentTimeMillis);
                jCurrentTimeMillis = System.currentTimeMillis();
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.f13947o) {
            throw new ExecutionException(this.f13948p);
        }
        if (this.f13945m) {
            throw new CancellationException();
        }
        if (!this.f13946n) {
            throw new TimeoutException();
        }
        return this.f13943k;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean cancel(boolean z) {
        InterfaceC5561d interfaceC5561d;
        if (isDone()) {
            return false;
        }
        this.f13945m = true;
        this.f13942j.m10941a(this);
        if (z && (interfaceC5561d = this.f13944l) != null) {
            interfaceC5561d.clear();
            this.f13944l = null;
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public R get() throws ExecutionException, InterruptedException {
        try {
            return m10940a(null);
        } catch (TimeoutException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5577i
    public synchronized InterfaceC5561d getRequest() {
        return this.f13944l;
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5577i
    public void getSize(InterfaceC5576h interfaceC5576h) {
        interfaceC5576h.mo10970g(this.f13939g, this.f13940h);
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f13945m;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean isDone() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f13945m     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L10
            boolean r0 = r1.f13946n     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L10
            boolean r0 = r1.f13947o     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto Le
            goto L10
        Le:
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            monitor-exit(r1)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p141p.C5563f.isDone():boolean");
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5540i
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5577i
    public void onLoadCleared(Drawable drawable) {
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5577i
    public synchronized void onLoadFailed(Drawable drawable) {
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5577i
    public void onLoadStarted(Drawable drawable) {
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5577i
    public synchronized void onResourceReady(R r, InterfaceC5582d<? super R> interfaceC5582d) {
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5540i
    public void onStart() {
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5540i
    public void onStop() {
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5577i
    public void removeCallback(InterfaceC5576h interfaceC5576h) {
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5577i
    public synchronized void setRequest(InterfaceC5561d interfaceC5561d) {
        this.f13944l = interfaceC5561d;
    }

    C5563f(int i2, int i3, boolean z, a aVar) {
        this.f13939g = i2;
        this.f13940h = i3;
        this.f13941i = z;
        this.f13942j = aVar;
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5564g
    public synchronized boolean onLoadFailed(GlideException glideException, Object obj, InterfaceC5577i<R> interfaceC5577i, boolean z) {
        this.f13947o = true;
        this.f13948p = glideException;
        this.f13942j.m10941a(this);
        return false;
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5564g
    public synchronized boolean onResourceReady(R r, Object obj, InterfaceC5577i<R> interfaceC5577i, EnumC5365a enumC5365a, boolean z) {
        this.f13946n = true;
        this.f13943k = r;
        this.f13942j.m10941a(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public R get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return m10940a(Long.valueOf(timeUnit.toMillis(j2)));
    }
}
