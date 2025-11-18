package com.trello.rxlifecycle;

import p456rx.C11234e;

/* compiled from: UntilEventObservableTransformer.java */
/* renamed from: com.trello.rxlifecycle.f */
/* loaded from: classes2.dex */
final class C8760f<T, R> implements InterfaceC8756b<T> {

    /* renamed from: f */
    final C11234e<R> f33257f;

    /* renamed from: g */
    final R f33258g;

    public C8760f(C11234e<R> c11234e, R r) {
        this.f33257f = c11234e;
        this.f33258g = r;
    }

    @Override // p456rx.p460m.InterfaceC11256e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C11234e<T> call(C11234e<T> c11234e) {
        return c11234e.m40075P0(C8758d.m27900b(this.f33257f, this.f33258g));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8760f.class != obj.getClass()) {
            return false;
        }
        C8760f c8760f = (C8760f) obj;
        if (this.f33257f.equals(c8760f.f33257f)) {
            return this.f33258g.equals(c8760f.f33258g);
        }
        return false;
    }

    public int hashCode() {
        return (this.f33257f.hashCode() * 31) + this.f33258g.hashCode();
    }

    public String toString() {
        return "UntilEventObservableTransformer{lifecycle=" + this.f33257f + ", event=" + this.f33258g + '}';
    }
}
