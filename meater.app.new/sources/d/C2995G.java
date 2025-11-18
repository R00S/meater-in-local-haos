package d;

import android.os.Build;
import android.view.AbstractC2106m;
import android.view.InterfaceC2111s;
import android.view.InterfaceC2114v;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import d.C2995G;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.C3830k;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3860q;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import r1.InterfaceC4334a;

/* compiled from: OnBackPressedDispatcher.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u000458#\u001cB!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0015\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0007¢\u0006\u0004\b%\u0010\u000fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001a0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u00109¨\u0006<"}, d2 = {"Ld/G;", "", "Ljava/lang/Runnable;", "fallbackOnBackPressed", "Lr1/a;", "", "onHasEnabledCallbacksChanged", "<init>", "(Ljava/lang/Runnable;Lr1/a;)V", "(Ljava/lang/Runnable;)V", "shouldBeRegistered", "Loa/F;", "p", "(Z)V", "q", "()V", "Ld/b;", "backEvent", "n", "(Ld/b;)V", "m", "k", "Landroid/window/OnBackInvokedDispatcher;", "invoker", "o", "(Landroid/window/OnBackInvokedDispatcher;)V", "Ld/F;", "onBackPressedCallback", "i", "(Ld/F;)V", "Ld/c;", "j", "(Ld/F;)Ld/c;", "Landroidx/lifecycle/v;", "owner", "h", "(Landroidx/lifecycle/v;Ld/F;)V", "l", "a", "Ljava/lang/Runnable;", "b", "Lr1/a;", "Lkotlin/collections/k;", "c", "Lkotlin/collections/k;", "onBackPressedCallbacks", "d", "Ld/F;", "inProgressCallback", "Landroid/window/OnBackInvokedCallback;", "e", "Landroid/window/OnBackInvokedCallback;", "onBackInvokedCallback", "f", "Landroid/window/OnBackInvokedDispatcher;", "invokedDispatcher", "g", "Z", "backInvokedCallbackRegistered", "hasEnabledCallbacks", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: d.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2995G {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Runnable fallbackOnBackPressed;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4334a<Boolean> onHasEnabledCallbacksChanged;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C3830k<AbstractC2994F> onBackPressedCallbacks;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private AbstractC2994F inProgressCallback;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private OnBackInvokedCallback onBackInvokedCallback;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private OnBackInvokedDispatcher invokedDispatcher;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean backInvokedCallbackRegistered;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean hasEnabledCallbacks;

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld/b;", "backEvent", "Loa/F;", "a", "(Ld/b;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: d.G$a */
    static final class a extends AbstractC3864v implements Ba.l<C2998b, C4153F> {
        a() {
            super(1);
        }

        public final void a(C2998b backEvent) {
            C3862t.g(backEvent, "backEvent");
            C2995G.this.n(backEvent);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C2998b c2998b) {
            a(c2998b);
            return C4153F.f46609a;
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld/b;", "backEvent", "Loa/F;", "a", "(Ld/b;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: d.G$b */
    static final class b extends AbstractC3864v implements Ba.l<C2998b, C4153F> {
        b() {
            super(1);
        }

        public final void a(C2998b backEvent) {
            C3862t.g(backEvent, "backEvent");
            C2995G.this.m(backEvent);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C2998b c2998b) {
            a(c2998b);
            return C4153F.f46609a;
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: d.G$c */
    static final class c extends AbstractC3864v implements Ba.a<C4153F> {
        c() {
            super(0);
        }

        public final void a() {
            C2995G.this.l();
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: d.G$d */
    static final class d extends AbstractC3864v implements Ba.a<C4153F> {
        d() {
            super(0);
        }

        public final void a() {
            C2995G.this.k();
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: d.G$e */
    static final class e extends AbstractC3864v implements Ba.a<C4153F> {
        e() {
            super(0);
        }

        public final void a() {
            C2995G.this.l();
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ld/G$f;", "", "<init>", "()V", "dispatcher", "", "priority", "callback", "Loa/F;", "d", "(Ljava/lang/Object;ILjava/lang/Object;)V", "e", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/Function0;", "onBackInvoked", "Landroid/window/OnBackInvokedCallback;", "b", "(LBa/a;)Landroid/window/OnBackInvokedCallback;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d.G$f */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f39532a = new f();

        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(Ba.a onBackInvoked) {
            C3862t.g(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        public final OnBackInvokedCallback b(final Ba.a<C4153F> onBackInvoked) {
            C3862t.g(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: d.H
                public final void onBackInvoked() {
                    C2995G.f.c(onBackInvoked);
                }
            };
        }

        public final void d(Object dispatcher, int priority, Object callback) {
            C3862t.g(dispatcher, "dispatcher");
            C3862t.g(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(priority, (OnBackInvokedCallback) callback);
        }

        public final void e(Object dispatcher, Object callback) {
            C3862t.g(dispatcher, "dispatcher");
            C3862t.g(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JS\u0010\r\u001a\u00020\f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ld/G$g;", "", "<init>", "()V", "Lkotlin/Function1;", "Ld/b;", "Loa/F;", "onBackStarted", "onBackProgressed", "Lkotlin/Function0;", "onBackInvoked", "onBackCancelled", "Landroid/window/OnBackInvokedCallback;", "a", "(LBa/l;LBa/l;LBa/a;LBa/a;)Landroid/window/OnBackInvokedCallback;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d.G$g */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public static final g f39533a = new g();

        /* compiled from: OnBackPressedDispatcher.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"d/G$g$a", "Landroid/window/OnBackAnimationCallback;", "Landroid/window/BackEvent;", "backEvent", "Loa/F;", "onBackStarted", "(Landroid/window/BackEvent;)V", "onBackProgressed", "onBackInvoked", "()V", "onBackCancelled", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: d.G$g$a */
        public static final class a implements OnBackAnimationCallback {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ba.l<C2998b, C4153F> f39534a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ba.l<C2998b, C4153F> f39535b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ba.a<C4153F> f39536c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Ba.a<C4153F> f39537d;

            /* JADX WARN: Multi-variable type inference failed */
            a(Ba.l<? super C2998b, C4153F> lVar, Ba.l<? super C2998b, C4153F> lVar2, Ba.a<C4153F> aVar, Ba.a<C4153F> aVar2) {
                this.f39534a = lVar;
                this.f39535b = lVar2;
                this.f39536c = aVar;
                this.f39537d = aVar2;
            }

            public void onBackCancelled() {
                this.f39537d.invoke();
            }

            public void onBackInvoked() {
                this.f39536c.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                C3862t.g(backEvent, "backEvent");
                this.f39535b.invoke(new C2998b(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                C3862t.g(backEvent, "backEvent");
                this.f39534a.invoke(new C2998b(backEvent));
            }
        }

        private g() {
        }

        public final OnBackInvokedCallback a(Ba.l<? super C2998b, C4153F> onBackStarted, Ba.l<? super C2998b, C4153F> onBackProgressed, Ba.a<C4153F> onBackInvoked, Ba.a<C4153F> onBackCancelled) {
            C3862t.g(onBackStarted, "onBackStarted");
            C3862t.g(onBackProgressed, "onBackProgressed");
            C3862t.g(onBackInvoked, "onBackInvoked");
            C3862t.g(onBackCancelled, "onBackCancelled");
            return new a(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ld/G$h;", "Landroidx/lifecycle/s;", "Ld/c;", "Landroidx/lifecycle/m;", "lifecycle", "Ld/F;", "onBackPressedCallback", "<init>", "(Ld/G;Landroidx/lifecycle/m;Ld/F;)V", "Landroidx/lifecycle/v;", "source", "Landroidx/lifecycle/m$a;", "event", "Loa/F;", "f", "(Landroidx/lifecycle/v;Landroidx/lifecycle/m$a;)V", "cancel", "()V", "B", "Landroidx/lifecycle/m;", "C", "Ld/F;", "D", "Ld/c;", "currentCancellable", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d.G$h */
    private final class h implements InterfaceC2111s, InterfaceC2999c {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final AbstractC2106m lifecycle;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private final AbstractC2994F onBackPressedCallback;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private InterfaceC2999c currentCancellable;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ C2995G f39541E;

        public h(C2995G c2995g, AbstractC2106m lifecycle, AbstractC2994F onBackPressedCallback) {
            C3862t.g(lifecycle, "lifecycle");
            C3862t.g(onBackPressedCallback, "onBackPressedCallback");
            this.f39541E = c2995g;
            this.lifecycle = lifecycle;
            this.onBackPressedCallback = onBackPressedCallback;
            lifecycle.a(this);
        }

        @Override // d.InterfaceC2999c
        public void cancel() {
            this.lifecycle.d(this);
            this.onBackPressedCallback.i(this);
            InterfaceC2999c interfaceC2999c = this.currentCancellable;
            if (interfaceC2999c != null) {
                interfaceC2999c.cancel();
            }
            this.currentCancellable = null;
        }

        @Override // android.view.InterfaceC2111s
        public void f(InterfaceC2114v source, AbstractC2106m.a event) {
            C3862t.g(source, "source");
            C3862t.g(event, "event");
            if (event == AbstractC2106m.a.ON_START) {
                this.currentCancellable = this.f39541E.j(this.onBackPressedCallback);
                return;
            }
            if (event != AbstractC2106m.a.ON_STOP) {
                if (event == AbstractC2106m.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                InterfaceC2999c interfaceC2999c = this.currentCancellable;
                if (interfaceC2999c != null) {
                    interfaceC2999c.cancel();
                }
            }
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ld/G$i;", "Ld/c;", "Ld/F;", "onBackPressedCallback", "<init>", "(Ld/G;Ld/F;)V", "Loa/F;", "cancel", "()V", "B", "Ld/F;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d.G$i */
    private final class i implements InterfaceC2999c {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final AbstractC2994F onBackPressedCallback;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C2995G f39543C;

        public i(C2995G c2995g, AbstractC2994F onBackPressedCallback) {
            C3862t.g(onBackPressedCallback, "onBackPressedCallback");
            this.f39543C = c2995g;
            this.onBackPressedCallback = onBackPressedCallback;
        }

        @Override // d.InterfaceC2999c
        public void cancel() {
            this.f39543C.onBackPressedCallbacks.remove(this.onBackPressedCallback);
            if (C3862t.b(this.f39543C.inProgressCallback, this.onBackPressedCallback)) {
                this.onBackPressedCallback.c();
                this.f39543C.inProgressCallback = null;
            }
            this.onBackPressedCallback.i(this);
            Ba.a<C4153F> aVarB = this.onBackPressedCallback.b();
            if (aVarB != null) {
                aVarB.invoke();
            }
            this.onBackPressedCallback.k(null);
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d.G$j */
    /* synthetic */ class j extends C3860q implements Ba.a<C4153F> {
        j(Object obj) {
            super(0, obj, C2995G.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public final void c() {
            ((C2995G) this.receiver).q();
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            c();
            return C4153F.f46609a;
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d.G$k */
    /* synthetic */ class k extends C3860q implements Ba.a<C4153F> {
        k(Object obj) {
            super(0, obj, C2995G.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public final void c() {
            ((C2995G) this.receiver).q();
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            c();
            return C4153F.f46609a;
        }
    }

    public C2995G() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        AbstractC2994F abstractC2994FPrevious;
        AbstractC2994F abstractC2994F = this.inProgressCallback;
        if (abstractC2994F == null) {
            C3830k<AbstractC2994F> c3830k = this.onBackPressedCallbacks;
            ListIterator<AbstractC2994F> listIterator = c3830k.listIterator(c3830k.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC2994FPrevious = null;
                    break;
                } else {
                    abstractC2994FPrevious = listIterator.previous();
                    if (abstractC2994FPrevious.getIsEnabled()) {
                        break;
                    }
                }
            }
            abstractC2994F = abstractC2994FPrevious;
        }
        this.inProgressCallback = null;
        if (abstractC2994F != null) {
            abstractC2994F.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(C2998b backEvent) {
        AbstractC2994F abstractC2994FPrevious;
        AbstractC2994F abstractC2994F = this.inProgressCallback;
        if (abstractC2994F == null) {
            C3830k<AbstractC2994F> c3830k = this.onBackPressedCallbacks;
            ListIterator<AbstractC2994F> listIterator = c3830k.listIterator(c3830k.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC2994FPrevious = null;
                    break;
                } else {
                    abstractC2994FPrevious = listIterator.previous();
                    if (abstractC2994FPrevious.getIsEnabled()) {
                        break;
                    }
                }
            }
            abstractC2994F = abstractC2994FPrevious;
        }
        if (abstractC2994F != null) {
            abstractC2994F.e(backEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(C2998b backEvent) {
        AbstractC2994F abstractC2994FPrevious;
        C3830k<AbstractC2994F> c3830k = this.onBackPressedCallbacks;
        ListIterator<AbstractC2994F> listIterator = c3830k.listIterator(c3830k.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                abstractC2994FPrevious = null;
                break;
            } else {
                abstractC2994FPrevious = listIterator.previous();
                if (abstractC2994FPrevious.getIsEnabled()) {
                    break;
                }
            }
        }
        AbstractC2994F abstractC2994F = abstractC2994FPrevious;
        if (this.inProgressCallback != null) {
            k();
        }
        this.inProgressCallback = abstractC2994F;
        if (abstractC2994F != null) {
            abstractC2994F.f(backEvent);
        }
    }

    private final void p(boolean shouldBeRegistered) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.invokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback = this.onBackInvokedCallback;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (shouldBeRegistered && !this.backInvokedCallbackRegistered) {
            f.f39532a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.backInvokedCallbackRegistered = true;
        } else {
            if (shouldBeRegistered || !this.backInvokedCallbackRegistered) {
                return;
            }
            f.f39532a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.backInvokedCallbackRegistered = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        boolean z10 = this.hasEnabledCallbacks;
        C3830k<AbstractC2994F> c3830k = this.onBackPressedCallbacks;
        boolean z11 = false;
        if (c3830k == null || !c3830k.isEmpty()) {
            Iterator<AbstractC2994F> it = c3830k.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().getIsEnabled()) {
                    z11 = true;
                    break;
                }
            }
        }
        this.hasEnabledCallbacks = z11;
        if (z11 != z10) {
            InterfaceC4334a<Boolean> interfaceC4334a = this.onHasEnabledCallbacksChanged;
            if (interfaceC4334a != null) {
                interfaceC4334a.accept(Boolean.valueOf(z11));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                p(z11);
            }
        }
    }

    public final void h(InterfaceC2114v owner, AbstractC2994F onBackPressedCallback) {
        C3862t.g(owner, "owner");
        C3862t.g(onBackPressedCallback, "onBackPressedCallback");
        AbstractC2106m lifecycle = owner.getLifecycle();
        if (lifecycle.getState() == AbstractC2106m.b.DESTROYED) {
            return;
        }
        onBackPressedCallback.a(new h(this, lifecycle, onBackPressedCallback));
        q();
        onBackPressedCallback.k(new j(this));
    }

    public final void i(AbstractC2994F onBackPressedCallback) {
        C3862t.g(onBackPressedCallback, "onBackPressedCallback");
        j(onBackPressedCallback);
    }

    public final InterfaceC2999c j(AbstractC2994F onBackPressedCallback) {
        C3862t.g(onBackPressedCallback, "onBackPressedCallback");
        this.onBackPressedCallbacks.add(onBackPressedCallback);
        i iVar = new i(this, onBackPressedCallback);
        onBackPressedCallback.a(iVar);
        q();
        onBackPressedCallback.k(new k(this));
        return iVar;
    }

    public final void l() {
        AbstractC2994F abstractC2994FPrevious;
        AbstractC2994F abstractC2994F = this.inProgressCallback;
        if (abstractC2994F == null) {
            C3830k<AbstractC2994F> c3830k = this.onBackPressedCallbacks;
            ListIterator<AbstractC2994F> listIterator = c3830k.listIterator(c3830k.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC2994FPrevious = null;
                    break;
                } else {
                    abstractC2994FPrevious = listIterator.previous();
                    if (abstractC2994FPrevious.getIsEnabled()) {
                        break;
                    }
                }
            }
            abstractC2994F = abstractC2994FPrevious;
        }
        this.inProgressCallback = null;
        if (abstractC2994F != null) {
            abstractC2994F.d();
            return;
        }
        Runnable runnable = this.fallbackOnBackPressed;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void o(OnBackInvokedDispatcher invoker) {
        C3862t.g(invoker, "invoker");
        this.invokedDispatcher = invoker;
        p(this.hasEnabledCallbacks);
    }

    public C2995G(Runnable runnable, InterfaceC4334a<Boolean> interfaceC4334a) {
        this.fallbackOnBackPressed = runnable;
        this.onHasEnabledCallbacksChanged = interfaceC4334a;
        this.onBackPressedCallbacks = new C3830k<>();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            this.onBackInvokedCallback = i10 >= 34 ? g.f39533a.a(new a(), new b(), new c(), new d()) : f.f39532a.b(new e());
        }
    }

    public /* synthetic */ C2995G(Runnable runnable, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? null : runnable);
    }

    public C2995G(Runnable runnable) {
        this(runnable, null);
    }
}
