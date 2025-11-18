package t6;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import m6.C3972g;
import n6.C4067b;
import n6.C4068c;
import s6.o;
import s6.p;
import s6.s;

/* compiled from: MediaStoreImageThumbLoader.java */
/* renamed from: t6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4568b implements o<Uri, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f49948a;

    /* compiled from: MediaStoreImageThumbLoader.java */
    /* renamed from: t6.b$a */
    public static class a implements p<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f49949a;

        public a(Context context) {
            this.f49949a = context;
        }

        @Override // s6.p
        public o<Uri, InputStream> c(s sVar) {
            return new C4568b(this.f49949a);
        }
    }

    public C4568b(Context context) {
        this.f49948a = context.getApplicationContext();
    }

    @Override // s6.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> b(Uri uri, int i10, int i11, C3972g c3972g) {
        if (C4067b.e(i10, i11)) {
            return new o.a<>(new G6.d(uri), C4068c.f(this.f49948a, uri));
        }
        return null;
    }

    @Override // s6.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return C4067b.b(uri);
    }
}
