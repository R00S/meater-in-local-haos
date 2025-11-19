package L3;

import java.util.Arrays;

/* compiled from: LottieResult.java */
/* loaded from: classes.dex */
public final class z<V> {

    /* renamed from: a, reason: collision with root package name */
    private final V f9248a;

    /* renamed from: b, reason: collision with root package name */
    private final Throwable f9249b;

    public z(V v10) {
        this.f9248a = v10;
        this.f9249b = null;
    }

    public Throwable a() {
        return this.f9249b;
    }

    public V b() {
        return this.f9248a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (b() != null && b().equals(zVar.b())) {
            return true;
        }
        if (a() == null || zVar.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public z(Throwable th) {
        this.f9249b = th;
        this.f9248a = null;
    }
}
