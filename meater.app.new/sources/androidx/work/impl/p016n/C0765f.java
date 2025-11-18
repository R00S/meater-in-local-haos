package androidx.work.impl.p016n;

import android.database.Cursor;
import android.database.SQLException;
import androidx.room.AbstractC0644c;
import androidx.room.AbstractC0651j;
import androidx.room.C0654m;
import androidx.room.p010t.C0663c;
import p024c.p082u.p083a.InterfaceC1012f;

/* compiled from: PreferenceDao_Impl.java */
/* renamed from: androidx.work.impl.n.f */
/* loaded from: classes.dex */
public final class C0765f implements InterfaceC0764e {

    /* renamed from: a */
    private final AbstractC0651j f4773a;

    /* renamed from: b */
    private final AbstractC0644c<C0763d> f4774b;

    /* compiled from: PreferenceDao_Impl.java */
    /* renamed from: androidx.work.impl.n.f$a */
    class a extends AbstractC0644c<C0763d> {
        a(AbstractC0651j abstractC0651j) {
            super(abstractC0651j);
        }

        @Override // androidx.room.AbstractC0644c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC1012f interfaceC1012f, C0763d c0763d) {
            String str = c0763d.f4771a;
            if (str == null) {
                interfaceC1012f.mo4646I0(1);
            } else {
                interfaceC1012f.mo4654w(1, str);
            }
            Long l = c0763d.f4772b;
            if (l == null) {
                interfaceC1012f.mo4646I0(2);
            } else {
                interfaceC1012f.mo4652h0(2, l.longValue());
            }
        }

        @Override // androidx.room.AbstractC0658q
        public String createQuery() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }
    }

    public C0765f(AbstractC0651j abstractC0651j) {
        this.f4773a = abstractC0651j;
        this.f4774b = new a(abstractC0651j);
    }

    @Override // androidx.work.impl.p016n.InterfaceC0764e
    /* renamed from: a */
    public Long mo5076a(String str) {
        C0654m c0654mM4644c = C0654m.m4644c("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            c0654mM4644c.mo4646I0(1);
        } else {
            c0654mM4644c.mo4654w(1, str);
        }
        this.f4773a.assertNotSuspendingTransaction();
        Long lValueOf = null;
        Cursor cursorM4675b = C0663c.m4675b(this.f4773a, c0654mM4644c, false, null);
        try {
            if (cursorM4675b.moveToFirst() && !cursorM4675b.isNull(0)) {
                lValueOf = Long.valueOf(cursorM4675b.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorM4675b.close();
            c0654mM4644c.m4651f();
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0764e
    /* renamed from: b */
    public void mo5077b(C0763d c0763d) throws SQLException {
        this.f4773a.assertNotSuspendingTransaction();
        this.f4773a.beginTransaction();
        try {
            this.f4774b.insert((AbstractC0644c<C0763d>) c0763d);
            this.f4773a.setTransactionSuccessful();
        } finally {
            this.f4773a.endTransaction();
        }
    }
}
