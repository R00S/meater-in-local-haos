package M6;

import java.util.Set;

/* compiled from: TransportFactoryImpl.java */
/* loaded from: classes2.dex */
final class q implements K6.j {

    /* renamed from: a, reason: collision with root package name */
    private final Set<K6.c> f12104a;

    /* renamed from: b, reason: collision with root package name */
    private final p f12105b;

    /* renamed from: c, reason: collision with root package name */
    private final t f12106c;

    q(Set<K6.c> set, p pVar, t tVar) {
        this.f12104a = set;
        this.f12105b = pVar;
        this.f12106c = tVar;
    }

    @Override // K6.j
    public <T> K6.i<T> a(String str, Class<T> cls, K6.c cVar, K6.h<T, byte[]> hVar) {
        if (this.f12104a.contains(cVar)) {
            return new s(this.f12105b, str, cVar, hVar, this.f12106c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, this.f12104a));
    }
}
