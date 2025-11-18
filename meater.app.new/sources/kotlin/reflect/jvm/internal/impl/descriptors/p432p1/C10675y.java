package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10593g1;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10583d0;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10588f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10582d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10364l;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;

/* compiled from: MutableClassDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.y */
/* loaded from: classes2.dex */
public class C10675y extends AbstractC10649g {

    /* renamed from: n */
    private final EnumC10588f f41120n;

    /* renamed from: o */
    private final boolean f41121o;

    /* renamed from: p */
    private EnumC10583d0 f41122p;

    /* renamed from: q */
    private AbstractC10730u f41123q;

    /* renamed from: r */
    private InterfaceC10345e1 f41124r;

    /* renamed from: s */
    private List<InterfaceC10587e1> f41125s;

    /* renamed from: t */
    private final Collection<AbstractC10344e0> f41126t;

    /* renamed from: u */
    private final InterfaceC10330n f41127u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10675y(InterfaceC10609m interfaceC10609m, EnumC10588f enumC10588f, boolean z, boolean z2, C10163f c10163f, InterfaceC10741z0 interfaceC10741z0, InterfaceC10330n interfaceC10330n) {
        super(interfaceC10330n, interfaceC10609m, c10163f, interfaceC10741z0, z2);
        if (interfaceC10609m == null) {
            m38001K(0);
        }
        if (enumC10588f == null) {
            m38001K(1);
        }
        if (c10163f == null) {
            m38001K(2);
        }
        if (interfaceC10741z0 == null) {
            m38001K(3);
        }
        if (interfaceC10330n == null) {
            m38001K(4);
        }
        this.f41126t = new ArrayList();
        this.f41127u = interfaceC10330n;
        this.f41120n = enumC10588f;
        this.f41121o = z;
    }

    /* renamed from: K */
    private static /* synthetic */ void m38001K(int i2) {
        String str;
        int i3;
        switch (i2) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i3 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i2) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i2) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i2) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: A */
    public boolean mo32857A() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: D */
    public boolean mo32858D() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: E0 */
    public boolean mo32859E0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10670t
    /* renamed from: H */
    public InterfaceC10251h mo32860H(AbstractC10396g abstractC10396g) {
        if (abstractC10396g == null) {
            m38001K(16);
        }
        InterfaceC10251h.b bVar = InterfaceC10251h.b.f39671b;
        if (bVar == null) {
            m38001K(17);
        }
        return bVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: J */
    public Collection<InterfaceC10585e> mo32861J() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            m38001K(19);
        }
        return listEmptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: J0 */
    public boolean mo32862J0() {
        return false;
    }

    /* renamed from: L0 */
    public void m38002L0() {
        this.f41124r = new C10364l(this, this.f41125s, this.f41126t, this.f41127u);
        Iterator<InterfaceC10582d> it = mo32880k().iterator();
        while (it.hasNext()) {
            ((C10647f) it.next()).m37928h1(mo36400s());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: M */
    public boolean mo32863M() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public Set<InterfaceC10582d> mo32880k() {
        Set<InterfaceC10582d> setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            m38001K(13);
        }
        return setEmptySet;
    }

    /* renamed from: N0 */
    public void m38004N0(EnumC10583d0 enumC10583d0) {
        if (enumC10583d0 == null) {
            m38001K(6);
        }
        this.f41122p = enumC10583d0;
    }

    /* renamed from: O0 */
    public void m38005O0(List<InterfaceC10587e1> list) {
        if (list == null) {
            m38001K(14);
        }
        if (this.f41125s == null) {
            this.f41125s = new ArrayList(list);
            return;
        }
        throw new IllegalStateException("Type parameters are already set for " + getName());
    }

    /* renamed from: P0 */
    public void m38006P0(AbstractC10730u abstractC10730u) {
        if (abstractC10730u == null) {
            m38001K(9);
        }
        this.f41123q = abstractC10730u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: R */
    public InterfaceC10582d mo32864R() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: S */
    public InterfaceC10251h mo32866S() {
        InterfaceC10251h.b bVar = InterfaceC10251h.b.f39671b;
        if (bVar == null) {
            m38001K(18);
        }
        return bVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: U */
    public InterfaceC10585e mo32869U() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10614a
    public InterfaceC10620g getAnnotations() {
        InterfaceC10620g interfaceC10620gM37735b = InterfaceC10620g.f40808c.m37735b();
        if (interfaceC10620gM37735b == null) {
            m38001K(5);
        }
        return interfaceC10620gM37735b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10677q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    public AbstractC10730u getVisibility() {
        AbstractC10730u abstractC10730u = this.f41123q;
        if (abstractC10730u == null) {
            m38001K(10);
        }
        return abstractC10730u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h
    /* renamed from: h */
    public InterfaceC10345e1 mo32877h() {
        InterfaceC10345e1 interfaceC10345e1 = this.f41124r;
        if (interfaceC10345e1 == null) {
            m38001K(11);
        }
        return interfaceC10345e1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: i */
    public EnumC10588f mo32878i() {
        EnumC10588f enumC10588f = this.f41120n;
        if (enumC10588f == null) {
            m38001K(8);
        }
        return enumC10588f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: j */
    public EnumC10583d0 mo32879j() {
        EnumC10583d0 enumC10583d0 = this.f41122p;
        if (enumC10583d0 == null) {
            m38001K(7);
        }
        return enumC10583d0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: l */
    public boolean mo32881l() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10597i
    /* renamed from: m */
    public boolean mo32882m() {
        return this.f41121o;
    }

    public String toString() {
        return AbstractC10655j.m37857H(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10597i
    /* renamed from: w */
    public List<InterfaceC10587e1> mo32884w() {
        List<InterfaceC10587e1> list = this.f41125s;
        if (list == null) {
            m38001K(15);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: z0 */
    public AbstractC10593g1<AbstractC10368m0> mo32886z0() {
        return null;
    }
}
