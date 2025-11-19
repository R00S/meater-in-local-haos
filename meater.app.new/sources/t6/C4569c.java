package t6;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.resource.bitmap.E;
import java.io.InputStream;
import m6.C3972g;
import n6.C4067b;
import n6.C4068c;
import s6.o;
import s6.p;
import s6.s;

/* compiled from: MediaStoreVideoThumbLoader.java */
/* renamed from: t6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4569c implements o<Uri, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f49950a;

    /* compiled from: MediaStoreVideoThumbLoader.java */
    /* renamed from: t6.c$a */
    public static class a implements p<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f49951a;

        public a(Context context) {
            this.f49951a = context;
        }

        @Override // s6.p
        public o<Uri, InputStream> c(s sVar) {
            return new C4569c(this.f49951a);
        }
    }

    public C4569c(Context context) {
        this.f49950a = context.getApplicationContext();
    }

    private boolean e(C3972g c3972g) {
        Long l10 = (Long) c3972g.c(E.f33303d);
        return l10 != null && l10.longValue() == -1;
    }

    @Override // s6.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> b(Uri uri, int i10, int i11, C3972g c3972g) {
        if (C4067b.e(i10, i11) && e(c3972g)) {
            return new o.a<>(new G6.d(uri), C4068c.g(this.f49950a, uri));
        }
        return null;
    }

    @Override // s6.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return C4067b.d(uri);
    }
}
