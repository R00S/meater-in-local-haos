package androidx.window.layout.adapter.extensions;

import F3.j;
import H3.f;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import r1.InterfaceC4334a;

/* compiled from: MulticastConsumer.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0001¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00010\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/window/layout/adapter/extensions/MulticastConsumer;", "Lr1/a;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "Landroidx/window/extensions/core/util/function/Consumer;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "value", "Loa/F;", "accept", "(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", "LF3/j;", "listener", "a", "(Lr1/a;)V", "c", "", "b", "()Z", "Landroid/content/Context;", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "LF3/j;", "lastKnownValue", "", "d", "Ljava/util/Set;", "registeredListeners", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MulticastConsumer implements InterfaceC4334a<WindowLayoutInfo>, Consumer<WindowLayoutInfo> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ReentrantLock globalLock;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private j lastKnownValue;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Set<InterfaceC4334a<j>> registeredListeners;

    public MulticastConsumer(Context context) {
        C3862t.g(context, "context");
        this.context = context;
        this.globalLock = new ReentrantLock();
        this.registeredListeners = new LinkedHashSet();
    }

    public final void a(InterfaceC4334a<j> listener) {
        C3862t.g(listener, "listener");
        ReentrantLock reentrantLock = this.globalLock;
        reentrantLock.lock();
        try {
            j jVar = this.lastKnownValue;
            if (jVar != null) {
                listener.accept(jVar);
            }
            this.registeredListeners.add(listener);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean b() {
        return this.registeredListeners.isEmpty();
    }

    public final void c(InterfaceC4334a<j> listener) {
        C3862t.g(listener, "listener");
        ReentrantLock reentrantLock = this.globalLock;
        reentrantLock.lock();
        try {
            this.registeredListeners.remove(listener);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // r1.InterfaceC4334a
    public void accept(WindowLayoutInfo value) {
        C3862t.g(value, "value");
        ReentrantLock reentrantLock = this.globalLock;
        reentrantLock.lock();
        try {
            j jVarC = f.f5505a.c(this.context, value);
            this.lastKnownValue = jVarC;
            Iterator<T> it = this.registeredListeners.iterator();
            while (it.hasNext()) {
                ((InterfaceC4334a) it.next()).accept(jVarC);
            }
            C4153F c4153f = C4153F.f46609a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
