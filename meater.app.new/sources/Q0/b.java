package Q0;

import O0.h;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import h0.C3482m;
import i0.a1;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.m1;
import kotlin.r1;
import kotlin.x1;

/* compiled from: ShaderBrushSpan.android.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R1\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019\"\u0004\b\u0017\u0010\u001aR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"LQ0/b;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Li0/a1;", "shaderBrush", "", "alpha", "<init>", "(Li0/a1;F)V", "Landroid/text/TextPaint;", "textPaint", "Loa/F;", "updateDrawState", "(Landroid/text/TextPaint;)V", "a", "Li0/a1;", "()Li0/a1;", "b", "F", "getAlpha", "()F", "Lh0/m;", "<set-?>", "c", "LO/p0;", "()J", "(J)V", "size", "LO/x1;", "Landroid/graphics/Shader;", "d", "LO/x1;", "shaderState", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a1 shaderBrush;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float alpha;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 size = r1.c(C3482m.c(C3482m.INSTANCE.a()), null, 2, null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final x1<Shader> shaderState = m1.d(new a());

    /* compiled from: ShaderBrushSpan.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "a", "()Landroid/graphics/Shader;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<Shader> {
        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Shader invoke() {
            if (b.this.b() == 9205357640488583168L || C3482m.k(b.this.b())) {
                return null;
            }
            return b.this.getShaderBrush().b(b.this.b());
        }
    }

    public b(a1 a1Var, float f10) {
        this.shaderBrush = a1Var;
        this.alpha = f10;
    }

    /* renamed from: a, reason: from getter */
    public final a1 getShaderBrush() {
        return this.shaderBrush;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long b() {
        return ((C3482m) this.size.getValue()).getPackedValue();
    }

    public final void c(long j10) {
        this.size.setValue(C3482m.c(j10));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        h.a(textPaint, this.alpha);
        textPaint.setShader(this.shaderState.getValue());
    }
}
