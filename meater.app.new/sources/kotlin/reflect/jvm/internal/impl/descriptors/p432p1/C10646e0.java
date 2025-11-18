package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10583d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10727s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10733v0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10165h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;

/* compiled from: PropertySetterDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.e0 */
/* loaded from: classes2.dex */
public class C10646e0 extends AbstractC10640b0 implements InterfaceC10733v0 {

    /* renamed from: r */
    private InterfaceC10599i1 f40969r;

    /* renamed from: s */
    private final InterfaceC10733v0 f40970s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C10646e0(InterfaceC10729t0 interfaceC10729t0, InterfaceC10620g interfaceC10620g, EnumC10583d0 enumC10583d0, AbstractC10730u abstractC10730u, boolean z, boolean z2, boolean z3, InterfaceC10576b.a aVar, InterfaceC10733v0 interfaceC10733v0, InterfaceC10741z0 interfaceC10741z0) {
        C10646e0 c10646e0;
        C10646e0 c10646e02;
        super(enumC10583d0, abstractC10730u, interfaceC10729t0, interfaceC10620g, C10163f.m35451D("<set-" + interfaceC10729t0.getName() + ">"), z, z2, z3, aVar, interfaceC10741z0);
        if (interfaceC10729t0 == null) {
            m37835v(0);
        }
        if (interfaceC10620g == null) {
            m37835v(1);
        }
        if (enumC10583d0 == null) {
            m37835v(2);
        }
        if (abstractC10730u == null) {
            m37835v(3);
        }
        if (aVar == null) {
            m37835v(4);
        }
        if (interfaceC10741z0 == null) {
            m37835v(5);
        }
        if (interfaceC10733v0 != 0) {
            c10646e02 = this;
            c10646e0 = interfaceC10733v0;
        } else {
            c10646e0 = this;
            c10646e02 = c10646e0;
        }
        c10646e02.f40970s = c10646e0;
    }

    /* renamed from: Q0 */
    public static C10660l0 m37834Q0(InterfaceC10733v0 interfaceC10733v0, AbstractC10344e0 abstractC10344e0, InterfaceC10620g interfaceC10620g) {
        if (interfaceC10733v0 == null) {
            m37835v(7);
        }
        if (abstractC10344e0 == null) {
            m37835v(8);
        }
        if (interfaceC10620g == null) {
            m37835v(9);
        }
        return new C10660l0(interfaceC10733v0, null, 0, interfaceC10620g, C10165h.f39278n, abstractC10344e0, false, false, false, null, InterfaceC10741z0.f41247a);
    }

    /* renamed from: v */
    private static /* synthetic */ void m37835v(int i2) {
        String str;
        int i3;
        switch (i2) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 10:
            case 11:
            case 12:
            case 13:
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD;
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i2) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i2) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i2) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10628o<R, D> interfaceC10628o, D d2) {
        return interfaceC10628o.mo35679i(this, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10640b0, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10657k, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10655j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public InterfaceC10733v0 mo37019a() {
        InterfaceC10733v0 interfaceC10733v0 = this.f40970s;
        if (interfaceC10733v0 == null) {
            m37835v(13);
        }
        return interfaceC10733v0;
    }

    /* renamed from: S0 */
    public void m37837S0(InterfaceC10599i1 interfaceC10599i1) {
        if (interfaceC10599i1 == null) {
            m37835v(6);
        }
        this.f40969r = interfaceC10599i1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: e */
    public Collection<? extends InterfaceC10733v0> mo37027e() {
        Collection<InterfaceC10727s0> collectionM37768M0 = super.m37768M0(false);
        if (collectionM37768M0 == null) {
            m37835v(10);
        }
        return collectionM37768M0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: f */
    public List<InterfaceC10599i1> mo37028f() {
        InterfaceC10599i1 interfaceC10599i1 = this.f40969r;
        if (interfaceC10599i1 == null) {
            throw new IllegalStateException();
        }
        List<InterfaceC10599i1> listSingletonList = Collections.singletonList(interfaceC10599i1);
        if (listSingletonList == null) {
            m37835v(11);
        }
        return listSingletonList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    public AbstractC10344e0 getReturnType() {
        AbstractC10368m0 abstractC10368m0M32787Z = C10235a.m36072f(this).m32787Z();
        if (abstractC10368m0M32787Z == null) {
            m37835v(12);
        }
        return abstractC10368m0M32787Z;
    }
}
