package w6;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import o6.InterfaceC4138b;
import o6.InterfaceC4139c;
import y6.C5131c;

/* compiled from: DrawableResource.java */
/* loaded from: classes2.dex */
public abstract class j<T extends Drawable> implements InterfaceC4139c<T>, InterfaceC4138b {

    /* renamed from: B, reason: collision with root package name */
    protected final T f51962B;

    public j(T t10) {
        this.f51962B = (T) H6.k.d(t10);
    }

    @Override // o6.InterfaceC4138b
    public void b() {
        T t10 = this.f51962B;
        if (t10 instanceof BitmapDrawable) {
            ((BitmapDrawable) t10).getBitmap().prepareToDraw();
        } else if (t10 instanceof C5131c) {
            ((C5131c) t10).e().prepareToDraw();
        }
    }

    @Override // o6.InterfaceC4139c
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final T get() {
        Drawable.ConstantState constantState = this.f51962B.getConstantState();
        return constantState == null ? this.f51962B : (T) constantState.newDrawable();
    }
}
