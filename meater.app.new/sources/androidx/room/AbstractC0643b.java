package androidx.room;

import java.util.Iterator;
import p024c.p082u.p083a.InterfaceC1012f;

/* compiled from: EntityDeletionOrUpdateAdapter.java */
/* renamed from: androidx.room.b */
/* loaded from: classes.dex */
public abstract class AbstractC0643b<T> extends AbstractC0658q {
    public AbstractC0643b(AbstractC0651j abstractC0651j) {
        super(abstractC0651j);
    }

    protected abstract void bind(InterfaceC1012f interfaceC1012f, T t);

    @Override // androidx.room.AbstractC0658q
    protected abstract String createQuery();

    public final int handle(T t) {
        InterfaceC1012f interfaceC1012fAcquire = acquire();
        try {
            bind(interfaceC1012fAcquire, t);
            return interfaceC1012fAcquire.mo6470E();
        } finally {
            release(interfaceC1012fAcquire);
        }
    }

    public final int handleMultiple(Iterable<? extends T> iterable) {
        InterfaceC1012f interfaceC1012fAcquire = acquire();
        int iMo6470E = 0;
        try {
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                bind(interfaceC1012fAcquire, it.next());
                iMo6470E += interfaceC1012fAcquire.mo6470E();
            }
            return iMo6470E;
        } finally {
            release(interfaceC1012fAcquire);
        }
    }

    public final int handleMultiple(T[] tArr) {
        InterfaceC1012f interfaceC1012fAcquire = acquire();
        try {
            int iMo6470E = 0;
            for (T t : tArr) {
                bind(interfaceC1012fAcquire, t);
                iMo6470E += interfaceC1012fAcquire.mo6470E();
            }
            return iMo6470E;
        } finally {
            release(interfaceC1012fAcquire);
        }
    }
}
