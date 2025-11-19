package b2;

import androidx.media3.datasource.cache.Cache;
import java.util.Comparator;
import java.util.TreeSet;

/* compiled from: LeastRecentlyUsedCacheEvictor.java */
/* loaded from: classes.dex */
public final class i implements androidx.media3.datasource.cache.b {

    /* renamed from: a, reason: collision with root package name */
    private final long f30111a;

    /* renamed from: b, reason: collision with root package name */
    private final TreeSet<c> f30112b = new TreeSet<>(new Comparator() { // from class: b2.h
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return i.h((c) obj, (c) obj2);
        }
    });

    /* renamed from: c, reason: collision with root package name */
    private long f30113c;

    public i(long j10) {
        this.f30111a = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(c cVar, c cVar2) {
        long j10 = cVar.f30095G;
        long j11 = cVar2.f30095G;
        return j10 - j11 == 0 ? cVar.compareTo(cVar2) : j10 < j11 ? -1 : 1;
    }

    private void i(Cache cache, long j10) {
        while (this.f30113c + j10 > this.f30111a && !this.f30112b.isEmpty()) {
            cache.i(this.f30112b.first());
        }
    }

    @Override // androidx.media3.datasource.cache.Cache.a
    public void a(Cache cache, c cVar, c cVar2) {
        f(cache, cVar);
        e(cache, cVar2);
    }

    @Override // androidx.media3.datasource.cache.b
    public void b(Cache cache, String str, long j10, long j11) {
        if (j11 != -1) {
            i(cache, j11);
        }
    }

    @Override // androidx.media3.datasource.cache.b
    public boolean d() {
        return true;
    }

    @Override // androidx.media3.datasource.cache.Cache.a
    public void e(Cache cache, c cVar) {
        this.f30112b.add(cVar);
        this.f30113c += cVar.f30092D;
        i(cache, 0L);
    }

    @Override // androidx.media3.datasource.cache.Cache.a
    public void f(Cache cache, c cVar) {
        this.f30112b.remove(cVar);
        this.f30113c -= cVar.f30092D;
    }

    @Override // androidx.media3.datasource.cache.b
    public void c() {
    }
}
