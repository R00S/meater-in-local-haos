package androidx.work.impl.utils;

import android.database.SQLException;
import androidx.work.C0817x;
import androidx.work.InterfaceC0810q;
import androidx.work.impl.C0725c;
import androidx.work.impl.C0728f;
import androidx.work.impl.C0737j;
import androidx.work.impl.InterfaceC0727e;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p016n.InterfaceC0761b;
import androidx.work.impl.p016n.InterfaceC0776q;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* compiled from: CancelWorkRunnable.java */
/* renamed from: androidx.work.impl.utils.a */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC0782a implements Runnable {

    /* renamed from: f */
    private final C0725c f4859f = new C0725c();

    /* compiled from: CancelWorkRunnable.java */
    /* renamed from: androidx.work.impl.utils.a$a */
    class a extends AbstractRunnableC0782a {

        /* renamed from: g */
        final /* synthetic */ C0737j f4860g;

        /* renamed from: h */
        final /* synthetic */ UUID f4861h;

        a(C0737j c0737j, UUID uuid) {
            this.f4860g = c0737j;
            this.f4861h = uuid;
        }

        @Override // androidx.work.impl.utils.AbstractRunnableC0782a
        /* renamed from: h */
        void mo5148h() throws SQLException {
            WorkDatabase workDatabaseM4997t = this.f4860g.m4997t();
            workDatabaseM4997t.beginTransaction();
            try {
                m5145a(this.f4860g, this.f4861h.toString());
                workDatabaseM4997t.setTransactionSuccessful();
                workDatabaseM4997t.endTransaction();
                m5147g(this.f4860g);
            } catch (Throwable th) {
                workDatabaseM4997t.endTransaction();
                throw th;
            }
        }
    }

    /* compiled from: CancelWorkRunnable.java */
    /* renamed from: androidx.work.impl.utils.a$b */
    class b extends AbstractRunnableC0782a {

        /* renamed from: g */
        final /* synthetic */ C0737j f4862g;

        /* renamed from: h */
        final /* synthetic */ String f4863h;

        b(C0737j c0737j, String str) {
            this.f4862g = c0737j;
            this.f4863h = str;
        }

        @Override // androidx.work.impl.utils.AbstractRunnableC0782a
        /* renamed from: h */
        void mo5148h() throws SQLException {
            WorkDatabase workDatabaseM4997t = this.f4862g.m4997t();
            workDatabaseM4997t.beginTransaction();
            try {
                Iterator<String> it = workDatabaseM4997t.mo4854j().mo5112o(this.f4863h).iterator();
                while (it.hasNext()) {
                    m5145a(this.f4862g, it.next());
                }
                workDatabaseM4997t.setTransactionSuccessful();
                workDatabaseM4997t.endTransaction();
                m5147g(this.f4862g);
            } catch (Throwable th) {
                workDatabaseM4997t.endTransaction();
                throw th;
            }
        }
    }

    /* compiled from: CancelWorkRunnable.java */
    /* renamed from: androidx.work.impl.utils.a$c */
    class c extends AbstractRunnableC0782a {

        /* renamed from: g */
        final /* synthetic */ C0737j f4864g;

        /* renamed from: h */
        final /* synthetic */ String f4865h;

        /* renamed from: i */
        final /* synthetic */ boolean f4866i;

        c(C0737j c0737j, String str, boolean z) {
            this.f4864g = c0737j;
            this.f4865h = str;
            this.f4866i = z;
        }

        @Override // androidx.work.impl.utils.AbstractRunnableC0782a
        /* renamed from: h */
        void mo5148h() throws SQLException {
            WorkDatabase workDatabaseM4997t = this.f4864g.m4997t();
            workDatabaseM4997t.beginTransaction();
            try {
                Iterator<String> it = workDatabaseM4997t.mo4854j().mo5108k(this.f4865h).iterator();
                while (it.hasNext()) {
                    m5145a(this.f4864g, it.next());
                }
                workDatabaseM4997t.setTransactionSuccessful();
                workDatabaseM4997t.endTransaction();
                if (this.f4866i) {
                    m5147g(this.f4864g);
                }
            } catch (Throwable th) {
                workDatabaseM4997t.endTransaction();
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static AbstractRunnableC0782a m5141b(UUID uuid, C0737j c0737j) {
        return new a(c0737j, uuid);
    }

    /* renamed from: c */
    public static AbstractRunnableC0782a m5142c(String str, C0737j c0737j, boolean z) {
        return new c(c0737j, str, z);
    }

    /* renamed from: d */
    public static AbstractRunnableC0782a m5143d(String str, C0737j c0737j) {
        return new b(c0737j, str);
    }

    /* renamed from: f */
    private void m5144f(WorkDatabase workDatabase, String str) {
        InterfaceC0776q interfaceC0776qMo4854j = workDatabase.mo4854j();
        InterfaceC0761b interfaceC0761bMo4849b = workDatabase.mo4849b();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            C0817x.a aVarMo5109l = interfaceC0776qMo4854j.mo5109l(str2);
            if (aVarMo5109l != C0817x.a.SUCCEEDED && aVarMo5109l != C0817x.a.FAILED) {
                interfaceC0776qMo4854j.mo5098a(C0817x.a.CANCELLED, str2);
            }
            linkedList.addAll(interfaceC0761bMo4849b.mo5072b(str2));
        }
    }

    /* renamed from: a */
    void m5145a(C0737j c0737j, String str) {
        m5144f(c0737j.m4997t(), str);
        c0737j.m4995r().m4939l(str);
        Iterator<InterfaceC0727e> it = c0737j.m4996s().iterator();
        while (it.hasNext()) {
            it.next().cancel(str);
        }
    }

    /* renamed from: e */
    public InterfaceC0810q m5146e() {
        return this.f4859f;
    }

    /* renamed from: g */
    void m5147g(C0737j c0737j) throws SQLException {
        C0728f.m4943b(c0737j.m4993n(), c0737j.m4997t(), c0737j.m4996s());
    }

    /* renamed from: h */
    abstract void mo5148h();

    @Override // java.lang.Runnable
    public void run() {
        try {
            mo5148h();
            this.f4859f.m4927a(InterfaceC0810q.f4983a);
        } catch (Throwable th) {
            this.f4859f.m4927a(new InterfaceC0810q.b.a(th));
        }
    }
}
