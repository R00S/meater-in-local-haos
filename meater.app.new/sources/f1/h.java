package f1;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.AbstractC2106m;
import android.view.C2116x;
import android.view.InterfaceC2114v;
import android.view.KeyEvent;
import android.view.L;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import s.X;
import s1.C4458t;

/* compiled from: ComponentActivity.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fH\u0015¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0004¢\u0006\u0004\b\u0019\u0010\u000bR.\u0010 \u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b\u0012\u0004\u0012\u00020\u001c0\u001a8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010\u0005R\u001a\u0010%\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\"\u0010#\u0012\u0004\b$\u0010\u0005R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lf1/h;", "Landroid/app/Activity;", "Landroidx/lifecycle/v;", "Ls1/t$a;", "<init>", "()V", "", "", "args", "", "O", "([Ljava/lang/String;)Z", "Landroid/os/Bundle;", "savedInstanceState", "Loa/F;", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "Landroid/view/KeyEvent;", "event", "F", "(Landroid/view/KeyEvent;)Z", "dispatchKeyShortcutEvent", "dispatchKeyEvent", "N", "Ls/X;", "Ljava/lang/Class;", "", "B", "Ls/X;", "getExtraDataMap$annotations", "extraDataMap", "Landroidx/lifecycle/x;", "C", "Landroidx/lifecycle/x;", "getLifecycleRegistry$annotations", "lifecycleRegistry", "Landroidx/lifecycle/m;", "getLifecycle", "()Landroidx/lifecycle/m;", "lifecycle", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class h extends Activity implements InterfaceC2114v, C4458t.a {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final X<Class<Object>, Object> extraDataMap = new X<>(0, 1, null);

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final C2116x lifecycleRegistry = new C2116x(this);

    private final boolean O(String[] args) {
        if (args == null || args.length == 0) {
            return false;
        }
        String str = args[0];
        switch (str.hashCode()) {
            case -645125871:
                return str.equals("--translation") && Build.VERSION.SDK_INT >= 31;
            case 100470631:
                if (!str.equals("--dump-dumpable")) {
                    return false;
                }
                break;
            case 472614934:
                if (!str.equals("--list-dumpables")) {
                    return false;
                }
                break;
            case 1159329357:
                return str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29;
            case 1455016274:
                return str.equals("--autofill");
            default:
                return false;
        }
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // s1.C4458t.a
    public boolean F(KeyEvent event) {
        C3862t.g(event, "event");
        return super.dispatchKeyEvent(event);
    }

    protected final boolean N(String[] args) {
        return !O(args);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        C3862t.g(event, "event");
        View decorView = getWindow().getDecorView();
        C3862t.f(decorView, "window.decorView");
        if (C4458t.d(decorView, event)) {
            return true;
        }
        return C4458t.e(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        C3862t.g(event, "event");
        View decorView = getWindow().getDecorView();
        C3862t.f(decorView, "window.decorView");
        if (C4458t.d(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    public AbstractC2106m getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        L.INSTANCE.c(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        C3862t.g(outState, "outState");
        this.lifecycleRegistry.n(AbstractC2106m.b.CREATED);
        super.onSaveInstanceState(outState);
    }
}
