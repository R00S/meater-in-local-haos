package vb;

import Hb.U;
import Ra.H;
import kotlin.jvm.internal.C3862t;

/* compiled from: constantValues.kt */
/* renamed from: vb.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4943g<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f51599a;

    public AbstractC4943g(T t10) {
        this.f51599a = t10;
    }

    public abstract U a(H h10);

    public T b() {
        return this.f51599a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            T tB = b();
            AbstractC4943g abstractC4943g = obj instanceof AbstractC4943g ? (AbstractC4943g) obj : null;
            if (!C3862t.b(tB, abstractC4943g != null ? abstractC4943g.b() : null)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        T tB = b();
        if (tB != null) {
            return tB.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
