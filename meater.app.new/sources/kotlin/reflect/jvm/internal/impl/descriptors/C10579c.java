package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;

/* compiled from: typeParameterUtils.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.c */
/* loaded from: classes2.dex */
final class C10579c implements InterfaceC10587e1 {

    /* renamed from: f */
    private final InterfaceC10587e1 f40734f;

    /* renamed from: g */
    private final InterfaceC10609m f40735g;

    /* renamed from: h */
    private final int f40736h;

    public C10579c(InterfaceC10587e1 interfaceC10587e1, InterfaceC10609m interfaceC10609m, int i2) {
        C9801m.m32346f(interfaceC10587e1, "originalDescriptor");
        C9801m.m32346f(interfaceC10609m, "declarationDescriptor");
        this.f40734f = interfaceC10587e1;
        this.f40735g = interfaceC10609m;
        this.f40736h = i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1
    /* renamed from: F */
    public boolean mo37669F() {
        return this.f40734f.mo37669F();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10628o<R, D> interfaceC10628o, D d2) {
        return (R) this.f40734f.mo37017L(interfaceC10628o, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10612n, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: b */
    public InterfaceC10609m mo32876b() {
        return this.f40735g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1
    /* renamed from: g */
    public int mo37670g() {
        return this.f40736h + this.f40734f.mo37670g();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10614a
    public InterfaceC10620g getAnnotations() {
        return this.f40734f.getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10598i0
    public C10163f getName() {
        return this.f40734f.getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1
    public List<AbstractC10344e0> getUpperBounds() {
        return this.f40734f.getUpperBounds();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h
    /* renamed from: h */
    public InterfaceC10345e1 mo32877h() {
        return this.f40734f.mo32877h();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1
    /* renamed from: h0 */
    public InterfaceC10330n mo37671h0() {
        return this.f40734f.mo37671h0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1
    /* renamed from: n */
    public EnumC10384r1 mo37672n() {
        return this.f40734f.mo37672n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1
    /* renamed from: o0 */
    public boolean mo37673o0() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h
    /* renamed from: s */
    public AbstractC10368m0 mo36400s() {
        return this.f40734f.mo36400s();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10635p
    /* renamed from: t */
    public InterfaceC10741z0 mo32883t() {
        return this.f40734f.mo32883t();
    }

    public String toString() {
        return this.f40734f + "[inner-copy]";
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: a */
    public InterfaceC10587e1 mo37019a() {
        InterfaceC10587e1 interfaceC10587e1Mo37019a = this.f40734f.mo37019a();
        C9801m.m32345e(interfaceC10587e1Mo37019a, "originalDescriptor.original");
        return interfaceC10587e1Mo37019a;
    }
}
