package Db;

import Ra.h0;
import kotlin.jvm.internal.C3862t;
import lb.C3923c;
import nb.AbstractC4075a;
import nb.InterfaceC4077c;

/* compiled from: ClassData.kt */
/* renamed from: Db.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1003i {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4077c f3678a;

    /* renamed from: b, reason: collision with root package name */
    private final C3923c f3679b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC4075a f3680c;

    /* renamed from: d, reason: collision with root package name */
    private final h0 f3681d;

    public C1003i(InterfaceC4077c nameResolver, C3923c classProto, AbstractC4075a metadataVersion, h0 sourceElement) {
        C3862t.g(nameResolver, "nameResolver");
        C3862t.g(classProto, "classProto");
        C3862t.g(metadataVersion, "metadataVersion");
        C3862t.g(sourceElement, "sourceElement");
        this.f3678a = nameResolver;
        this.f3679b = classProto;
        this.f3680c = metadataVersion;
        this.f3681d = sourceElement;
    }

    public final InterfaceC4077c a() {
        return this.f3678a;
    }

    public final C3923c b() {
        return this.f3679b;
    }

    public final AbstractC4075a c() {
        return this.f3680c;
    }

    public final h0 d() {
        return this.f3681d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1003i)) {
            return false;
        }
        C1003i c1003i = (C1003i) obj;
        return C3862t.b(this.f3678a, c1003i.f3678a) && C3862t.b(this.f3679b, c1003i.f3679b) && C3862t.b(this.f3680c, c1003i.f3680c) && C3862t.b(this.f3681d, c1003i.f3681d);
    }

    public int hashCode() {
        return (((((this.f3678a.hashCode() * 31) + this.f3679b.hashCode()) * 31) + this.f3680c.hashCode()) * 31) + this.f3681d.hashCode();
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f3678a + ", classProto=" + this.f3679b + ", metadataVersion=" + this.f3680c + ", sourceElement=" + this.f3681d + ')';
    }
}
