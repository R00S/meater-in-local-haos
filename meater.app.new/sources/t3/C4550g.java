package t3;

import Ba.l;
import Tb.k;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;

/* compiled from: ViewTreeSavedStateRegistryOwner.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Lt3/f;", "owner", "Loa/F;", "b", "(Landroid/view/View;Lt3/f;)V", "a", "(Landroid/view/View;)Lt3/f;", "savedstate_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: t3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4550g {

    /* compiled from: ViewTreeSavedStateRegistryOwner.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "view", "a", "(Landroid/view/View;)Landroid/view/View;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: t3.g$a */
    static final class a extends AbstractC3864v implements l<View, View> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f49920B = new a();

        a() {
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

    /* compiled from: ViewTreeSavedStateRegistryOwner.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lt3/f;", "a", "(Landroid/view/View;)Lt3/f;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: t3.g$b */
    static final class b extends AbstractC3864v implements l<View, InterfaceC4549f> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f49921B = new b();

        b() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4549f invoke(View view) {
            C3862t.g(view, "view");
            Object tag = view.getTag(C4544a.f49904a);
            if (tag instanceof InterfaceC4549f) {
                return (InterfaceC4549f) tag;
            }
            return null;
        }
    }

    public static final InterfaceC4549f a(View view) {
        C3862t.g(view, "<this>");
        return (InterfaceC4549f) k.t(k.B(k.i(view, a.f49920B), b.f49921B));
    }

    public static final void b(View view, InterfaceC4549f interfaceC4549f) {
        C3862t.g(view, "<this>");
        view.setTag(C4544a.f49904a, interfaceC4549f);
    }
}
