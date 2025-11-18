package p241e.p254e.p256b.p257a.p258i.p266y.p267a;

import com.google.firebase.encoders.p194i.InterfaceC8344f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;
import p241e.p254e.p256b.p257a.p258i.AbstractC8871n;

/* compiled from: ClientMetrics.java */
/* renamed from: e.e.b.a.i.y.a.a */
/* loaded from: classes2.dex */
public final class C8885a {

    /* renamed from: a */
    private static final C8885a f33632a = new a().m28197b();

    /* renamed from: b */
    private final C8890f f33633b;

    /* renamed from: c */
    private final List<C8888d> f33634c;

    /* renamed from: d */
    private final C8886b f33635d;

    /* renamed from: e */
    private final String f33636e;

    /* compiled from: ClientMetrics.java */
    /* renamed from: e.e.b.a.i.y.a.a$a */
    public static final class a {

        /* renamed from: a */
        private C8890f f33637a = null;

        /* renamed from: b */
        private List<C8888d> f33638b = new ArrayList();

        /* renamed from: c */
        private C8886b f33639c = null;

        /* renamed from: d */
        private String f33640d = HttpUrl.FRAGMENT_ENCODE_SET;

        a() {
        }

        /* renamed from: a */
        public a m28196a(C8888d c8888d) {
            this.f33638b.add(c8888d);
            return this;
        }

        /* renamed from: b */
        public C8885a m28197b() {
            return new C8885a(this.f33637a, Collections.unmodifiableList(this.f33638b), this.f33639c, this.f33640d);
        }

        /* renamed from: c */
        public a m28198c(String str) {
            this.f33640d = str;
            return this;
        }

        /* renamed from: d */
        public a m28199d(C8886b c8886b) {
            this.f33639c = c8886b;
            return this;
        }

        /* renamed from: e */
        public a m28200e(C8890f c8890f) {
            this.f33637a = c8890f;
            return this;
        }
    }

    C8885a(C8890f c8890f, List<C8888d> list, C8886b c8886b, String str) {
        this.f33633b = c8890f;
        this.f33634c = list;
        this.f33635d = c8886b;
        this.f33636e = str;
    }

    /* renamed from: e */
    public static a m28190e() {
        return new a();
    }

    @InterfaceC8344f(tag = 4)
    /* renamed from: a */
    public String m28191a() {
        return this.f33636e;
    }

    @InterfaceC8344f(tag = 3)
    /* renamed from: b */
    public C8886b m28192b() {
        return this.f33635d;
    }

    @InterfaceC8344f(tag = 2)
    /* renamed from: c */
    public List<C8888d> m28193c() {
        return this.f33634c;
    }

    @InterfaceC8344f(tag = 1)
    /* renamed from: d */
    public C8890f m28194d() {
        return this.f33633b;
    }

    /* renamed from: f */
    public byte[] m28195f() {
        return AbstractC8871n.m28165a(this);
    }
}
