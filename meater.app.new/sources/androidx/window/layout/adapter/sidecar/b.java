package androidx.window.layout.adapter.sidecar;

import E3.k;
import F3.j;
import android.app.Activity;
import android.content.Context;
import androidx.window.layout.adapter.sidecar.a;
import androidx.window.layout.adapter.sidecar.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import r1.InterfaceC4334a;

/* compiled from: SidecarWindowBackend.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 %2\u00020\u0001:\u0003\u0015\u0017%B\u0013\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u0005R&\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Landroidx/window/layout/adapter/sidecar/b;", "LG3/a;", "Landroidx/window/layout/adapter/sidecar/a;", "windowExtension", "<init>", "(Landroidx/window/layout/adapter/sidecar/a;)V", "Landroid/app/Activity;", "activity", "", "h", "(Landroid/app/Activity;)Z", "Loa/F;", "f", "(Landroid/app/Activity;)V", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "executor", "Lr1/a;", "LF3/j;", "callback", "a", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Lr1/a;)V", "b", "(Lr1/a;)V", "Landroidx/window/layout/adapter/sidecar/a;", "getWindowExtension", "()Landroidx/window/layout/adapter/sidecar/a;", "setWindowExtension", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/window/layout/adapter/sidecar/b$c;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "g", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getWindowLayoutChangeCallbacks$annotations", "()V", "windowLayoutChangeCallbacks", "c", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b implements G3.a {

    /* renamed from: d, reason: collision with root package name */
    private static volatile b f29867d;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private a windowExtension;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<c> windowLayoutChangeCallbacks = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    private static final ReentrantLock f29868e = new ReentrantLock();

    /* compiled from: SidecarWindowBackend.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/window/layout/adapter/sidecar/b$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/window/layout/adapter/sidecar/b;", "a", "(Landroid/content/Context;)Landroidx/window/layout/adapter/sidecar/b;", "Landroidx/window/layout/adapter/sidecar/a;", "b", "(Landroid/content/Context;)Landroidx/window/layout/adapter/sidecar/a;", "LE3/k;", "sidecarVersion", "", "c", "(LE3/k;)Z", "DEBUG", "Z", "", "TAG", "Ljava/lang/String;", "globalInstance", "Landroidx/window/layout/adapter/sidecar/b;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.window.layout.adapter.sidecar.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final b a(Context context) {
            C3862t.g(context, "context");
            if (b.f29867d == null) {
                ReentrantLock reentrantLock = b.f29868e;
                reentrantLock.lock();
                try {
                    if (b.f29867d == null) {
                        b.f29867d = new b(b.INSTANCE.b(context));
                    }
                    C4153F c4153f = C4153F.f46609a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            b bVar = b.f29867d;
            C3862t.d(bVar);
            return bVar;
        }

        public final a b(Context context) {
            C3862t.g(context, "context");
            try {
                if (!c(SidecarCompat.INSTANCE.c())) {
                    return null;
                }
                SidecarCompat sidecarCompat = new SidecarCompat(context);
                if (sidecarCompat.n()) {
                    return sidecarCompat;
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        public final boolean c(k sidecarVersion) {
            return sidecarVersion != null && sidecarVersion.compareTo(k.INSTANCE.a()) >= 0;
        }

        private Companion() {
        }
    }

    /* compiled from: SidecarWindowBackend.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/window/layout/adapter/sidecar/b$b;", "Landroidx/window/layout/adapter/sidecar/a$a;", "<init>", "(Landroidx/window/layout/adapter/sidecar/b;)V", "Landroid/app/Activity;", "activity", "LF3/j;", "newLayout", "Loa/F;", "a", "(Landroid/app/Activity;LF3/j;)V", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.window.layout.adapter.sidecar.b$b, reason: collision with other inner class name */
    public final class C0417b implements a.InterfaceC0416a {
        public C0417b() {
        }

        @Override // androidx.window.layout.adapter.sidecar.a.InterfaceC0416a
        public void a(Activity activity, j newLayout) {
            C3862t.g(activity, "activity");
            C3862t.g(newLayout, "newLayout");
            Iterator<c> it = b.this.g().iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (C3862t.b(next.getActivity(), activity)) {
                    next.b(newLayout);
                }
            }
        }
    }

    /* compiled from: SidecarWindowBackend.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u000e¨\u0006\u001d"}, d2 = {"Landroidx/window/layout/adapter/sidecar/b$c;", "", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Lr1/a;", "LF3/j;", "callback", "<init>", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Lr1/a;)V", "newLayoutInfo", "Loa/F;", "b", "(LF3/j;)V", "a", "Landroid/app/Activity;", "d", "()Landroid/app/Activity;", "Ljava/util/concurrent/Executor;", "c", "Lr1/a;", "e", "()Lr1/a;", "LF3/j;", "f", "()LF3/j;", "setLastInfo", "lastInfo", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Activity activity;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Executor executor;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC4334a<j> callback;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private j lastInfo;

        public c(Activity activity, Executor executor, InterfaceC4334a<j> callback) {
            C3862t.g(activity, "activity");
            C3862t.g(executor, "executor");
            C3862t.g(callback, "callback");
            this.activity = activity;
            this.executor = executor;
            this.callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(c this$0, j newLayoutInfo) {
            C3862t.g(this$0, "this$0");
            C3862t.g(newLayoutInfo, "$newLayoutInfo");
            this$0.callback.accept(newLayoutInfo);
        }

        public final void b(final j newLayoutInfo) {
            C3862t.g(newLayoutInfo, "newLayoutInfo");
            this.lastInfo = newLayoutInfo;
            this.executor.execute(new Runnable() { // from class: I3.c
                @Override // java.lang.Runnable
                public final void run() {
                    b.c.c(this.f6676B, newLayoutInfo);
                }
            });
        }

        /* renamed from: d, reason: from getter */
        public final Activity getActivity() {
            return this.activity;
        }

        public final InterfaceC4334a<j> e() {
            return this.callback;
        }

        /* renamed from: f, reason: from getter */
        public final j getLastInfo() {
            return this.lastInfo;
        }
    }

    public b(a aVar) {
        this.windowExtension = aVar;
        a aVar2 = this.windowExtension;
        if (aVar2 != null) {
            aVar2.a(new C0417b());
        }
    }

    private final void f(Activity activity) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (C3862t.b(((c) it.next()).getActivity(), activity)) {
                    return;
                }
            }
        }
        a aVar = this.windowExtension;
        if (aVar != null) {
            aVar.c(activity);
        }
    }

    private final boolean h(Activity activity) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (C3862t.b(((c) it.next()).getActivity(), activity)) {
                return true;
            }
        }
        return false;
    }

    @Override // G3.a
    public void a(Context context, Executor executor, InterfaceC4334a<j> callback) {
        Object next;
        C3862t.g(context, "context");
        C3862t.g(executor, "executor");
        C3862t.g(callback, "callback");
        C4153F c4153f = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            ReentrantLock reentrantLock = f29868e;
            reentrantLock.lock();
            try {
                a aVar = this.windowExtension;
                if (aVar == null) {
                    callback.accept(new j(r.m()));
                    return;
                }
                boolean zH = h(activity);
                c cVar = new c(activity, executor, callback);
                this.windowLayoutChangeCallbacks.add(cVar);
                if (zH) {
                    Iterator<T> it = this.windowLayoutChangeCallbacks.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            if (C3862t.b(activity, ((c) next).getActivity())) {
                                break;
                            }
                        }
                    }
                    c cVar2 = (c) next;
                    j lastInfo = cVar2 != null ? cVar2.getLastInfo() : null;
                    if (lastInfo != null) {
                        cVar.b(lastInfo);
                    }
                } else {
                    aVar.b(activity);
                }
                C4153F c4153f2 = C4153F.f46609a;
                reentrantLock.unlock();
                c4153f = C4153F.f46609a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (c4153f == null) {
            callback.accept(new j(r.m()));
        }
    }

    @Override // G3.a
    public void b(InterfaceC4334a<j> callback) {
        C3862t.g(callback, "callback");
        synchronized (f29868e) {
            try {
                if (this.windowExtension == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<c> it = this.windowLayoutChangeCallbacks.iterator();
                while (it.hasNext()) {
                    c callbackWrapper = it.next();
                    if (callbackWrapper.e() == callback) {
                        C3862t.f(callbackWrapper, "callbackWrapper");
                        arrayList.add(callbackWrapper);
                    }
                }
                this.windowLayoutChangeCallbacks.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    f(((c) it2.next()).getActivity());
                }
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final CopyOnWriteArrayList<c> g() {
        return this.windowLayoutChangeCallbacks;
    }
}
