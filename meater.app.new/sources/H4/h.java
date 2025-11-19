package H4;

import android.database.Cursor;
import androidx.room.F;
import androidx.room.w;
import androidx.room.z;
import com.apptionlabs.meater_app.model.OldCookID;
import java.util.Collections;
import java.util.List;
import s3.C4474a;
import s3.C4475b;

/* compiled from: OldCookIDDAO_Impl.java */
/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    private final w f5530a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.room.k<OldCookID> f5531b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.room.j<OldCookID> f5532c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.room.j<OldCookID> f5533d;

    /* renamed from: e, reason: collision with root package name */
    private final F f5534e;

    /* compiled from: OldCookIDDAO_Impl.java */
    class a extends androidx.room.k<OldCookID> {
        a(h hVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        protected String e() {
            return "INSERT OR REPLACE INTO `OldCookID` (`cookID`,`seqNum`) VALUES (?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.k
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(u3.k kVar, OldCookID oldCookID) {
            kVar.s0(1, oldCookID.cookId);
            kVar.s0(2, oldCookID.sequenceNumber);
        }
    }

    /* compiled from: OldCookIDDAO_Impl.java */
    class b extends androidx.room.j<OldCookID> {
        b(h hVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        protected String e() {
            return "DELETE FROM `OldCookID` WHERE `cookID` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(u3.k kVar, OldCookID oldCookID) {
            kVar.s0(1, oldCookID.cookId);
        }
    }

    /* compiled from: OldCookIDDAO_Impl.java */
    class c extends androidx.room.j<OldCookID> {
        c(h hVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        protected String e() {
            return "UPDATE OR ABORT `OldCookID` SET `cookID` = ?,`seqNum` = ? WHERE `cookID` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(u3.k kVar, OldCookID oldCookID) {
            kVar.s0(1, oldCookID.cookId);
            kVar.s0(2, oldCookID.sequenceNumber);
            kVar.s0(3, oldCookID.cookId);
        }
    }

    /* compiled from: OldCookIDDAO_Impl.java */
    class d extends F {
        d(h hVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        public String e() {
            return "delete from OldCookID";
        }
    }

    public h(w wVar) {
        this.f5530a = wVar;
        this.f5531b = new a(this, wVar);
        this.f5532c = new b(this, wVar);
        this.f5533d = new c(this, wVar);
        this.f5534e = new d(this, wVar);
    }

    public static List<Class<?>> e() {
        return Collections.emptyList();
    }

    @Override // H4.g
    public void a() {
        this.f5530a.assertNotSuspendingTransaction();
        u3.k kVarB = this.f5534e.b();
        try {
            this.f5530a.beginTransaction();
            try {
                kVarB.R();
                this.f5530a.setTransactionSuccessful();
            } finally {
                this.f5530a.endTransaction();
            }
        } finally {
            this.f5534e.h(kVarB);
        }
    }

    @Override // H4.g
    public OldCookID b(long j10, int i10) {
        z zVarC = z.c("SELECT * FROM OldCookID WHERE cookId = ? AND seqNum <= ?", 2);
        zVarC.s0(1, j10);
        zVarC.s0(2, i10);
        this.f5530a.assertNotSuspendingTransaction();
        OldCookID oldCookID = null;
        Cursor cursorB = C4475b.b(this.f5530a, zVarC, false, null);
        try {
            int iD = C4474a.d(cursorB, "cookID");
            int iD2 = C4474a.d(cursorB, "seqNum");
            if (cursorB.moveToFirst()) {
                oldCookID = new OldCookID();
                oldCookID.cookId = cursorB.getLong(iD);
                oldCookID.sequenceNumber = cursorB.getInt(iD2);
            }
            return oldCookID;
        } finally {
            cursorB.close();
            zVarC.f();
        }
    }

    @Override // H4.g
    public void c(OldCookID oldCookID) {
        this.f5530a.assertNotSuspendingTransaction();
        this.f5530a.beginTransaction();
        try {
            this.f5531b.j(oldCookID);
            this.f5530a.setTransactionSuccessful();
        } finally {
            this.f5530a.endTransaction();
        }
    }

    @Override // H4.g
    public OldCookID d(long j10) {
        z zVarC = z.c("SELECT * FROM OldCookID WHERE cookId = ?", 1);
        zVarC.s0(1, j10);
        this.f5530a.assertNotSuspendingTransaction();
        OldCookID oldCookID = null;
        Cursor cursorB = C4475b.b(this.f5530a, zVarC, false, null);
        try {
            int iD = C4474a.d(cursorB, "cookID");
            int iD2 = C4474a.d(cursorB, "seqNum");
            if (cursorB.moveToFirst()) {
                oldCookID = new OldCookID();
                oldCookID.cookId = cursorB.getLong(iD);
                oldCookID.sequenceNumber = cursorB.getInt(iD2);
            }
            return oldCookID;
        } finally {
            cursorB.close();
            zVarC.f();
        }
    }
}
