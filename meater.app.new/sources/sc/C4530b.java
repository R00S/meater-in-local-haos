package sc;

import com.apptionlabs.meater_app.data.Temperature;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.V;

/* compiled from: TaskLogger.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lsc/a;", "task", "Lsc/d;", "queue", "", "message", "Loa/F;", "c", "(Lsc/a;Lsc/d;Ljava/lang/String;)V", "", "ns", "b", "(J)Ljava/lang/String;", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: sc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4530b {
    public static final String b(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - 500000000) / 1000000000) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - 500000) / 1000000) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - Temperature.MAX_AMBIENT_SECOND_GEN_PROBE) / 1000) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + Temperature.MAX_AMBIENT_SECOND_GEN_PROBE) / 1000) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + 500000) / 1000000) + " ms";
        } else {
            str = ((j10 + 500000000) / 1000000000) + " s ";
        }
        V v10 = V.f43983a;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        C3862t.f(str2, "format(format, *args)");
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(AbstractC4529a abstractC4529a, d dVar, String str) {
        Logger loggerA = e.f49701h.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(dVar.getName());
        sb2.append(' ');
        V v10 = V.f43983a;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        C3862t.f(str2, "format(format, *args)");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(abstractC4529a.getName());
        loggerA.fine(sb2.toString());
    }
}
