package H4;

import android.database.Cursor;
import android.view.B;
import androidx.room.F;
import androidx.room.w;
import androidx.room.z;
import com.apptionlabs.meater_app.model.PendingRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import s3.C4474a;
import s3.C4475b;

/* compiled from: PendingRequestDAO_Impl.java */
/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    private final w f5544a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.room.k<PendingRequest> f5545b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.room.j<PendingRequest> f5546c;

    /* renamed from: d, reason: collision with root package name */
    private final F f5547d;

    /* compiled from: PendingRequestDAO_Impl.java */
    class a extends androidx.room.k<PendingRequest> {
        a(l lVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        protected String e() {
            return "INSERT OR REPLACE INTO `PendingRequest` (`requestID`,`requestMethod`,`requestBody`) VALUES (nullif(?, 0),?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.k
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(u3.k kVar, PendingRequest pendingRequest) {
            kVar.s0(1, pendingRequest.requestID);
            kVar.J(2, pendingRequest.requestMethod);
            kVar.J(3, pendingRequest.requestBody);
        }
    }

    /* compiled from: PendingRequestDAO_Impl.java */
    class b extends androidx.room.j<PendingRequest> {
        b(l lVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        protected String e() {
            return "DELETE FROM `PendingRequest` WHERE `requestID` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(u3.k kVar, PendingRequest pendingRequest) {
            kVar.s0(1, pendingRequest.requestID);
        }
    }

    /* compiled from: PendingRequestDAO_Impl.java */
    class c extends F {
        c(l lVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        public String e() {
            return "delete from PendingRequest";
        }
    }

    /* compiled from: PendingRequestDAO_Impl.java */
    class d implements Callable<List<PendingRequest>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z f5548a;

        d(z zVar) {
            this.f5548a = zVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<PendingRequest> call() {
            Cursor cursorB = C4475b.b(l.this.f5544a, this.f5548a, false, null);
            try {
                int iD = C4474a.d(cursorB, "requestID");
                int iD2 = C4474a.d(cursorB, "requestMethod");
                int iD3 = C4474a.d(cursorB, "requestBody");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    PendingRequest pendingRequest = new PendingRequest();
                    pendingRequest.requestID = cursorB.getLong(iD);
                    pendingRequest.requestMethod = cursorB.getString(iD2);
                    pendingRequest.requestBody = cursorB.getString(iD3);
                    arrayList.add(pendingRequest);
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f5548a.f();
        }
    }

    public l(w wVar) {
        this.f5544a = wVar;
        this.f5545b = new a(this, wVar);
        this.f5546c = new b(this, wVar);
        this.f5547d = new c(this, wVar);
    }

    public static List<Class<?>> f() {
        return Collections.emptyList();
    }

    @Override // H4.k
    public void a() {
        this.f5544a.assertNotSuspendingTransaction();
        u3.k kVarB = this.f5547d.b();
        try {
            this.f5544a.beginTransaction();
            try {
                kVarB.R();
                this.f5544a.setTransactionSuccessful();
            } finally {
                this.f5544a.endTransaction();
            }
        } finally {
            this.f5547d.h(kVarB);
        }
    }

    @Override // H4.k
    public void b(PendingRequest pendingRequest) {
        this.f5544a.assertNotSuspendingTransaction();
        this.f5544a.beginTransaction();
        try {
            this.f5545b.j(pendingRequest);
            this.f5544a.setTransactionSuccessful();
        } finally {
            this.f5544a.endTransaction();
        }
    }

    @Override // H4.k
    public void c(PendingRequest pendingRequest) {
        this.f5544a.assertNotSuspendingTransaction();
        this.f5544a.beginTransaction();
        try {
            this.f5546c.j(pendingRequest);
            this.f5544a.setTransactionSuccessful();
        } finally {
            this.f5544a.endTransaction();
        }
    }

    @Override // H4.k
    public B<List<PendingRequest>> d() {
        return this.f5544a.getInvalidationTracker().e(new String[]{"PendingRequest"}, false, new d(z.c("SELECT * FROM PendingRequest", 0)));
    }
}
