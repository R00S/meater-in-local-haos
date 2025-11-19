package E6;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: DrawableImageViewTarget.java */
/* loaded from: classes2.dex */
public class d extends e<Drawable> {
    public d(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // E6.e
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void r(Drawable drawable) {
        ((ImageView) this.f4000B).setImageDrawable(drawable);
    }
}
