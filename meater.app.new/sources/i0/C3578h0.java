package i0;

import android.graphics.BlendModeColorFilter;
import kotlin.Metadata;

/* compiled from: AndroidColorFilter.android.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Li0/h0;", "", "<init>", "()V", "Li0/t0;", "color", "Li0/b0;", "blendMode", "Landroid/graphics/BlendModeColorFilter;", "a", "(JI)Landroid/graphics/BlendModeColorFilter;", "androidBlendModeColorFilter", "Li0/c0;", "b", "(Landroid/graphics/BlendModeColorFilter;)Li0/c0;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: i0.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3578h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C3578h0 f42946a = new C3578h0();

    private C3578h0() {
    }

    public final BlendModeColorFilter a(long color, int blendMode) {
        C3576g0.a();
        return C3574f0.a(C3606v0.j(color), C3543F.a(blendMode));
    }

    public final BlendModeColorFilter b(BlendModeColorFilter androidBlendModeColorFilter) {
        return new BlendModeColorFilter(C3606v0.b(androidBlendModeColorFilter.getColor()), C3543F.b(androidBlendModeColorFilter.getMode()), androidBlendModeColorFilter, null);
    }
}
