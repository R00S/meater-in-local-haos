package K8;

import K8.n;
import android.util.Log;
import b9.InterfaceC2273a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import j9.InterfaceC3754a;
import j9.InterfaceC3755b;
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
import kotlin.C4734X;

/* compiled from: ComponentRuntime.java */
/* loaded from: classes2.dex */
public class n implements d, InterfaceC2273a {

    /* renamed from: i, reason: collision with root package name */
    private static final InterfaceC3755b<Set<Object>> f8768i = new InterfaceC3755b() { // from class: K8.j
        @Override // j9.InterfaceC3755b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Map<c<?>, InterfaceC3755b<?>> f8769a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<A<?>, InterfaceC3755b<?>> f8770b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<A<?>, u<?>> f8771c;

    /* renamed from: d, reason: collision with root package name */
    private final List<InterfaceC3755b<ComponentRegistrar>> f8772d;

    /* renamed from: e, reason: collision with root package name */
    private Set<String> f8773e;

    /* renamed from: f, reason: collision with root package name */
    private final s f8774f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference<Boolean> f8775g;

    /* renamed from: h, reason: collision with root package name */
    private final i f8776h;

    public static b m(Executor executor) {
        return new b(executor);
    }

    private void n(List<c<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<InterfaceC3755b<ComponentRegistrar>> it = this.f8772d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f8776h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator<c<?>> it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = it2.next().j().toArray();
                int length = array.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        Object obj = array[i10];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f8773e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f8773e.add(obj.toString());
                        }
                        i10++;
                    }
                }
            }
            if (this.f8769a.isEmpty()) {
                p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f8769a.keySet());
                arrayList2.addAll(list);
                p.a(arrayList2);
            }
            for (final c<?> cVar : list) {
                this.f8769a.put(cVar, new t(new InterfaceC3755b() { // from class: K8.k
                    @Override // j9.InterfaceC3755b
                    public final Object get() {
                        return this.f8762a.r(cVar);
                    }
                }));
            }
            arrayList.addAll(w(list));
            arrayList.addAll(x());
            v();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        u();
    }

    private void o(Map<c<?>, InterfaceC3755b<?>> map, boolean z10) {
        for (Map.Entry<c<?>, InterfaceC3755b<?>> entry : map.entrySet()) {
            c<?> key = entry.getKey();
            InterfaceC3755b<?> value = entry.getValue();
            if (key.n() || (key.o() && z10)) {
                value.get();
            }
        }
        this.f8774f.d();
    }

    private static <T> List<T> q(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(c cVar) {
        return cVar.h().a(new B(cVar, this));
    }

    private void u() {
        Boolean bool = this.f8775g.get();
        if (bool != null) {
            o(this.f8769a, bool.booleanValue());
        }
    }

    private void v() {
        for (c<?> cVar : this.f8769a.keySet()) {
            for (q qVar : cVar.g()) {
                if (qVar.g() && !this.f8771c.containsKey(qVar.c())) {
                    this.f8771c.put(qVar.c(), u.b(Collections.emptySet()));
                } else if (this.f8770b.containsKey(qVar.c())) {
                    continue;
                } else {
                    if (qVar.f()) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", cVar, qVar.c()));
                    }
                    if (!qVar.g()) {
                        this.f8770b.put(qVar.c(), y.e());
                    }
                }
            }
        }
    }

    private List<Runnable> w(List<c<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (c<?> cVar : list) {
            if (cVar.p()) {
                final InterfaceC3755b<?> interfaceC3755b = this.f8769a.get(cVar);
                for (A<? super Object> a10 : cVar.j()) {
                    if (this.f8770b.containsKey(a10)) {
                        final y yVar = (y) this.f8770b.get(a10);
                        arrayList.add(new Runnable() { // from class: K8.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                yVar.j(interfaceC3755b);
                            }
                        });
                    } else {
                        this.f8770b.put(a10, interfaceC3755b);
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> x() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry<c<?>, InterfaceC3755b<?>> entry : this.f8769a.entrySet()) {
            c<?> key = entry.getKey();
            if (!key.p()) {
                InterfaceC3755b<?> value = entry.getValue();
                for (A<? super Object> a10 : key.j()) {
                    if (!map.containsKey(a10)) {
                        map.put(a10, new HashSet());
                    }
                    ((Set) map.get(a10)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f8771c.containsKey(entry2.getKey())) {
                final u<?> uVar = this.f8771c.get(entry2.getKey());
                for (final InterfaceC3755b interfaceC3755b : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: K8.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            uVar.a(interfaceC3755b);
                        }
                    });
                }
            } else {
                this.f8771c.put((A) entry2.getKey(), u.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // K8.d
    public <T> InterfaceC3754a<T> b(A<T> a10) {
        InterfaceC3755b<T> interfaceC3755bF = f(a10);
        return interfaceC3755bF == null ? y.e() : interfaceC3755bF instanceof y ? (y) interfaceC3755bF : y.i(interfaceC3755bF);
    }

    @Override // K8.d
    public synchronized <T> InterfaceC3755b<Set<T>> c(A<T> a10) {
        u<?> uVar = this.f8771c.get(a10);
        if (uVar != null) {
            return uVar;
        }
        return (InterfaceC3755b<Set<T>>) f8768i;
    }

    @Override // K8.d
    public synchronized <T> InterfaceC3755b<T> f(A<T> a10) {
        z.c(a10, "Null interface requested.");
        return (InterfaceC3755b) this.f8770b.get(a10);
    }

    public void p(boolean z10) {
        HashMap map;
        if (C4734X.a(this.f8775g, null, Boolean.valueOf(z10))) {
            synchronized (this) {
                map = new HashMap(this.f8769a);
            }
            o(map, z10);
        }
    }

    private n(Executor executor, Iterable<InterfaceC3755b<ComponentRegistrar>> iterable, Collection<c<?>> collection, i iVar) {
        this.f8769a = new HashMap();
        this.f8770b = new HashMap();
        this.f8771c = new HashMap();
        this.f8773e = new HashSet();
        this.f8775g = new AtomicReference<>();
        s sVar = new s(executor);
        this.f8774f = sVar;
        this.f8776h = iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.s(sVar, s.class, g9.d.class, g9.c.class));
        arrayList.add(c.s(this, InterfaceC2273a.class, new Class[0]));
        for (c<?> cVar : collection) {
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        this.f8772d = q(iterable);
        n(arrayList);
    }

    /* compiled from: ComponentRuntime.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f8777a;

        /* renamed from: b, reason: collision with root package name */
        private final List<InterfaceC3755b<ComponentRegistrar>> f8778b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final List<c<?>> f8779c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private i f8780d = i.f8761a;

        b(Executor executor) {
            this.f8777a = executor;
        }

        public b b(c<?> cVar) {
            this.f8779c.add(cVar);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f8778b.add(new InterfaceC3755b() { // from class: K8.o
                @Override // j9.InterfaceC3755b
                public final Object get() {
                    return n.b.f(componentRegistrar);
                }
            });
            return this;
        }

        public b d(Collection<InterfaceC3755b<ComponentRegistrar>> collection) {
            this.f8778b.addAll(collection);
            return this;
        }

        public n e() {
            return new n(this.f8777a, this.f8778b, this.f8779c, this.f8780d);
        }

        public b g(i iVar) {
            this.f8780d = iVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }
    }
}
