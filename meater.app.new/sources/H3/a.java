package H3;

import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: ExtensionWindowBackend.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LH3/a;", "LG3/a;", "a", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a implements G3.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: ExtensionWindowBackend.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LH3/a$a;", "", "<init>", "()V", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "component", "LE3/d;", "adapter", "LG3/a;", "a", "(Landroidx/window/extensions/layout/WindowLayoutComponent;LE3/d;)LG3/a;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: H3.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final G3.a a(WindowLayoutComponent component, E3.d adapter) {
            C3862t.g(component, "component");
            C3862t.g(adapter, "adapter");
            int iA = E3.e.f3829a.a();
            return iA >= 2 ? new e(component) : iA == 1 ? new d(component, adapter) : new c();
        }

        private Companion() {
        }
    }
}
