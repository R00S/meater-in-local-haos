package d8;

import android.app.PendingIntent;
import java.util.Map;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: d8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3057a {

    /* renamed from: a, reason: collision with root package name */
    private final String f39743a;

    /* renamed from: b, reason: collision with root package name */
    private final int f39744b;

    /* renamed from: c, reason: collision with root package name */
    private final int f39745c;

    /* renamed from: d, reason: collision with root package name */
    private final int f39746d;

    /* renamed from: e, reason: collision with root package name */
    private final Integer f39747e;

    /* renamed from: f, reason: collision with root package name */
    private final int f39748f;

    /* renamed from: g, reason: collision with root package name */
    private final long f39749g;

    /* renamed from: h, reason: collision with root package name */
    private final long f39750h;

    /* renamed from: i, reason: collision with root package name */
    private final long f39751i;

    /* renamed from: j, reason: collision with root package name */
    private final long f39752j;

    /* renamed from: k, reason: collision with root package name */
    private final PendingIntent f39753k;

    /* renamed from: l, reason: collision with root package name */
    private final PendingIntent f39754l;

    /* renamed from: m, reason: collision with root package name */
    private final PendingIntent f39755m;

    /* renamed from: n, reason: collision with root package name */
    private final PendingIntent f39756n;

    /* renamed from: o, reason: collision with root package name */
    private final Map f39757o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f39758p = false;

    private C3057a(String str, int i10, int i11, int i12, Integer num, int i13, long j10, long j11, long j12, long j13, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        this.f39743a = str;
        this.f39744b = i10;
        this.f39745c = i11;
        this.f39746d = i12;
        this.f39747e = num;
        this.f39748f = i13;
        this.f39749g = j10;
        this.f39750h = j11;
        this.f39751i = j12;
        this.f39752j = j13;
        this.f39753k = pendingIntent;
        this.f39754l = pendingIntent2;
        this.f39755m = pendingIntent3;
        this.f39756n = pendingIntent4;
        this.f39757o = map;
    }

    public static C3057a e(String str, int i10, int i11, int i12, Integer num, int i13, long j10, long j11, long j12, long j13, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        return new C3057a(str, i10, i11, i12, num, i13, j10, j11, j12, j13, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map);
    }

    private final boolean h(AbstractC3060d abstractC3060d) {
        return abstractC3060d.a() && this.f39751i <= this.f39752j;
    }

    public boolean a(int i10) {
        return d(AbstractC3060d.c(i10)) != null;
    }

    public boolean b(AbstractC3060d abstractC3060d) {
        return d(abstractC3060d) != null;
    }

    public int c() {
        return this.f39745c;
    }

    final PendingIntent d(AbstractC3060d abstractC3060d) {
        if (abstractC3060d.b() == 0) {
            PendingIntent pendingIntent = this.f39754l;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (h(abstractC3060d)) {
                return this.f39756n;
            }
            return null;
        }
        if (abstractC3060d.b() == 1) {
            PendingIntent pendingIntent2 = this.f39753k;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (h(abstractC3060d)) {
                return this.f39755m;
            }
        }
        return null;
    }

    final void f() {
        this.f39758p = true;
    }

    final boolean g() {
        return this.f39758p;
    }
}
