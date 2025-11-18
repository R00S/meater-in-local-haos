package E5;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ExoPlayerManager.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LE5/a;", "", "Landroid/content/Context;", "context", "LI5/a;", "cacheManager", "<init>", "(Landroid/content/Context;LI5/a;)V", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "LI5/a;", "c", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final int f3988d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static HashMap<Integer, ExoPlayer> f3989e = new HashMap<>();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final I5.a cacheManager;

    public a(Context context, I5.a cacheManager) {
        C3862t.g(context, "context");
        C3862t.g(cacheManager, "cacheManager");
        this.context = context;
        this.cacheManager = cacheManager;
    }
}
