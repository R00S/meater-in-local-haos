package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import cm.aptoide.p092pt.dataprovider.model.p096v7.Malware;
import kotlin.jvm.internal.C9789g;

/* compiled from: ReportLevel.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.f0 */
/* loaded from: classes2.dex */
public enum EnumC9955f0 {
    IGNORE("ignore"),
    WARN(Malware.WARN),
    STRICT("strict");


    /* renamed from: f */
    public static final a f37851f = new a(null);

    /* renamed from: k */
    private final String f37856k;

    /* compiled from: ReportLevel.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.f0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    EnumC9955f0(String str) {
        this.f37856k = str;
    }

    /* renamed from: k */
    public final String m33093k() {
        return this.f37856k;
    }

    /* renamed from: q */
    public final boolean m33094q() {
        return this == IGNORE;
    }

    /* renamed from: u */
    public final boolean m33095u() {
        return this == WARN;
    }
}
