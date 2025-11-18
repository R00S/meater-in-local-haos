package com.bumptech.glide.p141p.p143m;

import com.bumptech.glide.load.EnumC5365a;
import com.bumptech.glide.p141p.p143m.InterfaceC5582d;

/* compiled from: NoTransition.java */
/* renamed from: com.bumptech.glide.p.m.c */
/* loaded from: classes.dex */
public class C5581c<R> implements InterfaceC5582d<R> {

    /* renamed from: a */
    static final C5581c<?> f14017a = new C5581c<>();

    /* renamed from: b */
    private static final InterfaceC5583e<?> f14018b = new a();

    /* compiled from: NoTransition.java */
    /* renamed from: com.bumptech.glide.p.m.c$a */
    public static class a<R> implements InterfaceC5583e<R> {
        @Override // com.bumptech.glide.p141p.p143m.InterfaceC5583e
        /* renamed from: a */
        public InterfaceC5582d<R> mo11003a(EnumC5365a enumC5365a, boolean z) {
            return C5581c.f14017a;
        }
    }

    /* renamed from: b */
    public static <R> InterfaceC5582d<R> m11007b() {
        return f14017a;
    }

    /* renamed from: c */
    public static <R> InterfaceC5583e<R> m11008c() {
        return (InterfaceC5583e<R>) f14018b;
    }

    @Override // com.bumptech.glide.p141p.p143m.InterfaceC5582d
    /* renamed from: a */
    public boolean mo11005a(Object obj, InterfaceC5582d.a aVar) {
        return false;
    }
}
