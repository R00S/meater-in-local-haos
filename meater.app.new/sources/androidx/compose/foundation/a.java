package androidx.compose.foundation;

import A0.A0;
import A0.AbstractC0834m;
import A0.InterfaceC0831j;
import A0.s0;
import A0.v0;
import Ba.p;
import F0.v;
import F0.x;
import U0.s;
import Xb.C1841i;
import Xb.I;
import Xb.J;
import Xb.T;
import android.view.KeyEvent;
import h0.C3476g;
import h0.C3477h;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.InterfaceC5038r;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4173r;
import s0.C4416a;
import s0.C4419d;
import ta.InterfaceC4588d;
import u0.C4631Q;
import u0.C4649o;
import u0.C4652r;
import u0.EnumC4651q;
import u0.InterfaceC4622H;
import u0.InterfaceC4633T;
import ua.C4696b;
import w.C4962g;
import w.InterfaceC4949B;
import w.r;
import w.t;
import z.C5157f;
import z.C5158g;
import z.C5161j;
import z.InterfaceC5162k;
import z.m;

/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\t\b \u0018\u0000 ~2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\u007fBE\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u0019J\u0014\u0010\u001e\u001a\u00020\u0012*\u00020\u001dH¦@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\u00020\u0012*\u00020 H\u0016¢\u0006\u0004\b!\u0010\"JP\u0010#\u001a\u00020\u00122\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0004ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0012¢\u0006\u0004\b%\u0010\u0019J\r\u0010&\u001a\u00020\u0012¢\u0006\u0004\b&\u0010\u0019J\u000f\u0010'\u001a\u00020\u0012H\u0004¢\u0006\u0004\b'\u0010\u0019J(\u0010.\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0012¢\u0006\u0004\b0\u0010\u0019J\u0018\u00103\u001a\u00020\u000b2\u0006\u00102\u001a\u000201ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0018\u00105\u001a\u00020\u000b2\u0006\u00102\u001a\u000201ø\u0001\u0000¢\u0006\u0004\b5\u00104J\u0015\u00108\u001a\u00020\u00122\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u0011\u0010:\u001a\u00020\u0012*\u00020 ¢\u0006\u0004\b:\u0010\"J\u0011\u0010;\u001a\u0004\u0018\u00010\u0012H\u0004¢\u0006\u0004\b;\u0010<J\u001f\u0010@\u001a\u00020\u0012*\u00020=2\u0006\u0010?\u001a\u00020>H\u0084@ø\u0001\u0000¢\u0006\u0004\b@\u0010AR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010BR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bG\u0010HR$\u0010\f\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u000b8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010\u0017R0\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001a\u0010S\u001a\u00020\u000b8\u0006X\u0086D¢\u0006\f\n\u0004\bQ\u0010K\u001a\u0004\bR\u0010\u0017R\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010^\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010]R\u0018\u0010b\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010f\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010j\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR \u0010o\u001a\u000e\u0012\u0004\u0012\u00020l\u0012\u0004\u0012\u00020c0k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u001c\u0010r\u001a\u00020>8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010t\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010BR\u0016\u0010v\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010KR\u001a\u0010{\u001a\u00020w8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bJ\u0010zR\u0011\u0010}\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b|\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0080\u0001"}, d2 = {"Landroidx/compose/foundation/a;", "LA0/m;", "LA0/s0;", "Ls0/e;", "Lg0/c;", "LA0/v0;", "LA0/A0;", "Lz/k;", "interactionSource", "Lw/B;", "indicationNodeFactory", "", "enabled", "", "onClickLabel", "LF0/i;", "role", "Lkotlin/Function0;", "Loa/F;", "onClick", "<init>", "(Lz/k;Lw/B;ZLjava/lang/String;LF0/i;LBa/a;Lkotlin/jvm/internal/k;)V", "G2", "()Z", "E2", "()V", "x2", "z2", "A2", "Lu0/H;", "w2", "(Lu0/H;Lta/d;)Ljava/lang/Object;", "LF0/x;", "v2", "(LF0/x;)V", "H2", "(Lz/k;Lw/B;ZLjava/lang/String;LF0/i;LBa/a;)V", "T1", "U1", "y2", "Lu0/o;", "pointerEvent", "Lu0/q;", "pass", "LU0/r;", "bounds", "t0", "(Lu0/o;Lu0/q;J)V", "w0", "Ls0/b;", "event", "p0", "(Landroid/view/KeyEvent;)Z", "Q", "Lg0/o;", "focusState", "u", "(Lg0/o;)V", "m1", "F2", "()Loa/F;", "Lx/r;", "Lh0/g;", "offset", "D2", "(Lx/r;JLta/d;)Ljava/lang/Object;", "Lz/k;", "R", "Lw/B;", "S", "Ljava/lang/String;", "T", "LF0/i;", "<set-?>", "U", "Z", "B2", "V", "LBa/a;", "C2", "()LBa/a;", "W", "O1", "shouldAutoInvalidate", "Lw/r;", "X", "Lw/r;", "focusableInNonTouchMode", "Lw/t;", "Y", "Lw/t;", "focusableNode", "Lu0/T;", "Lu0/T;", "pointerInputNode", "LA0/j;", "a0", "LA0/j;", "indicationNode", "Lz/m$b;", "b0", "Lz/m$b;", "pressInteraction", "Lz/f;", "c0", "Lz/f;", "hoverInteraction", "", "Ls0/a;", "d0", "Ljava/util/Map;", "currentKeyPressInteractions", "e0", "J", "centerOffset", "f0", "userProvidedInteractionSource", "g0", "lazilyCreateIndication", "", "h0", "Ljava/lang/Object;", "()Ljava/lang/Object;", "traverseKey", "A1", "shouldMergeDescendantSemantics", "i0", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class a extends AbstractC0834m implements s0, s0.e, g0.c, v0, A0 {

    /* renamed from: i0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j0, reason: collision with root package name */
    public static final int f21864j0 = 8;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5162k interactionSource;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private InterfaceC4949B indicationNodeFactory;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private String onClickLabel;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private F0.i role;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private Ba.a<C4153F> onClick;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* renamed from: X, reason: collision with root package name and from kotlin metadata */
    private final r focusableInNonTouchMode;

    /* renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private final t focusableNode;

    /* renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private InterfaceC4633T pointerInputNode;

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private InterfaceC0831j indicationNode;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private m.b pressInteraction;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private C5157f hoverInteraction;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private final Map<C4416a, m.b> currentKeyPressInteractions;

    /* renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private long centerOffset;

    /* renamed from: f0, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5162k userProvidedInteractionSource;

    /* renamed from: g0, reason: collision with root package name and from kotlin metadata */
    private boolean lazilyCreateIndication;

    /* renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private final Object traverseKey;

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/a$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.a<Boolean> {
        b() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            a.this.C2().invoke();
            return Boolean.TRUE;
        }
    }

    /* compiled from: Clickable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$emitHoverEnter$1$1", f = "Clickable.kt", l = {1174}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f21884B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ InterfaceC5162k f21885C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ C5157f f21886D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC5162k interfaceC5162k, C5157f c5157f, InterfaceC4588d<? super c> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f21885C = interfaceC5162k;
            this.f21886D = c5157f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new c(this.f21885C, this.f21886D, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((c) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f21884B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC5162k interfaceC5162k = this.f21885C;
                C5157f c5157f = this.f21886D;
                this.f21884B = 1;
                if (interfaceC5162k.c(c5157f, this) == objE) {
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

    /* compiled from: Clickable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$emitHoverExit$1$1$1", f = "Clickable.kt", l = {1186}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f21887B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ InterfaceC5162k f21888C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ C5158g f21889D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC5162k interfaceC5162k, C5158g c5158g, InterfaceC4588d<? super d> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f21888C = interfaceC5162k;
            this.f21889D = c5158g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new d(this.f21888C, this.f21889D, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((d) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f21887B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC5162k interfaceC5162k = this.f21888C;
                C5158g c5158g = this.f21889D;
                this.f21887B = 1;
                if (interfaceC5162k.c(c5158g, this) == objE) {
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

    /* compiled from: Clickable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1", f = "Clickable.kt", l = {1139, 1141, 1148, 1149, 1158}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        boolean f21890B;

        /* renamed from: C, reason: collision with root package name */
        int f21891C;

        /* renamed from: D, reason: collision with root package name */
        private /* synthetic */ Object f21892D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ InterfaceC5038r f21893E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ long f21894F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ InterfaceC5162k f21895G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ a f21896H;

        /* compiled from: Clickable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1", f = "Clickable.kt", l = {1133, 1136}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.a$e$a, reason: collision with other inner class name */
        static final class C0305a extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            Object f21897B;

            /* renamed from: C, reason: collision with root package name */
            int f21898C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ a f21899D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ long f21900E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ InterfaceC5162k f21901F;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0305a(a aVar, long j10, InterfaceC5162k interfaceC5162k, InterfaceC4588d<? super C0305a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f21899D = aVar;
                this.f21900E = j10;
                this.f21901F = interfaceC5162k;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new C0305a(this.f21899D, this.f21900E, this.f21901F, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((C0305a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                m.b bVar;
                Object objE = C4696b.e();
                int i10 = this.f21898C;
                if (i10 == 0) {
                    C4173r.b(obj);
                    if (this.f21899D.x2()) {
                        long jA = C4962g.a();
                        this.f21898C = 1;
                        if (T.a(jA, this) == objE) {
                            return objE;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (m.b) this.f21897B;
                        C4173r.b(obj);
                        this.f21899D.pressInteraction = bVar;
                        return C4153F.f46609a;
                    }
                    C4173r.b(obj);
                }
                m.b bVar2 = new m.b(this.f21900E, null);
                InterfaceC5162k interfaceC5162k = this.f21901F;
                this.f21897B = bVar2;
                this.f21898C = 2;
                if (interfaceC5162k.c(bVar2, this) == objE) {
                    return objE;
                }
                bVar = bVar2;
                this.f21899D.pressInteraction = bVar;
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InterfaceC5038r interfaceC5038r, long j10, InterfaceC5162k interfaceC5162k, a aVar, InterfaceC4588d<? super e> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f21893E = interfaceC5038r;
            this.f21894F = j10;
            this.f21895G = interfaceC5162k;
            this.f21896H = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            e eVar = new e(this.f21893E, this.f21894F, this.f21895G, this.f21896H, interfaceC4588d);
            eVar.f21892D = obj;
            return eVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((e) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ae A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 217
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Clickable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1", f = "Clickable.kt", l = {1074}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f21902B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ m.b f21904D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(m.b bVar, InterfaceC4588d<? super f> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f21904D = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return a.this.new f(this.f21904D, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((f) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f21902B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC5162k interfaceC5162k = a.this.interactionSource;
                if (interfaceC5162k != null) {
                    m.b bVar = this.f21904D;
                    this.f21902B = 1;
                    if (interfaceC5162k.c(bVar, this) == objE) {
                        return objE;
                    }
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

    /* compiled from: Clickable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2$1", f = "Clickable.kt", l = {1085}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f21905B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ m.b f21907D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(m.b bVar, InterfaceC4588d<? super g> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f21907D = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return a.this.new g(this.f21907D, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((g) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f21905B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC5162k interfaceC5162k = a.this.interactionSource;
                if (interfaceC5162k != null) {
                    m.c cVar = new m.c(this.f21907D);
                    this.f21905B = 1;
                    if (interfaceC5162k.c(cVar, this) == objE) {
                        return objE;
                    }
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

    /* compiled from: Clickable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$1", f = "Clickable.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f21908B;

        h(InterfaceC4588d<? super h> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return a.this.new h(interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((h) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f21908B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            a.this.z2();
            return C4153F.f46609a;
        }
    }

    /* compiled from: Clickable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$2", f = "Clickable.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f21910B;

        i(InterfaceC4588d<? super i> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return a.this.new i(interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((i) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f21910B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            a.this.A2();
            return C4153F.f46609a;
        }
    }

    /* compiled from: Clickable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$3", f = "Clickable.kt", l = {1042}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/H;", "Loa/F;", "<anonymous>", "(Lu0/H;)V"}, k = 3, mv = {1, 8, 0})
    static final class j extends kotlin.coroutines.jvm.internal.l implements p<InterfaceC4622H, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f21912B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f21913C;

        j(InterfaceC4588d<? super j> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4622H interfaceC4622H, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((j) create(interfaceC4622H, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            j jVar = a.this.new j(interfaceC4588d);
            jVar.f21913C = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f21912B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC4622H interfaceC4622H = (InterfaceC4622H) this.f21913C;
                a aVar = a.this;
                this.f21912B = 1;
                if (aVar.w2(interfaceC4622H, this) == objE) {
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

    public /* synthetic */ a(InterfaceC5162k interfaceC5162k, InterfaceC4949B interfaceC4949B, boolean z10, String str, F0.i iVar, Ba.a aVar, C3854k c3854k) {
        this(interfaceC5162k, interfaceC4949B, z10, str, iVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A2() {
        C5157f c5157f = this.hoverInteraction;
        if (c5157f != null) {
            C5158g c5158g = new C5158g(c5157f);
            InterfaceC5162k interfaceC5162k = this.interactionSource;
            if (interfaceC5162k != null) {
                C1841i.d(J1(), null, null, new d(interfaceC5162k, c5158g, null), 3, null);
            }
            this.hoverInteraction = null;
        }
    }

    private final void E2() {
        InterfaceC4949B interfaceC4949B;
        if (this.indicationNode == null && (interfaceC4949B = this.indicationNodeFactory) != null) {
            if (this.interactionSource == null) {
                this.interactionSource = C5161j.a();
            }
            this.focusableNode.p2(this.interactionSource);
            InterfaceC5162k interfaceC5162k = this.interactionSource;
            C3862t.d(interfaceC5162k);
            InterfaceC0831j interfaceC0831jA = interfaceC4949B.a(interfaceC5162k);
            j2(interfaceC0831jA);
            this.indicationNode = interfaceC0831jA;
        }
    }

    private final boolean G2() {
        return this.userProvidedInteractionSource == null && this.indicationNodeFactory != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean x2() {
        return androidx.compose.foundation.d.g(this) || C4962g.c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z2() {
        if (this.hoverInteraction == null) {
            C5157f c5157f = new C5157f();
            InterfaceC5162k interfaceC5162k = this.interactionSource;
            if (interfaceC5162k != null) {
                C1841i.d(J1(), null, null, new c(interfaceC5162k, c5157f, null), 3, null);
            }
            this.hoverInteraction = c5157f;
        }
    }

    @Override // A0.v0
    /* renamed from: A1 */
    public final boolean getMergeDescendants() {
        return true;
    }

    /* renamed from: B2, reason: from getter */
    protected final boolean getEnabled() {
        return this.enabled;
    }

    protected final Ba.a<C4153F> C2() {
        return this.onClick;
    }

    protected final Object D2(InterfaceC5038r interfaceC5038r, long j10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objD;
        InterfaceC5162k interfaceC5162k = this.interactionSource;
        return (interfaceC5162k == null || (objD = J.d(new e(interfaceC5038r, j10, interfaceC5162k, this, null), interfaceC4588d)) != C4696b.e()) ? C4153F.f46609a : objD;
    }

    protected final C4153F F2() {
        InterfaceC4633T interfaceC4633T = this.pointerInputNode;
        if (interfaceC4633T == null) {
            return null;
        }
        interfaceC4633T.F1();
        return C4153F.f46609a;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void H2(z.InterfaceC5162k r3, w.InterfaceC4949B r4, boolean r5, java.lang.String r6, F0.i r7, Ba.a<oa.C4153F> r8) {
        /*
            r2 = this;
            z.k r0 = r2.userProvidedInteractionSource
            boolean r0 = kotlin.jvm.internal.C3862t.b(r0, r3)
            r1 = 1
            if (r0 != 0) goto L12
            r2.y2()
            r2.userProvidedInteractionSource = r3
            r2.interactionSource = r3
            r3 = r1
            goto L13
        L12:
            r3 = 0
        L13:
            w.B r0 = r2.indicationNodeFactory
            boolean r0 = kotlin.jvm.internal.C3862t.b(r0, r4)
            if (r0 != 0) goto L1e
            r2.indicationNodeFactory = r4
            r3 = r1
        L1e:
            boolean r4 = r2.enabled
            if (r4 == r5) goto L41
            if (r5 == 0) goto L2f
            w.r r4 = r2.focusableInNonTouchMode
            r2.j2(r4)
            w.t r4 = r2.focusableNode
            r2.j2(r4)
            goto L3c
        L2f:
            w.r r4 = r2.focusableInNonTouchMode
            r2.m2(r4)
            w.t r4 = r2.focusableNode
            r2.m2(r4)
            r2.y2()
        L3c:
            A0.w0.b(r2)
            r2.enabled = r5
        L41:
            java.lang.String r4 = r2.onClickLabel
            boolean r4 = kotlin.jvm.internal.C3862t.b(r4, r6)
            if (r4 != 0) goto L4e
            r2.onClickLabel = r6
            A0.w0.b(r2)
        L4e:
            F0.i r4 = r2.role
            boolean r4 = kotlin.jvm.internal.C3862t.b(r4, r7)
            if (r4 != 0) goto L5b
            r2.role = r7
            A0.w0.b(r2)
        L5b:
            r2.onClick = r8
            boolean r4 = r2.lazilyCreateIndication
            boolean r5 = r2.G2()
            if (r4 == r5) goto L72
            boolean r4 = r2.G2()
            r2.lazilyCreateIndication = r4
            if (r4 != 0) goto L72
            A0.j r4 = r2.indicationNode
            if (r4 != 0) goto L72
            goto L73
        L72:
            r1 = r3
        L73:
            if (r1 == 0) goto L88
            A0.j r3 = r2.indicationNode
            if (r3 != 0) goto L7d
            boolean r4 = r2.lazilyCreateIndication
            if (r4 != 0) goto L88
        L7d:
            if (r3 == 0) goto L82
            r2.m2(r3)
        L82:
            r3 = 0
            r2.indicationNode = r3
            r2.E2()
        L88:
            w.t r3 = r2.focusableNode
            z.k r4 = r2.interactionSource
            r3.p2(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.a.H2(z.k, w.B, boolean, java.lang.String, F0.i, Ba.a):void");
    }

    @Override // b0.i.c
    /* renamed from: O1, reason: from getter */
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // s0.e
    public final boolean Q(KeyEvent event) {
        return false;
    }

    @Override // b0.i.c
    public final void T1() {
        if (!this.lazilyCreateIndication) {
            E2();
        }
        if (this.enabled) {
            j2(this.focusableInNonTouchMode);
            j2(this.focusableNode);
        }
    }

    @Override // A0.A0
    /* renamed from: U, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    @Override // b0.i.c
    public final void U1() {
        y2();
        if (this.userProvidedInteractionSource == null) {
            this.interactionSource = null;
        }
        InterfaceC0831j interfaceC0831j = this.indicationNode;
        if (interfaceC0831j != null) {
            m2(interfaceC0831j);
        }
        this.indicationNode = null;
    }

    @Override // A0.v0
    public final void m1(x xVar) {
        F0.i iVar = this.role;
        if (iVar != null) {
            C3862t.d(iVar);
            v.H(xVar, iVar.getValue());
        }
        v.o(xVar, this.onClickLabel, new b());
        if (this.enabled) {
            this.focusableNode.m1(xVar);
        } else {
            v.f(xVar);
        }
        v2(xVar);
    }

    @Override // s0.e
    public final boolean p0(KeyEvent event) {
        E2();
        if (this.enabled && C4962g.f(event)) {
            if (this.currentKeyPressInteractions.containsKey(C4416a.m(C4419d.a(event)))) {
                return false;
            }
            m.b bVar = new m.b(this.centerOffset, null);
            this.currentKeyPressInteractions.put(C4416a.m(C4419d.a(event)), bVar);
            if (this.interactionSource != null) {
                C1841i.d(J1(), null, null, new f(bVar, null), 3, null);
            }
        } else {
            if (!this.enabled || !C4962g.b(event)) {
                return false;
            }
            m.b bVarRemove = this.currentKeyPressInteractions.remove(C4416a.m(C4419d.a(event)));
            if (bVarRemove != null && this.interactionSource != null) {
                C1841i.d(J1(), null, null, new g(bVarRemove, null), 3, null);
            }
            this.onClick.invoke();
        }
        return true;
    }

    @Override // A0.s0
    public final void t0(C4649o pointerEvent, EnumC4651q pass, long bounds) {
        long jB = s.b(bounds);
        this.centerOffset = C3477h.a(U0.n.h(jB), U0.n.i(jB));
        E2();
        if (this.enabled && pass == EnumC4651q.Main) {
            int type = pointerEvent.getType();
            C4652r.Companion companion = C4652r.INSTANCE;
            if (C4652r.i(type, companion.a())) {
                C1841i.d(J1(), null, null, new h(null), 3, null);
            } else if (C4652r.i(type, companion.b())) {
                C1841i.d(J1(), null, null, new i(null), 3, null);
            }
        }
        if (this.pointerInputNode == null) {
            this.pointerInputNode = (InterfaceC4633T) j2(C4631Q.a(new j(null)));
        }
        InterfaceC4633T interfaceC4633T = this.pointerInputNode;
        if (interfaceC4633T != null) {
            interfaceC4633T.t0(pointerEvent, pass, bounds);
        }
    }

    @Override // g0.c
    public final void u(g0.o focusState) {
        if (focusState.j()) {
            E2();
        }
        if (this.enabled) {
            this.focusableNode.u(focusState);
        }
    }

    @Override // A0.s0
    public final void w0() {
        C5157f c5157f;
        InterfaceC5162k interfaceC5162k = this.interactionSource;
        if (interfaceC5162k != null && (c5157f = this.hoverInteraction) != null) {
            interfaceC5162k.a(new C5158g(c5157f));
        }
        this.hoverInteraction = null;
        InterfaceC4633T interfaceC4633T = this.pointerInputNode;
        if (interfaceC4633T != null) {
            interfaceC4633T.w0();
        }
    }

    public abstract Object w2(InterfaceC4622H interfaceC4622H, InterfaceC4588d<? super C4153F> interfaceC4588d);

    protected final void y2() {
        InterfaceC5162k interfaceC5162k = this.interactionSource;
        if (interfaceC5162k != null) {
            m.b bVar = this.pressInteraction;
            if (bVar != null) {
                interfaceC5162k.a(new m.a(bVar));
            }
            C5157f c5157f = this.hoverInteraction;
            if (c5157f != null) {
                interfaceC5162k.a(new C5158g(c5157f));
            }
            Iterator<T> it = this.currentKeyPressInteractions.values().iterator();
            while (it.hasNext()) {
                interfaceC5162k.a(new m.a((m.b) it.next()));
            }
        }
        this.pressInteraction = null;
        this.hoverInteraction = null;
        this.currentKeyPressInteractions.clear();
    }

    private a(InterfaceC5162k interfaceC5162k, InterfaceC4949B interfaceC4949B, boolean z10, String str, F0.i iVar, Ba.a<C4153F> aVar) {
        this.interactionSource = interfaceC5162k;
        this.indicationNodeFactory = interfaceC4949B;
        this.onClickLabel = str;
        this.role = iVar;
        this.enabled = z10;
        this.onClick = aVar;
        this.focusableInNonTouchMode = new r();
        this.focusableNode = new t(this.interactionSource);
        this.currentKeyPressInteractions = new LinkedHashMap();
        this.centerOffset = C3476g.INSTANCE.c();
        this.userProvidedInteractionSource = this.interactionSource;
        this.lazilyCreateIndication = G2();
        this.traverseKey = INSTANCE;
    }

    public void v2(x xVar) {
    }
}
