package kotlin.reflect.p371y.internal.p374j0.p400i.p403r;

import kotlin.C10773s;
import kotlin.Pair;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10736x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10187d;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10427k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10426j;

/* compiled from: constantValues.kt */
/* renamed from: kotlin.f0.y.e.j0.i.r.j */
/* loaded from: classes3.dex */
public final class C10214j extends AbstractC10211g<Pair<? extends C10159b, ? extends C10163f>> {

    /* renamed from: b */
    private final C10159b f39563b;

    /* renamed from: c */
    private final C10163f f39564c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10214j(C10159b c10159b, C10163f c10163f) {
        super(C10773s.m38547a(c10159b, c10163f));
        C9801m.m32346f(c10159b, "enumClassId");
        C9801m.m32346f(c10163f, "enumEntryName");
        this.f39563b = c10159b;
        this.f39564c = c10163f;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g
    /* renamed from: a */
    public AbstractC10344e0 mo36013a(InterfaceC10592g0 interfaceC10592g0) {
        C9801m.m32346f(interfaceC10592g0, "module");
        InterfaceC10585e interfaceC10585eM38149a = C10736x.m38149a(interfaceC10592g0, this.f39563b);
        AbstractC10368m0 abstractC10368m0Mo36400s = null;
        if (interfaceC10585eM38149a != null) {
            if (!C10187d.m35800A(interfaceC10585eM38149a)) {
                interfaceC10585eM38149a = null;
            }
            if (interfaceC10585eM38149a != null) {
                abstractC10368m0Mo36400s = interfaceC10585eM38149a.mo36400s();
            }
        }
        if (abstractC10368m0Mo36400s != null) {
            return abstractC10368m0Mo36400s;
        }
        EnumC10426j enumC10426j = EnumC10426j.f40271B0;
        String string = this.f39563b.toString();
        C9801m.m32345e(string, "enumClassId.toString()");
        String string2 = this.f39564c.toString();
        C9801m.m32345e(string2, "enumEntryName.toString()");
        return C10427k.m37053d(enumC10426j, string, string2);
    }

    /* renamed from: c */
    public final C10163f m36030c() {
        return this.f39564c;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f39563b.m35415j());
        sb.append('.');
        sb.append(this.f39564c);
        return sb.toString();
    }
}
