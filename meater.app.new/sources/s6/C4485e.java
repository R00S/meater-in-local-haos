package s6;

import android.util.Base64;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import m6.C3972g;
import m6.EnumC3966a;
import s6.o;

/* compiled from: DataUrlLoader.java */
/* renamed from: s6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4485e<Model, Data> implements o<Model, Data> {

    /* renamed from: a, reason: collision with root package name */
    private final a<Data> f49298a;

    /* compiled from: DataUrlLoader.java */
    /* renamed from: s6.e$a */
    public interface a<Data> {
        Class<Data> a();

        void b(Data data);

        Data c(String str);
    }

    /* compiled from: DataUrlLoader.java */
    /* renamed from: s6.e$c */
    public static final class c<Model> implements p<Model, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final a<InputStream> f49302a = new a();

        /* compiled from: DataUrlLoader.java */
        /* renamed from: s6.e$c$a */
        class a implements a<InputStream> {
            a() {
            }

            @Override // s6.C4485e.a
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // s6.C4485e.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // s6.C4485e.a
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(String str) {
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

        @Override // s6.p
        public o<Model, InputStream> c(s sVar) {
            return new C4485e(this.f49302a);
        }
    }

    public C4485e(a<Data> aVar) {
        this.f49298a = aVar;
    }

    @Override // s6.o
    public boolean a(Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // s6.o
    public o.a<Data> b(Model model, int i10, int i11, C3972g c3972g) {
        return new o.a<>(new G6.d(model), new b(model.toString(), this.f49298a));
    }

    /* compiled from: DataUrlLoader.java */
    /* renamed from: s6.e$b */
    private static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: B, reason: collision with root package name */
        private final String f49299B;

        /* renamed from: C, reason: collision with root package name */
        private final a<Data> f49300C;

        /* renamed from: D, reason: collision with root package name */
        private Data f49301D;

        b(String str, a<Data> aVar) {
            this.f49299B = str;
            this.f49300C = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f49300C.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            try {
                this.f49300C.b(this.f49301D);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public EnumC3966a d() {
            return EnumC3966a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            try {
                Data dataC = this.f49300C.c(this.f49299B);
                this.f49301D = dataC;
                aVar.f(dataC);
            } catch (IllegalArgumentException e10) {
                aVar.c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
