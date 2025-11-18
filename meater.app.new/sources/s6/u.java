package s6;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;
import m6.C3972g;
import s6.o;

/* compiled from: ResourceUriLoader.java */
/* loaded from: classes2.dex */
public final class u<DataT> implements o<Uri, DataT> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f49377a;

    /* renamed from: b, reason: collision with root package name */
    private final o<Integer, DataT> f49378b;

    /* compiled from: ResourceUriLoader.java */
    private static final class a implements p<Uri, AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f49379a;

        a(Context context) {
            this.f49379a = context;
        }

        @Override // s6.p
        public o<Uri, AssetFileDescriptor> c(s sVar) {
            return new u(this.f49379a, sVar.d(Integer.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: ResourceUriLoader.java */
    private static final class b implements p<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f49380a;

        b(Context context) {
            this.f49380a = context;
        }

        @Override // s6.p
        public o<Uri, InputStream> c(s sVar) {
            return new u(this.f49380a, sVar.d(Integer.class, InputStream.class));
        }
    }

    u(Context context, o<Integer, DataT> oVar) {
        this.f49377a = context.getApplicationContext();
        this.f49378b = oVar;
    }

    public static p<Uri, AssetFileDescriptor> e(Context context) {
        return new a(context);
    }

    public static p<Uri, InputStream> f(Context context) {
        return new b(context);
    }

    private o.a<DataT> g(Uri uri, int i10, int i11, C3972g c3972g) throws NumberFormatException {
        try {
            int i12 = Integer.parseInt(uri.getPathSegments().get(0));
            if (i12 != 0) {
                return this.f49378b.b(Integer.valueOf(i12), i10, i11, c3972g);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
            }
            return null;
        } catch (NumberFormatException e10) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e10);
            }
            return null;
        }
    }

    private o.a<DataT> h(Uri uri, int i10, int i11, C3972g c3972g) {
        List<String> pathSegments = uri.getPathSegments();
        int identifier = this.f49377a.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), this.f49377a.getPackageName());
        if (identifier != 0) {
            return this.f49378b.b(Integer.valueOf(identifier), i10, i11, c3972g);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
        return null;
    }

    @Override // s6.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<DataT> b(Uri uri, int i10, int i11, C3972g c3972g) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return g(uri, i10, i11, c3972g);
        }
        if (pathSegments.size() == 2) {
            return h(uri, i10, i11, c3972g);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
        return null;
    }

    @Override // s6.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f49377a.getPackageName().equals(uri.getAuthority());
    }
}
