package s6;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import m6.C3972g;
import s6.o;

/* compiled from: StringLoader.java */
/* loaded from: classes2.dex */
public class w<Data> implements o<String, Data> {

    /* renamed from: a, reason: collision with root package name */
    private final o<Uri, Data> f49382a;

    /* compiled from: StringLoader.java */
    public static final class a implements p<String, AssetFileDescriptor> {
        @Override // s6.p
        public o<String, AssetFileDescriptor> c(s sVar) {
            return new w(sVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    public static class b implements p<String, ParcelFileDescriptor> {
        @Override // s6.p
        public o<String, ParcelFileDescriptor> c(s sVar) {
            return new w(sVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    public static class c implements p<String, InputStream> {
        @Override // s6.p
        public o<String, InputStream> c(s sVar) {
            return new w(sVar.d(Uri.class, InputStream.class));
        }
    }

    public w(o<Uri, Data> oVar) {
        this.f49382a = oVar;
    }

    private static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() == null ? f(str) : uri;
    }

    private static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // s6.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(String str, int i10, int i11, C3972g c3972g) {
        Uri uriE = e(str);
        if (uriE == null || !this.f49382a.a(uriE)) {
            return null;
        }
        return this.f49382a.b(uriE, i10, i11, c3972g);
    }

    @Override // s6.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(String str) {
        return true;
    }
}
