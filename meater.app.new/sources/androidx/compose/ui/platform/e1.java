package androidx.compose.ui.platform;

import android.view.InterfaceC2114v;
import android.view.View;
import androidx.compose.ui.platform.e1;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import x0.C5047a;
import x1.C5048a;
import x1.InterfaceC5049b;

/* compiled from: ViewCompositionStrategy.android.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00062\u00020\u0001:\u0003\u0006\b\tJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/e1;", "", "Landroidx/compose/ui/platform/a;", "view", "Lkotlin/Function0;", "Loa/F;", "a", "(Landroidx/compose/ui/platform/a;)LBa/a;", "b", "c", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface e1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f23119a;

    /* compiled from: ViewCompositionStrategy.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/e1$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/e1;", "a", "()Landroidx/compose/ui/platform/e1;", "Default", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.e1$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f23119a = new Companion();

        private Companion() {
        }

        public final e1 a() {
            return b.f23120b;
        }
    }

    Ba.a<C4153F> a(AbstractC2004a view);

    /* compiled from: ViewCompositionStrategy.android.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/e1$b;", "Landroidx/compose/ui/platform/e1;", "<init>", "()V", "Landroidx/compose/ui/platform/a;", "view", "Lkotlin/Function0;", "Loa/F;", "a", "(Landroidx/compose/ui/platform/a;)LBa/a;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements e1 {

        /* renamed from: b, reason: collision with root package name */
        public static final b f23120b = new b();

        /* compiled from: ViewCompositionStrategy.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends AbstractC3864v implements Ba.a<C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ AbstractC2004a f23121B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ ViewOnAttachStateChangeListenerC0327b f23122C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ InterfaceC5049b f23123D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC2004a abstractC2004a, ViewOnAttachStateChangeListenerC0327b viewOnAttachStateChangeListenerC0327b, InterfaceC5049b interfaceC5049b) {
                super(0);
                this.f23121B = abstractC2004a;
                this.f23122C = viewOnAttachStateChangeListenerC0327b;
                this.f23123D = interfaceC5049b;
            }

            public final void a() {
                this.f23121B.removeOnAttachStateChangeListener(this.f23122C);
                C5048a.g(this.f23121B, this.f23123D);
            }

            @Override // Ba.a
            public /* bridge */ /* synthetic */ C4153F invoke() {
                a();
                return C4153F.f46609a;
            }
        }

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(AbstractC2004a abstractC2004a) {
            abstractC2004a.e();
        }

        @Override // androidx.compose.ui.platform.e1
        public Ba.a<C4153F> a(final AbstractC2004a view) {
            ViewOnAttachStateChangeListenerC0327b viewOnAttachStateChangeListenerC0327b = new ViewOnAttachStateChangeListenerC0327b(view);
            view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0327b);
            InterfaceC5049b interfaceC5049b = new InterfaceC5049b() { // from class: androidx.compose.ui.platform.f1
                @Override // x1.InterfaceC5049b
                public final void a() {
                    e1.b.c(view);
                }
            };
            C5048a.a(view, interfaceC5049b);
            return new a(view, viewOnAttachStateChangeListenerC0327b, interfaceC5049b);
        }

        /* compiled from: ViewCompositionStrategy.android.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/e1$b$b", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Loa/F;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.platform.e1$b$b, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC0327b implements View.OnAttachStateChangeListener {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ AbstractC2004a f23124B;

            ViewOnAttachStateChangeListenerC0327b(AbstractC2004a abstractC2004a) {
                this.f23124B = abstractC2004a;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v10) {
                if (C5048a.f(this.f23124B)) {
                    return;
                }
                this.f23124B.e();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v10) {
            }
        }
    }

    /* compiled from: ViewCompositionStrategy.android.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/e1$c;", "Landroidx/compose/ui/platform/e1;", "<init>", "()V", "Landroidx/compose/ui/platform/a;", "view", "Lkotlin/Function0;", "Loa/F;", "a", "(Landroidx/compose/ui/platform/a;)LBa/a;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements e1 {

        /* renamed from: b, reason: collision with root package name */
        public static final c f23125b = new c();

        /* compiled from: ViewCompositionStrategy.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends AbstractC3864v implements Ba.a<C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ AbstractC2004a f23126B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ ViewOnAttachStateChangeListenerC0328c f23127C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC2004a abstractC2004a, ViewOnAttachStateChangeListenerC0328c viewOnAttachStateChangeListenerC0328c) {
                super(0);
                this.f23126B = abstractC2004a;
                this.f23127C = viewOnAttachStateChangeListenerC0328c;
            }

            public final void a() {
                this.f23126B.removeOnAttachStateChangeListener(this.f23127C);
            }

            @Override // Ba.a
            public /* bridge */ /* synthetic */ C4153F invoke() {
                a();
                return C4153F.f46609a;
            }
        }

        /* compiled from: ViewCompositionStrategy.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class b extends AbstractC3864v implements Ba.a<C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.O<Ba.a<C4153F>> f23128B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(kotlin.jvm.internal.O<Ba.a<C4153F>> o10) {
                super(0);
                this.f23128B = o10;
            }

            public final void a() {
                this.f23128B.f43978B.invoke();
            }

            @Override // Ba.a
            public /* bridge */ /* synthetic */ C4153F invoke() {
                a();
                return C4153F.f46609a;
            }
        }

        private c() {
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.compose.ui.platform.e1$c$a] */
        @Override // androidx.compose.ui.platform.e1
        public Ba.a<C4153F> a(AbstractC2004a view) {
            if (!view.isAttachedToWindow()) {
                kotlin.jvm.internal.O o10 = new kotlin.jvm.internal.O();
                ViewOnAttachStateChangeListenerC0328c viewOnAttachStateChangeListenerC0328c = new ViewOnAttachStateChangeListenerC0328c(view, o10);
                view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0328c);
                o10.f43978B = new a(view, viewOnAttachStateChangeListenerC0328c);
                return new b(o10);
            }
            InterfaceC2114v interfaceC2114vA = android.view.View.a(view);
            if (interfaceC2114vA != null) {
                return h1.c(view, interfaceC2114vA.getLifecycle());
            }
            C5047a.c("View tree for " + view + " has no ViewTreeLifecycleOwner");
            throw new KotlinNothingValueException();
        }

        /* compiled from: ViewCompositionStrategy.android.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/e1$c$c", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Loa/F;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.platform.e1$c$c, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC0328c implements View.OnAttachStateChangeListener {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ AbstractC2004a f23129B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.O<Ba.a<C4153F>> f23130C;

            ViewOnAttachStateChangeListenerC0328c(AbstractC2004a abstractC2004a, kotlin.jvm.internal.O<Ba.a<C4153F>> o10) {
                this.f23129B = abstractC2004a;
                this.f23130C = o10;
            }

            /* JADX WARN: Type inference failed for: r3v7, types: [Ba.a, T] */
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v10) {
                InterfaceC2114v interfaceC2114vA = android.view.View.a(this.f23129B);
                AbstractC2004a abstractC2004a = this.f23129B;
                if (interfaceC2114vA != null) {
                    this.f23130C.f43978B = h1.c(abstractC2004a, interfaceC2114vA.getLifecycle());
                    this.f23129B.removeOnAttachStateChangeListener(this);
                } else {
                    C5047a.c("View tree for " + abstractC2004a + " has no ViewTreeLifecycleOwner");
                    throw new KotlinNothingValueException();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v10) {
            }
        }
    }
}
