package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10124c;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.AbstractC10149a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10151c;

/* compiled from: ClassData.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.g */
/* loaded from: classes3.dex */
public final class C10283g {

    /* renamed from: a */
    private final InterfaceC10151c f39758a;

    /* renamed from: b */
    private final C10124c f39759b;

    /* renamed from: c */
    private final AbstractC10149a f39760c;

    /* renamed from: d */
    private final InterfaceC10741z0 f39761d;

    public C10283g(InterfaceC10151c interfaceC10151c, C10124c c10124c, AbstractC10149a abstractC10149a, InterfaceC10741z0 interfaceC10741z0) {
        C9801m.m32346f(interfaceC10151c, "nameResolver");
        C9801m.m32346f(c10124c, "classProto");
        C9801m.m32346f(abstractC10149a, "metadataVersion");
        C9801m.m32346f(interfaceC10741z0, "sourceElement");
        this.f39758a = interfaceC10151c;
        this.f39759b = c10124c;
        this.f39760c = abstractC10149a;
        this.f39761d = interfaceC10741z0;
    }

    /* renamed from: a */
    public final InterfaceC10151c m36252a() {
        return this.f39758a;
    }

    /* renamed from: b */
    public final C10124c m36253b() {
        return this.f39759b;
    }

    /* renamed from: c */
    public final AbstractC10149a m36254c() {
        return this.f39760c;
    }

    /* renamed from: d */
    public final InterfaceC10741z0 m36255d() {
        return this.f39761d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10283g)) {
            return false;
        }
        C10283g c10283g = (C10283g) obj;
        return C9801m.m32341a(this.f39758a, c10283g.f39758a) && C9801m.m32341a(this.f39759b, c10283g.f39759b) && C9801m.m32341a(this.f39760c, c10283g.f39760c) && C9801m.m32341a(this.f39761d, c10283g.f39761d);
    }

    public int hashCode() {
        return (((((this.f39758a.hashCode() * 31) + this.f39759b.hashCode()) * 31) + this.f39760c.hashCode()) * 31) + this.f39761d.hashCode();
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f39758a + ", classProto=" + this.f39759b + ", metadataVersion=" + this.f39760c + ", sourceElement=" + this.f39761d + ')';
    }
}
