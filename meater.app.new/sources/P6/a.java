package P6;

import M6.m;
import f9.InterfaceC3350d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ClientMetrics.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private static final a f14091e = new C0207a().b();

    /* renamed from: a, reason: collision with root package name */
    private final f f14092a;

    /* renamed from: b, reason: collision with root package name */
    private final List<d> f14093b;

    /* renamed from: c, reason: collision with root package name */
    private final b f14094c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14095d;

    /* compiled from: ClientMetrics.java */
    /* renamed from: P6.a$a, reason: collision with other inner class name */
    public static final class C0207a {

        /* renamed from: a, reason: collision with root package name */
        private f f14096a = null;

        /* renamed from: b, reason: collision with root package name */
        private List<d> f14097b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private b f14098c = null;

        /* renamed from: d, reason: collision with root package name */
        private String f14099d = "";

        C0207a() {
        }

        public C0207a a(d dVar) {
            this.f14097b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f14096a, Collections.unmodifiableList(this.f14097b), this.f14098c, this.f14099d);
        }

        public C0207a c(String str) {
            this.f14099d = str;
            return this;
        }

        public C0207a d(b bVar) {
            this.f14098c = bVar;
            return this;
        }

        public C0207a e(f fVar) {
            this.f14096a = fVar;
            return this;
        }
    }

    a(f fVar, List<d> list, b bVar, String str) {
        this.f14092a = fVar;
        this.f14093b = list;
        this.f14094c = bVar;
        this.f14095d = str;
    }

    public static C0207a e() {
        return new C0207a();
    }

    @InterfaceC3350d(tag = 4)
    public String a() {
        return this.f14095d;
    }

    @InterfaceC3350d(tag = 3)
    public b b() {
        return this.f14094c;
    }

    @InterfaceC3350d(tag = 2)
    public List<d> c() {
        return this.f14093b;
    }

    @InterfaceC3350d(tag = 1)
    public f d() {
        return this.f14092a;
    }

    public byte[] f() {
        return m.a(this);
    }
}
