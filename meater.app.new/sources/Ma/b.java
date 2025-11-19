package Ma;

import java.util.Map;

/* loaded from: classes3.dex */
class b implements Ba.a {

    /* renamed from: B, reason: collision with root package name */
    private final Map f12147B;

    public b(Map map) {
        this.f12147B = map;
    }

    @Override // Ba.a
    public Object invoke() {
        return Integer.valueOf(f.j(this.f12147B));
    }
}
