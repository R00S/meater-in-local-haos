package com.google.protobuf;

import com.google.protobuf.C2964y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ListFieldSchema.java */
/* loaded from: classes2.dex */
abstract class F {

    /* renamed from: a, reason: collision with root package name */
    private static final F f39166a;

    /* renamed from: b, reason: collision with root package name */
    private static final F f39167b;

    /* compiled from: ListFieldSchema.java */
    private static final class b extends F {

        /* renamed from: c, reason: collision with root package name */
        private static final Class<?> f39168c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static <E> List<E> f(Object obj, long j10) {
            return (List) p0.C(obj, j10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static <L> List<L> g(Object obj, long j10, int i10) {
            D d10;
            List<L> listF = f(obj, j10);
            if (listF.isEmpty()) {
                List<L> d11 = listF instanceof E ? new D(i10) : ((listF instanceof Z) && (listF instanceof C2964y.i)) ? ((C2964y.i) listF).k2(i10) : new ArrayList<>(i10);
                p0.R(obj, j10, d11);
                return d11;
            }
            if (f39168c.isAssignableFrom(listF.getClass())) {
                ArrayList arrayList = new ArrayList(listF.size() + i10);
                arrayList.addAll(listF);
                p0.R(obj, j10, arrayList);
                d10 = arrayList;
            } else {
                if (!(listF instanceof o0)) {
                    if (!(listF instanceof Z) || !(listF instanceof C2964y.i)) {
                        return listF;
                    }
                    C2964y.i iVar = (C2964y.i) listF;
                    if (iVar.q()) {
                        return listF;
                    }
                    C2964y.i iVarK2 = iVar.k2(listF.size() + i10);
                    p0.R(obj, j10, iVarK2);
                    return iVarK2;
                }
                D d12 = new D(listF.size() + i10);
                d12.addAll((o0) listF);
                p0.R(obj, j10, d12);
                d10 = d12;
            }
            return d10;
        }

        @Override // com.google.protobuf.F
        void c(Object obj, long j10) {
            Object objUnmodifiableList;
            List list = (List) p0.C(obj, j10);
            if (list instanceof E) {
                objUnmodifiableList = ((E) list).m();
            } else {
                if (f39168c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof Z) && (list instanceof C2964y.i)) {
                    C2964y.i iVar = (C2964y.i) list;
                    if (iVar.q()) {
                        iVar.n();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            p0.R(obj, j10, objUnmodifiableList);
        }

        @Override // com.google.protobuf.F
        <E> void d(Object obj, Object obj2, long j10) {
            List listF = f(obj2, j10);
            List listG = g(obj, j10, listF.size());
            int size = listG.size();
            int size2 = listF.size();
            if (size > 0 && size2 > 0) {
                listG.addAll(listF);
            }
            if (size > 0) {
                listF = listG;
            }
            p0.R(obj, j10, listF);
        }

        @Override // com.google.protobuf.F
        <L> List<L> e(Object obj, long j10) {
            return g(obj, j10, 10);
        }
    }

    /* compiled from: ListFieldSchema.java */
    private static final class c extends F {
        private c() {
            super();
        }

        static <E> C2964y.i<E> f(Object obj, long j10) {
            return (C2964y.i) p0.C(obj, j10);
        }

        @Override // com.google.protobuf.F
        void c(Object obj, long j10) {
            f(obj, j10).n();
        }

        @Override // com.google.protobuf.F
        <E> void d(Object obj, Object obj2, long j10) {
            C2964y.i iVarF = f(obj, j10);
            C2964y.i iVarF2 = f(obj2, j10);
            int size = iVarF.size();
            int size2 = iVarF2.size();
            if (size > 0 && size2 > 0) {
                if (!iVarF.q()) {
                    iVarF = iVarF.k2(size2 + size);
                }
                iVarF.addAll(iVarF2);
            }
            if (size > 0) {
                iVarF2 = iVarF;
            }
            p0.R(obj, j10, iVarF2);
        }

        @Override // com.google.protobuf.F
        <L> List<L> e(Object obj, long j10) {
            C2964y.i iVarF = f(obj, j10);
            if (iVarF.q()) {
                return iVarF;
            }
            int size = iVarF.size();
            C2964y.i iVarK2 = iVarF.k2(size == 0 ? 10 : size * 2);
            p0.R(obj, j10, iVarK2);
            return iVarK2;
        }
    }

    static {
        f39166a = new b();
        f39167b = new c();
    }

    static F a() {
        return f39166a;
    }

    static F b() {
        return f39167b;
    }

    abstract void c(Object obj, long j10);

    abstract <L> void d(Object obj, Object obj2, long j10);

    abstract <L> List<L> e(Object obj, long j10);

    private F() {
    }
}
