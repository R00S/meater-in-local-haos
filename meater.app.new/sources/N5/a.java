package N5;

import M4.h;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.targets.MeaterTargetSetupActivity;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.V;
import x4.g;

/* compiled from: ChargerInstructionFragment.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\u0003R\u0016\u0010\r\u001a\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0016"}, d2 = {"LN5/a;", "LN5/d;", "<init>", "()V", "Lcom/apptionlabs/meater_app/targets/MeaterTargetSetupActivity$c;", "G2", "()Lcom/apptionlabs/meater_app/targets/MeaterTargetSetupActivity$c;", "Loa/F;", "J2", "z2", "Lcom/apptionlabs/meater_app/model/MEATERDeviceType;", "M2", "()Lcom/apptionlabs/meater_app/model/MEATERDeviceType;", "meaterDeviceType", "", "N2", "()Ljava/lang/String;", "title", "L2", "line1", "M0", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends d {

    /* renamed from: M0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: N0, reason: collision with root package name */
    private static final String f12519N0 = "ProbeInstructionFragment";

    /* compiled from: ChargerInstructionFragment.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LN5/a$a;", "", "<init>", "()V", "Lcom/apptionlabs/meater_app/model/Probe;", "probe", "LN5/a;", "b", "(Lcom/apptionlabs/meater_app/model/Probe;)LN5/a;", "", "TAG", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: N5.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final String a() {
            return a.f12519N0;
        }

        public final a b(Probe probe) {
            a aVar = new a();
            aVar.k2(d.INSTANCE.a(probe));
            return aVar;
        }

        private Companion() {
        }
    }

    /* compiled from: ChargerInstructionFragment.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12520a;

        static {
            int[] iArr = new int[MEATERDeviceType.values().length];
            try {
                iArr[MEATERDeviceType.PROBE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MEATERDeviceType.PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MEATERDeviceType.PLUS_SE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_PROBE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_PLUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_PLUS_PRO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MEATERDeviceType.BLOCK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MEATERDeviceType.BLOCK_PROBE_ONE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MEATERDeviceType.BLOCK_PROBE_TWO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MEATERDeviceType.BLOCK_PROBE_THREE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[MEATERDeviceType.BLOCK_PROBE_FOUR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_TWO_PROBE_BLOCK.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[MEATERDeviceType.AMBER.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[MEATERDeviceType.THERMOMIX_PROBE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[MEATERDeviceType.TRAEGER_PROBE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_ONE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_TWO.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_THREE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_FOUR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_THERMOMIX_PROBE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_TRAEGER_PROBE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_THERMOMIX_PLUS.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_TRAEGER_PLUS.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            f12520a = iArr;
        }
    }

    private final String L2() {
        MEATERDeviceType mEATERDeviceTypeM2 = M2();
        int i10 = mEATERDeviceTypeM2 == null ? -1 : b.f12520a[mEATERDeviceTypeM2.ordinal()];
        if (i10 == 2) {
            V v10 = V.f43983a;
            String strA0 = A0(R.string.device_charger);
            C3862t.f(strA0, "getString(...)");
            String str = String.format(strA0, Arrays.copyOf(new Object[]{A0(R.string.meater_plus)}, 1));
            C3862t.f(str, "format(...)");
            String strA02 = A0(R.string.keep_charger_close);
            C3862t.f(strA02, "getString(...)");
            String str2 = String.format(strA02, Arrays.copyOf(new Object[]{str}, 1));
            C3862t.f(str2, "format(...)");
            return str2;
        }
        if (i10 == 3) {
            V v11 = V.f43983a;
            String strA03 = A0(R.string.device_charger);
            C3862t.f(strA03, "getString(...)");
            String str3 = String.format(strA03, Arrays.copyOf(new Object[]{A0(R.string.meater_plus_se_name)}, 1));
            C3862t.f(str3, "format(...)");
            String strA04 = A0(R.string.keep_charger_close);
            C3862t.f(strA04, "getString(...)");
            String str4 = String.format(strA04, Arrays.copyOf(new Object[]{str3}, 1));
            C3862t.f(str4, "format(...)");
            return str4;
        }
        if (i10 == 5) {
            V v12 = V.f43983a;
            String strA05 = A0(R.string.device_charger);
            C3862t.f(strA05, "getString(...)");
            String str5 = String.format(strA05, Arrays.copyOf(new Object[]{A0(R.string.plus_g2_name)}, 1));
            C3862t.f(str5, "format(...)");
            String strA06 = A0(R.string.keep_charger_close);
            C3862t.f(strA06, "getString(...)");
            String str6 = String.format(strA06, Arrays.copyOf(new Object[]{str5}, 1));
            C3862t.f(str6, "format(...)");
            return str6;
        }
        if (i10 == 6) {
            V v13 = V.f43983a;
            String strA07 = A0(R.string.device_charger);
            C3862t.f(strA07, "getString(...)");
            String str7 = String.format(strA07, Arrays.copyOf(new Object[]{A0(R.string.meater_pro_label)}, 1));
            C3862t.f(str7, "format(...)");
            String strA08 = A0(R.string.keep_charger_close);
            C3862t.f(strA08, "getString(...)");
            String str8 = String.format(strA08, Arrays.copyOf(new Object[]{str7}, 1));
            C3862t.f(str8, "format(...)");
            return str8;
        }
        if (i10 == 7) {
            V v14 = V.f43983a;
            String strA09 = A0(R.string.device_charger);
            C3862t.f(strA09, "getString(...)");
            String str9 = String.format(strA09, Arrays.copyOf(new Object[]{A0(R.string.meater_block_label)}, 1));
            C3862t.f(str9, "format(...)");
            String strA010 = A0(R.string.keep_charger_close);
            C3862t.f(strA010, "getString(...)");
            String str10 = String.format(strA010, Arrays.copyOf(new Object[]{str9}, 1));
            C3862t.f(str10, "format(...)");
            return str10;
        }
        if (i10 == 12) {
            V v15 = V.f43983a;
            String strA011 = A0(R.string.device_charger);
            C3862t.f(strA011, "getString(...)");
            String str11 = String.format(strA011, Arrays.copyOf(new Object[]{A0(R.string.meater_pro_xl_label)}, 1));
            C3862t.f(str11, "format(...)");
            String strA012 = A0(R.string.keep_charger_close);
            C3862t.f(strA012, "getString(...)");
            String str12 = String.format(strA012, Arrays.copyOf(new Object[]{str11}, 1));
            C3862t.f(str12, "format(...)");
            return str12;
        }
        if (i10 != 13) {
            String strA013 = A0(R.string.keep_device_close);
            C3862t.d(strA013);
            return strA013;
        }
        V v16 = V.f43983a;
        String strA014 = A0(R.string.device_charger);
        C3862t.f(strA014, "getString(...)");
        String str13 = String.format(strA014, Arrays.copyOf(new Object[]{A0(R.string.meater_pro_duo)}, 1));
        C3862t.f(str13, "format(...)");
        String strA015 = A0(R.string.keep_charger_close);
        C3862t.f(strA015, "getString(...)");
        String str14 = String.format(strA015, Arrays.copyOf(new Object[]{str13}, 1));
        C3862t.f(str14, "format(...)");
        return str14;
    }

    private final MEATERDeviceType M2() {
        h hVar = h.f11978a;
        Probe probeB2 = getProbe();
        MEATERDevice mEATERDeviceO = hVar.o(probeB2 != null ? probeB2.getParentDeviceID() : 0L);
        if (mEATERDeviceO != null) {
            return mEATERDeviceO.getMEATERDeviceType();
        }
        return null;
    }

    private final String N2() {
        MEATERDeviceType mEATERDeviceTypeM2 = M2();
        switch (mEATERDeviceTypeM2 == null ? -1 : b.f12520a[mEATERDeviceTypeM2.ordinal()]) {
            case 1:
                Probe probeB2 = getProbe();
                if (probeB2 != null) {
                    return probeB2.displayName();
                }
                return null;
            case 2:
                return A0(R.string.meater_plus_charger);
            case 3:
                V v10 = V.f43983a;
                String strA0 = A0(R.string.device_charger);
                C3862t.f(strA0, "getString(...)");
                String str = String.format(strA0, Arrays.copyOf(new Object[]{A0(R.string.meater_plus_se_name)}, 1));
                C3862t.f(str, "format(...)");
                return str;
            case 4:
            case 5:
                V v11 = V.f43983a;
                String strA02 = A0(R.string.device_charger);
                C3862t.f(strA02, "getString(...)");
                String str2 = String.format(strA02, Arrays.copyOf(new Object[]{A0(R.string.plus_g2_name)}, 1));
                C3862t.f(str2, "format(...)");
                return str2;
            case 6:
                V v12 = V.f43983a;
                String strA03 = A0(R.string.device_charger);
                C3862t.f(strA03, "getString(...)");
                String str3 = String.format(strA03, Arrays.copyOf(new Object[]{A0(R.string.meater_pro_label)}, 1));
                C3862t.f(str3, "format(...)");
                return str3;
            case 7:
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                V v13 = V.f43983a;
                String strA04 = A0(R.string.device_charger);
                C3862t.f(strA04, "getString(...)");
                String str4 = String.format(strA04, Arrays.copyOf(new Object[]{A0(R.string.meater_block_label)}, 1));
                C3862t.f(str4, "format(...)");
                return str4;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                V v14 = V.f43983a;
                String strA05 = A0(R.string.device_charger);
                C3862t.f(strA05, "getString(...)");
                String str5 = String.format(strA05, Arrays.copyOf(new Object[]{A0(R.string.meater_pro_xl_label)}, 1));
                C3862t.f(str5, "format(...)");
                return str5;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                V v15 = V.f43983a;
                String strA06 = A0(R.string.device_charger);
                C3862t.f(strA06, "getString(...)");
                String str6 = String.format(strA06, Arrays.copyOf(new Object[]{A0(R.string.meater_pro_duo)}, 1));
                C3862t.f(str6, "format(...)");
                return str6;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                return null;
            default:
                Probe probeB22 = getProbe();
                if (probeB22 != null) {
                    return probeB22.displayName();
                }
                return null;
        }
    }

    public static final a O2(Probe probe) {
        return INSTANCE.b(probe);
    }

    @Override // N5.d
    public MeaterTargetSetupActivity.c G2() {
        return MeaterTargetSetupActivity.c.CHARGER_INSTRUCTION;
    }

    @Override // N5.d
    public void J2() {
        int i10;
        x4.b.l(T(), "Charger Location Instructions");
        A2().f9717l.setVisibility(8);
        MEATERDeviceType mEATERDeviceTypeM2 = M2();
        int i11 = mEATERDeviceTypeM2 == null ? -1 : b.f12520a[mEATERDeviceTypeM2.ordinal()];
        if (i11 == 12) {
            i10 = R.raw.pro_placement;
        } else if (i11 != 13) {
            switch (i11) {
                case 2:
                    i10 = R.raw.meaterplus_placement;
                    break;
                case 3:
                    i10 = R.raw.meaterplus_se_placement;
                    break;
                case 4:
                case 5:
                case 6:
                    i10 = R.raw.g2_meaterplus_placement;
                    break;
                case 7:
                    i10 = R.raw.block_placement;
                    break;
                default:
                    i10 = R.raw.phone_placement;
                    break;
            }
        } else {
            i10 = R.raw.pro_duo_placement;
        }
        A2().f9707b.setAnimation(i10);
        I2(N2(), L2(), A0(R.string.dont_leave_hot_surface), null);
    }

    @Override // N5.d
    public void z2() {
        g.t().x0(false);
    }
}
