package androidx.compose.ui.platform;

import Xb.C1841i;
import Xb.C1854o0;
import Xb.InterfaceC1867v0;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C1513M0;
import kotlin.Metadata;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: WindowRecomposer.android.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/u1;", "", "<init>", "()V", "Landroid/view/View;", "rootView", "LO/M0;", "a", "(Landroid/view/View;)LO/M0;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/platform/t1;", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "factory", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final u1 f23353a = new u1();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final AtomicReference<t1> factory = new AtomicReference<>(t1.INSTANCE.c());

    /* renamed from: c, reason: collision with root package name */
    public static final int f23355c = 8;

    /* compiled from: WindowRecomposer.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", l = {235}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.l implements Ba.p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f23357B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C1513M0 f23358C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ View f23359D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C1513M0 c1513m0, View view, InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f23358C = c1513m0;
            this.f23359D = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new b(this.f23358C, this.f23359D, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            View view;
            Object objE = C4696b.e();
            int i10 = this.f23357B;
            try {
                if (i10 == 0) {
                    C4173r.b(obj);
                    C1513M0 c1513m0 = this.f23358C;
                    this.f23357B = 1;
                    if (c1513m0.m0(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4173r.b(obj);
                }
                if (v1.f(view) == this.f23358C) {
                    v1.i(this.f23359D, null);
                }
                return C4153F.f46609a;
            } finally {
                if (v1.f(this.f23359D) == this.f23358C) {
                    v1.i(this.f23359D, null);
                }
            }
        }
    }

    private u1() {
    }

    public final C1513M0 a(View rootView) {
        C1513M0 c1513m0A = factory.get().a(rootView);
        v1.i(rootView, c1513m0A);
        rootView.addOnAttachStateChangeListener(new a(C1841i.d(C1854o0.f19099B, Yb.f.b(rootView.getHandler(), "windowRecomposer cleanup").M0(), null, new b(c1513m0A, rootView, null), 2, null)));
        return c1513m0A;
    }

    /* compiled from: WindowRecomposer.android.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/u1$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Loa/F;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC1867v0 f23356B;

        a(InterfaceC1867v0 interfaceC1867v0) {
            this.f23356B = interfaceC1867v0;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v10) {
            v10.removeOnAttachStateChangeListener(this);
            InterfaceC1867v0.a.a(this.f23356B, null, 1, null);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v10) {
        }
    }
}
