package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10584d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10735w0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10187d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10249f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10256m;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10325i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10347f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10366l1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10372n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;

/* compiled from: AbstractClassDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.a */
/* loaded from: classes2.dex */
public abstract class AbstractC10637a extends AbstractC10670t {

    /* renamed from: g */
    private final C10163f f40894g;

    /* renamed from: h */
    protected final InterfaceC10325i<AbstractC10368m0> f40895h;

    /* renamed from: i */
    private final InterfaceC10325i<InterfaceC10251h> f40896i;

    /* renamed from: j */
    private final InterfaceC10325i<InterfaceC10735w0> f40897j;

    /* compiled from: AbstractClassDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.a$a */
    class a implements Function0<AbstractC10368m0> {

        /* compiled from: AbstractClassDescriptor.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.a$a$a, reason: collision with other inner class name */
        class C11579a implements Function1<AbstractC10396g, AbstractC10368m0> {
            C11579a() {
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public AbstractC10368m0 invoke(AbstractC10396g abstractC10396g) {
                InterfaceC10594h interfaceC10594hMo36928f = abstractC10396g.mo36928f(AbstractC10637a.this);
                return interfaceC10594hMo36928f == null ? AbstractC10637a.this.f40895h.invoke() : interfaceC10594hMo36928f instanceof InterfaceC10584d1 ? C10347f0.m36662b((InterfaceC10584d1) interfaceC10594hMo36928f, C10372n1.m36774g(interfaceC10594hMo36928f.mo32877h().getParameters())) : interfaceC10594hMo36928f instanceof AbstractC10670t ? C10372n1.m36788u(interfaceC10594hMo36928f.mo32877h().mo35999b(abstractC10396g), ((AbstractC10670t) interfaceC10594hMo36928f).mo32860H(abstractC10396g), this) : interfaceC10594hMo36928f.mo36400s();
            }
        }

        a() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC10368m0 invoke() {
            AbstractC10637a abstractC10637a = AbstractC10637a.this;
            return C10372n1.m36787t(abstractC10637a, abstractC10637a.mo33340D0(), new C11579a());
        }
    }

    /* compiled from: AbstractClassDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.a$b */
    class b implements Function0<InterfaceC10251h> {
        b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC10251h invoke() {
            return new C10249f(AbstractC10637a.this.mo33340D0());
        }
    }

    /* compiled from: AbstractClassDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.a$c */
    class c implements Function0<InterfaceC10735w0> {
        c() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC10735w0 invoke() {
            return new C10667q(AbstractC10637a.this);
        }
    }

    public AbstractC10637a(InterfaceC10330n interfaceC10330n, C10163f c10163f) {
        if (interfaceC10330n == null) {
            m37753K(0);
        }
        if (c10163f == null) {
            m37753K(1);
        }
        this.f40894g = c10163f;
        this.f40895h = interfaceC10330n.mo36516d(new a());
        this.f40896i = interfaceC10330n.mo36516d(new b());
        this.f40897j = interfaceC10330n.mo36516d(new c());
    }

    /* renamed from: K */
    private static /* synthetic */ void m37753K(int i2) {
        String str = (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 9 || i2 == 12 || i2 == 14 || i2 == 16 || i2 == 17 || i2 == 19 || i2 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 9 || i2 == 12 || i2 == 14 || i2 == 16 || i2 == 17 || i2 == 19 || i2 == 20) ? 2 : 3];
        switch (i2) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i2 == 2) {
            objArr[1] = "getName";
        } else if (i2 == 3) {
            objArr[1] = "getOriginal";
        } else if (i2 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i2 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i2 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i2 == 9 || i2 == 12 || i2 == 14 || i2 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i2 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i2 == 19) {
            objArr[1] = "substitute";
        } else if (i2 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5 && i2 != 6 && i2 != 9 && i2 != 12 && i2 != 14 && i2 != 16 && i2 != 17 && i2 != 19 && i2 != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10578b1
    /* renamed from: A0, reason: merged with bridge method [inline-methods] */
    public InterfaceC10585e mo36396c(C10366l1 c10366l1) {
        if (c10366l1 == null) {
            m37753K(18);
        }
        return c10366l1.m36756k() ? this : new C10669s(this, c10366l1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: D0 */
    public InterfaceC10251h mo33340D0() {
        InterfaceC10251h interfaceC10251hMo32860H = mo32860H(C10235a.m36077k(C10187d.m35819g(this)));
        if (interfaceC10251hMo32860H == null) {
            m37753K(17);
        }
        return interfaceC10251hMo32860H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: F0 */
    public List<InterfaceC10735w0> mo36281F0() {
        List<InterfaceC10735w0> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            m37753K(6);
        }
        return listEmptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: K0 */
    public InterfaceC10735w0 mo37677K0() {
        InterfaceC10735w0 interfaceC10735w0Invoke = this.f40897j.invoke();
        if (interfaceC10735w0Invoke == null) {
            m37753K(5);
        }
        return interfaceC10735w0Invoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10628o<R, D> interfaceC10628o, D d2) {
        return interfaceC10628o.mo35674a(this, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: a */
    public InterfaceC10585e mo37019a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: a0 */
    public InterfaceC10251h mo37678a0(AbstractC10360j1 abstractC10360j1) {
        if (abstractC10360j1 == null) {
            m37753K(15);
        }
        InterfaceC10251h interfaceC10251hMo36986v = mo36986v(abstractC10360j1, C10235a.m36077k(C10187d.m35819g(this)));
        if (interfaceC10251hMo36986v == null) {
            m37753K(16);
        }
        return interfaceC10251hMo36986v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10598i0
    public C10163f getName() {
        C10163f c10163f = this.f40894g;
        if (c10163f == null) {
            m37753K(2);
        }
        return c10163f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h
    /* renamed from: s */
    public AbstractC10368m0 mo36400s() {
        AbstractC10368m0 abstractC10368m0Invoke = this.f40895h.invoke();
        if (abstractC10368m0Invoke == null) {
            m37753K(20);
        }
        return abstractC10368m0Invoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10670t
    /* renamed from: v */
    public InterfaceC10251h mo36986v(AbstractC10360j1 abstractC10360j1, AbstractC10396g abstractC10396g) {
        if (abstractC10360j1 == null) {
            m37753K(10);
        }
        if (abstractC10396g == null) {
            m37753K(11);
        }
        if (!abstractC10360j1.mo33537f()) {
            return new C10256m(mo32860H(abstractC10396g), C10366l1.m36747g(abstractC10360j1));
        }
        InterfaceC10251h interfaceC10251hMo32860H = mo32860H(abstractC10396g);
        if (interfaceC10251hMo32860H == null) {
            m37753K(12);
        }
        return interfaceC10251hMo32860H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: y0 */
    public InterfaceC10251h mo33348y0() {
        InterfaceC10251h interfaceC10251hInvoke = this.f40896i.invoke();
        if (interfaceC10251hInvoke == null) {
            m37753K(4);
        }
        return interfaceC10251hInvoke;
    }
}
