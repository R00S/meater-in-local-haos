package c0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import oa.C4153F;

/* compiled from: AutofillTree.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Lc0/i;", "", "<init>", "()V", "", "id", "", "value", "Loa/F;", "b", "(ILjava/lang/String;)Loa/F;", "", "Lc0/h;", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "children", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<Integer, h> children = new LinkedHashMap();

    public final Map<Integer, h> a() {
        return this.children;
    }

    public final C4153F b(int id2, String value) {
        Ba.l<String, C4153F> lVarC;
        h hVar = this.children.get(Integer.valueOf(id2));
        if (hVar == null || (lVarC = hVar.c()) == null) {
            return null;
        }
        lVarC.invoke(value);
        return C4153F.f46609a;
    }
}
