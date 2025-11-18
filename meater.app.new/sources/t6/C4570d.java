package t6;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import m6.C3972g;
import m6.EnumC3966a;
import n6.C4067b;
import s6.o;
import s6.p;
import s6.s;

/* compiled from: QMediaStoreUriLoader.java */
/* renamed from: t6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4570d<DataT> implements o<Uri, DataT> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f49952a;

    /* renamed from: b, reason: collision with root package name */
    private final o<File, DataT> f49953b;

    /* renamed from: c, reason: collision with root package name */
    private final o<Uri, DataT> f49954c;

    /* renamed from: d, reason: collision with root package name */
    private final Class<DataT> f49955d;

    /* compiled from: QMediaStoreUriLoader.java */
    /* renamed from: t6.d$a */
    private static abstract class a<DataT> implements p<Uri, DataT> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f49956a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<DataT> f49957b;

        a(Context context, Class<DataT> cls) {
            this.f49956a = context;
            this.f49957b = cls;
        }

        @Override // s6.p
        public final o<Uri, DataT> c(s sVar) {
            return new C4570d(this.f49956a, sVar.d(File.class, this.f49957b), sVar.d(Uri.class, this.f49957b), this.f49957b);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    /* renamed from: t6.d$b */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    /* renamed from: t6.d$c */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    /* renamed from: t6.d$d, reason: collision with other inner class name */
    private static final class C0709d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: L, reason: collision with root package name */
        private static final String[] f49958L = {"_data"};

        /* renamed from: B, reason: collision with root package name */
        private final Context f49959B;

        /* renamed from: C, reason: collision with root package name */
        private final o<File, DataT> f49960C;

        /* renamed from: D, reason: collision with root package name */
        private final o<Uri, DataT> f49961D;

        /* renamed from: E, reason: collision with root package name */
        private final Uri f49962E;

        /* renamed from: F, reason: collision with root package name */
        private final int f49963F;

        /* renamed from: G, reason: collision with root package name */
        private final int f49964G;

        /* renamed from: H, reason: collision with root package name */
        private final C3972g f49965H;

        /* renamed from: I, reason: collision with root package name */
        private final Class<DataT> f49966I;

        /* renamed from: J, reason: collision with root package name */
        private volatile boolean f49967J;

        /* renamed from: K, reason: collision with root package name */
        private volatile com.bumptech.glide.load.data.d<DataT> f49968K;

        C0709d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Uri uri, int i10, int i11, C3972g c3972g, Class<DataT> cls) {
            this.f49959B = context.getApplicationContext();
            this.f49960C = oVar;
            this.f49961D = oVar2;
            this.f49962E = uri;
            this.f49963F = i10;
            this.f49964G = i11;
            this.f49965H = c3972g;
            this.f49966I = cls;
        }

        private o.a<DataT> c() {
            if (Environment.isExternalStorageLegacy()) {
                return this.f49960C.b(h(this.f49962E), this.f49963F, this.f49964G, this.f49965H);
            }
            if (C4067b.a(this.f49962E)) {
                return this.f49961D.b(this.f49962E, this.f49963F, this.f49964G, this.f49965H);
            }
            return this.f49961D.b(g() ? MediaStore.setRequireOriginal(this.f49962E) : this.f49962E, this.f49963F, this.f49964G, this.f49965H);
        }

        private com.bumptech.glide.load.data.d<DataT> f() {
            o.a<DataT> aVarC = c();
            if (aVarC != null) {
                return aVarC.f49349c;
            }
            return null;
        }

        private boolean g() {
            return this.f49959B.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        private File h(Uri uri) {
            Cursor cursor = null;
            try {
                Cursor cursorQuery = this.f49959B.getContentResolver().query(uri, f49958L, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursorQuery.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<DataT> a() {
            return this.f49966I;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f49968K;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f49967J = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f49968K;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public EnumC3966a d() {
            return EnumC3966a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> dVarF = f();
                if (dVarF == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f49962E));
                    return;
                }
                this.f49968K = dVarF;
                if (this.f49967J) {
                    cancel();
                } else {
                    dVarF.e(gVar, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.c(e10);
            }
        }
    }

    C4570d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Class<DataT> cls) {
        this.f49952a = context.getApplicationContext();
        this.f49953b = oVar;
        this.f49954c = oVar2;
        this.f49955d = cls;
    }

    @Override // s6.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<DataT> b(Uri uri, int i10, int i11, C3972g c3972g) {
        return new o.a<>(new G6.d(uri), new C0709d(this.f49952a, this.f49953b, this.f49954c, uri, i10, i11, c3972g, this.f49955d));
    }

    @Override // s6.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && C4067b.c(uri);
    }
}
