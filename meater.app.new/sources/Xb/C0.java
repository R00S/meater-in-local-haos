package Xb;

import Xb.InterfaceC1861s0;
import Xb.InterfaceC1867v0;
import cc.AbstractC2394y;
import cc.C2385p;
import cc.C2386q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import oa.C4153F;
import oa.C4158c;
import oa.InterfaceC4156a;
import ta.InterfaceC4588d;
import ta.g;
import ua.C4696b;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0006 \u0001²\u0001³\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\u0014*\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b$\u0010!J\u0019\u0010&\u001a\u00020%2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0004H\u0002¢\u0006\u0004\b,\u0010-J'\u00100\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020+H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00142\u0006\u0010\t\u001a\u000202H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020+H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0004H\u0002¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b9\u0010:J\u001b\u0010;\u001a\u0004\u0018\u00010\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b;\u0010<J\u0019\u0010=\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b=\u0010>J\u001b\u0010?\u001a\u0004\u0018\u00010\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b?\u0010<J\u0019\u0010@\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\t\u001a\u00020\u0017H\u0002¢\u0006\u0004\b@\u0010AJ\u001f\u0010B\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\bB\u0010CJ%\u0010D\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bD\u0010EJ#\u0010F\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bF\u0010GJ\u0019\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010\t\u001a\u00020\u0017H\u0002¢\u0006\u0004\bI\u0010JJ*\u0010L\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010K\u001a\u00020H2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0082\u0010¢\u0006\u0004\bL\u0010MJ)\u0010O\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010N\u001a\u00020H2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bO\u0010PJ\u0015\u0010R\u001a\u0004\u0018\u00010H*\u00020QH\u0002¢\u0006\u0004\bR\u0010SJ\u0019\u0010U\u001a\u00020T2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bU\u0010VJ\u0012\u0010W\u001a\u0004\u0018\u00010\nH\u0082@¢\u0006\u0004\bW\u0010:J\u0019\u0010Y\u001a\u00020\u00142\b\u0010X\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\bY\u0010ZJ\r\u0010[\u001a\u00020\u0004¢\u0006\u0004\b[\u00108J\u000f\u0010\\\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\\\u0010]J\u0011\u0010`\u001a\u00060^j\u0002`_¢\u0006\u0004\b`\u0010aJ#\u0010c\u001a\u00060^j\u0002`_*\u00020\u000f2\n\b\u0002\u0010b\u001a\u0004\u0018\u00010TH\u0004¢\u0006\u0004\bc\u0010dJ'\u0010h\u001a\u00020g2\u0018\u0010)\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00140ej\u0002`f¢\u0006\u0004\bh\u0010iJ7\u0010k\u001a\u00020g2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010j\u001a\u00020\u00042\u0018\u0010)\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00140ej\u0002`f¢\u0006\u0004\bk\u0010lJ'\u0010m\u001a\u00020g2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010j\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\bm\u0010nJ\u0010\u0010o\u001a\u00020\u0014H\u0086@¢\u0006\u0004\bo\u0010:J\u0017\u0010p\u001a\u00020\u00142\u0006\u0010/\u001a\u00020+H\u0000¢\u0006\u0004\bp\u00106J\u001f\u0010q\u001a\u00020\u00142\u000e\u0010\u001f\u001a\n\u0018\u00010^j\u0004\u0018\u0001`_H\u0016¢\u0006\u0004\bq\u0010rJ\u000f\u0010s\u001a\u00020TH\u0014¢\u0006\u0004\bs\u0010tJ\u0017\u0010u\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\bu\u0010vJ\u0015\u0010x\u001a\u00020\u00142\u0006\u0010w\u001a\u00020\u0003¢\u0006\u0004\bx\u0010yJ\u0017\u0010z\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\bz\u0010#J\u0017\u0010{\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b{\u0010#J\u0019\u0010|\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b|\u0010}J\u0013\u0010~\u001a\u00060^j\u0002`_H\u0016¢\u0006\u0004\b~\u0010aJ\u0019\u0010\u007f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b\u007f\u0010}J\u001d\u0010\u0080\u0001\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0005\b\u0080\u0001\u0010<J\u0019\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0006\u0010K\u001a\u00020\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001a\u0010\u0085\u0001\u001a\u00020\u00142\u0007\u0010\u0084\u0001\u001a\u00020\u000fH\u0010¢\u0006\u0005\b\u0085\u0001\u0010vJ\u001b\u0010\u0086\u0001\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0005\b\u0086\u0001\u0010vJ\u001a\u0010\u0087\u0001\u001a\u00020\u00042\u0007\u0010\u0084\u0001\u001a\u00020\u000fH\u0014¢\u0006\u0005\b\u0087\u0001\u0010#J\u001c\u0010\u0088\u0001\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001c\u0010\u008a\u0001\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0006\b\u008a\u0001\u0010\u0089\u0001J\u0011\u0010\u008b\u0001\u001a\u00020TH\u0016¢\u0006\u0005\b\u008b\u0001\u0010tJ\u0011\u0010\u008c\u0001\u001a\u00020TH\u0007¢\u0006\u0005\b\u008c\u0001\u0010tJ\u0011\u0010\u008d\u0001\u001a\u00020TH\u0010¢\u0006\u0005\b\u008d\u0001\u0010tJ\u0014\u0010\u008e\u0001\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0014\u0010\u0090\u0001\u001a\u0004\u0018\u00010\nH\u0084@¢\u0006\u0005\b\u0090\u0001\u0010:R\u001e\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010>R\u0019\u0010\u0096\u0001\u001a\u0007\u0012\u0002\b\u00030\u0093\u00018F¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R0\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u0081\u00012\n\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0081\u00018@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0018\u0010X\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010\u008f\u0001R\u0016\u0010¡\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b \u0001\u00108R\u0013\u0010£\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b¢\u0001\u00108R\u0013\u0010¤\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b¤\u0001\u00108R\u0016\u0010¦\u0001\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b¥\u0001\u00108R\u001b\u0010ª\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010§\u00018F¢\u0006\b\u001a\u0006\b¨\u0001\u0010©\u0001R\u0016\u0010¬\u0001\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b«\u0001\u00108R\u0016\u0010®\u0001\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b\u00ad\u0001\u00108R\u0016\u0010°\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u0081\u00010¯\u00018\u0002X\u0082\u0004R\u0015\u0010±\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\n0¯\u00018\u0002X\u0082\u0004¨\u0006´\u0001"}, d2 = {"LXb/C0;", "LXb/v0;", "LXb/t;", "LXb/L0;", "", "active", "<init>", "(Z)V", "LXb/C0$c;", "state", "", "proposedUpdate", "h0", "(LXb/C0$c;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "exceptions", "l0", "(LXb/C0$c;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", "Loa/F;", "G", "(Ljava/lang/Throwable;Ljava/util/List;)V", "LXb/q0;", "update", "W0", "(LXb/q0;Ljava/lang/Object;)Z", "d0", "(LXb/q0;Ljava/lang/Object;)V", "LXb/H0;", "list", "cause", "I0", "(LXb/H0;Ljava/lang/Throwable;)V", "Z", "(Ljava/lang/Throwable;)Z", "J0", "", "R0", "(Ljava/lang/Object;)I", "LXb/s0;", "handler", "onCancelling", "LXb/B0;", "F0", "(LXb/s0;Z)LXb/B0;", "expect", "node", "E", "(Ljava/lang/Object;LXb/H0;LXb/B0;)Z", "LXb/e0;", "N0", "(LXb/e0;)V", "O0", "(LXb/B0;)V", "A0", "()Z", "B0", "(Lta/d;)Ljava/lang/Object;", "Y", "(Ljava/lang/Object;)Ljava/lang/Object;", "g0", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "C0", "p0", "(LXb/q0;)LXb/H0;", "X0", "(LXb/q0;Ljava/lang/Throwable;)Z", "Y0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Z0", "(LXb/q0;Ljava/lang/Object;)Ljava/lang/Object;", "LXb/s;", "i0", "(LXb/q0;)LXb/s;", "child", "a1", "(LXb/C0$c;LXb/s;Ljava/lang/Object;)Z", "lastChild", "e0", "(LXb/C0$c;LXb/s;Ljava/lang/Object;)V", "Lcc/q;", "H0", "(Lcc/q;)LXb/s;", "", "S0", "(Ljava/lang/Object;)Ljava/lang/String;", "O", "parent", "w0", "(LXb/v0;)V", "start", "M0", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "u", "()Ljava/util/concurrent/CancellationException;", "message", "T0", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "LXb/b0;", "q", "(LBa/l;)LXb/b0;", "invokeImmediately", "o0", "(ZZLBa/l;)LXb/b0;", "x0", "(ZZLXb/s0;)LXb/b0;", "o", "P0", "e", "(Ljava/util/concurrent/CancellationException;)V", "b0", "()Ljava/lang/String;", "W", "(Ljava/lang/Throwable;)V", "parentJob", "x", "(LXb/L0;)V", "c0", "U", "V", "(Ljava/lang/Object;)Z", "f0", "D0", "E0", "LXb/r;", "a0", "(LXb/t;)LXb/r;", "exception", "v0", "K0", "u0", "L0", "(Ljava/lang/Object;)V", "H", "toString", "V0", "G0", "j0", "()Ljava/lang/Object;", "I", "k0", "exceptionOrNull", "Lta/g$c;", "getKey", "()Lta/g$c;", "key", "value", "q0", "()LXb/r;", "Q0", "(LXb/r;)V", "parentHandle", "getParent", "()LXb/v0;", "r0", "a", "isActive", "y0", "isCompleted", "isCancelled", "n0", "onCancelComplete", "LTb/h;", "p", "()LTb/h;", "children", "z0", "isScopedCoroutine", "m0", "handlesException", "Lkotlinx/atomicfu/AtomicRef;", "_parentHandle", "_state", "b", "c", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC4156a
/* loaded from: classes3.dex */
public class C0 implements InterfaceC1867v0, InterfaceC1862t, L0 {

    /* renamed from: B, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f18991B = AtomicReferenceFieldUpdater.newUpdater(C0.class, Object.class, "_state$volatile");

    /* renamed from: C, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f18992C = AtomicReferenceFieldUpdater.newUpdater(C0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* compiled from: JobSupport.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LXb/C0$a;", "T", "LXb/m;", "Lta/d;", "delegate", "LXb/C0;", "job", "<init>", "(Lta/d;LXb/C0;)V", "LXb/v0;", "parent", "", "p", "(LXb/v0;)Ljava/lang/Throwable;", "", "E", "()Ljava/lang/String;", "J", "LXb/C0;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a<T> extends C1849m<T> {

        /* renamed from: J, reason: collision with root package name and from kotlin metadata */
        private final C0 job;

        public a(InterfaceC4588d<? super T> interfaceC4588d, C0 c02) {
            super(interfaceC4588d, 1);
            this.job = c02;
        }

        @Override // Xb.C1849m
        protected String E() {
            return "AwaitContinuation";
        }

        @Override // Xb.C1849m
        public Throwable p(InterfaceC1867v0 parent) {
            Throwable thF;
            Object objR0 = this.job.r0();
            return (!(objR0 instanceof c) || (thF = ((c) objR0).f()) == null) ? objR0 instanceof C1874z ? ((C1874z) objR0).cause : parent.u() : thF;
        }
    }

    /* compiled from: JobSupport.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LXb/C0$b;", "LXb/B0;", "LXb/C0;", "parent", "LXb/C0$c;", "state", "LXb/s;", "child", "", "proposedUpdate", "<init>", "(LXb/C0;LXb/C0$c;LXb/s;Ljava/lang/Object;)V", "", "cause", "Loa/F;", "b", "(Ljava/lang/Throwable;)V", "F", "LXb/C0;", "G", "LXb/C0$c;", "H", "LXb/s;", "I", "Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class b extends B0 {

        /* renamed from: F, reason: collision with root package name and from kotlin metadata */
        private final C0 parent;

        /* renamed from: G, reason: collision with root package name and from kotlin metadata */
        private final c state;

        /* renamed from: H, reason: collision with root package name and from kotlin metadata */
        private final C1860s child;

        /* renamed from: I, reason: collision with root package name and from kotlin metadata */
        private final Object proposedUpdate;

        public b(C0 c02, c cVar, C1860s c1860s, Object obj) {
            this.parent = c02;
            this.state = cVar;
            this.child = c1860s;
            this.proposedUpdate = obj;
        }

        @Override // Xb.InterfaceC1861s0
        public void b(Throwable cause) {
            this.parent.e0(this.state, this.child, this.proposedUpdate);
        }
    }

    /* compiled from: JobSupport.kt */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\b0\fj\b\u0012\u0004\u0012\u00020\b`\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR(\u0010$\u001a\u0004\u0018\u00010\u00012\b\u0010\u001f\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u0017R\u0011\u0010-\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b,\u0010&R\u0011\u0010/\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b.\u0010&R\u0014\u00101\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010&R\u0013\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001028\u0002X\u0082\u0004R\u000b\u00105\u001a\u0002048\u0002X\u0082\u0004R\u0013\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b028\u0002X\u0082\u0004¨\u00067"}, d2 = {"LXb/C0$c;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "LXb/q0;", "LXb/H0;", "list", "", "isCompleting", "", "rootCause", "<init>", "(LXb/H0;ZLjava/lang/Throwable;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "()Ljava/util/ArrayList;", "proposedException", "", "m", "(Ljava/lang/Throwable;)Ljava/util/List;", "exception", "Loa/F;", "b", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "B", "LXb/H0;", "d", "()LXb/H0;", "value", "e", "()Ljava/lang/Object;", "o", "(Ljava/lang/Object;)V", "exceptionsHolder", "k", "()Z", "n", "(Z)V", "f", "()Ljava/lang/Throwable;", "p", "l", "isSealed", "j", "isCancelling", "a", "isActive", "Lkotlinx/atomicfu/AtomicRef;", "_exceptionsHolder", "Lkotlinx/atomicfu/AtomicBoolean;", "_isCompleting", "_rootCause", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class c implements InterfaceC1858q0 {

        /* renamed from: C, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f18998C = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* renamed from: D, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f18999D = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* renamed from: E, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f19000E = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final H0 list;
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        public c(H0 h02, boolean z10, Throwable th) {
            this.list = h02;
            this._isCompleting$volatile = z10 ? 1 : 0;
            this._rootCause$volatile = th;
        }

        private final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        private final Object e() {
            return f19000E.get(this);
        }

        private final void o(Object obj) {
            f19000E.set(this, obj);
        }

        @Override // Xb.InterfaceC1858q0
        /* renamed from: a */
        public boolean getIsActive() {
            return f() == null;
        }

        public final void b(Throwable exception) {
            Throwable thF = f();
            if (thF == null) {
                p(exception);
                return;
            }
            if (exception == thF) {
                return;
            }
            Object objE = e();
            if (objE == null) {
                o(exception);
                return;
            }
            if (objE instanceof Throwable) {
                if (exception == objE) {
                    return;
                }
                ArrayList<Throwable> arrayListC = c();
                arrayListC.add(objE);
                arrayListC.add(exception);
                o(arrayListC);
                return;
            }
            if (objE instanceof ArrayList) {
                ((ArrayList) objE).add(exception);
                return;
            }
            throw new IllegalStateException(("State is " + objE).toString());
        }

        @Override // Xb.InterfaceC1858q0
        /* renamed from: d, reason: from getter */
        public H0 getList() {
            return this.list;
        }

        public final Throwable f() {
            return (Throwable) f18999D.get(this);
        }

        public final boolean j() {
            return f() != null;
        }

        public final boolean k() {
            return f18998C.get(this) != 0;
        }

        public final boolean l() {
            return e() == D0.f19017e;
        }

        public final List<Throwable> m(Throwable proposedException) {
            ArrayList<Throwable> arrayListC;
            Object objE = e();
            if (objE == null) {
                arrayListC = c();
            } else if (objE instanceof Throwable) {
                ArrayList<Throwable> arrayListC2 = c();
                arrayListC2.add(objE);
                arrayListC = arrayListC2;
            } else {
                if (!(objE instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objE).toString());
                }
                arrayListC = (ArrayList) objE;
            }
            Throwable thF = f();
            if (thF != null) {
                arrayListC.add(0, thF);
            }
            if (proposedException != null && !C3862t.b(proposedException, thF)) {
                arrayListC.add(proposedException);
            }
            o(D0.f19017e);
            return arrayListC;
        }

        public final void n(boolean z10) {
            f18998C.set(this, z10 ? 1 : 0);
        }

        public final void p(Throwable th) {
            f18999D.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + j() + ", completing=" + k() + ", rootCause=" + f() + ", exceptions=" + e() + ", list=" + getList() + ']';
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Xb/C0$d", "Lcc/q$a;", "Lcc/q;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "g", "(Lcc/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends C2386q.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C0 f19002d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f19003e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C2386q c2386q, C0 c02, Object obj) {
            super(c2386q);
            this.f19002d = c02;
            this.f19003e = obj;
        }

        @Override // cc.AbstractC2371b
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Object e(C2386q affected) {
            if (this.f19002d.r0() == this.f19003e) {
                return null;
            }
            return C2385p.a();
        }
    }

    /* compiled from: JobSupport.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {963, 965}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTb/j;", "LXb/v0;", "Loa/F;", "<anonymous>", "(LTb/j;)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends kotlin.coroutines.jvm.internal.k implements Ba.p<Tb.j<? super InterfaceC1867v0>, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: C, reason: collision with root package name */
        Object f19004C;

        /* renamed from: D, reason: collision with root package name */
        Object f19005D;

        /* renamed from: E, reason: collision with root package name */
        int f19006E;

        /* renamed from: F, reason: collision with root package name */
        private /* synthetic */ Object f19007F;

        e(InterfaceC4588d<? super e> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Tb.j<? super InterfaceC1867v0> jVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((e) create(jVar, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            e eVar = C0.this.new e(interfaceC4588d);
            eVar.f19007F = obj;
            return eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006b -> B:27:0x0081). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007e -> B:27:0x0081). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = ua.C4696b.e()
                int r1 = r6.f19006E
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r6.f19005D
                cc.q r1 = (cc.C2386q) r1
                java.lang.Object r3 = r6.f19004C
                cc.o r3 = (cc.C2384o) r3
                java.lang.Object r4 = r6.f19007F
                Tb.j r4 = (Tb.j) r4
                oa.C4173r.b(r7)
                goto L81
            L1e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L26:
                oa.C4173r.b(r7)
                goto L86
            L2a:
                oa.C4173r.b(r7)
                java.lang.Object r7 = r6.f19007F
                Tb.j r7 = (Tb.j) r7
                Xb.C0 r1 = Xb.C0.this
                java.lang.Object r1 = r1.r0()
                boolean r4 = r1 instanceof Xb.C1860s
                if (r4 == 0) goto L48
                Xb.s r1 = (Xb.C1860s) r1
                Xb.t r1 = r1.childJob
                r6.f19006E = r3
                java.lang.Object r7 = r7.b(r1, r6)
                if (r7 != r0) goto L86
                return r0
            L48:
                boolean r3 = r1 instanceof Xb.InterfaceC1858q0
                if (r3 == 0) goto L86
                Xb.q0 r1 = (Xb.InterfaceC1858q0) r1
                Xb.H0 r1 = r1.getList()
                if (r1 == 0) goto L86
                java.lang.Object r3 = r1.l()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
                kotlin.jvm.internal.C3862t.e(r3, r4)
                cc.q r3 = (cc.C2386q) r3
                r4 = r7
                r5 = r3
                r3 = r1
                r1 = r5
            L63:
                boolean r7 = kotlin.jvm.internal.C3862t.b(r1, r3)
                if (r7 != 0) goto L86
                boolean r7 = r1 instanceof Xb.C1860s
                if (r7 == 0) goto L81
                r7 = r1
                Xb.s r7 = (Xb.C1860s) r7
                Xb.t r7 = r7.childJob
                r6.f19007F = r4
                r6.f19004C = r3
                r6.f19005D = r1
                r6.f19006E = r2
                java.lang.Object r7 = r4.b(r7, r6)
                if (r7 != r0) goto L81
                return r0
            L81:
                cc.q r1 = r1.m()
                goto L63
            L86:
                oa.F r7 = oa.C4153F.f46609a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: Xb.C0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C0(boolean z10) {
        this._state$volatile = z10 ? D0.f19019g : D0.f19018f;
    }

    private final boolean A0() {
        Object objR0;
        do {
            objR0 = r0();
            if (!(objR0 instanceof InterfaceC1858q0)) {
                return false;
            }
        } while (R0(objR0) < 0);
        return true;
    }

    private final Object B0(InterfaceC4588d<? super C4153F> interfaceC4588d) {
        C1849m c1849m = new C1849m(C4696b.c(interfaceC4588d), 1);
        c1849m.x();
        C1853o.a(c1849m, A0.o(this, false, false, new N0(c1849m), 3, null));
        Object objR = c1849m.r();
        if (objR == C4696b.e()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC4588d);
        }
        return objR == C4696b.e() ? objR : C4153F.f46609a;
    }

    private final Object C0(Object cause) throws Throwable {
        Throwable thG0 = null;
        while (true) {
            Object objR0 = r0();
            if (objR0 instanceof c) {
                synchronized (objR0) {
                    if (((c) objR0).l()) {
                        return D0.f19016d;
                    }
                    boolean zJ = ((c) objR0).j();
                    if (cause != null || !zJ) {
                        if (thG0 == null) {
                            thG0 = g0(cause);
                        }
                        ((c) objR0).b(thG0);
                    }
                    Throwable thF = zJ ? null : ((c) objR0).f();
                    if (thF != null) {
                        I0(((c) objR0).getList(), thF);
                    }
                    return D0.f19013a;
                }
            }
            if (!(objR0 instanceof InterfaceC1858q0)) {
                return D0.f19016d;
            }
            if (thG0 == null) {
                thG0 = g0(cause);
            }
            InterfaceC1858q0 interfaceC1858q0 = (InterfaceC1858q0) objR0;
            if (!interfaceC1858q0.getIsActive()) {
                Object objY0 = Y0(objR0, new C1874z(thG0, false, 2, null));
                if (objY0 == D0.f19013a) {
                    throw new IllegalStateException(("Cannot happen in " + objR0).toString());
                }
                if (objY0 != D0.f19015c) {
                    return objY0;
                }
            } else if (X0(interfaceC1858q0, thG0)) {
                return D0.f19013a;
            }
        }
    }

    private final boolean E(Object expect, H0 list, B0 node) {
        int iV;
        d dVar = new d(node, this, expect);
        do {
            iV = list.n().v(node, list, dVar);
            if (iV == 1) {
                return true;
            }
        } while (iV != 2);
        return false;
    }

    private final B0 F0(InterfaceC1861s0 handler, boolean onCancelling) {
        B0 c1865u0;
        if (onCancelling) {
            c1865u0 = handler instanceof AbstractC1869w0 ? (AbstractC1869w0) handler : null;
            if (c1865u0 == null) {
                c1865u0 = new C1863t0(handler);
            }
        } else {
            c1865u0 = handler instanceof B0 ? (B0) handler : null;
            if (c1865u0 == null) {
                c1865u0 = new C1865u0(handler);
            }
        }
        c1865u0.x(this);
        return c1865u0;
    }

    private final void G(Throwable rootCause, List<? extends Throwable> exceptions) {
        if (exceptions.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(exceptions.size()));
        for (Throwable th : exceptions) {
            if (th != rootCause && th != rootCause && !(th instanceof CancellationException) && setNewSetFromMap.add(th)) {
                C4158c.a(rootCause, th);
            }
        }
    }

    private final C1860s H0(C2386q c2386q) {
        while (c2386q.r()) {
            c2386q = c2386q.n();
        }
        while (true) {
            c2386q = c2386q.m();
            if (!c2386q.r()) {
                if (c2386q instanceof C1860s) {
                    return (C1860s) c2386q;
                }
                if (c2386q instanceof H0) {
                    return null;
                }
            }
        }
    }

    private final void I0(H0 list, Throwable cause) throws Throwable {
        K0(cause);
        Object objL = list.l();
        C3862t.e(objL, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (C2386q c2386qM = (C2386q) objL; !C3862t.b(c2386qM, list); c2386qM = c2386qM.m()) {
            if (c2386qM instanceof AbstractC1869w0) {
                B0 b02 = (B0) c2386qM;
                try {
                    b02.b(cause);
                } catch (Throwable th) {
                    if (completionHandlerException != null) {
                        C4158c.a(completionHandlerException, th);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + b02 + " for " + this, th);
                        C4153F c4153f = C4153F.f46609a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            v0(completionHandlerException);
        }
        Z(cause);
    }

    private final void J0(H0 h02, Throwable th) throws Throwable {
        Object objL = h02.l();
        C3862t.e(objL, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (C2386q c2386qM = (C2386q) objL; !C3862t.b(c2386qM, h02); c2386qM = c2386qM.m()) {
            if (c2386qM instanceof B0) {
                B0 b02 = (B0) c2386qM;
                try {
                    b02.b(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        C4158c.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + b02 + " for " + this, th2);
                        C4153F c4153f = C4153F.f46609a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            v0(completionHandlerException);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [Xb.p0] */
    private final void N0(C1834e0 state) {
        H0 h02 = new H0();
        if (!state.getIsActive()) {
            h02 = new C1856p0(h02);
        }
        androidx.concurrent.futures.b.a(f18991B, this, state, h02);
    }

    private final Object O(InterfaceC4588d<Object> interfaceC4588d) {
        a aVar = new a(C4696b.c(interfaceC4588d), this);
        aVar.x();
        C1853o.a(aVar, A0.o(this, false, false, new M0(aVar), 3, null));
        Object objR = aVar.r();
        if (objR == C4696b.e()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC4588d);
        }
        return objR;
    }

    private final void O0(B0 state) {
        state.g(new H0());
        androidx.concurrent.futures.b.a(f18991B, this, state, state.m());
    }

    private final int R0(Object state) {
        if (state instanceof C1834e0) {
            if (((C1834e0) state).getIsActive()) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(f18991B, this, state, D0.f19019g)) {
                return -1;
            }
            M0();
            return 1;
        }
        if (!(state instanceof C1856p0)) {
            return 0;
        }
        if (!androidx.concurrent.futures.b.a(f18991B, this, state, ((C1856p0) state).getList())) {
            return -1;
        }
        M0();
        return 1;
    }

    private final String S0(Object state) {
        if (!(state instanceof c)) {
            return state instanceof InterfaceC1858q0 ? ((InterfaceC1858q0) state).getIsActive() ? "Active" : "New" : state instanceof C1874z ? "Cancelled" : "Completed";
        }
        c cVar = (c) state;
        return cVar.j() ? "Cancelling" : cVar.k() ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException U0(C0 c02, Throwable th, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return c02.T0(th, str);
    }

    private final boolean W0(InterfaceC1858q0 state, Object update) throws Throwable {
        if (!androidx.concurrent.futures.b.a(f18991B, this, state, D0.g(update))) {
            return false;
        }
        K0(null);
        L0(update);
        d0(state, update);
        return true;
    }

    private final boolean X0(InterfaceC1858q0 state, Throwable rootCause) throws Throwable {
        H0 h0P0 = p0(state);
        if (h0P0 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(f18991B, this, state, new c(h0P0, false, rootCause))) {
            return false;
        }
        I0(h0P0, rootCause);
        return true;
    }

    private final Object Y(Object cause) {
        Object objY0;
        do {
            Object objR0 = r0();
            if (!(objR0 instanceof InterfaceC1858q0) || ((objR0 instanceof c) && ((c) objR0).k())) {
                return D0.f19013a;
            }
            objY0 = Y0(objR0, new C1874z(g0(cause), false, 2, null));
        } while (objY0 == D0.f19015c);
        return objY0;
    }

    private final Object Y0(Object state, Object proposedUpdate) {
        return !(state instanceof InterfaceC1858q0) ? D0.f19013a : ((!(state instanceof C1834e0) && !(state instanceof B0)) || (state instanceof C1860s) || (proposedUpdate instanceof C1874z)) ? Z0((InterfaceC1858q0) state, proposedUpdate) : W0((InterfaceC1858q0) state, proposedUpdate) ? proposedUpdate : D0.f19015c;
    }

    private final boolean Z(Throwable cause) {
        if (z0()) {
            return true;
        }
        boolean z10 = cause instanceof CancellationException;
        r rVarQ0 = q0();
        return (rVarQ0 == null || rVarQ0 == J0.f19029B) ? z10 : rVarQ0.j(cause) || z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private final Object Z0(InterfaceC1858q0 state, Object proposedUpdate) throws Throwable {
        H0 h0P0 = p0(state);
        if (h0P0 == null) {
            return D0.f19015c;
        }
        c cVar = state instanceof c ? (c) state : null;
        if (cVar == null) {
            cVar = new c(h0P0, false, null);
        }
        kotlin.jvm.internal.O o10 = new kotlin.jvm.internal.O();
        synchronized (cVar) {
            if (cVar.k()) {
                return D0.f19013a;
            }
            cVar.n(true);
            if (cVar != state && !androidx.concurrent.futures.b.a(f18991B, this, state, cVar)) {
                return D0.f19015c;
            }
            boolean zJ = cVar.j();
            C1874z c1874z = proposedUpdate instanceof C1874z ? (C1874z) proposedUpdate : null;
            if (c1874z != null) {
                cVar.b(c1874z.cause);
            }
            ?? F10 = zJ ? 0 : cVar.f();
            o10.f43978B = F10;
            C4153F c4153f = C4153F.f46609a;
            if (F10 != 0) {
                I0(h0P0, F10);
            }
            C1860s c1860sI0 = i0(state);
            return (c1860sI0 == null || !a1(cVar, c1860sI0, proposedUpdate)) ? h0(cVar, proposedUpdate) : D0.f19014b;
        }
    }

    private final boolean a1(c state, C1860s child, Object proposedUpdate) {
        while (A0.o(child.childJob, false, false, new b(this, state, child, proposedUpdate), 1, null) == J0.f19029B) {
            child = H0(child);
            if (child == null) {
                return false;
            }
        }
        return true;
    }

    private final void d0(InterfaceC1858q0 state, Object update) throws Throwable {
        r rVarQ0 = q0();
        if (rVarQ0 != null) {
            rVarQ0.c();
            Q0(J0.f19029B);
        }
        C1874z c1874z = update instanceof C1874z ? (C1874z) update : null;
        Throwable th = c1874z != null ? c1874z.cause : null;
        if (!(state instanceof B0)) {
            H0 list = state.getList();
            if (list != null) {
                J0(list, th);
                return;
            }
            return;
        }
        try {
            ((B0) state).b(th);
        } catch (Throwable th2) {
            v0(new CompletionHandlerException("Exception in completion handler " + state + " for " + this, th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0(c state, C1860s lastChild, Object proposedUpdate) {
        C1860s c1860sH0 = H0(lastChild);
        if (c1860sH0 == null || !a1(state, c1860sH0, proposedUpdate)) {
            H(h0(state, proposedUpdate));
        }
    }

    private final Throwable g0(Object cause) {
        if (cause == null ? true : cause instanceof Throwable) {
            Throwable th = (Throwable) cause;
            return th == null ? new JobCancellationException(b0(), null, this) : th;
        }
        C3862t.e(cause, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((L0) cause).f0();
    }

    private final Object h0(c state, Object proposedUpdate) throws Throwable {
        boolean zJ;
        Throwable thL0;
        C1874z c1874z = proposedUpdate instanceof C1874z ? (C1874z) proposedUpdate : null;
        Throwable th = c1874z != null ? c1874z.cause : null;
        synchronized (state) {
            zJ = state.j();
            List<Throwable> listM = state.m(th);
            thL0 = l0(state, listM);
            if (thL0 != null) {
                G(thL0, listM);
            }
        }
        if (thL0 != null && thL0 != th) {
            proposedUpdate = new C1874z(thL0, false, 2, null);
        }
        if (thL0 != null && (Z(thL0) || u0(thL0))) {
            C3862t.e(proposedUpdate, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C1874z) proposedUpdate).c();
        }
        if (!zJ) {
            K0(thL0);
        }
        L0(proposedUpdate);
        androidx.concurrent.futures.b.a(f18991B, this, state, D0.g(proposedUpdate));
        d0(state, proposedUpdate);
        return proposedUpdate;
    }

    private final C1860s i0(InterfaceC1858q0 state) {
        C1860s c1860s = state instanceof C1860s ? (C1860s) state : null;
        if (c1860s != null) {
            return c1860s;
        }
        H0 list = state.getList();
        if (list != null) {
            return H0(list);
        }
        return null;
    }

    private final Throwable k0(Object obj) {
        C1874z c1874z = obj instanceof C1874z ? (C1874z) obj : null;
        if (c1874z != null) {
            return c1874z.cause;
        }
        return null;
    }

    private final Throwable l0(c state, List<? extends Throwable> exceptions) {
        Object next;
        Object obj = null;
        if (exceptions.isEmpty()) {
            if (state.j()) {
                return new JobCancellationException(b0(), null, this);
            }
            return null;
        }
        List<? extends Throwable> list = exceptions;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = exceptions.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private final H0 p0(InterfaceC1858q0 state) {
        H0 list = state.getList();
        if (list != null) {
            return list;
        }
        if (state instanceof C1834e0) {
            return new H0();
        }
        if (state instanceof B0) {
            O0((B0) state);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + state).toString());
    }

    public final boolean D0(Object proposedUpdate) {
        Object objY0;
        do {
            objY0 = Y0(r0(), proposedUpdate);
            if (objY0 == D0.f19013a) {
                return false;
            }
            if (objY0 == D0.f19014b) {
                return true;
            }
        } while (objY0 == D0.f19015c);
        H(objY0);
        return true;
    }

    public final Object E0(Object proposedUpdate) {
        Object objY0;
        do {
            objY0 = Y0(r0(), proposedUpdate);
            if (objY0 == D0.f19013a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + proposedUpdate, k0(proposedUpdate));
            }
        } while (objY0 == D0.f19015c);
        return objY0;
    }

    public String G0() {
        return M.a(this);
    }

    protected final Object I(InterfaceC4588d<Object> interfaceC4588d) throws Throwable {
        Object objR0;
        do {
            objR0 = r0();
            if (!(objR0 instanceof InterfaceC1858q0)) {
                if (objR0 instanceof C1874z) {
                    throw ((C1874z) objR0).cause;
                }
                return D0.h(objR0);
            }
        } while (R0(objR0) < 0);
        return O(interfaceC4588d);
    }

    @Override // ta.g
    public <R> R L(R r10, Ba.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) InterfaceC1867v0.a.b(this, r10, pVar);
    }

    @Override // ta.g
    public ta.g N(g.c<?> cVar) {
        return InterfaceC1867v0.a.d(this, cVar);
    }

    public final void P0(B0 node) {
        Object objR0;
        do {
            objR0 = r0();
            if (!(objR0 instanceof B0)) {
                if (!(objR0 instanceof InterfaceC1858q0) || ((InterfaceC1858q0) objR0).getList() == null) {
                    return;
                }
                node.s();
                return;
            }
            if (objR0 != node) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f18991B, this, objR0, D0.f19019g));
    }

    public final void Q0(r rVar) {
        f18992C.set(this, rVar);
    }

    protected final CancellationException T0(Throwable th, String str) {
        CancellationException jobCancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (jobCancellationException == null) {
            if (str == null) {
                str = b0();
            }
            jobCancellationException = new JobCancellationException(str, th, this);
        }
        return jobCancellationException;
    }

    public final boolean U(Throwable cause) {
        return V(cause);
    }

    public final boolean V(Object cause) throws Throwable {
        Object objC0 = D0.f19013a;
        if (n0() && (objC0 = Y(cause)) == D0.f19014b) {
            return true;
        }
        if (objC0 == D0.f19013a) {
            objC0 = C0(cause);
        }
        if (objC0 == D0.f19013a || objC0 == D0.f19014b) {
            return true;
        }
        if (objC0 == D0.f19016d) {
            return false;
        }
        H(objC0);
        return true;
    }

    public final String V0() {
        return G0() + '{' + S0(r0()) + '}';
    }

    public void W(Throwable cause) throws Throwable {
        V(cause);
    }

    @Override // Xb.InterfaceC1867v0
    public boolean a() {
        Object objR0 = r0();
        return (objR0 instanceof InterfaceC1858q0) && ((InterfaceC1858q0) objR0).getIsActive();
    }

    @Override // Xb.InterfaceC1867v0
    public final r a0(InterfaceC1862t child) {
        InterfaceC1828b0 interfaceC1828b0O = A0.o(this, true, false, new C1860s(child), 2, null);
        C3862t.e(interfaceC1828b0O, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (r) interfaceC1828b0O;
    }

    @Override // ta.g.b, ta.g
    public <E extends g.b> E b(g.c<E> cVar) {
        return (E) InterfaceC1867v0.a.c(this, cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String b0() {
        return "Job was cancelled";
    }

    public boolean c0(Throwable cause) {
        if (cause instanceof CancellationException) {
            return true;
        }
        return V(cause) && getHandlesException();
    }

    @Override // Xb.InterfaceC1867v0
    public void e(CancellationException cause) throws Throwable {
        if (cause == null) {
            cause = new JobCancellationException(b0(), null, this);
        }
        W(cause);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // Xb.L0
    public CancellationException f0() {
        CancellationException cancellationExceptionF;
        Object objR0 = r0();
        if (objR0 instanceof c) {
            cancellationExceptionF = ((c) objR0).f();
        } else if (objR0 instanceof C1874z) {
            cancellationExceptionF = ((C1874z) objR0).cause;
        } else {
            if (objR0 instanceof InterfaceC1858q0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objR0).toString());
            }
            cancellationExceptionF = null;
        }
        CancellationException cancellationException = cancellationExceptionF instanceof CancellationException ? cancellationExceptionF : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new JobCancellationException("Parent job is " + S0(objR0), cancellationExceptionF, this);
    }

    @Override // ta.g.b
    public final g.c<?> getKey() {
        return InterfaceC1867v0.INSTANCE;
    }

    @Override // Xb.InterfaceC1867v0
    public InterfaceC1867v0 getParent() {
        r rVarQ0 = q0();
        if (rVarQ0 != null) {
            return rVarQ0.getParent();
        }
        return null;
    }

    @Override // Xb.InterfaceC1867v0
    public final boolean isCancelled() {
        Object objR0 = r0();
        return (objR0 instanceof C1874z) || ((objR0 instanceof c) && ((c) objR0).j());
    }

    public final Object j0() throws Throwable {
        Object objR0 = r0();
        if (objR0 instanceof InterfaceC1858q0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objR0 instanceof C1874z) {
            throw ((C1874z) objR0).cause;
        }
        return D0.h(objR0);
    }

    /* renamed from: m0 */
    public boolean getHandlesException() {
        return true;
    }

    public boolean n0() {
        return false;
    }

    @Override // Xb.InterfaceC1867v0
    public final Object o(InterfaceC4588d<? super C4153F> interfaceC4588d) {
        if (A0()) {
            Object objB0 = B0(interfaceC4588d);
            return objB0 == C4696b.e() ? objB0 : C4153F.f46609a;
        }
        C1873y0.m(interfaceC4588d.getContext());
        return C4153F.f46609a;
    }

    @Override // Xb.InterfaceC1867v0
    public final InterfaceC1828b0 o0(boolean onCancelling, boolean invokeImmediately, Ba.l<? super Throwable, C4153F> handler) {
        return x0(onCancelling, invokeImmediately, new InterfaceC1861s0.a(handler));
    }

    @Override // Xb.InterfaceC1867v0
    public final Tb.h<InterfaceC1867v0> p() {
        return Tb.k.b(new e(null));
    }

    @Override // Xb.InterfaceC1867v0
    public final InterfaceC1828b0 q(Ba.l<? super Throwable, C4153F> handler) {
        return x0(false, true, new InterfaceC1861s0.a(handler));
    }

    public final r q0() {
        return (r) f18992C.get(this);
    }

    public final Object r0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18991B;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof AbstractC2394y)) {
                return obj;
            }
            ((AbstractC2394y) obj).a(this);
        }
    }

    @Override // ta.g
    public ta.g s(ta.g gVar) {
        return InterfaceC1867v0.a.e(this, gVar);
    }

    @Override // Xb.InterfaceC1867v0
    public final boolean start() {
        int iR0;
        do {
            iR0 = R0(r0());
            if (iR0 == 0) {
                return false;
            }
        } while (iR0 != 1);
        return true;
    }

    public String toString() {
        return V0() + '@' + M.b(this);
    }

    @Override // Xb.InterfaceC1867v0
    public final CancellationException u() {
        Object objR0 = r0();
        if (!(objR0 instanceof c)) {
            if (objR0 instanceof InterfaceC1858q0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objR0 instanceof C1874z) {
                return U0(this, ((C1874z) objR0).cause, null, 1, null);
            }
            return new JobCancellationException(M.a(this) + " has completed normally", null, this);
        }
        Throwable thF = ((c) objR0).f();
        if (thF != null) {
            CancellationException cancellationExceptionT0 = T0(thF, M.a(this) + " is cancelling");
            if (cancellationExceptionT0 != null) {
                return cancellationExceptionT0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    protected boolean u0(Throwable exception) {
        return false;
    }

    protected final void w0(InterfaceC1867v0 parent) {
        if (parent == null) {
            Q0(J0.f19029B);
            return;
        }
        parent.start();
        r rVarA0 = parent.a0(this);
        Q0(rVarA0);
        if (y0()) {
            rVarA0.c();
            Q0(J0.f19029B);
        }
    }

    @Override // Xb.InterfaceC1862t
    public final void x(L0 parentJob) throws Throwable {
        V(parentJob);
    }

    public final InterfaceC1828b0 x0(boolean onCancelling, boolean invokeImmediately, InterfaceC1861s0 handler) {
        B0 b0F0 = F0(handler, onCancelling);
        while (true) {
            Object objR0 = r0();
            if (objR0 instanceof C1834e0) {
                C1834e0 c1834e0 = (C1834e0) objR0;
                if (!c1834e0.getIsActive()) {
                    N0(c1834e0);
                } else if (androidx.concurrent.futures.b.a(f18991B, this, objR0, b0F0)) {
                    return b0F0;
                }
            } else {
                if (!(objR0 instanceof InterfaceC1858q0)) {
                    if (invokeImmediately) {
                        C1874z c1874z = objR0 instanceof C1874z ? (C1874z) objR0 : null;
                        handler.b(c1874z != null ? c1874z.cause : null);
                    }
                    return J0.f19029B;
                }
                H0 list = ((InterfaceC1858q0) objR0).getList();
                if (list == null) {
                    C3862t.e(objR0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    O0((B0) objR0);
                } else {
                    InterfaceC1828b0 interfaceC1828b0 = J0.f19029B;
                    if (onCancelling && (objR0 instanceof c)) {
                        synchronized (objR0) {
                            try {
                                thF = ((c) objR0).f();
                                if (thF == null || ((handler instanceof C1860s) && !((c) objR0).k())) {
                                    if (E(objR0, list, b0F0)) {
                                        if (thF == null) {
                                            return b0F0;
                                        }
                                        interfaceC1828b0 = b0F0;
                                    }
                                }
                                C4153F c4153f = C4153F.f46609a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (thF != null) {
                        if (invokeImmediately) {
                            handler.b(thF);
                        }
                        return interfaceC1828b0;
                    }
                    if (E(objR0, list, b0F0)) {
                        return b0F0;
                    }
                }
            }
        }
    }

    public final boolean y0() {
        return !(r0() instanceof InterfaceC1858q0);
    }

    protected boolean z0() {
        return false;
    }

    protected void M0() {
    }

    protected void H(Object state) {
    }

    protected void K0(Throwable cause) {
    }

    protected void L0(Object state) {
    }

    public void v0(Throwable exception) throws Throwable {
        throw exception;
    }
}
