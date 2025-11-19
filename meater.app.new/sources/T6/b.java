package T6;

import T6.f;
import java.util.Map;

/* compiled from: AutoValue_SchedulerConfig.java */
/* loaded from: classes2.dex */
final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final W6.a f16160a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<K6.f, f.b> f16161b;

    b(W6.a aVar, Map<K6.f, f.b> map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f16160a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f16161b = map;
    }

    @Override // T6.f
    W6.a e() {
        return this.f16160a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f16160a.equals(fVar.e()) && this.f16161b.equals(fVar.h());
    }

    @Override // T6.f
    Map<K6.f, f.b> h() {
        return this.f16161b;
    }

    public int hashCode() {
        return ((this.f16160a.hashCode() ^ 1000003) * 1000003) ^ this.f16161b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f16160a + ", values=" + this.f16161b + "}";
    }
}
