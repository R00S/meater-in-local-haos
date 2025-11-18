package kotlinx.coroutines.internal;

import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import okhttp3.HttpUrl;

/* compiled from: ExceptionsConstructor.kt */
@Metadata(m32266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\tj\u0002`\n2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\u0005\u001a(\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\tj\u0002`\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m32267d2 = {"Lkotlinx/coroutines/internal/WeakMapCtorCache;", "Lkotlinx/coroutines/internal/CtorCache;", "()V", "cacheLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "exceptionCtors", "Ljava/util/WeakHashMap;", "Ljava/lang/Class;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "get", RoomNotification.KEY, "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.internal.m0, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
final class WeakMapCtorCache extends CtorCache {

    /* renamed from: a */
    public static final WeakMapCtorCache f41805a = new WeakMapCtorCache();

    /* renamed from: b */
    private static final ReentrantReadWriteLock f41806b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private static final WeakHashMap<Class<? extends Throwable>, Function1<Throwable, Throwable>> f41807c = new WeakHashMap<>();

    private WeakMapCtorCache() {
    }

    @Override // kotlinx.coroutines.internal.CtorCache
    /* renamed from: a */
    public Function1<Throwable, Throwable> mo39452a(Class<? extends Throwable> cls) {
        ReentrantReadWriteLock reentrantReadWriteLock = f41806b;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            Function1<Throwable, Throwable> function1 = f41807c.get(cls);
            if (function1 != null) {
                return function1;
            }
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i2 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i3 = 0; i3 < readHoldCount; i3++) {
                lock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap<Class<? extends Throwable>, Function1<Throwable, Throwable>> weakHashMap = f41807c;
                Function1<Throwable, Throwable> function12 = weakHashMap.get(cls);
                if (function12 != null) {
                    return function12;
                }
                Function1<Throwable, Throwable> function1M39497b = C10987j.m39497b(cls);
                weakHashMap.put(cls, function1M39497b);
                while (i2 < readHoldCount) {
                    lock2.lock();
                    i2++;
                }
                writeLock.unlock();
                return function1M39497b;
            } finally {
                while (i2 < readHoldCount) {
                    lock2.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        } finally {
            lock.unlock();
        }
    }
}
