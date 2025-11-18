package com.flurry.sdk;

import java.util.TimerTask;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* renamed from: com.flurry.sdk.g4 */
/* loaded from: classes2.dex */
public abstract class AbstractC6052g4 {

    /* renamed from: f */
    static Runnable f15914f = new a();

    /* renamed from: g */
    protected final String f15915g;

    /* renamed from: h */
    protected final AbstractC6052g4 f15916h;

    /* renamed from: i */
    protected final boolean f15917i;

    /* renamed from: j */
    protected final boolean f15918j;

    /* renamed from: com.flurry.sdk.g4$a */
    static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* renamed from: com.flurry.sdk.g4$b */
    public class b extends FutureTask<Void> {

        /* renamed from: f */
        public final AbstractC6052g4 f15919f;

        /* renamed from: g */
        private TimerTask f15920g;

        /* renamed from: h */
        private final int f15921h;

        /* renamed from: i */
        private final int f15922i;

        /* renamed from: j */
        private final int f15923j;

        /* renamed from: k */
        private int f15924k;

        b(AbstractC6052g4 abstractC6052g4, Runnable runnable) {
            super(runnable, null);
            this.f15921h = 0;
            this.f15922i = 1;
            this.f15923j = 2;
            this.f15919f = abstractC6052g4;
            if (runnable == AbstractC6052g4.f15914f) {
                this.f15924k = 0;
            } else {
                this.f15924k = 1;
            }
        }

        /* renamed from: a */
        public final synchronized boolean m13081a() {
            return this.f15924k == 0;
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
        public synchronized boolean cancel(boolean z) {
            super.cancel(z);
            TimerTask timerTask = this.f15920g;
            if (timerTask != null) {
                timerTask.cancel();
            }
            return true;
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
        public synchronized void run() {
            if (this.f15924k != 1) {
                super.run();
                return;
            }
            this.f15924k = 2;
            if (!this.f15919f.mo13009p(this)) {
                this.f15919f.m13080o(this);
            }
            this.f15924k = 1;
        }
    }

    AbstractC6052g4(String str, AbstractC6052g4 abstractC6052g4, boolean z) {
        this(str, abstractC6052g4, z, abstractC6052g4 == null ? false : abstractC6052g4.f15918j);
    }

    /* renamed from: k */
    protected abstract void mo13006k(Runnable runnable);

    /* renamed from: l */
    protected void mo13079l(Runnable runnable) {
    }

    /* renamed from: m */
    protected abstract Future<Void> mo13007m(Runnable runnable);

    /* renamed from: n */
    protected abstract void mo13008n(Runnable runnable) throws CancellationException;

    /* renamed from: o */
    protected final boolean m13080o(Runnable runnable) {
        for (AbstractC6052g4 abstractC6052g4 = this.f15916h; abstractC6052g4 != null; abstractC6052g4 = abstractC6052g4.f15916h) {
            if (abstractC6052g4.mo13009p(runnable)) {
                return true;
            }
        }
        runnable.run();
        return true;
    }

    /* renamed from: p */
    protected abstract boolean mo13009p(Runnable runnable);

    private AbstractC6052g4(String str, AbstractC6052g4 abstractC6052g4, boolean z, boolean z2) {
        this.f15915g = str;
        this.f15916h = abstractC6052g4;
        this.f15917i = z;
        this.f15918j = z2;
    }
}
