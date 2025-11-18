package androidx.room;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p024c.p082u.p083a.InterfaceC1012f;

/* compiled from: EntityInsertionAdapter.java */
/* renamed from: androidx.room.c */
/* loaded from: classes.dex */
public abstract class AbstractC0644c<T> extends AbstractC0658q {
    public AbstractC0644c(AbstractC0651j abstractC0651j) {
        super(abstractC0651j);
    }

    protected abstract void bind(InterfaceC1012f interfaceC1012f, T t);

    public final void insert(T t) {
        InterfaceC1012f interfaceC1012fAcquire = acquire();
        try {
            bind(interfaceC1012fAcquire, t);
            interfaceC1012fAcquire.mo6471j1();
        } finally {
            release(interfaceC1012fAcquire);
        }
    }

    public final long insertAndReturnId(T t) {
        InterfaceC1012f interfaceC1012fAcquire = acquire();
        try {
            bind(interfaceC1012fAcquire, t);
            return interfaceC1012fAcquire.mo6471j1();
        } finally {
            release(interfaceC1012fAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<? extends T> collection) {
        InterfaceC1012f interfaceC1012fAcquire = acquire();
        try {
            long[] jArr = new long[collection.size()];
            int i2 = 0;
            Iterator<? extends T> it = collection.iterator();
            while (it.hasNext()) {
                bind(interfaceC1012fAcquire, it.next());
                jArr[i2] = interfaceC1012fAcquire.mo6471j1();
                i2++;
            }
            return jArr;
        } finally {
            release(interfaceC1012fAcquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection<? extends T> collection) {
        InterfaceC1012f interfaceC1012fAcquire = acquire();
        try {
            Long[] lArr = new Long[collection.size()];
            int i2 = 0;
            Iterator<? extends T> it = collection.iterator();
            while (it.hasNext()) {
                bind(interfaceC1012fAcquire, it.next());
                lArr[i2] = Long.valueOf(interfaceC1012fAcquire.mo6471j1());
                i2++;
            }
            return lArr;
        } finally {
            release(interfaceC1012fAcquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(T[] tArr) {
        InterfaceC1012f interfaceC1012fAcquire = acquire();
        try {
            ArrayList arrayList = new ArrayList(tArr.length);
            int i2 = 0;
            for (T t : tArr) {
                bind(interfaceC1012fAcquire, t);
                arrayList.add(i2, Long.valueOf(interfaceC1012fAcquire.mo6471j1()));
                i2++;
            }
            return arrayList;
        } finally {
            release(interfaceC1012fAcquire);
        }
    }

    public final void insert(T[] tArr) {
        InterfaceC1012f interfaceC1012fAcquire = acquire();
        try {
            for (T t : tArr) {
                bind(interfaceC1012fAcquire, t);
                interfaceC1012fAcquire.mo6471j1();
            }
        } finally {
            release(interfaceC1012fAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(T[] tArr) {
        InterfaceC1012f interfaceC1012fAcquire = acquire();
        try {
            long[] jArr = new long[tArr.length];
            int i2 = 0;
            for (T t : tArr) {
                bind(interfaceC1012fAcquire, t);
                jArr[i2] = interfaceC1012fAcquire.mo6471j1();
                i2++;
            }
            return jArr;
        } finally {
            release(interfaceC1012fAcquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(T[] tArr) {
        InterfaceC1012f interfaceC1012fAcquire = acquire();
        try {
            Long[] lArr = new Long[tArr.length];
            int i2 = 0;
            for (T t : tArr) {
                bind(interfaceC1012fAcquire, t);
                lArr[i2] = Long.valueOf(interfaceC1012fAcquire.mo6471j1());
                i2++;
            }
            return lArr;
        } finally {
            release(interfaceC1012fAcquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<? extends T> collection) {
        InterfaceC1012f interfaceC1012fAcquire = acquire();
        try {
            ArrayList arrayList = new ArrayList(collection.size());
            int i2 = 0;
            Iterator<? extends T> it = collection.iterator();
            while (it.hasNext()) {
                bind(interfaceC1012fAcquire, it.next());
                arrayList.add(i2, Long.valueOf(interfaceC1012fAcquire.mo6471j1()));
                i2++;
            }
            return arrayList;
        } finally {
            release(interfaceC1012fAcquire);
        }
    }

    public final void insert(Iterable<? extends T> iterable) {
        InterfaceC1012f interfaceC1012fAcquire = acquire();
        try {
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                bind(interfaceC1012fAcquire, it.next());
                interfaceC1012fAcquire.mo6471j1();
            }
        } finally {
            release(interfaceC1012fAcquire);
        }
    }
}
