package Hb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: TypeAttributes.kt */
/* loaded from: classes3.dex */
public final class u0 extends Ob.e<s0<?>, s0<?>> implements Iterable<s0<?>>, Ca.a {

    /* renamed from: C, reason: collision with root package name */
    public static final a f5791C = new a(null);

    /* renamed from: D, reason: collision with root package name */
    private static final u0 f5792D = new u0((List<? extends s0<?>>) kotlin.collections.r.m());

    /* compiled from: TypeAttributes.kt */
    public static final class a extends Ob.z<s0<?>, s0<?>> {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        @Override // Ob.z
        public int b(ConcurrentHashMap<String, Integer> concurrentHashMap, String key, Ba.l<? super String, Integer> compute) {
            int iIntValue;
            C3862t.g(concurrentHashMap, "<this>");
            C3862t.g(key, "key");
            C3862t.g(compute, "compute");
            Integer num = concurrentHashMap.get(key);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = concurrentHashMap.get(key);
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        Integer numInvoke = compute.invoke(key);
                        concurrentHashMap.putIfAbsent(key, Integer.valueOf(numInvoke.intValue()));
                        iIntValue = numInvoke.intValue();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return iIntValue;
        }

        public final u0 i(List<? extends s0<?>> attributes) {
            C3862t.g(attributes, "attributes");
            return attributes.isEmpty() ? j() : new u0(attributes, null);
        }

        public final u0 j() {
            return u0.f5792D;
        }

        private a() {
        }
    }

    public /* synthetic */ u0(List list, C3854k c3854k) {
        this((List<? extends s0<?>>) list);
    }

    public final u0 A(s0<?> attribute) {
        C3862t.g(attribute, "attribute");
        if (y(attribute)) {
            return this;
        }
        if (isEmpty()) {
            return new u0(attribute);
        }
        return f5791C.i(kotlin.collections.r.G0(kotlin.collections.r.W0(this), attribute));
    }

    public final u0 B(s0<?> attribute) {
        C3862t.g(attribute, "attribute");
        if (isEmpty()) {
            return this;
        }
        Ob.c<s0<?>> cVarC = c();
        ArrayList arrayList = new ArrayList();
        for (s0<?> s0Var : cVarC) {
            if (!C3862t.b(s0Var, attribute)) {
                arrayList.add(s0Var);
            }
        }
        return arrayList.size() == c().c() ? this : f5791C.i(arrayList);
    }

    @Override // Ob.AbstractC1584a
    protected Ob.z<s0<?>, s0<?>> h() {
        return f5791C;
    }

    public final u0 x(u0 other) {
        C3862t.g(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f5791C.g().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            s0<?> s0Var = c().get(iIntValue);
            s0<?> s0Var2 = other.c().get(iIntValue);
            Rb.a.a(arrayList, s0Var == null ? s0Var2 != null ? s0Var2.a(s0Var) : null : s0Var.a(s0Var2));
        }
        return f5791C.i(arrayList);
    }

    public final boolean y(s0<?> attribute) {
        C3862t.g(attribute, "attribute");
        return c().get(f5791C.d(attribute.b())) != null;
    }

    public final u0 z(u0 other) {
        C3862t.g(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f5791C.g().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            s0<?> s0Var = c().get(iIntValue);
            s0<?> s0Var2 = other.c().get(iIntValue);
            Rb.a.a(arrayList, s0Var == null ? s0Var2 != null ? s0Var2.c(s0Var) : null : s0Var.c(s0Var2));
        }
        return f5791C.i(arrayList);
    }

    private u0(List<? extends s0<?>> list) {
        for (s0<?> s0Var : list) {
            i(s0Var.b(), s0Var);
        }
    }

    private u0(s0<?> s0Var) {
        this((List<? extends s0<?>>) kotlin.collections.r.e(s0Var));
    }
}
