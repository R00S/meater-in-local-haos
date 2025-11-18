package E0;

import F0.ScrollAxisRange;
import F0.p;
import F0.s;
import Xb.C1841i;
import Xb.I;
import Xb.I0;
import Xb.J;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import h0.C3476g;
import h0.C3477h;
import i0.X0;
import java.util.function.Consumer;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;
import x0.C5047a;

/* compiled from: ComposeScrollCaptureCallback.android.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001!B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010\u001d\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"LE0/d;", "Landroid/view/ScrollCaptureCallback;", "LF0/p;", "node", "LU0/p;", "viewportBoundsInWindow", "LXb/I;", "coroutineScope", "LE0/d$a;", "listener", "<init>", "(LF0/p;LU0/p;LXb/I;LE0/d$a;)V", "Landroid/view/ScrollCaptureSession;", "session", "captureArea", "e", "(Landroid/view/ScrollCaptureSession;LU0/p;Lta/d;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "signal", "Ljava/util/function/Consumer;", "Landroid/graphics/Rect;", "onReady", "Loa/F;", "onScrollCaptureSearch", "(Landroid/os/CancellationSignal;Ljava/util/function/Consumer;)V", "Ljava/lang/Runnable;", "onScrollCaptureStart", "(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Ljava/lang/Runnable;)V", "onComplete", "onScrollCaptureImageRequest", "(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Landroid/graphics/Rect;Ljava/util/function/Consumer;)V", "onScrollCaptureEnd", "(Ljava/lang/Runnable;)V", "a", "LF0/p;", "b", "LU0/p;", "c", "LE0/d$a;", "d", "LXb/I;", "LE0/h;", "LE0/h;", "scrollTracker", "", "f", "I", "requestCount", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d implements ScrollCaptureCallback {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p node;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final U0.p viewportBoundsInWindow;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a listener;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final I coroutineScope;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h scrollTracker;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int requestCount;

    /* compiled from: ComposeScrollCaptureCallback.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"LE0/d$a;", "", "Loa/F;", "a", "()V", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
        void a();

        void b();
    }

    /* compiled from: ComposeScrollCaptureCallback.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", f = "ComposeScrollCaptureCallback.android.kt", l = {190}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f3759B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Runnable f3761D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable, InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f3761D = runnable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return d.this.new b(this.f3761D, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f3759B;
            if (i10 == 0) {
                C4173r.b(obj);
                h hVar = d.this.scrollTracker;
                this.f3759B = 1;
                if (hVar.g(0.0f, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            d.this.listener.b();
            this.f3761D.run();
            return C4153F.f46609a;
        }
    }

    /* compiled from: ComposeScrollCaptureCallback.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", f = "ComposeScrollCaptureCallback.android.kt", l = {116}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f3762B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ ScrollCaptureSession f3764D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Rect f3765E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Consumer<Rect> f3766F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer<Rect> consumer, InterfaceC4588d<? super c> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f3764D = scrollCaptureSession;
            this.f3765E = rect;
            this.f3766F = consumer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return d.this.new c(this.f3764D, this.f3765E, this.f3766F, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((c) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f3762B;
            if (i10 == 0) {
                C4173r.b(obj);
                d dVar = d.this;
                ScrollCaptureSession scrollCaptureSession = this.f3764D;
                U0.p pVarD = X0.d(this.f3765E);
                this.f3762B = 1;
                obj = dVar.e(scrollCaptureSession, pVarD, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            this.f3766F.accept(X0.a((U0.p) obj));
            return C4153F.f46609a;
        }
    }

    /* compiled from: ComposeScrollCaptureCallback.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", f = "ComposeScrollCaptureCallback.android.kt", l = {129, 132}, m = "onScrollCaptureImageRequest")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: E0.d$d, reason: collision with other inner class name */
    static final class C0060d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f3767B;

        /* renamed from: C, reason: collision with root package name */
        Object f3768C;

        /* renamed from: D, reason: collision with root package name */
        Object f3769D;

        /* renamed from: E, reason: collision with root package name */
        int f3770E;

        /* renamed from: F, reason: collision with root package name */
        int f3771F;

        /* renamed from: G, reason: collision with root package name */
        /* synthetic */ Object f3772G;

        /* renamed from: I, reason: collision with root package name */
        int f3774I;

        C0060d(InterfaceC4588d<? super C0060d> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3772G = obj;
            this.f3774I |= Integer.MIN_VALUE;
            return d.this.e(null, null, this);
        }
    }

    /* compiled from: ComposeScrollCaptureCallback.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", l = {85}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "delta"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.coroutines.jvm.internal.l implements Ba.p<Float, InterfaceC4588d<? super Float>, Object> {

        /* renamed from: B, reason: collision with root package name */
        boolean f3776B;

        /* renamed from: C, reason: collision with root package name */
        int f3777C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ float f3778D;

        f(InterfaceC4588d<? super f> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        public final Object b(float f10, InterfaceC4588d<? super Float> interfaceC4588d) {
            return ((f) create(Float.valueOf(f10), interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            f fVar = d.this.new f(interfaceC4588d);
            fVar.f3778D = ((Number) obj).floatValue();
            return fVar;
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ Object invoke(Float f10, InterfaceC4588d<? super Float> interfaceC4588d) {
            return b(f10.floatValue(), interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            Object objE = C4696b.e();
            int i10 = this.f3777C;
            if (i10 == 0) {
                C4173r.b(obj);
                float f10 = this.f3778D;
                Ba.p<C3476g, InterfaceC4588d<? super C3476g>, Object> pVarC = n.c(d.this.node);
                if (pVarC == null) {
                    C5047a.c("Required value was null.");
                    throw new KotlinNothingValueException();
                }
                boolean reverseScrolling = ((ScrollAxisRange) d.this.node.getUnmergedConfig().x(s.f4372a.I())).getReverseScrolling();
                if (reverseScrolling) {
                    f10 = -f10;
                }
                C3476g c3476gD = C3476g.d(C3477h.a(0.0f, f10));
                this.f3776B = reverseScrolling;
                this.f3777C = 1;
                obj = pVarC.invoke(c3476gD, this);
                if (obj == objE) {
                    return objE;
                }
                z10 = reverseScrolling;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z10 = this.f3776B;
                C4173r.b(obj);
            }
            float fN = C3476g.n(((C3476g) obj).getPackedValue());
            if (z10) {
                fN = -fN;
            }
            return kotlin.coroutines.jvm.internal.b.b(fN);
        }
    }

    public d(p pVar, U0.p pVar2, I i10, a aVar) {
        this.node = pVar;
        this.viewportBoundsInWindow = pVar2;
        this.listener = aVar;
        this.coroutineScope = J.g(i10, g.f3782B);
        this.scrollTracker = new h(pVar2.f(), new f(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(android.view.ScrollCaptureSession r9, U0.p r10, ta.InterfaceC4588d<? super U0.p> r11) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.d.e(android.view.ScrollCaptureSession, U0.p, ta.d):java.lang.Object");
    }

    public void onScrollCaptureEnd(Runnable onReady) {
        C1841i.d(this.coroutineScope, I0.f19028C, null, new b(onReady, null), 2, null);
    }

    public void onScrollCaptureImageRequest(ScrollCaptureSession session, CancellationSignal signal, Rect captureArea, Consumer<Rect> onComplete) {
        E0.f.c(this.coroutineScope, signal, new c(session, captureArea, onComplete, null));
    }

    public void onScrollCaptureSearch(CancellationSignal signal, Consumer<Rect> onReady) {
        onReady.accept(X0.a(this.viewportBoundsInWindow));
    }

    public void onScrollCaptureStart(ScrollCaptureSession session, CancellationSignal signal, Runnable onReady) {
        this.scrollTracker.d();
        this.requestCount = 0;
        this.listener.a();
        onReady.run();
    }

    /* compiled from: ComposeScrollCaptureCallback.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Loa/F;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends AbstractC3864v implements Ba.l<Long, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final e f3775B = new e();

        e() {
            super(1);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Long l10) {
            a(l10.longValue());
            return C4153F.f46609a;
        }

        public final void a(long j10) {
        }
    }
}
