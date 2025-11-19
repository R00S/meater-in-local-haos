package androidx.media3.ui;

import W1.a;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.media3.ui.SubtitleView;
import e3.C3185a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: CanvasSubtitleOutput.java */
/* renamed from: androidx.media3.ui.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2156a extends View implements SubtitleView.a {

    /* renamed from: B, reason: collision with root package name */
    private final List<C> f28183B;

    /* renamed from: C, reason: collision with root package name */
    private List<W1.a> f28184C;

    /* renamed from: D, reason: collision with root package name */
    private int f28185D;

    /* renamed from: E, reason: collision with root package name */
    private float f28186E;

    /* renamed from: F, reason: collision with root package name */
    private C3185a f28187F;

    /* renamed from: G, reason: collision with root package name */
    private float f28188G;

    public C2156a(Context context) {
        this(context, null);
    }

    private static W1.a b(W1.a aVar) {
        a.b bVarP = aVar.a().k(-3.4028235E38f).l(Integer.MIN_VALUE).p(null);
        if (aVar.f18304f == 0) {
            bVarP.h(1.0f - aVar.f18303e, 0);
        } else {
            bVarP.h((-aVar.f18303e) - 1.0f, 1);
        }
        int i10 = aVar.f18305g;
        if (i10 == 0) {
            bVarP.i(2);
        } else if (i10 == 2) {
            bVarP.i(0);
        }
        return bVarP.a();
    }

    @Override // androidx.media3.ui.SubtitleView.a
    public void a(List<W1.a> list, C3185a c3185a, float f10, int i10, float f11) {
        this.f28184C = list;
        this.f28187F = c3185a;
        this.f28186E = f10;
        this.f28185D = i10;
        this.f28188G = f11;
        while (this.f28183B.size() < list.size()) {
            this.f28183B.add(new C(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<W1.a> list = this.f28184C;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i10 = paddingBottom - paddingTop;
        float fH = F.h(this.f28185D, this.f28186E, height, i10);
        if (fH <= 0.0f) {
            return;
        }
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            W1.a aVarB = list.get(i11);
            if (aVarB.f18314p != Integer.MIN_VALUE) {
                aVarB = b(aVarB);
            }
            W1.a aVar = aVarB;
            int i12 = paddingBottom;
            this.f28183B.get(i11).b(aVar, this.f28187F, fH, F.h(aVar.f18312n, aVar.f18313o, height, i10), this.f28188G, canvas, paddingLeft, paddingTop, width, i12);
            i11++;
            size = size;
            i10 = i10;
            paddingBottom = i12;
            width = width;
        }
    }

    public C2156a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28183B = new ArrayList();
        this.f28184C = Collections.emptyList();
        this.f28185D = 0;
        this.f28186E = 0.0533f;
        this.f28187F = C3185a.f40402g;
        this.f28188G = 0.08f;
    }
}
