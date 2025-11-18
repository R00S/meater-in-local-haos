package com.bumptech.glide.p141p.p143m;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.EnumC5365a;

/* compiled from: DrawableCrossFadeFactory.java */
/* renamed from: com.bumptech.glide.p.m.a */
/* loaded from: classes.dex */
public class C5579a implements InterfaceC5583e<Drawable> {

    /* renamed from: a */
    private final int f14010a;

    /* renamed from: b */
    private final boolean f14011b;

    /* renamed from: c */
    private C5580b f14012c;

    /* compiled from: DrawableCrossFadeFactory.java */
    /* renamed from: com.bumptech.glide.p.m.a$a */
    public static class a {

        /* renamed from: a */
        private final int f14013a;

        /* renamed from: b */
        private boolean f14014b;

        public a() {
            this(300);
        }

        /* renamed from: a */
        public C5579a m11004a() {
            return new C5579a(this.f14013a, this.f14014b);
        }

        public a(int i2) {
            this.f14013a = i2;
        }
    }

    protected C5579a(int i2, boolean z) {
        this.f14010a = i2;
        this.f14011b = z;
    }

    /* renamed from: b */
    private InterfaceC5582d<Drawable> m11002b() {
        if (this.f14012c == null) {
            this.f14012c = new C5580b(this.f14010a, this.f14011b);
        }
        return this.f14012c;
    }

    @Override // com.bumptech.glide.p141p.p143m.InterfaceC5583e
    /* renamed from: a */
    public InterfaceC5582d<Drawable> mo11003a(EnumC5365a enumC5365a, boolean z) {
        return enumC5365a == EnumC5365a.MEMORY_CACHE ? C5581c.m11007b() : m11002b();
    }
}
