package L;

import kotlin.InterfaceC4753i;
import kotlin.Metadata;
import z.C5153b;
import z.C5155d;
import z.C5157f;
import z.InterfaceC5159h;
import z.m;

/* compiled from: Elevation.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LL/e;", "", "<init>", "()V", "Lz/h;", "interaction", "Lv/i;", "LU0/h;", "a", "(Lz/h;)Lv/i;", "b", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f8903a = new e();

    private e() {
    }

    public final InterfaceC4753i<U0.h> a(InterfaceC5159h interaction) {
        if ((interaction instanceof m.b) || (interaction instanceof C5153b) || (interaction instanceof C5157f) || (interaction instanceof C5155d)) {
            return f.f8905b;
        }
        return null;
    }

    public final InterfaceC4753i<U0.h> b(InterfaceC5159h interaction) {
        if (!(interaction instanceof m.b) && !(interaction instanceof C5153b)) {
            if (interaction instanceof C5157f) {
                return f.f8907d;
            }
            if (interaction instanceof C5155d) {
                return f.f8906c;
            }
            return null;
        }
        return f.f8906c;
    }
}
