package s6;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import m6.C3972g;
import m6.EnumC3966a;
import s6.o;

/* compiled from: FileLoader.java */
/* renamed from: s6.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4487g<Data> implements o<File, Data> {

    /* renamed from: a, reason: collision with root package name */
    private final d<Data> f49314a;

    /* compiled from: FileLoader.java */
    /* renamed from: s6.g$a */
    public static class a<Data> implements p<File, Data> {

        /* renamed from: a, reason: collision with root package name */
        private final d<Data> f49315a;

        public a(d<Data> dVar) {
            this.f49315a = dVar;
        }

        @Override // s6.p
        public final o<File, Data> c(s sVar) {
            return new C4487g(this.f49315a);
        }
    }

    /* compiled from: FileLoader.java */
    /* renamed from: s6.g$b */
    public static class b extends a<ParcelFileDescriptor> {

        /* compiled from: FileLoader.java */
        /* renamed from: s6.g$b$a */
        class a implements d<ParcelFileDescriptor> {
            a() {
            }

            @Override // s6.C4487g.d
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // s6.C4487g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // s6.C4487g.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* compiled from: FileLoader.java */
    /* renamed from: s6.g$d */
    public interface d<Data> {
        Class<Data> a();

        void b(Data data);

        Data c(File file);
    }

    /* compiled from: FileLoader.java */
    /* renamed from: s6.g$e */
    public static class e extends a<InputStream> {

        /* compiled from: FileLoader.java */
        /* renamed from: s6.g$e$a */
        class a implements d<InputStream> {
            a() {
            }

            @Override // s6.C4487g.d
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // s6.C4487g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // s6.C4487g.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public C4487g(d<Data> dVar) {
        this.f49314a = dVar;
    }

    @Override // s6.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(File file, int i10, int i11, C3972g c3972g) {
        return new o.a<>(new G6.d(file), new c(file, this.f49314a));
    }

    @Override // s6.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(File file) {
        return true;
    }

    /* compiled from: FileLoader.java */
    /* renamed from: s6.g$c */
    private static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: B, reason: collision with root package name */
        private final File f49316B;

        /* renamed from: C, reason: collision with root package name */
        private final d<Data> f49317C;

        /* renamed from: D, reason: collision with root package name */
        private Data f49318D;

        c(File file, d<Data> dVar) {
            this.f49316B = file;
            this.f49317C = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f49317C.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Data data = this.f49318D;
            if (data != null) {
                try {
                    this.f49317C.b(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public EnumC3966a d() {
            return EnumC3966a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            try {
                Data dataC = this.f49317C.c(this.f49316B);
                this.f49318D = dataC;
                aVar.f(dataC);
            } catch (FileNotFoundException e10) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e10);
                }
                aVar.c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
