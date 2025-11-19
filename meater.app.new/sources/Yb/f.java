package Yb;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4172q;
import oa.C4173r;

/* compiled from: HandlerDispatcher.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\"\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u000b\u0012\u0004\b\f\u0010\r\"\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroid/os/Handler;", "", "name", "LYb/e;", "b", "(Landroid/os/Handler;Ljava/lang/String;)LYb/e;", "Landroid/os/Looper;", "", "async", "a", "(Landroid/os/Looper;Z)Landroid/os/Handler;", "LYb/e;", "getMain$annotations", "()V", "Main", "Landroid/view/Choreographer;", "choreographer", "Landroid/view/Choreographer;", "kotlinx-coroutines-android"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final e f19548a;
    private static volatile Choreographer choreographer;

    static {
        Object objA;
        byte b10 = 0;
        byte b11 = 0;
        try {
            C4172q.Companion companion = C4172q.INSTANCE;
            objA = C4172q.a(new d(a(Looper.getMainLooper(), true), b11 == true ? 1 : 0, 2, b10 == true ? 1 : 0));
        } catch (Throwable th) {
            C4172q.Companion companion2 = C4172q.INSTANCE;
            objA = C4172q.a(C4173r.a(th));
        }
        f19548a = (e) (C4172q.c(objA) ? null : objA);
    }

    public static final Handler a(Looper looper, boolean z10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!z10) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            C3862t.e(objInvoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    public static final e b(Handler handler, String str) {
        return new d(handler, str);
    }
}
