package H4;

import android.database.Cursor;
import androidx.room.F;
import androidx.room.w;
import androidx.room.z;
import com.apptionlabs.meater_app.model.CookNote;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s3.C4474a;
import s3.C4475b;

/* compiled from: CookNoteDAO_Impl.java */
/* loaded from: classes.dex */
public final class d implements H4.c {

    /* renamed from: a, reason: collision with root package name */
    private final w f5512a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.room.k<CookNote> f5513b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.room.j<CookNote> f5514c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.room.j<CookNote> f5515d;

    /* renamed from: e, reason: collision with root package name */
    private final F f5516e;

    /* renamed from: f, reason: collision with root package name */
    private final F f5517f;

    /* renamed from: g, reason: collision with root package name */
    private final F f5518g;

    /* compiled from: CookNoteDAO_Impl.java */
    class a extends androidx.room.k<CookNote> {
        a(d dVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        protected String e() {
            return "INSERT OR REPLACE INTO `CookNote` (`noteID`,`noteCookId`,`cookId`,`note`,`value`,`timestamp`,`type`,`updated_at`,`needs_uploading`,`needs_deleting`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.k
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(u3.k kVar, CookNote cookNote) {
            kVar.s0(1, cookNote.noteID);
            kVar.s0(2, cookNote.noteCookId);
            kVar.J(3, cookNote.cookId);
            kVar.J(4, cookNote.note);
            kVar.s0(5, cookNote.value);
            kVar.Y(6, cookNote.timestamp);
            kVar.s0(7, cookNote.type);
            kVar.s0(8, cookNote.updatedAt);
            kVar.s0(9, cookNote.needsUploading ? 1L : 0L);
            kVar.s0(10, cookNote.needsDeleting ? 1L : 0L);
        }
    }

    /* compiled from: CookNoteDAO_Impl.java */
    class b extends androidx.room.j<CookNote> {
        b(d dVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        protected String e() {
            return "DELETE FROM `CookNote` WHERE `noteID` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(u3.k kVar, CookNote cookNote) {
            kVar.s0(1, cookNote.noteID);
        }
    }

    /* compiled from: CookNoteDAO_Impl.java */
    class c extends androidx.room.j<CookNote> {
        c(d dVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        protected String e() {
            return "UPDATE OR ABORT `CookNote` SET `noteID` = ?,`noteCookId` = ?,`cookId` = ?,`note` = ?,`value` = ?,`timestamp` = ?,`type` = ?,`updated_at` = ?,`needs_uploading` = ?,`needs_deleting` = ? WHERE `noteID` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(u3.k kVar, CookNote cookNote) {
            kVar.s0(1, cookNote.noteID);
            kVar.s0(2, cookNote.noteCookId);
            kVar.J(3, cookNote.cookId);
            kVar.J(4, cookNote.note);
            kVar.s0(5, cookNote.value);
            kVar.Y(6, cookNote.timestamp);
            kVar.s0(7, cookNote.type);
            kVar.s0(8, cookNote.updatedAt);
            kVar.s0(9, cookNote.needsUploading ? 1L : 0L);
            kVar.s0(10, cookNote.needsDeleting ? 1L : 0L);
            kVar.s0(11, cookNote.noteID);
        }
    }

    /* compiled from: CookNoteDAO_Impl.java */
    /* renamed from: H4.d$d, reason: collision with other inner class name */
    class C0104d extends F {
        C0104d(d dVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        public String e() {
            return "delete from CookNote";
        }
    }

    /* compiled from: CookNoteDAO_Impl.java */
    class e extends F {
        e(d dVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        public String e() {
            return "delete from CookNote where noteID = ? ";
        }
    }

    /* compiled from: CookNoteDAO_Impl.java */
    class f extends F {
        f(d dVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        public String e() {
            return "delete from CookNote where noteCookId = ? ";
        }
    }

    public d(w wVar) {
        this.f5512a = wVar;
        this.f5513b = new a(this, wVar);
        this.f5514c = new b(this, wVar);
        this.f5515d = new c(this, wVar);
        this.f5516e = new C0104d(this, wVar);
        this.f5517f = new e(this, wVar);
        this.f5518g = new f(this, wVar);
    }

    public static List<Class<?>> l() {
        return Collections.emptyList();
    }

    @Override // H4.c
    public void a() {
        this.f5512a.assertNotSuspendingTransaction();
        u3.k kVarB = this.f5516e.b();
        try {
            this.f5512a.beginTransaction();
            try {
                kVarB.R();
                this.f5512a.setTransactionSuccessful();
            } finally {
                this.f5512a.endTransaction();
            }
        } finally {
            this.f5516e.h(kVarB);
        }
    }

    @Override // H4.c
    public List<CookNote> b(long j10) {
        z zVarC = z.c("SELECT * FROM CookNote WHERE noteCookId = ?  and type != 0 ORDER BY timestamp ASC  ", 1);
        zVarC.s0(1, j10);
        this.f5512a.assertNotSuspendingTransaction();
        Cursor cursorB = C4475b.b(this.f5512a, zVarC, false, null);
        try {
            int iD = C4474a.d(cursorB, "noteID");
            int iD2 = C4474a.d(cursorB, "noteCookId");
            int iD3 = C4474a.d(cursorB, "cookId");
            int iD4 = C4474a.d(cursorB, "note");
            int iD5 = C4474a.d(cursorB, "value");
            int iD6 = C4474a.d(cursorB, "timestamp");
            int iD7 = C4474a.d(cursorB, "type");
            int iD8 = C4474a.d(cursorB, "updated_at");
            int iD9 = C4474a.d(cursorB, "needs_uploading");
            int iD10 = C4474a.d(cursorB, "needs_deleting");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                CookNote cookNote = new CookNote();
                int i10 = iD2;
                cookNote.noteID = cursorB.getLong(iD);
                int i11 = iD;
                cookNote.noteCookId = cursorB.getLong(i10);
                cookNote.cookId = cursorB.getString(iD3);
                cookNote.note = cursorB.getString(iD4);
                cookNote.value = cursorB.getLong(iD5);
                cookNote.timestamp = cursorB.getDouble(iD6);
                cookNote.type = cursorB.getInt(iD7);
                cookNote.updatedAt = cursorB.getLong(iD8);
                cookNote.needsUploading = cursorB.getInt(iD9) != 0;
                cookNote.needsDeleting = cursorB.getInt(iD10) != 0;
                arrayList.add(cookNote);
                iD = i11;
                iD2 = i10;
            }
            return arrayList;
        } finally {
            cursorB.close();
            zVarC.f();
        }
    }

    @Override // H4.c
    public List<CookNote> c() throws Throwable {
        z zVar;
        z zVarC = z.c("SELECT * FROM CookNote", 0);
        this.f5512a.assertNotSuspendingTransaction();
        Cursor cursorB = C4475b.b(this.f5512a, zVarC, false, null);
        try {
            int iD = C4474a.d(cursorB, "noteID");
            int iD2 = C4474a.d(cursorB, "noteCookId");
            int iD3 = C4474a.d(cursorB, "cookId");
            int iD4 = C4474a.d(cursorB, "note");
            int iD5 = C4474a.d(cursorB, "value");
            int iD6 = C4474a.d(cursorB, "timestamp");
            int iD7 = C4474a.d(cursorB, "type");
            int iD8 = C4474a.d(cursorB, "updated_at");
            int iD9 = C4474a.d(cursorB, "needs_uploading");
            int iD10 = C4474a.d(cursorB, "needs_deleting");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                CookNote cookNote = new CookNote();
                zVar = zVarC;
                try {
                    cookNote.noteID = cursorB.getLong(iD);
                    cookNote.noteCookId = cursorB.getLong(iD2);
                    cookNote.cookId = cursorB.getString(iD3);
                    cookNote.note = cursorB.getString(iD4);
                    cookNote.value = cursorB.getLong(iD5);
                    cookNote.timestamp = cursorB.getDouble(iD6);
                    cookNote.type = cursorB.getInt(iD7);
                    cookNote.updatedAt = cursorB.getLong(iD8);
                    boolean z10 = true;
                    cookNote.needsUploading = cursorB.getInt(iD9) != 0;
                    if (cursorB.getInt(iD10) == 0) {
                        z10 = false;
                    }
                    cookNote.needsDeleting = z10;
                    arrayList.add(cookNote);
                    zVarC = zVar;
                } catch (Throwable th) {
                    th = th;
                    cursorB.close();
                    zVar.f();
                    throw th;
                }
            }
            cursorB.close();
            zVarC.f();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            zVar = zVarC;
        }
    }

    @Override // H4.c
    public void d(CookNote... cookNoteArr) {
        this.f5512a.assertNotSuspendingTransaction();
        this.f5512a.beginTransaction();
        try {
            this.f5515d.k(cookNoteArr);
            this.f5512a.setTransactionSuccessful();
        } finally {
            this.f5512a.endTransaction();
        }
    }

    @Override // H4.c
    public List<Long> e() {
        z zVarC = z.c("SELECT DISTINCT noteCookId from CookNote", 0);
        this.f5512a.assertNotSuspendingTransaction();
        Cursor cursorB = C4475b.b(this.f5512a, zVarC, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.isNull(0) ? null : Long.valueOf(cursorB.getLong(0)));
            }
            return arrayList;
        } finally {
            cursorB.close();
            zVarC.f();
        }
    }

    @Override // H4.c
    public List<CookNote> f(long j10) {
        z zVarC = z.c("SELECT * FROM CookNote WHERE noteCookId = ?  and type = 0 ORDER BY timestamp ASC  ", 1);
        zVarC.s0(1, j10);
        this.f5512a.assertNotSuspendingTransaction();
        Cursor cursorB = C4475b.b(this.f5512a, zVarC, false, null);
        try {
            int iD = C4474a.d(cursorB, "noteID");
            int iD2 = C4474a.d(cursorB, "noteCookId");
            int iD3 = C4474a.d(cursorB, "cookId");
            int iD4 = C4474a.d(cursorB, "note");
            int iD5 = C4474a.d(cursorB, "value");
            int iD6 = C4474a.d(cursorB, "timestamp");
            int iD7 = C4474a.d(cursorB, "type");
            int iD8 = C4474a.d(cursorB, "updated_at");
            int iD9 = C4474a.d(cursorB, "needs_uploading");
            int iD10 = C4474a.d(cursorB, "needs_deleting");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                CookNote cookNote = new CookNote();
                int i10 = iD2;
                cookNote.noteID = cursorB.getLong(iD);
                int i11 = iD;
                cookNote.noteCookId = cursorB.getLong(i10);
                cookNote.cookId = cursorB.getString(iD3);
                cookNote.note = cursorB.getString(iD4);
                cookNote.value = cursorB.getLong(iD5);
                cookNote.timestamp = cursorB.getDouble(iD6);
                cookNote.type = cursorB.getInt(iD7);
                cookNote.updatedAt = cursorB.getLong(iD8);
                cookNote.needsUploading = cursorB.getInt(iD9) != 0;
                cookNote.needsDeleting = cursorB.getInt(iD10) != 0;
                arrayList.add(cookNote);
                iD = i11;
                iD2 = i10;
            }
            return arrayList;
        } finally {
            cursorB.close();
            zVarC.f();
        }
    }

    @Override // H4.c
    public void g(CookNote cookNote) {
        this.f5512a.assertNotSuspendingTransaction();
        this.f5512a.beginTransaction();
        try {
            this.f5513b.j(cookNote);
            this.f5512a.setTransactionSuccessful();
        } finally {
            this.f5512a.endTransaction();
        }
    }

    @Override // H4.c
    public void h(CookNote cookNote) {
        this.f5512a.assertNotSuspendingTransaction();
        this.f5512a.beginTransaction();
        try {
            this.f5514c.j(cookNote);
            this.f5512a.setTransactionSuccessful();
        } finally {
            this.f5512a.endTransaction();
        }
    }

    @Override // H4.c
    public List<CookNote> i(long j10) {
        this.f5512a.beginTransaction();
        try {
            List<CookNote> listI = super.i(j10);
            this.f5512a.setTransactionSuccessful();
            return listI;
        } finally {
            this.f5512a.endTransaction();
        }
    }

    @Override // H4.c
    public List<CookNote> j() throws Throwable {
        z zVar;
        z zVarC = z.c("SELECT * FROM CookNote where needs_uploading == 1", 0);
        this.f5512a.assertNotSuspendingTransaction();
        Cursor cursorB = C4475b.b(this.f5512a, zVarC, false, null);
        try {
            int iD = C4474a.d(cursorB, "noteID");
            int iD2 = C4474a.d(cursorB, "noteCookId");
            int iD3 = C4474a.d(cursorB, "cookId");
            int iD4 = C4474a.d(cursorB, "note");
            int iD5 = C4474a.d(cursorB, "value");
            int iD6 = C4474a.d(cursorB, "timestamp");
            int iD7 = C4474a.d(cursorB, "type");
            int iD8 = C4474a.d(cursorB, "updated_at");
            int iD9 = C4474a.d(cursorB, "needs_uploading");
            int iD10 = C4474a.d(cursorB, "needs_deleting");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                CookNote cookNote = new CookNote();
                zVar = zVarC;
                try {
                    cookNote.noteID = cursorB.getLong(iD);
                    cookNote.noteCookId = cursorB.getLong(iD2);
                    cookNote.cookId = cursorB.getString(iD3);
                    cookNote.note = cursorB.getString(iD4);
                    cookNote.value = cursorB.getLong(iD5);
                    cookNote.timestamp = cursorB.getDouble(iD6);
                    cookNote.type = cursorB.getInt(iD7);
                    cookNote.updatedAt = cursorB.getLong(iD8);
                    boolean z10 = true;
                    cookNote.needsUploading = cursorB.getInt(iD9) != 0;
                    if (cursorB.getInt(iD10) == 0) {
                        z10 = false;
                    }
                    cookNote.needsDeleting = z10;
                    arrayList.add(cookNote);
                    zVarC = zVar;
                } catch (Throwable th) {
                    th = th;
                    cursorB.close();
                    zVar.f();
                    throw th;
                }
            }
            cursorB.close();
            zVarC.f();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            zVar = zVarC;
        }
    }

    @Override // H4.c
    public CookNote k(long j10) throws Throwable {
        z zVar;
        z zVarC = z.c("SELECT * FROM CookNote WHERE noteID = ?", 1);
        zVarC.s0(1, j10);
        this.f5512a.assertNotSuspendingTransaction();
        CookNote cookNote = null;
        Cursor cursorB = C4475b.b(this.f5512a, zVarC, false, null);
        try {
            int iD = C4474a.d(cursorB, "noteID");
            int iD2 = C4474a.d(cursorB, "noteCookId");
            int iD3 = C4474a.d(cursorB, "cookId");
            int iD4 = C4474a.d(cursorB, "note");
            int iD5 = C4474a.d(cursorB, "value");
            int iD6 = C4474a.d(cursorB, "timestamp");
            int iD7 = C4474a.d(cursorB, "type");
            int iD8 = C4474a.d(cursorB, "updated_at");
            int iD9 = C4474a.d(cursorB, "needs_uploading");
            int iD10 = C4474a.d(cursorB, "needs_deleting");
            if (cursorB.moveToFirst()) {
                cookNote = new CookNote();
                zVar = zVarC;
                try {
                    cookNote.noteID = cursorB.getLong(iD);
                    cookNote.noteCookId = cursorB.getLong(iD2);
                    cookNote.cookId = cursorB.getString(iD3);
                    cookNote.note = cursorB.getString(iD4);
                    cookNote.value = cursorB.getLong(iD5);
                    cookNote.timestamp = cursorB.getDouble(iD6);
                    cookNote.type = cursorB.getInt(iD7);
                    cookNote.updatedAt = cursorB.getLong(iD8);
                    cookNote.needsUploading = cursorB.getInt(iD9) != 0;
                    cookNote.needsDeleting = cursorB.getInt(iD10) != 0;
                } catch (Throwable th) {
                    th = th;
                    cursorB.close();
                    zVar.f();
                    throw th;
                }
            } else {
                zVar = zVarC;
            }
            cursorB.close();
            zVar.f();
            return cookNote;
        } catch (Throwable th2) {
            th = th2;
            zVar = zVarC;
        }
    }
}
