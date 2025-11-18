package F3;

import H3.a;
import ac.InterfaceC1970e;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import oa.C4165j;
import oa.InterfaceC4164i;

/* compiled from: WindowInfoTracker.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"LF3/f;", "", "Landroid/app/Activity;", "activity", "Lac/e;", "LF3/j;", "a", "(Landroid/app/Activity;)Lac/e;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f4504a;

    /* compiled from: WindowInfoTracker.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR#\u0010\u0015\u001a\u0004\u0018\u00010\u00118@X\u0080\u0084\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\u0012\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u000e\u0010\u0013R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LF3/f$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LF3/f;", "d", "(Landroid/content/Context;)LF3/f;", "", "b", "Z", "DEBUG", "", "c", "Ljava/lang/String;", "TAG", "LG3/a;", "Loa/i;", "()LG3/a;", "getExtensionBackend$window_release$annotations", "extensionBackend", "LF3/g;", "e", "LF3/g;", "decorator", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: F3.f$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final boolean DEBUG = false;

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f4504a = new Companion();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final String TAG = P.b(f.class).r();

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final InterfaceC4164i<G3.a> extensionBackend = C4165j.a(C0085a.f4509B);

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static g decorator = b.f4479a;

        /* compiled from: WindowInfoTracker.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LG3/a;", "a", "()LG3/a;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: F3.f$a$a, reason: collision with other inner class name */
        static final class C0085a extends AbstractC3864v implements Ba.a<G3.a> {

            /* renamed from: B, reason: collision with root package name */
            public static final C0085a f4509B = new C0085a();

            C0085a() {
                super(0);
            }

            @Override // Ba.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final G3.a invoke() {
                WindowLayoutComponent windowLayoutComponentG;
                try {
                    ClassLoader loader = f.class.getClassLoader();
                    e eVar = loader != null ? new e(loader, new E3.d(loader)) : null;
                    if (eVar == null || (windowLayoutComponentG = eVar.g()) == null) {
                        return null;
                    }
                    a.Companion companion = H3.a.INSTANCE;
                    C3862t.f(loader, "loader");
                    return companion.a(windowLayoutComponentG, new E3.d(loader));
                } catch (Throwable unused) {
                    if (!Companion.DEBUG) {
                        return null;
                    }
                    Log.d(Companion.TAG, "Failed to load WindowExtensions");
                    return null;
                }
            }
        }

        private Companion() {
        }

        public final G3.a c() {
            return extensionBackend.getValue();
        }

        public final f d(Context context) {
            C3862t.g(context, "context");
            G3.a aVarC = c();
            if (aVarC == null) {
                aVarC = androidx.window.layout.adapter.sidecar.b.INSTANCE.a(context);
            }
            return decorator.a(new i(o.f4526b, aVarC));
        }
    }

    InterfaceC1970e<j> a(Activity activity);
}
