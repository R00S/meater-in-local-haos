package H4;

import android.database.Cursor;
import androidx.room.F;
import androidx.room.w;
import androidx.room.z;
import com.apptionlabs.meater_app.model.MEATERTypeConverters;
import com.apptionlabs.meater_app.model.SavedEventLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s3.C4474a;
import s3.C4475b;

/* compiled from: SavedEventLogDAO_Impl.java */
/* loaded from: classes.dex */
public final class p extends o {

    /* renamed from: a, reason: collision with root package name */
    private final w f5555a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.room.k<SavedEventLog> f5556b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.room.j<SavedEventLog> f5557c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.room.j<SavedEventLog> f5558d;

    /* renamed from: e, reason: collision with root package name */
    private final F f5559e;

    /* renamed from: f, reason: collision with root package name */
    private final F f5560f;

    /* renamed from: g, reason: collision with root package name */
    private final F f5561g;

    /* compiled from: SavedEventLogDAO_Impl.java */
    class a extends androidx.room.k<SavedEventLog> {
        a(p pVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        protected String e() {
            return "INSERT OR REPLACE INTO `SavedEventLog` (`eventLogID`,`cookID`,`localMEATEREvent`) VALUES (nullif(?, 0),?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.k
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(u3.k kVar, SavedEventLog savedEventLog) {
            kVar.s0(1, savedEventLog.eventLogId);
            kVar.s0(2, savedEventLog.cookId);
            kVar.J(3, MEATERTypeConverters.localMEATEREventToString(savedEventLog.getLocalMEATEREvent()));
        }
    }

    /* compiled from: SavedEventLogDAO_Impl.java */
    class b extends androidx.room.j<SavedEventLog> {
        b(p pVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        protected String e() {
            return "DELETE FROM `SavedEventLog` WHERE `eventLogID` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(u3.k kVar, SavedEventLog savedEventLog) {
            kVar.s0(1, savedEventLog.eventLogId);
        }
    }

    /* compiled from: SavedEventLogDAO_Impl.java */
    class c extends androidx.room.j<SavedEventLog> {
        c(p pVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        protected String e() {
            return "UPDATE OR ABORT `SavedEventLog` SET `eventLogID` = ?,`cookID` = ?,`localMEATEREvent` = ? WHERE `eventLogID` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(u3.k kVar, SavedEventLog savedEventLog) {
            kVar.s0(1, savedEventLog.eventLogId);
            kVar.s0(2, savedEventLog.cookId);
            kVar.J(3, MEATERTypeConverters.localMEATEREventToString(savedEventLog.getLocalMEATEREvent()));
            kVar.s0(4, savedEventLog.eventLogId);
        }
    }

    /* compiled from: SavedEventLogDAO_Impl.java */
    class d extends F {
        d(p pVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        public String e() {
            return "delete from SavedEventLog";
        }
    }

    /* compiled from: SavedEventLogDAO_Impl.java */
    class e extends F {
        e(p pVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        public String e() {
            return "delete from SavedEventLog where cookID = ? ";
        }
    }

    /* compiled from: SavedEventLogDAO_Impl.java */
    class f extends F {
        f(p pVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        public String e() {
            return "delete from SavedEventLog where cookID = ? and eventLogID = ?";
        }
    }

    public p(w wVar) {
        this.f5555a = wVar;
        this.f5556b = new a(this, wVar);
        this.f5557c = new b(this, wVar);
        this.f5558d = new c(this, wVar);
        this.f5559e = new d(this, wVar);
        this.f5560f = new e(this, wVar);
        this.f5561g = new f(this, wVar);
    }

    public static List<Class<?>> i() {
        return Collections.emptyList();
    }

    @Override // H4.o
    public List<Long> a(int i10) {
        z zVarC = z.c("SELECT DISTINCT cookID from SavedEventLog where cookID IN (SELECT cookID FROM SavedCook where (cookTime >= (5*60) and peakTemperature >= ?))", 1);
        zVarC.s0(1, i10);
        this.f5555a.assertNotSuspendingTransaction();
        Cursor cursorB = C4475b.b(this.f5555a, zVarC, false, null);
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

    @Override // H4.o
    public void b() {
        this.f5555a.assertNotSuspendingTransaction();
        u3.k kVarB = this.f5559e.b();
        try {
            this.f5555a.beginTransaction();
            try {
                kVarB.R();
                this.f5555a.setTransactionSuccessful();
            } finally {
                this.f5555a.endTransaction();
            }
        } finally {
            this.f5559e.h(kVarB);
        }
    }

    @Override // H4.o
    public void c(long j10, long j11) {
        this.f5555a.assertNotSuspendingTransaction();
        u3.k kVarB = this.f5561g.b();
        kVarB.s0(1, j11);
        kVarB.s0(2, j10);
        try {
            this.f5555a.beginTransaction();
            try {
                kVarB.R();
                this.f5555a.setTransactionSuccessful();
            } finally {
                this.f5555a.endTransaction();
            }
        } finally {
            this.f5561g.h(kVarB);
        }
    }

    @Override // H4.o
    public void d(List<Long> list, long j10) {
        this.f5555a.beginTransaction();
        try {
            super.d(list, j10);
            this.f5555a.setTransactionSuccessful();
        } finally {
            this.f5555a.endTransaction();
        }
    }

    @Override // H4.o
    public void e(long j10) {
        this.f5555a.assertNotSuspendingTransaction();
        u3.k kVarB = this.f5560f.b();
        kVarB.s0(1, j10);
        try {
            this.f5555a.beginTransaction();
            try {
                kVarB.R();
                this.f5555a.setTransactionSuccessful();
            } finally {
                this.f5555a.endTransaction();
            }
        } finally {
            this.f5560f.h(kVarB);
        }
    }

    @Override // H4.o
    public List<SavedEventLog> f(long j10) {
        z zVarC = z.c("SELECT * FROM SavedEventLog WHERE cookID = ?", 1);
        zVarC.s0(1, j10);
        this.f5555a.assertNotSuspendingTransaction();
        Cursor cursorB = C4475b.b(this.f5555a, zVarC, false, null);
        try {
            int iD = C4474a.d(cursorB, "eventLogID");
            int iD2 = C4474a.d(cursorB, "cookID");
            int iD3 = C4474a.d(cursorB, "localMEATEREvent");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                SavedEventLog savedEventLog = new SavedEventLog();
                savedEventLog.eventLogId = cursorB.getLong(iD);
                savedEventLog.cookId = cursorB.getLong(iD2);
                savedEventLog.setLocalMEATEREvent(MEATERTypeConverters.stringToLocalMEATEREvent(cursorB.getString(iD3)));
                arrayList.add(savedEventLog);
            }
            return arrayList;
        } finally {
            cursorB.close();
            zVarC.f();
        }
    }

    @Override // H4.o
    public void g(SavedEventLog savedEventLog) {
        this.f5555a.assertNotSuspendingTransaction();
        this.f5555a.beginTransaction();
        try {
            this.f5556b.j(savedEventLog);
            this.f5555a.setTransactionSuccessful();
        } finally {
            this.f5555a.endTransaction();
        }
    }
}
