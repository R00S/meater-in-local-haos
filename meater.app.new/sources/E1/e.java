package E1;

import E1.d;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: PreferencesFactory.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a+\u0010\u0007\u001a\u00020\u00062\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\"\u0006\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LE1/d;", "a", "()LE1/d;", "", "LE1/d$b;", "pairs", "LE1/a;", "b", "([LE1/d$b;)LE1/a;", "datastore-preferences-core"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class e {
    public static final d a() {
        return new a(null, true, 1, null);
    }

    public static final a b(d.b<?>... pairs) {
        C3862t.g(pairs, "pairs");
        a aVar = new a(null, false, 1, null);
        aVar.g((d.b[]) Arrays.copyOf(pairs, pairs.length));
        return aVar;
    }
}
