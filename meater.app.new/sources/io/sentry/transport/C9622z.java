package io.sentry.transport;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/* compiled from: ReusableCountLatch.java */
/* renamed from: io.sentry.transport.z */
/* loaded from: classes2.dex */
public final class C9622z {

    /* renamed from: a */
    private final a f36911a;

    /* compiled from: ReusableCountLatch.java */
    /* renamed from: io.sentry.transport.z$a */
    private static final class a extends AbstractQueuedSynchronizer {
        a(int i2) {
            setState(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public void m31725d() {
            releaseShared(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public int m31726e() {
            return getState();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m31727f() {
            int state;
            do {
                state = getState();
            } while (!compareAndSetState(state, state + 1));
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public int tryAcquireShared(int i2) {
            return getState() == 0 ? 1 : -1;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public boolean tryReleaseShared(int i2) {
            int state;
            int i3;
            do {
                state = getState();
                if (state == 0) {
                    return false;
                }
                i3 = state - 1;
            } while (!compareAndSetState(state, i3));
            return i3 == 0;
        }
    }

    public C9622z(int i2) {
        if (i2 >= 0) {
            this.f36911a = new a(i2);
            return;
        }
        throw new IllegalArgumentException("negative initial count '" + i2 + "' is not allowed");
    }

    /* renamed from: a */
    public void m31718a() {
        this.f36911a.m31725d();
    }

    /* renamed from: b */
    public int m31719b() {
        return this.f36911a.m31726e();
    }

    /* renamed from: c */
    public void m31720c() {
        this.f36911a.m31727f();
    }

    /* renamed from: d */
    public boolean m31721d(long j2, TimeUnit timeUnit) throws InterruptedException {
        return this.f36911a.tryAcquireSharedNanos(1, timeUnit.toNanos(j2));
    }

    public C9622z() {
        this(0);
    }
}
