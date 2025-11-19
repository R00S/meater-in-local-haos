package S5;

import Q5.b;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import x4.g;

/* compiled from: VideoTutorialHelper.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LS5/a;", "", "<init>", "()V", "Loa/F;", "a", "LG5/a;", "b", "LG5/a;", "prefs", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f15494a = new a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final G5.a prefs;

    /* renamed from: c, reason: collision with root package name */
    public static final int f15496c;

    static {
        G5.a aVarT = g.t();
        C3862t.f(aVarT, "getUserPref(...)");
        prefs = aVarT;
        f15496c = 8;
    }

    private a() {
    }

    public final void a() {
        HashSet hashSet = new HashSet();
        hashSet.add(b.f14344D.getValue());
        hashSet.add(b.f14345E.getValue());
        hashSet.add(b.f14346F.getValue());
        hashSet.add(b.f14347G.getValue());
        G5.a aVar = prefs;
        if (aVar.z().isEmpty()) {
            aVar.T0(hashSet);
        }
    }
}
