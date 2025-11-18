package com.trello.rxlifecycle;

import java.util.concurrent.CancellationException;
import p456rx.C11234e;
import p456rx.exceptions.C11240a;
import p456rx.p460m.InterfaceC11256e;

/* compiled from: Functions.java */
/* renamed from: com.trello.rxlifecycle.a */
/* loaded from: classes2.dex */
final class C8755a {

    /* renamed from: a */
    static final InterfaceC11256e<Throwable, Boolean> f33251a = new a();

    /* renamed from: b */
    static final InterfaceC11256e<Boolean, Boolean> f33252b = new b();

    /* renamed from: c */
    static final InterfaceC11256e<Object, C11234e<Object>> f33253c = new c();

    /* compiled from: Functions.java */
    /* renamed from: com.trello.rxlifecycle.a$a */
    static class a implements InterfaceC11256e<Throwable, Boolean> {
        a() {
        }

        @Override // p456rx.p460m.InterfaceC11256e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Throwable th) {
            if (th instanceof OutsideLifecycleException) {
                return Boolean.TRUE;
            }
            C11240a.m40138c(th);
            return Boolean.FALSE;
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: com.trello.rxlifecycle.a$b */
    static class b implements InterfaceC11256e<Boolean, Boolean> {
        b() {
        }

        @Override // p456rx.p460m.InterfaceC11256e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Boolean bool) {
            return bool;
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: com.trello.rxlifecycle.a$c */
    static class c implements InterfaceC11256e<Object, C11234e<Object>> {
        c() {
        }

        @Override // p456rx.p460m.InterfaceC11256e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C11234e<Object> call(Object obj) {
            return C11234e.m40017C(new CancellationException());
        }
    }
}
