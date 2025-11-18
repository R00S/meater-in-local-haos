package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10803n;
import kotlin.collections.C10819v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.p371y.internal.p374j0.p375b.p377q.C9929c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.AbstractC9944a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C10078x;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.EnumC9946b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10161d;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10440g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10442i;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10446m;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10447n;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10448o;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10449p;

/* compiled from: AbstractSignatureParts.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.o0.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10051a<TAnnotation> {

    /* compiled from: AbstractSignatureParts.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.o0.a$a */
    private static final class a {

        /* renamed from: a */
        private final InterfaceC10442i f38200a;

        /* renamed from: b */
        private final C10078x f38201b;

        /* renamed from: c */
        private final InterfaceC10448o f38202c;

        public a(InterfaceC10442i interfaceC10442i, C10078x c10078x, InterfaceC10448o interfaceC10448o) {
            this.f38200a = interfaceC10442i;
            this.f38201b = c10078x;
            this.f38202c = interfaceC10448o;
        }

        /* renamed from: a */
        public final C10078x m33663a() {
            return this.f38201b;
        }

        /* renamed from: b */
        public final InterfaceC10442i m33664b() {
            return this.f38200a;
        }

        /* renamed from: c */
        public final InterfaceC10448o m33665c() {
            return this.f38202c;
        }
    }

    /* compiled from: AbstractSignatureParts.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.o0.a$b */
    static final class b extends Lambda implements Function1<Integer, C10055e> {

        /* renamed from: f */
        final /* synthetic */ C10067q f38203f;

        /* renamed from: g */
        final /* synthetic */ C10055e[] f38204g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C10067q c10067q, C10055e[] c10055eArr) {
            super(1);
            this.f38203f = c10067q;
            this.f38204g = c10055eArr;
        }

        /* renamed from: b */
        public final C10055e m33666b(int i2) {
            Map<Integer, C10055e> mapM33767a;
            C10055e c10055e;
            C10067q c10067q = this.f38203f;
            if (c10067q != null && (mapM33767a = c10067q.m33767a()) != null && (c10055e = mapM33767a.get(Integer.valueOf(i2))) != null) {
                return c10055e;
            }
            C10055e[] c10055eArr = this.f38204g;
            return (i2 < 0 || i2 > C10803n.m38721A(c10055eArr)) ? C10055e.f38216a.m33686a() : c10055eArr[i2];
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C10055e invoke(Integer num) {
            return m33666b(num.intValue());
        }
    }

    /* compiled from: AbstractSignatureParts.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.o0.a$c */
    static final class c extends Lambda implements Function1<TAnnotation, Boolean> {

        /* renamed from: f */
        final /* synthetic */ AbstractC10051a<TAnnotation> f38205f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AbstractC10051a<TAnnotation> abstractC10051a) {
            super(1);
            this.f38205f = abstractC10051a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(TAnnotation tannotation) {
            C9801m.m32346f(tannotation, "$this$extractNullability");
            return Boolean.valueOf(this.f38205f.mo33655r(tannotation));
        }
    }

    /* compiled from: AbstractSignatureParts.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.o0.a$d */
    static final class d extends Lambda implements Function1<a, Iterable<? extends a>> {

        /* renamed from: f */
        final /* synthetic */ AbstractC10051a<TAnnotation> f38206f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC10449p f38207g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(AbstractC10051a<TAnnotation> abstractC10051a, InterfaceC10449p interfaceC10449p) {
            super(1);
            this.f38206f = abstractC10051a;
            this.f38207g = interfaceC10449p;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Iterable<a> invoke(a aVar) {
            InterfaceC10447n interfaceC10447nMo35977w;
            List<InterfaceC10448o> listMo35942e0;
            a aVar2;
            InterfaceC10440g interfaceC10440gMo35919M;
            C9801m.m32346f(aVar, "it");
            if (this.f38206f.mo33657u()) {
                InterfaceC10442i interfaceC10442iM33664b = aVar.m33664b();
                if (((interfaceC10442iM33664b == null || (interfaceC10440gMo35919M = this.f38207g.mo35919M(interfaceC10442iM33664b)) == null) ? null : this.f38207g.mo35981y(interfaceC10440gMo35919M)) != null) {
                    return null;
                }
            }
            InterfaceC10442i interfaceC10442iM33664b2 = aVar.m33664b();
            if (interfaceC10442iM33664b2 == null || (interfaceC10447nMo35977w = this.f38207g.mo35977w(interfaceC10442iM33664b2)) == null || (listMo35942e0 = this.f38207g.mo35942e0(interfaceC10447nMo35977w)) == null) {
                return null;
            }
            List<InterfaceC10446m> listMo35930X = this.f38207g.mo35930X(aVar.m33664b());
            InterfaceC10449p interfaceC10449p = this.f38207g;
            AbstractC10051a<TAnnotation> abstractC10051a = this.f38206f;
            Iterator<T> it = listMo35942e0.iterator();
            Iterator<T> it2 = listMo35930X.iterator();
            ArrayList arrayList = new ArrayList(Math.min(C10819v.m38911u(listMo35942e0, 10), C10819v.m38911u(listMo35930X, 10)));
            while (it.hasNext() && it2.hasNext()) {
                Object next = it.next();
                InterfaceC10446m interfaceC10446m = (InterfaceC10446m) it2.next();
                InterfaceC10448o interfaceC10448o = (InterfaceC10448o) next;
                if (interfaceC10449p.mo35918L(interfaceC10446m)) {
                    aVar2 = new a(null, aVar.m33663a(), interfaceC10448o);
                } else {
                    InterfaceC10442i interfaceC10442iMo35980x0 = interfaceC10449p.mo35980x0(interfaceC10446m);
                    aVar2 = new a(interfaceC10442iMo35980x0, abstractC10051a.m33637c(interfaceC10442iMo35980x0, aVar.m33663a()), interfaceC10448o);
                }
                arrayList.add(aVar2);
            }
            return arrayList;
        }
    }

    /* renamed from: B */
    private final C10059i m33634B(C10059i c10059i, C10059i c10059i2) {
        return c10059i == null ? c10059i2 : c10059i2 == null ? c10059i : (!c10059i.m33702d() || c10059i2.m33702d()) ? (c10059i.m33702d() || !c10059i2.m33702d()) ? (c10059i.m33701c().compareTo(c10059i2.m33701c()) >= 0 && c10059i.m33701c().compareTo(c10059i2.m33701c()) > 0) ? c10059i : c10059i2 : c10059i : c10059i2;
    }

    /* renamed from: C */
    private final List<a> m33635C(InterfaceC10442i interfaceC10442i) {
        return m33640f(new a(interfaceC10442i, m33637c(interfaceC10442i, mo33650m()), null), new d(this, mo33658v()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final C10078x m33637c(InterfaceC10442i interfaceC10442i, C10078x c10078x) {
        return mo33646h().m33035c(c10078x, mo33647i(interfaceC10442i));
    }

    /* renamed from: d */
    private final C10055e m33638d(InterfaceC10442i interfaceC10442i) {
        EnumC10058h enumC10058hM33643t;
        EnumC10058h enumC10058hM33643t2 = m33643t(interfaceC10442i);
        EnumC10056f enumC10056f = null;
        if (enumC10058hM33643t2 == null) {
            InterfaceC10442i interfaceC10442iMo33653p = mo33653p(interfaceC10442i);
            enumC10058hM33643t = interfaceC10442iMo33653p != null ? m33643t(interfaceC10442iMo33653p) : null;
        } else {
            enumC10058hM33643t = enumC10058hM33643t2;
        }
        InterfaceC10449p interfaceC10449pMo33658v = mo33658v();
        C9929c c9929c = C9929c.f37667a;
        if (c9929c.m32927l(mo33656s(interfaceC10449pMo33658v.mo35948h0(interfaceC10442i)))) {
            enumC10056f = EnumC10056f.READ_ONLY;
        } else if (c9929c.m32926k(mo33656s(interfaceC10449pMo33658v.mo35926T(interfaceC10442i)))) {
            enumC10056f = EnumC10056f.MUTABLE;
        }
        return new C10055e(enumC10058hM33643t, enumC10056f, mo33658v().mo35905C(interfaceC10442i) || mo33644A(interfaceC10442i), enumC10058hM33643t != enumC10058hM33643t2);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012f  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10055e m33639e(kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10051a.a r12) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10051a.m33639e(kotlin.f0.y.e.j0.d.a.o0.a$a):kotlin.f0.y.e.j0.d.a.o0.e");
    }

    /* renamed from: f */
    private final <T> List<T> m33640f(T t, Function1<? super T, ? extends Iterable<? extends T>> function1) {
        ArrayList arrayList = new ArrayList(1);
        m33641g(t, arrayList, function1);
        return arrayList;
    }

    /* renamed from: g */
    private final <T> void m33641g(T t, List<T> list, Function1<? super T, ? extends Iterable<? extends T>> function1) {
        list.add(t);
        Iterable<? extends T> iterableInvoke = function1.invoke(t);
        if (iterableInvoke != null) {
            Iterator<? extends T> it = iterableInvoke.iterator();
            while (it.hasNext()) {
                m33641g(it.next(), list, function1);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10059i m33642j(kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10448o r8) {
        /*
            r7 = this;
            kotlin.f0.y.e.j0.l.w1.p r0 = r7.mo33658v()
            boolean r1 = r7.mo33662z(r8)
            r2 = 0
            if (r1 != 0) goto Lc
            return r2
        Lc:
            java.util.List r8 = r0.mo35904B0(r8)
            boolean r1 = r8 instanceof java.util.Collection
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1e
            boolean r5 = r8.isEmpty()
            if (r5 == 0) goto L1e
        L1c:
            r5 = 1
            goto L35
        L1e:
            java.util.Iterator r5 = r8.iterator()
        L22:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L1c
            java.lang.Object r6 = r5.next()
            kotlin.f0.y.e.j0.l.w1.i r6 = (kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10442i) r6
            boolean r6 = r0.mo35931Y(r6)
            if (r6 != 0) goto L22
            r5 = 0
        L35:
            if (r5 == 0) goto L38
            return r2
        L38:
            if (r1 == 0) goto L42
            boolean r5 = r8.isEmpty()
            if (r5 == 0) goto L42
        L40:
            r5 = 0
            goto L5e
        L42:
            java.util.Iterator r5 = r8.iterator()
        L46:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L40
            java.lang.Object r6 = r5.next()
            kotlin.f0.y.e.j0.l.w1.i r6 = (kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10442i) r6
            kotlin.f0.y.e.j0.d.a.o0.h r6 = r7.m33643t(r6)
            if (r6 == 0) goto L5a
            r6 = 1
            goto L5b
        L5a:
            r6 = 0
        L5b:
            if (r6 == 0) goto L46
            r5 = 1
        L5e:
            if (r5 == 0) goto L62
            r1 = r8
            goto La9
        L62:
            if (r1 == 0) goto L6c
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L6c
        L6a:
            r1 = 0
            goto L88
        L6c:
            java.util.Iterator r1 = r8.iterator()
        L70:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L6a
            java.lang.Object r5 = r1.next()
            kotlin.f0.y.e.j0.l.w1.i r5 = (kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10442i) r5
            kotlin.f0.y.e.j0.l.w1.i r5 = r7.mo33653p(r5)
            if (r5 == 0) goto L84
            r5 = 1
            goto L85
        L84:
            r5 = 0
        L85:
            if (r5 == 0) goto L70
            r1 = 1
        L88:
            if (r1 == 0) goto Ldb
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r8.iterator()
        L93:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto La9
            java.lang.Object r5 = r2.next()
            kotlin.f0.y.e.j0.l.w1.i r5 = (kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10442i) r5
            kotlin.f0.y.e.j0.l.w1.i r5 = r7.mo33653p(r5)
            if (r5 == 0) goto L93
            r1.add(r5)
            goto L93
        La9:
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto Lb5
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto Lb5
        Lb3:
            r0 = 1
            goto Lcc
        Lb5:
            java.util.Iterator r2 = r1.iterator()
        Lb9:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto Lb3
            java.lang.Object r5 = r2.next()
            kotlin.f0.y.e.j0.l.w1.i r5 = (kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10442i) r5
            boolean r5 = r0.mo35964p0(r5)
            if (r5 != 0) goto Lb9
            r0 = 0
        Lcc:
            if (r0 == 0) goto Ld1
            kotlin.f0.y.e.j0.d.a.o0.h r0 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10058h.NULLABLE
            goto Ld3
        Ld1:
            kotlin.f0.y.e.j0.d.a.o0.h r0 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10058h.NOT_NULL
        Ld3:
            kotlin.f0.y.e.j0.d.a.o0.i r2 = new kotlin.f0.y.e.j0.d.a.o0.i
            if (r1 == r8) goto Ld8
            r3 = 1
        Ld8:
            r2.<init>(r0, r3)
        Ldb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10051a.m33642j(kotlin.f0.y.e.j0.l.w1.o):kotlin.f0.y.e.j0.d.a.o0.i");
    }

    /* renamed from: t */
    private final EnumC10058h m33643t(InterfaceC10442i interfaceC10442i) {
        InterfaceC10449p interfaceC10449pMo33658v = mo33658v();
        if (interfaceC10449pMo33658v.mo35929W(interfaceC10449pMo33658v.mo35948h0(interfaceC10442i))) {
            return EnumC10058h.NULLABLE;
        }
        if (interfaceC10449pMo33658v.mo35929W(interfaceC10449pMo33658v.mo35926T(interfaceC10442i))) {
            return null;
        }
        return EnumC10058h.NOT_NULL;
    }

    /* renamed from: A */
    public abstract boolean mo33644A(InterfaceC10442i interfaceC10442i);

    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10055e> m33645b(kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10442i r10, java.lang.Iterable<? extends kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10442i> r11, kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10067q r12, boolean r13) {
        /*
            r9 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C9801m.m32346f(r10, r0)
            java.lang.String r0 = "overrides"
            kotlin.jvm.internal.C9801m.m32346f(r11, r0)
            java.util.List r0 = r9.m33635C(r10)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.C10813s.m38869u(r11, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r11.iterator()
        L1d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r2.next()
            kotlin.f0.y.e.j0.l.w1.i r3 = (kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10442i) r3
            java.util.List r3 = r9.m33635C(r3)
            r1.add(r3)
            goto L1d
        L31:
            boolean r2 = r9.m33654q()
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L6b
            boolean r2 = r9.mo33660x()
            if (r2 == 0) goto L69
            boolean r2 = r11 instanceof java.util.Collection
            if (r2 == 0) goto L4e
            r2 = r11
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L4e
        L4c:
            r10 = 0
            goto L66
        L4e:
            java.util.Iterator r11 = r11.iterator()
        L52:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r11.next()
            kotlin.f0.y.e.j0.l.w1.i r2 = (kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10442i) r2
            boolean r2 = r9.mo33661y(r10, r2)
            r2 = r2 ^ r4
            if (r2 == 0) goto L52
            r10 = 1
        L66:
            if (r10 == 0) goto L69
            goto L6b
        L69:
            r10 = 0
            goto L6c
        L6b:
            r10 = 1
        L6c:
            if (r10 == 0) goto L70
            r10 = 1
            goto L74
        L70:
            int r10 = r0.size()
        L74:
            kotlin.f0.y.e.j0.d.a.o0.e[] r11 = new kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10055e[r10]
            r2 = 0
        L77:
            if (r2 >= r10) goto Ld1
            java.lang.Object r5 = r0.get(r2)
            kotlin.f0.y.e.j0.d.a.o0.a$a r5 = (kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10051a.a) r5
            kotlin.f0.y.e.j0.d.a.o0.e r5 = r9.m33639e(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r1.iterator()
        L8c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb2
            java.lang.Object r8 = r7.next()
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = kotlin.collections.C10813s.m38833X(r8, r2)
            kotlin.f0.y.e.j0.d.a.o0.a$a r8 = (kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10051a.a) r8
            if (r8 == 0) goto Lab
            kotlin.f0.y.e.j0.l.w1.i r8 = r8.m33664b()
            if (r8 == 0) goto Lab
            kotlin.f0.y.e.j0.d.a.o0.e r8 = r9.m33638d(r8)
            goto Lac
        Lab:
            r8 = 0
        Lac:
            if (r8 == 0) goto L8c
            r6.add(r8)
            goto L8c
        Lb2:
            if (r2 != 0) goto Lbc
            boolean r7 = r9.mo33660x()
            if (r7 == 0) goto Lbc
            r7 = 1
            goto Lbd
        Lbc:
            r7 = 0
        Lbd:
            if (r2 != 0) goto Lc7
            boolean r8 = r9.mo33651n()
            if (r8 == 0) goto Lc7
            r8 = 1
            goto Lc8
        Lc7:
            r8 = 0
        Lc8:
            kotlin.f0.y.e.j0.d.a.o0.e r5 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10069s.m33777a(r5, r6, r7, r8, r13)
            r11[r2] = r5
            int r2 = r2 + 1
            goto L77
        Ld1:
            kotlin.f0.y.e.j0.d.a.o0.a$b r10 = new kotlin.f0.y.e.j0.d.a.o0.a$b
            r10.<init>(r12, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10051a.m33645b(kotlin.f0.y.e.j0.l.w1.i, java.lang.Iterable, kotlin.f0.y.e.j0.d.a.o0.q, boolean):kotlin.a0.c.l");
    }

    /* renamed from: h */
    public abstract AbstractC9944a<TAnnotation> mo33646h();

    /* renamed from: i */
    public abstract Iterable<TAnnotation> mo33647i(InterfaceC10442i interfaceC10442i);

    /* renamed from: k */
    public abstract Iterable<TAnnotation> mo33648k();

    /* renamed from: l */
    public abstract EnumC9946b mo33649l();

    /* renamed from: m */
    public abstract C10078x mo33650m();

    /* renamed from: n */
    public abstract boolean mo33651n();

    /* renamed from: o */
    public abstract boolean mo33652o();

    /* renamed from: p */
    public abstract InterfaceC10442i mo33653p(InterfaceC10442i interfaceC10442i);

    /* renamed from: q */
    public boolean m33654q() {
        return false;
    }

    /* renamed from: r */
    public abstract boolean mo33655r(TAnnotation tannotation);

    /* renamed from: s */
    public abstract C10161d mo33656s(InterfaceC10442i interfaceC10442i);

    /* renamed from: u */
    public abstract boolean mo33657u();

    /* renamed from: v */
    public abstract InterfaceC10449p mo33658v();

    /* renamed from: w */
    public abstract boolean mo33659w(InterfaceC10442i interfaceC10442i);

    /* renamed from: x */
    public abstract boolean mo33660x();

    /* renamed from: y */
    public abstract boolean mo33661y(InterfaceC10442i interfaceC10442i, InterfaceC10442i interfaceC10442i2);

    /* renamed from: z */
    public abstract boolean mo33662z(InterfaceC10448o interfaceC10448o);
}
