package com.google.firebase.components;

import com.google.firebase.p205s.InterfaceC8496b;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: LazySet.java */
/* renamed from: com.google.firebase.components.y */
/* loaded from: classes2.dex */
class C8135y<T> implements InterfaceC8496b<Set<T>> {

    /* renamed from: b */
    private volatile Set<T> f30747b = null;

    /* renamed from: a */
    private volatile Set<InterfaceC8496b<T>> f30746a = Collections.newSetFromMap(new ConcurrentHashMap());

    C8135y(Collection<InterfaceC8496b<T>> collection) {
        this.f30746a.addAll(collection);
    }

    /* renamed from: b */
    static C8135y<?> m25075b(Collection<InterfaceC8496b<?>> collection) {
        return new C8135y<>((Set) collection);
    }

    /* renamed from: d */
    private synchronized void m25076d() {
        Iterator<InterfaceC8496b<T>> it = this.f30746a.iterator();
        while (it.hasNext()) {
            this.f30747b.add(it.next().get());
        }
        this.f30746a = null;
    }

    /* renamed from: a */
    synchronized void m25077a(InterfaceC8496b<T> interfaceC8496b) {
        if (this.f30747b == null) {
            this.f30746a.add(interfaceC8496b);
        } else {
            this.f30747b.add(interfaceC8496b.get());
        }
    }

    @Override // com.google.firebase.p205s.InterfaceC8496b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        if (this.f30747b == null) {
            synchronized (this) {
                if (this.f30747b == null) {
                    this.f30747b = Collections.newSetFromMap(new ConcurrentHashMap());
                    m25076d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f30747b);
    }
}
