package p456rx.p461n.p466e;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p456rx.InterfaceC11246k;
import p456rx.exceptions.C11240a;

/* compiled from: SubscriptionList.java */
/* renamed from: rx.n.e.l */
/* loaded from: classes3.dex */
public final class C11363l implements InterfaceC11246k {

    /* renamed from: f */
    private List<InterfaceC11246k> f42922f;

    /* renamed from: g */
    private volatile boolean f42923g;

    public C11363l() {
    }

    /* renamed from: c */
    private static void m40463c(Collection<InterfaceC11246k> collection) {
        if (collection == null) {
            return;
        }
        ArrayList arrayList = null;
        Iterator<InterfaceC11246k> it = collection.iterator();
        while (it.hasNext()) {
            try {
                it.next().unsubscribe();
            } catch (Throwable th) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th);
            }
        }
        C11240a.m40139d(arrayList);
    }

    /* renamed from: a */
    public void m40464a(InterfaceC11246k interfaceC11246k) {
        if (interfaceC11246k.isUnsubscribed()) {
            return;
        }
        if (!this.f42923g) {
            synchronized (this) {
                if (!this.f42923g) {
                    List linkedList = this.f42922f;
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        this.f42922f = linkedList;
                    }
                    linkedList.add(interfaceC11246k);
                    return;
                }
            }
        }
        interfaceC11246k.unsubscribe();
    }

    /* renamed from: b */
    public void m40465b(InterfaceC11246k interfaceC11246k) {
        if (this.f42923g) {
            return;
        }
        synchronized (this) {
            List<InterfaceC11246k> list = this.f42922f;
            if (!this.f42923g && list != null) {
                boolean zRemove = list.remove(interfaceC11246k);
                if (zRemove) {
                    interfaceC11246k.unsubscribe();
                }
            }
        }
    }

    @Override // p456rx.InterfaceC11246k
    public boolean isUnsubscribed() {
        return this.f42923g;
    }

    @Override // p456rx.InterfaceC11246k
    public void unsubscribe() {
        if (this.f42923g) {
            return;
        }
        synchronized (this) {
            if (this.f42923g) {
                return;
            }
            this.f42923g = true;
            List<InterfaceC11246k> list = this.f42922f;
            this.f42922f = null;
            m40463c(list);
        }
    }

    public C11363l(InterfaceC11246k... interfaceC11246kArr) {
        this.f42922f = new LinkedList(Arrays.asList(interfaceC11246kArr));
    }

    public C11363l(InterfaceC11246k interfaceC11246k) {
        LinkedList linkedList = new LinkedList();
        this.f42922f = linkedList;
        linkedList.add(interfaceC11246k);
    }
}
