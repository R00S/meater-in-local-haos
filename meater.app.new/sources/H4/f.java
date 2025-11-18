package H4;

import android.database.Cursor;
import android.view.B;
import androidx.room.F;
import androidx.room.w;
import androidx.room.z;
import com.apptionlabs.meater_app.model.MEATERDevice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import s3.C4474a;
import s3.C4475b;

/* compiled from: MEATERDeviceDAO_Impl.java */
/* loaded from: classes.dex */
public final class f extends H4.e {

    /* renamed from: a, reason: collision with root package name */
    private final w f5519a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.room.k<MEATERDevice> f5520b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.room.j<MEATERDevice> f5521c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.room.j<MEATERDevice> f5522d;

    /* renamed from: e, reason: collision with root package name */
    private final F f5523e;

    /* compiled from: MEATERDeviceDAO_Impl.java */
    class a extends androidx.room.k<MEATERDevice> {
        a(f fVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        protected String e() {
            return "INSERT OR REPLACE INTO `MEATERDevice` (`isModified`,`deviceID`,`macAddress`,`parentDeviceID`,`probeNumber`,`clipNumber`,`datePaired`,`firmwareRevision`,`batteryLevel`,`haveNotifiedUserOfLowBattery`,`haveNotifiedUserOfEmptyBattery`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.k
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(u3.k kVar, MEATERDevice mEATERDevice) {
            kVar.s0(1, mEATERDevice.isModified() ? 1L : 0L);
            kVar.s0(2, mEATERDevice.getDeviceID());
            if (mEATERDevice.getMacAddress() == null) {
                kVar.W0(3);
            } else {
                kVar.J(3, mEATERDevice.getMacAddress());
            }
            kVar.s0(4, mEATERDevice.getParentDeviceID());
            kVar.s0(5, mEATERDevice.getProbeNumber());
            kVar.s0(6, mEATERDevice.getClipNumber());
            if (mEATERDevice.getDatePaired() == null) {
                kVar.W0(7);
            } else {
                kVar.s0(7, mEATERDevice.getDatePaired().longValue());
            }
            if (mEATERDevice.getFirmwareRevision() == null) {
                kVar.W0(8);
            } else {
                kVar.J(8, mEATERDevice.getFirmwareRevision());
            }
            kVar.s0(9, mEATERDevice.getBatteryLevel());
            kVar.s0(10, mEATERDevice.haveNotifiedUserOfLowBattery() ? 1L : 0L);
            kVar.s0(11, mEATERDevice.haveNotifiedUserOfEmptyBattery() ? 1L : 0L);
        }
    }

    /* compiled from: MEATERDeviceDAO_Impl.java */
    class b extends androidx.room.j<MEATERDevice> {
        b(f fVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        protected String e() {
            return "DELETE FROM `MEATERDevice` WHERE `deviceID` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(u3.k kVar, MEATERDevice mEATERDevice) {
            kVar.s0(1, mEATERDevice.getDeviceID());
        }
    }

    /* compiled from: MEATERDeviceDAO_Impl.java */
    class c extends androidx.room.j<MEATERDevice> {
        c(f fVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        protected String e() {
            return "UPDATE OR ABORT `MEATERDevice` SET `isModified` = ?,`deviceID` = ?,`macAddress` = ?,`parentDeviceID` = ?,`probeNumber` = ?,`clipNumber` = ?,`datePaired` = ?,`firmwareRevision` = ?,`batteryLevel` = ?,`haveNotifiedUserOfLowBattery` = ?,`haveNotifiedUserOfEmptyBattery` = ? WHERE `deviceID` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(u3.k kVar, MEATERDevice mEATERDevice) {
            kVar.s0(1, mEATERDevice.isModified() ? 1L : 0L);
            kVar.s0(2, mEATERDevice.getDeviceID());
            if (mEATERDevice.getMacAddress() == null) {
                kVar.W0(3);
            } else {
                kVar.J(3, mEATERDevice.getMacAddress());
            }
            kVar.s0(4, mEATERDevice.getParentDeviceID());
            kVar.s0(5, mEATERDevice.getProbeNumber());
            kVar.s0(6, mEATERDevice.getClipNumber());
            if (mEATERDevice.getDatePaired() == null) {
                kVar.W0(7);
            } else {
                kVar.s0(7, mEATERDevice.getDatePaired().longValue());
            }
            if (mEATERDevice.getFirmwareRevision() == null) {
                kVar.W0(8);
            } else {
                kVar.J(8, mEATERDevice.getFirmwareRevision());
            }
            kVar.s0(9, mEATERDevice.getBatteryLevel());
            kVar.s0(10, mEATERDevice.haveNotifiedUserOfLowBattery() ? 1L : 0L);
            kVar.s0(11, mEATERDevice.haveNotifiedUserOfEmptyBattery() ? 1L : 0L);
            kVar.s0(12, mEATERDevice.getDeviceID());
        }
    }

    /* compiled from: MEATERDeviceDAO_Impl.java */
    class d extends F {
        d(f fVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        public String e() {
            return "delete from MEATERDevice";
        }
    }

    /* compiled from: MEATERDeviceDAO_Impl.java */
    class e implements Callable<List<MEATERDevice>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z f5524a;

        e(z zVar) {
            this.f5524a = zVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<MEATERDevice> call() {
            Cursor cursorB = C4475b.b(f.this.f5519a, this.f5524a, false, null);
            try {
                int iD = C4474a.d(cursorB, "isModified");
                int iD2 = C4474a.d(cursorB, "deviceID");
                int iD3 = C4474a.d(cursorB, "macAddress");
                int iD4 = C4474a.d(cursorB, "parentDeviceID");
                int iD5 = C4474a.d(cursorB, "probeNumber");
                int iD6 = C4474a.d(cursorB, "clipNumber");
                int iD7 = C4474a.d(cursorB, "datePaired");
                int iD8 = C4474a.d(cursorB, "firmwareRevision");
                int iD9 = C4474a.d(cursorB, "batteryLevel");
                int iD10 = C4474a.d(cursorB, "haveNotifiedUserOfLowBattery");
                int iD11 = C4474a.d(cursorB, "haveNotifiedUserOfEmptyBattery");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    MEATERDevice mEATERDevice = new MEATERDevice();
                    mEATERDevice.setModified(cursorB.getInt(iD) != 0);
                    int i10 = iD;
                    mEATERDevice.setDeviceID(cursorB.getLong(iD2));
                    mEATERDevice.setMacAddress(cursorB.isNull(iD3) ? null : cursorB.getString(iD3));
                    mEATERDevice.setParentDeviceID(cursorB.getLong(iD4));
                    mEATERDevice.setProbeNumber(cursorB.getInt(iD5));
                    mEATERDevice.setClipNumber(cursorB.getInt(iD6));
                    mEATERDevice.setDatePaired(cursorB.isNull(iD7) ? null : Long.valueOf(cursorB.getLong(iD7)));
                    mEATERDevice.setFirmwareRevision(cursorB.isNull(iD8) ? null : cursorB.getString(iD8));
                    mEATERDevice.setBatteryLevel(cursorB.getInt(iD9));
                    mEATERDevice.setHaveNotifiedUserOfLowBattery(cursorB.getInt(iD10) != 0);
                    mEATERDevice.setHaveNotifiedUserOfEmptyBattery(cursorB.getInt(iD11) != 0);
                    arrayList.add(mEATERDevice);
                    iD = i10;
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f5524a.f();
        }
    }

    /* compiled from: MEATERDeviceDAO_Impl.java */
    /* renamed from: H4.f$f, reason: collision with other inner class name */
    class CallableC0105f implements Callable<List<MEATERDevice>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z f5526a;

        CallableC0105f(z zVar) {
            this.f5526a = zVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<MEATERDevice> call() {
            Cursor cursorB = C4475b.b(f.this.f5519a, this.f5526a, false, null);
            try {
                int iD = C4474a.d(cursorB, "isModified");
                int iD2 = C4474a.d(cursorB, "deviceID");
                int iD3 = C4474a.d(cursorB, "macAddress");
                int iD4 = C4474a.d(cursorB, "parentDeviceID");
                int iD5 = C4474a.d(cursorB, "probeNumber");
                int iD6 = C4474a.d(cursorB, "clipNumber");
                int iD7 = C4474a.d(cursorB, "datePaired");
                int iD8 = C4474a.d(cursorB, "firmwareRevision");
                int iD9 = C4474a.d(cursorB, "batteryLevel");
                int iD10 = C4474a.d(cursorB, "haveNotifiedUserOfLowBattery");
                int iD11 = C4474a.d(cursorB, "haveNotifiedUserOfEmptyBattery");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    MEATERDevice mEATERDevice = new MEATERDevice();
                    mEATERDevice.setModified(cursorB.getInt(iD) != 0);
                    int i10 = iD;
                    mEATERDevice.setDeviceID(cursorB.getLong(iD2));
                    mEATERDevice.setMacAddress(cursorB.isNull(iD3) ? null : cursorB.getString(iD3));
                    mEATERDevice.setParentDeviceID(cursorB.getLong(iD4));
                    mEATERDevice.setProbeNumber(cursorB.getInt(iD5));
                    mEATERDevice.setClipNumber(cursorB.getInt(iD6));
                    mEATERDevice.setDatePaired(cursorB.isNull(iD7) ? null : Long.valueOf(cursorB.getLong(iD7)));
                    mEATERDevice.setFirmwareRevision(cursorB.isNull(iD8) ? null : cursorB.getString(iD8));
                    mEATERDevice.setBatteryLevel(cursorB.getInt(iD9));
                    mEATERDevice.setHaveNotifiedUserOfLowBattery(cursorB.getInt(iD10) != 0);
                    mEATERDevice.setHaveNotifiedUserOfEmptyBattery(cursorB.getInt(iD11) != 0);
                    arrayList.add(mEATERDevice);
                    iD = i10;
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f5526a.f();
        }
    }

    /* compiled from: MEATERDeviceDAO_Impl.java */
    class g implements Callable<MEATERDevice> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z f5528a;

        g(z zVar) {
            this.f5528a = zVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MEATERDevice call() {
            MEATERDevice mEATERDevice;
            Cursor cursorB = C4475b.b(f.this.f5519a, this.f5528a, false, null);
            try {
                int iD = C4474a.d(cursorB, "isModified");
                int iD2 = C4474a.d(cursorB, "deviceID");
                int iD3 = C4474a.d(cursorB, "macAddress");
                int iD4 = C4474a.d(cursorB, "parentDeviceID");
                int iD5 = C4474a.d(cursorB, "probeNumber");
                int iD6 = C4474a.d(cursorB, "clipNumber");
                int iD7 = C4474a.d(cursorB, "datePaired");
                int iD8 = C4474a.d(cursorB, "firmwareRevision");
                int iD9 = C4474a.d(cursorB, "batteryLevel");
                int iD10 = C4474a.d(cursorB, "haveNotifiedUserOfLowBattery");
                int iD11 = C4474a.d(cursorB, "haveNotifiedUserOfEmptyBattery");
                if (cursorB.moveToFirst()) {
                    MEATERDevice mEATERDevice2 = new MEATERDevice();
                    mEATERDevice2.setModified(cursorB.getInt(iD) != 0);
                    mEATERDevice2.setDeviceID(cursorB.getLong(iD2));
                    mEATERDevice2.setMacAddress(cursorB.isNull(iD3) ? null : cursorB.getString(iD3));
                    mEATERDevice2.setParentDeviceID(cursorB.getLong(iD4));
                    mEATERDevice2.setProbeNumber(cursorB.getInt(iD5));
                    mEATERDevice2.setClipNumber(cursorB.getInt(iD6));
                    mEATERDevice2.setDatePaired(cursorB.isNull(iD7) ? null : Long.valueOf(cursorB.getLong(iD7)));
                    mEATERDevice2.setFirmwareRevision(cursorB.isNull(iD8) ? null : cursorB.getString(iD8));
                    mEATERDevice2.setBatteryLevel(cursorB.getInt(iD9));
                    mEATERDevice2.setHaveNotifiedUserOfLowBattery(cursorB.getInt(iD10) != 0);
                    mEATERDevice2.setHaveNotifiedUserOfEmptyBattery(cursorB.getInt(iD11) != 0);
                    mEATERDevice = mEATERDevice2;
                } else {
                    mEATERDevice = null;
                }
                return mEATERDevice;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f5528a.f();
        }
    }

    public f(w wVar) {
        this.f5519a = wVar;
        this.f5520b = new a(this, wVar);
        this.f5521c = new b(this, wVar);
        this.f5522d = new c(this, wVar);
        this.f5523e = new d(this, wVar);
    }

    public static List<Class<?>> j() {
        return Collections.emptyList();
    }

    @Override // H4.e
    public List<MEATERDevice> a() {
        int i10;
        boolean z10;
        z zVarC = z.c("SELECT * FROM MEATERDevice", 0);
        this.f5519a.assertNotSuspendingTransaction();
        Cursor cursorB = C4475b.b(this.f5519a, zVarC, false, null);
        try {
            int iD = C4474a.d(cursorB, "isModified");
            int iD2 = C4474a.d(cursorB, "deviceID");
            int iD3 = C4474a.d(cursorB, "macAddress");
            int iD4 = C4474a.d(cursorB, "parentDeviceID");
            int iD5 = C4474a.d(cursorB, "probeNumber");
            int iD6 = C4474a.d(cursorB, "clipNumber");
            int iD7 = C4474a.d(cursorB, "datePaired");
            int iD8 = C4474a.d(cursorB, "firmwareRevision");
            int iD9 = C4474a.d(cursorB, "batteryLevel");
            int iD10 = C4474a.d(cursorB, "haveNotifiedUserOfLowBattery");
            int iD11 = C4474a.d(cursorB, "haveNotifiedUserOfEmptyBattery");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                MEATERDevice mEATERDevice = new MEATERDevice();
                if (cursorB.getInt(iD) != 0) {
                    i10 = iD;
                    z10 = true;
                } else {
                    i10 = iD;
                    z10 = false;
                }
                mEATERDevice.setModified(z10);
                mEATERDevice.setDeviceID(cursorB.getLong(iD2));
                mEATERDevice.setMacAddress(cursorB.isNull(iD3) ? null : cursorB.getString(iD3));
                mEATERDevice.setParentDeviceID(cursorB.getLong(iD4));
                mEATERDevice.setProbeNumber(cursorB.getInt(iD5));
                mEATERDevice.setClipNumber(cursorB.getInt(iD6));
                mEATERDevice.setDatePaired(cursorB.isNull(iD7) ? null : Long.valueOf(cursorB.getLong(iD7)));
                mEATERDevice.setFirmwareRevision(cursorB.isNull(iD8) ? null : cursorB.getString(iD8));
                mEATERDevice.setBatteryLevel(cursorB.getInt(iD9));
                mEATERDevice.setHaveNotifiedUserOfLowBattery(cursorB.getInt(iD10) != 0);
                mEATERDevice.setHaveNotifiedUserOfEmptyBattery(cursorB.getInt(iD11) != 0);
                arrayList.add(mEATERDevice);
                iD = i10;
            }
            return arrayList;
        } finally {
            cursorB.close();
            zVarC.f();
        }
    }

    @Override // H4.e
    public B<List<MEATERDevice>> b() {
        return this.f5519a.getInvalidationTracker().e(new String[]{"MEATERDevice"}, false, new e(z.c("SELECT * FROM MEATERDevice", 0)));
    }

    @Override // H4.e
    public void c() {
        this.f5519a.assertNotSuspendingTransaction();
        u3.k kVarB = this.f5523e.b();
        try {
            this.f5519a.beginTransaction();
            try {
                kVarB.R();
                this.f5519a.setTransactionSuccessful();
            } finally {
                this.f5519a.endTransaction();
            }
        } finally {
            this.f5523e.h(kVarB);
        }
    }

    @Override // H4.e
    public B<MEATERDevice> d(long j10) {
        z zVarC = z.c("SELECT * FROM MEATERDevice where deviceID = ?", 1);
        zVarC.s0(1, j10);
        return this.f5519a.getInvalidationTracker().e(new String[]{"MEATERDevice"}, false, new g(zVarC));
    }

    @Override // H4.e
    public void e(MEATERDevice mEATERDevice) {
        this.f5519a.assertNotSuspendingTransaction();
        this.f5519a.beginTransaction();
        try {
            this.f5520b.j(mEATERDevice);
            this.f5519a.setTransactionSuccessful();
        } finally {
            this.f5519a.endTransaction();
        }
    }

    @Override // H4.e
    public B<List<MEATERDevice>> f() {
        return this.f5519a.getInvalidationTracker().e(new String[]{"MEATERDevice"}, false, new CallableC0105f(z.c("SELECT * FROM MEATERDevice where datePaired != null", 0)));
    }

    @Override // H4.e
    public void h(MEATERDevice... mEATERDeviceArr) {
        this.f5519a.assertNotSuspendingTransaction();
        this.f5519a.beginTransaction();
        try {
            this.f5522d.k(mEATERDeviceArr);
            this.f5519a.setTransactionSuccessful();
        } finally {
            this.f5519a.endTransaction();
        }
    }
}
