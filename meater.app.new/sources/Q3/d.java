package Q3;

import S3.q;
import java.util.List;

/* compiled from: FontCharacter.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final List<q> f14307a;

    /* renamed from: b, reason: collision with root package name */
    private final char f14308b;

    /* renamed from: c, reason: collision with root package name */
    private final double f14309c;

    /* renamed from: d, reason: collision with root package name */
    private final double f14310d;

    /* renamed from: e, reason: collision with root package name */
    private final String f14311e;

    /* renamed from: f, reason: collision with root package name */
    private final String f14312f;

    public d(List<q> list, char c10, double d10, double d11, String str, String str2) {
        this.f14307a = list;
        this.f14308b = c10;
        this.f14309c = d10;
        this.f14310d = d11;
        this.f14311e = str;
        this.f14312f = str2;
    }

    public static int c(char c10, String str, String str2) {
        return (((c10 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<q> a() {
        return this.f14307a;
    }

    public double b() {
        return this.f14310d;
    }

    public int hashCode() {
        return c(this.f14308b, this.f14312f, this.f14311e);
    }
}
