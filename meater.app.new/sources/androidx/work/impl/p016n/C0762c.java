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

/* compiled from: DependencyDao_Impl.java */
/* renamed from: androidx.work.impl.n.c */
/* loaded from: classes.dex */
public final class C0762c implements InterfaceC0761b {

    /* renamed from: a */
    private final AbstractC0651j f4768a;

    /* renamed from: b */
    private final AbstractC0644c<C0760a> f4769b;

    /* compiled from: DependencyDao_Impl.java */
    /* renamed from: androidx.work.impl.n.c$a */
    class a extends AbstractC0644c<C0760a> {
        a(AbstractC0651j abstractC0651j) {
            super(abstractC0651j);
        }

        @Override // androidx.room.AbstractC0644c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC1012f interfaceC1012f, C0760a c0760a) {
            String str = c0760a.f4766a;
            if (str == null) {
                interfaceC1012f.mo4646I0(1);
            } else {
                interfaceC1012f.mo4654w(1, str);
            }
            String str2 = c0760a.f4767b;
            if (str2 == null) {
                interfaceC1012f.mo4646I0(2);
            } else {
                interfaceC1012f.mo4654w(2, str2);
            }
        }

        @Override // androidx.room.AbstractC0658q
        public String createQuery() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }
    }

    public C0762c(AbstractC0651j abstractC0651j) {
        this.f4768a = abstractC0651j;
        this.f4769b = new a(abstractC0651j);
    }

    @Override // androidx.work.impl.p016n.InterfaceC0761b
    /* renamed from: a */
    public void mo5071a(C0760a c0760a) throws SQLException {
        this.f4768a.assertNotSuspendingTransaction();
        this.f4768a.beginTransaction();
        try {
            this.f4769b.insert((AbstractC0644c<C0760a>) c0760a);
            this.f4768a.setTransactionSuccessful();
        } finally {
            this.f4768a.endTransaction();
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0761b
    /* renamed from: b */
    public List<String> mo5072b(String str) {
        C0654m c0654mM4644c = C0654m.m4644c("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            c0654mM4644c.mo4646I0(1);
        } else {
            c0654mM4644c.mo4654w(1, str);
        }
        this.f4768a.assertNotSuspendingTransaction();
        Cursor cursorM4675b = C0663c.m4675b(this.f4768a, c0654mM4644c, false, null);
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

    @Override // androidx.work.impl.p016n.InterfaceC0761b
    /* renamed from: c */
    public boolean mo5073c(String str) {
        C0654m c0654mM4644c = C0654m.m4644c("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            c0654mM4644c.mo4646I0(1);
        } else {
            c0654mM4644c.mo4654w(1, str);
        }
        this.f4768a.assertNotSuspendingTransaction();
        boolean z = false;
        Cursor cursorM4675b = C0663c.m4675b(this.f4768a, c0654mM4644c, false, null);
        try {
            if (cursorM4675b.moveToFirst()) {
                z = cursorM4675b.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorM4675b.close();
            c0654mM4644c.m4651f();
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0761b
    /* renamed from: d */
    public boolean mo5074d(String str) {
        C0654m c0654mM4644c = C0654m.m4644c("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            c0654mM4644c.mo4646I0(1);
        } else {
            c0654mM4644c.mo4654w(1, str);
        }
        this.f4768a.assertNotSuspendingTransaction();
        boolean z = false;
        Cursor cursorM4675b = C0663c.m4675b(this.f4768a, c0654mM4644c, false, null);
        try {
            if (cursorM4675b.moveToFirst()) {
                z = cursorM4675b.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorM4675b.close();
            c0654mM4644c.m4651f();
        }
    }
}
