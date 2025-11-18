package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10813s;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10601j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10736x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.C10617d;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c;
import kotlin.reflect.jvm.internal.impl.utils.C10767a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.C9963a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10123b;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10151c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10215k;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10204a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10208d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10210f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10212h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10214j;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10217m;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10221q;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10222r;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10225u;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10227w;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10228x;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10229y;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10230z;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10276e;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.text.C10547v;

/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.c */
/* loaded from: classes3.dex */
public final class C10085c extends AbstractC10081a<InterfaceC10616c, AbstractC10211g<?>> {

    /* renamed from: c */
    private final InterfaceC10592g0 f38379c;

    /* renamed from: d */
    private final C10601j0 f38380d;

    /* renamed from: e */
    private final C10276e f38381e;

    /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.c$a */
    private abstract class a implements InterfaceC10101q.a {

        /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.b.c$a$a, reason: collision with other inner class name */
        public static final class C11547a implements InterfaceC10101q.a {

            /* renamed from: a */
            private final /* synthetic */ InterfaceC10101q.a f38383a;

            /* renamed from: b */
            final /* synthetic */ InterfaceC10101q.a f38384b;

            /* renamed from: c */
            final /* synthetic */ a f38385c;

            /* renamed from: d */
            final /* synthetic */ C10163f f38386d;

            /* renamed from: e */
            final /* synthetic */ ArrayList<InterfaceC10616c> f38387e;

            C11547a(InterfaceC10101q.a aVar, a aVar2, C10163f c10163f, ArrayList<InterfaceC10616c> arrayList) {
                this.f38384b = aVar;
                this.f38385c = aVar2;
                this.f38386d = c10163f;
                this.f38387e = arrayList;
                this.f38383a = aVar;
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
            /* renamed from: a */
            public void mo33903a() {
                this.f38384b.mo33903a();
                this.f38385c.mo33902h(this.f38386d, new C10204a((InterfaceC10616c) C10813s.m38866s0(this.f38387e)));
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
            /* renamed from: b */
            public void mo33896b(C10163f c10163f, C10210f c10210f) {
                C9801m.m32346f(c10210f, "value");
                this.f38383a.mo33896b(c10163f, c10210f);
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
            /* renamed from: c */
            public void mo33897c(C10163f c10163f, Object obj) {
                this.f38383a.mo33897c(c10163f, obj);
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
            /* renamed from: d */
            public void mo33898d(C10163f c10163f, C10159b c10159b, C10163f c10163f2) {
                C9801m.m32346f(c10159b, "enumClassId");
                C9801m.m32346f(c10163f2, "enumEntryName");
                this.f38383a.mo33898d(c10163f, c10159b, c10163f2);
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
            /* renamed from: e */
            public InterfaceC10101q.a mo33899e(C10163f c10163f, C10159b c10159b) {
                C9801m.m32346f(c10159b, "classId");
                return this.f38383a.mo33899e(c10163f, c10159b);
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
            /* renamed from: f */
            public InterfaceC10101q.b mo33900f(C10163f c10163f) {
                return this.f38383a.mo33900f(c10163f);
            }
        }

        /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.b.c$a$b */
        public static final class b implements InterfaceC10101q.b {

            /* renamed from: a */
            private final ArrayList<AbstractC10211g<?>> f38388a = new ArrayList<>();

            /* renamed from: b */
            final /* synthetic */ C10085c f38389b;

            /* renamed from: c */
            final /* synthetic */ C10163f f38390c;

            /* renamed from: d */
            final /* synthetic */ a f38391d;

            /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
            /* renamed from: kotlin.f0.y.e.j0.d.b.c$a$b$a, reason: collision with other inner class name */
            public static final class C11548a implements InterfaceC10101q.a {

                /* renamed from: a */
                private final /* synthetic */ InterfaceC10101q.a f38392a;

                /* renamed from: b */
                final /* synthetic */ InterfaceC10101q.a f38393b;

                /* renamed from: c */
                final /* synthetic */ b f38394c;

                /* renamed from: d */
                final /* synthetic */ ArrayList<InterfaceC10616c> f38395d;

                C11548a(InterfaceC10101q.a aVar, b bVar, ArrayList<InterfaceC10616c> arrayList) {
                    this.f38393b = aVar;
                    this.f38394c = bVar;
                    this.f38395d = arrayList;
                    this.f38392a = aVar;
                }

                @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
                /* renamed from: a */
                public void mo33903a() {
                    this.f38393b.mo33903a();
                    this.f38394c.f38388a.add(new C10204a((InterfaceC10616c) C10813s.m38866s0(this.f38395d)));
                }

                @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
                /* renamed from: b */
                public void mo33896b(C10163f c10163f, C10210f c10210f) {
                    C9801m.m32346f(c10210f, "value");
                    this.f38392a.mo33896b(c10163f, c10210f);
                }

                @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
                /* renamed from: c */
                public void mo33897c(C10163f c10163f, Object obj) {
                    this.f38392a.mo33897c(c10163f, obj);
                }

                @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
                /* renamed from: d */
                public void mo33898d(C10163f c10163f, C10159b c10159b, C10163f c10163f2) {
                    C9801m.m32346f(c10159b, "enumClassId");
                    C9801m.m32346f(c10163f2, "enumEntryName");
                    this.f38392a.mo33898d(c10163f, c10159b, c10163f2);
                }

                @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
                /* renamed from: e */
                public InterfaceC10101q.a mo33899e(C10163f c10163f, C10159b c10159b) {
                    C9801m.m32346f(c10159b, "classId");
                    return this.f38392a.mo33899e(c10163f, c10159b);
                }

                @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
                /* renamed from: f */
                public InterfaceC10101q.b mo33900f(C10163f c10163f) {
                    return this.f38392a.mo33900f(c10163f);
                }
            }

            b(C10085c c10085c, C10163f c10163f, a aVar) {
                this.f38389b = c10085c;
                this.f38390c = c10163f;
                this.f38391d = aVar;
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.b
            /* renamed from: a */
            public void mo33905a() {
                this.f38391d.mo33901g(this.f38390c, this.f38388a);
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.b
            /* renamed from: b */
            public void mo33906b(Object obj) {
                this.f38388a.add(this.f38389b.m33891K(this.f38390c, obj));
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.b
            /* renamed from: c */
            public void mo33907c(C10159b c10159b, C10163f c10163f) {
                C9801m.m32346f(c10159b, "enumClassId");
                C9801m.m32346f(c10163f, "enumEntryName");
                this.f38388a.add(new C10214j(c10159b, c10163f));
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.b
            /* renamed from: d */
            public InterfaceC10101q.a mo33908d(C10159b c10159b) {
                C9801m.m32346f(c10159b, "classId");
                ArrayList arrayList = new ArrayList();
                C10085c c10085c = this.f38389b;
                InterfaceC10741z0 interfaceC10741z0 = InterfaceC10741z0.f41247a;
                C9801m.m32345e(interfaceC10741z0, "NO_SOURCE");
                InterfaceC10101q.a aVarMo33885x = c10085c.mo33885x(c10159b, interfaceC10741z0, arrayList);
                C9801m.m32343c(aVarMo33885x);
                return new C11548a(aVarMo33885x, this, arrayList);
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.b
            /* renamed from: e */
            public void mo33909e(C10210f c10210f) {
                C9801m.m32346f(c10210f, "value");
                this.f38388a.add(new C10221q(c10210f));
            }
        }

        public a() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
        /* renamed from: b */
        public void mo33896b(C10163f c10163f, C10210f c10210f) {
            C9801m.m32346f(c10210f, "value");
            mo33902h(c10163f, new C10221q(c10210f));
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
        /* renamed from: c */
        public void mo33897c(C10163f c10163f, Object obj) {
            mo33902h(c10163f, C10085c.this.m33891K(c10163f, obj));
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
        /* renamed from: d */
        public void mo33898d(C10163f c10163f, C10159b c10159b, C10163f c10163f2) {
            C9801m.m32346f(c10159b, "enumClassId");
            C9801m.m32346f(c10163f2, "enumEntryName");
            mo33902h(c10163f, new C10214j(c10159b, c10163f2));
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
        /* renamed from: e */
        public InterfaceC10101q.a mo33899e(C10163f c10163f, C10159b c10159b) {
            C9801m.m32346f(c10159b, "classId");
            ArrayList arrayList = new ArrayList();
            C10085c c10085c = C10085c.this;
            InterfaceC10741z0 interfaceC10741z0 = InterfaceC10741z0.f41247a;
            C9801m.m32345e(interfaceC10741z0, "NO_SOURCE");
            InterfaceC10101q.a aVarMo33885x = c10085c.mo33885x(c10159b, interfaceC10741z0, arrayList);
            C9801m.m32343c(aVarMo33885x);
            return new C11547a(aVarMo33885x, this, c10163f, arrayList);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
        /* renamed from: f */
        public InterfaceC10101q.b mo33900f(C10163f c10163f) {
            return new b(C10085c.this, c10163f, this);
        }

        /* renamed from: g */
        public abstract void mo33901g(C10163f c10163f, ArrayList<AbstractC10211g<?>> arrayList);

        /* renamed from: h */
        public abstract void mo33902h(C10163f c10163f, AbstractC10211g<?> abstractC10211g);
    }

    /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.c$b */
    public static final class b extends a {

        /* renamed from: b */
        private final HashMap<C10163f, AbstractC10211g<?>> f38396b;

        /* renamed from: d */
        final /* synthetic */ InterfaceC10585e f38398d;

        /* renamed from: e */
        final /* synthetic */ C10159b f38399e;

        /* renamed from: f */
        final /* synthetic */ List<InterfaceC10616c> f38400f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC10741z0 f38401g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC10585e interfaceC10585e, C10159b c10159b, List<InterfaceC10616c> list, InterfaceC10741z0 interfaceC10741z0) {
            super();
            this.f38398d = interfaceC10585e;
            this.f38399e = c10159b;
            this.f38400f = list;
            this.f38401g = interfaceC10741z0;
            this.f38396b = new HashMap<>();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
        /* renamed from: a */
        public void mo33903a() {
            if (C10085c.this.m33839E(this.f38399e, this.f38396b) || C10085c.this.m33884w(this.f38399e)) {
                return;
            }
            this.f38400f.add(new C10617d(this.f38398d.mo36400s(), this.f38396b, this.f38401g));
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10085c.a
        /* renamed from: g */
        public void mo33901g(C10163f c10163f, ArrayList<AbstractC10211g<?>> arrayList) {
            C9801m.m32346f(arrayList, "elements");
            if (c10163f == null) {
                return;
            }
            InterfaceC10599i1 interfaceC10599i1M33149b = C9963a.m33149b(c10163f, this.f38398d);
            if (interfaceC10599i1M33149b != null) {
                HashMap<C10163f, AbstractC10211g<?>> map = this.f38396b;
                C10212h c10212h = C10212h.f39560a;
                List<? extends AbstractC10211g<?>> listM38510c = C10767a.m38510c(arrayList);
                AbstractC10344e0 type = interfaceC10599i1M33149b.getType();
                C9801m.m32345e(type, "parameter.type");
                map.put(c10163f, c10212h.m36025b(listM38510c, type));
                return;
            }
            if (C10085c.this.m33884w(this.f38399e) && C9801m.m32341a(c10163f.m35455k(), "value")) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof C10204a) {
                        arrayList2.add(obj);
                    }
                }
                List<InterfaceC10616c> list = this.f38400f;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    list.add(((C10204a) it.next()).mo36023b());
                }
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10085c.a
        /* renamed from: h */
        public void mo33902h(C10163f c10163f, AbstractC10211g<?> abstractC10211g) {
            C9801m.m32346f(abstractC10211g, "value");
            if (c10163f != null) {
                this.f38396b.put(c10163f, abstractC10211g);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10085c(InterfaceC10592g0 interfaceC10592g0, C10601j0 c10601j0, InterfaceC10330n interfaceC10330n, InterfaceC10099o interfaceC10099o) {
        super(interfaceC10330n, interfaceC10099o);
        C9801m.m32346f(interfaceC10592g0, "module");
        C9801m.m32346f(c10601j0, "notFoundClasses");
        C9801m.m32346f(interfaceC10330n, "storageManager");
        C9801m.m32346f(interfaceC10099o, "kotlinClassFinder");
        this.f38379c = interfaceC10592g0;
        this.f38380d = c10601j0;
        this.f38381e = new C10276e(interfaceC10592g0, c10601j0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public final AbstractC10211g<?> m33891K(C10163f c10163f, Object obj) {
        AbstractC10211g<?> abstractC10211gM36026c = C10212h.f39560a.m36026c(obj);
        if (abstractC10211gM36026c != null) {
            return abstractC10211gM36026c;
        }
        return AbstractC10215k.f39565b.m36032a("Unsupported annotation argument: " + c10163f);
    }

    /* renamed from: N */
    private final InterfaceC10585e m33892N(C10159b c10159b) {
        return C10736x.m38151c(this.f38379c, c10159b, this.f38380d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.AbstractC10081a
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public AbstractC10211g<?> mo33840G(String str, Object obj) {
        C9801m.m32346f(str, "desc");
        C9801m.m32346f(obj, "initializer");
        if (C10547v.m37538J("ZBCS", str, false, 2, null)) {
            int iIntValue = ((Integer) obj).intValue();
            int iHashCode = str.hashCode();
            if (iHashCode == 66) {
                if (str.equals("B")) {
                    obj = Byte.valueOf((byte) iIntValue);
                }
                throw new AssertionError(str);
            }
            if (iHashCode == 67) {
                if (str.equals("C")) {
                    obj = Character.valueOf((char) iIntValue);
                }
                throw new AssertionError(str);
            }
            if (iHashCode == 83) {
                if (str.equals("S")) {
                    obj = Short.valueOf((short) iIntValue);
                }
                throw new AssertionError(str);
            }
            if (iHashCode == 90 && str.equals("Z")) {
                obj = Boolean.valueOf(iIntValue != 0);
            }
            throw new AssertionError(str);
        }
        return C10212h.f39560a.m36026c(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.AbstractC10083b
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public InterfaceC10616c mo33869A(C10123b c10123b, InterfaceC10151c interfaceC10151c) {
        C9801m.m32346f(c10123b, "proto");
        C9801m.m32346f(interfaceC10151c, "nameResolver");
        return this.f38381e.m36242a(c10123b, interfaceC10151c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.AbstractC10081a
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public AbstractC10211g<?> mo33841I(AbstractC10211g<?> abstractC10211g) {
        AbstractC10211g<?> c10229y;
        C9801m.m32346f(abstractC10211g, "constant");
        if (abstractC10211g instanceof C10208d) {
            c10229y = new C10227w(((C10208d) abstractC10211g).mo36023b().byteValue());
        } else if (abstractC10211g instanceof C10225u) {
            c10229y = new C10230z(((C10225u) abstractC10211g).mo36023b().shortValue());
        } else if (abstractC10211g instanceof C10217m) {
            c10229y = new C10228x(((C10217m) abstractC10211g).mo36023b().intValue());
        } else {
            if (!(abstractC10211g instanceof C10222r)) {
                return abstractC10211g;
            }
            c10229y = new C10229y(((C10222r) abstractC10211g).mo36023b().longValue());
        }
        return c10229y;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.AbstractC10083b
    /* renamed from: x */
    protected InterfaceC10101q.a mo33885x(C10159b c10159b, InterfaceC10741z0 interfaceC10741z0, List<InterfaceC10616c> list) {
        C9801m.m32346f(c10159b, "annotationClassId");
        C9801m.m32346f(interfaceC10741z0, "source");
        C9801m.m32346f(list, "result");
        return new b(m33892N(c10159b), c10159b, list, interfaceC10741z0);
    }
}
