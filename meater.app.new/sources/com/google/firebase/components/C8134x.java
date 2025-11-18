package com.google.firebase.components;

import com.google.firebase.p205s.InterfaceC8496b;

/* compiled from: Lazy.java */
/* renamed from: com.google.firebase.components.x */
/* loaded from: classes2.dex */
public class C8134x<T> implements InterfaceC8496b<T> {

    /* renamed from: a */
    private static final Object f30743a = new Object();

    /* renamed from: b */
    private volatile Object f30744b = f30743a;

    /* renamed from: c */
    private volatile InterfaceC8496b<T> f30745c;

    public C8134x(InterfaceC8496b<T> interfaceC8496b) {
        this.f30745c = interfaceC8496b;
    }

    @Override // com.google.firebase.p205s.InterfaceC8496b
    public T get() {
        T t = (T) this.f30744b;
        Object obj = f30743a;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.f30744b;
                if (t == obj) {
                    t = this.f30745c.get();
                    this.f30744b = t;
                    this.f30745c = null;
                }
            }
        }
        return t;
    }
}
