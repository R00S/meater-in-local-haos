package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10583d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10727s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10735w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10366l1;

/* compiled from: PropertyAccessorDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.b0 */
/* loaded from: classes2.dex */
public abstract class AbstractC10640b0 extends AbstractC10657k implements InterfaceC10727s0 {

    /* renamed from: j */
    private boolean f40906j;

    /* renamed from: k */
    private final boolean f40907k;

    /* renamed from: l */
    private final EnumC10583d0 f40908l;

    /* renamed from: m */
    private final InterfaceC10729t0 f40909m;

    /* renamed from: n */
    private final boolean f40910n;

    /* renamed from: o */
    private final InterfaceC10576b.a f40911o;

    /* renamed from: p */
    private AbstractC10730u f40912p;

    /* renamed from: q */
    private InterfaceC10738y f40913q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10640b0(EnumC10583d0 enumC10583d0, AbstractC10730u abstractC10730u, InterfaceC10729t0 interfaceC10729t0, InterfaceC10620g interfaceC10620g, C10163f c10163f, boolean z, boolean z2, boolean z3, InterfaceC10576b.a aVar, InterfaceC10741z0 interfaceC10741z0) {
        super(interfaceC10729t0.mo32876b(), interfaceC10620g, c10163f, interfaceC10741z0);
        if (enumC10583d0 == null) {
            m37761v(0);
        }
        if (abstractC10730u == null) {
            m37761v(1);
        }
        if (interfaceC10729t0 == null) {
            m37761v(2);
        }
        if (interfaceC10620g == null) {
            m37761v(3);
        }
        if (c10163f == null) {
            m37761v(4);
        }
        if (interfaceC10741z0 == null) {
            m37761v(5);
        }
        this.f40913q = null;
        this.f40908l = enumC10583d0;
        this.f40912p = abstractC10730u;
        this.f40909m = interfaceC10729t0;
        this.f40906j = z;
        this.f40907k = z2;
        this.f40910n = z3;
        this.f40911o = aVar;
    }

    /* renamed from: v */
    private static /* synthetic */ void m37761v(int i2) {
        String str;
        int i3;
        switch (i2) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                i3 = 2;
                break;
            case 7:
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 15:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i2) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getModality";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 12:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i2) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 15:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i2) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b
    /* renamed from: A0, reason: merged with bridge method [inline-methods] */
    public InterfaceC10727s0 mo36990k0(InterfaceC10609m interfaceC10609m, EnumC10583d0 enumC10583d0, AbstractC10730u abstractC10730u, InterfaceC10576b.a aVar, boolean z) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10727s0
    /* renamed from: B0 */
    public InterfaceC10729t0 mo37763B0() {
        InterfaceC10729t0 interfaceC10729t0 = this.f40909m;
        if (interfaceC10729t0 == null) {
            m37761v(12);
        }
        return interfaceC10729t0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y
    /* renamed from: C0 */
    public boolean mo37764C0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: E0 */
    public boolean mo32859E0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: G */
    public boolean mo33204G() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y
    /* renamed from: H0 */
    public boolean mo37765H0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10657k, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10655j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public abstract InterfaceC10727s0 mo37019a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: M */
    public boolean mo32863M() {
        return false;
    }

    /* renamed from: M0 */
    protected Collection<InterfaceC10727s0> m37768M0(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (InterfaceC10729t0 interfaceC10729t0 : mo37763B0().mo37027e()) {
            InterfaceC10609m getter = z ? interfaceC10729t0.getGetter() : interfaceC10729t0.getSetter();
            if (getter != null) {
                arrayList.add(getter);
            }
        }
        return arrayList;
    }

    /* renamed from: N0 */
    public void m37769N0(boolean z) {
        this.f40906j = z;
    }

    /* renamed from: O0 */
    public void m37770O0(InterfaceC10738y interfaceC10738y) {
        this.f40913q = interfaceC10738y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y
    /* renamed from: P */
    public boolean mo32908P() {
        return false;
    }

    /* renamed from: P0 */
    public void m37771P0(AbstractC10730u abstractC10730u) {
        this.f40912p = abstractC10730u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y
    /* renamed from: Q */
    public boolean mo37772Q() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10727s0
    /* renamed from: V */
    public boolean mo37773V() {
        return this.f40906j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y
    /* renamed from: d0 */
    public InterfaceC10738y mo37774d0() {
        return this.f40913q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: f0 */
    public InterfaceC10735w0 mo37029f0() {
        return mo37763B0().mo37029f0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    public List<InterfaceC10587e1> getTypeParameters() {
        List<InterfaceC10587e1> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            m37761v(8);
        }
        return listEmptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10677q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    public AbstractC10730u getVisibility() {
        AbstractC10730u abstractC10730u = this.f40912p;
        if (abstractC10730u == null) {
            m37761v(10);
        }
        return abstractC10730u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b
    /* renamed from: i */
    public InterfaceC10576b.a mo37030i() {
        InterfaceC10576b.a aVar = this.f40911o;
        if (aVar == null) {
            m37761v(6);
        }
        return aVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: i0 */
    public <V> V mo33224i0(InterfaceC10573a.a<V> aVar) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y
    public boolean isInline() {
        return this.f40910n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y
    public boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: j */
    public EnumC10583d0 mo32879j() {
        EnumC10583d0 enumC10583d0 = this.f40908l;
        if (enumC10583d0 == null) {
            m37761v(9);
        }
        return enumC10583d0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: m0 */
    public InterfaceC10735w0 mo37032m0() {
        return mo37763B0().mo37032m0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: r0 */
    public List<InterfaceC10735w0> mo37035r0() {
        List<InterfaceC10735w0> listMo37035r0 = mo37763B0().mo37035r0();
        if (listMo37035r0 == null) {
            m37761v(13);
        }
        return listMo37035r0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y
    /* renamed from: w0 */
    public boolean mo37775w0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b
    /* renamed from: x0 */
    public void mo36993x0(Collection<? extends InterfaceC10576b> collection) {
        if (collection == null) {
            m37761v(15);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: z */
    public boolean mo32885z() {
        return this.f40907k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10578b1
    /* renamed from: c */
    public InterfaceC10738y mo36396c(C10366l1 c10366l1) {
        if (c10366l1 == null) {
            m37761v(7);
        }
        throw new UnsupportedOperationException();
    }
}
