package H4;

import android.database.Cursor;
import androidx.room.F;
import androidx.room.w;
import androidx.room.z;
import com.apptionlabs.meater_app.model.CalibrationCertificate;
import com.apptionlabs.meater_app.model.MEATERTypeConverters;
import java.util.Collections;
import java.util.List;
import s3.C4474a;
import s3.C4475b;

/* compiled from: CalibrationCertificateDAO_Impl.java */
/* loaded from: classes.dex */
public final class b implements H4.a {

    /* renamed from: a, reason: collision with root package name */
    private final w f5506a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.room.k<CalibrationCertificate> f5507b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.room.j<CalibrationCertificate> f5508c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.room.j<CalibrationCertificate> f5509d;

    /* renamed from: e, reason: collision with root package name */
    private final F f5510e;

    /* renamed from: f, reason: collision with root package name */
    private final F f5511f;

    /* compiled from: CalibrationCertificateDAO_Impl.java */
    class a extends androidx.room.k<CalibrationCertificate> {
        a(b bVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        protected String e() {
            return "INSERT OR REPLACE INTO `CalibrationCertificate` (`secureID`,`bath0C`,`bath100C`,`bath50C`,`macAddress`,`sensorResistances`,`testDateTime`) VALUES (?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.k
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(u3.k kVar, CalibrationCertificate calibrationCertificate) {
            kVar.J(1, calibrationCertificate.getSecureID());
            if (calibrationCertificate.getBath0C() == null) {
                kVar.W0(2);
            } else {
                kVar.Y(2, calibrationCertificate.getBath0C().floatValue());
            }
            if (calibrationCertificate.getBath100C() == null) {
                kVar.W0(3);
            } else {
                kVar.Y(3, calibrationCertificate.getBath100C().floatValue());
            }
            if (calibrationCertificate.getBath50C() == null) {
                kVar.W0(4);
            } else {
                kVar.Y(4, calibrationCertificate.getBath50C().floatValue());
            }
            kVar.J(5, calibrationCertificate.getMacAddress());
            kVar.J(6, MEATERTypeConverters.sensorResistanceListToString(calibrationCertificate.getSensorResistances()));
            kVar.J(7, calibrationCertificate.getTestDateTime());
        }
    }

    /* compiled from: CalibrationCertificateDAO_Impl.java */
    /* renamed from: H4.b$b, reason: collision with other inner class name */
    class C0103b extends androidx.room.j<CalibrationCertificate> {
        C0103b(b bVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        protected String e() {
            return "DELETE FROM `CalibrationCertificate` WHERE `secureID` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(u3.k kVar, CalibrationCertificate calibrationCertificate) {
            kVar.J(1, calibrationCertificate.getSecureID());
        }
    }

    /* compiled from: CalibrationCertificateDAO_Impl.java */
    class c extends androidx.room.j<CalibrationCertificate> {
        c(b bVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        protected String e() {
            return "UPDATE OR ABORT `CalibrationCertificate` SET `secureID` = ?,`bath0C` = ?,`bath100C` = ?,`bath50C` = ?,`macAddress` = ?,`sensorResistances` = ?,`testDateTime` = ? WHERE `secureID` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(u3.k kVar, CalibrationCertificate calibrationCertificate) {
            kVar.J(1, calibrationCertificate.getSecureID());
            if (calibrationCertificate.getBath0C() == null) {
                kVar.W0(2);
            } else {
                kVar.Y(2, calibrationCertificate.getBath0C().floatValue());
            }
            if (calibrationCertificate.getBath100C() == null) {
                kVar.W0(3);
            } else {
                kVar.Y(3, calibrationCertificate.getBath100C().floatValue());
            }
            if (calibrationCertificate.getBath50C() == null) {
                kVar.W0(4);
            } else {
                kVar.Y(4, calibrationCertificate.getBath50C().floatValue());
            }
            kVar.J(5, calibrationCertificate.getMacAddress());
            kVar.J(6, MEATERTypeConverters.sensorResistanceListToString(calibrationCertificate.getSensorResistances()));
            kVar.J(7, calibrationCertificate.getTestDateTime());
            kVar.J(8, calibrationCertificate.getSecureID());
        }
    }

    /* compiled from: CalibrationCertificateDAO_Impl.java */
    class d extends F {
        d(b bVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        public String e() {
            return "delete from CalibrationCertificate";
        }
    }

    /* compiled from: CalibrationCertificateDAO_Impl.java */
    class e extends F {
        e(b bVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        public String e() {
            return "delete from CalibrationCertificate where secureID = ? ";
        }
    }

    public b(w wVar) {
        this.f5506a = wVar;
        this.f5507b = new a(this, wVar);
        this.f5508c = new C0103b(this, wVar);
        this.f5509d = new c(this, wVar);
        this.f5510e = new d(this, wVar);
        this.f5511f = new e(this, wVar);
    }

    public static List<Class<?>> c() {
        return Collections.emptyList();
    }

    @Override // H4.a
    public void a(CalibrationCertificate calibrationCertificate) {
        this.f5506a.assertNotSuspendingTransaction();
        this.f5506a.beginTransaction();
        try {
            this.f5507b.j(calibrationCertificate);
            this.f5506a.setTransactionSuccessful();
        } finally {
            this.f5506a.endTransaction();
        }
    }

    @Override // H4.a
    public CalibrationCertificate b(String str) {
        z zVarC = z.c("SELECT * FROM CalibrationCertificate WHERE secureID = ?", 1);
        zVarC.J(1, str);
        this.f5506a.assertNotSuspendingTransaction();
        CalibrationCertificate calibrationCertificate = null;
        Float fValueOf = null;
        Cursor cursorB = C4475b.b(this.f5506a, zVarC, false, null);
        try {
            int iD = C4474a.d(cursorB, "secureID");
            int iD2 = C4474a.d(cursorB, "bath0C");
            int iD3 = C4474a.d(cursorB, "bath100C");
            int iD4 = C4474a.d(cursorB, "bath50C");
            int iD5 = C4474a.d(cursorB, "macAddress");
            int iD6 = C4474a.d(cursorB, "sensorResistances");
            int iD7 = C4474a.d(cursorB, "testDateTime");
            if (cursorB.moveToFirst()) {
                CalibrationCertificate calibrationCertificate2 = new CalibrationCertificate();
                calibrationCertificate2.setSecureID(cursorB.getString(iD));
                calibrationCertificate2.setBath0C(cursorB.isNull(iD2) ? null : Float.valueOf(cursorB.getFloat(iD2)));
                calibrationCertificate2.setBath100C(cursorB.isNull(iD3) ? null : Float.valueOf(cursorB.getFloat(iD3)));
                if (!cursorB.isNull(iD4)) {
                    fValueOf = Float.valueOf(cursorB.getFloat(iD4));
                }
                calibrationCertificate2.setBath50C(fValueOf);
                calibrationCertificate2.setMacAddress(cursorB.getString(iD5));
                calibrationCertificate2.setSensorResistances(MEATERTypeConverters.stringToSensorResistanceList(cursorB.getString(iD6)));
                calibrationCertificate2.setTestDateTime(cursorB.getString(iD7));
                calibrationCertificate = calibrationCertificate2;
            }
            return calibrationCertificate;
        } finally {
            cursorB.close();
            zVarC.f();
        }
    }
}
