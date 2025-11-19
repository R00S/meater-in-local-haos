package q6;

import H6.k;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: DiskCacheWriteLocker.java */
/* loaded from: classes2.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, a> f48081a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final b f48082b = new b();

    /* compiled from: DiskCacheWriteLocker.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final Lock f48083a = new ReentrantLock();

        /* renamed from: b, reason: collision with root package name */
        int f48084b;

        a() {
        }
    }

    /* compiled from: DiskCacheWriteLocker.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Queue<a> f48085a = new ArrayDeque();

        b() {
        }

        a a() {
            a aVarPoll;
            synchronized (this.f48085a) {
                aVarPoll = this.f48085a.poll();
            }
            return aVarPoll == null ? new a() : aVarPoll;
        }

        void b(a aVar) {
            synchronized (this.f48085a) {
                try {
                    if (this.f48085a.size() < 10) {
                        this.f48085a.offer(aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    c() {
    }

    void a(String str) {
        a aVarA;
        synchronized (this) {
            try {
                aVarA = this.f48081a.get(str);
                if (aVarA == null) {
                    aVarA = this.f48082b.a();
                    this.f48081a.put(str, aVarA);
                }
                aVarA.f48084b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        aVarA.f48083a.lock();
    }

    void b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) k.d(this.f48081a.get(str));
                int i10 = aVar.f48084b;
                if (i10 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f48084b);
                }
                int i11 = i10 - 1;
                aVar.f48084b = i11;
                if (i11 == 0) {
                    a aVarRemove = this.f48081a.remove(str);
                    if (!aVarRemove.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVarRemove + ", safeKey: " + str);
                    }
                    this.f48082b.b(aVarRemove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.f48083a.unlock();
    }
}
