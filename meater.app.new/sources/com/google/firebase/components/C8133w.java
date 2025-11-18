package com.google.firebase.components;

import com.google.firebase.p203q.C8479a;
import com.google.firebase.p203q.InterfaceC8480b;
import com.google.firebase.p203q.InterfaceC8481c;
import com.google.firebase.p203q.InterfaceC8482d;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: EventBus.java */
/* renamed from: com.google.firebase.components.w */
/* loaded from: classes2.dex */
class C8133w implements InterfaceC8482d, InterfaceC8481c {

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<InterfaceC8480b<Object>, Executor>> f30740a = new HashMap();

    /* renamed from: b */
    private Queue<C8479a<?>> f30741b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f30742c;

    C8133w(Executor executor) {
        this.f30742c = executor;
    }

    /* renamed from: d */
    private synchronized Set<Map.Entry<InterfaceC8480b<Object>, Executor>> m25069d(C8479a<?> c8479a) {
        ConcurrentHashMap<InterfaceC8480b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.f30740a.get(c8479a.m26679b());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    @Override // com.google.firebase.p203q.InterfaceC8482d
    /* renamed from: a */
    public <T> void mo25071a(Class<T> cls, InterfaceC8480b<? super T> interfaceC8480b) {
        mo25072b(cls, this.f30742c, interfaceC8480b);
    }

    @Override // com.google.firebase.p203q.InterfaceC8482d
    /* renamed from: b */
    public synchronized <T> void mo25072b(Class<T> cls, Executor executor, InterfaceC8480b<? super T> interfaceC8480b) {
        C8109a0.m24968b(cls);
        C8109a0.m24968b(interfaceC8480b);
        C8109a0.m24968b(executor);
        if (!this.f30740a.containsKey(cls)) {
            this.f30740a.put(cls, new ConcurrentHashMap<>());
        }
        this.f30740a.get(cls).put(interfaceC8480b, executor);
    }

    /* renamed from: c */
    void m25073c() {
        Queue<C8479a<?>> queue;
        synchronized (this) {
            queue = this.f30741b;
            if (queue != null) {
                this.f30741b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            Iterator<C8479a<?>> it = queue.iterator();
            while (it.hasNext()) {
                m25074f(it.next());
            }
        }
    }

    /* renamed from: f */
    public void m25074f(final C8479a<?> c8479a) {
        C8109a0.m24968b(c8479a);
        synchronized (this) {
            Queue<C8479a<?>> queue = this.f30741b;
            if (queue != null) {
                queue.add(c8479a);
                return;
            }
            for (final Map.Entry<InterfaceC8480b<Object>, Executor> entry : m25069d(c8479a)) {
                entry.getValue().execute(new Runnable() { // from class: com.google.firebase.components.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC8480b) entry.getKey()).mo24957a(c8479a);
                    }
                });
            }
        }
    }
}
