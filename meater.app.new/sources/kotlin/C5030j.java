package kotlin;

import Ba.l;
import Ba.p;
import Ba.q;
import androidx.compose.ui.platform.i1;
import h0.C3476g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.O;
import oa.C4153F;
import ta.InterfaceC4588d;
import u0.C4627M;
import u0.C4649o;
import u0.C4650p;
import u0.C4659y;
import u0.InterfaceC4622H;
import u0.InterfaceC4637c;
import u0.PointerInputChange;
import ua.C4696b;

/* compiled from: DragGestureDetector.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a3\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\n\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0088\u0001\u0010\u0017\u001a\u00020\u0005*\u00020\f2\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\u0016H\u0080@¢\u0006\u0004\b\u0017\u0010\u0018\u001aC\u0010\u001d\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00192\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00050\u0016H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a3\u0010\u001f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\t\u001ad\u0010!\u001a\u00020\u0005*\u00020\f2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00050\u0016H\u0086@¢\u0006\u0004\b!\u0010\"\u001a!\u0010#\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b#\u0010\u000b\u001a\u001e\u0010%\u001a\u00020\u0007*\u00020$2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a\u001e\u0010(\u001a\u00020\u001b*\u00020'2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000ø\u0001\u0000¢\u0006\u0004\b(\u0010)\"\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,\"\u0014\u0010.\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010,\"\u0014\u0010/\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Lu0/c;", "Lu0/y;", "pointerId", "Lkotlin/Function1;", "Lu0/z;", "Loa/F;", "onDrag", "", "h", "(Lu0/c;JLBa/l;Lta/d;)Ljava/lang/Object;", "b", "(Lu0/c;JLta/d;)Ljava/lang/Object;", "Lu0/H;", "Lkotlin/Function3;", "Lh0/g;", "onDragStart", "onDragEnd", "Lkotlin/Function0;", "onDragCancel", "shouldAwaitTouchSlop", "Lx/q;", "orientationLock", "Lkotlin/Function2;", "e", "(Lu0/H;LBa/q;LBa/l;LBa/a;LBa/a;Lx/q;LBa/p;Lta/d;)Ljava/lang/Object;", "Lu0/M;", "pointerType", "", "onPointerSlopReached", "c", "(Lu0/c;JILBa/p;Lta/d;)Ljava/lang/Object;", "i", "onHorizontalDrag", "f", "(Lu0/H;LBa/l;LBa/a;LBa/a;LBa/p;Lta/d;)Ljava/lang/Object;", "d", "Lu0/o;", "j", "(Lu0/o;J)Z", "Landroidx/compose/ui/platform/i1;", "k", "(Landroidx/compose/ui/platform/i1;I)F", "LU0/h;", "a", "F", "mouseSlop", "defaultTouchSlop", "mouseToTouchSlopRatio", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: x.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5030j {

    /* renamed from: a, reason: collision with root package name */
    private static final float f52413a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f52414b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f52415c;

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {967}, m = "awaitDragOrCancellation-rnUCldI")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x.j$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f52416B;

        /* renamed from: C, reason: collision with root package name */
        Object f52417C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ Object f52418D;

        /* renamed from: E, reason: collision with root package name */
        int f52419E;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f52418D = obj;
            this.f52419E |= Integer.MIN_VALUE;
            return C5030j.b(null, 0L, this);
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {972, 1014}, m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x.j$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f52420B;

        /* renamed from: C, reason: collision with root package name */
        Object f52421C;

        /* renamed from: D, reason: collision with root package name */
        Object f52422D;

        /* renamed from: E, reason: collision with root package name */
        Object f52423E;

        /* renamed from: F, reason: collision with root package name */
        Object f52424F;

        /* renamed from: G, reason: collision with root package name */
        float f52425G;

        /* renamed from: H, reason: collision with root package name */
        /* synthetic */ Object f52426H;

        /* renamed from: I, reason: collision with root package name */
        int f52427I;

        b(InterfaceC4588d<? super b> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f52426H = obj;
            this.f52427I |= Integer.MIN_VALUE;
            return C5030j.c(null, 0L, 0, null, this);
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {898}, m = "awaitLongPressOrCancellation-rnUCldI")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x.j$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f52428B;

        /* renamed from: C, reason: collision with root package name */
        Object f52429C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ Object f52430D;

        /* renamed from: E, reason: collision with root package name */
        int f52431E;

        c(InterfaceC4588d<? super c> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f52430D = obj;
            this.f52431E |= Integer.MIN_VALUE;
            return C5030j.d(null, 0L, this);
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", l = {901, 918}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/c;", "Loa/F;", "<anonymous>", "(Lu0/c;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x.j$d */
    static final class d extends kotlin.coroutines.jvm.internal.k implements p<InterfaceC4637c, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: C, reason: collision with root package name */
        Object f52432C;

        /* renamed from: D, reason: collision with root package name */
        int f52433D;

        /* renamed from: E, reason: collision with root package name */
        int f52434E;

        /* renamed from: F, reason: collision with root package name */
        private /* synthetic */ Object f52435F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ O<PointerInputChange> f52436G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ O<PointerInputChange> f52437H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(O<PointerInputChange> o10, O<PointerInputChange> o11, InterfaceC4588d<? super d> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f52436G = o10;
            this.f52437H = o11;
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4637c interfaceC4637c, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((d) create(interfaceC4637c, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            d dVar = new d(this.f52436G, this.f52437H, interfaceC4588d);
            dVar.f52435F = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
        
            r2 = r6;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00cd A[EDGE_INSN: B:65:0x00cd->B:41:0x00cd BREAK  A[LOOP:0: B:36:0x00ba->B:40:0x00ca], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x006f A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v7, types: [T, u0.z] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ac -> B:35:0x00af). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 328
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C5030j.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9", f = "DragGestureDetector.kt", l = {247, 253, 972, 1014, 1025}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/c;", "Loa/F;", "<anonymous>", "(Lu0/c;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x.j$e */
    static final class e extends kotlin.coroutines.jvm.internal.k implements p<InterfaceC4637c, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: C, reason: collision with root package name */
        Object f52438C;

        /* renamed from: D, reason: collision with root package name */
        Object f52439D;

        /* renamed from: E, reason: collision with root package name */
        Object f52440E;

        /* renamed from: F, reason: collision with root package name */
        Object f52441F;

        /* renamed from: G, reason: collision with root package name */
        Object f52442G;

        /* renamed from: H, reason: collision with root package name */
        Object f52443H;

        /* renamed from: I, reason: collision with root package name */
        boolean f52444I;

        /* renamed from: J, reason: collision with root package name */
        float f52445J;

        /* renamed from: K, reason: collision with root package name */
        int f52446K;

        /* renamed from: L, reason: collision with root package name */
        private /* synthetic */ Object f52447L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ Ba.a<Boolean> f52448M;

        /* renamed from: N, reason: collision with root package name */
        final /* synthetic */ N f52449N;

        /* renamed from: O, reason: collision with root package name */
        final /* synthetic */ EnumC5037q f52450O;

        /* renamed from: P, reason: collision with root package name */
        final /* synthetic */ q<PointerInputChange, PointerInputChange, C3476g, C4153F> f52451P;

        /* renamed from: Q, reason: collision with root package name */
        final /* synthetic */ p<PointerInputChange, C3476g, C4153F> f52452Q;

        /* renamed from: R, reason: collision with root package name */
        final /* synthetic */ Ba.a<C4153F> f52453R;

        /* renamed from: S, reason: collision with root package name */
        final /* synthetic */ l<PointerInputChange, C4153F> f52454S;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Ba.a<Boolean> aVar, N n10, EnumC5037q enumC5037q, q<? super PointerInputChange, ? super PointerInputChange, ? super C3476g, C4153F> qVar, p<? super PointerInputChange, ? super C3476g, C4153F> pVar, Ba.a<C4153F> aVar2, l<? super PointerInputChange, C4153F> lVar, InterfaceC4588d<? super e> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f52448M = aVar;
            this.f52449N = n10;
            this.f52450O = enumC5037q;
            this.f52451P = qVar;
            this.f52452Q = pVar;
            this.f52453R = aVar2;
            this.f52454S = lVar;
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4637c interfaceC4637c, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((e) create(interfaceC4637c, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            e eVar = new e(this.f52448M, this.f52449N, this.f52450O, this.f52451P, this.f52452Q, this.f52453R, this.f52454S, interfaceC4588d);
            eVar.f52447L = obj;
            return eVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:127:0x02ff, code lost:
        
            if (((r2 != null ? r2 == kotlin.EnumC5037q.Vertical ? h0.C3476g.n(r5) : h0.C3476g.m(r5) : h0.C3476g.k(r5)) == 0.0f) == false) goto L128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0108, code lost:
        
            if (r17 == false) goto L84;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x0253, code lost:
        
            if (kotlin.C5030j.j(r2.V(), r0) != false) goto L87;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:104:0x02b3, B:116:0x02df], limit reached: 144 */
        /* JADX WARN: Path cross not found for [B:45:0x0188, B:47:0x018d], limit reached: 144 */
        /* JADX WARN: Path cross not found for [B:50:0x0194, B:45:0x0188], limit reached: 144 */
        /* JADX WARN: Removed duplicated region for block: B:101:0x02ab  */
        /* JADX WARN: Removed duplicated region for block: B:102:0x02ad  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x0313  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x0326  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x0345  */
        /* JADX WARN: Removed duplicated region for block: B:146:0x02a6 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:150:0x017e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0151 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x018d  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x019a  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0211  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0215  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0223  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0229  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0255  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x027c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:94:0x028a  */
        /* JADX WARN: Type inference failed for: r13v0 */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, u0.q] */
        /* JADX WARN: Type inference failed for: r13v5 */
        /* JADX WARN: Type inference failed for: r13v6 */
        /* JADX WARN: Type inference failed for: r13v7 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0120 -> B:78:0x0213). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0208 -> B:75:0x020b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x027a -> B:92:0x027d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 841
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C5030j.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5", f = "DragGestureDetector.kt", l = {627, 629, 640}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/c;", "Loa/F;", "<anonymous>", "(Lu0/c;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x.j$i */
    static final class i extends kotlin.coroutines.jvm.internal.k implements p<InterfaceC4637c, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: C, reason: collision with root package name */
        Object f52458C;

        /* renamed from: D, reason: collision with root package name */
        int f52459D;

        /* renamed from: E, reason: collision with root package name */
        private /* synthetic */ Object f52460E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ l<C3476g, C4153F> f52461F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ p<PointerInputChange, Float, C4153F> f52462G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ Ba.a<C4153F> f52463H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ Ba.a<C4153F> f52464I;

        /* compiled from: DragGestureDetector.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu0/z;", "it", "Loa/F;", "a", "(Lu0/z;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: x.j$i$a */
        static final class a extends AbstractC3864v implements l<PointerInputChange, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ p<PointerInputChange, Float, C4153F> f52465B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(p<? super PointerInputChange, ? super Float, C4153F> pVar) {
                super(1);
                this.f52465B = pVar;
            }

            public final void a(PointerInputChange pointerInputChange) {
                this.f52465B.invoke(pointerInputChange, Float.valueOf(C3476g.m(C4650p.g(pointerInputChange))));
                pointerInputChange.a();
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(PointerInputChange pointerInputChange) {
                a(pointerInputChange);
                return C4153F.f46609a;
            }
        }

        /* compiled from: DragGestureDetector.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lu0/z;", "change", "", "over", "Loa/F;", "a", "(Lu0/z;F)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: x.j$i$b */
        static final class b extends AbstractC3864v implements p<PointerInputChange, Float, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ L f52466B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(L l10) {
                super(2);
                this.f52466B = l10;
            }

            public final void a(PointerInputChange pointerInputChange, float f10) {
                pointerInputChange.a();
                this.f52466B.f43975B = f10;
            }

            @Override // Ba.p
            public /* bridge */ /* synthetic */ C4153F invoke(PointerInputChange pointerInputChange, Float f10) {
                a(pointerInputChange, f10.floatValue());
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(l<? super C3476g, C4153F> lVar, p<? super PointerInputChange, ? super Float, C4153F> pVar, Ba.a<C4153F> aVar, Ba.a<C4153F> aVar2, InterfaceC4588d<? super i> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f52461F = lVar;
            this.f52462G = pVar;
            this.f52463H = aVar;
            this.f52464I = aVar2;
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4637c interfaceC4637c, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((i) create(interfaceC4637c, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            i iVar = new i(this.f52461F, this.f52462G, this.f52463H, this.f52464I, interfaceC4588d);
            iVar.f52460E = obj;
            return iVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = ua.C4696b.e()
                int r1 = r12.f52459D
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L32
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                oa.C4173r.b(r13)
                goto La7
            L16:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1e:
                java.lang.Object r1 = r12.f52458C
                kotlin.jvm.internal.L r1 = (kotlin.jvm.internal.L) r1
                java.lang.Object r3 = r12.f52460E
                u0.c r3 = (u0.InterfaceC4637c) r3
                oa.C4173r.b(r13)
                goto L72
            L2a:
                java.lang.Object r1 = r12.f52460E
                u0.c r1 = (u0.InterfaceC4637c) r1
                oa.C4173r.b(r13)
                goto L4d
            L32:
                oa.C4173r.b(r13)
                java.lang.Object r13 = r12.f52460E
                u0.c r13 = (u0.InterfaceC4637c) r13
                r12.f52460E = r13
                r12.f52459D = r4
                r6 = 0
                r7 = 0
                r9 = 2
                r10 = 0
                r5 = r13
                r8 = r12
                java.lang.Object r1 = kotlin.C5018A.e(r5, r6, r7, r8, r9, r10)
                if (r1 != r0) goto L4a
                return r0
            L4a:
                r11 = r1
                r1 = r13
                r13 = r11
            L4d:
                u0.z r13 = (u0.PointerInputChange) r13
                kotlin.jvm.internal.L r10 = new kotlin.jvm.internal.L
                r10.<init>()
                long r5 = r13.getId()
                int r7 = r13.getType()
                x.j$i$b r8 = new x.j$i$b
                r8.<init>(r10)
                r12.f52460E = r1
                r12.f52458C = r10
                r12.f52459D = r3
                r4 = r1
                r9 = r12
                java.lang.Object r13 = kotlin.C5030j.c(r4, r5, r7, r8, r9)
                if (r13 != r0) goto L70
                return r0
            L70:
                r3 = r1
                r1 = r10
            L72:
                u0.z r13 = (u0.PointerInputChange) r13
                if (r13 == 0) goto Lba
                Ba.l<h0.g, oa.F> r4 = r12.f52461F
                long r5 = r13.getPosition()
                h0.g r5 = h0.C3476g.d(r5)
                r4.invoke(r5)
                Ba.p<u0.z, java.lang.Float, oa.F> r4 = r12.f52462G
                float r1 = r1.f43975B
                java.lang.Float r1 = kotlin.coroutines.jvm.internal.b.b(r1)
                r4.invoke(r13, r1)
                long r4 = r13.getId()
                x.j$i$a r13 = new x.j$i$a
                Ba.p<u0.z, java.lang.Float, oa.F> r1 = r12.f52462G
                r13.<init>(r1)
                r1 = 0
                r12.f52460E = r1
                r12.f52458C = r1
                r12.f52459D = r2
                java.lang.Object r13 = kotlin.C5030j.i(r3, r4, r13, r12)
                if (r13 != r0) goto La7
                return r0
            La7:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto Lb5
                Ba.a<oa.F> r13 = r12.f52463H
                r13.invoke()
                goto Lba
            Lb5:
                Ba.a<oa.F> r13 = r12.f52464I
                r13.invoke()
            Lba:
                oa.F r13 = oa.C4153F.f46609a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C5030j.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {108}, m = "drag-jO51t88")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x.j$j, reason: collision with other inner class name */
    static final class C0766j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f52467B;

        /* renamed from: C, reason: collision with root package name */
        Object f52468C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ Object f52469D;

        /* renamed from: E, reason: collision with root package name */
        int f52470E;

        C0766j(InterfaceC4588d<? super C0766j> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f52469D = obj;
            this.f52470E |= Integer.MIN_VALUE;
            return C5030j.h(null, 0L, null, this);
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {973}, m = "horizontalDrag-jO51t88")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x.j$k */
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f52471B;

        /* renamed from: C, reason: collision with root package name */
        Object f52472C;

        /* renamed from: D, reason: collision with root package name */
        Object f52473D;

        /* renamed from: E, reason: collision with root package name */
        Object f52474E;

        /* renamed from: F, reason: collision with root package name */
        Object f52475F;

        /* renamed from: G, reason: collision with root package name */
        /* synthetic */ Object f52476G;

        /* renamed from: H, reason: collision with root package name */
        int f52477H;

        k(InterfaceC4588d<? super k> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f52476G = obj;
            this.f52477H |= Integer.MIN_VALUE;
            return C5030j.i(null, 0L, null, this);
        }
    }

    static {
        float fU = U0.h.u((float) 0.125d);
        f52413a = fU;
        float fU2 = U0.h.u(18);
        f52414b = fU2;
        f52415c = fU / fU2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ca, code lost:
    
        if (u0.C4650p.j(r11) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(u0.InterfaceC4637c r17, long r18, ta.InterfaceC4588d<? super u0.PointerInputChange> r20) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C5030j.b(u0.c, long, ta.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0165 -> B:62:0x016b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(u0.InterfaceC4637c r19, long r20, int r22, Ba.p<? super u0.PointerInputChange, ? super java.lang.Float, oa.C4153F> r23, ta.InterfaceC4588d<? super u0.PointerInputChange> r24) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C5030j.c(u0.c, long, int, Ba.p, ta.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, java.lang.Object, u0.z] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6, types: [u0.z] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(u0.InterfaceC4637c r9, long r10, ta.InterfaceC4588d<? super u0.PointerInputChange> r12) {
        /*
            boolean r0 = r12 instanceof kotlin.C5030j.c
            if (r0 == 0) goto L13
            r0 = r12
            x.j$c r0 = (kotlin.C5030j.c) r0
            int r1 = r0.f52431E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f52431E = r1
            goto L18
        L13:
            x.j$c r0 = new x.j$c
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f52430D
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f52431E
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r9 = r0.f52429C
            kotlin.jvm.internal.O r9 = (kotlin.jvm.internal.O) r9
            java.lang.Object r10 = r0.f52428B
            u0.z r10 = (u0.PointerInputChange) r10
            oa.C4173r.b(r12)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9b
            goto La4
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            oa.C4173r.b(r12)
            u0.o r12 = r9.V()
            boolean r12 = j(r12, r10)
            if (r12 == 0) goto L49
            return r4
        L49:
            u0.o r12 = r9.V()
            java.util.List r12 = r12.c()
            int r2 = r12.size()
            r5 = 0
        L56:
            if (r5 >= r2) goto L6d
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            u0.z r7 = (u0.PointerInputChange) r7
            long r7 = r7.getId()
            boolean r7 = u0.C4659y.d(r7, r10)
            if (r7 == 0) goto L6a
            goto L6e
        L6a:
            int r5 = r5 + 1
            goto L56
        L6d:
            r6 = r4
        L6e:
            r10 = r6
            u0.z r10 = (u0.PointerInputChange) r10
            if (r10 != 0) goto L74
            return r4
        L74:
            kotlin.jvm.internal.O r11 = new kotlin.jvm.internal.O
            r11.<init>()
            kotlin.jvm.internal.O r12 = new kotlin.jvm.internal.O
            r12.<init>()
            r12.f43978B = r10
            androidx.compose.ui.platform.i1 r2 = r9.getViewConfiguration()
            long r5 = r2.c()
            x.j$d r2 = new x.j$d     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            r2.<init>(r12, r11, r4)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            r0.f52428B = r10     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            r0.f52429C = r11     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            r0.f52431E = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            java.lang.Object r9 = r9.l1(r5, r2, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            if (r9 != r1) goto La4
            return r1
        L9a:
            r9 = r11
        L9b:
            T r9 = r9.f43978B
            u0.z r9 = (u0.PointerInputChange) r9
            if (r9 != 0) goto La3
            r4 = r10
            goto La4
        La3:
            r4 = r9
        La4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C5030j.d(u0.c, long, ta.d):java.lang.Object");
    }

    public static final Object e(InterfaceC4622H interfaceC4622H, q<? super PointerInputChange, ? super PointerInputChange, ? super C3476g, C4153F> qVar, l<? super PointerInputChange, C4153F> lVar, Ba.a<C4153F> aVar, Ba.a<Boolean> aVar2, EnumC5037q enumC5037q, p<? super PointerInputChange, ? super C3476g, C4153F> pVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objC = C5035o.c(interfaceC4622H, new e(aVar2, new N(), enumC5037q, qVar, pVar, aVar, lVar, null), interfaceC4588d);
        return objC == C4696b.e() ? objC : C4153F.f46609a;
    }

    public static final Object f(InterfaceC4622H interfaceC4622H, l<? super C3476g, C4153F> lVar, Ba.a<C4153F> aVar, Ba.a<C4153F> aVar2, p<? super PointerInputChange, ? super Float, C4153F> pVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objC = C5035o.c(interfaceC4622H, new i(lVar, pVar, aVar, aVar2, null), interfaceC4588d);
        return objC == C4696b.e() ? objC : C4153F.f46609a;
    }

    public static /* synthetic */ Object g(InterfaceC4622H interfaceC4622H, l lVar, Ba.a aVar, Ba.a aVar2, p pVar, InterfaceC4588d interfaceC4588d, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = f.f52455B;
        }
        l lVar2 = lVar;
        if ((i10 & 2) != 0) {
            aVar = g.f52456B;
        }
        Ba.a aVar3 = aVar;
        if ((i10 & 4) != 0) {
            aVar2 = h.f52457B;
        }
        return f(interfaceC4622H, lVar2, aVar3, aVar2, pVar, interfaceC4588d);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(u0.InterfaceC4637c r4, long r5, Ba.l<? super u0.PointerInputChange, oa.C4153F> r7, ta.InterfaceC4588d<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof kotlin.C5030j.C0766j
            if (r0 == 0) goto L13
            r0 = r8
            x.j$j r0 = (kotlin.C5030j.C0766j) r0
            int r1 = r0.f52470E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f52470E = r1
            goto L18
        L13:
            x.j$j r0 = new x.j$j
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f52469D
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f52470E
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f52468C
            Ba.l r4 = (Ba.l) r4
            java.lang.Object r5 = r0.f52467B
            u0.c r5 = (u0.InterfaceC4637c) r5
            oa.C4173r.b(r8)
            r7 = r4
            r4 = r5
            goto L4b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            oa.C4173r.b(r8)
        L3e:
            r0.f52467B = r4
            r0.f52468C = r7
            r0.f52470E = r3
            java.lang.Object r8 = b(r4, r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            u0.z r8 = (u0.PointerInputChange) r8
            if (r8 != 0) goto L55
            r4 = 0
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r4
        L55:
            boolean r5 = u0.C4650p.d(r8)
            if (r5 == 0) goto L60
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r4
        L60:
            r7.invoke(r8)
            long r5 = r8.getId()
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C5030j.h(u0.c, long, Ba.l, ta.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x010b, code lost:
    
        if (((r8 != null ? r8 == kotlin.EnumC5037q.Vertical ? h0.C3476g.n(r4) : h0.C3476g.m(r4) : h0.C3476g.k(r4)) == 0.0f) == false) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:35:0x00c2, B:46:0x00eb], limit reached: 72 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0083 -> B:23:0x0089). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object i(u0.InterfaceC4637c r18, long r19, Ba.l<? super u0.PointerInputChange, oa.C4153F> r21, ta.InterfaceC4588d<? super java.lang.Boolean> r22) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C5030j.i(u0.c, long, Ba.l, ta.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(C4649o c4649o, long j10) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> listC = c4649o.c();
        int size = listC.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = listC.get(i10);
            if (C4659y.d(pointerInputChange.getId(), j10)) {
                break;
            }
            i10++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z10 = true;
        }
        return true ^ z10;
    }

    public static final float k(i1 i1Var, int i10) {
        return C4627M.g(i10, C4627M.INSTANCE.b()) ? i1Var.f() * f52415c : i1Var.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x.j$g */
    public static final class g extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final g f52456B = new g();

        g() {
            super(0);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }

        public final void a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x.j$h */
    public static final class h extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final h f52457B = new h();

        h() {
            super(0);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }

        public final void a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh0/g;", "it", "Loa/F;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x.j$f */
    public static final class f extends AbstractC3864v implements l<C3476g, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final f f52455B = new f();

        f() {
            super(1);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C3476g c3476g) {
            a(c3476g.getPackedValue());
            return C4153F.f46609a;
        }

        public final void a(long j10) {
        }
    }
}
