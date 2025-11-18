package d2;

/* compiled from: RendererConfiguration.java */
/* loaded from: classes.dex */
public final class G {

    /* renamed from: c, reason: collision with root package name */
    public static final G f39673c = new G(0, false);

    /* renamed from: a, reason: collision with root package name */
    public final int f39674a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f39675b;

    public G(int i10, boolean z10) {
        this.f39674a = i10;
        this.f39675b = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || G.class != obj.getClass()) {
            return false;
        }
        G g10 = (G) obj;
        return this.f39674a == g10.f39674a && this.f39675b == g10.f39675b;
    }

    public int hashCode() {
        return (this.f39674a << 1) + (this.f39675b ? 1 : 0);
    }
}
