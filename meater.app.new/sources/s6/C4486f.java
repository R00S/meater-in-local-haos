package s6;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import m6.C3972g;
import m6.EnumC3966a;
import s6.o;

/* compiled from: DirectResourceLoader.java */
/* renamed from: s6.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4486f<DataT> implements o<Integer, DataT> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f49304a;

    /* renamed from: b, reason: collision with root package name */
    private final e<DataT> f49305b;

    /* compiled from: DirectResourceLoader.java */
    /* renamed from: s6.f$a */
    private static final class a implements p<Integer, AssetFileDescriptor>, e<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f49306a;

        a(Context context) {
            this.f49306a = context;
        }

        @Override // s6.C4486f.e
        public Class<AssetFileDescriptor> a() {
            return AssetFileDescriptor.class;
        }

        @Override // s6.p
        public o<Integer, AssetFileDescriptor> c(s sVar) {
            return new C4486f(this.f49306a, this);
        }

        @Override // s6.C4486f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // s6.C4486f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor d(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResourceFd(i10);
        }
    }

    /* compiled from: DirectResourceLoader.java */
    /* renamed from: s6.f$c */
    private static final class c implements p<Integer, InputStream>, e<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f49308a;

        c(Context context) {
            this.f49308a = context;
        }

        @Override // s6.C4486f.e
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // s6.p
        public o<Integer, InputStream> c(s sVar) {
            return new C4486f(this.f49308a, this);
        }

        @Override // s6.C4486f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // s6.C4486f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public InputStream d(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResource(i10);
        }
    }

    /* compiled from: DirectResourceLoader.java */
    /* renamed from: s6.f$e */
    private interface e<DataT> {
        Class<DataT> a();

        void b(DataT datat);

        DataT d(Resources.Theme theme, Resources resources, int i10);
    }

    C4486f(Context context, e<DataT> eVar) {
        this.f49304a = context.getApplicationContext();
        this.f49305b = eVar;
    }

    public static p<Integer, AssetFileDescriptor> c(Context context) {
        return new a(context);
    }

    public static p<Integer, Drawable> e(Context context) {
        return new b(context);
    }

    public static p<Integer, InputStream> g(Context context) {
        return new c(context);
    }

    @Override // s6.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public o.a<DataT> b(Integer num, int i10, int i11, C3972g c3972g) {
        Resources.Theme theme = (Resources.Theme) c3972g.c(w6.l.f51963b);
        return new o.a<>(new G6.d(num), new d(theme, theme != null ? theme.getResources() : this.f49304a.getResources(), this.f49305b, num.intValue()));
    }

    @Override // s6.o
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(Integer num) {
        return true;
    }

    /* compiled from: DirectResourceLoader.java */
    /* renamed from: s6.f$d */
    private static final class d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: B, reason: collision with root package name */
        private final Resources.Theme f49309B;

        /* renamed from: C, reason: collision with root package name */
        private final Resources f49310C;

        /* renamed from: D, reason: collision with root package name */
        private final e<DataT> f49311D;

        /* renamed from: E, reason: collision with root package name */
        private final int f49312E;

        /* renamed from: F, reason: collision with root package name */
        private DataT f49313F;

        d(Resources.Theme theme, Resources resources, e<DataT> eVar, int i10) {
            this.f49309B = theme;
            this.f49310C = resources;
            this.f49311D = eVar;
            this.f49312E = i10;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<DataT> a() {
            return this.f49311D.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            DataT datat = this.f49313F;
            if (datat != null) {
                try {
                    this.f49311D.b(datat);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public EnumC3966a d() {
            return EnumC3966a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super DataT> aVar) {
            try {
                DataT datatD = this.f49311D.d(this.f49309B, this.f49310C, this.f49312E);
                this.f49313F = datatD;
                aVar.f(datatD);
            } catch (Resources.NotFoundException e10) {
                aVar.c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }

    /* compiled from: DirectResourceLoader.java */
    /* renamed from: s6.f$b */
    private static final class b implements p<Integer, Drawable>, e<Drawable> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f49307a;

        b(Context context) {
            this.f49307a = context;
        }

        @Override // s6.C4486f.e
        public Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // s6.p
        public o<Integer, Drawable> c(s sVar) {
            return new C4486f(this.f49307a, this);
        }

        @Override // s6.C4486f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Drawable d(Resources.Theme theme, Resources resources, int i10) {
            return w6.i.a(this.f49307a, i10, theme);
        }

        @Override // s6.C4486f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(Drawable drawable) {
        }
    }
}
