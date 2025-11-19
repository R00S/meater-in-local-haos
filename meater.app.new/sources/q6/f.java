package q6;

import android.content.Context;
import java.io.File;
import q6.d;

/* compiled from: InternalCacheDiskCacheFactory.java */
/* loaded from: classes2.dex */
public final class f extends d {

    /* compiled from: InternalCacheDiskCacheFactory.java */
    class a implements d.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f48093a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f48094b;

        a(Context context, String str) {
            this.f48093a = context;
            this.f48094b = str;
        }

        @Override // q6.d.a
        public File a() {
            File cacheDir = this.f48093a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f48094b != null ? new File(cacheDir, this.f48094b) : cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public f(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
