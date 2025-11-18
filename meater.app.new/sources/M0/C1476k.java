package M0;

import H0.TextLayoutResult;
import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import h0.C3478i;
import i0.C3553P;
import i0.L0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.InterfaceC4156a;
import u0.InterfaceC4628N;

/* compiled from: CursorAnchorInfoController.android.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0016\u0010\u000f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001aR\u0016\u0010\u0011\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010.\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\b0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00104\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00101R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010;\u001a\u00020+8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, d2 = {"LM0/k;", "", "Lu0/N;", "rootPositionCalculator", "LM0/s;", "inputMethodManager", "<init>", "(Lu0/N;LM0/s;)V", "Loa/F;", "b", "()V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "a", "(ZZZZZZ)V", "Lu0/N;", "LM0/s;", "c", "Ljava/lang/Object;", "lock", "d", "Z", "monitorEnabled", "e", "hasPendingImmediateRequest", "f", "g", "h", "i", "LM0/E;", "j", "LM0/E;", "textFieldValue", "LH0/F;", "k", "LH0/F;", "textLayoutResult", "Lkotlin/Function1;", "Li0/L0;", "l", "LBa/l;", "textFieldToRootTransform", "Lh0/i;", "m", "Lh0/i;", "innerTextFieldBounds", "n", "decorationBoxBounds", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "o", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "p", "[F", "matrix", "Landroid/graphics/Matrix;", "q", "Landroid/graphics/Matrix;", "androidMatrix", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC4156a
/* renamed from: M0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1476k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4628N rootPositionCalculator;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s inputMethodManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean monitorEnabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean hasPendingImmediateRequest;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean includeInsertionMarker;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean includeCharacterBounds;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean includeEditorBounds;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean includeLineBounds;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private TextFieldValue textFieldValue;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private TextLayoutResult textLayoutResult;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private C3478i innerTextFieldBounds;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private C3478i decorationBoxBounds;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Ba.l<? super L0, C4153F> textFieldToRootTransform = a.f11922B;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final float[] matrix = L0.c(null, 1, null);

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Matrix androidMatrix = new Matrix();

    public C1476k(InterfaceC4628N interfaceC4628N, s sVar) {
        this.rootPositionCalculator = interfaceC4628N;
        this.inputMethodManager = sVar;
    }

    private final void b() {
        if (this.inputMethodManager.a()) {
            this.textFieldToRootTransform.invoke(L0.a(this.matrix));
            this.rootPositionCalculator.r(this.matrix);
            C3553P.a(this.androidMatrix, this.matrix);
            s sVar = this.inputMethodManager;
            CursorAnchorInfo.Builder builder = this.builder;
            TextFieldValue textFieldValue = this.textFieldValue;
            C3862t.d(textFieldValue);
            C3862t.d(null);
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            C3862t.d(textLayoutResult);
            Matrix matrix = this.androidMatrix;
            C3478i c3478i = this.innerTextFieldBounds;
            C3862t.d(c3478i);
            C3478i c3478i2 = this.decorationBoxBounds;
            C3862t.d(c3478i2);
            sVar.b(C1475j.b(builder, textFieldValue, null, textLayoutResult, matrix, c3478i, c3478i2, this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds));
            this.hasPendingImmediateRequest = false;
        }
    }

    public final void a(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
        synchronized (this.lock) {
            try {
                this.includeInsertionMarker = includeInsertionMarker;
                this.includeCharacterBounds = includeCharacterBounds;
                this.includeEditorBounds = includeEditorBounds;
                this.includeLineBounds = includeLineBounds;
                if (immediate) {
                    this.hasPendingImmediateRequest = true;
                    if (this.textFieldValue != null) {
                        b();
                    }
                }
                this.monitorEnabled = monitor;
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* compiled from: CursorAnchorInfoController.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/L0;", "it", "Loa/F;", "a", "([F)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: M0.k$a */
    static final class a extends AbstractC3864v implements Ba.l<L0, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f11922B = new a();

        a() {
            super(1);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(L0 l02) {
            a(l02.getValues());
            return C4153F.f46609a;
        }

        public final void a(float[] fArr) {
        }
    }
}
