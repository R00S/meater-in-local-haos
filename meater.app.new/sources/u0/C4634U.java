package u0;

import A0.C0832k;
import Xb.C1841i;
import Xb.C1849m;
import Xb.InterfaceC1847l;
import Xb.InterfaceC1867v0;
import androidx.compose.ui.input.pointer.PointerInputResetException;
import androidx.compose.ui.platform.i1;
import b0.i;
import h0.C3482m;
import h0.C3483n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4172q;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: SuspendingPointerInputFilter.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001OBY\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b\u0012\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J[\u0010\u0016\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\nH\u0000¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u0018J*\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010\u0018J:\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010!2\"\u0010#\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\nH\u0096@¢\u0006\u0004\b$\u0010%R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\"\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R2\u0010,\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\"\u00108\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u000305R\u00020\u0000048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010:\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u000305R\u00020\u0000048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107R\u0018\u0010<\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00102R\u001c\u0010?\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b=\u0010>R\\\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n2\"\u0010@\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010GR\u0014\u0010N\u001a\u00020K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u001a\u0010Q\u001a\u00020\u001c8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bO\u0010PR\u001a\u0010T\u001a\u00020R8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bS\u0010P\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006U"}, d2 = {"Lu0/U;", "Lb0/i$c;", "Lu0/T;", "Lu0/H;", "LU0/d;", "", "key1", "key2", "", "keys", "Lkotlin/Function2;", "Lta/d;", "Loa/F;", "pointerInputHandler", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;LBa/p;)V", "Lu0/o;", "pointerEvent", "Lu0/q;", "pass", "m2", "(Lu0/o;Lu0/q;)V", "o2", "U1", "()V", "N0", "v1", "F1", "LU0/r;", "bounds", "t0", "(Lu0/o;Lu0/q;J)V", "w0", "R", "Lu0/c;", "block", "r0", "(LBa/p;Lta/d;)Ljava/lang/Object;", "O", "Ljava/lang/Object;", "P", "Q", "[Ljava/lang/Object;", "LBa/p;", "_pointerInputHandler", "LXb/v0;", "S", "LXb/v0;", "pointerInputJob", "T", "Lu0/o;", "currentEvent", "LQ/b;", "Lu0/U$a;", "U", "LQ/b;", "pointerHandlers", "V", "dispatchingPointerHandlers", "W", "lastPointerEvent", "X", "J", "boundsSize", "value", "n2", "()LBa/p;", "setPointerInputHandler", "(LBa/p;)V", "", "getDensity", "()F", "density", "R0", "fontScale", "Landroidx/compose/ui/platform/i1;", "getViewConfiguration", "()Landroidx/compose/ui/platform/i1;", "viewConfiguration", "a", "()J", "size", "Lh0/m;", "b1", "extendedTouchPadding", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4634U extends i.c implements InterfaceC4633T, InterfaceC4622H, U0.d {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Object key1;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private Object key2;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private Object[] keys;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private Ba.p<? super InterfaceC4622H, ? super InterfaceC4588d<? super C4153F>, ? extends Object> _pointerInputHandler;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1867v0 pointerInputJob;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata */
    private C4649o lastPointerEvent;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private C4649o currentEvent = C4631Q.f50222a;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final Q.b<a<?>> pointerHandlers = new Q.b<>(new a[16], 0);

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private final Q.b<a<?>> dispatchingPointerHandlers = new Q.b<>(new a[16], 0);

    /* renamed from: X, reason: collision with root package name and from kotlin metadata */
    private long boundsSize = U0.r.INSTANCE.a();

    /* compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\b*\u00020\u000fH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\b*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u000f*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u000eJ\u0017\u0010\u001a\u001a\u00020\u0014*\u00020\u0015H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\f*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\f*\u00020\u000fH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ\u001d\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\u00020\"2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0016¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b-\u0010.JD\u00105\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u0010/2\u0006\u00101\u001a\u0002002\"\u00104\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010302H\u0096@¢\u0006\u0004\b5\u00106JB\u00107\u001a\u00028\u0001\"\u0004\b\u0001\u0010/2\u0006\u00101\u001a\u0002002\"\u00104\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010302H\u0096@¢\u0006\u0004\b7\u00106R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001e\u0010=\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010F\u001a\u00020A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020\u000f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020\u000f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010HR\u0014\u0010N\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u001a\u0010R\u001a\u00020O8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u001a\u0010X\u001a\u00020\u00148VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bW\u0010Q\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Y"}, d2 = {"Lu0/U$a;", "R", "Lu0/c;", "LU0/d;", "Lta/d;", "completion", "<init>", "(Lu0/U;Lta/d;)V", "LU0/h;", "", "i1", "(F)I", "LU0/v;", "i0", "(J)F", "", "G0", "(F)F", "E0", "(I)F", "Lh0/m;", "LU0/k;", "Z", "(J)J", "X0", "w1", "t1", "s", "(F)J", "x", "Lu0/o;", "event", "Lu0/q;", "pass", "Loa/F;", "r", "(Lu0/o;Lu0/q;)V", "", "cause", "q", "(Ljava/lang/Throwable;)V", "Loa/q;", "result", "resumeWith", "(Ljava/lang/Object;)V", "l0", "(Lu0/q;Lta/d;)Ljava/lang/Object;", "T", "", "timeMillis", "Lkotlin/Function2;", "", "block", "u0", "(JLBa/p;Lta/d;)Ljava/lang/Object;", "l1", "B", "Lta/d;", "LXb/l;", "D", "LXb/l;", "pointerAwaiter", "E", "Lu0/q;", "awaitPass", "Lta/g;", "F", "Lta/g;", "getContext", "()Lta/g;", "context", "getDensity", "()F", "density", "R0", "fontScale", "V", "()Lu0/o;", "currentEvent", "LU0/r;", "a", "()J", "size", "Landroidx/compose/ui/platform/i1;", "getViewConfiguration", "()Landroidx/compose/ui/platform/i1;", "viewConfiguration", "b1", "extendedTouchPadding", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u0.U$a */
    private final class a<R> implements InterfaceC4637c, U0.d, InterfaceC4588d<R> {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC4588d<R> completion;

        /* renamed from: C, reason: collision with root package name */
        private final /* synthetic */ C4634U f50235C;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private InterfaceC1847l<? super C4649o> pointerAwaiter;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private EnumC4651q awaitPass = EnumC4651q.Main;

        /* renamed from: F, reason: collision with root package name and from kotlin metadata */
        private final ta.g context = ta.h.f50000B;

        /* compiled from: SuspendingPointerInputFilter.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {782}, m = "withTimeout")
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: u0.U$a$a, reason: collision with other inner class name */
        static final class C0716a<T> extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: B, reason: collision with root package name */
            Object f50240B;

            /* renamed from: C, reason: collision with root package name */
            /* synthetic */ Object f50241C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ a<R> f50242D;

            /* renamed from: E, reason: collision with root package name */
            int f50243E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0716a(a<R> aVar, InterfaceC4588d<? super C0716a> interfaceC4588d) {
                super(interfaceC4588d);
                this.f50242D = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f50241C = obj;
                this.f50243E |= Integer.MIN_VALUE;
                return this.f50242D.l1(0L, null, this);
            }
        }

        /* compiled from: SuspendingPointerInputFilter.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", l = {774, 775}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: u0.U$a$b */
        static final class b extends kotlin.coroutines.jvm.internal.l implements Ba.p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f50244B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ long f50245C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ a<R> f50246D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(long j10, a<R> aVar, InterfaceC4588d<? super b> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f50245C = j10;
                this.f50246D = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new b(this.f50245C, this.f50246D, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = ua.C4696b.e()
                    int r1 = r8.f50244B
                    r2 = 1
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r5) goto L1c
                    if (r1 != r4) goto L14
                    oa.C4173r.b(r9)
                    goto L38
                L14:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L1c:
                    oa.C4173r.b(r9)
                    goto L2f
                L20:
                    oa.C4173r.b(r9)
                    long r6 = r8.f50245C
                    long r6 = r6 - r2
                    r8.f50244B = r5
                    java.lang.Object r9 = Xb.T.a(r6, r8)
                    if (r9 != r0) goto L2f
                    return r0
                L2f:
                    r8.f50244B = r4
                    java.lang.Object r9 = Xb.T.a(r2, r8)
                    if (r9 != r0) goto L38
                    return r0
                L38:
                    u0.U$a<R> r9 = r8.f50246D
                    Xb.l r9 = u0.C4634U.a.b(r9)
                    if (r9 == 0) goto L54
                    oa.q$a r0 = oa.C4172q.INSTANCE
                    androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r0 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                    long r1 = r8.f50245C
                    r0.<init>(r1)
                    java.lang.Object r0 = oa.C4173r.a(r0)
                    java.lang.Object r0 = oa.C4172q.a(r0)
                    r9.resumeWith(r0)
                L54:
                    oa.F r9 = oa.C4153F.f46609a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: u0.C4634U.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: SuspendingPointerInputFilter.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {753}, m = "withTimeoutOrNull")
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: u0.U$a$c */
        static final class c<T> extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: B, reason: collision with root package name */
            /* synthetic */ Object f50247B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ a<R> f50248C;

            /* renamed from: D, reason: collision with root package name */
            int f50249D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(a<R> aVar, InterfaceC4588d<? super c> interfaceC4588d) {
                super(interfaceC4588d);
                this.f50248C = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f50247B = obj;
                this.f50249D |= Integer.MIN_VALUE;
                return this.f50248C.u0(0L, null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC4588d<? super R> interfaceC4588d) {
            this.completion = interfaceC4588d;
            this.f50235C = C4634U.this;
        }

        @Override // U0.d
        public float E0(int i10) {
            return this.f50235C.E0(i10);
        }

        @Override // U0.d
        public float G0(float f10) {
            return this.f50235C.G0(f10);
        }

        @Override // U0.l
        /* renamed from: R0 */
        public float getFontScale() {
            return this.f50235C.getFontScale();
        }

        @Override // u0.InterfaceC4637c
        public C4649o V() {
            return C4634U.this.currentEvent;
        }

        @Override // U0.d
        public float X0(float f10) {
            return this.f50235C.X0(f10);
        }

        @Override // U0.d
        public long Z(long j10) {
            return this.f50235C.Z(j10);
        }

        @Override // u0.InterfaceC4637c
        public long a() {
            return C4634U.this.boundsSize;
        }

        @Override // u0.InterfaceC4637c
        public long b1() {
            return C4634U.this.b1();
        }

        @Override // ta.InterfaceC4588d
        public ta.g getContext() {
            return this.context;
        }

        @Override // U0.d
        public float getDensity() {
            return this.f50235C.getDensity();
        }

        @Override // u0.InterfaceC4637c
        public i1 getViewConfiguration() {
            return C4634U.this.getViewConfiguration();
        }

        @Override // U0.l
        public float i0(long j10) {
            return this.f50235C.i0(j10);
        }

        @Override // U0.d
        public int i1(float f10) {
            return this.f50235C.i1(f10);
        }

        @Override // u0.InterfaceC4637c
        public Object l0(EnumC4651q enumC4651q, InterfaceC4588d<? super C4649o> interfaceC4588d) {
            C1849m c1849m = new C1849m(C4696b.c(interfaceC4588d), 1);
            c1849m.x();
            this.awaitPass = enumC4651q;
            this.pointerAwaiter = c1849m;
            Object objR = c1849m.r();
            if (objR == C4696b.e()) {
                kotlin.coroutines.jvm.internal.h.c(interfaceC4588d);
            }
            return objR;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r11v0, types: [long] */
        /* JADX WARN: Type inference failed for: r11v1, types: [Xb.v0] */
        /* JADX WARN: Type inference failed for: r11v3, types: [Xb.v0] */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        @Override // u0.InterfaceC4637c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public <T> java.lang.Object l1(long r11, Ba.p<? super u0.InterfaceC4637c, ? super ta.InterfaceC4588d<? super T>, ? extends java.lang.Object> r13, ta.InterfaceC4588d<? super T> r14) {
            /*
                r10 = this;
                boolean r0 = r14 instanceof u0.C4634U.a.C0716a
                if (r0 == 0) goto L13
                r0 = r14
                u0.U$a$a r0 = (u0.C4634U.a.C0716a) r0
                int r1 = r0.f50243E
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f50243E = r1
                goto L18
            L13:
                u0.U$a$a r0 = new u0.U$a$a
                r0.<init>(r10, r14)
            L18:
                java.lang.Object r14 = r0.f50241C
                java.lang.Object r1 = ua.C4696b.e()
                int r2 = r0.f50243E
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r11 = r0.f50240B
                Xb.v0 r11 = (Xb.InterfaceC1867v0) r11
                oa.C4173r.b(r14)     // Catch: java.lang.Throwable -> L2d
                goto L75
            L2d:
                r12 = move-exception
                goto L7b
            L2f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L37:
                oa.C4173r.b(r14)
                r4 = 0
                int r14 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r14 > 0) goto L56
                Xb.l<? super u0.o> r14 = r10.pointerAwaiter
                if (r14 == 0) goto L56
                oa.q$a r2 = oa.C4172q.INSTANCE
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r2.<init>(r11)
                java.lang.Object r2 = oa.C4173r.a(r2)
                java.lang.Object r2 = oa.C4172q.a(r2)
                r14.resumeWith(r2)
            L56:
                u0.U r14 = u0.C4634U.this
                Xb.I r4 = r14.J1()
                u0.U$a$b r7 = new u0.U$a$b
                r14 = 0
                r7.<init>(r11, r10, r14)
                r8 = 3
                r9 = 0
                r5 = 0
                r6 = 0
                Xb.v0 r11 = Xb.C1837g.d(r4, r5, r6, r7, r8, r9)
                r0.f50240B = r11     // Catch: java.lang.Throwable -> L2d
                r0.f50243E = r3     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r14 = r13.invoke(r10, r0)     // Catch: java.lang.Throwable -> L2d
                if (r14 != r1) goto L75
                return r1
            L75:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r12 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.f22857B
                r11.e(r12)
                return r14
            L7b:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r13 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.f22857B
                r11.e(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: u0.C4634U.a.l1(long, Ba.p, ta.d):java.lang.Object");
        }

        public final void q(Throwable cause) {
            InterfaceC1847l<? super C4649o> interfaceC1847l = this.pointerAwaiter;
            if (interfaceC1847l != null) {
                interfaceC1847l.M(cause);
            }
            this.pointerAwaiter = null;
        }

        public final void r(C4649o event, EnumC4651q pass) {
            InterfaceC1847l<? super C4649o> interfaceC1847l;
            if (pass != this.awaitPass || (interfaceC1847l = this.pointerAwaiter) == null) {
                return;
            }
            this.pointerAwaiter = null;
            interfaceC1847l.resumeWith(C4172q.a(event));
        }

        @Override // ta.InterfaceC4588d
        public void resumeWith(Object result) {
            Q.b bVar = C4634U.this.pointerHandlers;
            C4634U c4634u = C4634U.this;
            synchronized (bVar) {
                c4634u.pointerHandlers.B(this);
                C4153F c4153f = C4153F.f46609a;
            }
            this.completion.resumeWith(result);
        }

        @Override // U0.l
        public long s(float f10) {
            return this.f50235C.s(f10);
        }

        @Override // U0.d
        public long t1(long j10) {
            return this.f50235C.t1(j10);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // u0.InterfaceC4637c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public <T> java.lang.Object u0(long r5, Ba.p<? super u0.InterfaceC4637c, ? super ta.InterfaceC4588d<? super T>, ? extends java.lang.Object> r7, ta.InterfaceC4588d<? super T> r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof u0.C4634U.a.c
                if (r0 == 0) goto L13
                r0 = r8
                u0.U$a$c r0 = (u0.C4634U.a.c) r0
                int r1 = r0.f50249D
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f50249D = r1
                goto L18
            L13:
                u0.U$a$c r0 = new u0.U$a$c
                r0.<init>(r4, r8)
            L18:
                java.lang.Object r8 = r0.f50247B
                java.lang.Object r1 = ua.C4696b.e()
                int r2 = r0.f50249D
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                oa.C4173r.b(r8)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                goto L3e
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                oa.C4173r.b(r8)
                r0.f50249D = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                java.lang.Object r8 = r4.l1(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                if (r8 != r1) goto L3e
                return r1
            L3d:
                r8 = 0
            L3e:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: u0.C4634U.a.u0(long, Ba.p, ta.d):java.lang.Object");
        }

        @Override // U0.d
        public float w1(long j10) {
            return this.f50235C.w1(j10);
        }

        @Override // U0.d
        public long x(float f10) {
            return this.f50235C.x(f10);
        }
    }

    /* compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u0.U$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50250a;

        static {
            int[] iArr = new int[EnumC4651q.values().length];
            try {
                iArr[EnumC4651q.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4651q.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4651q.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f50250a = iArr;
        }
    }

    /* compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Loa/F;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: u0.U$c */
    static final class c extends AbstractC3864v implements Ba.l<Throwable, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ a<R> f50251B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a<R> aVar) {
            super(1);
            this.f50251B = aVar;
        }

        public final void a(Throwable th) {
            this.f50251B.q(th);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Throwable th) {
            a(th);
            return C4153F.f46609a;
        }
    }

    /* compiled from: SuspendingPointerInputFilter.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", f = "SuspendingPointerInputFilter.kt", l = {616}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: u0.U$d */
    static final class d extends kotlin.coroutines.jvm.internal.l implements Ba.p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f50252B;

        d(InterfaceC4588d<? super d> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return C4634U.this.new d(interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((d) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f50252B;
            if (i10 == 0) {
                C4173r.b(obj);
                Ba.p<InterfaceC4622H, InterfaceC4588d<? super C4153F>, Object> pVarN2 = C4634U.this.n2();
                C4634U c4634u = C4634U.this;
                this.f50252B = 1;
                if (pVarN2.invoke(c4634u, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return C4153F.f46609a;
        }
    }

    public C4634U(Object obj, Object obj2, Object[] objArr, Ba.p<? super InterfaceC4622H, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar) {
        this.key1 = obj;
        this.key2 = obj2;
        this.keys = objArr;
        this._pointerInputHandler = pVar;
    }

    private final void m2(C4649o pointerEvent, EnumC4651q pass) {
        Q.b<a<?>> bVar;
        int size;
        synchronized (this.pointerHandlers) {
            Q.b<a<?>> bVar2 = this.dispatchingPointerHandlers;
            bVar2.e(bVar2.getSize(), this.pointerHandlers);
        }
        try {
            int i10 = b.f50250a[pass.ordinal()];
            if (i10 == 1 || i10 == 2) {
                Q.b<a<?>> bVar3 = this.dispatchingPointerHandlers;
                int size2 = bVar3.getSize();
                if (size2 > 0) {
                    a<?>[] aVarArrT = bVar3.t();
                    int i11 = 0;
                    do {
                        aVarArrT[i11].r(pointerEvent, pass);
                        i11++;
                    } while (i11 < size2);
                }
            } else if (i10 == 3 && (size = (bVar = this.dispatchingPointerHandlers).getSize()) > 0) {
                int i12 = size - 1;
                a<?>[] aVarArrT2 = bVar.t();
                do {
                    aVarArrT2[i12].r(pointerEvent, pass);
                    i12--;
                } while (i12 >= 0);
            }
        } finally {
            this.dispatchingPointerHandlers.l();
        }
    }

    @Override // u0.InterfaceC4633T
    public void F1() {
        InterfaceC1867v0 interfaceC1867v0 = this.pointerInputJob;
        if (interfaceC1867v0 != null) {
            interfaceC1867v0.e(new PointerInputResetException());
            this.pointerInputJob = null;
        }
    }

    @Override // A0.s0
    public void N0() {
        F1();
    }

    @Override // U0.l
    /* renamed from: R0 */
    public float getFontScale() {
        return C0832k.k(this).getDensity().getFontScale();
    }

    @Override // b0.i.c
    public void U1() {
        F1();
        super.U1();
    }

    /* renamed from: a, reason: from getter */
    public long getBoundsSize() {
        return this.boundsSize;
    }

    public long b1() {
        long jT1 = t1(getViewConfiguration().d());
        long boundsSize = getBoundsSize();
        return C3483n.a(Math.max(0.0f, C3482m.i(jT1) - U0.r.g(boundsSize)) / 2.0f, Math.max(0.0f, C3482m.g(jT1) - U0.r.f(boundsSize)) / 2.0f);
    }

    @Override // U0.d
    public float getDensity() {
        return C0832k.k(this).getDensity().getDensity();
    }

    @Override // u0.InterfaceC4622H
    public i1 getViewConfiguration() {
        return C0832k.k(this).getViewConfiguration();
    }

    public Ba.p<InterfaceC4622H, InterfaceC4588d<? super C4153F>, Object> n2() {
        return this._pointerInputHandler;
    }

    public final void o2(Object key1, Object key2, Object[] keys, Ba.p<? super InterfaceC4622H, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pointerInputHandler) {
        boolean z10 = !C3862t.b(this.key1, key1);
        this.key1 = key1;
        if (!C3862t.b(this.key2, key2)) {
            z10 = true;
        }
        this.key2 = key2;
        Object[] objArr = this.keys;
        if (objArr != null && keys == null) {
            z10 = true;
        }
        if (objArr == null && keys != null) {
            z10 = true;
        }
        boolean z11 = (objArr == null || keys == null || Arrays.equals(keys, objArr)) ? z10 : true;
        this.keys = keys;
        if (z11) {
            F1();
        }
        this._pointerInputHandler = pointerInputHandler;
    }

    @Override // u0.InterfaceC4622H
    public <R> Object r0(Ba.p<? super InterfaceC4637c, ? super InterfaceC4588d<? super R>, ? extends Object> pVar, InterfaceC4588d<? super R> interfaceC4588d) {
        C1849m c1849m = new C1849m(C4696b.c(interfaceC4588d), 1);
        c1849m.x();
        a aVar = new a(c1849m);
        synchronized (this.pointerHandlers) {
            this.pointerHandlers.c(aVar);
            InterfaceC4588d<C4153F> interfaceC4588dA = ta.f.a(pVar, aVar, aVar);
            C4172q.Companion companion = C4172q.INSTANCE;
            interfaceC4588dA.resumeWith(C4172q.a(C4153F.f46609a));
        }
        c1849m.R(new c(aVar));
        Object objR = c1849m.r();
        if (objR == C4696b.e()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC4588d);
        }
        return objR;
    }

    @Override // A0.s0
    public void t0(C4649o pointerEvent, EnumC4651q pass, long bounds) {
        this.boundsSize = bounds;
        if (pass == EnumC4651q.Initial) {
            this.currentEvent = pointerEvent;
        }
        if (this.pointerInputJob == null) {
            this.pointerInputJob = C1841i.d(J1(), null, Xb.K.f19033E, new d(null), 1, null);
        }
        m2(pointerEvent, pass);
        List<PointerInputChange> listC = pointerEvent.c();
        int size = listC.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else if (!C4650p.d(listC.get(i10))) {
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            pointerEvent = null;
        }
        this.lastPointerEvent = pointerEvent;
    }

    @Override // A0.s0
    public void v1() {
        F1();
    }

    @Override // A0.s0
    public void w0() {
        C4649o c4649o = this.lastPointerEvent;
        if (c4649o == null) {
            return;
        }
        List<PointerInputChange> listC = c4649o.c();
        int size = listC.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (listC.get(i10).getPressed()) {
                List<PointerInputChange> listC2 = c4649o.c();
                ArrayList arrayList = new ArrayList(listC2.size());
                int size2 = listC2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    PointerInputChange pointerInputChange = listC2.get(i11);
                    arrayList.add(new PointerInputChange(pointerInputChange.getId(), pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition(), false, pointerInputChange.getPressure(), pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition(), pointerInputChange.getPressed(), pointerInputChange.getPressed(), 0, 0L, 1536, (C3854k) null));
                }
                C4649o c4649o2 = new C4649o(arrayList);
                this.currentEvent = c4649o2;
                m2(c4649o2, EnumC4651q.Initial);
                m2(c4649o2, EnumC4651q.Main);
                m2(c4649o2, EnumC4651q.Final);
                this.lastPointerEvent = null;
                return;
            }
        }
    }
}
