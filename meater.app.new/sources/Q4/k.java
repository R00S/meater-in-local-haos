package Q4;

import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.v3protobuf.MasterSubType;
import com.apptionlabs.meater_app.v3protobuf.MasterType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3862t;

/* compiled from: MasterType_StringName.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/apptionlabs/meater_app/v3protobuf/MasterType;", "Lcom/apptionlabs/meater_app/v3protobuf/MasterSubType;", "masterSubType", "", "a", "(Lcom/apptionlabs/meater_app/v3protobuf/MasterType;Lcom/apptionlabs/meater_app/v3protobuf/MasterSubType;)I", "app_playstoreLiveRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class k {

    /* compiled from: MasterType_StringName.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14332a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f14333b;

        static {
            int[] iArr = new int[MasterSubType.values().length];
            try {
                iArr[MasterSubType.MASTER_SUBTYPE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MasterSubType.MASTER_SUBTYPE_PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MasterSubType.MASTER_SUBTYPE_TABLET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14332a = iArr;
            int[] iArr2 = new int[MasterType.values().length];
            try {
                iArr2[MasterType.MASTER_TYPE_IOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MasterType.MASTER_TYPE_ANDROID.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MasterType.MASTER_TYPE_BLOCK.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[MasterType.MASTER_TYPE_PROBE_SIM.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[MasterType.MASTER_TYPE_BLOCK_V2_2P.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[MasterType.MASTER_TYPE_BLOCK_V2_4P.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            f14333b = iArr2;
        }
    }

    public static final int a(MasterType masterType, MasterSubType masterSubType) {
        C3862t.g(masterType, "<this>");
        C3862t.g(masterSubType, "masterSubType");
        switch (a.f14333b[masterType.ordinal()]) {
            case 1:
                int i10 = a.f14332a[masterSubType.ordinal()];
                if (i10 == 1) {
                    return R.string.mobile_device_ios;
                }
                if (i10 == 2) {
                    return R.string.mobile_device_phone_ios;
                }
                if (i10 == 3) {
                    return R.string.mobile_device_tablet_ios;
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                int i11 = a.f14332a[masterSubType.ordinal()];
                if (i11 == 1) {
                    return R.string.mobile_device_android;
                }
                if (i11 == 2) {
                    return R.string.mobile_device_phone;
                }
                if (i11 == 3) {
                    return R.string.mobile_device_tablet;
                }
                throw new NoWhenBranchMatchedException();
            case 3:
            case 5:
            case 6:
                return R.string.meater_block_label;
            case 4:
                return R.string.probe_simulator_probe;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
