package s6;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import m6.C3972g;
import m6.EnumC3966a;
import n6.C4067b;
import s6.o;

/* compiled from: MediaStoreFileLoader.java */
/* loaded from: classes2.dex */
public final class l implements o<Uri, File> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f49336a;

    /* compiled from: MediaStoreFileLoader.java */
    public static final class a implements p<Uri, File> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f49337a;

        public a(Context context) {
            this.f49337a = context;
        }

        @Override // s6.p
        public o<Uri, File> c(s sVar) {
            return new l(this.f49337a);
        }
    }

    public l(Context context) {
        this.f49336a = context;
    }

    @Override // s6.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<File> b(Uri uri, int i10, int i11, C3972g c3972g) {
        return new o.a<>(new G6.d(uri), new b(this.f49336a, uri));
    }

    @Override // s6.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return C4067b.c(uri);
    }

    /* compiled from: MediaStoreFileLoader.java */
    private static class b implements com.bumptech.glide.load.data.d<File> {

        /* renamed from: D, reason: collision with root package name */
        private static final String[] f49338D = {"_data"};

        /* renamed from: B, reason: collision with root package name */
        private final Context f49339B;

        /* renamed from: C, reason: collision with root package name */
        private final Uri f49340C;

        b(Context context, Uri uri) {
            this.f49339B = context;
            this.f49340C = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<File> a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public EnumC3966a d() {
            return EnumC3966a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super File> aVar) {
            Cursor cursorQuery = this.f49339B.getContentResolver().query(this.f49340C, f49338D, null, null, null);
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    cursorQuery.close();
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.f(new File(string));
                return;
            }
            aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f49340C));
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
