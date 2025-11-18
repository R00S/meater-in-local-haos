package g7;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import c7.C2333b;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: g7.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3438i {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f42060a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static int f42061b = 9;

    /* renamed from: c, reason: collision with root package name */
    private static p0 f42062c = null;

    /* renamed from: d, reason: collision with root package name */
    static HandlerThread f42063d = null;

    /* renamed from: e, reason: collision with root package name */
    private static Executor f42064e = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f42065f = false;

    public static int a() {
        return 4225;
    }

    public static AbstractC3438i b(Context context) {
        synchronized (f42060a) {
            try {
                if (f42062c == null) {
                    f42062c = new p0(context.getApplicationContext(), f42065f ? c().getLooper() : context.getMainLooper(), f42064e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f42062c;
    }

    public static HandlerThread c() {
        synchronized (f42060a) {
            try {
                HandlerThread handlerThread = f42063d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", f42061b);
                f42063d = handlerThread2;
                handlerThread2.start();
                return f42063d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected abstract C2333b d(l0 l0Var, ServiceConnection serviceConnection, String str, Executor executor);

    protected abstract void e(l0 l0Var, ServiceConnection serviceConnection, String str);

    public final void f(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        e(new l0(str, str2, 4225, z10), serviceConnection, str3);
    }
}
