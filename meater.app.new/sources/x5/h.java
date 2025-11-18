package x5;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SummaryScreenType.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lx5/h;", "", "", "index", "<init>", "(Ljava/lang/String;II)V", "B", "I", "n", "()I", "C", "a", "D", "E", "F", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: D, reason: collision with root package name */
    public static final h f52872D = new h("SUMMARY_SCREEN_FULL", 0, 100);

    /* renamed from: E, reason: collision with root package name */
    public static final h f52873E = new h("SUMMARY_SCREEN_WITH_DESCRIPTION", 1, 200);

    /* renamed from: F, reason: collision with root package name */
    public static final h f52874F = new h("SUMMARY_SCREEN_WITH_INGREDIENT_TOOLS", 2, 300);

    /* renamed from: G, reason: collision with root package name */
    private static final /* synthetic */ h[] f52875G;

    /* renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f52876H;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* compiled from: SummaryScreenType.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lx5/h$a;", "", "<init>", "()V", "", "index", "Lx5/h;", "a", "(I)Lx5/h;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: x5.h$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final h a(int index) {
            for (h hVar : h.j()) {
                if (hVar.getIndex() == index) {
                    return hVar;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }

        private Companion() {
        }
    }

    static {
        h[] hVarArrC = c();
        f52875G = hVarArrC;
        f52876H = C4929b.a(hVarArrC);
        INSTANCE = new Companion(null);
    }

    private h(String str, int i10, int i11) {
        this.index = i11;
    }

    private static final /* synthetic */ h[] c() {
        return new h[]{f52872D, f52873E, f52874F};
    }

    public static InterfaceC4928a<h> j() {
        return f52876H;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f52875G.clone();
    }

    /* renamed from: n, reason: from getter */
    public final int getIndex() {
        return this.index;
    }
}
