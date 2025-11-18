package com.trello.rxlifecycle;

import com.trello.rxlifecycle.p237i.C8768a;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;

/* compiled from: RxLifecycle.java */
/* renamed from: com.trello.rxlifecycle.c */
/* loaded from: classes.dex */
public class C8757c {
    /* renamed from: a */
    public static <T, R> InterfaceC8756b<T> m27897a(C11234e<R> c11234e, InterfaceC11256e<R, R> interfaceC11256e) {
        C8768a.m27909a(c11234e, "lifecycle == null");
        C8768a.m27909a(interfaceC11256e, "correspondingEvents == null");
        return new C8759e(c11234e.m40118w0(), interfaceC11256e);
    }

    /* renamed from: b */
    public static <T, R> InterfaceC8756b<T> m27898b(C11234e<R> c11234e, R r) {
        C8768a.m27909a(c11234e, "lifecycle == null");
        C8768a.m27909a(r, "event == null");
        return new C8760f(c11234e, r);
    }
}
