package kotlin;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import y0.m0;

/* compiled from: LazyLayout.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\"\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0016"}, d2 = {"LC/s;", "Ly0/m0;", "LC/o;", "factory", "<init>", "(LC/o;)V", "Ly0/m0$a;", "slotIds", "Loa/F;", "b", "(Ly0/m0$a;)V", "", "slotId", "reusableSlotId", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "LC/o;", "", "", "Ljava/util/Map;", "countPerType", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class s implements m0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C0976o factory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<Object, Integer> countPerType = new LinkedHashMap();

    public s(C0976o c0976o) {
        this.factory = c0976o;
    }

    @Override // y0.m0
    public boolean a(Object slotId, Object reusableSlotId) {
        return C3862t.b(this.factory.c(slotId), this.factory.c(reusableSlotId));
    }

    @Override // y0.m0
    public void b(m0.a slotIds) {
        this.countPerType.clear();
        Iterator<Object> it = slotIds.iterator();
        while (it.hasNext()) {
            Object objC = this.factory.c(it.next());
            Integer num = this.countPerType.get(objC);
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue == 7) {
                it.remove();
            } else {
                this.countPerType.put(objC, Integer.valueOf(iIntValue + 1));
            }
        }
    }
}
