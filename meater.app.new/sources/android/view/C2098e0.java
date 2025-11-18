package android.view;

import Ba.l;
import Q1.e;
import Tb.k;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;

/* compiled from: ViewTreeViewModelStoreOwner.android.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Landroidx/lifecycle/c0;", "viewModelStoreOwner", "Loa/F;", "b", "(Landroid/view/View;Landroidx/lifecycle/c0;)V", "a", "(Landroid/view/View;)Landroidx/lifecycle/c0;", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.e0, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2098e0 {

    /* compiled from: ViewTreeViewModelStoreOwner.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "view", "a", "(Landroid/view/View;)Landroid/view/View;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.e0$a, reason: from Kotlin metadata and collision with other inner class name */
    static final class C0364a extends AbstractC3864v implements l<View, View> {

        /* renamed from: B, reason: collision with root package name */
        public static final C0364a f25950B = new C0364a();

        C0364a() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke(View view) {
            C3862t.g(view, "view");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* compiled from: ViewTreeViewModelStoreOwner.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Landroidx/lifecycle/c0;", "a", "(Landroid/view/View;)Landroidx/lifecycle/c0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.e0$b, reason: from Kotlin metadata and collision with other inner class name */
    static final class C0365b extends AbstractC3864v implements l<View, c0> {

        /* renamed from: B, reason: collision with root package name */
        public static final C0365b f25951B = new C0365b();

        C0365b() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c0 invoke(View view) {
            C3862t.g(view, "view");
            Object tag = view.getTag(e.f14209a);
            if (tag instanceof c0) {
                return (c0) tag;
            }
            return null;
        }
    }

    public static final c0 a(View view) {
        C3862t.g(view, "<this>");
        return (c0) k.t(k.B(k.i(view, C0364a.f25950B), C0365b.f25951B));
    }

    public static final void b(View view, c0 c0Var) {
        C3862t.g(view, "<this>");
        view.setTag(e.f14209a, c0Var);
    }
}
