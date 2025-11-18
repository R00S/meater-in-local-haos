package m8;

import java.util.Set;

/* compiled from: ForwardingSet.java */
/* renamed from: m8.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4005u<E> extends r<E> implements Set<E> {
    protected AbstractC4005u() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return obj == this || i().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return i().hashCode();
    }

    protected abstract Set<E> i();
}
