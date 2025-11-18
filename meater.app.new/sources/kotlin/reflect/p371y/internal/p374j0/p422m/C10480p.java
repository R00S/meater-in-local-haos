package kotlin.reflect.p371y.internal.p374j0.p422m;

import java.util.List;
import kotlin.collections.C10817u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C10736x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10584d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10735w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.C10262e;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.InterfaceC10263f;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10457a;
import kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10475k;
import kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10482r;
import kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10484t;

/* compiled from: modifierChecks.kt */
/* renamed from: kotlin.f0.y.e.j0.m.p */
/* loaded from: classes3.dex */
public final class C10480p extends AbstractC10466b {

    /* renamed from: a */
    public static final C10480p f40431a = new C10480p();

    /* renamed from: b */
    private static final List<C10472h> f40432b;

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.p$a */
    static final class a extends Lambda implements Function1<InterfaceC10738y, String> {

        /* renamed from: f */
        public static final a f40433f = new a();

        a() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y r4) {
            /*
                r3 = this;
                java.lang.String r0 = "$this$$receiver"
                kotlin.jvm.internal.C9801m.m32346f(r4, r0)
                java.util.List r4 = r4.mo37028f()
                java.lang.String r0 = "valueParameters"
                kotlin.jvm.internal.C9801m.m32345e(r4, r0)
                java.lang.Object r4 = kotlin.collections.C10813s.m38847i0(r4)
                kotlin.reflect.jvm.internal.impl.descriptors.i1 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1) r4
                r0 = 1
                r1 = 0
                if (r4 == 0) goto L2a
                boolean r2 = kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a.m36067a(r4)
                if (r2 != 0) goto L26
                kotlin.f0.y.e.j0.l.e0 r4 = r4.mo37697l0()
                if (r4 != 0) goto L26
                r4 = 1
                goto L27
            L26:
                r4 = 0
            L27:
                if (r4 != r0) goto L2a
                goto L2b
            L2a:
                r0 = 0
            L2b:
                kotlin.f0.y.e.j0.m.p r4 = kotlin.reflect.p371y.internal.p374j0.p422m.C10480p.f40431a
                if (r0 != 0) goto L32
                java.lang.String r4 = "last parameter should not have a default value or be a vararg"
                goto L33
            L32:
                r4 = 0
            L33:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p422m.C10480p.a.invoke(kotlin.reflect.jvm.internal.impl.descriptors.y):java.lang.String");
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.p$b */
    static final class b extends Lambda implements Function1<InterfaceC10738y, String> {

        /* renamed from: f */
        public static final b f40434f = new b();

        b() {
            super(1);
        }

        /* renamed from: c */
        private static final boolean m37213c(InterfaceC10609m interfaceC10609m) {
            return (interfaceC10609m instanceof InterfaceC10585e) && AbstractC9914h.m32734a0((InterfaceC10585e) interfaceC10609m);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y r5) {
            /*
                r4 = this;
                java.lang.String r0 = "$this$$receiver"
                kotlin.jvm.internal.C9801m.m32346f(r5, r0)
                kotlin.f0.y.e.j0.m.p r0 = kotlin.reflect.p371y.internal.p374j0.p422m.C10480p.f40431a
                kotlin.reflect.jvm.internal.impl.descriptors.m r0 = r5.mo32876b()
                java.lang.String r1 = "containingDeclaration"
                kotlin.jvm.internal.C9801m.m32345e(r0, r1)
                boolean r0 = m37213c(r0)
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L4d
                java.util.Collection r5 = r5.mo37027e()
                java.lang.String r0 = "overriddenDescriptors"
                kotlin.jvm.internal.C9801m.m32345e(r5, r0)
                boolean r0 = r5.isEmpty()
                if (r0 == 0) goto L29
            L27:
                r5 = 0
                goto L49
            L29:
                java.util.Iterator r5 = r5.iterator()
            L2d:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L27
                java.lang.Object r0 = r5.next()
                kotlin.reflect.jvm.internal.impl.descriptors.y r0 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y) r0
                kotlin.reflect.jvm.internal.impl.descriptors.m r0 = r0.mo32876b()
                java.lang.String r3 = "it.containingDeclaration"
                kotlin.jvm.internal.C9801m.m32345e(r0, r3)
                boolean r0 = m37213c(r0)
                if (r0 == 0) goto L2d
                r5 = 1
            L49:
                if (r5 == 0) goto L4c
                goto L4d
            L4c:
                r1 = 0
            L4d:
                if (r1 != 0) goto L52
                java.lang.String r5 = "must override ''equals()'' in Any"
                goto L53
            L52:
                r5 = 0
            L53:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p422m.C10480p.b.invoke(kotlin.reflect.jvm.internal.impl.descriptors.y):java.lang.String");
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.p$c */
    static final class c extends Lambda implements Function1<InterfaceC10738y, String> {

        /* renamed from: f */
        public static final c f40435f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(InterfaceC10738y interfaceC10738y) {
            boolean zM37149o;
            C9801m.m32346f(interfaceC10738y, "$this$$receiver");
            InterfaceC10735w0 interfaceC10735w0Mo37029f0 = interfaceC10738y.mo37029f0();
            if (interfaceC10735w0Mo37029f0 == null) {
                interfaceC10735w0Mo37029f0 = interfaceC10738y.mo37032m0();
            }
            C10480p c10480p = C10480p.f40431a;
            boolean z = false;
            if (interfaceC10735w0Mo37029f0 != null) {
                AbstractC10344e0 returnType = interfaceC10738y.getReturnType();
                if (returnType != null) {
                    AbstractC10344e0 type = interfaceC10735w0Mo37029f0.getType();
                    C9801m.m32345e(type, "receiver.type");
                    zM37149o = C10457a.m37149o(returnType, type);
                } else {
                    zM37149o = false;
                }
                if (zM37149o || c10480p.m37211d(interfaceC10738y, interfaceC10735w0Mo37029f0)) {
                    z = true;
                }
            }
            if (z) {
                return null;
            }
            return "receiver must be a supertype of the return type";
        }
    }

    static {
        C10163f c10163f = C10481q.f40466k;
        AbstractC10475k.b bVar = AbstractC10475k.b.f40423b;
        InterfaceC10470f[] interfaceC10470fArr = {bVar, new AbstractC10484t.a(1)};
        C10163f c10163f2 = C10481q.f40467l;
        InterfaceC10470f[] interfaceC10470fArr2 = {bVar, new AbstractC10484t.a(2)};
        C10163f c10163f3 = C10481q.f40457b;
        C10477m c10477m = C10477m.f40425a;
        C10474j c10474j = C10474j.f40419a;
        C10163f c10163f4 = C10481q.f40463h;
        AbstractC10484t.d dVar = AbstractC10484t.d.f40498b;
        AbstractC10482r.a aVar = AbstractC10482r.a.f40485d;
        C10163f c10163f5 = C10481q.f40465j;
        AbstractC10484t.c cVar = AbstractC10484t.c.f40497b;
        f40432b = C10817u.m38891m(new C10472h(c10163f, interfaceC10470fArr, (Function1) null, 4, (C9789g) null), new C10472h(c10163f2, interfaceC10470fArr2, a.f40433f), new C10472h(c10163f3, new InterfaceC10470f[]{bVar, c10477m, new AbstractC10484t.a(2), c10474j}, (Function1) null, 4, (C9789g) null), new C10472h(C10481q.f40458c, new InterfaceC10470f[]{bVar, c10477m, new AbstractC10484t.a(3), c10474j}, (Function1) null, 4, (C9789g) null), new C10472h(C10481q.f40459d, new InterfaceC10470f[]{bVar, c10477m, new AbstractC10484t.b(2), c10474j}, (Function1) null, 4, (C9789g) null), new C10472h(C10481q.f40464i, new InterfaceC10470f[]{bVar}, (Function1) null, 4, (C9789g) null), new C10472h(c10163f4, new InterfaceC10470f[]{bVar, dVar, c10477m, aVar}, (Function1) null, 4, (C9789g) null), new C10472h(c10163f5, new InterfaceC10470f[]{bVar, cVar}, (Function1) null, 4, (C9789g) null), new C10472h(C10481q.f40468m, new InterfaceC10470f[]{bVar, cVar}, (Function1) null, 4, (C9789g) null), new C10472h(C10481q.f40469n, new InterfaceC10470f[]{bVar, cVar, aVar}, (Function1) null, 4, (C9789g) null), new C10472h(C10481q.f40444I, new InterfaceC10470f[]{bVar, dVar, c10477m}, (Function1) null, 4, (C9789g) null), new C10472h(C10481q.f40460e, new InterfaceC10470f[]{AbstractC10475k.a.f40422b}, b.f40434f), new C10472h(C10481q.f40462g, new InterfaceC10470f[]{bVar, AbstractC10482r.b.f40487d, dVar, c10477m}, (Function1) null, 4, (C9789g) null), new C10472h(C10481q.f40453R, new InterfaceC10470f[]{bVar, dVar, c10477m}, (Function1) null, 4, (C9789g) null), new C10472h(C10481q.f40452Q, new InterfaceC10470f[]{bVar, cVar}, (Function1) null, 4, (C9789g) null), new C10472h(C10817u.m38891m(C10481q.f40479x, C10481q.f40480y), new InterfaceC10470f[]{bVar}, c.f40435f), new C10472h(C10481q.f40454S, new InterfaceC10470f[]{bVar, AbstractC10482r.c.f40489d, dVar, c10477m}, (Function1) null, 4, (C9789g) null), new C10472h(C10481q.f40471p, new InterfaceC10470f[]{bVar, cVar}, (Function1) null, 4, (C9789g) null));
    }

    private C10480p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final boolean m37211d(InterfaceC10738y interfaceC10738y, InterfaceC10735w0 interfaceC10735w0) {
        C10159b c10159bM36073g;
        AbstractC10344e0 returnType;
        InterfaceC10263f value = interfaceC10735w0.getValue();
        C9801m.m32345e(value, "receiver.value");
        if (!(value instanceof C10262e)) {
            return false;
        }
        InterfaceC10585e interfaceC10585eMo36183r = ((C10262e) value).mo36183r();
        if (!interfaceC10585eMo36183r.mo32863M() || (c10159bM36073g = C10235a.m36073g(interfaceC10585eMo36183r)) == null) {
            return false;
        }
        InterfaceC10594h interfaceC10594hM38150b = C10736x.m38150b(C10235a.m36078l(interfaceC10585eMo36183r), c10159bM36073g);
        if (!(interfaceC10594hM38150b instanceof InterfaceC10584d1)) {
            interfaceC10594hM38150b = null;
        }
        InterfaceC10584d1 interfaceC10584d1 = (InterfaceC10584d1) interfaceC10594hM38150b;
        if (interfaceC10584d1 == null || (returnType = interfaceC10738y.getReturnType()) == null) {
            return false;
        }
        return C10457a.m37149o(returnType, interfaceC10584d1.mo36395W());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10466b
    /* renamed from: b */
    public List<C10472h> mo37187b() {
        return f40432b;
    }
}
