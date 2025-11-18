package p345i.p346a.p347g.p349t;

import com.google.android.gms.ads.AdRequest;
import java.io.IOException;
import java.util.TimerTask;
import p345i.p346a.p347g.AbstractC9195h;
import p345i.p346a.p347g.C9190c;
import p345i.p346a.p347g.C9193f;
import p345i.p346a.p347g.C9194g;
import p345i.p346a.p347g.C9199l;

/* compiled from: DNSTask.java */
/* renamed from: i.a.g.t.a */
/* loaded from: classes2.dex */
public abstract class AbstractC9213a extends TimerTask {

    /* renamed from: f */
    private final C9199l f35596f;

    protected AbstractC9213a(C9199l c9199l) {
        this.f35596f = c9199l;
    }

    /* renamed from: a */
    public C9193f m29767a(C9193f c9193f, C9190c c9190c, AbstractC9195h abstractC9195h) throws IOException {
        try {
            c9193f.m29513x(c9190c, abstractC9195h);
            return c9193f;
        } catch (IOException unused) {
            int iM29488e = c9193f.m29488e();
            boolean zM29498o = c9193f.m29498o();
            int iM29511E = c9193f.m29511E();
            int iM29489f = c9193f.m29489f();
            c9193f.m29505v(iM29488e | AdRequest.MAX_CONTENT_URL_LENGTH);
            c9193f.m29506w(iM29489f);
            this.f35596f.m29686x1(c9193f);
            C9193f c9193f2 = new C9193f(iM29488e, zM29498o, iM29511E);
            c9193f2.m29513x(c9190c, abstractC9195h);
            return c9193f2;
        }
    }

    /* renamed from: b */
    public C9193f m29768b(C9193f c9193f, AbstractC9195h abstractC9195h, long j2) throws IOException {
        try {
            c9193f.m29514y(abstractC9195h, j2);
            return c9193f;
        } catch (IOException unused) {
            int iM29488e = c9193f.m29488e();
            boolean zM29498o = c9193f.m29498o();
            int iM29511E = c9193f.m29511E();
            int iM29489f = c9193f.m29489f();
            c9193f.m29505v(iM29488e | AdRequest.MAX_CONTENT_URL_LENGTH);
            c9193f.m29506w(iM29489f);
            this.f35596f.m29686x1(c9193f);
            C9193f c9193f2 = new C9193f(iM29488e, zM29498o, iM29511E);
            c9193f2.m29514y(abstractC9195h, j2);
            return c9193f2;
        }
    }

    /* renamed from: c */
    public C9193f m29769c(C9193f c9193f, AbstractC9195h abstractC9195h) throws IOException {
        try {
            c9193f.m29515z(abstractC9195h);
            return c9193f;
        } catch (IOException unused) {
            int iM29488e = c9193f.m29488e();
            boolean zM29498o = c9193f.m29498o();
            int iM29511E = c9193f.m29511E();
            int iM29489f = c9193f.m29489f();
            c9193f.m29505v(iM29488e | AdRequest.MAX_CONTENT_URL_LENGTH);
            c9193f.m29506w(iM29489f);
            this.f35596f.m29686x1(c9193f);
            C9193f c9193f2 = new C9193f(iM29488e, zM29498o, iM29511E);
            c9193f2.m29515z(abstractC9195h);
            return c9193f2;
        }
    }

    /* renamed from: d */
    public C9193f m29770d(C9193f c9193f, C9194g c9194g) throws IOException {
        try {
            c9193f.m29507A(c9194g);
            return c9193f;
        } catch (IOException unused) {
            int iM29488e = c9193f.m29488e();
            boolean zM29498o = c9193f.m29498o();
            int iM29511E = c9193f.m29511E();
            int iM29489f = c9193f.m29489f();
            c9193f.m29505v(iM29488e | AdRequest.MAX_CONTENT_URL_LENGTH);
            c9193f.m29506w(iM29489f);
            this.f35596f.m29686x1(c9193f);
            C9193f c9193f2 = new C9193f(iM29488e, zM29498o, iM29511E);
            c9193f2.m29507A(c9194g);
            return c9193f2;
        }
    }

    /* renamed from: e */
    public C9199l m29771e() {
        return this.f35596f;
    }

    /* renamed from: f */
    public abstract String mo29772f();

    public String toString() {
        return mo29772f();
    }
}
