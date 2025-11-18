package p241e.p307h.p308a.p311g0;

import android.text.TextUtils;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p241e.p307h.p308a.p309e0.C9003d;
import p241e.p307h.p308a.p309e0.InterfaceC9001b;
import p241e.p307h.p308a.p311g0.C9012b;
import p241e.p307h.p308a.p315k0.C9034d;
import p241e.p307h.p308a.p315k0.C9036f;

/* compiled from: ConnectTask.java */
/* renamed from: e.h.a.g0.a */
/* loaded from: classes2.dex */
public class C9011a {

    /* renamed from: a */
    final int f34662a;

    /* renamed from: b */
    final String f34663b;

    /* renamed from: c */
    final FileDownloadHeader f34664c;

    /* renamed from: d */
    private C9012b f34665d;

    /* renamed from: e */
    private String f34666e;

    /* renamed from: f */
    private Map<String, List<String>> f34667f;

    /* renamed from: g */
    private List<String> f34668g;

    /* compiled from: ConnectTask.java */
    /* renamed from: e.h.a.g0.a$b */
    static class b {

        /* renamed from: a */
        private Integer f34669a;

        /* renamed from: b */
        private String f34670b;

        /* renamed from: c */
        private String f34671c;

        /* renamed from: d */
        private FileDownloadHeader f34672d;

        /* renamed from: e */
        private C9012b f34673e;

        b() {
        }

        /* renamed from: a */
        C9011a m28774a() {
            C9012b c9012b;
            Integer num = this.f34669a;
            if (num == null || (c9012b = this.f34673e) == null || this.f34670b == null) {
                throw new IllegalArgumentException();
            }
            return new C9011a(c9012b, num.intValue(), this.f34670b, this.f34671c, this.f34672d);
        }

        /* renamed from: b */
        public b m28775b(C9012b c9012b) {
            this.f34673e = c9012b;
            return this;
        }

        /* renamed from: c */
        public b m28776c(int i2) {
            this.f34669a = Integer.valueOf(i2);
            return this;
        }

        /* renamed from: d */
        public b m28777d(String str) {
            this.f34671c = str;
            return this;
        }

        /* renamed from: e */
        public b m28778e(FileDownloadHeader fileDownloadHeader) {
            this.f34672d = fileDownloadHeader;
            return this;
        }

        /* renamed from: f */
        public b m28779f(String str) {
            this.f34670b = str;
            return this;
        }
    }

    /* renamed from: a */
    private void m28765a(InterfaceC9001b interfaceC9001b) throws ProtocolException {
        if (interfaceC9001b.mo27912c(this.f34666e, this.f34665d.f34674a)) {
            return;
        }
        if (!TextUtils.isEmpty(this.f34666e)) {
            interfaceC9001b.mo27915f("If-Match", this.f34666e);
        }
        this.f34665d.m28780a(interfaceC9001b);
    }

    /* renamed from: b */
    private void m28766b(InterfaceC9001b interfaceC9001b) {
        HashMap<String, List<String>> mapM27552b;
        FileDownloadHeader fileDownloadHeader = this.f34664c;
        if (fileDownloadHeader == null || (mapM27552b = fileDownloadHeader.m27552b()) == null) {
            return;
        }
        if (C9034d.f34819a) {
            C9034d.m28969h(this, "%d add outside header: %s", Integer.valueOf(this.f34662a), mapM27552b);
        }
        for (Map.Entry<String, List<String>> entry : mapM27552b.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if (value != null) {
                Iterator<String> it = value.iterator();
                while (it.hasNext()) {
                    interfaceC9001b.mo27915f(key, it.next());
                }
            }
        }
    }

    /* renamed from: d */
    private void m28767d(InterfaceC9001b interfaceC9001b) {
        FileDownloadHeader fileDownloadHeader = this.f34664c;
        if (fileDownloadHeader == null || fileDownloadHeader.m27552b().get("User-Agent") == null) {
            interfaceC9001b.mo27915f("User-Agent", C9036f.m28998d());
        }
    }

    /* renamed from: c */
    InterfaceC9001b m28768c() throws IllegalAccessException, IOException {
        InterfaceC9001b interfaceC9001bM28792a = C9013c.m28789j().m28792a(this.f34663b);
        m28766b(interfaceC9001bM28792a);
        m28765a(interfaceC9001bM28792a);
        m28767d(interfaceC9001bM28792a);
        this.f34667f = interfaceC9001bM28792a.mo27918i();
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "<---- %s request header %s", Integer.valueOf(this.f34662a), this.f34667f);
        }
        interfaceC9001bM28792a.execute();
        ArrayList arrayList = new ArrayList();
        this.f34668g = arrayList;
        InterfaceC9001b interfaceC9001bM28723c = C9003d.m28723c(this.f34667f, interfaceC9001bM28792a, arrayList);
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "----> %s response header %s", Integer.valueOf(this.f34662a), interfaceC9001bM28723c.mo27911b());
        }
        return interfaceC9001bM28723c;
    }

    /* renamed from: e */
    String m28769e() {
        List<String> list = this.f34668g;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.f34668g.get(r0.size() - 1);
    }

    /* renamed from: f */
    public C9012b m28770f() {
        return this.f34665d;
    }

    /* renamed from: g */
    public Map<String, List<String>> m28771g() {
        return this.f34667f;
    }

    /* renamed from: h */
    boolean m28772h() {
        return this.f34665d.f34675b > 0;
    }

    /* renamed from: i */
    void m28773i(long j2) {
        C9012b c9012b = this.f34665d;
        long j3 = c9012b.f34675b;
        if (j2 == j3) {
            C9034d.m28970i(this, "no data download, no need to update", new Object[0]);
            return;
        }
        C9012b c9012bM28782b = C9012b.b.m28782b(c9012b.f34674a, j2, c9012b.f34676c, c9012b.f34677d - (j2 - j3));
        this.f34665d = c9012bM28782b;
        if (C9034d.f34819a) {
            C9034d.m28966e(this, "after update profile:%s", c9012bM28782b);
        }
    }

    private C9011a(C9012b c9012b, int i2, String str, String str2, FileDownloadHeader fileDownloadHeader) {
        this.f34662a = i2;
        this.f34663b = str;
        this.f34666e = str2;
        this.f34664c = fileDownloadHeader;
        this.f34665d = c9012b;
    }
}
