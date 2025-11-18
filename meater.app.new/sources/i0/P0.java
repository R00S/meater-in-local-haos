package i0;

import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.Metadata;

/* compiled from: Paint.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u000b\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0011\u001a\u00020\f8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00128&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u00020\u00188&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001c\u0010\u001e\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\nR\"\u0010\"\u001a\u00020\u001f8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R\"\u0010&\u001a\u00020#8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R\u001c\u0010)\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b'\u0010\b\"\u0004\b(\u0010\nR\"\u0010-\u001a\u00020*8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u0016R$\u00104\u001a\n\u0018\u00010.j\u0004\u0018\u0001`/8&@&X¦\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u0010:\u001a\u0004\u0018\u0001058&@&X¦\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001e\u0010@\u001a\u0004\u0018\u00010;8&@&X¦\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006AÀ\u0006\u0001"}, d2 = {"Li0/P0;", "", "Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "k", "()Landroid/graphics/Paint;", "", "d", "()F", "c", "(F)V", "alpha", "Li0/t0;", "e", "()J", "t", "(J)V", "color", "Li0/b0;", "b", "()I", "i", "(I)V", "blendMode", "Li0/Q0;", "getStyle-TiuSbCo", "s", "style", "x", "w", "strokeWidth", "Li0/e1;", "q", "h", "strokeCap", "Li0/f1;", "f", "r", "strokeJoin", "j", "n", "strokeMiterLimit", "Li0/C0;", "p", "o", "filterQuality", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "m", "()Landroid/graphics/Shader;", "l", "(Landroid/graphics/Shader;)V", "shader", "Li0/u0;", "a", "()Li0/u0;", "g", "(Li0/u0;)V", "colorFilter", "Li0/S0;", "u", "()Li0/S0;", "v", "(Li0/S0;)V", "pathEffect", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface P0 {
    C3604u0 a();

    int b();

    void c(float f10);

    float d();

    long e();

    int f();

    void g(C3604u0 c3604u0);

    void h(int i10);

    void i(int i10);

    float j();

    Paint k();

    void l(Shader shader);

    Shader m();

    void n(float f10);

    void o(int i10);

    int p();

    int q();

    void r(int i10);

    void s(int i10);

    void t(long j10);

    S0 u();

    void v(S0 s02);

    void w(float f10);

    float x();
}
