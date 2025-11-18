package androidx.work.impl.p016n;

import android.database.Cursor;
import android.database.SQLException;
import androidx.room.AbstractC0644c;
import androidx.room.AbstractC0651j;
import androidx.room.AbstractC0658q;
import androidx.room.C0654m;
import androidx.room.p010t.C0662b;
import androidx.room.p010t.C0663c;
import java.util.ArrayList;
import java.util.List;
import p024c.p082u.p083a.InterfaceC1012f;

/* compiled from: SystemIdInfoDao_Impl.java */
/* renamed from: androidx.work.impl.n.i */
/* loaded from: classes.dex */
public final class C0768i implements InterfaceC0767h {

    /* renamed from: a */
    private final AbstractC0651j f4778a;

    /* renamed from: b */
    private final AbstractC0644c<C0766g> f4779b;

    /* renamed from: c */
    private final AbstractC0658q f4780c;

    /* compiled from: SystemIdInfoDao_Impl.java */
    /* renamed from: androidx.work.impl.n.i$a */
    class a extends AbstractC0644c<C0766g> {
        a(AbstractC0651j abstractC0651j) {
            super(abstractC0651j);
        }

        @Override // androidx.room.AbstractC0644c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC1012f interfaceC1012f, C0766g c0766g) {
            String str = c0766g.f4776a;
            if (str == null) {
                interfaceC1012f.mo4646I0(1);
            } else {
                interfaceC1012f.mo4654w(1, str);
            }
            interfaceC1012f.mo4652h0(2, c0766g.f4777b);
        }

        @Override // androidx.room.AbstractC0658q
        public String createQuery() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }
    }

    /* compiled from: SystemIdInfoDao_Impl.java */
    /* renamed from: androidx.work.impl.n.i$b */
    class b extends AbstractC0658q {
        b(AbstractC0651j abstractC0651j) {
            super(abstractC0651j);
        }

        @Override // androidx.room.AbstractC0658q
        public String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public C0768i(AbstractC0651j abstractC0651j) {
        this.f4778a = abstractC0651j;
        this.f4779b = new a(abstractC0651j);
        this.f4780c = new b(abstractC0651j);
    }

    @Override // androidx.work.impl.p016n.InterfaceC0767h
    /* renamed from: a */
    public List<String> mo5079a() {
        C0654m c0654mM4644c = C0654m.m4644c("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f4778a.assertNotSuspendingTransaction();
        Cursor cursorM4675b = C0663c.m4675b(this.f4778a, c0654mM4644c, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM4675b.getCount());
            while (cursorM4675b.moveToNext()) {
                arrayList.add(cursorM4675b.getString(0));
            }
            return arrayList;
        } finally {
            cursorM4675b.close();
            c0654mM4644c.m4651f();
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0767h
    /* renamed from: b */
    public void mo5080b(C0766g c0766g) throws SQLException {
        this.f4778a.assertNotSuspendingTransaction();
        this.f4778a.beginTransaction();
        try {
            this.f4779b.insert((AbstractC0644c<C0766g>) c0766g);
            this.f4778a.setTransactionSuccessful();
        } finally {
            this.f4778a.endTransaction();
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0767h
    /* renamed from: c */
    public C0766g mo5081c(String str) {
        C0654m c0654mM4644c = C0654m.m4644c("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            c0654mM4644c.mo4646I0(1);
        } else {
            c0654mM4644c.mo4654w(1, str);
        }
        this.f4778a.assertNotSuspendingTransaction();
        Cursor cursorM4675b = C0663c.m4675b(this.f4778a, c0654mM4644c, false, null);
        try {
            return cursorM4675b.moveToFirst() ? new C0766g(cursorM4675b.getString(C0662b.m4673b(cursorM4675b, "work_spec_id")), cursorM4675b.getInt(C0662b.m4673b(cursorM4675b, "system_id"))) : null;
        } finally {
            cursorM4675b.close();
            c0654mM4644c.m4651f();
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0767h
    /* renamed from: d */
    public void mo5082d(String str) throws SQLException {
        this.f4778a.assertNotSuspendingTransaction();
        InterfaceC1012f interfaceC1012fAcquire = this.f4780c.acquire();
        if (str == null) {
            interfaceC1012fAcquire.mo4646I0(1);
        } else {
            interfaceC1012fAcquire.mo4654w(1, str);
        }
        this.f4778a.beginTransaction();
        try {
            interfaceC1012fAcquire.mo6470E();
            this.f4778a.setTransactionSuccessful();
        } finally {
            this.f4778a.endTransaction();
            this.f4780c.release(interfaceC1012fAcquire);
        }
    }
}
