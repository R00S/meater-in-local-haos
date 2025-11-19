package O0;

import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlin.x1;

/* compiled from: AndroidParagraphIntrinsics.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0017\u0010\u000f\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0014¨\u0006\u0016"}, d2 = {"LO0/t;", "", "LO/x1;", "resolveResult", "next", "<init>", "(LO/x1;LO0/t;)V", "a", "LO/x1;", "b", "LO0/t;", "c", "Ljava/lang/Object;", "getInitial", "()Ljava/lang/Object;", "initial", "Landroid/graphics/Typeface;", "()Landroid/graphics/Typeface;", "typeface", "", "()Z", "isStaleResolvedFont", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class t {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x1<Object> resolveResult;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t next;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object initial;

    public t(x1<? extends Object> x1Var, t tVar) {
        this.resolveResult = x1Var;
        this.next = tVar;
        this.initial = x1Var.getValue();
    }

    public final Typeface a() {
        Object obj = this.initial;
        C3862t.e(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    public final boolean b() {
        t tVar;
        return this.resolveResult.getValue() != this.initial || ((tVar = this.next) != null && tVar.b());
    }
}
