package jb;

import Db.C1001g;
import Hb.U;
import Ra.C1711y;
import Ra.InterfaceC1692e;
import Ra.M;
import Ra.h0;
import Ra.t0;
import bb.C2275a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jb.x;
import kotlin.jvm.internal.C3862t;
import lb.C3922b;
import nb.InterfaceC4077c;
import vb.AbstractC4943g;
import vb.C4932B;
import vb.C4933C;
import vb.C4934D;
import vb.C4935E;
import vb.C4937a;
import vb.C4940d;
import vb.C4942f;
import vb.C4945i;

/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
/* renamed from: jb.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3774h extends AbstractC3770d<Sa.c, AbstractC4943g<?>> {

    /* renamed from: d, reason: collision with root package name */
    private final Ra.H f43622d;

    /* renamed from: e, reason: collision with root package name */
    private final M f43623e;

    /* renamed from: f, reason: collision with root package name */
    private final C1001g f43624f;

    /* renamed from: g, reason: collision with root package name */
    private pb.e f43625g;

    /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
    /* renamed from: jb.h$a */
    private abstract class a implements x.a {

        /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
        /* renamed from: jb.h$a$a, reason: collision with other inner class name */
        public static final class C0562a implements x.a {

            /* renamed from: a, reason: collision with root package name */
            private final /* synthetic */ x.a f43627a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ x.a f43628b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f43629c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ qb.f f43630d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ArrayList<Sa.c> f43631e;

            C0562a(x.a aVar, a aVar2, qb.f fVar, ArrayList<Sa.c> arrayList) {
                this.f43628b = aVar;
                this.f43629c = aVar2;
                this.f43630d = fVar;
                this.f43631e = arrayList;
                this.f43627a = aVar;
            }

            @Override // jb.x.a
            public void a() {
                this.f43628b.a();
                this.f43629c.h(this.f43630d, new C4937a((Sa.c) kotlin.collections.r.J0(this.f43631e)));
            }

            @Override // jb.x.a
            public void b(qb.f fVar, Object obj) {
                this.f43627a.b(fVar, obj);
            }

            @Override // jb.x.a
            public void c(qb.f fVar, qb.b enumClassId, qb.f enumEntryName) {
                C3862t.g(enumClassId, "enumClassId");
                C3862t.g(enumEntryName, "enumEntryName");
                this.f43627a.c(fVar, enumClassId, enumEntryName);
            }

            @Override // jb.x.a
            public x.a d(qb.f fVar, qb.b classId) {
                C3862t.g(classId, "classId");
                return this.f43627a.d(fVar, classId);
            }

            @Override // jb.x.a
            public x.b e(qb.f fVar) {
                return this.f43627a.e(fVar);
            }

            @Override // jb.x.a
            public void f(qb.f fVar, C4942f value) {
                C3862t.g(value, "value");
                this.f43627a.f(fVar, value);
            }
        }

        /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
        /* renamed from: jb.h$a$b */
        public static final class b implements x.b {

            /* renamed from: a, reason: collision with root package name */
            private final ArrayList<AbstractC4943g<?>> f43632a = new ArrayList<>();

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3774h f43633b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ qb.f f43634c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f43635d;

            /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
            /* renamed from: jb.h$a$b$a, reason: collision with other inner class name */
            public static final class C0563a implements x.a {

                /* renamed from: a, reason: collision with root package name */
                private final /* synthetic */ x.a f43636a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ x.a f43637b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ b f43638c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ ArrayList<Sa.c> f43639d;

                C0563a(x.a aVar, b bVar, ArrayList<Sa.c> arrayList) {
                    this.f43637b = aVar;
                    this.f43638c = bVar;
                    this.f43639d = arrayList;
                    this.f43636a = aVar;
                }

                @Override // jb.x.a
                public void a() {
                    this.f43637b.a();
                    this.f43638c.f43632a.add(new C4937a((Sa.c) kotlin.collections.r.J0(this.f43639d)));
                }

                @Override // jb.x.a
                public void b(qb.f fVar, Object obj) {
                    this.f43636a.b(fVar, obj);
                }

                @Override // jb.x.a
                public void c(qb.f fVar, qb.b enumClassId, qb.f enumEntryName) {
                    C3862t.g(enumClassId, "enumClassId");
                    C3862t.g(enumEntryName, "enumEntryName");
                    this.f43636a.c(fVar, enumClassId, enumEntryName);
                }

                @Override // jb.x.a
                public x.a d(qb.f fVar, qb.b classId) {
                    C3862t.g(classId, "classId");
                    return this.f43636a.d(fVar, classId);
                }

                @Override // jb.x.a
                public x.b e(qb.f fVar) {
                    return this.f43636a.e(fVar);
                }

                @Override // jb.x.a
                public void f(qb.f fVar, C4942f value) {
                    C3862t.g(value, "value");
                    this.f43636a.f(fVar, value);
                }
            }

            b(C3774h c3774h, qb.f fVar, a aVar) {
                this.f43633b = c3774h;
                this.f43634c = fVar;
                this.f43635d = aVar;
            }

            @Override // jb.x.b
            public void a() {
                this.f43635d.g(this.f43634c, this.f43632a);
            }

            @Override // jb.x.b
            public void b(qb.b enumClassId, qb.f enumEntryName) {
                C3862t.g(enumClassId, "enumClassId");
                C3862t.g(enumEntryName, "enumEntryName");
                this.f43632a.add(new vb.k(enumClassId, enumEntryName));
            }

            @Override // jb.x.b
            public void c(Object obj) {
                this.f43632a.add(this.f43633b.O(this.f43634c, obj));
            }

            @Override // jb.x.b
            public x.a d(qb.b classId) {
                C3862t.g(classId, "classId");
                ArrayList arrayList = new ArrayList();
                C3774h c3774h = this.f43633b;
                h0 NO_SOURCE = h0.f15158a;
                C3862t.f(NO_SOURCE, "NO_SOURCE");
                x.a aVarX = c3774h.x(classId, NO_SOURCE, arrayList);
                C3862t.d(aVarX);
                return new C0563a(aVarX, this, arrayList);
            }

            @Override // jb.x.b
            public void e(C4942f value) {
                C3862t.g(value, "value");
                this.f43632a.add(new vb.t(value));
            }
        }

        public a() {
        }

        @Override // jb.x.a
        public void b(qb.f fVar, Object obj) {
            h(fVar, C3774h.this.O(fVar, obj));
        }

        @Override // jb.x.a
        public void c(qb.f fVar, qb.b enumClassId, qb.f enumEntryName) {
            C3862t.g(enumClassId, "enumClassId");
            C3862t.g(enumEntryName, "enumEntryName");
            h(fVar, new vb.k(enumClassId, enumEntryName));
        }

        @Override // jb.x.a
        public x.a d(qb.f fVar, qb.b classId) {
            C3862t.g(classId, "classId");
            ArrayList arrayList = new ArrayList();
            C3774h c3774h = C3774h.this;
            h0 NO_SOURCE = h0.f15158a;
            C3862t.f(NO_SOURCE, "NO_SOURCE");
            x.a aVarX = c3774h.x(classId, NO_SOURCE, arrayList);
            C3862t.d(aVarX);
            return new C0562a(aVarX, this, fVar, arrayList);
        }

        @Override // jb.x.a
        public x.b e(qb.f fVar) {
            return new b(C3774h.this, fVar, this);
        }

        @Override // jb.x.a
        public void f(qb.f fVar, C4942f value) {
            C3862t.g(value, "value");
            h(fVar, new vb.t(value));
        }

        public abstract void g(qb.f fVar, ArrayList<AbstractC4943g<?>> arrayList);

        public abstract void h(qb.f fVar, AbstractC4943g<?> abstractC4943g);
    }

    /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
    /* renamed from: jb.h$b */
    public static final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        private final HashMap<qb.f, AbstractC4943g<?>> f43640b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC1692e f43642d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ qb.b f43643e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<Sa.c> f43644f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ h0 f43645g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC1692e interfaceC1692e, qb.b bVar, List<Sa.c> list, h0 h0Var) {
            super();
            this.f43642d = interfaceC1692e;
            this.f43643e = bVar;
            this.f43644f = list;
            this.f43645g = h0Var;
            this.f43640b = new HashMap<>();
        }

        @Override // jb.x.a
        public void a() {
            if (C3774h.this.F(this.f43643e, this.f43640b) || C3774h.this.w(this.f43643e)) {
                return;
            }
            this.f43644f.add(new Sa.d(this.f43642d.u(), this.f43640b, this.f43645g));
        }

        @Override // jb.C3774h.a
        public void g(qb.f fVar, ArrayList<AbstractC4943g<?>> elements) {
            C3862t.g(elements, "elements");
            if (fVar == null) {
                return;
            }
            t0 t0VarB = C2275a.b(fVar, this.f43642d);
            if (t0VarB != null) {
                HashMap<qb.f, AbstractC4943g<?>> map = this.f43640b;
                C4945i c4945i = C4945i.f51601a;
                List<? extends AbstractC4943g<?>> listC = Rb.a.c(elements);
                U uA = t0VarB.a();
                C3862t.f(uA, "getType(...)");
                map.put(fVar, c4945i.b(listC, uA));
                return;
            }
            if (C3774h.this.w(this.f43643e) && C3862t.b(fVar.j(), "value")) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : elements) {
                    if (obj instanceof C4937a) {
                        arrayList.add(obj);
                    }
                }
                List<Sa.c> list = this.f43644f;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    list.add(((C4937a) it.next()).b());
                }
            }
        }

        @Override // jb.C3774h.a
        public void h(qb.f fVar, AbstractC4943g<?> value) {
            C3862t.g(value, "value");
            if (fVar != null) {
                this.f43640b.put(fVar, value);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3774h(Ra.H module, M notFoundClasses, Gb.n storageManager, v kotlinClassFinder) {
        super(storageManager, kotlinClassFinder);
        C3862t.g(module, "module");
        C3862t.g(notFoundClasses, "notFoundClasses");
        C3862t.g(storageManager, "storageManager");
        C3862t.g(kotlinClassFinder, "kotlinClassFinder");
        this.f43622d = module;
        this.f43623e = notFoundClasses;
        this.f43624f = new C1001g(module, notFoundClasses);
        this.f43625g = pb.e.f47733i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC4943g<?> O(qb.f fVar, Object obj) {
        AbstractC4943g<?> abstractC4943gE = C4945i.f51601a.e(obj, this.f43622d);
        if (abstractC4943gE != null) {
            return abstractC4943gE;
        }
        return vb.l.f51604b.a("Unsupported annotation argument: " + fVar);
    }

    private final InterfaceC1692e R(qb.b bVar) {
        return C1711y.d(this.f43622d, bVar, this.f43623e);
    }

    @Override // jb.AbstractC3771e, Db.InterfaceC1002h
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public Sa.c k(C3922b proto, InterfaceC4077c nameResolver) {
        C3862t.g(proto, "proto");
        C3862t.g(nameResolver, "nameResolver");
        return this.f43624f.a(proto, nameResolver);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // jb.AbstractC3770d
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public AbstractC4943g<?> I(String desc, Object initializer) {
        C3862t.g(desc, "desc");
        C3862t.g(initializer, "initializer");
        if (Ub.n.L("ZBCS", desc, false, 2, null)) {
            int iIntValue = ((Integer) initializer).intValue();
            int iHashCode = desc.hashCode();
            if (iHashCode == 66) {
                if (desc.equals("B")) {
                    initializer = Byte.valueOf((byte) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 67) {
                if (desc.equals("C")) {
                    initializer = Character.valueOf((char) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 83) {
                if (desc.equals("S")) {
                    initializer = Short.valueOf((short) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 90 && desc.equals("Z")) {
                initializer = Boolean.valueOf(iIntValue != 0);
            }
            throw new AssertionError(desc);
        }
        return C4945i.f51601a.e(initializer, this.f43622d);
    }

    public void S(pb.e eVar) {
        C3862t.g(eVar, "<set-?>");
        this.f43625g = eVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // jb.AbstractC3770d
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public AbstractC4943g<?> M(AbstractC4943g<?> constant) {
        AbstractC4943g<?> c4934d;
        C3862t.g(constant, "constant");
        if (constant instanceof C4940d) {
            c4934d = new C4932B(((C4940d) constant).b().byteValue());
        } else if (constant instanceof vb.x) {
            c4934d = new C4935E(((vb.x) constant).b().shortValue());
        } else if (constant instanceof vb.n) {
            c4934d = new C4933C(((vb.n) constant).b().intValue());
        } else {
            if (!(constant instanceof vb.u)) {
                return constant;
            }
            c4934d = new C4934D(((vb.u) constant).b().longValue());
        }
        return c4934d;
    }

    @Override // jb.AbstractC3771e
    public pb.e u() {
        return this.f43625g;
    }

    @Override // jb.AbstractC3771e
    protected x.a x(qb.b annotationClassId, h0 source, List<Sa.c> result) {
        C3862t.g(annotationClassId, "annotationClassId");
        C3862t.g(source, "source");
        C3862t.g(result, "result");
        return new b(R(annotationClassId), annotationClassId, result, source);
    }
}
