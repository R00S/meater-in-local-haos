package l0;

import android.graphics.Outline;
import i0.C3556T;
import i0.R0;
import kotlin.Metadata;

/* compiled from: AndroidGraphicsLayer.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ll0/M;", "", "<init>", "()V", "Landroid/graphics/Outline;", "outline", "Li0/R0;", "path", "Loa/F;", "a", "(Landroid/graphics/Outline;Li0/R0;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public static final M f44250a = new M();

    private M() {
    }

    public final void a(Outline outline, R0 path) {
        if (!(path instanceof C3556T)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((C3556T) path).getInternalPath());
    }
}
