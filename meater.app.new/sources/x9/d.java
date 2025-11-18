package x9;

import C9.m;
import java.util.Iterator;
import java.util.Map;
import v9.C4925a;

/* compiled from: FirebasePerfTraceValidator.java */
/* loaded from: classes2.dex */
final class d extends e {

    /* renamed from: b, reason: collision with root package name */
    private static final C4925a f52908b = C4925a.e();

    /* renamed from: a, reason: collision with root package name */
    private final m f52909a;

    d(m mVar) {
        this.f52909a = mVar;
    }

    private boolean g(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                e.d(entry.getKey(), entry.getValue());
            } catch (IllegalArgumentException e10) {
                f52908b.j(e10.getLocalizedMessage());
                return false;
            }
        }
        return true;
    }

    private boolean h(m mVar) {
        return i(mVar, 0);
    }

    private boolean i(m mVar, int i10) {
        if (mVar == null) {
            return false;
        }
        if (i10 > 1) {
            f52908b.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry<String, Long> entry : mVar.s0().entrySet()) {
            if (!l(entry.getKey())) {
                f52908b.j("invalid CounterId:" + entry.getKey());
                return false;
            }
            if (!m(entry.getValue())) {
                f52908b.j("invalid CounterValue:" + entry.getValue());
                return false;
            }
        }
        Iterator<m> it = mVar.A0().iterator();
        while (it.hasNext()) {
            if (!i(it.next(), i10 + 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean j(m mVar) {
        if (mVar.r0() > 0) {
            return true;
        }
        Iterator<m> it = mVar.A0().iterator();
        while (it.hasNext()) {
            if (it.next().r0() > 0) {
                return true;
            }
        }
        return false;
    }

    private boolean k(m mVar) {
        return mVar.y0().startsWith("_st_");
    }

    private boolean l(String str) {
        if (str == null) {
            return false;
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            f52908b.j("counterId is empty");
            return false;
        }
        if (strTrim.length() <= 100) {
            return true;
        }
        f52908b.j("counterId exceeded max length 100");
        return false;
    }

    private boolean m(Long l10) {
        return l10 != null;
    }

    private boolean n(m mVar) {
        Long l10 = mVar.s0().get(B9.b.FRAMES_TOTAL.toString());
        return l10 != null && l10.compareTo((Long) 0L) > 0;
    }

    private boolean o(m mVar, int i10) {
        if (mVar == null) {
            f52908b.j("TraceMetric is null");
            return false;
        }
        if (i10 > 1) {
            f52908b.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        if (!q(mVar.y0())) {
            f52908b.j("invalid TraceId:" + mVar.y0());
            return false;
        }
        if (!p(mVar)) {
            f52908b.j("invalid TraceDuration:" + mVar.v0());
            return false;
        }
        if (!mVar.B0()) {
            f52908b.j("clientStartTimeUs is null.");
            return false;
        }
        if (!k(mVar) || n(mVar)) {
            Iterator<m> it = mVar.A0().iterator();
            while (it.hasNext()) {
                if (!o(it.next(), i10 + 1)) {
                    return false;
                }
            }
            return g(mVar.t0());
        }
        f52908b.j("non-positive totalFrames in screen trace " + mVar.y0());
        return false;
    }

    private boolean p(m mVar) {
        return mVar != null && mVar.v0() > 0;
    }

    private boolean q(String str) {
        if (str == null) {
            return false;
        }
        String strTrim = str.trim();
        return !strTrim.isEmpty() && strTrim.length() <= 100;
    }

    @Override // x9.e
    public boolean c() {
        if (!o(this.f52909a, 0)) {
            f52908b.j("Invalid Trace:" + this.f52909a.y0());
            return false;
        }
        if (!j(this.f52909a) || h(this.f52909a)) {
            return true;
        }
        f52908b.j("Invalid Counters for Trace:" + this.f52909a.y0());
        return false;
    }
}
