package u0;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import s.C4411v;

/* compiled from: PointerInputEventProcessor.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0003R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0011"}, d2 = {"Lu0/A;", "", "<init>", "()V", "Lu0/B;", "pointerInputEvent", "Lu0/N;", "positionCalculator", "Lu0/g;", "b", "(Lu0/B;Lu0/N;)Lu0/g;", "Loa/F;", "a", "Ls/v;", "Lu0/A$a;", "Ls/v;", "previousPointerInputData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4615A {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C4411v<a> previousPointerInputData = new C4411v<>(0, 1, null);

    /* compiled from: PointerInputEventProcessor.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\f\u0010\u0012R\u001d\u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Lu0/A$a;", "", "", "uptime", "Lh0/g;", "positionOnScreen", "", "down", "Lu0/M;", "type", "<init>", "(JJZILkotlin/jvm/internal/k;)V", "a", "J", "c", "()J", "b", "Z", "()Z", "d", "I", "getType-T8wyACA", "()I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u0.A$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long uptime;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long positionOnScreen;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean down;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int type;

        public /* synthetic */ a(long j10, long j11, boolean z10, int i10, C3854k c3854k) {
            this(j10, j11, z10, i10);
        }

        /* renamed from: a, reason: from getter */
        public final boolean getDown() {
            return this.down;
        }

        /* renamed from: b, reason: from getter */
        public final long getPositionOnScreen() {
            return this.positionOnScreen;
        }

        /* renamed from: c, reason: from getter */
        public final long getUptime() {
            return this.uptime;
        }

        private a(long j10, long j11, boolean z10, int i10) {
            this.uptime = j10;
            this.positionOnScreen = j11;
            this.down = z10;
            this.type = i10;
        }
    }

    public final void a() {
        this.previousPointerInputData.b();
    }

    public final C4641g b(C4616B pointerInputEvent, InterfaceC4628N positionCalculator) {
        long uptime;
        boolean down;
        long jX;
        C4411v c4411v = new C4411v(pointerInputEvent.b().size());
        List<PointerInputEventData> listB = pointerInputEvent.b();
        int size = listB.size();
        for (int i10 = 0; i10 < size; i10++) {
            PointerInputEventData pointerInputEventData = listB.get(i10);
            a aVarF = this.previousPointerInputData.f(pointerInputEventData.getId());
            if (aVarF == null) {
                uptime = pointerInputEventData.getUptime();
                jX = pointerInputEventData.getPosition();
                down = false;
            } else {
                long uptime2 = aVarF.getUptime();
                uptime = uptime2;
                down = aVarF.getDown();
                jX = positionCalculator.x(aVarF.getPositionOnScreen());
            }
            c4411v.k(pointerInputEventData.getId(), new PointerInputChange(pointerInputEventData.getId(), pointerInputEventData.getUptime(), pointerInputEventData.getPosition(), pointerInputEventData.getDown(), pointerInputEventData.getPressure(), uptime, jX, down, false, pointerInputEventData.getType(), pointerInputEventData.c(), pointerInputEventData.getScrollDelta(), pointerInputEventData.getOriginalEventPosition(), null));
            if (pointerInputEventData.getDown()) {
                this.previousPointerInputData.k(pointerInputEventData.getId(), new a(pointerInputEventData.getUptime(), pointerInputEventData.getPositionOnScreen(), pointerInputEventData.getDown(), pointerInputEventData.getType(), null));
            } else {
                this.previousPointerInputData.l(pointerInputEventData.getId());
            }
        }
        return new C4641g(c4411v, pointerInputEvent);
    }
}
