package i0;

import android.graphics.ColorFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: ColorFilter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 \n2\u00020\u0001:\u0001\u0007B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Li0/u0;", "", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "nativeColorFilter", "<init>", "(Landroid/graphics/ColorFilter;)V", "a", "Landroid/graphics/ColorFilter;", "()Landroid/graphics/ColorFilter;", "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: i0.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3604u0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ColorFilter nativeColorFilter;

    /* compiled from: ColorFilter.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Li0/u0$a;", "", "<init>", "()V", "Li0/t0;", "color", "Li0/b0;", "blendMode", "Li0/u0;", "a", "(JI)Li0/u0;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i0.u0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public static /* synthetic */ C3604u0 b(Companion companion, long j10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = C3566b0.INSTANCE.z();
            }
            return companion.a(j10, i10);
        }

        public final C3604u0 a(long color, int blendMode) {
            return new BlendModeColorFilter(color, blendMode, (C3854k) null);
        }

        private Companion() {
        }
    }

    public C3604u0(ColorFilter colorFilter) {
        this.nativeColorFilter = colorFilter;
    }

    /* renamed from: a, reason: from getter */
    public final ColorFilter getNativeColorFilter() {
        return this.nativeColorFilter;
    }
}
