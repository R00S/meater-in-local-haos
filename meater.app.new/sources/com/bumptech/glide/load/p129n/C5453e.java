package com.bumptech.glide.load.p129n;

import android.util.Base64;
import com.bumptech.glide.EnumC5353g;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.EnumC5365a;
import com.bumptech.glide.load.p127m.InterfaceC5433d;
import com.bumptech.glide.load.p129n.InterfaceC5462n;
import com.bumptech.glide.p144q.C5586c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DataUrlLoader.java */
/* renamed from: com.bumptech.glide.load.n.e */
/* loaded from: classes.dex */
public final class C5453e<Model, Data> implements InterfaceC5462n<Model, Data> {

    /* renamed from: a */
    private final a<Data> f13615a;

    /* compiled from: DataUrlLoader.java */
    /* renamed from: com.bumptech.glide.load.n.e$a */
    public interface a<Data> {
        /* renamed from: a */
        Class<Data> mo10523a();

        /* renamed from: b */
        void mo10524b(Data data) throws IOException;

        /* renamed from: c */
        Data mo10525c(String str) throws IllegalArgumentException;
    }

    /* compiled from: DataUrlLoader.java */
    /* renamed from: com.bumptech.glide.load.n.e$b */
    private static final class b<Data> implements InterfaceC5433d<Data> {

        /* renamed from: f */
        private final String f13616f;

        /* renamed from: g */
        private final a<Data> f13617g;

        /* renamed from: h */
        private Data f13618h;

        b(String str, a<Data> aVar) {
            this.f13616f = str;
            this.f13617g = aVar;
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
        /* renamed from: a */
        public Class<Data> mo10455a() {
            return this.f13617g.mo10523a();
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
        /* renamed from: b */
        public void mo10460b() {
            try {
                this.f13617g.mo10524b(this.f13618h);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
        /* renamed from: d */
        public EnumC5365a mo10462d() {
            return EnumC5365a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
        /* renamed from: e */
        public void mo10463e(EnumC5353g enumC5353g, InterfaceC5433d.a<? super Data> aVar) {
            try {
                Data dataMo10525c = this.f13617g.mo10525c(this.f13616f);
                this.f13618h = dataMo10525c;
                aVar.mo10228f(dataMo10525c);
            } catch (IllegalArgumentException e2) {
                aVar.mo10227c(e2);
            }
        }
    }

    /* compiled from: DataUrlLoader.java */
    /* renamed from: com.bumptech.glide.load.n.e$c */
    public static final class c<Model> implements InterfaceC5463o<Model, InputStream> {

        /* renamed from: a */
        private final a<InputStream> f13619a = new a();

        /* compiled from: DataUrlLoader.java */
        /* renamed from: com.bumptech.glide.load.n.e$c$a */
        class a implements a<InputStream> {
            a() {
            }

            @Override // com.bumptech.glide.load.p129n.C5453e.a
            /* renamed from: a */
            public Class<InputStream> mo10523a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.p129n.C5453e.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo10524b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // com.bumptech.glide.load.p129n.C5453e.a
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream mo10525c(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // com.bumptech.glide.load.p129n.InterfaceC5463o
        /* renamed from: b */
        public InterfaceC5462n<Model, InputStream> mo10513b(C5466r c5466r) {
            return new C5453e(this.f13619a);
        }
    }

    public C5453e(a<Data> aVar) {
        this.f13615a = aVar;
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5462n
    /* renamed from: a */
    public boolean mo10508a(Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5462n
    /* renamed from: b */
    public InterfaceC5462n.a<Data> mo10509b(Model model, int i2, int i3, C5426i c5426i) {
        return new InterfaceC5462n.a<>(new C5586c(model), new b(model.toString(), this.f13615a));
    }
}
