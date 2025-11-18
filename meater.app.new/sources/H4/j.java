package H4;

import ac.InterfaceC1970e;
import android.database.Cursor;
import androidx.room.C2176f;
import androidx.room.F;
import androidx.room.w;
import androidx.room.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import s3.C4474a;
import s3.C4475b;

/* compiled from: OnGoingRecipeDAO_Impl.java */
/* loaded from: classes.dex */
public final class j extends i {

    /* renamed from: a, reason: collision with root package name */
    private final w f5535a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.room.k<K4.b> f5536b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.room.j<K4.b> f5537c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.room.j<K4.b> f5538d;

    /* renamed from: e, reason: collision with root package name */
    private final F f5539e;

    /* renamed from: f, reason: collision with root package name */
    private final F f5540f;

    /* renamed from: g, reason: collision with root package name */
    private final F f5541g;

    /* compiled from: OnGoingRecipeDAO_Impl.java */
    class a extends androidx.room.k<K4.b> {
        a(j jVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        protected String e() {
            return "INSERT OR REPLACE INTO `OnGoingRecipeInfo` (`id`,`recipeId`,`probeId`,`cookId`,`ongoingRecipeId`,`adapterPosition`,`recipeTitle`,`stepNumber`,`stepTitle`,`elapsedTimeStepCrossed`,`internalTempStepCrossed`,`cookConfirmed`,`cookFinish`,`lastStepTimeStamp`,`progressData`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.k
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(u3.k kVar, K4.b bVar) {
            kVar.s0(1, bVar.getId());
            kVar.s0(2, bVar.getRecipeId());
            kVar.s0(3, bVar.getProbeId());
            kVar.s0(4, bVar.getCookId());
            kVar.s0(5, bVar.getOngoingRecipeId());
            kVar.s0(6, bVar.getAdapterPosition());
            kVar.J(7, bVar.getRecipeTitle());
            kVar.s0(8, bVar.getStepNumber());
            kVar.J(9, bVar.getStepTitle());
            kVar.s0(10, bVar.getElapsedTimeStepCrossed() ? 1L : 0L);
            kVar.s0(11, bVar.getInternalTempStepCrossed() ? 1L : 0L);
            kVar.s0(12, bVar.getCookConfirmed() ? 1L : 0L);
            kVar.s0(13, bVar.getCookFinish() ? 1L : 0L);
            kVar.s0(14, bVar.getLastStepTimeStamp());
            kVar.J(15, bVar.getProgressData());
        }
    }

    /* compiled from: OnGoingRecipeDAO_Impl.java */
    class b extends androidx.room.j<K4.b> {
        b(j jVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        protected String e() {
            return "DELETE FROM `OnGoingRecipeInfo` WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(u3.k kVar, K4.b bVar) {
            kVar.s0(1, bVar.getId());
        }
    }

    /* compiled from: OnGoingRecipeDAO_Impl.java */
    class c extends androidx.room.j<K4.b> {
        c(j jVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        protected String e() {
            return "UPDATE OR ABORT `OnGoingRecipeInfo` SET `id` = ?,`recipeId` = ?,`probeId` = ?,`cookId` = ?,`ongoingRecipeId` = ?,`adapterPosition` = ?,`recipeTitle` = ?,`stepNumber` = ?,`stepTitle` = ?,`elapsedTimeStepCrossed` = ?,`internalTempStepCrossed` = ?,`cookConfirmed` = ?,`cookFinish` = ?,`lastStepTimeStamp` = ?,`progressData` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(u3.k kVar, K4.b bVar) {
            kVar.s0(1, bVar.getId());
            kVar.s0(2, bVar.getRecipeId());
            kVar.s0(3, bVar.getProbeId());
            kVar.s0(4, bVar.getCookId());
            kVar.s0(5, bVar.getOngoingRecipeId());
            kVar.s0(6, bVar.getAdapterPosition());
            kVar.J(7, bVar.getRecipeTitle());
            kVar.s0(8, bVar.getStepNumber());
            kVar.J(9, bVar.getStepTitle());
            kVar.s0(10, bVar.getElapsedTimeStepCrossed() ? 1L : 0L);
            kVar.s0(11, bVar.getInternalTempStepCrossed() ? 1L : 0L);
            kVar.s0(12, bVar.getCookConfirmed() ? 1L : 0L);
            kVar.s0(13, bVar.getCookFinish() ? 1L : 0L);
            kVar.s0(14, bVar.getLastStepTimeStamp());
            kVar.J(15, bVar.getProgressData());
            kVar.s0(16, bVar.getId());
        }
    }

    /* compiled from: OnGoingRecipeDAO_Impl.java */
    class d extends F {
        d(j jVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        public String e() {
            return "delete from OnGoingRecipeInfo";
        }
    }

    /* compiled from: OnGoingRecipeDAO_Impl.java */
    class e extends F {
        e(j jVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        public String e() {
            return "delete from OnGoingRecipeInfo where ongoingRecipeId = ? ";
        }
    }

    /* compiled from: OnGoingRecipeDAO_Impl.java */
    class f extends F {
        f(j jVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        public String e() {
            return "delete from OnGoingRecipeInfo where probeId = ? ";
        }
    }

    /* compiled from: OnGoingRecipeDAO_Impl.java */
    class g implements Callable<K4.b> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z f5542a;

        g(z zVar) {
            this.f5542a = zVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public K4.b call() {
            K4.b bVar;
            Cursor cursorB = C4475b.b(j.this.f5535a, this.f5542a, false, null);
            try {
                int iD = C4474a.d(cursorB, "id");
                int iD2 = C4474a.d(cursorB, "recipeId");
                int iD3 = C4474a.d(cursorB, "probeId");
                int iD4 = C4474a.d(cursorB, "cookId");
                int iD5 = C4474a.d(cursorB, "ongoingRecipeId");
                int iD6 = C4474a.d(cursorB, "adapterPosition");
                int iD7 = C4474a.d(cursorB, "recipeTitle");
                int iD8 = C4474a.d(cursorB, "stepNumber");
                int iD9 = C4474a.d(cursorB, "stepTitle");
                int iD10 = C4474a.d(cursorB, "elapsedTimeStepCrossed");
                int iD11 = C4474a.d(cursorB, "internalTempStepCrossed");
                int iD12 = C4474a.d(cursorB, "cookConfirmed");
                int iD13 = C4474a.d(cursorB, "cookFinish");
                int iD14 = C4474a.d(cursorB, "lastStepTimeStamp");
                int iD15 = C4474a.d(cursorB, "progressData");
                if (cursorB.moveToFirst()) {
                    K4.b bVar2 = new K4.b();
                    bVar2.u(cursorB.getInt(iD));
                    bVar2.A(cursorB.getInt(iD2));
                    bVar2.y(cursorB.getLong(iD3));
                    bVar2.s(cursorB.getLong(iD4));
                    bVar2.x(cursorB.getLong(iD5));
                    bVar2.p(cursorB.getInt(iD6));
                    bVar2.B(cursorB.getString(iD7));
                    bVar2.C(cursorB.getInt(iD8));
                    bVar2.D(cursorB.getString(iD9));
                    bVar2.t(cursorB.getInt(iD10) != 0);
                    bVar2.v(cursorB.getInt(iD11) != 0);
                    bVar2.q(cursorB.getInt(iD12) != 0);
                    bVar2.r(cursorB.getInt(iD13) != 0);
                    bVar2.w(cursorB.getLong(iD14));
                    bVar2.z(cursorB.getString(iD15));
                    bVar = bVar2;
                } else {
                    bVar = null;
                }
                return bVar;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f5542a.f();
        }
    }

    public j(w wVar) {
        this.f5535a = wVar;
        this.f5536b = new a(this, wVar);
        this.f5537c = new b(this, wVar);
        this.f5538d = new c(this, wVar);
        this.f5539e = new d(this, wVar);
        this.f5540f = new e(this, wVar);
        this.f5541g = new f(this, wVar);
    }

    public static List<Class<?>> m() {
        return Collections.emptyList();
    }

    @Override // H4.i
    public void a(long j10) {
        this.f5535a.assertNotSuspendingTransaction();
        u3.k kVarB = this.f5540f.b();
        kVarB.s0(1, j10);
        try {
            this.f5535a.beginTransaction();
            try {
                kVarB.R();
                this.f5535a.setTransactionSuccessful();
            } finally {
                this.f5535a.endTransaction();
            }
        } finally {
            this.f5540f.h(kVarB);
        }
    }

    @Override // H4.i
    public List<K4.b> b() throws Throwable {
        z zVar;
        int iD;
        int iD2;
        int iD3;
        int iD4;
        int iD5;
        int iD6;
        int iD7;
        int iD8;
        int iD9;
        int iD10;
        int iD11;
        int iD12;
        int iD13;
        int iD14;
        z zVarC = z.c("SELECT * FROM OnGoingRecipeInfo", 0);
        this.f5535a.assertNotSuspendingTransaction();
        Cursor cursorB = C4475b.b(this.f5535a, zVarC, false, null);
        try {
            iD = C4474a.d(cursorB, "id");
            iD2 = C4474a.d(cursorB, "recipeId");
            iD3 = C4474a.d(cursorB, "probeId");
            iD4 = C4474a.d(cursorB, "cookId");
            iD5 = C4474a.d(cursorB, "ongoingRecipeId");
            iD6 = C4474a.d(cursorB, "adapterPosition");
            iD7 = C4474a.d(cursorB, "recipeTitle");
            iD8 = C4474a.d(cursorB, "stepNumber");
            iD9 = C4474a.d(cursorB, "stepTitle");
            iD10 = C4474a.d(cursorB, "elapsedTimeStepCrossed");
            iD11 = C4474a.d(cursorB, "internalTempStepCrossed");
            iD12 = C4474a.d(cursorB, "cookConfirmed");
            iD13 = C4474a.d(cursorB, "cookFinish");
            iD14 = C4474a.d(cursorB, "lastStepTimeStamp");
            zVar = zVarC;
        } catch (Throwable th) {
            th = th;
            zVar = zVarC;
        }
        try {
            int iD15 = C4474a.d(cursorB, "progressData");
            int i10 = iD14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                K4.b bVar = new K4.b();
                ArrayList arrayList2 = arrayList;
                bVar.u(cursorB.getInt(iD));
                bVar.A(cursorB.getInt(iD2));
                int i11 = iD13;
                bVar.y(cursorB.getLong(iD3));
                bVar.s(cursorB.getLong(iD4));
                bVar.x(cursorB.getLong(iD5));
                bVar.p(cursorB.getInt(iD6));
                bVar.B(cursorB.getString(iD7));
                bVar.C(cursorB.getInt(iD8));
                bVar.D(cursorB.getString(iD9));
                boolean z10 = true;
                bVar.t(cursorB.getInt(iD10) != 0);
                bVar.v(cursorB.getInt(iD11) != 0);
                bVar.q(cursorB.getInt(iD12) != 0);
                iD13 = i11;
                if (cursorB.getInt(iD13) == 0) {
                    z10 = false;
                }
                bVar.r(z10);
                int i12 = iD3;
                int i13 = i10;
                int i14 = iD2;
                bVar.w(cursorB.getLong(i13));
                int i15 = iD15;
                bVar.z(cursorB.getString(i15));
                arrayList2.add(bVar);
                iD15 = i15;
                iD2 = i14;
                i10 = i13;
                arrayList = arrayList2;
                iD3 = i12;
            }
            ArrayList arrayList3 = arrayList;
            cursorB.close();
            zVar.f();
            return arrayList3;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            zVar.f();
            throw th;
        }
    }

    @Override // H4.i
    public List<K4.b> c() throws Throwable {
        z zVar;
        int iD;
        int iD2;
        int iD3;
        int iD4;
        int iD5;
        int iD6;
        int iD7;
        int iD8;
        int iD9;
        int iD10;
        int iD11;
        int iD12;
        int iD13;
        int iD14;
        z zVarC = z.c("SELECT * FROM OnGoingRecipeInfo where probeId == -1", 0);
        this.f5535a.assertNotSuspendingTransaction();
        Cursor cursorB = C4475b.b(this.f5535a, zVarC, false, null);
        try {
            iD = C4474a.d(cursorB, "id");
            iD2 = C4474a.d(cursorB, "recipeId");
            iD3 = C4474a.d(cursorB, "probeId");
            iD4 = C4474a.d(cursorB, "cookId");
            iD5 = C4474a.d(cursorB, "ongoingRecipeId");
            iD6 = C4474a.d(cursorB, "adapterPosition");
            iD7 = C4474a.d(cursorB, "recipeTitle");
            iD8 = C4474a.d(cursorB, "stepNumber");
            iD9 = C4474a.d(cursorB, "stepTitle");
            iD10 = C4474a.d(cursorB, "elapsedTimeStepCrossed");
            iD11 = C4474a.d(cursorB, "internalTempStepCrossed");
            iD12 = C4474a.d(cursorB, "cookConfirmed");
            iD13 = C4474a.d(cursorB, "cookFinish");
            iD14 = C4474a.d(cursorB, "lastStepTimeStamp");
            zVar = zVarC;
        } catch (Throwable th) {
            th = th;
            zVar = zVarC;
        }
        try {
            int iD15 = C4474a.d(cursorB, "progressData");
            int i10 = iD14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                K4.b bVar = new K4.b();
                ArrayList arrayList2 = arrayList;
                bVar.u(cursorB.getInt(iD));
                bVar.A(cursorB.getInt(iD2));
                int i11 = iD13;
                bVar.y(cursorB.getLong(iD3));
                bVar.s(cursorB.getLong(iD4));
                bVar.x(cursorB.getLong(iD5));
                bVar.p(cursorB.getInt(iD6));
                bVar.B(cursorB.getString(iD7));
                bVar.C(cursorB.getInt(iD8));
                bVar.D(cursorB.getString(iD9));
                boolean z10 = true;
                bVar.t(cursorB.getInt(iD10) != 0);
                bVar.v(cursorB.getInt(iD11) != 0);
                bVar.q(cursorB.getInt(iD12) != 0);
                iD13 = i11;
                if (cursorB.getInt(iD13) == 0) {
                    z10 = false;
                }
                bVar.r(z10);
                int i12 = iD3;
                int i13 = i10;
                int i14 = iD2;
                bVar.w(cursorB.getLong(i13));
                int i15 = iD15;
                bVar.z(cursorB.getString(i15));
                arrayList2.add(bVar);
                iD15 = i15;
                iD2 = i14;
                i10 = i13;
                arrayList = arrayList2;
                iD3 = i12;
            }
            ArrayList arrayList3 = arrayList;
            cursorB.close();
            zVar.f();
            return arrayList3;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            zVar.f();
            throw th;
        }
    }

    @Override // H4.i
    public K4.b d(int i10) throws Throwable {
        z zVar;
        K4.b bVar;
        z zVarC = z.c("SELECT * FROM OnGoingRecipeInfo WHERE recipeId = ?", 1);
        zVarC.s0(1, i10);
        this.f5535a.assertNotSuspendingTransaction();
        Cursor cursorB = C4475b.b(this.f5535a, zVarC, false, null);
        try {
            int iD = C4474a.d(cursorB, "id");
            int iD2 = C4474a.d(cursorB, "recipeId");
            int iD3 = C4474a.d(cursorB, "probeId");
            int iD4 = C4474a.d(cursorB, "cookId");
            int iD5 = C4474a.d(cursorB, "ongoingRecipeId");
            int iD6 = C4474a.d(cursorB, "adapterPosition");
            int iD7 = C4474a.d(cursorB, "recipeTitle");
            int iD8 = C4474a.d(cursorB, "stepNumber");
            int iD9 = C4474a.d(cursorB, "stepTitle");
            int iD10 = C4474a.d(cursorB, "elapsedTimeStepCrossed");
            int iD11 = C4474a.d(cursorB, "internalTempStepCrossed");
            int iD12 = C4474a.d(cursorB, "cookConfirmed");
            int iD13 = C4474a.d(cursorB, "cookFinish");
            int iD14 = C4474a.d(cursorB, "lastStepTimeStamp");
            zVar = zVarC;
            try {
                int iD15 = C4474a.d(cursorB, "progressData");
                if (cursorB.moveToFirst()) {
                    K4.b bVar2 = new K4.b();
                    bVar2.u(cursorB.getInt(iD));
                    bVar2.A(cursorB.getInt(iD2));
                    bVar2.y(cursorB.getLong(iD3));
                    bVar2.s(cursorB.getLong(iD4));
                    bVar2.x(cursorB.getLong(iD5));
                    bVar2.p(cursorB.getInt(iD6));
                    bVar2.B(cursorB.getString(iD7));
                    bVar2.C(cursorB.getInt(iD8));
                    bVar2.D(cursorB.getString(iD9));
                    bVar2.t(cursorB.getInt(iD10) != 0);
                    bVar2.v(cursorB.getInt(iD11) != 0);
                    bVar2.q(cursorB.getInt(iD12) != 0);
                    bVar2.r(cursorB.getInt(iD13) != 0);
                    bVar2.w(cursorB.getLong(iD14));
                    bVar2.z(cursorB.getString(iD15));
                    bVar = bVar2;
                } else {
                    bVar = null;
                }
                cursorB.close();
                zVar.f();
                return bVar;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                zVar.f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zVar = zVarC;
        }
    }

    @Override // H4.i
    public K4.b e(long j10) throws Throwable {
        z zVar;
        int iD;
        int iD2;
        int iD3;
        int iD4;
        int iD5;
        int iD6;
        int iD7;
        int iD8;
        int iD9;
        int iD10;
        int iD11;
        int iD12;
        int iD13;
        int iD14;
        K4.b bVar;
        z zVarC = z.c("SELECT * FROM OnGoingRecipeInfo WHERE probeId = ?", 1);
        zVarC.s0(1, j10);
        this.f5535a.assertNotSuspendingTransaction();
        Cursor cursorB = C4475b.b(this.f5535a, zVarC, false, null);
        try {
            iD = C4474a.d(cursorB, "id");
            iD2 = C4474a.d(cursorB, "recipeId");
            iD3 = C4474a.d(cursorB, "probeId");
            iD4 = C4474a.d(cursorB, "cookId");
            iD5 = C4474a.d(cursorB, "ongoingRecipeId");
            iD6 = C4474a.d(cursorB, "adapterPosition");
            iD7 = C4474a.d(cursorB, "recipeTitle");
            iD8 = C4474a.d(cursorB, "stepNumber");
            iD9 = C4474a.d(cursorB, "stepTitle");
            iD10 = C4474a.d(cursorB, "elapsedTimeStepCrossed");
            iD11 = C4474a.d(cursorB, "internalTempStepCrossed");
            iD12 = C4474a.d(cursorB, "cookConfirmed");
            iD13 = C4474a.d(cursorB, "cookFinish");
            iD14 = C4474a.d(cursorB, "lastStepTimeStamp");
            zVar = zVarC;
        } catch (Throwable th) {
            th = th;
            zVar = zVarC;
        }
        try {
            int iD15 = C4474a.d(cursorB, "progressData");
            if (cursorB.moveToFirst()) {
                K4.b bVar2 = new K4.b();
                bVar2.u(cursorB.getInt(iD));
                bVar2.A(cursorB.getInt(iD2));
                bVar2.y(cursorB.getLong(iD3));
                bVar2.s(cursorB.getLong(iD4));
                bVar2.x(cursorB.getLong(iD5));
                bVar2.p(cursorB.getInt(iD6));
                bVar2.B(cursorB.getString(iD7));
                bVar2.C(cursorB.getInt(iD8));
                bVar2.D(cursorB.getString(iD9));
                bVar2.t(cursorB.getInt(iD10) != 0);
                bVar2.v(cursorB.getInt(iD11) != 0);
                bVar2.q(cursorB.getInt(iD12) != 0);
                bVar2.r(cursorB.getInt(iD13) != 0);
                bVar2.w(cursorB.getLong(iD14));
                bVar2.z(cursorB.getString(iD15));
                bVar = bVar2;
            } else {
                bVar = null;
            }
            cursorB.close();
            zVar.f();
            return bVar;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            zVar.f();
            throw th;
        }
    }

    @Override // H4.i
    public K4.b f(int i10) throws Throwable {
        z zVar;
        K4.b bVar;
        z zVarC = z.c("SELECT * FROM OnGoingRecipeInfo WHERE id = ?", 1);
        zVarC.s0(1, i10);
        this.f5535a.assertNotSuspendingTransaction();
        Cursor cursorB = C4475b.b(this.f5535a, zVarC, false, null);
        try {
            int iD = C4474a.d(cursorB, "id");
            int iD2 = C4474a.d(cursorB, "recipeId");
            int iD3 = C4474a.d(cursorB, "probeId");
            int iD4 = C4474a.d(cursorB, "cookId");
            int iD5 = C4474a.d(cursorB, "ongoingRecipeId");
            int iD6 = C4474a.d(cursorB, "adapterPosition");
            int iD7 = C4474a.d(cursorB, "recipeTitle");
            int iD8 = C4474a.d(cursorB, "stepNumber");
            int iD9 = C4474a.d(cursorB, "stepTitle");
            int iD10 = C4474a.d(cursorB, "elapsedTimeStepCrossed");
            int iD11 = C4474a.d(cursorB, "internalTempStepCrossed");
            int iD12 = C4474a.d(cursorB, "cookConfirmed");
            int iD13 = C4474a.d(cursorB, "cookFinish");
            int iD14 = C4474a.d(cursorB, "lastStepTimeStamp");
            zVar = zVarC;
            try {
                int iD15 = C4474a.d(cursorB, "progressData");
                if (cursorB.moveToFirst()) {
                    K4.b bVar2 = new K4.b();
                    bVar2.u(cursorB.getInt(iD));
                    bVar2.A(cursorB.getInt(iD2));
                    bVar2.y(cursorB.getLong(iD3));
                    bVar2.s(cursorB.getLong(iD4));
                    bVar2.x(cursorB.getLong(iD5));
                    bVar2.p(cursorB.getInt(iD6));
                    bVar2.B(cursorB.getString(iD7));
                    bVar2.C(cursorB.getInt(iD8));
                    bVar2.D(cursorB.getString(iD9));
                    bVar2.t(cursorB.getInt(iD10) != 0);
                    bVar2.v(cursorB.getInt(iD11) != 0);
                    bVar2.q(cursorB.getInt(iD12) != 0);
                    bVar2.r(cursorB.getInt(iD13) != 0);
                    bVar2.w(cursorB.getLong(iD14));
                    bVar2.z(cursorB.getString(iD15));
                    bVar = bVar2;
                } else {
                    bVar = null;
                }
                cursorB.close();
                zVar.f();
                return bVar;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                zVar.f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zVar = zVarC;
        }
    }

    @Override // H4.i
    public K4.b g(long j10) throws Throwable {
        z zVar;
        int iD;
        int iD2;
        int iD3;
        int iD4;
        int iD5;
        int iD6;
        int iD7;
        int iD8;
        int iD9;
        int iD10;
        int iD11;
        int iD12;
        int iD13;
        int iD14;
        K4.b bVar;
        z zVarC = z.c("SELECT * FROM OnGoingRecipeInfo WHERE ongoingRecipeId = ?", 1);
        zVarC.s0(1, j10);
        this.f5535a.assertNotSuspendingTransaction();
        Cursor cursorB = C4475b.b(this.f5535a, zVarC, false, null);
        try {
            iD = C4474a.d(cursorB, "id");
            iD2 = C4474a.d(cursorB, "recipeId");
            iD3 = C4474a.d(cursorB, "probeId");
            iD4 = C4474a.d(cursorB, "cookId");
            iD5 = C4474a.d(cursorB, "ongoingRecipeId");
            iD6 = C4474a.d(cursorB, "adapterPosition");
            iD7 = C4474a.d(cursorB, "recipeTitle");
            iD8 = C4474a.d(cursorB, "stepNumber");
            iD9 = C4474a.d(cursorB, "stepTitle");
            iD10 = C4474a.d(cursorB, "elapsedTimeStepCrossed");
            iD11 = C4474a.d(cursorB, "internalTempStepCrossed");
            iD12 = C4474a.d(cursorB, "cookConfirmed");
            iD13 = C4474a.d(cursorB, "cookFinish");
            iD14 = C4474a.d(cursorB, "lastStepTimeStamp");
            zVar = zVarC;
        } catch (Throwable th) {
            th = th;
            zVar = zVarC;
        }
        try {
            int iD15 = C4474a.d(cursorB, "progressData");
            if (cursorB.moveToFirst()) {
                K4.b bVar2 = new K4.b();
                bVar2.u(cursorB.getInt(iD));
                bVar2.A(cursorB.getInt(iD2));
                bVar2.y(cursorB.getLong(iD3));
                bVar2.s(cursorB.getLong(iD4));
                bVar2.x(cursorB.getLong(iD5));
                bVar2.p(cursorB.getInt(iD6));
                bVar2.B(cursorB.getString(iD7));
                bVar2.C(cursorB.getInt(iD8));
                bVar2.D(cursorB.getString(iD9));
                bVar2.t(cursorB.getInt(iD10) != 0);
                bVar2.v(cursorB.getInt(iD11) != 0);
                bVar2.q(cursorB.getInt(iD12) != 0);
                bVar2.r(cursorB.getInt(iD13) != 0);
                bVar2.w(cursorB.getLong(iD14));
                bVar2.z(cursorB.getString(iD15));
                bVar = bVar2;
            } else {
                bVar = null;
            }
            cursorB.close();
            zVar.f();
            return bVar;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            zVar.f();
            throw th;
        }
    }

    @Override // H4.i
    public InterfaceC1970e<K4.b> h(long j10) {
        z zVarC = z.c("SELECT * FROM OnGoingRecipeInfo WHERE ongoingRecipeId = ?", 1);
        zVarC.s0(1, j10);
        return C2176f.a(this.f5535a, false, new String[]{"OnGoingRecipeInfo"}, new g(zVarC));
    }

    @Override // H4.i
    public int i(long j10) {
        z zVarC = z.c("SELECT stepNumber FROM OnGoingRecipeInfo WHERE ongoingRecipeId = ?", 1);
        zVarC.s0(1, j10);
        this.f5535a.assertNotSuspendingTransaction();
        Cursor cursorB = C4475b.b(this.f5535a, zVarC, false, null);
        try {
            return cursorB.moveToFirst() ? cursorB.getInt(0) : 0;
        } finally {
            cursorB.close();
            zVarC.f();
        }
    }

    @Override // H4.i
    public void j(K4.b bVar) {
        this.f5535a.assertNotSuspendingTransaction();
        this.f5535a.beginTransaction();
        try {
            this.f5536b.j(bVar);
            this.f5535a.setTransactionSuccessful();
        } finally {
            this.f5535a.endTransaction();
        }
    }

    @Override // H4.i
    public void k(K4.b... bVarArr) {
        this.f5535a.assertNotSuspendingTransaction();
        this.f5535a.beginTransaction();
        try {
            this.f5538d.k(bVarArr);
            this.f5535a.setTransactionSuccessful();
        } finally {
            this.f5535a.endTransaction();
        }
    }
}
