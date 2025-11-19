package G;

import h0.C3476g;
import kotlin.Metadata;
import y0.InterfaceC5116v;

/* compiled from: SelectionController.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LH/i;", "", "selectableId", "Lkotlin/Function0;", "Ly0/v;", "layoutCoordinates", "Lb0/i;", "b", "(LH/i;JLBa/a;)Lb0/i;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {

    /* compiled from: SelectionController.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\nR(\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0006R(\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"G/h$a", "LF/j;", "Lh0/g;", "startPoint", "Loa/F;", "b", "(J)V", "delta", "c", "a", "()V", "onCancel", "J", "getLastPosition", "()J", "setLastPosition", "lastPosition", "getDragTotalDistance", "setDragTotalDistance", "dragTotalDistance", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements F.j {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private long lastPosition;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private long dragTotalDistance;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ba.a<InterfaceC5116v> f4814c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ H.i f4815d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f4816e;

        /* JADX WARN: Multi-variable type inference failed */
        a(Ba.a<? extends InterfaceC5116v> aVar, H.i iVar, long j10) {
            this.f4814c = aVar;
            this.f4815d = iVar;
            this.f4816e = j10;
            C3476g.Companion companion = C3476g.INSTANCE;
            this.lastPosition = companion.c();
            this.dragTotalDistance = companion.c();
        }

        @Override // F.j
        public void a() {
            if (H.j.b(this.f4815d, this.f4816e)) {
                this.f4815d.e();
            }
        }

        @Override // F.j
        public void b(long startPoint) {
            InterfaceC5116v interfaceC5116vInvoke = this.f4814c.invoke();
            if (interfaceC5116vInvoke != null) {
                H.i iVar = this.f4815d;
                if (!interfaceC5116vInvoke.L()) {
                    return;
                }
                iVar.b(interfaceC5116vInvoke, startPoint, H.g.INSTANCE.c(), true);
                this.lastPosition = startPoint;
            }
            if (H.j.b(this.f4815d, this.f4816e)) {
                this.dragTotalDistance = C3476g.INSTANCE.c();
            }
        }

        @Override // F.j
        public void c(long delta) {
            InterfaceC5116v interfaceC5116vInvoke = this.f4814c.invoke();
            if (interfaceC5116vInvoke != null) {
                H.i iVar = this.f4815d;
                long j10 = this.f4816e;
                if (interfaceC5116vInvoke.L() && H.j.b(iVar, j10)) {
                    long jR = C3476g.r(this.dragTotalDistance, delta);
                    this.dragTotalDistance = jR;
                    long jR2 = C3476g.r(this.lastPosition, jR);
                    if (iVar.f(interfaceC5116vInvoke, jR2, this.lastPosition, false, H.g.INSTANCE.c(), true)) {
                        this.lastPosition = jR2;
                        this.dragTotalDistance = C3476g.INSTANCE.c();
                    }
                }
            }
        }

        @Override // F.j
        public void onCancel() {
            if (H.j.b(this.f4815d, this.f4816e)) {
                this.f4815d.e();
            }
        }
    }

    /* compiled from: SelectionController.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"G/h$b", "LH/b;", "Lh0/g;", "downPosition", "", "e", "(J)Z", "dragPosition", "b", "LH/g;", "adjustment", "a", "(JLH/g;)Z", "d", "Loa/F;", "c", "()V", "J", "getLastPosition", "()J", "setLastPosition", "(J)V", "lastPosition", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements H.b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private long lastPosition = C3476g.INSTANCE.c();

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ba.a<InterfaceC5116v> f4818b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ H.i f4819c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f4820d;

        /* JADX WARN: Multi-variable type inference failed */
        b(Ba.a<? extends InterfaceC5116v> aVar, H.i iVar, long j10) {
            this.f4818b = aVar;
            this.f4819c = iVar;
            this.f4820d = j10;
        }

        @Override // H.b
        public boolean a(long downPosition, H.g adjustment) {
            InterfaceC5116v interfaceC5116vInvoke = this.f4818b.invoke();
            if (interfaceC5116vInvoke == null) {
                return false;
            }
            H.i iVar = this.f4819c;
            long j10 = this.f4820d;
            if (!interfaceC5116vInvoke.L()) {
                return false;
            }
            iVar.b(interfaceC5116vInvoke, downPosition, adjustment, false);
            this.lastPosition = downPosition;
            return H.j.b(iVar, j10);
        }

        @Override // H.b
        public boolean b(long dragPosition) {
            InterfaceC5116v interfaceC5116vInvoke = this.f4818b.invoke();
            if (interfaceC5116vInvoke == null) {
                return true;
            }
            H.i iVar = this.f4819c;
            long j10 = this.f4820d;
            if (!interfaceC5116vInvoke.L() || !H.j.b(iVar, j10)) {
                return false;
            }
            if (!iVar.f(interfaceC5116vInvoke, dragPosition, this.lastPosition, false, H.g.INSTANCE.a(), false)) {
                return true;
            }
            this.lastPosition = dragPosition;
            return true;
        }

        @Override // H.b
        public void c() {
            this.f4819c.e();
        }

        @Override // H.b
        public boolean d(long dragPosition, H.g adjustment) {
            InterfaceC5116v interfaceC5116vInvoke = this.f4818b.invoke();
            if (interfaceC5116vInvoke == null) {
                return true;
            }
            H.i iVar = this.f4819c;
            long j10 = this.f4820d;
            if (!interfaceC5116vInvoke.L() || !H.j.b(iVar, j10)) {
                return false;
            }
            if (!iVar.f(interfaceC5116vInvoke, dragPosition, this.lastPosition, false, adjustment, false)) {
                return true;
            }
            this.lastPosition = dragPosition;
            return true;
        }

        @Override // H.b
        public boolean e(long downPosition) {
            InterfaceC5116v interfaceC5116vInvoke = this.f4818b.invoke();
            if (interfaceC5116vInvoke == null) {
                return false;
            }
            H.i iVar = this.f4819c;
            long j10 = this.f4820d;
            if (!interfaceC5116vInvoke.L()) {
                return false;
            }
            if (iVar.f(interfaceC5116vInvoke, downPosition, this.lastPosition, false, H.g.INSTANCE.a(), false)) {
                this.lastPosition = downPosition;
            }
            return H.j.b(iVar, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0.i b(H.i iVar, long j10, Ba.a<? extends InterfaceC5116v> aVar) {
        a aVar2 = new a(aVar, iVar, j10);
        return H.h.i(b0.i.INSTANCE, new b(aVar, iVar, j10), aVar2);
    }
}
