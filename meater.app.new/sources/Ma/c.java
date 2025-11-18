package Ma;

import java.util.Map;

/* loaded from: classes3.dex */
class c implements Ba.a {

    /* renamed from: B, reason: collision with root package name */
    private final Class f12148B;

    /* renamed from: C, reason: collision with root package name */
    private final Map f12149C;

    public c(Class cls, Map map) {
        this.f12148B = cls;
        this.f12149C = map;
    }

    @Override // Ba.a
    public Object invoke() {
        return f.l(this.f12148B, this.f12149C);
    }
}
