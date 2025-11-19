package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.profileinstaller.f;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import x3.InterfaceC5053a;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC5053a<b> {

    private static class a {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class b {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Context context, long j10) {
        g(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: p3.e
            @Override // java.lang.Runnable
            public final void run() throws PackageManager.NameNotFoundException {
                f.i(context);
            }
        });
    }

    @Override // x3.InterfaceC5053a
    public List<Class<? extends InterfaceC5053a<?>>> a() {
        return Collections.emptyList();
    }

    @Override // x3.InterfaceC5053a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public b b(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: p3.c
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                this.f47422B.h(applicationContext, j10);
            }
        });
        return new b();
    }

    void g(final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? a.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: p3.d
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.k(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}
