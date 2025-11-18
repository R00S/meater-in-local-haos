package A0;

import h0.MutableRect;
import i0.InterfaceC3586l0;
import kotlin.Metadata;
import l0.C3870c;
import oa.C4153F;

/* compiled from: OwnedLayer.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\fH&ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ!\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H&¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0004H&¢\u0006\u0004\b\u001b\u0010\u0019J\"\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\tH&ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\tH&¢\u0006\u0004\b\"\u0010#J9\u0010(\u001a\u00020\u00042\u001a\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00040$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040&H&¢\u0006\u0004\b(\u0010)ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006*À\u0006\u0001"}, d2 = {"LA0/l0;", "", "Landroidx/compose/ui/graphics/d;", "scope", "Loa/F;", "f", "(Landroidx/compose/ui/graphics/d;)V", "Lh0/g;", "position", "", "e", "(J)Z", "LU0/n;", "i", "(J)V", "LU0/r;", "size", "h", "Li0/l0;", "canvas", "Ll0/c;", "parentLayer", "a", "(Li0/l0;Ll0/c;)V", "j", "()V", "invalidate", "d", "point", "inverse", "g", "(JZ)J", "Lh0/e;", "rect", "b", "(Lh0/e;Z)V", "Lkotlin/Function2;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "c", "(LBa/p;LBa/a;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface l0 {
    void a(InterfaceC3586l0 canvas, C3870c parentLayer);

    void b(MutableRect rect, boolean inverse);

    void c(Ba.p<? super InterfaceC3586l0, ? super C3870c, C4153F> drawBlock, Ba.a<C4153F> invalidateParentLayer);

    void d();

    boolean e(long position);

    void f(androidx.compose.ui.graphics.d scope);

    long g(long point, boolean inverse);

    void h(long size);

    void i(long position);

    void invalidate();

    void j();
}
