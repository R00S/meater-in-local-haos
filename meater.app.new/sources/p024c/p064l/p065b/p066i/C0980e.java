package p024c.p064l.p065b.p066i;

import java.util.Arrays;
import kotlin.jvm.internal.C9801m;
import p024c.p064l.p065b.p066i.AbstractC0979d;

/* compiled from: PreferencesFactory.kt */
/* renamed from: c.l.b.i.e */
/* loaded from: classes.dex */
public final class C0980e {
    /* renamed from: a */
    public static final AbstractC0979d m6254a() {
        return new C0976a(null, true, 1, null);
    }

    /* renamed from: b */
    public static final C0976a m6255b(AbstractC0979d.b<?>... bVarArr) {
        C9801m.m32346f(bVarArr, "pairs");
        C0976a c0976a = new C0976a(null, false, 1, null);
        c0976a.m6241g((AbstractC0979d.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        return c0976a;
    }
}
