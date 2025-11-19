package kotlin;

import C9.h;
import H0.TextStyle;
import M.u;
import kotlin.AbstractC1501G0;
import kotlin.C1560o;
import kotlin.C1576w;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC3864v;

/* compiled from: Typography.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\" \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LK/e0;", "LM/u;", "value", "LH0/J;", "a", "(LK/e0;LM/u;)LH0/J;", "LO/G0;", "LO/G0;", "b", "()LO/G0;", "LocalTypography", "c", "(LM/u;LO/l;I)LH0/J;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: K.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1285f0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1501G0<Typography> f8403a = C1576w.f(a.f8404B);

    /* compiled from: Typography.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LK/e0;", "a", "()LK/e0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.f0$a */
    static final class a extends AbstractC3864v implements Ba.a<Typography> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f8404B = new a();

        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Typography invoke() {
            return new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        }
    }

    /* compiled from: Typography.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K.f0$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8405a;

        static {
            int[] iArr = new int[u.values().length];
            try {
                iArr[u.DisplayLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.DisplayMedium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u.DisplaySmall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[u.HeadlineLarge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[u.HeadlineMedium.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[u.HeadlineSmall.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[u.TitleLarge.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[u.TitleMedium.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[u.TitleSmall.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[u.BodyLarge.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[u.BodyMedium.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[u.BodySmall.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[u.LabelLarge.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[u.LabelMedium.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[u.LabelSmall.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            f8405a = iArr;
        }
    }

    private static final TextStyle a(Typography typography, u uVar) {
        switch (b.f8405a[uVar.ordinal()]) {
            case 1:
                return typography.getDisplayLarge();
            case 2:
                return typography.getDisplayMedium();
            case 3:
                return typography.getDisplaySmall();
            case 4:
                return typography.getHeadlineLarge();
            case 5:
                return typography.getHeadlineMedium();
            case 6:
                return typography.getHeadlineSmall();
            case 7:
                return typography.getTitleLarge();
            case 8:
                return typography.getTitleMedium();
            case 9:
                return typography.getTitleSmall();
            case h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return typography.getBodyLarge();
            case h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return typography.getBodyMedium();
            case h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return typography.getBodySmall();
            case h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return typography.getLabelLarge();
            case 14:
                return typography.getLabelMedium();
            case 15:
                return typography.getLabelSmall();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final AbstractC1501G0<Typography> b() {
        return f8403a;
    }

    public static final TextStyle c(u uVar, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(-1049072145, i10, -1, "androidx.compose.material3.<get-value> (Typography.kt:209)");
        }
        TextStyle textStyleA = a(C1252D.f7860a.c(interfaceC1554l, 6), uVar);
        if (C1560o.J()) {
            C1560o.R();
        }
        return textStyleA;
    }
}
