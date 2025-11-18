package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

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
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10731u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;

/* compiled from: PropertyGetterDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.d0 */
/* loaded from: classes2.dex */
public class C10644d0 extends AbstractC10640b0 implements InterfaceC10731u0 {

    /* renamed from: r */
    private AbstractC10344e0 f40953r;

    /* renamed from: s */
    private final InterfaceC10731u0 f40954s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C10644d0(InterfaceC10729t0 interfaceC10729t0, InterfaceC10620g interfaceC10620g, EnumC10583d0 enumC10583d0, AbstractC10730u abstractC10730u, boolean z, boolean z2, boolean z3, InterfaceC10576b.a aVar, InterfaceC10731u0 interfaceC10731u0, InterfaceC10741z0 interfaceC10741z0) {
        C10644d0 c10644d0;
        C10644d0 c10644d02;
        super(enumC10583d0, abstractC10730u, interfaceC10729t0, interfaceC10620g, C10163f.m35451D("<get-" + interfaceC10729t0.getName() + ">"), z, z2, z3, aVar, interfaceC10741z0);
        if (interfaceC10729t0 == null) {
            m37826v(0);
        }
        if (interfaceC10620g == null) {
            m37826v(1);
        }
        if (enumC10583d0 == null) {
            m37826v(2);
        }
        if (abstractC10730u == null) {
            m37826v(3);
        }
        if (aVar == null) {
            m37826v(4);
        }
        if (interfaceC10741z0 == null) {
            m37826v(5);
        }
        if (interfaceC10731u0 != 0) {
            c10644d02 = this;
            c10644d0 = interfaceC10731u0;
        } else {
            c10644d0 = this;
            c10644d02 = c10644d0;
        }
        c10644d02.f40954s = c10644d0;
    }

    /* renamed from: v */
    private static /* synthetic */ void m37826v(int i2) {
        String str = (i2 == 6 || i2 == 7 || i2 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 6 || i2 == 7 || i2 == 8) ? 2 : 3];
        switch (i2) {
            case 1:
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
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i2 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i2 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i2 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i2 != 6 && i2 != 7 && i2 != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i2 != 6 && i2 != 7 && i2 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10628o<R, D> interfaceC10628o, D d2) {
        return interfaceC10628o.mo35675b(this, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10640b0, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10657k, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10655j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public InterfaceC10731u0 mo37019a() {
        InterfaceC10731u0 interfaceC10731u0 = this.f40954s;
        if (interfaceC10731u0 == null) {
            m37826v(8);
        }
        return interfaceC10731u0;
    }

    /* renamed from: R0 */
    public void m37828R0(AbstractC10344e0 abstractC10344e0) {
        if (abstractC10344e0 == null) {
            abstractC10344e0 = mo37763B0().getType();
        }
        this.f40953r = abstractC10344e0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: e */
    public Collection<? extends InterfaceC10731u0> mo37027e() {
        Collection<InterfaceC10727s0> collectionM37768M0 = super.m37768M0(true);
        if (collectionM37768M0 == null) {
            m37826v(6);
        }
        return collectionM37768M0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: f */
    public List<InterfaceC10599i1> mo37028f() {
        List<InterfaceC10599i1> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            m37826v(7);
        }
        return listEmptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    public AbstractC10344e0 getReturnType() {
        return this.f40953r;
    }
}
