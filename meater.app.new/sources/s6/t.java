package s6;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import m6.C3972g;
import s6.o;

/* compiled from: ResourceLoader.java */
/* loaded from: classes2.dex */
public class t<Data> implements o<Integer, Data> {

    /* renamed from: a, reason: collision with root package name */
    private final o<Uri, Data> f49372a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f49373b;

    /* compiled from: ResourceLoader.java */
    public static final class a implements p<Integer, AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f49374a;

        public a(Resources resources) {
            this.f49374a = resources;
        }

        @Override // s6.p
        public o<Integer, AssetFileDescriptor> c(s sVar) {
            return new t(this.f49374a, sVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    public static class b implements p<Integer, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f49375a;

        public b(Resources resources) {
            this.f49375a = resources;
        }

        @Override // s6.p
        public o<Integer, InputStream> c(s sVar) {
            return new t(this.f49375a, sVar.d(Uri.class, InputStream.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    public static class c implements p<Integer, Uri> {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f49376a;

        public c(Resources resources) {
            this.f49376a = resources;
        }

        @Override // s6.p
        public o<Integer, Uri> c(s sVar) {
            return new t(this.f49376a, x.c());
        }
    }

    public t(Resources resources, o<Uri, Data> oVar) {
        this.f49373b = resources;
        this.f49372a = oVar;
    }

    private Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f49373b.getResourcePackageName(num.intValue()) + '/' + this.f49373b.getResourceTypeName(num.intValue()) + '/' + this.f49373b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e10);
            return null;
        }
    }

    @Override // s6.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(Integer num, int i10, int i11, C3972g c3972g) {
        Uri uriD = d(num);
        if (uriD == null) {
            return null;
        }
        return this.f49372a.b(uriD, i10, i11, c3972g);
    }

    @Override // s6.o
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean a(Integer num) {
        return true;
    }
}
