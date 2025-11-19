package vb;

import Hb.AbstractC1082f0;
import Ra.H;
import java.util.Arrays;
import kotlin.jvm.internal.C3862t;

/* compiled from: constantValues.kt */
/* renamed from: vb.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4941e extends r<Character> {
    public C4941e(char c10) {
        super(Character.valueOf(c10));
    }

    private final String c(char c10) {
        switch (c10) {
            case '\b':
                return "\\b";
            case '\t':
                return "\\t";
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return "\\n";
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            default:
                return e(c10) ? String.valueOf(c10) : "?";
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return "\\f";
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return "\\r";
        }
    }

    private final boolean e(char c10) {
        byte type = (byte) Character.getType(c10);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    @Override // vb.AbstractC4943g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public AbstractC1082f0 a(H module) {
        C3862t.g(module, "module");
        AbstractC1082f0 abstractC1082f0U = module.q().u();
        C3862t.f(abstractC1082f0U, "getCharType(...)");
        return abstractC1082f0U;
    }

    @Override // vb.AbstractC4943g
    public String toString() {
        String str = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(b().charValue()), c(b().charValue())}, 2));
        C3862t.f(str, "format(...)");
        return str;
    }
}
