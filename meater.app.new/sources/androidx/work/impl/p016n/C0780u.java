package androidx.work.impl.p016n;

import android.database.Cursor;
import android.database.SQLException;
import androidx.room.AbstractC0644c;
import androidx.room.AbstractC0651j;
import androidx.room.C0654m;
import androidx.room.p010t.C0663c;
import java.util.ArrayList;
import java.util.List;
import p024c.p082u.p083a.InterfaceC1012f;

/* compiled from: WorkTagDao_Impl.java */
/* renamed from: androidx.work.impl.n.u */
/* loaded from: classes.dex */
public final class C0780u implements InterfaceC0779t {

    /* renamed from: a */
    private final AbstractC0651j f4846a;

    /* renamed from: b */
    private final AbstractC0644c<C0778s> f4847b;

    /* compiled from: WorkTagDao_Impl.java */
    /* renamed from: androidx.work.impl.n.u$a */
    class a extends AbstractC0644c<C0778s> {
        a(AbstractC0651j abstractC0651j) {
            super(abstractC0651j);
        }

        @Override // androidx.room.AbstractC0644c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC1012f interfaceC1012f, C0778s c0778s) {
            String str = c0778s.f4844a;
            if (str == null) {
                interfaceC1012f.mo4646I0(1);
            } else {
                interfaceC1012f.mo4654w(1, str);
            }
            String str2 = c0778s.f4845b;
            if (str2 == null) {
                interfaceC1012f.mo4646I0(2);
            } else {
                interfaceC1012f.mo4654w(2, str2);
            }
        }

        @Override // androidx.room.AbstractC0658q
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public C0780u(AbstractC0651j abstractC0651j) {
        this.f4846a = abstractC0651j;
        this.f4847b = new a(abstractC0651j);
    }

    @Override // androidx.work.impl.p016n.InterfaceC0779t
    /* renamed from: a */
    public void mo5119a(C0778s c0778s) throws SQLException {
        this.f4846a.assertNotSuspendingTransaction();
        this.f4846a.beginTransaction();
        try {
            this.f4847b.insert((AbstractC0644c<C0778s>) c0778s);
            this.f4846a.setTransactionSuccessful();
        } finally {
            this.f4846a.endTransaction();
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0779t
    /* renamed from: b */
    public List<String> mo5120b(String str) {
        C0654m c0654mM4644c = C0654m.m4644c("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            c0654mM4644c.mo4646I0(1);
        } else {
            c0654mM4644c.mo4654w(1, str);
        }
        this.f4846a.assertNotSuspendingTransaction();
        Cursor cursorM4675b = C0663c.m4675b(this.f4846a, c0654mM4644c, false, null);
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
}
