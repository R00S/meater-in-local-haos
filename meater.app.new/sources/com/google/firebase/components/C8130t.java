package com.google.firebase.components;

import android.util.Log;
import com.google.firebase.components.C8130t;
import com.google.firebase.p202p.InterfaceC8478a;
import com.google.firebase.p203q.InterfaceC8481c;
import com.google.firebase.p203q.InterfaceC8482d;
import com.google.firebase.p205s.InterfaceC8495a;
import com.google.firebase.p205s.InterfaceC8496b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ComponentRuntime.java */
/* renamed from: com.google.firebase.components.t */
/* loaded from: classes2.dex */
public class C8130t implements InterfaceC8126p, InterfaceC8478a {

    /* renamed from: a */
    private static final InterfaceC8496b<Set<Object>> f30719a = new InterfaceC8496b() { // from class: com.google.firebase.components.i
        @Override // com.google.firebase.p205s.InterfaceC8496b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: b */
    private final Map<C8124n<?>, InterfaceC8496b<?>> f30720b;

    /* renamed from: c */
    private final Map<C8111b0<?>, InterfaceC8496b<?>> f30721c;

    /* renamed from: d */
    private final Map<C8111b0<?>, C8135y<?>> f30722d;

    /* renamed from: e */
    private final List<InterfaceC8496b<ComponentRegistrar>> f30723e;

    /* renamed from: f */
    private Set<String> f30724f;

    /* renamed from: g */
    private final C8133w f30725g;

    /* renamed from: h */
    private final AtomicReference<Boolean> f30726h;

    /* renamed from: i */
    private final InterfaceC8129s f30727i;

    /* compiled from: ComponentRuntime.java */
    /* renamed from: com.google.firebase.components.t$b */
    public static final class b {

        /* renamed from: a */
        private final Executor f30728a;

        /* renamed from: b */
        private final List<InterfaceC8496b<ComponentRegistrar>> f30729b = new ArrayList();

        /* renamed from: c */
        private final List<C8124n<?>> f30730c = new ArrayList();

        /* renamed from: d */
        private InterfaceC8129s f30731d = InterfaceC8129s.f30718a;

        b(Executor executor) {
            this.f30728a = executor;
        }

        /* renamed from: e */
        static /* synthetic */ ComponentRegistrar m25038e(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        /* renamed from: a */
        public b m25039a(C8124n<?> c8124n) {
            this.f30730c.add(c8124n);
            return this;
        }

        /* renamed from: b */
        public b m25040b(final ComponentRegistrar componentRegistrar) {
            this.f30729b.add(new InterfaceC8496b() { // from class: com.google.firebase.components.e
                @Override // com.google.firebase.p205s.InterfaceC8496b
                public final Object get() {
                    ComponentRegistrar componentRegistrar2 = componentRegistrar;
                    C8130t.b.m25038e(componentRegistrar2);
                    return componentRegistrar2;
                }
            });
            return this;
        }

        /* renamed from: c */
        public b m25041c(Collection<InterfaceC8496b<ComponentRegistrar>> collection) {
            this.f30729b.addAll(collection);
            return this;
        }

        /* renamed from: d */
        public C8130t m25042d() {
            return new C8130t(this.f30728a, this.f30729b, this.f30730c, this.f30731d);
        }

        /* renamed from: f */
        public b m25043f(InterfaceC8129s interfaceC8129s) {
            this.f30731d = interfaceC8129s;
            return this;
        }
    }

    /* renamed from: j */
    public static b m25025j(Executor executor) {
        return new b(executor);
    }

    /* renamed from: k */
    private void m25026k(List<C8124n<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<InterfaceC8496b<ComponentRegistrar>> it = this.f30723e.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f30727i.mo24983a(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException e2) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e2);
                }
            }
            Iterator<C8124n<?>> it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = it2.next().m24996h().toArray();
                int length = array.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        Object obj = array[i2];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f30724f.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f30724f.add(obj.toString());
                        }
                        i2++;
                    }
                }
            }
            if (this.f30720b.isEmpty()) {
                C8131u.m25044a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f30720b.keySet());
                arrayList2.addAll(list);
                C8131u.m25044a(arrayList2);
            }
            for (final C8124n<?> c8124n : list) {
                this.f30720b.put(c8124n, new C8134x(new InterfaceC8496b() { // from class: com.google.firebase.components.d
                    @Override // com.google.firebase.p205s.InterfaceC8496b
                    public final Object get() {
                        return this.f30686a.m25037p(c8124n);
                    }
                }));
            }
            arrayList.addAll(m25034u(list));
            arrayList.addAll(m25035v());
            m25033t();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        m25032s();
    }

    /* renamed from: l */
    private void m25027l(Map<C8124n<?>, InterfaceC8496b<?>> map, boolean z) {
        for (Map.Entry<C8124n<?>, InterfaceC8496b<?>> entry : map.entrySet()) {
            C8124n<?> key = entry.getKey();
            InterfaceC8496b<?> value = entry.getValue();
            if (key.m24998l() || (key.m24999m() && z)) {
                value.get();
            }
        }
        this.f30725g.m25073c();
    }

    /* renamed from: n */
    private static <T> List<T> m25028n(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Object m25037p(C8124n c8124n) {
        return c8124n.m24994f().mo24937a(new C8113c0(c8124n, this));
    }

    /* renamed from: s */
    private void m25032s() {
        Boolean bool = this.f30726h.get();
        if (bool != null) {
            m25027l(this.f30720b, bool.booleanValue());
        }
    }

    /* renamed from: t */
    private void m25033t() {
        for (C8124n<?> c8124n : this.f30720b.keySet()) {
            for (C8132v c8132v : c8124n.m24993e()) {
                if (c8132v.m25068g() && !this.f30722d.containsKey(c8132v.m25064c())) {
                    this.f30722d.put(c8132v.m25064c(), C8135y.m25075b(Collections.emptySet()));
                } else if (this.f30721c.containsKey(c8132v.m25064c())) {
                    continue;
                } else {
                    if (c8132v.m25067f()) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", c8124n, c8132v.m25064c()));
                    }
                    if (!c8132v.m25068g()) {
                        this.f30721c.put(c8132v.m25064c(), C8136z.m25079b());
                    }
                }
            }
        }
    }

    /* renamed from: u */
    private List<Runnable> m25034u(List<C8124n<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (C8124n<?> c8124n : list) {
            if (c8124n.m25000n()) {
                final InterfaceC8496b<?> interfaceC8496b = this.f30720b.get(c8124n);
                for (C8111b0<? super Object> c8111b0 : c8124n.m24996h()) {
                    if (this.f30721c.containsKey(c8111b0)) {
                        final C8136z c8136z = (C8136z) this.f30721c.get(c8111b0);
                        arrayList.add(new Runnable() { // from class: com.google.firebase.components.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                c8136z.m25085g(interfaceC8496b);
                            }
                        });
                    } else {
                        this.f30721c.put(c8111b0, interfaceC8496b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: v */
    private List<Runnable> m25035v() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry<C8124n<?>, InterfaceC8496b<?>> entry : this.f30720b.entrySet()) {
            C8124n<?> key = entry.getKey();
            if (!key.m25000n()) {
                InterfaceC8496b<?> value = entry.getValue();
                for (C8111b0<? super Object> c8111b0 : key.m24996h()) {
                    if (!map.containsKey(c8111b0)) {
                        map.put(c8111b0, new HashSet());
                    }
                    ((Set) map.get(c8111b0)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f30722d.containsKey(entry2.getKey())) {
                final C8135y<?> c8135y = this.f30722d.get(entry2.getKey());
                for (final InterfaceC8496b interfaceC8496b : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: com.google.firebase.components.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            c8135y.m25077a(interfaceC8496b);
                        }
                    });
                }
            } else {
                this.f30722d.put((C8111b0) entry2.getKey(), C8135y.m25075b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // com.google.firebase.components.InterfaceC8126p
    /* renamed from: a */
    public /* synthetic */ Object mo24973a(Class cls) {
        return C8125o.m25013b(this, cls);
    }

    @Override // com.google.firebase.components.InterfaceC8126p
    /* renamed from: b */
    public synchronized <T> InterfaceC8496b<T> mo24974b(C8111b0<T> c8111b0) {
        C8109a0.m24969c(c8111b0, "Null interface requested.");
        return (InterfaceC8496b) this.f30721c.get(c8111b0);
    }

    @Override // com.google.firebase.components.InterfaceC8126p
    /* renamed from: c */
    public /* synthetic */ InterfaceC8496b mo24975c(Class cls) {
        return C8125o.m25015d(this, cls);
    }

    @Override // com.google.firebase.components.InterfaceC8126p
    /* renamed from: d */
    public /* synthetic */ Set mo24976d(C8111b0 c8111b0) {
        return C8125o.m25016e(this, c8111b0);
    }

    @Override // com.google.firebase.components.InterfaceC8126p
    /* renamed from: e */
    public synchronized <T> InterfaceC8496b<Set<T>> mo24977e(C8111b0<T> c8111b0) {
        C8135y<?> c8135y = this.f30722d.get(c8111b0);
        if (c8135y != null) {
            return c8135y;
        }
        return (InterfaceC8496b<Set<T>>) f30719a;
    }

    @Override // com.google.firebase.components.InterfaceC8126p
    /* renamed from: f */
    public /* synthetic */ Object mo24978f(C8111b0 c8111b0) {
        return C8125o.m25012a(this, c8111b0);
    }

    @Override // com.google.firebase.components.InterfaceC8126p
    /* renamed from: g */
    public /* synthetic */ Set mo24979g(Class cls) {
        return C8125o.m25017f(this, cls);
    }

    @Override // com.google.firebase.components.InterfaceC8126p
    /* renamed from: h */
    public <T> InterfaceC8495a<T> mo24980h(C8111b0<T> c8111b0) {
        InterfaceC8496b<T> interfaceC8496bMo24974b = mo24974b(c8111b0);
        return interfaceC8496bMo24974b == null ? C8136z.m25079b() : interfaceC8496bMo24974b instanceof C8136z ? (C8136z) interfaceC8496bMo24974b : C8136z.m25083f(interfaceC8496bMo24974b);
    }

    @Override // com.google.firebase.components.InterfaceC8126p
    /* renamed from: i */
    public /* synthetic */ InterfaceC8495a mo24981i(Class cls) {
        return C8125o.m25014c(this, cls);
    }

    /* renamed from: m */
    public void m25036m(boolean z) {
        HashMap map;
        if (this.f30726h.compareAndSet(null, Boolean.valueOf(z))) {
            synchronized (this) {
                map = new HashMap(this.f30720b);
            }
            m25027l(map, z);
        }
    }

    private C8130t(Executor executor, Iterable<InterfaceC8496b<ComponentRegistrar>> iterable, Collection<C8124n<?>> collection, InterfaceC8129s interfaceC8129s) {
        this.f30720b = new HashMap();
        this.f30721c = new HashMap();
        this.f30722d = new HashMap();
        this.f30724f = new HashSet();
        this.f30726h = new AtomicReference<>();
        C8133w c8133w = new C8133w(executor);
        this.f30725g = c8133w;
        this.f30727i = interfaceC8129s;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C8124n.m24992q(c8133w, C8133w.class, InterfaceC8482d.class, InterfaceC8481c.class));
        arrayList.add(C8124n.m24992q(this, InterfaceC8478a.class, new Class[0]));
        for (C8124n<?> c8124n : collection) {
            if (c8124n != null) {
                arrayList.add(c8124n);
            }
        }
        this.f30723e = m25028n(iterable);
        m25026k(arrayList);
    }
}
