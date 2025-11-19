package I5;

import android.content.Context;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.b;
import androidx.media3.datasource.c;
import androidx.media3.datasource.cache.CacheDataSink;
import androidx.media3.datasource.cache.a;
import androidx.media3.datasource.cache.h;
import b2.i;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: CacheManager.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"LI5/a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/media3/datasource/cache/a$c;", "a", "()Landroidx/media3/datasource/cache/a$c;", "Landroidx/media3/datasource/cache/a$c;", "cacheDataSourceFactory", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private a.c cacheDataSourceFactory;

    public a(Context context) {
        C3862t.g(context, "context");
        U4.b.t("Cache Manager Initalised", new Object[0]);
        h hVar = new h(new File(context.getCacheDir(), "exo_player_disk_cache"), new i(524288000L), new Z1.b(context));
        CacheDataSink.a aVarB = new CacheDataSink.a().b(hVar);
        C3862t.f(aVarB, "setCache(...)");
        this.cacheDataSourceFactory = new a.c().d(hVar).f(aVarB).e(new FileDataSource.a()).h(new b.a(context, new c.b())).g(2);
    }

    /* renamed from: a, reason: from getter */
    public final a.c getCacheDataSourceFactory() {
        return this.cacheDataSourceFactory;
    }
}
