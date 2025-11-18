package kotlin.reflect.p371y.internal.p374j0.p400i.p403r;

import java.util.Arrays;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;

/* compiled from: constantValues.kt */
/* renamed from: kotlin.f0.y.e.j0.i.r.e */
/* loaded from: classes3.dex */
public final class C10209e extends AbstractC10219o<Character> {
    public C10209e(char c2) {
        super(Character.valueOf(c2));
    }

    /* renamed from: c */
    private final String m36016c(char c2) {
        return c2 == '\b' ? "\\b" : c2 == '\t' ? "\\t" : c2 == '\n' ? "\\n" : c2 == '\f' ? "\\f" : c2 == '\r' ? "\\r" : m36017e(c2) ? String.valueOf(c2) : "?";
    }

    /* renamed from: e */
    private final boolean m36017e(char c2) {
        byte type = (byte) Character.getType(c2);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public AbstractC10368m0 mo36013a(InterfaceC10592g0 interfaceC10592g0) {
        C9801m.m32346f(interfaceC10592g0, "module");
        AbstractC10368m0 abstractC10368m0M32801u = interfaceC10592g0.mo37021o().m32801u();
        C9801m.m32345e(abstractC10368m0M32801u, "module.builtIns.charType");
        return abstractC10368m0M32801u;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g
    public String toString() {
        String str = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(mo36023b().charValue()), m36016c(mo36023b().charValue())}, 2));
        C9801m.m32345e(str, "format(this, *args)");
        return str;
    }
}
