package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10728t;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10678q0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10735w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10165h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.C10266i;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10366l1;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;

/* compiled from: AbstractReceiverParameterDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.c */
/* loaded from: classes2.dex */
public abstract class AbstractC10641c extends AbstractC10655j implements InterfaceC10735w0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10641c(InterfaceC10620g interfaceC10620g) {
        super(interfaceC10620g, C10165h.f39272h);
        if (interfaceC10620g == null) {
            m37776v(0);
        }
    }

    /* renamed from: v */
    private static /* synthetic */ void m37776v(int i2) {
        String str;
        int i3;
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
                objArr[0] = "substitutor";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i2) {
            case 2:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 3:
                objArr[1] = "getTypeParameters";
                break;
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getValueParameters";
                break;
            case 6:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 7:
                objArr[1] = "getVisibility";
                break;
            case 8:
                objArr[1] = "getOriginal";
                break;
            case 9:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i2) {
            case 1:
                objArr[2] = "substitute";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: G */
    public boolean mo33204G() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10655j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public InterfaceC10678q0 mo37019a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10628o<R, D> interfaceC10628o, D d2) {
        return interfaceC10628o.mo35682l(this, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: e */
    public Collection<? extends InterfaceC10573a> mo37027e() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            m37776v(6);
        }
        return setEmptySet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: f */
    public List<InterfaceC10599i1> mo37028f() {
        List<InterfaceC10599i1> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            m37776v(5);
        }
        return listEmptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: f0 */
    public InterfaceC10735w0 mo37029f0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    public AbstractC10344e0 getReturnType() {
        return getType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10596h1
    public AbstractC10344e0 getType() {
        AbstractC10344e0 type = getValue().getType();
        if (type == null) {
            m37776v(4);
        }
        return type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    public List<InterfaceC10587e1> getTypeParameters() {
        List<InterfaceC10587e1> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            m37776v(3);
        }
        return listEmptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10677q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    public AbstractC10730u getVisibility() {
        AbstractC10730u abstractC10730u = C10728t.f41221f;
        if (abstractC10730u == null) {
            m37776v(7);
        }
        return abstractC10730u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: m0 */
    public InterfaceC10735w0 mo37032m0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10635p
    /* renamed from: t */
    public InterfaceC10741z0 mo32883t() {
        InterfaceC10741z0 interfaceC10741z0 = InterfaceC10741z0.f41247a;
        if (interfaceC10741z0 == null) {
            m37776v(9);
        }
        return interfaceC10741z0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10578b1
    /* renamed from: c */
    public InterfaceC10735w0 mo36396c(C10366l1 c10366l1) {
        if (c10366l1 == null) {
            m37776v(1);
        }
        if (c10366l1.m36756k()) {
            return this;
        }
        AbstractC10344e0 abstractC10344e0M36759p = mo32876b() instanceof InterfaceC10585e ? c10366l1.m36759p(getType(), EnumC10384r1.OUT_VARIANCE) : c10366l1.m36759p(getType(), EnumC10384r1.INVARIANT);
        if (abstractC10344e0M36759p == null) {
            return null;
        }
        return abstractC10344e0M36759p == getType() ? this : new C10648f0(mo32876b(), new C10266i(abstractC10344e0M36759p), getAnnotations());
    }
}
