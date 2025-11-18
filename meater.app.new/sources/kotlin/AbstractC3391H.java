package kotlin;

import ac.C1972g;
import ac.H;
import ac.J;
import ac.t;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.collections.V;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: NavigatorState.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\bJ\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u001a\u0010\bR\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040#0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010!R*\u0010,\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)\"\u0004\b*\u0010+R#\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001f0-8\u0006¢\u0006\f\n\u0004\b\u0019\u0010.\u001a\u0004\b \u0010/R#\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040#0-8\u0006¢\u0006\f\n\u0004\b\u0016\u0010.\u001a\u0004\b$\u0010/¨\u00062"}, d2 = {"Lg3/H;", "", "<init>", "()V", "Lg3/m;", "backStackEntry", "Loa/F;", "k", "(Lg3/m;)V", "l", "Lg3/t;", "destination", "Landroid/os/Bundle;", "arguments", "a", "(Lg3/t;Landroid/os/Bundle;)Lg3/m;", "popUpTo", "", "saveState", "h", "(Lg3/m;Z)V", "i", "f", "g", "entry", "e", "j", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "backStackLock", "Lac/t;", "", "b", "Lac/t;", "_backStack", "", "c", "_transitionsInProgress", "<set-?>", "d", "Z", "()Z", "m", "(Z)V", "isNavigating", "Lac/H;", "Lac/H;", "()Lac/H;", "backStack", "transitionsInProgress", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g3.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3391H {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReentrantLock backStackLock = new ReentrantLock(true);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t<List<C3407m>> _backStack;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t<Set<C3407m>> _transitionsInProgress;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isNavigating;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final H<List<C3407m>> backStack;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final H<Set<C3407m>> transitionsInProgress;

    public AbstractC3391H() {
        t<List<C3407m>> tVarA = J.a(r.m());
        this._backStack = tVarA;
        t<Set<C3407m>> tVarA2 = J.a(V.d());
        this._transitionsInProgress = tVarA2;
        this.backStack = C1972g.b(tVarA);
        this.transitionsInProgress = C1972g.b(tVarA2);
    }

    public abstract C3407m a(C3414t destination, Bundle arguments);

    public final H<List<C3407m>> b() {
        return this.backStack;
    }

    public final H<Set<C3407m>> c() {
        return this.transitionsInProgress;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsNavigating() {
        return this.isNavigating;
    }

    public void e(C3407m entry) {
        C3862t.g(entry, "entry");
        t<Set<C3407m>> tVar = this._transitionsInProgress;
        tVar.setValue(V.i(tVar.getValue(), entry));
    }

    public void f(C3407m backStackEntry) {
        int iNextIndex;
        C3862t.g(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.backStackLock;
        reentrantLock.lock();
        try {
            List<C3407m> listZ0 = r.Z0(this.backStack.getValue());
            ListIterator<C3407m> listIterator = listZ0.listIterator(listZ0.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (C3862t.b(listIterator.previous().getId(), backStackEntry.getId())) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            listZ0.set(iNextIndex, backStackEntry);
            this._backStack.setValue(listZ0);
            C4153F c4153f = C4153F.f46609a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void g(C3407m backStackEntry) {
        C3862t.g(backStackEntry, "backStackEntry");
        List<C3407m> value = this.backStack.getValue();
        ListIterator<C3407m> listIterator = value.listIterator(value.size());
        while (listIterator.hasPrevious()) {
            C3407m c3407mPrevious = listIterator.previous();
            if (C3862t.b(c3407mPrevious.getId(), backStackEntry.getId())) {
                t<Set<C3407m>> tVar = this._transitionsInProgress;
                tVar.setValue(V.k(V.k(tVar.getValue(), c3407mPrevious), backStackEntry));
                f(backStackEntry);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public void h(C3407m popUpTo, boolean saveState) {
        C3862t.g(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.backStackLock;
        reentrantLock.lock();
        try {
            t<List<C3407m>> tVar = this._backStack;
            List<C3407m> value = tVar.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                if (C3862t.b((C3407m) obj, popUpTo)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            tVar.setValue(arrayList);
            C4153F c4153f = C4153F.f46609a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void i(C3407m popUpTo, boolean saveState) {
        C3407m c3407mPrevious;
        C3862t.g(popUpTo, "popUpTo");
        Set<C3407m> value = this._transitionsInProgress.getValue();
        if (!(value instanceof Collection) || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C3407m) it.next()) == popUpTo) {
                    List<C3407m> value2 = this.backStack.getValue();
                    if ((value2 instanceof Collection) && value2.isEmpty()) {
                        return;
                    }
                    Iterator<T> it2 = value2.iterator();
                    while (it2.hasNext()) {
                        if (((C3407m) it2.next()) == popUpTo) {
                        }
                    }
                    return;
                }
            }
        }
        t<Set<C3407m>> tVar = this._transitionsInProgress;
        tVar.setValue(V.k(tVar.getValue(), popUpTo));
        List<C3407m> value3 = this.backStack.getValue();
        ListIterator<C3407m> listIterator = value3.listIterator(value3.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                c3407mPrevious = null;
                break;
            }
            c3407mPrevious = listIterator.previous();
            C3407m c3407m = c3407mPrevious;
            if (!C3862t.b(c3407m, popUpTo) && this.backStack.getValue().lastIndexOf(c3407m) < this.backStack.getValue().lastIndexOf(popUpTo)) {
                break;
            }
        }
        C3407m c3407m2 = c3407mPrevious;
        if (c3407m2 != null) {
            t<Set<C3407m>> tVar2 = this._transitionsInProgress;
            tVar2.setValue(V.k(tVar2.getValue(), c3407m2));
        }
        h(popUpTo, saveState);
    }

    public void j(C3407m entry) {
        C3862t.g(entry, "entry");
        t<Set<C3407m>> tVar = this._transitionsInProgress;
        tVar.setValue(V.k(tVar.getValue(), entry));
    }

    public void k(C3407m backStackEntry) {
        C3862t.g(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.backStackLock;
        reentrantLock.lock();
        try {
            t<List<C3407m>> tVar = this._backStack;
            tVar.setValue(r.G0(tVar.getValue(), backStackEntry));
            C4153F c4153f = C4153F.f46609a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void l(C3407m backStackEntry) {
        C3862t.g(backStackEntry, "backStackEntry");
        Set<C3407m> value = this._transitionsInProgress.getValue();
        if (!(value instanceof Collection) || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C3407m) it.next()) == backStackEntry) {
                    List<C3407m> value2 = this.backStack.getValue();
                    if (!(value2 instanceof Collection) || !value2.isEmpty()) {
                        Iterator<T> it2 = value2.iterator();
                        while (it2.hasNext()) {
                            if (((C3407m) it2.next()) == backStackEntry) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        C3407m c3407m = (C3407m) r.w0(this.backStack.getValue());
        if (c3407m != null) {
            t<Set<C3407m>> tVar = this._transitionsInProgress;
            tVar.setValue(V.k(tVar.getValue(), c3407m));
        }
        t<Set<C3407m>> tVar2 = this._transitionsInProgress;
        tVar2.setValue(V.k(tVar2.getValue(), backStackEntry));
        k(backStackEntry);
    }

    public final void m(boolean z10) {
        this.isNavigating = z10;
    }
}
