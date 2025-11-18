package com.bumptech.glide.load.p129n;

import com.bumptech.glide.EnumC5353g;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.EnumC5365a;
import com.bumptech.glide.load.p127m.InterfaceC5433d;
import com.bumptech.glide.load.p129n.InterfaceC5462n;
import com.bumptech.glide.p144q.C5586c;

/* compiled from: UnitModelLoader.java */
/* renamed from: com.bumptech.glide.load.n.v */
/* loaded from: classes.dex */
public class C5470v<Model> implements InterfaceC5462n<Model, Model> {

    /* renamed from: a */
    private static final C5470v<?> f13687a = new C5470v<>();

    /* compiled from: UnitModelLoader.java */
    /* renamed from: com.bumptech.glide.load.n.v$a */
    public static class a<Model> implements InterfaceC5463o<Model, Model> {

        /* renamed from: a */
        private static final a<?> f13688a = new a<>();

        @Deprecated
        public a() {
        }

        /* renamed from: a */
        public static <T> a<T> m10586a() {
            return (a<T>) f13688a;
        }

        @Override // com.bumptech.glide.load.p129n.InterfaceC5463o
        /* renamed from: b */
        public InterfaceC5462n<Model, Model> mo10513b(C5466r c5466r) {
            return C5470v.m10585c();
        }
    }

    /* compiled from: UnitModelLoader.java */
    /* renamed from: com.bumptech.glide.load.n.v$b */
    private static class b<Model> implements InterfaceC5433d<Model> {

        /* renamed from: f */
        private final Model f13689f;

        b(Model model) {
            this.f13689f = model;
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
        /* renamed from: a */
        public Class<Model> mo10455a() {
            return (Class<Model>) this.f13689f.getClass();
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
        /* renamed from: b */
        public void mo10460b() {
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
        /* renamed from: d */
        public EnumC5365a mo10462d() {
            return EnumC5365a.LOCAL;
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
        /* renamed from: e */
        public void mo10463e(EnumC5353g enumC5353g, InterfaceC5433d.a<? super Model> aVar) {
            aVar.mo10228f(this.f13689f);
        }
    }

    @Deprecated
    public C5470v() {
    }

    /* renamed from: c */
    public static <T> C5470v<T> m10585c() {
        return (C5470v<T>) f13687a;
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5462n
    /* renamed from: a */
    public boolean mo10508a(Model model) {
        return true;
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5462n
    /* renamed from: b */
    public InterfaceC5462n.a<Model> mo10509b(Model model, int i2, int i3, C5426i c5426i) {
        return new InterfaceC5462n.a<>(new C5586c(model), new b(model));
    }
}
