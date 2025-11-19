package d;

import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: EdgeToEdge.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u0000 \u00172\u00020\u0001:\u0001\u0010B5\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0012\u0010\u0014R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016¨\u0006\u0018"}, d2 = {"Ld/L;", "", "", "lightScrim", "darkScrim", "nightMode", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "detectDarkMode", "<init>", "(IIILBa/l;)V", "isDark", "c", "(Z)I", "d", "a", "I", "b", "getDarkScrim$activity_release", "()I", "LBa/l;", "()LBa/l;", "e", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class L {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int lightScrim;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int darkScrim;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int nightMode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<Resources, Boolean> detectDarkMode;

    /* compiled from: EdgeToEdge.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ld/L$a;", "", "<init>", "()V", "", "lightScrim", "darkScrim", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "detectDarkMode", "Ld/L;", "a", "(IILBa/l;)Ld/L;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d.L$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: EdgeToEdge.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/res/Resources;", "resources", "", "a", "(Landroid/content/res/Resources;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: d.L$a$a, reason: collision with other inner class name */
        static final class C0503a extends AbstractC3864v implements Ba.l<Resources, Boolean> {

            /* renamed from: B, reason: collision with root package name */
            public static final C0503a f39553B = new C0503a();

            C0503a() {
                super(1);
            }

            @Override // Ba.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Resources resources) {
                C3862t.g(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            }
        }

        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ L b(Companion companion, int i10, int i11, Ba.l lVar, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                lVar = C0503a.f39553B;
            }
            return companion.a(i10, i11, lVar);
        }

        public final L a(int lightScrim, int darkScrim, Ba.l<? super Resources, Boolean> detectDarkMode) {
            C3862t.g(detectDarkMode, "detectDarkMode");
            return new L(lightScrim, darkScrim, 0, detectDarkMode, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ L(int i10, int i11, int i12, Ba.l lVar, C3854k c3854k) {
        this(i10, i11, i12, lVar);
    }

    public final Ba.l<Resources, Boolean> a() {
        return this.detectDarkMode;
    }

    /* renamed from: b, reason: from getter */
    public final int getNightMode() {
        return this.nightMode;
    }

    public final int c(boolean isDark) {
        return isDark ? this.darkScrim : this.lightScrim;
    }

    public final int d(boolean isDark) {
        if (this.nightMode == 0) {
            return 0;
        }
        return isDark ? this.darkScrim : this.lightScrim;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private L(int i10, int i11, int i12, Ba.l<? super Resources, Boolean> lVar) {
        this.lightScrim = i10;
        this.darkScrim = i11;
        this.nightMode = i12;
        this.detectDarkMode = lVar;
    }
}
