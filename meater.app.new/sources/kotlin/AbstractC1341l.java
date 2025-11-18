package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.x1;

/* compiled from: FontFamily.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0003\u001a\u00020\u00028G¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LL0/l;", "", "", "canLoadSynchronously", "<init>", "(Z)V", "B", "Z", "getCanLoadSynchronously", "()Z", "getCanLoadSynchronously$annotations", "()V", "C", "a", "b", "LL0/j;", "LL0/F;", "LL0/P;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: L0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1341l {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: D, reason: collision with root package name */
    private static final AbstractC1323P f9024D = new C1338i();

    /* renamed from: E, reason: collision with root package name */
    private static final C1312E f9025E = new C1312E("sans-serif", "FontFamily.SansSerif");

    /* renamed from: F, reason: collision with root package name */
    private static final C1312E f9026F = new C1312E("serif", "FontFamily.Serif");

    /* renamed from: G, reason: collision with root package name */
    private static final C1312E f9027G = new C1312E("monospace", "FontFamily.Monospace");

    /* renamed from: H, reason: collision with root package name */
    private static final C1312E f9028H = new C1312E("cursive", "FontFamily.Cursive");

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final boolean canLoadSynchronously;

    /* compiled from: FontFamily.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LL0/l$a;", "", "<init>", "()V", "LL0/P;", "Default", "LL0/P;", "a", "()LL0/P;", "LL0/E;", "SansSerif", "LL0/E;", "b", "()LL0/E;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: L0.l$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final AbstractC1323P a() {
            return AbstractC1341l.f9024D;
        }

        public final C1312E b() {
            return AbstractC1341l.f9025E;
        }

        private Companion() {
        }
    }

    /* compiled from: FontFamily.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001JB\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0001\u0001\rø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"LL0/l$b;", "", "LL0/l;", "fontFamily", "LL0/B;", "fontWeight", "LL0/w;", "fontStyle", "LL0/x;", "fontSynthesis", "LO/x1;", "b", "(LL0/l;LL0/B;II)LO/x1;", "LL0/n;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: L0.l$b */
    public interface b {
        static /* synthetic */ x1 a(b bVar, AbstractC1341l abstractC1341l, FontWeight fontWeight, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
            }
            if ((i12 & 1) != 0) {
                abstractC1341l = null;
            }
            if ((i12 & 2) != 0) {
                fontWeight = FontWeight.INSTANCE.d();
            }
            if ((i12 & 4) != 0) {
                i10 = C1352w.INSTANCE.b();
            }
            if ((i12 & 8) != 0) {
                i11 = C1353x.INSTANCE.a();
            }
            return bVar.b(abstractC1341l, fontWeight, i10, i11);
        }

        x1<Object> b(AbstractC1341l fontFamily, FontWeight fontWeight, int fontStyle, int fontSynthesis);
    }

    public /* synthetic */ AbstractC1341l(boolean z10, C3854k c3854k) {
        this(z10);
    }

    private AbstractC1341l(boolean z10) {
        this.canLoadSynchronously = z10;
    }
}
