package com.bumptech.glide.p145r.p146l;

/* compiled from: StateVerifier.java */
/* renamed from: com.bumptech.glide.r.l.c */
/* loaded from: classes.dex */
public abstract class AbstractC5600c {

    /* compiled from: StateVerifier.java */
    /* renamed from: com.bumptech.glide.r.l.c$b */
    private static class b extends AbstractC5600c {

        /* renamed from: a */
        private volatile boolean f14053a;

        b() {
            super();
        }

        @Override // com.bumptech.glide.p145r.p146l.AbstractC5600c
        /* renamed from: b */
        public void mo11079b(boolean z) {
            this.f14053a = z;
        }

        @Override // com.bumptech.glide.p145r.p146l.AbstractC5600c
        /* renamed from: c */
        public void mo11080c() {
            if (this.f14053a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    /* renamed from: a */
    public static AbstractC5600c m11078a() {
        return new b();
    }

    /* renamed from: b */
    abstract void mo11079b(boolean z);

    /* renamed from: c */
    public abstract void mo11080c();

    private AbstractC5600c() {
    }
}
