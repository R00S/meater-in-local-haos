package com.bumptech.glide.load.engine.p123a0;

import com.bumptech.glide.p145r.C5596j;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: DiskCacheWriteLocker.java */
/* renamed from: com.bumptech.glide.load.engine.a0.c */
/* loaded from: classes.dex */
final class C5374c {

    /* renamed from: a */
    private final Map<String, a> f13253a = new HashMap();

    /* renamed from: b */
    private final b f13254b = new b();

    /* compiled from: DiskCacheWriteLocker.java */
    /* renamed from: com.bumptech.glide.load.engine.a0.c$a */
    private static class a {

        /* renamed from: a */
        final Lock f13255a = new ReentrantLock();

        /* renamed from: b */
        int f13256b;

        a() {
        }
    }

    /* compiled from: DiskCacheWriteLocker.java */
    /* renamed from: com.bumptech.glide.load.engine.a0.c$b */
    private static class b {

        /* renamed from: a */
        private final Queue<a> f13257a = new ArrayDeque();

        b() {
        }

        /* renamed from: a */
        a m10185a() {
            a aVarPoll;
            synchronized (this.f13257a) {
                aVarPoll = this.f13257a.poll();
            }
            return aVarPoll == null ? new a() : aVarPoll;
        }

        /* renamed from: b */
        void m10186b(a aVar) {
            synchronized (this.f13257a) {
                if (this.f13257a.size() < 10) {
                    this.f13257a.offer(aVar);
                }
            }
        }
    }

    C5374c() {
    }

    /* renamed from: a */
    void m10183a(String str) {
        a aVarM10185a;
        synchronized (this) {
            aVarM10185a = this.f13253a.get(str);
            if (aVarM10185a == null) {
                aVarM10185a = this.f13254b.m10185a();
                this.f13253a.put(str, aVarM10185a);
            }
            aVarM10185a.f13256b++;
        }
        aVarM10185a.f13255a.lock();
    }

    /* renamed from: b */
    void m10184b(String str) {
        a aVar;
        synchronized (this) {
            aVar = (a) C5596j.m11042d(this.f13253a.get(str));
            int i2 = aVar.f13256b;
            if (i2 < 1) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f13256b);
            }
            int i3 = i2 - 1;
            aVar.f13256b = i3;
            if (i3 == 0) {
                a aVarRemove = this.f13253a.remove(str);
                if (!aVarRemove.equals(aVar)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVarRemove + ", safeKey: " + str);
                }
                this.f13254b.m10186b(aVarRemove);
            }
        }
        aVar.f13255a.unlock();
    }
}
