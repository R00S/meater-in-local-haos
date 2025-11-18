package com.bumptech.glide.load.engine.p126z;

import android.graphics.Bitmap;
import com.bumptech.glide.p145r.C5597k;

/* compiled from: AttributeStrategy.java */
/* renamed from: com.bumptech.glide.load.engine.z.c */
/* loaded from: classes.dex */
class C5411c implements InterfaceC5420l {

    /* renamed from: a */
    private final b f13510a = new b();

    /* renamed from: b */
    private final C5416h<a, Bitmap> f13511b = new C5416h<>();

    /* compiled from: AttributeStrategy.java */
    /* renamed from: com.bumptech.glide.load.engine.z.c$a */
    static class a implements InterfaceC5421m {

        /* renamed from: a */
        private final b f13512a;

        /* renamed from: b */
        private int f13513b;

        /* renamed from: c */
        private int f13514c;

        /* renamed from: d */
        private Bitmap.Config f13515d;

        public a(b bVar) {
            this.f13512a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5421m
        /* renamed from: a */
        public void mo10378a() {
            this.f13512a.m10384c(this);
        }

        /* renamed from: b */
        public void m10379b(int i2, int i3, Bitmap.Config config) {
            this.f13513b = i2;
            this.f13514c = i3;
            this.f13515d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f13513b == aVar.f13513b && this.f13514c == aVar.f13514c && this.f13515d == aVar.f13515d;
        }

        public int hashCode() {
            int i2 = ((this.f13513b * 31) + this.f13514c) * 31;
            Bitmap.Config config = this.f13515d;
            return i2 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C5411c.m10370g(this.f13513b, this.f13514c, this.f13515d);
        }
    }

    /* compiled from: AttributeStrategy.java */
    /* renamed from: com.bumptech.glide.load.engine.z.c$b */
    static class b extends AbstractC5412d<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.load.engine.p126z.AbstractC5412d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a mo10380a() {
            return new a(this);
        }

        /* renamed from: e */
        a m10382e(int i2, int i3, Bitmap.Config config) {
            a aVarM10383b = m10383b();
            aVarM10383b.m10379b(i2, i3, config);
            return aVarM10383b;
        }
    }

    C5411c() {
    }

    /* renamed from: g */
    static String m10370g(int i2, int i3, Bitmap.Config config) {
        return "[" + i2 + "x" + i3 + "], " + config;
    }

    /* renamed from: h */
    private static String m10371h(Bitmap bitmap) {
        return m10370g(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5420l
    /* renamed from: a */
    public Bitmap mo10372a() {
        return this.f13511b.m10398f();
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5420l
    /* renamed from: b */
    public String mo10373b(int i2, int i3, Bitmap.Config config) {
        return m10370g(i2, i3, config);
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5420l
    /* renamed from: c */
    public void mo10374c(Bitmap bitmap) {
        this.f13511b.m10397d(this.f13510a.m10382e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5420l
    /* renamed from: d */
    public Bitmap mo10375d(int i2, int i3, Bitmap.Config config) {
        return this.f13511b.m10396a(this.f13510a.m10382e(i2, i3, config));
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5420l
    /* renamed from: e */
    public int mo10376e(Bitmap bitmap) {
        return C5597k.m11051h(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5420l
    /* renamed from: f */
    public String mo10377f(Bitmap bitmap) {
        return m10371h(bitmap);
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f13511b;
    }
}
