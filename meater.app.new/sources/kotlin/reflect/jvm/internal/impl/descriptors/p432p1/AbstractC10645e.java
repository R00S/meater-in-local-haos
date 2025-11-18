package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10581c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10185b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10250g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10257n;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10325i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349g;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10333a1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10347f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10427k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10426j;

/* compiled from: AbstractTypeParameterDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.e */
/* loaded from: classes2.dex */
public abstract class AbstractC10645e extends AbstractC10657k implements InterfaceC10587e1 {

    /* renamed from: j */
    private final EnumC10384r1 f40955j;

    /* renamed from: k */
    private final boolean f40956k;

    /* renamed from: l */
    private final int f40957l;

    /* renamed from: m */
    private final InterfaceC10325i<InterfaceC10345e1> f40958m;

    /* renamed from: n */
    private final InterfaceC10325i<AbstractC10368m0> f40959n;

    /* renamed from: o */
    private final InterfaceC10330n f40960o;

    /* compiled from: AbstractTypeParameterDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.e$a */
    class a implements Function0<InterfaceC10345e1> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC10330n f40961f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC10581c1 f40962g;

        a(InterfaceC10330n interfaceC10330n, InterfaceC10581c1 interfaceC10581c1) {
            this.f40961f = interfaceC10330n;
            this.f40962g = interfaceC10581c1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC10345e1 invoke() {
            return new c(AbstractC10645e.this, this.f40961f, this.f40962g);
        }
    }

    /* compiled from: AbstractTypeParameterDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.e$b */
    class b implements Function0<AbstractC10368m0> {

        /* renamed from: f */
        final /* synthetic */ C10163f f40964f;

        /* compiled from: AbstractTypeParameterDescriptor.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.e$b$a */
        class a implements Function0<InterfaceC10251h> {
            a() {
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public InterfaceC10251h invoke() {
                return C10257n.m36174j("Scope for type parameter " + b.this.f40964f.m35455k(), AbstractC10645e.this.getUpperBounds());
            }
        }

        b(C10163f c10163f) {
            this.f40964f = c10163f;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC10368m0 invoke() {
            return C10347f0.m36670j(C10333a1.f40041g.m36577h(), AbstractC10645e.this.mo32877h(), Collections.emptyList(), false, new C10250g(new a()));
        }
    }

    /* compiled from: AbstractTypeParameterDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.e$c */
    private class c extends AbstractC10349g {

        /* renamed from: d */
        private final InterfaceC10581c1 f40967d;

        /* renamed from: e */
        final /* synthetic */ AbstractC10645e f40968e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC10645e abstractC10645e, InterfaceC10330n interfaceC10330n, InterfaceC10581c1 interfaceC10581c1) {
            super(interfaceC10330n);
            if (interfaceC10330n == null) {
                m37833v(0);
            }
            this.f40968e = abstractC10645e;
            this.f40967d = interfaceC10581c1;
        }

        /* renamed from: v */
        private static /* synthetic */ void m37833v(int i2) {
            String str = (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 8) ? 2 : 3];
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i2 == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i2 == 2) {
                objArr[1] = "getParameters";
            } else if (i2 == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i2 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i2 == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i2 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5 && i2 != 8) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10367m, kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
        /* renamed from: c */
        public InterfaceC10594h mo32887c() {
            AbstractC10645e abstractC10645e = this.f40968e;
            if (abstractC10645e == null) {
                m37833v(3);
            }
            return abstractC10645e;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
        /* renamed from: e */
        public boolean mo32888e() {
            return true;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
        public List<InterfaceC10587e1> getParameters() {
            List<InterfaceC10587e1> listEmptyList = Collections.emptyList();
            if (listEmptyList == null) {
                m37833v(2);
            }
            return listEmptyList;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10367m
        /* renamed from: i */
        protected boolean mo36579i(InterfaceC10594h interfaceC10594h) {
            if (interfaceC10594h == null) {
                m37833v(9);
            }
            return (interfaceC10594h instanceof InterfaceC10587e1) && C10185b.f39498a.m35777f(this.f40968e, (InterfaceC10587e1) interfaceC10594h, true);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349g
        /* renamed from: l */
        protected Collection<AbstractC10344e0> mo32889l() {
            List<AbstractC10344e0> listMo33498M0 = this.f40968e.mo33498M0();
            if (listMo33498M0 == null) {
                m37833v(1);
            }
            return listMo33498M0;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349g
        /* renamed from: m */
        protected AbstractC10344e0 mo36580m() {
            return C10427k.m37053d(EnumC10426j.f40347x, new String[0]);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
        /* renamed from: o */
        public AbstractC9914h mo36004o() {
            AbstractC9914h abstractC9914hM36072f = C10235a.m36072f(this.f40968e);
            if (abstractC9914hM36072f == null) {
                m37833v(4);
            }
            return abstractC9914hM36072f;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349g
        /* renamed from: q */
        protected InterfaceC10581c1 mo32890q() {
            InterfaceC10581c1 interfaceC10581c1 = this.f40967d;
            if (interfaceC10581c1 == null) {
                m37833v(5);
            }
            return interfaceC10581c1;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349g
        /* renamed from: s */
        protected List<AbstractC10344e0> mo36690s(List<AbstractC10344e0> list) {
            if (list == null) {
                m37833v(7);
            }
            List<AbstractC10344e0> listMo33496A0 = this.f40968e.mo33496A0(list);
            if (listMo33496A0 == null) {
                m37833v(8);
            }
            return listMo33496A0;
        }

        public String toString() {
            return this.f40968e.getName().toString();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349g
        /* renamed from: u */
        protected void mo36692u(AbstractC10344e0 abstractC10344e0) {
            if (abstractC10344e0 == null) {
                m37833v(6);
            }
            this.f40968e.mo33497L0(abstractC10344e0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC10645e(InterfaceC10330n interfaceC10330n, InterfaceC10609m interfaceC10609m, InterfaceC10620g interfaceC10620g, C10163f c10163f, EnumC10384r1 enumC10384r1, boolean z, int i2, InterfaceC10741z0 interfaceC10741z0, InterfaceC10581c1 interfaceC10581c1) {
        super(interfaceC10609m, interfaceC10620g, c10163f, interfaceC10741z0);
        if (interfaceC10330n == null) {
            m37829v(0);
        }
        if (interfaceC10609m == null) {
            m37829v(1);
        }
        if (interfaceC10620g == null) {
            m37829v(2);
        }
        if (c10163f == null) {
            m37829v(3);
        }
        if (enumC10384r1 == null) {
            m37829v(4);
        }
        if (interfaceC10741z0 == null) {
            m37829v(5);
        }
        if (interfaceC10581c1 == null) {
            m37829v(6);
        }
        this.f40955j = enumC10384r1;
        this.f40956k = z;
        this.f40957l = i2;
        this.f40958m = interfaceC10330n.mo36516d(new a(interfaceC10330n, interfaceC10581c1));
        this.f40959n = interfaceC10330n.mo36516d(new b(c10163f));
        this.f40960o = interfaceC10330n;
    }

    /* renamed from: v */
    private static /* synthetic */ void m37829v(int i2) {
        String str;
        int i3;
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i3 = 2;
                break;
            case 12:
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i2) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: A0 */
    protected List<AbstractC10344e0> mo33496A0(List<AbstractC10344e0> list) {
        if (list == null) {
            m37829v(12);
        }
        if (list == null) {
            m37829v(13);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1
    /* renamed from: F */
    public boolean mo37669F() {
        return this.f40956k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10628o<R, D> interfaceC10628o, D d2) {
        return interfaceC10628o.mo35683m(this, d2);
    }

    /* renamed from: L0 */
    protected abstract void mo33497L0(AbstractC10344e0 abstractC10344e0);

    /* renamed from: M0 */
    protected abstract List<AbstractC10344e0> mo33498M0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1
    /* renamed from: g */
    public int mo37670g() {
        return this.f40957l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1
    public List<AbstractC10344e0> getUpperBounds() {
        List<AbstractC10344e0> listMo35998a = ((c) mo32877h()).mo35998a();
        if (listMo35998a == null) {
            m37829v(8);
        }
        return listMo35998a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h
    /* renamed from: h */
    public final InterfaceC10345e1 mo32877h() {
        InterfaceC10345e1 interfaceC10345e1Invoke = this.f40958m.invoke();
        if (interfaceC10345e1Invoke == null) {
            m37829v(9);
        }
        return interfaceC10345e1Invoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1
    /* renamed from: h0 */
    public InterfaceC10330n mo37671h0() {
        InterfaceC10330n interfaceC10330n = this.f40960o;
        if (interfaceC10330n == null) {
            m37829v(14);
        }
        return interfaceC10330n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1
    /* renamed from: n */
    public EnumC10384r1 mo37672n() {
        EnumC10384r1 enumC10384r1 = this.f40955j;
        if (enumC10384r1 == null) {
            m37829v(7);
        }
        return enumC10384r1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1
    /* renamed from: o0 */
    public boolean mo37673o0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h
    /* renamed from: s */
    public AbstractC10368m0 mo36400s() {
        AbstractC10368m0 abstractC10368m0Invoke = this.f40959n.invoke();
        if (abstractC10368m0Invoke == null) {
            m37829v(10);
        }
        return abstractC10368m0Invoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10657k, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10655j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: a */
    public InterfaceC10587e1 mo37019a() {
        InterfaceC10587e1 interfaceC10587e1 = (InterfaceC10587e1) super.mo37019a();
        if (interfaceC10587e1 == null) {
            m37829v(11);
        }
        return interfaceC10587e1;
    }
}
