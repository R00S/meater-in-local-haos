package com.trello.rxlifecycle;

import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;

/* compiled from: UntilCorrespondingEventObservableTransformer.java */
/* renamed from: com.trello.rxlifecycle.e */
/* loaded from: classes2.dex */
final class C8759e<T, R> implements InterfaceC8756b<T> {

    /* renamed from: f */
    final C11234e<R> f33255f;

    /* renamed from: g */
    final InterfaceC11256e<R, R> f33256g;

    public C8759e(C11234e<R> c11234e, InterfaceC11256e<R, R> interfaceC11256e) {
        this.f33255f = c11234e;
        this.f33256g = interfaceC11256e;
    }

    @Override // p456rx.p460m.InterfaceC11256e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C11234e<T> call(C11234e<T> c11234e) {
        return c11234e.m40075P0(C8758d.m27899a(this.f33255f, this.f33256g));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8759e.class != obj.getClass()) {
            return false;
        }
        C8759e c8759e = (C8759e) obj;
        if (this.f33255f.equals(c8759e.f33255f)) {
            return this.f33256g.equals(c8759e.f33256g);
        }
        return false;
    }

    public int hashCode() {
        return (this.f33255f.hashCode() * 31) + this.f33256g.hashCode();
    }

    public String toString() {
        return "UntilCorrespondingEventObservableTransformer{sharedLifecycle=" + this.f33255f + ", correspondingEvents=" + this.f33256g + '}';
    }
}
