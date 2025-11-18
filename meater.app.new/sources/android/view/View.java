package android.view;

import Ba.l;
import P1.a;
import Tb.k;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;

/* compiled from: ViewTreeLifecycleOwner.android.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Landroidx/lifecycle/v;", "lifecycleOwner", "Loa/F;", "b", "(Landroid/view/View;Landroidx/lifecycle/v;)V", "a", "(Landroid/view/View;)Landroidx/lifecycle/v;", "lifecycle-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.d0, reason: from Kotlin metadata */
/* loaded from: classes.dex */
public final class View {

    /* compiled from: ViewTreeLifecycleOwner.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "currentView", "a", "(Landroid/view/View;)Landroid/view/View;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.d0$a, reason: from Kotlin metadata and collision with other inner class name */
    static final class C0362a extends AbstractC3864v implements l<android.view.View, android.view.View> {

        /* renamed from: B, reason: collision with root package name */
        public static final C0362a f25948B = new C0362a();

        C0362a() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final android.view.View invoke(android.view.View currentView) {
            C3862t.g(currentView, "currentView");
            Object parent = currentView.getParent();
            if (parent instanceof android.view.View) {
                return (android.view.View) parent;
            }
            return null;
        }
    }

    /* compiled from: ViewTreeLifecycleOwner.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "viewParent", "Landroidx/lifecycle/v;", "a", "(Landroid/view/View;)Landroidx/lifecycle/v;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.d0$b, reason: from Kotlin metadata and collision with other inner class name */
    static final class C0363b extends AbstractC3864v implements l<android.view.View, InterfaceC2114v> {

        /* renamed from: B, reason: collision with root package name */
        public static final C0363b f25949B = new C0363b();

        C0363b() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2114v invoke(android.view.View viewParent) {
            C3862t.g(viewParent, "viewParent");
            Object tag = viewParent.getTag(a.f13708a);
            if (tag instanceof InterfaceC2114v) {
                return (InterfaceC2114v) tag;
            }
            return null;
        }
    }

    public static final InterfaceC2114v a(android.view.View view) {
        C3862t.g(view, "<this>");
        return (InterfaceC2114v) k.t(k.B(k.i(view, C0362a.f25948B), C0363b.f25949B));
    }

    public static final void b(android.view.View view, InterfaceC2114v interfaceC2114v) {
        C3862t.g(view, "<this>");
        view.setTag(a.f13708a, interfaceC2114v);
    }
}
