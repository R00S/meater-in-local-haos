package kotlin.reflect.p371y.internal.p374j0.p415l.p417u1;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9911e;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;

/* compiled from: ErrorTypeConstructor.kt */
/* renamed from: kotlin.f0.y.e.j0.l.u1.i */
/* loaded from: classes3.dex */
public final class C10425i implements InterfaceC10345e1 {

    /* renamed from: a */
    private final EnumC10426j f40265a;

    /* renamed from: b */
    private final String[] f40266b;

    /* renamed from: c */
    private final String f40267c;

    public C10425i(EnumC10426j enumC10426j, String... strArr) {
        C9801m.m32346f(enumC10426j, "kind");
        C9801m.m32346f(strArr, "formatParams");
        this.f40265a = enumC10426j;
        this.f40266b = strArr;
        String strM36988k = EnumC10418b.ERROR_TYPE.m36988k();
        String strM37049k = enumC10426j.m37049k();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        String str = String.format(strM37049k, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        C9801m.m32345e(str, "format(this, *args)");
        String str2 = String.format(strM36988k, Arrays.copyOf(new Object[]{str}, 1));
        C9801m.m32345e(str2, "format(this, *args)");
        this.f40267c = str2;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: a */
    public Collection<AbstractC10344e0> mo35998a() {
        return C10817u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: b */
    public InterfaceC10345e1 mo35999b(AbstractC10396g abstractC10396g) {
        C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: c */
    public InterfaceC10594h mo32891w() {
        return C10427k.f40355a.m37061h();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: e */
    public boolean mo32888e() {
        return false;
    }

    /* renamed from: g */
    public final EnumC10426j m37046g() {
        return this.f40265a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    public List<InterfaceC10587e1> getParameters() {
        return C10817u.m38888j();
    }

    /* renamed from: h */
    public final String m37047h(int i2) {
        return this.f40266b[i2];
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: o */
    public AbstractC9914h mo36004o() {
        return C9911e.f37452h.m32704a();
    }

    public String toString() {
        return this.f40267c;
    }
}
