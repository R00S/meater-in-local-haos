package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10613n0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10604k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10607l0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;

/* compiled from: DeserializedClassDataFinder.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.o */
/* loaded from: classes3.dex */
public final class C10305o implements InterfaceC10298h {

    /* renamed from: a */
    private final InterfaceC10607l0 f39944a;

    public C10305o(InterfaceC10607l0 interfaceC10607l0) {
        C9801m.m32346f(interfaceC10607l0, "packageFragmentProvider");
        this.f39944a = interfaceC10607l0;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10298h
    /* renamed from: a */
    public C10283g mo33978a(C10159b c10159b) {
        C10283g c10283gMo33978a;
        C9801m.m32346f(c10159b, "classId");
        InterfaceC10607l0 interfaceC10607l0 = this.f39944a;
        C10160c c10160cM35413h = c10159b.m35413h();
        C9801m.m32345e(c10160cM35413h, "classId.packageFqName");
        for (InterfaceC10604k0 interfaceC10604k0 : C10613n0.m37725c(interfaceC10607l0, c10160cM35413h)) {
            if ((interfaceC10604k0 instanceof AbstractC10306p) && (c10283gMo33978a = ((AbstractC10306p) interfaceC10604k0).mo36463A0().mo33978a(c10159b)) != null) {
                return c10283gMo33978a;
            }
        }
        return null;
    }
}
