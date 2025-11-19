package H4;

import android.database.Cursor;
import androidx.room.F;
import androidx.room.w;
import androidx.room.z;
import com.apptionlabs.meater_app.model.MEATERTypeConverters;
import com.apptionlabs.meater_app.model.SavedCook;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s3.C4474a;
import s3.C4475b;

/* compiled from: SavedCookDAO_Impl.java */
/* loaded from: classes.dex */
public final class n extends m {

    /* renamed from: a, reason: collision with root package name */
    private final w f5550a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.room.k<SavedCook> f5551b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.room.j<SavedCook> f5552c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.room.j<SavedCook> f5553d;

    /* renamed from: e, reason: collision with root package name */
    private final F f5554e;

    /* compiled from: SavedCookDAO_Impl.java */
    class a extends androidx.room.k<SavedCook> {
        a(n nVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        protected String e() {
            return "INSERT OR REPLACE INTO `SavedCook` (`cookID`,`isFavourite`,`cookStartTime`,`targetMinimumAmbientTemperature`,`targetMaximumAmbientTemperature`,`targetTemperature`,`peakTemperature`,`cookName`,`cookTime`,`cutId`,`cookPresetId`,`alerts`,`temperatureLog`,`isModified`,`needs_deleting`,`feedback`,`needs_uploading`,`cook_probe_number`,`cook_device_id`,`updated_at`,`cook_state`,`is_finished`,`parentDeviceID`,`parentProbeNumber`,`clipNumber`,`firmwareRevision`,`parentFirmwareRevision`,`setupSeqNum`,`recipeID`,`dropInTempBeforeReady`,`secondsDelayBeforeReady`,`secondsDelayBeforeResting`,`temperatureOffsetBeforeRemoveFromHeat`,`onGoingRecipeID`,`stepID`,`cooking_appliance`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.k
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(u3.k kVar, SavedCook savedCook) {
            kVar.s0(1, savedCook.getCookID());
            kVar.s0(2, savedCook.isFavourite() ? 1L : 0L);
            kVar.s0(3, savedCook.getCookStartTime());
            kVar.s0(4, savedCook.getTargetMinimumAmbientTemperature());
            kVar.s0(5, savedCook.getTargetMaximumAmbientTemperature());
            kVar.s0(6, savedCook.getTargetTemperature());
            kVar.s0(7, savedCook.getPeakTemperature());
            if (savedCook.getCookName() == null) {
                kVar.W0(8);
            } else {
                kVar.J(8, savedCook.getCookName());
            }
            kVar.s0(9, savedCook.getCookTime());
            kVar.s0(10, savedCook.getCutId());
            kVar.s0(11, savedCook.getCookPresetId());
            kVar.J(12, MEATERTypeConverters.alertListToString(savedCook.getAlerts()));
            kVar.J(13, MEATERTypeConverters.temperatureLogToString(savedCook.getTemperatureLog()));
            kVar.s0(14, savedCook.isModified() ? 1L : 0L);
            kVar.s0(15, savedCook.isNeedsDeleting() ? 1L : 0L);
            kVar.s0(16, savedCook.getFeedback());
            kVar.s0(17, savedCook.isNeedsUploading() ? 1L : 0L);
            kVar.s0(18, savedCook.getProbeNumber());
            kVar.s0(19, savedCook.getCookDeviceId());
            kVar.s0(20, savedCook.getUpdatedAt());
            kVar.s0(21, savedCook.getCookState());
            kVar.s0(22, savedCook.isFinished() ? 1L : 0L);
            kVar.s0(23, savedCook.getParentDeviceID());
            kVar.s0(24, savedCook.getParentProbeNumber());
            kVar.s0(25, savedCook.getClipNumber());
            if (savedCook.getFirmwareRevision() == null) {
                kVar.W0(26);
            } else {
                kVar.J(26, savedCook.getFirmwareRevision());
            }
            if (savedCook.getParentFirmwareRevision() == null) {
                kVar.W0(27);
            } else {
                kVar.J(27, savedCook.getParentFirmwareRevision());
            }
            kVar.s0(28, savedCook.getSetupSeqNum());
            kVar.s0(29, savedCook.getRecipeID());
            kVar.s0(30, savedCook.getTemperatureChangeBeforeReady());
            kVar.s0(31, savedCook.getSecondsDelayBeforeReady());
            kVar.s0(32, savedCook.getSecondsDelayBeforeResting());
            kVar.s0(33, savedCook.getTemperatureOffsetBeforeRemoveFromHeat());
            kVar.s0(34, savedCook.getOnGoingRecipeID());
            kVar.s0(35, savedCook.getStepID());
            kVar.s0(36, savedCook.getCookingAppliance());
        }
    }

    /* compiled from: SavedCookDAO_Impl.java */
    class b extends androidx.room.j<SavedCook> {
        b(n nVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        protected String e() {
            return "DELETE FROM `SavedCook` WHERE `cookID` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(u3.k kVar, SavedCook savedCook) {
            kVar.s0(1, savedCook.getCookID());
        }
    }

    /* compiled from: SavedCookDAO_Impl.java */
    class c extends androidx.room.j<SavedCook> {
        c(n nVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        protected String e() {
            return "UPDATE OR ABORT `SavedCook` SET `cookID` = ?,`isFavourite` = ?,`cookStartTime` = ?,`targetMinimumAmbientTemperature` = ?,`targetMaximumAmbientTemperature` = ?,`targetTemperature` = ?,`peakTemperature` = ?,`cookName` = ?,`cookTime` = ?,`cutId` = ?,`cookPresetId` = ?,`alerts` = ?,`temperatureLog` = ?,`isModified` = ?,`needs_deleting` = ?,`feedback` = ?,`needs_uploading` = ?,`cook_probe_number` = ?,`cook_device_id` = ?,`updated_at` = ?,`cook_state` = ?,`is_finished` = ?,`parentDeviceID` = ?,`parentProbeNumber` = ?,`clipNumber` = ?,`firmwareRevision` = ?,`parentFirmwareRevision` = ?,`setupSeqNum` = ?,`recipeID` = ?,`dropInTempBeforeReady` = ?,`secondsDelayBeforeReady` = ?,`secondsDelayBeforeResting` = ?,`temperatureOffsetBeforeRemoveFromHeat` = ?,`onGoingRecipeID` = ?,`stepID` = ?,`cooking_appliance` = ? WHERE `cookID` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(u3.k kVar, SavedCook savedCook) {
            kVar.s0(1, savedCook.getCookID());
            kVar.s0(2, savedCook.isFavourite() ? 1L : 0L);
            kVar.s0(3, savedCook.getCookStartTime());
            kVar.s0(4, savedCook.getTargetMinimumAmbientTemperature());
            kVar.s0(5, savedCook.getTargetMaximumAmbientTemperature());
            kVar.s0(6, savedCook.getTargetTemperature());
            kVar.s0(7, savedCook.getPeakTemperature());
            if (savedCook.getCookName() == null) {
                kVar.W0(8);
            } else {
                kVar.J(8, savedCook.getCookName());
            }
            kVar.s0(9, savedCook.getCookTime());
            kVar.s0(10, savedCook.getCutId());
            kVar.s0(11, savedCook.getCookPresetId());
            kVar.J(12, MEATERTypeConverters.alertListToString(savedCook.getAlerts()));
            kVar.J(13, MEATERTypeConverters.temperatureLogToString(savedCook.getTemperatureLog()));
            kVar.s0(14, savedCook.isModified() ? 1L : 0L);
            kVar.s0(15, savedCook.isNeedsDeleting() ? 1L : 0L);
            kVar.s0(16, savedCook.getFeedback());
            kVar.s0(17, savedCook.isNeedsUploading() ? 1L : 0L);
            kVar.s0(18, savedCook.getProbeNumber());
            kVar.s0(19, savedCook.getCookDeviceId());
            kVar.s0(20, savedCook.getUpdatedAt());
            kVar.s0(21, savedCook.getCookState());
            kVar.s0(22, savedCook.isFinished() ? 1L : 0L);
            kVar.s0(23, savedCook.getParentDeviceID());
            kVar.s0(24, savedCook.getParentProbeNumber());
            kVar.s0(25, savedCook.getClipNumber());
            if (savedCook.getFirmwareRevision() == null) {
                kVar.W0(26);
            } else {
                kVar.J(26, savedCook.getFirmwareRevision());
            }
            if (savedCook.getParentFirmwareRevision() == null) {
                kVar.W0(27);
            } else {
                kVar.J(27, savedCook.getParentFirmwareRevision());
            }
            kVar.s0(28, savedCook.getSetupSeqNum());
            kVar.s0(29, savedCook.getRecipeID());
            kVar.s0(30, savedCook.getTemperatureChangeBeforeReady());
            kVar.s0(31, savedCook.getSecondsDelayBeforeReady());
            kVar.s0(32, savedCook.getSecondsDelayBeforeResting());
            kVar.s0(33, savedCook.getTemperatureOffsetBeforeRemoveFromHeat());
            kVar.s0(34, savedCook.getOnGoingRecipeID());
            kVar.s0(35, savedCook.getStepID());
            kVar.s0(36, savedCook.getCookingAppliance());
            kVar.s0(37, savedCook.getCookID());
        }
    }

    /* compiled from: SavedCookDAO_Impl.java */
    class d extends F {
        d(n nVar, w wVar) {
            super(wVar);
        }

        @Override // androidx.room.F
        public String e() {
            return "delete from SavedCook";
        }
    }

    public n(w wVar) {
        this.f5550a = wVar;
        this.f5551b = new a(this, wVar);
        this.f5552c = new b(this, wVar);
        this.f5553d = new c(this, wVar);
        this.f5554e = new d(this, wVar);
    }

    public static List<Class<?>> k() {
        return Collections.emptyList();
    }

    @Override // H4.m
    public List<SavedCook> a() throws Throwable {
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
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        String string;
        String string2;
        z zVarC = z.c("SELECT * FROM SavedCook where  is_finished == 1 ORDER BY cookStartTime Desc", 0);
        this.f5550a.assertNotSuspendingTransaction();
        Cursor cursorB = C4475b.b(this.f5550a, zVarC, false, null);
        try {
            iD = C4474a.d(cursorB, "cookID");
            iD2 = C4474a.d(cursorB, "isFavourite");
            iD3 = C4474a.d(cursorB, "cookStartTime");
            iD4 = C4474a.d(cursorB, "targetMinimumAmbientTemperature");
            iD5 = C4474a.d(cursorB, "targetMaximumAmbientTemperature");
            iD6 = C4474a.d(cursorB, "targetTemperature");
            iD7 = C4474a.d(cursorB, "peakTemperature");
            iD8 = C4474a.d(cursorB, "cookName");
            iD9 = C4474a.d(cursorB, "cookTime");
            iD10 = C4474a.d(cursorB, "cutId");
            iD11 = C4474a.d(cursorB, "cookPresetId");
            iD12 = C4474a.d(cursorB, "alerts");
            iD13 = C4474a.d(cursorB, "temperatureLog");
            iD14 = C4474a.d(cursorB, "isModified");
            zVar = zVarC;
        } catch (Throwable th) {
            th = th;
            zVar = zVarC;
        }
        try {
            int iD15 = C4474a.d(cursorB, "needs_deleting");
            int iD16 = C4474a.d(cursorB, "feedback");
            int iD17 = C4474a.d(cursorB, "needs_uploading");
            int iD18 = C4474a.d(cursorB, "cook_probe_number");
            int iD19 = C4474a.d(cursorB, "cook_device_id");
            int iD20 = C4474a.d(cursorB, "updated_at");
            int iD21 = C4474a.d(cursorB, "cook_state");
            int iD22 = C4474a.d(cursorB, "is_finished");
            int iD23 = C4474a.d(cursorB, "parentDeviceID");
            int iD24 = C4474a.d(cursorB, "parentProbeNumber");
            int iD25 = C4474a.d(cursorB, "clipNumber");
            int iD26 = C4474a.d(cursorB, "firmwareRevision");
            int iD27 = C4474a.d(cursorB, "parentFirmwareRevision");
            int iD28 = C4474a.d(cursorB, "setupSeqNum");
            int iD29 = C4474a.d(cursorB, "recipeID");
            int iD30 = C4474a.d(cursorB, "dropInTempBeforeReady");
            int iD31 = C4474a.d(cursorB, "secondsDelayBeforeReady");
            int iD32 = C4474a.d(cursorB, "secondsDelayBeforeResting");
            int iD33 = C4474a.d(cursorB, "temperatureOffsetBeforeRemoveFromHeat");
            int iD34 = C4474a.d(cursorB, "onGoingRecipeID");
            int iD35 = C4474a.d(cursorB, "stepID");
            int iD36 = C4474a.d(cursorB, "cooking_appliance");
            int i13 = iD14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                SavedCook savedCook = new SavedCook();
                ArrayList arrayList2 = arrayList;
                int i14 = iD13;
                savedCook.setCookID(cursorB.getLong(iD));
                savedCook.setFavourite(cursorB.getInt(iD2) != 0);
                savedCook.setCookStartTime(cursorB.getLong(iD3));
                savedCook.setTargetMinimumAmbientTemperature(cursorB.getInt(iD4));
                savedCook.setTargetMaximumAmbientTemperature(cursorB.getInt(iD5));
                savedCook.setTargetTemperature(cursorB.getInt(iD6));
                savedCook.setPeakTemperature(cursorB.getInt(iD7));
                savedCook.setCookName(cursorB.isNull(iD8) ? null : cursorB.getString(iD8));
                savedCook.setCookTime(cursorB.getLong(iD9));
                savedCook.setCutId(cursorB.getInt(iD10));
                savedCook.setCookPresetId(cursorB.getInt(iD11));
                savedCook.setAlerts(MEATERTypeConverters.stringToAlertList(cursorB.getString(iD12)));
                savedCook.setTemperatureLog(MEATERTypeConverters.stringToTemperatureHighResLog(cursorB.getString(i14)));
                int i15 = i13;
                if (cursorB.getInt(i15) != 0) {
                    i10 = iD;
                    z10 = true;
                } else {
                    i10 = iD;
                    z10 = false;
                }
                savedCook.setModified(z10);
                int i16 = iD15;
                if (cursorB.getInt(i16) != 0) {
                    iD15 = i16;
                    z11 = true;
                } else {
                    iD15 = i16;
                    z11 = false;
                }
                savedCook.setNeedsDeleting(z11);
                int i17 = iD16;
                int i18 = iD12;
                savedCook.setFeedback(cursorB.getInt(i17));
                int i19 = iD17;
                if (cursorB.getInt(i19) != 0) {
                    i11 = i17;
                    z12 = true;
                } else {
                    i11 = i17;
                    z12 = false;
                }
                savedCook.setNeedsUploading(z12);
                int i20 = iD18;
                savedCook.setProbeNumber(cursorB.getInt(i20));
                int i21 = iD19;
                savedCook.setCookDeviceId(cursorB.getLong(i21));
                int i22 = iD2;
                int i23 = iD20;
                int i24 = iD3;
                savedCook.setUpdatedAt(cursorB.getLong(i23));
                int i25 = iD21;
                savedCook.setCookState(cursorB.getInt(i25));
                int i26 = iD22;
                if (cursorB.getInt(i26) != 0) {
                    i12 = i20;
                    z13 = true;
                } else {
                    i12 = i20;
                    z13 = false;
                }
                savedCook.setFinished(z13);
                int i27 = iD23;
                savedCook.setParentDeviceID(cursorB.getLong(i27));
                int i28 = iD24;
                savedCook.setParentProbeNumber(cursorB.getInt(i28));
                int i29 = iD25;
                savedCook.setClipNumber(cursorB.getInt(i29));
                int i30 = iD26;
                if (cursorB.isNull(i30)) {
                    iD26 = i30;
                    string = null;
                } else {
                    iD26 = i30;
                    string = cursorB.getString(i30);
                }
                savedCook.setFirmwareRevision(string);
                int i31 = iD27;
                if (cursorB.isNull(i31)) {
                    iD27 = i31;
                    string2 = null;
                } else {
                    iD27 = i31;
                    string2 = cursorB.getString(i31);
                }
                savedCook.setParentFirmwareRevision(string2);
                int i32 = iD28;
                savedCook.setSetupSeqNum(cursorB.getInt(i32));
                int i33 = iD29;
                savedCook.setRecipeID(cursorB.getLong(i33));
                int i34 = iD30;
                savedCook.setTemperatureChangeBeforeReady(cursorB.getInt(i34));
                int i35 = iD31;
                savedCook.setSecondsDelayBeforeReady(cursorB.getInt(i35));
                int i36 = iD32;
                savedCook.setSecondsDelayBeforeResting(cursorB.getInt(i36));
                iD32 = i36;
                int i37 = iD33;
                savedCook.setTemperatureOffsetBeforeRemoveFromHeat(cursorB.getInt(i37));
                int i38 = iD34;
                savedCook.setOnGoingRecipeID(cursorB.getLong(i38));
                int i39 = iD35;
                savedCook.setStepID(cursorB.getInt(i39));
                int i40 = iD36;
                savedCook.setCookingAppliance(cursorB.getInt(i40));
                arrayList2.add(savedCook);
                iD36 = i40;
                arrayList = arrayList2;
                iD = i10;
                i13 = i15;
                iD19 = i21;
                iD22 = i26;
                iD3 = i24;
                iD20 = i23;
                iD23 = i27;
                iD24 = i28;
                iD25 = i29;
                iD29 = i33;
                iD31 = i35;
                iD13 = i14;
                iD35 = i39;
                iD12 = i18;
                iD16 = i11;
                iD17 = i19;
                iD18 = i12;
                iD21 = i25;
                iD2 = i22;
                iD28 = i32;
                iD30 = i34;
                iD33 = i37;
                iD34 = i38;
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

    @Override // H4.m
    public List<SavedCook> b(int i10) throws Throwable {
        z zVar;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        String string;
        String string2;
        z zVarC = z.c("SELECT * FROM SavedCook where needs_uploading == 1 and (cookTime >= (5*60) and peakTemperature >= ?)", 1);
        zVarC.s0(1, i10);
        this.f5550a.assertNotSuspendingTransaction();
        Cursor cursorB = C4475b.b(this.f5550a, zVarC, false, null);
        try {
            int iD = C4474a.d(cursorB, "cookID");
            int iD2 = C4474a.d(cursorB, "isFavourite");
            int iD3 = C4474a.d(cursorB, "cookStartTime");
            int iD4 = C4474a.d(cursorB, "targetMinimumAmbientTemperature");
            int iD5 = C4474a.d(cursorB, "targetMaximumAmbientTemperature");
            int iD6 = C4474a.d(cursorB, "targetTemperature");
            int iD7 = C4474a.d(cursorB, "peakTemperature");
            int iD8 = C4474a.d(cursorB, "cookName");
            int iD9 = C4474a.d(cursorB, "cookTime");
            int iD10 = C4474a.d(cursorB, "cutId");
            int iD11 = C4474a.d(cursorB, "cookPresetId");
            int iD12 = C4474a.d(cursorB, "alerts");
            int iD13 = C4474a.d(cursorB, "temperatureLog");
            int iD14 = C4474a.d(cursorB, "isModified");
            zVar = zVarC;
            try {
                int iD15 = C4474a.d(cursorB, "needs_deleting");
                int iD16 = C4474a.d(cursorB, "feedback");
                int iD17 = C4474a.d(cursorB, "needs_uploading");
                int iD18 = C4474a.d(cursorB, "cook_probe_number");
                int iD19 = C4474a.d(cursorB, "cook_device_id");
                int iD20 = C4474a.d(cursorB, "updated_at");
                int iD21 = C4474a.d(cursorB, "cook_state");
                int iD22 = C4474a.d(cursorB, "is_finished");
                int iD23 = C4474a.d(cursorB, "parentDeviceID");
                int iD24 = C4474a.d(cursorB, "parentProbeNumber");
                int iD25 = C4474a.d(cursorB, "clipNumber");
                int iD26 = C4474a.d(cursorB, "firmwareRevision");
                int iD27 = C4474a.d(cursorB, "parentFirmwareRevision");
                int iD28 = C4474a.d(cursorB, "setupSeqNum");
                int iD29 = C4474a.d(cursorB, "recipeID");
                int iD30 = C4474a.d(cursorB, "dropInTempBeforeReady");
                int iD31 = C4474a.d(cursorB, "secondsDelayBeforeReady");
                int iD32 = C4474a.d(cursorB, "secondsDelayBeforeResting");
                int iD33 = C4474a.d(cursorB, "temperatureOffsetBeforeRemoveFromHeat");
                int iD34 = C4474a.d(cursorB, "onGoingRecipeID");
                int iD35 = C4474a.d(cursorB, "stepID");
                int iD36 = C4474a.d(cursorB, "cooking_appliance");
                int i14 = iD14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    SavedCook savedCook = new SavedCook();
                    ArrayList arrayList2 = arrayList;
                    int i15 = iD12;
                    savedCook.setCookID(cursorB.getLong(iD));
                    savedCook.setFavourite(cursorB.getInt(iD2) != 0);
                    savedCook.setCookStartTime(cursorB.getLong(iD3));
                    savedCook.setTargetMinimumAmbientTemperature(cursorB.getInt(iD4));
                    savedCook.setTargetMaximumAmbientTemperature(cursorB.getInt(iD5));
                    savedCook.setTargetTemperature(cursorB.getInt(iD6));
                    savedCook.setPeakTemperature(cursorB.getInt(iD7));
                    savedCook.setCookName(cursorB.isNull(iD8) ? null : cursorB.getString(iD8));
                    savedCook.setCookTime(cursorB.getLong(iD9));
                    savedCook.setCutId(cursorB.getInt(iD10));
                    savedCook.setCookPresetId(cursorB.getInt(iD11));
                    savedCook.setAlerts(MEATERTypeConverters.stringToAlertList(cursorB.getString(i15)));
                    savedCook.setTemperatureLog(MEATERTypeConverters.stringToTemperatureHighResLog(cursorB.getString(iD13)));
                    int i16 = i14;
                    if (cursorB.getInt(i16) != 0) {
                        i11 = iD;
                        z10 = true;
                    } else {
                        i11 = iD;
                        z10 = false;
                    }
                    savedCook.setModified(z10);
                    int i17 = iD15;
                    if (cursorB.getInt(i17) != 0) {
                        iD15 = i17;
                        z11 = true;
                    } else {
                        iD15 = i17;
                        z11 = false;
                    }
                    savedCook.setNeedsDeleting(z11);
                    int i18 = iD16;
                    int i19 = iD11;
                    savedCook.setFeedback(cursorB.getInt(i18));
                    int i20 = iD17;
                    if (cursorB.getInt(i20) != 0) {
                        i12 = i18;
                        z12 = true;
                    } else {
                        i12 = i18;
                        z12 = false;
                    }
                    savedCook.setNeedsUploading(z12);
                    int i21 = iD18;
                    savedCook.setProbeNumber(cursorB.getInt(i21));
                    int i22 = iD19;
                    savedCook.setCookDeviceId(cursorB.getLong(i22));
                    int i23 = iD20;
                    int i24 = iD13;
                    savedCook.setUpdatedAt(cursorB.getLong(i23));
                    int i25 = iD21;
                    savedCook.setCookState(cursorB.getInt(i25));
                    int i26 = iD22;
                    if (cursorB.getInt(i26) != 0) {
                        i13 = i21;
                        z13 = true;
                    } else {
                        i13 = i21;
                        z13 = false;
                    }
                    savedCook.setFinished(z13);
                    int i27 = iD23;
                    savedCook.setParentDeviceID(cursorB.getLong(i27));
                    int i28 = iD24;
                    savedCook.setParentProbeNumber(cursorB.getInt(i28));
                    int i29 = iD25;
                    savedCook.setClipNumber(cursorB.getInt(i29));
                    int i30 = iD26;
                    if (cursorB.isNull(i30)) {
                        iD26 = i30;
                        string = null;
                    } else {
                        iD26 = i30;
                        string = cursorB.getString(i30);
                    }
                    savedCook.setFirmwareRevision(string);
                    int i31 = iD27;
                    if (cursorB.isNull(i31)) {
                        iD27 = i31;
                        string2 = null;
                    } else {
                        iD27 = i31;
                        string2 = cursorB.getString(i31);
                    }
                    savedCook.setParentFirmwareRevision(string2);
                    int i32 = iD28;
                    savedCook.setSetupSeqNum(cursorB.getInt(i32));
                    int i33 = iD29;
                    savedCook.setRecipeID(cursorB.getLong(i33));
                    int i34 = iD30;
                    savedCook.setTemperatureChangeBeforeReady(cursorB.getInt(i34));
                    int i35 = iD31;
                    savedCook.setSecondsDelayBeforeReady(cursorB.getInt(i35));
                    int i36 = iD32;
                    savedCook.setSecondsDelayBeforeResting(cursorB.getInt(i36));
                    iD32 = i36;
                    int i37 = iD33;
                    savedCook.setTemperatureOffsetBeforeRemoveFromHeat(cursorB.getInt(i37));
                    int i38 = iD34;
                    savedCook.setOnGoingRecipeID(cursorB.getLong(i38));
                    int i39 = iD35;
                    savedCook.setStepID(cursorB.getInt(i39));
                    int i40 = iD36;
                    savedCook.setCookingAppliance(cursorB.getInt(i40));
                    arrayList2.add(savedCook);
                    iD36 = i40;
                    arrayList = arrayList2;
                    iD = i11;
                    i14 = i16;
                    iD19 = i22;
                    iD22 = i26;
                    iD13 = i24;
                    iD20 = i23;
                    iD23 = i27;
                    iD24 = i28;
                    iD25 = i29;
                    iD29 = i33;
                    iD31 = i35;
                    iD12 = i15;
                    iD35 = i39;
                    iD11 = i19;
                    iD16 = i12;
                    iD17 = i20;
                    iD18 = i13;
                    iD21 = i25;
                    iD28 = i32;
                    iD30 = i34;
                    iD33 = i37;
                    iD34 = i38;
                }
                ArrayList arrayList3 = arrayList;
                cursorB.close();
                zVar.f();
                return arrayList3;
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

    @Override // H4.m
    public void c(SavedCook savedCook) {
        this.f5550a.assertNotSuspendingTransaction();
        this.f5550a.beginTransaction();
        try {
            this.f5552c.j(savedCook);
            this.f5550a.setTransactionSuccessful();
        } finally {
            this.f5550a.endTransaction();
        }
    }

    @Override // H4.m
    public void d() {
        this.f5550a.assertNotSuspendingTransaction();
        u3.k kVarB = this.f5554e.b();
        try {
            this.f5550a.beginTransaction();
            try {
                kVarB.R();
                this.f5550a.setTransactionSuccessful();
            } finally {
                this.f5550a.endTransaction();
            }
        } finally {
            this.f5554e.h(kVarB);
        }
    }

    @Override // H4.m
    public List<SavedCook> e() throws Throwable {
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
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        String string;
        String string2;
        z zVarC = z.c("SELECT * FROM SavedCook where updated_at == 0 AND isFavourite == 1", 0);
        this.f5550a.assertNotSuspendingTransaction();
        Cursor cursorB = C4475b.b(this.f5550a, zVarC, false, null);
        try {
            iD = C4474a.d(cursorB, "cookID");
            iD2 = C4474a.d(cursorB, "isFavourite");
            iD3 = C4474a.d(cursorB, "cookStartTime");
            iD4 = C4474a.d(cursorB, "targetMinimumAmbientTemperature");
            iD5 = C4474a.d(cursorB, "targetMaximumAmbientTemperature");
            iD6 = C4474a.d(cursorB, "targetTemperature");
            iD7 = C4474a.d(cursorB, "peakTemperature");
            iD8 = C4474a.d(cursorB, "cookName");
            iD9 = C4474a.d(cursorB, "cookTime");
            iD10 = C4474a.d(cursorB, "cutId");
            iD11 = C4474a.d(cursorB, "cookPresetId");
            iD12 = C4474a.d(cursorB, "alerts");
            iD13 = C4474a.d(cursorB, "temperatureLog");
            iD14 = C4474a.d(cursorB, "isModified");
            zVar = zVarC;
        } catch (Throwable th) {
            th = th;
            zVar = zVarC;
        }
        try {
            int iD15 = C4474a.d(cursorB, "needs_deleting");
            int iD16 = C4474a.d(cursorB, "feedback");
            int iD17 = C4474a.d(cursorB, "needs_uploading");
            int iD18 = C4474a.d(cursorB, "cook_probe_number");
            int iD19 = C4474a.d(cursorB, "cook_device_id");
            int iD20 = C4474a.d(cursorB, "updated_at");
            int iD21 = C4474a.d(cursorB, "cook_state");
            int iD22 = C4474a.d(cursorB, "is_finished");
            int iD23 = C4474a.d(cursorB, "parentDeviceID");
            int iD24 = C4474a.d(cursorB, "parentProbeNumber");
            int iD25 = C4474a.d(cursorB, "clipNumber");
            int iD26 = C4474a.d(cursorB, "firmwareRevision");
            int iD27 = C4474a.d(cursorB, "parentFirmwareRevision");
            int iD28 = C4474a.d(cursorB, "setupSeqNum");
            int iD29 = C4474a.d(cursorB, "recipeID");
            int iD30 = C4474a.d(cursorB, "dropInTempBeforeReady");
            int iD31 = C4474a.d(cursorB, "secondsDelayBeforeReady");
            int iD32 = C4474a.d(cursorB, "secondsDelayBeforeResting");
            int iD33 = C4474a.d(cursorB, "temperatureOffsetBeforeRemoveFromHeat");
            int iD34 = C4474a.d(cursorB, "onGoingRecipeID");
            int iD35 = C4474a.d(cursorB, "stepID");
            int iD36 = C4474a.d(cursorB, "cooking_appliance");
            int i13 = iD14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                SavedCook savedCook = new SavedCook();
                ArrayList arrayList2 = arrayList;
                int i14 = iD13;
                savedCook.setCookID(cursorB.getLong(iD));
                savedCook.setFavourite(cursorB.getInt(iD2) != 0);
                savedCook.setCookStartTime(cursorB.getLong(iD3));
                savedCook.setTargetMinimumAmbientTemperature(cursorB.getInt(iD4));
                savedCook.setTargetMaximumAmbientTemperature(cursorB.getInt(iD5));
                savedCook.setTargetTemperature(cursorB.getInt(iD6));
                savedCook.setPeakTemperature(cursorB.getInt(iD7));
                savedCook.setCookName(cursorB.isNull(iD8) ? null : cursorB.getString(iD8));
                savedCook.setCookTime(cursorB.getLong(iD9));
                savedCook.setCutId(cursorB.getInt(iD10));
                savedCook.setCookPresetId(cursorB.getInt(iD11));
                savedCook.setAlerts(MEATERTypeConverters.stringToAlertList(cursorB.getString(iD12)));
                savedCook.setTemperatureLog(MEATERTypeConverters.stringToTemperatureHighResLog(cursorB.getString(i14)));
                int i15 = i13;
                if (cursorB.getInt(i15) != 0) {
                    i10 = iD;
                    z10 = true;
                } else {
                    i10 = iD;
                    z10 = false;
                }
                savedCook.setModified(z10);
                int i16 = iD15;
                if (cursorB.getInt(i16) != 0) {
                    iD15 = i16;
                    z11 = true;
                } else {
                    iD15 = i16;
                    z11 = false;
                }
                savedCook.setNeedsDeleting(z11);
                int i17 = iD16;
                int i18 = iD12;
                savedCook.setFeedback(cursorB.getInt(i17));
                int i19 = iD17;
                if (cursorB.getInt(i19) != 0) {
                    i11 = i17;
                    z12 = true;
                } else {
                    i11 = i17;
                    z12 = false;
                }
                savedCook.setNeedsUploading(z12);
                int i20 = iD18;
                savedCook.setProbeNumber(cursorB.getInt(i20));
                int i21 = iD19;
                savedCook.setCookDeviceId(cursorB.getLong(i21));
                int i22 = iD2;
                int i23 = iD20;
                int i24 = iD3;
                savedCook.setUpdatedAt(cursorB.getLong(i23));
                int i25 = iD21;
                savedCook.setCookState(cursorB.getInt(i25));
                int i26 = iD22;
                if (cursorB.getInt(i26) != 0) {
                    i12 = i20;
                    z13 = true;
                } else {
                    i12 = i20;
                    z13 = false;
                }
                savedCook.setFinished(z13);
                int i27 = iD23;
                savedCook.setParentDeviceID(cursorB.getLong(i27));
                int i28 = iD24;
                savedCook.setParentProbeNumber(cursorB.getInt(i28));
                int i29 = iD25;
                savedCook.setClipNumber(cursorB.getInt(i29));
                int i30 = iD26;
                if (cursorB.isNull(i30)) {
                    iD26 = i30;
                    string = null;
                } else {
                    iD26 = i30;
                    string = cursorB.getString(i30);
                }
                savedCook.setFirmwareRevision(string);
                int i31 = iD27;
                if (cursorB.isNull(i31)) {
                    iD27 = i31;
                    string2 = null;
                } else {
                    iD27 = i31;
                    string2 = cursorB.getString(i31);
                }
                savedCook.setParentFirmwareRevision(string2);
                int i32 = iD28;
                savedCook.setSetupSeqNum(cursorB.getInt(i32));
                int i33 = iD29;
                savedCook.setRecipeID(cursorB.getLong(i33));
                int i34 = iD30;
                savedCook.setTemperatureChangeBeforeReady(cursorB.getInt(i34));
                int i35 = iD31;
                savedCook.setSecondsDelayBeforeReady(cursorB.getInt(i35));
                int i36 = iD32;
                savedCook.setSecondsDelayBeforeResting(cursorB.getInt(i36));
                iD32 = i36;
                int i37 = iD33;
                savedCook.setTemperatureOffsetBeforeRemoveFromHeat(cursorB.getInt(i37));
                int i38 = iD34;
                savedCook.setOnGoingRecipeID(cursorB.getLong(i38));
                int i39 = iD35;
                savedCook.setStepID(cursorB.getInt(i39));
                int i40 = iD36;
                savedCook.setCookingAppliance(cursorB.getInt(i40));
                arrayList2.add(savedCook);
                iD36 = i40;
                arrayList = arrayList2;
                iD = i10;
                i13 = i15;
                iD19 = i21;
                iD22 = i26;
                iD3 = i24;
                iD20 = i23;
                iD23 = i27;
                iD24 = i28;
                iD25 = i29;
                iD29 = i33;
                iD31 = i35;
                iD13 = i14;
                iD35 = i39;
                iD12 = i18;
                iD16 = i11;
                iD17 = i19;
                iD18 = i12;
                iD21 = i25;
                iD2 = i22;
                iD28 = i32;
                iD30 = i34;
                iD33 = i37;
                iD34 = i38;
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

    @Override // H4.m
    public SavedCook f(long j10) throws Throwable {
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
        SavedCook savedCook;
        z zVarC = z.c("SELECT * FROM SavedCook where cookID = ?", 1);
        zVarC.s0(1, j10);
        this.f5550a.assertNotSuspendingTransaction();
        Cursor cursorB = C4475b.b(this.f5550a, zVarC, false, null);
        try {
            iD = C4474a.d(cursorB, "cookID");
            iD2 = C4474a.d(cursorB, "isFavourite");
            iD3 = C4474a.d(cursorB, "cookStartTime");
            iD4 = C4474a.d(cursorB, "targetMinimumAmbientTemperature");
            iD5 = C4474a.d(cursorB, "targetMaximumAmbientTemperature");
            iD6 = C4474a.d(cursorB, "targetTemperature");
            iD7 = C4474a.d(cursorB, "peakTemperature");
            iD8 = C4474a.d(cursorB, "cookName");
            iD9 = C4474a.d(cursorB, "cookTime");
            iD10 = C4474a.d(cursorB, "cutId");
            iD11 = C4474a.d(cursorB, "cookPresetId");
            iD12 = C4474a.d(cursorB, "alerts");
            iD13 = C4474a.d(cursorB, "temperatureLog");
            iD14 = C4474a.d(cursorB, "isModified");
            zVar = zVarC;
        } catch (Throwable th) {
            th = th;
            zVar = zVarC;
        }
        try {
            int iD15 = C4474a.d(cursorB, "needs_deleting");
            int iD16 = C4474a.d(cursorB, "feedback");
            int iD17 = C4474a.d(cursorB, "needs_uploading");
            int iD18 = C4474a.d(cursorB, "cook_probe_number");
            int iD19 = C4474a.d(cursorB, "cook_device_id");
            int iD20 = C4474a.d(cursorB, "updated_at");
            int iD21 = C4474a.d(cursorB, "cook_state");
            int iD22 = C4474a.d(cursorB, "is_finished");
            int iD23 = C4474a.d(cursorB, "parentDeviceID");
            int iD24 = C4474a.d(cursorB, "parentProbeNumber");
            int iD25 = C4474a.d(cursorB, "clipNumber");
            int iD26 = C4474a.d(cursorB, "firmwareRevision");
            int iD27 = C4474a.d(cursorB, "parentFirmwareRevision");
            int iD28 = C4474a.d(cursorB, "setupSeqNum");
            int iD29 = C4474a.d(cursorB, "recipeID");
            int iD30 = C4474a.d(cursorB, "dropInTempBeforeReady");
            int iD31 = C4474a.d(cursorB, "secondsDelayBeforeReady");
            int iD32 = C4474a.d(cursorB, "secondsDelayBeforeResting");
            int iD33 = C4474a.d(cursorB, "temperatureOffsetBeforeRemoveFromHeat");
            int iD34 = C4474a.d(cursorB, "onGoingRecipeID");
            int iD35 = C4474a.d(cursorB, "stepID");
            int iD36 = C4474a.d(cursorB, "cooking_appliance");
            if (cursorB.moveToFirst()) {
                SavedCook savedCook2 = new SavedCook();
                savedCook2.setCookID(cursorB.getLong(iD));
                savedCook2.setFavourite(cursorB.getInt(iD2) != 0);
                savedCook2.setCookStartTime(cursorB.getLong(iD3));
                savedCook2.setTargetMinimumAmbientTemperature(cursorB.getInt(iD4));
                savedCook2.setTargetMaximumAmbientTemperature(cursorB.getInt(iD5));
                savedCook2.setTargetTemperature(cursorB.getInt(iD6));
                savedCook2.setPeakTemperature(cursorB.getInt(iD7));
                savedCook2.setCookName(cursorB.isNull(iD8) ? null : cursorB.getString(iD8));
                savedCook2.setCookTime(cursorB.getLong(iD9));
                savedCook2.setCutId(cursorB.getInt(iD10));
                savedCook2.setCookPresetId(cursorB.getInt(iD11));
                savedCook2.setAlerts(MEATERTypeConverters.stringToAlertList(cursorB.getString(iD12)));
                savedCook2.setTemperatureLog(MEATERTypeConverters.stringToTemperatureHighResLog(cursorB.getString(iD13)));
                savedCook2.setModified(cursorB.getInt(iD14) != 0);
                savedCook2.setNeedsDeleting(cursorB.getInt(iD15) != 0);
                savedCook2.setFeedback(cursorB.getInt(iD16));
                savedCook2.setNeedsUploading(cursorB.getInt(iD17) != 0);
                savedCook2.setProbeNumber(cursorB.getInt(iD18));
                savedCook2.setCookDeviceId(cursorB.getLong(iD19));
                savedCook2.setUpdatedAt(cursorB.getLong(iD20));
                savedCook2.setCookState(cursorB.getInt(iD21));
                savedCook2.setFinished(cursorB.getInt(iD22) != 0);
                savedCook2.setParentDeviceID(cursorB.getLong(iD23));
                savedCook2.setParentProbeNumber(cursorB.getInt(iD24));
                savedCook2.setClipNumber(cursorB.getInt(iD25));
                savedCook2.setFirmwareRevision(cursorB.isNull(iD26) ? null : cursorB.getString(iD26));
                savedCook2.setParentFirmwareRevision(cursorB.isNull(iD27) ? null : cursorB.getString(iD27));
                savedCook2.setSetupSeqNum(cursorB.getInt(iD28));
                savedCook2.setRecipeID(cursorB.getLong(iD29));
                savedCook2.setTemperatureChangeBeforeReady(cursorB.getInt(iD30));
                savedCook2.setSecondsDelayBeforeReady(cursorB.getInt(iD31));
                savedCook2.setSecondsDelayBeforeResting(cursorB.getInt(iD32));
                savedCook2.setTemperatureOffsetBeforeRemoveFromHeat(cursorB.getInt(iD33));
                savedCook2.setOnGoingRecipeID(cursorB.getLong(iD34));
                savedCook2.setStepID(cursorB.getInt(iD35));
                savedCook2.setCookingAppliance(cursorB.getInt(iD36));
                savedCook = savedCook2;
            } else {
                savedCook = null;
            }
            cursorB.close();
            zVar.f();
            return savedCook;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            zVar.f();
            throw th;
        }
    }

    @Override // H4.m
    public SavedCook g() throws Throwable {
        z zVar;
        SavedCook savedCook;
        z zVarC = z.c("SELECT * FROM SavedCook ORDER BY cookStartTime DESC LIMIT 1", 0);
        this.f5550a.assertNotSuspendingTransaction();
        Cursor cursorB = C4475b.b(this.f5550a, zVarC, false, null);
        try {
            int iD = C4474a.d(cursorB, "cookID");
            int iD2 = C4474a.d(cursorB, "isFavourite");
            int iD3 = C4474a.d(cursorB, "cookStartTime");
            int iD4 = C4474a.d(cursorB, "targetMinimumAmbientTemperature");
            int iD5 = C4474a.d(cursorB, "targetMaximumAmbientTemperature");
            int iD6 = C4474a.d(cursorB, "targetTemperature");
            int iD7 = C4474a.d(cursorB, "peakTemperature");
            int iD8 = C4474a.d(cursorB, "cookName");
            int iD9 = C4474a.d(cursorB, "cookTime");
            int iD10 = C4474a.d(cursorB, "cutId");
            int iD11 = C4474a.d(cursorB, "cookPresetId");
            int iD12 = C4474a.d(cursorB, "alerts");
            int iD13 = C4474a.d(cursorB, "temperatureLog");
            int iD14 = C4474a.d(cursorB, "isModified");
            zVar = zVarC;
            try {
                int iD15 = C4474a.d(cursorB, "needs_deleting");
                int iD16 = C4474a.d(cursorB, "feedback");
                int iD17 = C4474a.d(cursorB, "needs_uploading");
                int iD18 = C4474a.d(cursorB, "cook_probe_number");
                int iD19 = C4474a.d(cursorB, "cook_device_id");
                int iD20 = C4474a.d(cursorB, "updated_at");
                int iD21 = C4474a.d(cursorB, "cook_state");
                int iD22 = C4474a.d(cursorB, "is_finished");
                int iD23 = C4474a.d(cursorB, "parentDeviceID");
                int iD24 = C4474a.d(cursorB, "parentProbeNumber");
                int iD25 = C4474a.d(cursorB, "clipNumber");
                int iD26 = C4474a.d(cursorB, "firmwareRevision");
                int iD27 = C4474a.d(cursorB, "parentFirmwareRevision");
                int iD28 = C4474a.d(cursorB, "setupSeqNum");
                int iD29 = C4474a.d(cursorB, "recipeID");
                int iD30 = C4474a.d(cursorB, "dropInTempBeforeReady");
                int iD31 = C4474a.d(cursorB, "secondsDelayBeforeReady");
                int iD32 = C4474a.d(cursorB, "secondsDelayBeforeResting");
                int iD33 = C4474a.d(cursorB, "temperatureOffsetBeforeRemoveFromHeat");
                int iD34 = C4474a.d(cursorB, "onGoingRecipeID");
                int iD35 = C4474a.d(cursorB, "stepID");
                int iD36 = C4474a.d(cursorB, "cooking_appliance");
                if (cursorB.moveToFirst()) {
                    SavedCook savedCook2 = new SavedCook();
                    savedCook2.setCookID(cursorB.getLong(iD));
                    savedCook2.setFavourite(cursorB.getInt(iD2) != 0);
                    savedCook2.setCookStartTime(cursorB.getLong(iD3));
                    savedCook2.setTargetMinimumAmbientTemperature(cursorB.getInt(iD4));
                    savedCook2.setTargetMaximumAmbientTemperature(cursorB.getInt(iD5));
                    savedCook2.setTargetTemperature(cursorB.getInt(iD6));
                    savedCook2.setPeakTemperature(cursorB.getInt(iD7));
                    savedCook2.setCookName(cursorB.isNull(iD8) ? null : cursorB.getString(iD8));
                    savedCook2.setCookTime(cursorB.getLong(iD9));
                    savedCook2.setCutId(cursorB.getInt(iD10));
                    savedCook2.setCookPresetId(cursorB.getInt(iD11));
                    savedCook2.setAlerts(MEATERTypeConverters.stringToAlertList(cursorB.getString(iD12)));
                    savedCook2.setTemperatureLog(MEATERTypeConverters.stringToTemperatureHighResLog(cursorB.getString(iD13)));
                    savedCook2.setModified(cursorB.getInt(iD14) != 0);
                    savedCook2.setNeedsDeleting(cursorB.getInt(iD15) != 0);
                    savedCook2.setFeedback(cursorB.getInt(iD16));
                    savedCook2.setNeedsUploading(cursorB.getInt(iD17) != 0);
                    savedCook2.setProbeNumber(cursorB.getInt(iD18));
                    savedCook2.setCookDeviceId(cursorB.getLong(iD19));
                    savedCook2.setUpdatedAt(cursorB.getLong(iD20));
                    savedCook2.setCookState(cursorB.getInt(iD21));
                    savedCook2.setFinished(cursorB.getInt(iD22) != 0);
                    savedCook2.setParentDeviceID(cursorB.getLong(iD23));
                    savedCook2.setParentProbeNumber(cursorB.getInt(iD24));
                    savedCook2.setClipNumber(cursorB.getInt(iD25));
                    savedCook2.setFirmwareRevision(cursorB.isNull(iD26) ? null : cursorB.getString(iD26));
                    savedCook2.setParentFirmwareRevision(cursorB.isNull(iD27) ? null : cursorB.getString(iD27));
                    savedCook2.setSetupSeqNum(cursorB.getInt(iD28));
                    savedCook2.setRecipeID(cursorB.getLong(iD29));
                    savedCook2.setTemperatureChangeBeforeReady(cursorB.getInt(iD30));
                    savedCook2.setSecondsDelayBeforeReady(cursorB.getInt(iD31));
                    savedCook2.setSecondsDelayBeforeResting(cursorB.getInt(iD32));
                    savedCook2.setTemperatureOffsetBeforeRemoveFromHeat(cursorB.getInt(iD33));
                    savedCook2.setOnGoingRecipeID(cursorB.getLong(iD34));
                    savedCook2.setStepID(cursorB.getInt(iD35));
                    savedCook2.setCookingAppliance(cursorB.getInt(iD36));
                    savedCook = savedCook2;
                } else {
                    savedCook = null;
                }
                cursorB.close();
                zVar.f();
                return savedCook;
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

    @Override // H4.m
    public void h(SavedCook savedCook) {
        this.f5550a.assertNotSuspendingTransaction();
        this.f5550a.beginTransaction();
        try {
            this.f5551b.j(savedCook);
            this.f5550a.setTransactionSuccessful();
        } finally {
            this.f5550a.endTransaction();
        }
    }

    @Override // H4.m
    public List<SavedCook> i() throws Throwable {
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
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        String string;
        String string2;
        z zVarC = z.c("SELECT * FROM SavedCook where updated_at != 0", 0);
        this.f5550a.assertNotSuspendingTransaction();
        Cursor cursorB = C4475b.b(this.f5550a, zVarC, false, null);
        try {
            iD = C4474a.d(cursorB, "cookID");
            iD2 = C4474a.d(cursorB, "isFavourite");
            iD3 = C4474a.d(cursorB, "cookStartTime");
            iD4 = C4474a.d(cursorB, "targetMinimumAmbientTemperature");
            iD5 = C4474a.d(cursorB, "targetMaximumAmbientTemperature");
            iD6 = C4474a.d(cursorB, "targetTemperature");
            iD7 = C4474a.d(cursorB, "peakTemperature");
            iD8 = C4474a.d(cursorB, "cookName");
            iD9 = C4474a.d(cursorB, "cookTime");
            iD10 = C4474a.d(cursorB, "cutId");
            iD11 = C4474a.d(cursorB, "cookPresetId");
            iD12 = C4474a.d(cursorB, "alerts");
            iD13 = C4474a.d(cursorB, "temperatureLog");
            iD14 = C4474a.d(cursorB, "isModified");
            zVar = zVarC;
        } catch (Throwable th) {
            th = th;
            zVar = zVarC;
        }
        try {
            int iD15 = C4474a.d(cursorB, "needs_deleting");
            int iD16 = C4474a.d(cursorB, "feedback");
            int iD17 = C4474a.d(cursorB, "needs_uploading");
            int iD18 = C4474a.d(cursorB, "cook_probe_number");
            int iD19 = C4474a.d(cursorB, "cook_device_id");
            int iD20 = C4474a.d(cursorB, "updated_at");
            int iD21 = C4474a.d(cursorB, "cook_state");
            int iD22 = C4474a.d(cursorB, "is_finished");
            int iD23 = C4474a.d(cursorB, "parentDeviceID");
            int iD24 = C4474a.d(cursorB, "parentProbeNumber");
            int iD25 = C4474a.d(cursorB, "clipNumber");
            int iD26 = C4474a.d(cursorB, "firmwareRevision");
            int iD27 = C4474a.d(cursorB, "parentFirmwareRevision");
            int iD28 = C4474a.d(cursorB, "setupSeqNum");
            int iD29 = C4474a.d(cursorB, "recipeID");
            int iD30 = C4474a.d(cursorB, "dropInTempBeforeReady");
            int iD31 = C4474a.d(cursorB, "secondsDelayBeforeReady");
            int iD32 = C4474a.d(cursorB, "secondsDelayBeforeResting");
            int iD33 = C4474a.d(cursorB, "temperatureOffsetBeforeRemoveFromHeat");
            int iD34 = C4474a.d(cursorB, "onGoingRecipeID");
            int iD35 = C4474a.d(cursorB, "stepID");
            int iD36 = C4474a.d(cursorB, "cooking_appliance");
            int i13 = iD14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                SavedCook savedCook = new SavedCook();
                ArrayList arrayList2 = arrayList;
                int i14 = iD13;
                savedCook.setCookID(cursorB.getLong(iD));
                savedCook.setFavourite(cursorB.getInt(iD2) != 0);
                savedCook.setCookStartTime(cursorB.getLong(iD3));
                savedCook.setTargetMinimumAmbientTemperature(cursorB.getInt(iD4));
                savedCook.setTargetMaximumAmbientTemperature(cursorB.getInt(iD5));
                savedCook.setTargetTemperature(cursorB.getInt(iD6));
                savedCook.setPeakTemperature(cursorB.getInt(iD7));
                savedCook.setCookName(cursorB.isNull(iD8) ? null : cursorB.getString(iD8));
                savedCook.setCookTime(cursorB.getLong(iD9));
                savedCook.setCutId(cursorB.getInt(iD10));
                savedCook.setCookPresetId(cursorB.getInt(iD11));
                savedCook.setAlerts(MEATERTypeConverters.stringToAlertList(cursorB.getString(iD12)));
                savedCook.setTemperatureLog(MEATERTypeConverters.stringToTemperatureHighResLog(cursorB.getString(i14)));
                int i15 = i13;
                if (cursorB.getInt(i15) != 0) {
                    i10 = iD;
                    z10 = true;
                } else {
                    i10 = iD;
                    z10 = false;
                }
                savedCook.setModified(z10);
                int i16 = iD15;
                if (cursorB.getInt(i16) != 0) {
                    iD15 = i16;
                    z11 = true;
                } else {
                    iD15 = i16;
                    z11 = false;
                }
                savedCook.setNeedsDeleting(z11);
                int i17 = iD16;
                int i18 = iD12;
                savedCook.setFeedback(cursorB.getInt(i17));
                int i19 = iD17;
                if (cursorB.getInt(i19) != 0) {
                    i11 = i17;
                    z12 = true;
                } else {
                    i11 = i17;
                    z12 = false;
                }
                savedCook.setNeedsUploading(z12);
                int i20 = iD18;
                savedCook.setProbeNumber(cursorB.getInt(i20));
                int i21 = iD19;
                savedCook.setCookDeviceId(cursorB.getLong(i21));
                int i22 = iD2;
                int i23 = iD20;
                int i24 = iD3;
                savedCook.setUpdatedAt(cursorB.getLong(i23));
                int i25 = iD21;
                savedCook.setCookState(cursorB.getInt(i25));
                int i26 = iD22;
                if (cursorB.getInt(i26) != 0) {
                    i12 = i20;
                    z13 = true;
                } else {
                    i12 = i20;
                    z13 = false;
                }
                savedCook.setFinished(z13);
                int i27 = iD23;
                savedCook.setParentDeviceID(cursorB.getLong(i27));
                int i28 = iD24;
                savedCook.setParentProbeNumber(cursorB.getInt(i28));
                int i29 = iD25;
                savedCook.setClipNumber(cursorB.getInt(i29));
                int i30 = iD26;
                if (cursorB.isNull(i30)) {
                    iD26 = i30;
                    string = null;
                } else {
                    iD26 = i30;
                    string = cursorB.getString(i30);
                }
                savedCook.setFirmwareRevision(string);
                int i31 = iD27;
                if (cursorB.isNull(i31)) {
                    iD27 = i31;
                    string2 = null;
                } else {
                    iD27 = i31;
                    string2 = cursorB.getString(i31);
                }
                savedCook.setParentFirmwareRevision(string2);
                int i32 = iD28;
                savedCook.setSetupSeqNum(cursorB.getInt(i32));
                int i33 = iD29;
                savedCook.setRecipeID(cursorB.getLong(i33));
                int i34 = iD30;
                savedCook.setTemperatureChangeBeforeReady(cursorB.getInt(i34));
                int i35 = iD31;
                savedCook.setSecondsDelayBeforeReady(cursorB.getInt(i35));
                int i36 = iD32;
                savedCook.setSecondsDelayBeforeResting(cursorB.getInt(i36));
                iD32 = i36;
                int i37 = iD33;
                savedCook.setTemperatureOffsetBeforeRemoveFromHeat(cursorB.getInt(i37));
                int i38 = iD34;
                savedCook.setOnGoingRecipeID(cursorB.getLong(i38));
                int i39 = iD35;
                savedCook.setStepID(cursorB.getInt(i39));
                int i40 = iD36;
                savedCook.setCookingAppliance(cursorB.getInt(i40));
                arrayList2.add(savedCook);
                iD36 = i40;
                arrayList = arrayList2;
                iD = i10;
                i13 = i15;
                iD19 = i21;
                iD22 = i26;
                iD3 = i24;
                iD20 = i23;
                iD23 = i27;
                iD24 = i28;
                iD25 = i29;
                iD29 = i33;
                iD31 = i35;
                iD13 = i14;
                iD35 = i39;
                iD12 = i18;
                iD16 = i11;
                iD17 = i19;
                iD18 = i12;
                iD21 = i25;
                iD2 = i22;
                iD28 = i32;
                iD30 = i34;
                iD33 = i37;
                iD34 = i38;
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

    @Override // H4.m
    public void j(SavedCook... savedCookArr) {
        this.f5550a.assertNotSuspendingTransaction();
        this.f5550a.beginTransaction();
        try {
            this.f5553d.k(savedCookArr);
            this.f5550a.setTransactionSuccessful();
        } finally {
            this.f5550a.endTransaction();
        }
    }
}
