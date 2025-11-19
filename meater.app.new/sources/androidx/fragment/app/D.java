package androidx.fragment.app;

import android.view.View;
import androidx.transition.C2184e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import s.C4391a;

/* compiled from: FragmentTransition.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\n\u001a\u0004\u0018\u00010\b*\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u000f\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010JC\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0017\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001e\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0014H\u0007¢\u0006\u0004\b \u0010!R\u0016\u0010#\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"R\u0016\u0010$\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"¨\u0006%"}, d2 = {"Landroidx/fragment/app/D;", "", "<init>", "()V", "Landroidx/fragment/app/F;", "c", "()Landroidx/fragment/app/F;", "Ls/a;", "", "value", "b", "(Ls/a;Ljava/lang/String;)Ljava/lang/String;", "Landroid/view/View;", "namedViews", "Loa/F;", "d", "(Ls/a;Ls/a;)V", "Landroidx/fragment/app/Fragment;", "inFragment", "outFragment", "", "isPop", "sharedElements", "isStart", "a", "(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLs/a;Z)V", "", "views", "", "visibility", "e", "(Ljava/util/List;I)V", "f", "()Z", "Landroidx/fragment/app/F;", "PLATFORM_IMPL", "SUPPORT_IMPL", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public static final D f25422a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final F PLATFORM_IMPL;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final F SUPPORT_IMPL;

    static {
        D d10 = new D();
        f25422a = d10;
        PLATFORM_IMPL = new E();
        SUPPORT_IMPL = d10.c();
    }

    private D() {
    }

    public static final void a(Fragment inFragment, Fragment outFragment, boolean isPop, C4391a<String, View> sharedElements, boolean isStart) {
        C3862t.g(inFragment, "inFragment");
        C3862t.g(outFragment, "outFragment");
        C3862t.g(sharedElements, "sharedElements");
        f1.y yVarC0 = isPop ? outFragment.c0() : inFragment.c0();
        if (yVarC0 != null) {
            ArrayList arrayList = new ArrayList(sharedElements.size());
            Iterator<Map.Entry<String, View>> it = sharedElements.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
            ArrayList arrayList2 = new ArrayList(sharedElements.size());
            Iterator<Map.Entry<String, View>> it2 = sharedElements.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getKey());
            }
            if (isStart) {
                yVarC0.c(arrayList2, arrayList, null);
            } else {
                yVarC0.b(arrayList2, arrayList, null);
            }
        }
    }

    public static final String b(C4391a<String, String> c4391a, String value) {
        C3862t.g(c4391a, "<this>");
        C3862t.g(value, "value");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : c4391a.entrySet()) {
            if (C3862t.b(entry.getValue(), value)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) kotlin.collections.r.l0(arrayList);
    }

    private final F c() {
        try {
            C3862t.e(C2184e.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (F) C2184e.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void d(C4391a<String, String> c4391a, C4391a<String, View> namedViews) {
        C3862t.g(c4391a, "<this>");
        C3862t.g(namedViews, "namedViews");
        int size = c4391a.getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!namedViews.containsKey(c4391a.l(size))) {
                c4391a.j(size);
            }
        }
    }

    public static final void e(List<? extends View> views, int visibility) {
        C3862t.g(views, "views");
        Iterator<T> it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(visibility);
        }
    }

    public static final boolean f() {
        return (PLATFORM_IMPL == null && SUPPORT_IMPL == null) ? false : true;
    }
}
