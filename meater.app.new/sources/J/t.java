package J;

import A0.InterfaceC0831j;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import i0.InterfaceC3608w0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import z.InterfaceC5160i;

/* compiled from: Ripple.android.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a@\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Lz/i;", "interactionSource", "", "bounded", "LU0/h;", "radius", "Li0/w0;", "color", "Lkotlin/Function0;", "LJ/g;", "rippleAlpha", "LA0/j;", "d", "(Lz/i;ZFLi0/w0;LBa/a;)LA0/j;", "Landroid/view/ViewGroup;", "view", "LJ/j;", "c", "(Landroid/view/ViewGroup;)LJ/j;", "Landroid/view/View;", "initialView", "e", "(Landroid/view/View;)Landroid/view/ViewGroup;", "a", "Z", "IsRunningInPreview", "material-ripple_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f7157a = C3862t.b(Build.DEVICE, "layoutlib");

    /* JADX INFO: Access modifiers changed from: private */
    public static final j c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof j) {
                return (j) childAt;
            }
        }
        j jVar = new j(viewGroup.getContext());
        viewGroup.addView(jVar);
        return jVar;
    }

    public static final InterfaceC0831j d(InterfaceC5160i interfaceC5160i, boolean z10, float f10, InterfaceC3608w0 interfaceC3608w0, Ba.a<RippleAlpha> aVar) {
        return f7157a ? new c(interfaceC5160i, z10, f10, interfaceC3608w0, aVar, null) : new b(interfaceC5160i, z10, f10, interfaceC3608w0, aVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewParent] */
    public static final ViewGroup e(View view) {
        while (!(view instanceof ViewGroup)) {
            ?? parent = view.getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + view + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            view = parent;
        }
        return (ViewGroup) view;
    }
}
