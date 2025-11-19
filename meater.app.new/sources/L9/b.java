package L9;

import K8.d;
import K8.g;
import K8.i;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ComponentMonitor.java */
/* loaded from: classes2.dex */
public class b implements i {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object c(String str, K8.c cVar, d dVar) {
        try {
            c.b(str);
            return cVar.h().a(dVar);
        } finally {
            c.a();
        }
    }

    @Override // K8.i
    public List<K8.c<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final K8.c<?> cVarT : componentRegistrar.getComponents()) {
            final String strI = cVarT.i();
            if (strI != null) {
                cVarT = cVarT.t(new g() { // from class: L9.a
                    @Override // K8.g
                    public final Object a(d dVar) {
                        return b.c(strI, cVarT, dVar);
                    }
                });
            }
            arrayList.add(cVarT);
        }
        return arrayList;
    }
}
