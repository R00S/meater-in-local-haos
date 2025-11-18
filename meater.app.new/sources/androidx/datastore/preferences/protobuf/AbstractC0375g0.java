package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0357a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ListFieldSchema.java */
/* renamed from: androidx.datastore.preferences.protobuf.g0 */
/* loaded from: classes.dex */
abstract class AbstractC0375g0 {

    /* renamed from: a */
    private static final AbstractC0375g0 f2731a;

    /* renamed from: b */
    private static final AbstractC0375g0 f2732b;

    /* compiled from: ListFieldSchema.java */
    /* renamed from: androidx.datastore.preferences.protobuf.g0$b */
    private static final class b extends AbstractC0375g0 {

        /* renamed from: c */
        private static final Class<?> f2733c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        /* renamed from: f */
        static <E> List<E> m2706f(Object obj, long j2) {
            return (List) C0403p1.m3081A(obj, j2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        private static <L> List<L> m2707g(Object obj, long j2, int i2) {
            C0369e0 c0369e0;
            List<L> listM2706f = m2706f(obj, j2);
            if (listM2706f.isEmpty()) {
                List<L> c0369e02 = listM2706f instanceof InterfaceC0372f0 ? new C0369e0(i2) : ((listM2706f instanceof InterfaceC0426z0) && (listM2706f instanceof C0357a0.i)) ? ((C0357a0.i) listM2706f).mo2570J(i2) : new ArrayList<>(i2);
                C0403p1.m3095O(obj, j2, c0369e02);
                return c0369e02;
            }
            if (f2733c.isAssignableFrom(listM2706f.getClass())) {
                ArrayList arrayList = new ArrayList(listM2706f.size() + i2);
                arrayList.addAll(listM2706f);
                C0403p1.m3095O(obj, j2, arrayList);
                c0369e0 = arrayList;
            } else {
                if (!(listM2706f instanceof C0400o1)) {
                    if (!(listM2706f instanceof InterfaceC0426z0) || !(listM2706f instanceof C0357a0.i)) {
                        return listM2706f;
                    }
                    C0357a0.i iVar = (C0357a0.i) listM2706f;
                    if (iVar.mo2571l1()) {
                        return listM2706f;
                    }
                    C0357a0.i iVarMo2570J = iVar.mo2570J(listM2706f.size() + i2);
                    C0403p1.m3095O(obj, j2, iVarMo2570J);
                    return iVarMo2570J;
                }
                C0369e0 c0369e03 = new C0369e0(listM2706f.size() + i2);
                c0369e03.addAll((C0400o1) listM2706f);
                C0403p1.m3095O(obj, j2, c0369e03);
                c0369e0 = c0369e03;
            }
            return c0369e0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0375g0
        /* renamed from: c */
        void mo2703c(Object obj, long j2) {
            Object objUnmodifiableList;
            List list = (List) C0403p1.m3081A(obj, j2);
            if (list instanceof InterfaceC0372f0) {
                objUnmodifiableList = ((InterfaceC0372f0) list).mo2677k();
            } else {
                if (f2733c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof InterfaceC0426z0) && (list instanceof C0357a0.i)) {
                    C0357a0.i iVar = (C0357a0.i) list;
                    if (iVar.mo2571l1()) {
                        iVar.mo2569B();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            C0403p1.m3095O(obj, j2, objUnmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0375g0
        /* renamed from: d */
        <E> void mo2704d(Object obj, Object obj2, long j2) {
            List listM2706f = m2706f(obj2, j2);
            List listM2707g = m2707g(obj, j2, listM2706f.size());
            int size = listM2707g.size();
            int size2 = listM2706f.size();
            if (size > 0 && size2 > 0) {
                listM2707g.addAll(listM2706f);
            }
            if (size > 0) {
                listM2706f = listM2707g;
            }
            C0403p1.m3095O(obj, j2, listM2706f);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0375g0
        /* renamed from: e */
        <L> List<L> mo2705e(Object obj, long j2) {
            return m2707g(obj, j2, 10);
        }
    }

    /* compiled from: ListFieldSchema.java */
    /* renamed from: androidx.datastore.preferences.protobuf.g0$c */
    private static final class c extends AbstractC0375g0 {
        private c() {
            super();
        }

        /* renamed from: f */
        static <E> C0357a0.i<E> m2708f(Object obj, long j2) {
            return (C0357a0.i) C0403p1.m3081A(obj, j2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0375g0
        /* renamed from: c */
        void mo2703c(Object obj, long j2) {
            m2708f(obj, j2).mo2569B();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0375g0
        /* renamed from: d */
        <E> void mo2704d(Object obj, Object obj2, long j2) {
            C0357a0.i iVarM2708f = m2708f(obj, j2);
            C0357a0.i iVarM2708f2 = m2708f(obj2, j2);
            int size = iVarM2708f.size();
            int size2 = iVarM2708f2.size();
            if (size > 0 && size2 > 0) {
                if (!iVarM2708f.mo2571l1()) {
                    iVarM2708f = iVarM2708f.mo2570J(size2 + size);
                }
                iVarM2708f.addAll(iVarM2708f2);
            }
            if (size > 0) {
                iVarM2708f2 = iVarM2708f;
            }
            C0403p1.m3095O(obj, j2, iVarM2708f2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0375g0
        /* renamed from: e */
        <L> List<L> mo2705e(Object obj, long j2) {
            C0357a0.i iVarM2708f = m2708f(obj, j2);
            if (iVarM2708f.mo2571l1()) {
                return iVarM2708f;
            }
            int size = iVarM2708f.size();
            C0357a0.i iVarMo2570J = iVarM2708f.mo2570J(size == 0 ? 10 : size * 2);
            C0403p1.m3095O(obj, j2, iVarMo2570J);
            return iVarMo2570J;
        }
    }

    static {
        f2731a = new b();
        f2732b = new c();
    }

    /* renamed from: a */
    static AbstractC0375g0 m2701a() {
        return f2731a;
    }

    /* renamed from: b */
    static AbstractC0375g0 m2702b() {
        return f2732b;
    }

    /* renamed from: c */
    abstract void mo2703c(Object obj, long j2);

    /* renamed from: d */
    abstract <L> void mo2704d(Object obj, Object obj2, long j2);

    /* renamed from: e */
    abstract <L> List<L> mo2705e(Object obj, long j2);

    private AbstractC0375g0() {
    }
}
