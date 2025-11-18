package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.Iterator;
import kotlin.collections.C10782c0;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c;
import kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10172c;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10444k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10445l;
import kotlin.text.C10543r;

/* compiled from: KotlinType.kt */
/* renamed from: kotlin.f0.y.e.j0.l.m0 */
/* loaded from: classes3.dex */
public abstract class AbstractC10368m0 extends AbstractC10381q1 implements InterfaceC10444k, InterfaceC10445l {
    public AbstractC10368m0() {
        super(null);
    }

    /* renamed from: V0 */
    public abstract AbstractC10368m0 mo33692V0(boolean z);

    /* renamed from: W0 */
    public abstract AbstractC10368m0 mo33693W0(C10333a1 c10333a1);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<InterfaceC10616c> it = getAnnotations().iterator();
        while (it.hasNext()) {
            C10543r.m37502i(sb, "[", AbstractC10172c.m35499s(AbstractC10172c.f39380j, it.next(), null, 2, null), "] ");
        }
        sb.append(mo35993O0());
        if (!mo35991M0().isEmpty()) {
            C10782c0.m38597c0(mo35991M0(), sb, ", ", "<", ">", 0, null, null, 112, null);
        }
        if (mo33691P0()) {
            sb.append("?");
        }
        String string = sb.toString();
        C9801m.m32345e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
