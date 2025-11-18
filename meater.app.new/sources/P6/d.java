package P6;

import f9.InterfaceC3350d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: LogSourceMetrics.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    private static final d f14117c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final String f14118a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f14119b;

    /* compiled from: LogSourceMetrics.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f14120a = "";

        /* renamed from: b, reason: collision with root package name */
        private List<c> f14121b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.f14120a, Collections.unmodifiableList(this.f14121b));
        }

        public a b(List<c> list) {
            this.f14121b = list;
            return this;
        }

        public a c(String str) {
            this.f14120a = str;
            return this;
        }
    }

    d(String str, List<c> list) {
        this.f14118a = str;
        this.f14119b = list;
    }

    public static a c() {
        return new a();
    }

    @InterfaceC3350d(tag = 2)
    public List<c> a() {
        return this.f14119b;
    }

    @InterfaceC3350d(tag = 1)
    public String b() {
        return this.f14118a;
    }
}
