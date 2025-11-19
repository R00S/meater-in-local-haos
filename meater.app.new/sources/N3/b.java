package N3;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CompoundTrimPathContent.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final List<u> f12378a = new ArrayList();

    void a(u uVar) {
        this.f12378a.add(uVar);
    }

    public void b(Path path) {
        for (int size = this.f12378a.size() - 1; size >= 0; size--) {
            X3.j.b(path, this.f12378a.get(size));
        }
    }
}
