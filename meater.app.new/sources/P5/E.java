package P5;

import android.app.Activity;
import android.content.ContentResolver;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.Window;
import android.view.WindowManager;
import com.apptionlabs.meater_app.data.Config;
import kotlin.Metadata;

/* compiled from: ScreenDimmer.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"LP5/E;", "", "<init>", "()V", "Loa/F;", "g", "h", "i", "", "enable", "b", "(Z)V", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Ljava/lang/Runnable;", "c", "Ljava/lang/Runnable;", "runnable", "", "d", "()F", "screenBrightness", "Landroid/app/Activity;", "()Landroid/app/Activity;", "currentActivity", "e", "()Z", "shouldDimScreen", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public static final E f13990a = new E();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Handler handler = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Runnable runnable = new Runnable() { // from class: P5.D
        @Override // java.lang.Runnable
        public final void run() {
            E.f();
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final int f13993d;

    static {
        g();
        f13993d = 8;
    }

    private E() {
    }

    private final void b(boolean enable) {
        Window window;
        U4.b.q("ScreenDimmer: dimScreen enable: " + enable + " shouldDim: " + e(), new Object[0]);
        float f10 = enable ? 0.75f : -1.0f;
        if (enable && !e()) {
            U4.b.q("ScreenDimmer: dimScreen no longer in the right state to dim", new Object[0]);
            return;
        }
        Activity activityC = c();
        if (activityC == null || (window = activityC.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        float f11 = attributes.screenBrightness;
        if (f11 == f10) {
            U4.b.q("ScreenDimmer: dimScreen no need to set brightness " + f10 + " current brightness: " + f11, new Object[0]);
            return;
        }
        attributes.screenBrightness = f10;
        window.setAttributes(attributes);
        window.addFlags(4);
        U4.b.q("ScreenDimmer: dimScreen changed brightness from " + f11 + " to " + f10, new Object[0]);
    }

    private final Activity c() {
        return x4.g.k();
    }

    private final float d() {
        ContentResolver contentResolver;
        Activity activityC = c();
        if (activityC == null || (contentResolver = activityC.getContentResolver()) == null) {
            return -1.0f;
        }
        try {
            return Settings.System.getInt(contentResolver, "screen_brightness") / 255.0f;
        } catch (Settings.SettingNotFoundException unused) {
            return -1.0f;
        }
    }

    private final boolean e() {
        return !A.a() && M4.h.f11978a.x() && d() > 0.75f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f() {
        f13990a.b(true);
    }

    public static final void g() {
        E e10 = f13990a;
        if (e10.e()) {
            e10.h();
        } else {
            e10.i();
        }
    }

    private final void h() {
        Handler handler2 = handler;
        Runnable runnable2 = runnable;
        if (n1.i.b(handler2, runnable2)) {
            U4.b.q("ScreenDimmer: startTimer already attempting dim", new Object[0]);
        } else {
            U4.b.q("ScreenDimmer: startTimer", new Object[0]);
            handler2.postDelayed(runnable2, Config.MC_STATS_INTERVAL_MAX);
        }
    }

    private final void i() {
        U4.b.q("ScreenDimmer: stopTimer", new Object[0]);
        b(false);
        handler.removeCallbacks(runnable);
    }
}
