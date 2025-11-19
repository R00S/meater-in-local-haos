package H3;

import Ba.l;
import E3.d;
import F3.j;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3860q;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import oa.C4153F;
import r1.InterfaceC4334a;

/* compiled from: ExtensionWindowBackendApi1.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR&\u0010 \u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\b0\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020!0\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001d¨\u0006$"}, d2 = {"LH3/d;", "LG3/a;", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "component", "LE3/d;", "consumerAdapter", "<init>", "(Landroidx/window/extensions/layout/WindowLayoutComponent;LE3/d;)V", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "executor", "Lr1/a;", "LF3/j;", "callback", "Loa/F;", "a", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Lr1/a;)V", "b", "(Lr1/a;)V", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "LE3/d;", "Ljava/util/concurrent/locks/ReentrantLock;", "c", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "", "Landroidx/window/layout/adapter/extensions/MulticastConsumer;", "d", "Ljava/util/Map;", "contextToListeners", "e", "listenerToContext", "LE3/d$b;", "f", "consumerToToken", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d implements G3.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final WindowLayoutComponent component;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final E3.d consumerAdapter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ReentrantLock globalLock;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<Context, MulticastConsumer> contextToListeners;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<InterfaceC4334a<j>, Context> listenerToContext;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Map<MulticastConsumer, d.b> consumerToToken;

    /* compiled from: ExtensionWindowBackendApi1.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends C3860q implements l<WindowLayoutInfo, C4153F> {
        a(Object obj) {
            super(1, obj, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
        }

        public final void c(WindowLayoutInfo p02) {
            C3862t.g(p02, "p0");
            ((MulticastConsumer) this.receiver).accept(p02);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(WindowLayoutInfo windowLayoutInfo) {
            c(windowLayoutInfo);
            return C4153F.f46609a;
        }
    }

    public d(WindowLayoutComponent component, E3.d consumerAdapter) {
        C3862t.g(component, "component");
        C3862t.g(consumerAdapter, "consumerAdapter");
        this.component = component;
        this.consumerAdapter = consumerAdapter;
        this.globalLock = new ReentrantLock();
        this.contextToListeners = new LinkedHashMap();
        this.listenerToContext = new LinkedHashMap();
        this.consumerToToken = new LinkedHashMap();
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
                if (!(context instanceof Activity)) {
                    multicastConsumer2.accept(new WindowLayoutInfo(r.m()));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.consumerToToken.put(multicastConsumer2, this.consumerAdapter.c(this.component, P.b(WindowLayoutInfo.class), "addWindowLayoutInfoListener", "removeWindowLayoutInfoListener", (Activity) context, new a(multicastConsumer2)));
                }
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
                d.b bVarRemove = this.consumerToToken.remove(multicastConsumer);
                if (bVarRemove != null) {
                    bVarRemove.c();
                }
            }
            C4153F c4153f = C4153F.f46609a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
