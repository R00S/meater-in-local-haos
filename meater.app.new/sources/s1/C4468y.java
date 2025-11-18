package s1;

import android.annotation.SuppressLint;
import android.view.AbstractC2106m;
import android.view.InterfaceC2111s;
import android.view.InterfaceC2114v;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MenuHostHelper.java */
/* renamed from: s1.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4468y {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f49196a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<InterfaceC4420A> f49197b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final Map<InterfaceC4420A, a> f49198c = new HashMap();

    /* compiled from: MenuHostHelper.java */
    /* renamed from: s1.y$a */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC2106m f49199a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC2111s f49200b;

        a(AbstractC2106m abstractC2106m, InterfaceC2111s interfaceC2111s) {
            this.f49199a = abstractC2106m;
            this.f49200b = interfaceC2111s;
            abstractC2106m.a(interfaceC2111s);
        }

        void a() {
            this.f49199a.d(this.f49200b);
            this.f49200b = null;
        }
    }

    public C4468y(Runnable runnable) {
        this.f49196a = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(AbstractC2106m.b bVar, InterfaceC4420A interfaceC4420A, InterfaceC2114v interfaceC2114v, AbstractC2106m.a aVar) {
        if (aVar == AbstractC2106m.a.p(bVar)) {
            b(interfaceC4420A);
            return;
        }
        if (aVar == AbstractC2106m.a.ON_DESTROY) {
            i(interfaceC4420A);
        } else if (aVar == AbstractC2106m.a.j(bVar)) {
            this.f49197b.remove(interfaceC4420A);
            this.f49196a.run();
        }
    }

    public void b(InterfaceC4420A interfaceC4420A) {
        this.f49197b.add(interfaceC4420A);
        this.f49196a.run();
    }

    @SuppressLint({"LambdaLast"})
    public void c(final InterfaceC4420A interfaceC4420A, InterfaceC2114v interfaceC2114v, final AbstractC2106m.b bVar) {
        AbstractC2106m lifecycle = interfaceC2114v.getLifecycle();
        a aVarRemove = this.f49198c.remove(interfaceC4420A);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f49198c.put(interfaceC4420A, new a(lifecycle, new InterfaceC2111s() { // from class: s1.x
            @Override // android.view.InterfaceC2111s
            public final void f(InterfaceC2114v interfaceC2114v2, AbstractC2106m.a aVar) {
                this.f49193B.d(bVar, interfaceC4420A, interfaceC2114v2, aVar);
            }
        }));
    }

    public void e(Menu menu, MenuInflater menuInflater) {
        Iterator<InterfaceC4420A> it = this.f49197b.iterator();
        while (it.hasNext()) {
            it.next().c(menu, menuInflater);
        }
    }

    public void f(Menu menu) {
        Iterator<InterfaceC4420A> it = this.f49197b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public boolean g(MenuItem menuItem) {
        Iterator<InterfaceC4420A> it = this.f49197b.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void h(Menu menu) {
        Iterator<InterfaceC4420A> it = this.f49197b.iterator();
        while (it.hasNext()) {
            it.next().d(menu);
        }
    }

    public void i(InterfaceC4420A interfaceC4420A) {
        this.f49197b.remove(interfaceC4420A);
        a aVarRemove = this.f49198c.remove(interfaceC4420A);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f49196a.run();
    }
}
