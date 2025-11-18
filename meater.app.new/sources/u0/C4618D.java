package u0;

import A0.C0841u;
import kotlin.Metadata;

/* compiled from: PointerInputEventProcessor.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Lu0/D;", "", "LA0/G;", "root", "<init>", "(LA0/G;)V", "Lu0/B;", "pointerEvent", "Lu0/N;", "positionCalculator", "", "isInBounds", "Lu0/O;", "b", "(Lu0/B;Lu0/N;Z)I", "Loa/F;", "c", "()V", "a", "LA0/G;", "getRoot", "()LA0/G;", "Lu0/f;", "Lu0/f;", "hitPathTracker", "Lu0/A;", "Lu0/A;", "pointerInputChangeEventProducer", "LA0/u;", "d", "LA0/u;", "hitResult", "e", "Z", "isProcessing", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4618D {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final A0.G root;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C4640f hitPathTracker;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C4615A pointerInputChangeEventProducer = new C4615A();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C0841u hitResult = new C0841u();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isProcessing;

    public C4618D(A0.G g10) {
        this.root = g10;
        this.hitPathTracker = new C4640f(g10.h());
    }

    public final void a() {
        this.hitPathTracker.b();
    }

    public final int b(C4616B pointerEvent, InterfaceC4628N positionCalculator, boolean isInBounds) {
        boolean z10;
        if (this.isProcessing) {
            return C4619E.a(false, false);
        }
        boolean z11 = true;
        try {
            this.isProcessing = true;
            C4641g c4641gB = this.pointerInputChangeEventProducer.b(pointerEvent, positionCalculator);
            int iN = c4641gB.b().n();
            for (int i10 = 0; i10 < iN; i10++) {
                PointerInputChange pointerInputChangeO = c4641gB.b().o(i10);
                if (!pointerInputChangeO.getPressed() && !pointerInputChangeO.getPreviousPressed()) {
                }
                z10 = false;
                break;
            }
            z10 = true;
            int iN2 = c4641gB.b().n();
            for (int i11 = 0; i11 < iN2; i11++) {
                PointerInputChange pointerInputChangeO2 = c4641gB.b().o(i11);
                if (z10 || C4650p.b(pointerInputChangeO2)) {
                    A0.G.y0(this.root, pointerInputChangeO2.getPosition(), this.hitResult, C4627M.g(pointerInputChangeO2.getType(), C4627M.INSTANCE.d()), false, 8, null);
                    if (!this.hitResult.isEmpty()) {
                        this.hitPathTracker.a(pointerInputChangeO2.getId(), this.hitResult, C4650p.b(pointerInputChangeO2));
                        this.hitResult.clear();
                    }
                }
            }
            this.hitPathTracker.e();
            boolean zC = this.hitPathTracker.c(c4641gB, isInBounds);
            if (c4641gB.getSuppressMovementConsumption()) {
                z11 = false;
            } else {
                int iN3 = c4641gB.b().n();
                for (int i12 = 0; i12 < iN3; i12++) {
                    PointerInputChange pointerInputChangeO3 = c4641gB.b().o(i12);
                    if (C4650p.j(pointerInputChangeO3) && pointerInputChangeO3.p()) {
                        break;
                    }
                }
                z11 = false;
            }
            int iA = C4619E.a(zC, z11);
            this.isProcessing = false;
            return iA;
        } catch (Throwable th) {
            this.isProcessing = false;
            throw th;
        }
    }

    public final void c() {
        if (this.isProcessing) {
            return;
        }
        this.pointerInputChangeEventProducer.a();
        this.hitPathTracker.d();
    }
}
