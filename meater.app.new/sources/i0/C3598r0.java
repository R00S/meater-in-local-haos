package i0;

import android.graphics.Canvas;
import kotlin.Metadata;

/* compiled from: CanvasUtils.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Li0/r0;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "", "enable", "Loa/F;", "a", "(Landroid/graphics/Canvas;Z)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: i0.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3598r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C3598r0 f42959a = new C3598r0();

    private C3598r0() {
    }

    public final void a(Canvas canvas, boolean enable) {
        if (enable) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
