package p024c.p073p.p075b;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p024c.p052i.p059j.C0952b;

/* compiled from: Loader.java */
/* renamed from: c.p.b.b */
/* loaded from: classes.dex */
public class C0995b<D> {

    /* renamed from: a */
    int f6552a;

    /* renamed from: b */
    b<D> f6553b;

    /* renamed from: c */
    a<D> f6554c;

    /* renamed from: d */
    Context f6555d;

    /* renamed from: e */
    boolean f6556e = false;

    /* renamed from: f */
    boolean f6557f = false;

    /* renamed from: g */
    boolean f6558g = true;

    /* renamed from: h */
    boolean f6559h = false;

    /* renamed from: i */
    boolean f6560i = false;

    /* compiled from: Loader.java */
    /* renamed from: c.p.b.b$a */
    public interface a<D> {
        /* renamed from: a */
        void m6330a(C0995b<D> c0995b);
    }

    /* compiled from: Loader.java */
    /* renamed from: c.p.b.b$b */
    public interface b<D> {
        /* renamed from: a */
        void mo6280a(C0995b<D> c0995b, D d2);
    }

    public C0995b(Context context) {
        this.f6555d = context.getApplicationContext();
    }

    /* renamed from: b */
    public void m6311b() {
        this.f6557f = true;
        m6319k();
    }

    /* renamed from: c */
    public boolean m6312c() {
        return mo6302l();
    }

    /* renamed from: d */
    public void m6313d() {
        this.f6560i = false;
    }

    /* renamed from: e */
    public String m6314e(D d2) {
        StringBuilder sb = new StringBuilder(64);
        C0952b.m6054a(d2, sb);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: f */
    public void m6315f() {
        a<D> aVar = this.f6554c;
        if (aVar != null) {
            aVar.m6330a(this);
        }
    }

    /* renamed from: g */
    public void m6316g(D d2) {
        b<D> bVar = this.f6553b;
        if (bVar != null) {
            bVar.mo6280a(this, d2);
        }
    }

    @Deprecated
    /* renamed from: h */
    public void mo6301h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f6552a);
        printWriter.print(" mListener=");
        printWriter.println(this.f6553b);
        if (this.f6556e || this.f6559h || this.f6560i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f6556e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f6559h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f6560i);
        }
        if (this.f6557f || this.f6558g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f6557f);
            printWriter.print(" mReset=");
            printWriter.println(this.f6558g);
        }
    }

    /* renamed from: i */
    public void m6317i() {
        mo6303n();
    }

    /* renamed from: j */
    public boolean m6318j() {
        return this.f6557f;
    }

    /* renamed from: k */
    protected void m6319k() {
    }

    /* renamed from: l */
    protected boolean mo6302l() {
        throw null;
    }

    /* renamed from: m */
    public void m6320m() {
        if (this.f6556e) {
            m6317i();
        } else {
            this.f6559h = true;
        }
    }

    /* renamed from: n */
    protected void mo6303n() {
    }

    /* renamed from: o */
    protected void m6321o() {
    }

    /* renamed from: p */
    protected void mo6322p() {
        throw null;
    }

    /* renamed from: q */
    protected void m6323q() {
    }

    /* renamed from: r */
    public void m6324r(int i2, b<D> bVar) {
        if (this.f6553b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f6553b = bVar;
        this.f6552a = i2;
    }

    /* renamed from: s */
    public void m6325s() {
        m6321o();
        this.f6558g = true;
        this.f6556e = false;
        this.f6557f = false;
        this.f6559h = false;
        this.f6560i = false;
    }

    /* renamed from: t */
    public void m6326t() {
        if (this.f6560i) {
            m6320m();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C0952b.m6054a(this, sb);
        sb.append(" id=");
        sb.append(this.f6552a);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u */
    public final void m6327u() {
        this.f6556e = true;
        this.f6558g = false;
        this.f6557f = false;
        mo6322p();
    }

    /* renamed from: v */
    public void m6328v() {
        this.f6556e = false;
        m6323q();
    }

    /* renamed from: w */
    public void m6329w(b<D> bVar) {
        b<D> bVar2 = this.f6553b;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (bVar2 != bVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f6553b = null;
    }
}
