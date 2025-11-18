package H3;

import F3.j;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import r1.InterfaceC4334a;

/* compiled from: ExtensionWindowBackendApi2.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00060\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001d"}, d2 = {"LH3/e;", "LG3/a;", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "component", "<init>", "(Landroidx/window/extensions/layout/WindowLayoutComponent;)V", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "executor", "Lr1/a;", "LF3/j;", "callback", "Loa/F;", "a", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Lr1/a;)V", "b", "(Lr1/a;)V", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "", "Landroidx/window/layout/adapter/extensions/MulticastConsumer;", "c", "Ljava/util/Map;", "contextToListeners", "d", "listenerToContext", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e implements G3.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final WindowLayoutComponent component;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ReentrantLock globalLock;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<Context, MulticastConsumer> contextToListeners;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<InterfaceC4334a<j>, Context> listenerToContext;

    public e(WindowLayoutComponent component) {
        C3862t.g(component, "component");
        this.component = component;
        this.globalLock = new ReentrantLock();
        this.contextToListeners = new LinkedHashMap();
        this.listenerToContext = new LinkedHashMap();
    }

    @Override // G3.a
    public void a(Context context, Executor executor, InterfaceC4334a<j> callback) {
        C4153F c4153f;
        C3862t.g(context, "context");
        C3862t.g(executor, "executor");
        C3862t.g(callback, "callback");
        ReentrantLock reentrantLock = this.globalLock;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = this.contextToListeners.get(context);
            if (multicastConsumer != null) {
                multicastConsumer.a(callback);
                this.listenerToContext.put(callback, context);
                c4153f = C4153F.f46609a;
            } else {
                c4153f = null;
            }
            if (c4153f == null) {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                this.contextToListeners.put(context, multicastConsumer2);
                this.listenerToContext.put(callback, context);
                multicastConsumer2.a(callback);
                this.component.addWindowLayoutInfoListener(context, multicastConsumer2);
            }
            C4153F c4153f2 = C4153F.f46609a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // G3.a
    public void b(InterfaceC4334a<j> callback) {
        C3862t.g(callback, "callback");
        ReentrantLock reentrantLock = this.globalLock;
        reentrantLock.lock();
        try {
            Context context = this.listenerToContext.get(callback);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            MulticastConsumer multicastConsumer = this.contextToListeners.get(context);
            if (multicastConsumer == null) {
                reentrantLock.unlock();
                return;
            }
            multicastConsumer.c(callback);
            this.listenerToContext.remove(callback);
            if (multicastConsumer.b()) {
                this.contextToListeners.remove(context);
                this.component.removeWindowLayoutInfoListener(multicastConsumer);
            }
            C4153F c4153f = C4153F.f46609a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
