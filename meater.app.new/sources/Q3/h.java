package Q3;

/* compiled from: Marker.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final String f14318a;

    /* renamed from: b, reason: collision with root package name */
    public final float f14319b;

    /* renamed from: c, reason: collision with root package name */
    public final float f14320c;

    public h(String str, float f10, float f11) {
        this.f14318a = str;
        this.f14320c = f11;
        this.f14319b = f10;
    }

    public boolean a(String str) {
        if (this.f14318a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f14318a.endsWith("\r")) {
            String str2 = this.f14318a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
