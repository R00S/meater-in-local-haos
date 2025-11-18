package A6;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.load.resource.bitmap.t;
import s.C4391a;

/* compiled from: RequestManagerRetriever.java */
/* loaded from: classes2.dex */
public class o implements Handler.Callback {

    /* renamed from: G, reason: collision with root package name */
    private static final b f923G = new a();

    /* renamed from: B, reason: collision with root package name */
    private volatile com.bumptech.glide.k f924B;

    /* renamed from: C, reason: collision with root package name */
    private final b f925C;

    /* renamed from: D, reason: collision with root package name */
    private final C4391a<View, Fragment> f926D = new C4391a<>();

    /* renamed from: E, reason: collision with root package name */
    private final i f927E;

    /* renamed from: F, reason: collision with root package name */
    private final m f928F;

    /* compiled from: RequestManagerRetriever.java */
    class a implements b {
        a() {
        }

        @Override // A6.o.b
        public com.bumptech.glide.k a(com.bumptech.glide.b bVar, j jVar, p pVar, Context context) {
            return new com.bumptech.glide.k(bVar, jVar, pVar, context);
        }
    }

    /* compiled from: RequestManagerRetriever.java */
    public interface b {
        com.bumptech.glide.k a(com.bumptech.glide.b bVar, j jVar, p pVar, Context context);
    }

    public o(b bVar) {
        bVar = bVar == null ? f923G : bVar;
        this.f925C = bVar;
        this.f928F = new m(bVar);
        this.f927E = b();
    }

    @TargetApi(17)
    private static void a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static i b() {
        return (t.f33359f && t.f33358e) ? new h() : new f();
    }

    private static Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private com.bumptech.glide.k f(Context context) {
        if (this.f924B == null) {
            synchronized (this) {
                try {
                    if (this.f924B == null) {
                        this.f924B = this.f925C.a(com.bumptech.glide.b.c(context.getApplicationContext()), new A6.a(), new g(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f924B;
    }

    private static boolean g(Context context) {
        Activity activityC = c(context);
        return activityC == null || !activityC.isFinishing();
    }

    public com.bumptech.glide.k d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (H6.l.r() && !(context instanceof Application)) {
            if (context instanceof androidx.fragment.app.o) {
                return e((androidx.fragment.app.o) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return d(contextWrapper.getBaseContext());
                }
            }
        }
        return f(context);
    }

    public com.bumptech.glide.k e(androidx.fragment.app.o oVar) {
        if (H6.l.q()) {
            return d(oVar.getApplicationContext());
        }
        a(oVar);
        this.f927E.a(oVar);
        boolean zG = g(oVar);
        return this.f928F.b(oVar, com.bumptech.glide.b.c(oVar.getApplicationContext()), oVar.getLifecycle(), oVar.w0(), zG);
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public boolean handleMessage(Message message) {
        return false;
    }
}
